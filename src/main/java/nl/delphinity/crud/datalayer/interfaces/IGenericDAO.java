package nl.delphinity.crud.datalayer.interfaces;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

public interface IGenericDAO<T, ID extends Serializable> {

    Optional<T> findById(ID id);

    T save(T entity);

    Set<T> saveAll(Iterable<T> entities);

    void delete(T entity);

    Set<T> findAll();

}
