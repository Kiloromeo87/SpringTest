package hu.flowacademy.musicstore.Model.DTO;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Repository.AlbumRepository;
import hu.flowacademy.musicstore.Service.AlbumService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
public class AlbumDTO {

    @Autowired
    AlbumService albumService;


    private long id;
    private String title;


    public AlbumDTO(long id) {
        this.id = id;
    }
}
