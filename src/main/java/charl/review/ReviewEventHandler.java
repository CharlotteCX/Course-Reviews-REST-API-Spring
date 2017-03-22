package charl.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import charl.user.User;
import charl.user.UserRepository;

/**
 * Created by chenxi on 2017-03-13.
 */
@Component
@RepositoryEventHandler(Review.class)
public class ReviewEventHandler {
  private final UserRepository users;

  @Autowired
  public ReviewEventHandler(UserRepository users) {
    this.users = users;
  }

  @HandleBeforeCreate
  public void addReviewerBasedOnLongedInUser(Review review) {
    String username = SecurityContextHolder.getContext().getAuthentication().getName();
    User user = users.findByUsername(username);
    review.setReviewer(user);
  }
}
