package charl.review;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import charl.core.BaseEntity;
import charl.course.Course;
import charl.user.User;

/**
 * Created by chenxi on 2017-03-10.
 */

@Entity
public class Review extends BaseEntity {
  private int rating;
  private String description;

  @ManyToOne
  private Course course;
  @ManyToOne
  private User reviewer;

  // TODO:csd - We are duplicating code here for every single entity.
  protected Review() {
    super();
  }

  public Review(int rating, String description) {
    this.rating = rating;
    this.description = description;
  }

  public User getReviewer() {
    return reviewer;
  }

  public void setReviewer(User reviewer) {
    this.reviewer = reviewer;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

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
