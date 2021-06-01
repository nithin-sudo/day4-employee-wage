package empwage;

public class empwageday4 {
	public static final int IS_FULL_PRESENT=1;
	public static final int IS_PART_PRESENT=2;
	public static void main(String[] args){
		System.out.println("welcome to Employee Wage Computation");
		int wage_per_hr=20;
		int full_day_work_hr=8;
		int part_day_work_hr=4; 
		int salary;
		double random=Math.floor(Math.random()*10)%3;
		switch ((int)random) {
		case IS_FULL_PRESENT : 
			System.out.println("employee is present");
			salary=(wage_per_hr*full_day_work_hr);
			System.out.println("salary is:"+salary);
			break;
		case IS_PART_PRESENT:
			salary=(wage_per_hr*part_day_work_hr);
			System.out.println("salary is :"+salary);
			System.out.println("employee is part time present");
		    break;
		default:
			System.out.println("when employee is absent for the day his salary is zero");					
		}
	}
}


