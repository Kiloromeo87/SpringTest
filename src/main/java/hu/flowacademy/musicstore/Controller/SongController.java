package hu.flowacademy.musicstore.Controller;


import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;


    @GetMapping
    public List<Song> getAllSong(){
        return songService.getAllSong();
    }

    @GetMapping("/{id}")
    public Song getSong(@PathVariable long id){
        return songService.getSongById(id);
    }

    @PostMapping
    public void createSong(@RequestBody Song song){
        songService.createSong(song);
    }

    @PutMapping
    public void updateSong(@RequestBody Song song){
        songService.updateSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable long id){
        songService.deleteSong(id);
    }





}
