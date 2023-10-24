package dev.mei.movies;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;



@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
        @Id
        private ObjectId id;
        private String imdbId;
        private String title;
        private String releaseDate;
        private String trailerLink;
        private String poster;
        private String trail;
        private List<String> genres;
        private List<String> backdrops;
        @DocumentReference
        private List<Review> reviewIds;

}
