package io.inflix.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.inflix.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsData")
public class RatingResource {
	@RequestMapping("/users/{userId}")
	public  Rating getUserRating(@PathVariable("userId") String userId) {
		/*List<Rating> ratingsList = new ArrayList<Rating>();
		ratingsList.add(new Rating("1234", 4));
		ratingsList.add(new Rating("5678", 3));
		return ratingsList;*/
		return new Rating("1234",4);
	}
	@RequestMapping("/{movieId}")
	public Rating getRatting(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	

}
