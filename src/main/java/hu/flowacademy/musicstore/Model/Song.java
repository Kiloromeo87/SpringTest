package hu.flowacademy.musicstore.Model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private long length;

    @Column
    private String lyrics;

    @Column
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate year;

    @Column
    private String writerName;

    @Enumerated
    private Genre genre;

    @ManyToOne
    private Artist artist;

    @ManyToOne
    private Album album;



}
