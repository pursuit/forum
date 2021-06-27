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
@Table(name = "categories")
public class Category {

	@Id
	public Integer id;

	@JsonProperty("parent_id")
	public Integer parentId;

	public String name;
	public String description;

	@JsonProperty("created_at")
	public Instant createdAt;
}
