package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//public class EmpRowMapper implements RowMapper<T> {
public class EmpRowMapper implements RowMapper {

	@Override
//	public T mapRow(ResultSet arg0, int arg1) throws SQLException {
	public Emp mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Long empno = rs.getLong("empno");
		String ename = rs.getString("ename");
		
		return new Emp(empno, ename);
	}

}
