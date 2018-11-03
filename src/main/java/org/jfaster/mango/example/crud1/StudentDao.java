package org.jfaster.mango.example.crud1;

import java.util.List;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.crud.CrudDao;

/**
 * @author ash
 */
@DB(table = "student")
public interface StudentDao extends CrudDao<Student, Long> {
	public List<Student> findByName(String name);
}
