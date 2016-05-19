package com.example;

import java.util.List;

public interface EmpRepository {
	List<Emp> finAll();
	Emp findOne(Long empno);
	Emp save(Emp emp);
	void delete(Long empno);
}
