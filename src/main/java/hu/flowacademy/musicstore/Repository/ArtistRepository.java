package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
