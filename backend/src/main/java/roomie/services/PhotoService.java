package roomie.services;

import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import roomie.exception.ResourceNotFoundException;
import roomie.helpers.FileUtils;
import roomie.models.photo.Photo;
import roomie.models.photo.PhotoDAO;

import java.io.IOException;


/**
 * @author: João Abreu
 * @created: 17/04/2021 - 16:05
 */

@Service
public class PhotoService {
	@Autowired
	public FileUtils fileUtils;
	
	public Photo store(MultipartFile file) {
		String path;
		if (file == null) {
			path = fileUtils.save("house-default.jpg");
		} else {
			path = fileUtils.save(file);
		}
		Photo photo = PhotoDAO.createPhoto();
		photo.setPath(path);
		return photo;
	}
	
	public boolean save(Photo photo) throws PersistentException {
		return PhotoDAO.save(photo);
	}
	
	public byte[] load(Photo photo) throws IOException {
		return fileUtils.load(photo.getPath());
	}
	
	public boolean delete(Photo photo) throws PersistentException {
		return fileUtils.delete(photo.getPath());
	}
	
	public Photo getById(int id) throws PersistentException, ResourceNotFoundException {
		Photo photo = PhotoDAO.getPhotoByORMID(id);
		if (photo == null) {
			throw new ResourceNotFoundException("Photo not found: id=" + id);
		}
		return photo;
	}
}
