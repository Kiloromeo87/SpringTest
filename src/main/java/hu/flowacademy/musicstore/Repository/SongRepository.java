package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
