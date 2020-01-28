package hu.flowacademy.musicstore.utils;

import hu.flowacademy.musicstore.Repository.AlbumRepository;
import hu.flowacademy.musicstore.Repository.ArtistRepository;
import hu.flowacademy.musicstore.Repository.SongRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Component
@Transactional
@AllArgsConstructor
public class initDataLoader {


    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;

    @PostConstruct
    public void init() {

    }




}
