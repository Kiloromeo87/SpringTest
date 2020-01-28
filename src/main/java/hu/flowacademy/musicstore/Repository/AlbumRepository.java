package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
