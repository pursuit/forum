package pursuit.forum.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    public Integer id;
    public Integer parentId;
    public String name;
    public String description;

    public Category() {
    }

    public Category(Integer id, Integer parentId, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
