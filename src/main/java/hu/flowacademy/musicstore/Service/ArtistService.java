package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Exception.ValidationException;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtist() {
        return artistRepository.findAll();
    }

    public Artist getArtistById(long id) {
        return artistRepository.findById(id).get();
    }


    public void createArtist(Artist artist) {
        if(artist.getFirstname().equals("") || artist.getLastname().equals("")
                || artist.getFirstname() == null || artist.getLastname() == null){
            throw new ValidationException("Missing Data");
        }

        artistRepository.save(artist);
    }

    public void updateArtist(Artist artist) {
        artistRepository.save(artist);
    }

    public void deleteArtist(long id) {
        artistRepository.deleteById(id);
    }
}
