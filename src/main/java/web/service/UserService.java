package web.service;

import web.models.User;
import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void add(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
}
