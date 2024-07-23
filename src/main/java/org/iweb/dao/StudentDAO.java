package org.iweb.dao;



import org.iweb.pojo.Student;

import java.util.List;

/**
 * @author G
 * @date 2024/7/22 15:33
 */
public interface StudentDAO {

    /**
     * @param student
     */
    void insert(Student student);

    /**
     * @param id
     */
    void delete(Integer id);

    /**
     * @param student
     */
    void update(Student student);

    /**
     * @return
     */
    Integer count();

    /**
     * @param id
     * @return
     */
    Student findById(Integer id);

    /**
     * @return
     */
    List<Student> findAll();

    /**
     * @param name
     * @return
     */
    List<Student> findByNameLike(String name);

    /**
     * @param name
     * @param start
     * @param limit
     * @return
     */
    List<Student> findByNameLikeWithLimit(String name, int start, int limit);

    /**
     * @param start
     * @param limit
     * @return
     */
    List<Student> findWithLimit(int start, int limit);
}
