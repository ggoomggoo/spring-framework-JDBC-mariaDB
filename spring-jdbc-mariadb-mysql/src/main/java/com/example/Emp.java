package com.example;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(exclude={"sawon", "hobby"})
@NoArgsConstructor
@AllArgsConstructor
=======
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString(exclude={"sawon", "hobby"})
@NoArgsConstructor
>>>>>>> branch 'master' of https://github.com/t1t1/spring-framework-JDBC-mariaDB.git
public class Emp {
	
	private Long empno;
	
	private String ename;

/*	
	public Emp() {
//		super();
	}
	
	public Emp(Long empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public Long getEmpno() {
		return empno;
	}

	public void setEmpno(Long empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
*/
	
}
