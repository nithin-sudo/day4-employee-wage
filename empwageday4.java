package empwage;

public class empwageday4 {
	public static void main(String[] args){
		System.out.println("welcome to Employee Wage Computation");
		int is_full_present=1,wage_per_hr=20,full_day_work_hr=0;
		int salary;
		double random=Math.floor(Math.random()*10)%2;
		if (random==is_full_present) 
			full_day_work_hr=8;
		salary=(wage_per_hr*full_day_work_hr);
		System.out.println(salary);		
	}
}


