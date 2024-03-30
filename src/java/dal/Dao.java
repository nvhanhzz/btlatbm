package dal;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(Integer id);

    List<T> getAll();
    
    List<T> getList();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);
}
