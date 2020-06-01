package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Auto;

public class AutoDaoImp extends Dao implements AutoDao {

	public void add(Auto auto) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "INSERT auto (mark, model, colour) VALUES ('" + auto.getMark() + "', '" + auto.getModel() + "', '"
				+ auto.getColour() + "')";
		try {
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void update(Auto auto) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "UPDATE auto SET mark = '" + auto.getMark() + "', model = '" + auto.getModel() + "', '"
				+ auto.getColour() + "' WHERE '" + auto.getId() + "'";
		try {
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void delete(int id) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "DELETE FROM auto WHERE id = '" + id + "'";
		try {
			stat = conn.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Auto getById(int id) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto WHERE id = '" + id + "'";
		Auto auto = new Auto();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			rs.next();
			auto.setId(rs.getInt(1));
			auto.setMark(rs.getString(2));
			auto.setModel(rs.getString(3));
			auto.setColour(rs.getString(4));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return auto;
	}

	public List<Auto> getAll() {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto";
		Auto auto = null;
		List<Auto> allAuto = new ArrayList<Auto>();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				auto = new Auto();
				auto.setId(rs.getInt(1));
				auto.setMark(rs.getString(2));
				auto.setModel(rs.getString(3));
				auto.setColour(rs.getString(4));
				allAuto.add(auto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return allAuto;
	}

	public List<Auto> getByMark(String mark) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto WHERE mark = '" + mark + "'";
		Auto auto = null;
		List<Auto> identicalByMark = new ArrayList<Auto>();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				auto = new Auto();
				auto.setId(rs.getInt(1));
				auto.setMark(rs.getString(2));
				auto.setModel(rs.getString(3));
				auto.setColour(rs.getString(4));
				identicalByMark.add(auto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return identicalByMark;
	}

	public List<Auto> getByModel(String model) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto WHERE model = '" + model + "'";
		Auto auto = null;
		List<Auto> identicalByModel = new ArrayList<Auto>();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				auto = new Auto();
				auto.setId(rs.getInt(1));
				auto.setMark(rs.getString(2));
				auto.setModel(rs.getString(3));
				auto.setColour(rs.getString(4));
				identicalByModel.add(auto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return identicalByModel;
	}

	public List<Auto> getByColour(String colour) {
		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto WHERE colour = '" + colour + "'";
		Auto auto = null;
		List<Auto> identicalByColour = new ArrayList<Auto>();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				auto = new Auto();
				auto.setId(rs.getInt(1));
				auto.setMark(rs.getString(2));
				auto.setModel(rs.getString(3));
				auto.setColour(rs.getString(4));
				identicalByColour.add(auto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return identicalByColour;
	}

	public List<Auto> getIdentical(String mark, String model, String colour) {

		Connection conn = getConnection();
		Statement stat = null;
		String sql = "SELECT * FROM auto WHERE mark = '" + mark + "' AND model = '" + model + "' AND colour = '"
				+ colour + "'";
		Auto auto = null;
		List<Auto> identical = new ArrayList<Auto>();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				auto = new Auto();
				auto.setId(rs.getInt(1));
				auto.setMark(rs.getString(2));
				auto.setModel(rs.getString(3));
				auto.setColour(rs.getString(4));
				identical.add(auto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return identical;
	}

}
