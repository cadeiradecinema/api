import org.springframework.data.annotation.Id;

public class User {

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    private String id;

    private String name;

}
