package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;


    public List<Song> getAllSong() {
        return songRepository.findAll();
    }

    public Song getSongById(long id) {
        return songRepository.findById(id).get();
    }

    public void createSong(Song song) {
        songRepository.save(song);
    }

    public void updateSong(Song song) {
        songRepository.save(song);
    }


    public void deleteSong(long id) {
        songRepository.deleteById(id);
    }
}
