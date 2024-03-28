package web.DAO;

import web.models.User;
import java.util.List;

public interface UserDao {
    public List<User> getAll();
    public void add(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
}
