package hu.flowacademy.musicstore.Service;

import hu.flowacademy.musicstore.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;


}
