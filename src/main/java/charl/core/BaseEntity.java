package charl.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by chenxi on 2017-03-10.
 */
@MappedSuperclass
public abstract class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final Long id;

  protected BaseEntity() {
    id = null;
  }
}
