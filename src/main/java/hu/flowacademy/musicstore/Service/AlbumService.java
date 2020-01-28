package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exception.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public Album getAlbumById(long id) {
        return albumRepository.findById(id).get();
    }


    public void createAlbum(Album album) {
        if(album.getTitle().equals("") || album.getTitle() == null || album.getCount() <= 0){
            throw new ValidationException("Missing data");
        }
        albumRepository.save(album);
    }

    public void updateAlbum(Album album) {
        albumRepository.save(album);
    }

    public void deleteAlbum(long id) {
        albumRepository.deleteById(id);
    }
}
