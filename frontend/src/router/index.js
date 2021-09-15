import Vue from 'vue'
import Router from 'vue-router'
import store from '@/store'

const ifNotAuthenticated = (to, from, next) => {
  if (!store.getters.isAuthenticated) {
    next()
    return
  } else {
    next('/')
  }
}

const ifAuthenticated = (to, from, next) => {
  if (store.getters.isAuthenticated) {
    next()
    return
  } else {
    next('/login')
  }
}

const redirectAuthenticated = (to, from, next) => {
  if (store.getters.isAuthenticated) {
    if (store.getters.isLandlord) {
      next('/landlord')
    } else if (store.getters.isTenant) {
      next('/tenant')
    }
    return
  } else {
    next()
  }
}

const ifAuthenticatedLandlord = (to, from, next) => {
  if (store.getters.isAuthenticated) {
    if (store.getters.isLandlord) {
      next()
      return
    } else {
      next('/tenant')
    }
  } else {
    next('/login')
  }
}

const ifAuthenticatedTenant = (to, from, next) => {
  if (store.getters.isAuthenticated) {
    if (store.getters.isTenant) {
      next()
      return
    } else {
      next('/landlord')
    }
  } else {
    next('/login')
  }
}

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      component: () => import('@/views/Home'),
      children: [
        {
          path: '',
          name: 'Home',
          component: () => import('@/views/Home')
        }
      ],
      beforeEnter: redirectAuthenticated
    },
    {
      name: 'Login',
      path: '/login',
      component: () => import('@/views/Login'),
      beforeEnter: ifNotAuthenticated
    },
    {
      name: 'Register',
      path: '/register',
      component: () => import('@/views/Register')
    },
    {
      name: 'Landlord',
      path: '/landlord',
      component: () => import('@/views/LoggedLandlord'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Profile',
      path: '/landlord/profile',
      component: () => import('@/views/LandlordProfile'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Profile Check',
      path: '/landlord/llprofile/:id',
      component: () => import('@/views/LandlordProfileCheck'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Tenant Profile',
      path: '/landlord/tprofile/:id',
      component: () => import('@/views/TenantProfileCheck'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Rate Tenant',
      path: '/landlord/rate/:id/:id2',
      component: () => import('@/views/RatingTenant'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Landlord Add House',
      path: '/landlord/house/add',
      component: () => import('@/views/AddHouse'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Update House',
      path: '/landlord/house/:id/update',
      component: () => import('@/views/UpdateHouse'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Houses',
      path: '/landlord/houses',
      component: () => import('@/views/LandlordHouses'),
      beforeEnter: ifAuthenticatedLandlord
      
    },
    {
      name: 'Landlord Applications',
      path: '/landlord/applications',
      component: () => import('@/views/CheckApplications'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'Landlord Check House',
      path: '/landlord/house/:id',
      component: ()=>import('@/views/LandlordCheckHouse'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'LandlordSarch',
      path: '/landlord/search',
      component: () => import('@/views/LandlordSearch'),
      beforeEnter: ifAuthenticatedLandlord
    },
    {
      name: 'LoggedTenant',
      path: '/tenant',
      component: () => import('@/views/LoggedTenant'),
      beforeEnter: ifAuthenticatedTenant
    },
    {
      name: 'Tenant Profile',
      path: '/tenant/profile',
      component: () => import('@/views/TenantProfile'),
      beforeEnter: ifAuthenticatedTenant
    },
    {
      name: 'Tenant Landlord Profile',
      path: '/tenant/llprofile/:id',
      component: () => import('@/views/LandlordProfileCheck'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Tenant Tenant Profile',
      path: '/tenant/tprofile/:id',
      component: () => import('@/views/TenantProfileCheck'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Tenant Rate Tenant',
      path: '/tenant/rate/:id/:id2',
      component: () => import('@/views/RatingTenant'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Tenant Rent History',
      path: '/tenant/rhistory',
      component: () => import('@/views/RentHistory'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Tenant Application',
      path: '/tenant/applications',
      component: () => import('@/views/ApplicationsTenant'),
      beforeEnter: ifAuthenticated
    },
    {
      name: 'Tenant Check House',
      path: '/tenant/house/:id',
      component: () => import('@/views/TenantCheckHouse'),
      beforeEnter: ifAuthenticated
    },
    {
      path: '/404',
      component: () => import('@/views/NotFound')
    },
    {
      path: '*',
      redirect: '/404'
    }
  ]
})
