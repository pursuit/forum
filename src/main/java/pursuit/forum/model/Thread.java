package pursuit.forum.model;

import java.util.Objects;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "threads")
public class Thread {

	@Id
	public Integer id;

	@JsonProperty("category_id")
	public Integer categoryId;

	public String title;

	@JsonProperty("created_at")
	public Instant createdAt;
}
