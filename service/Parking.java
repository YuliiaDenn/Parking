package service;

import java.util.List;

import dao.AutoDao;
import dao.AutoDaoImp;
import entity.Auto;

public class Parking {

	AutoDao autoDaoImpl = new AutoDaoImp();

	public void carParking(Auto auto) {
		autoDaoImpl.add(auto);
	}

	public void carLeaving(int id) {
		autoDaoImpl.delete(id);
	}

	public List<Auto> ammountCars() {
		return autoDaoImpl.getAll();
	}

	public List<Auto> ammountCarsByMark(String mark) {
		return autoDaoImpl.getByMark(mark);
	}

	public List<Auto> ammountCarsByModel(String model) {
		return autoDaoImpl.getByModel(model);
	}

	public List<Auto> ammountCarsByColour(String colour) {
		return autoDaoImpl.getByColour(colour);
	}
}
