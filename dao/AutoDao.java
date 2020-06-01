package dao;

import java.util.List;

import entity.Auto;

public interface AutoDao {

	void add(Auto auto);

	void update(Auto auto);

	void delete(int id);

	Auto getById(int id);

	List<Auto> getByMark(String mark);

	List<Auto> getByModel(String model);

	List<Auto> getByColour(String colour);

	List<Auto> getIdentical(String mark, String model, String colour);

	List<Auto> getAll();

}
