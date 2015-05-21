package user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import user.User;

@RestController
public class UserController   {

    @RequestMapping(value="/users/{id}", method=RequestMethod.POST)
    public ResponseEntity getUserID(@PathVariable(value="id") String id,  @RequestParam String name) {
        User user = new User(id,name);
        return new ResponseEntity("BLABLABLABLA", HttpStatus.CREATED);
    }
}
