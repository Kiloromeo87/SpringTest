package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;


    @GetMapping
    public List<Artist> getAllArtist(){
        return artistService.getAllArtist();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable long id){
        return artistService.getArtistById(id);
    }

    @PostMapping
    public ResponseEntity<Void> createArtist(@RequestBody Artist artist){
        artistService.createArtist(artist);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public void updateArtist(@RequestBody Artist artist){
        artistService.updateArtist(artist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable long id){
        artistService.deleteArtist(id);
    }




}
