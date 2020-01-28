package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/{id}")
    public Album getAlbum(@PathVariable long id){
        return albumService.getAlbumById(id);
    }

    @PostMapping
    public ResponseEntity<Void> createAlbum(@RequestBody Album album){
        albumService.createAlbum(album);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> updateAlbum(@RequestBody Album album){

        albumService.updateAlbum(album);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void deleteAlbum(@PathVariable long id){
        albumService.deleteAlbum(id);
    }







}
