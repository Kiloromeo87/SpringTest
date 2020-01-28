package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Model.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    @GetMapping
    public List<Album> getAllAlbum(){

    }



}
