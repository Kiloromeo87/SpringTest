package hu.flowacademy.musicstore;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Repository.AlbumRepository;
import hu.flowacademy.musicstore.Service.AlbumService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.when;

public class AlbumServiceTest {

    @InjectMocks
    AlbumService albumService;

    @Mock
    AlbumRepository albumRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAll() {
        when(albumRepository.findAll()).thenReturn(List.of(new Album()));
        List<Album> album = albumService.getAllAlbum();
        Assertions.assertEquals(1, album.size());
    }

    @Test
    public void delete() {
        albumService.deleteAlbum(new Random().nextLong());
    }




}
