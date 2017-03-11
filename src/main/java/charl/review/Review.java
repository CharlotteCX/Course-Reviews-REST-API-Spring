package charl.review;

import javax.persistence.Entity;
import charl.core.BaseEntity;

/**
 * Created by chenxi on 2017-03-10.
 */

@Entity
public class Review extends BaseEntity {

  // TODO:csd - We are duplicating code here for every single entity.
  protected Review() {
    super();
  }

  private int rating;
  private String description;

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
