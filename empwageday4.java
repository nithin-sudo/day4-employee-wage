package empwage;

public class empwageday4 {
	public static final int IS_FULL_PRESENT=1;
	public static final int IS_PART_PRESENT=2;
	public static void main(String[] args){
		System.out.println("welcome to Employee Wage Computation");
		int wage_per_hr=20;
		int full_day_work_hr=8;
		int part_day_work_hr=4; 
		int salary,working_days=20;
		int salary_per_month=0;
		int total_working_hrs=0;
		int i;
	  for (i=0;i<working_days;i++)
	  {
		  double random= Math.floor(Math.random()*10)%2;
			switch((int)random) {
			case IS_FULL_PRESENT:
				salary=(wage_per_hr*full_day_work_hr);
				salary_per_month=(salary_per_month+salary);
				total_working_hrs=(total_working_hrs+full_day_work_hr);
				break;
			case IS_PART_PRESENT:
				salary=(wage_per_hr*part_day_work_hr);
				salary_per_month=(salary_per_month+salary);
				total_working_hrs=(total_working_hrs+part_day_work_hr);
				break;
		  }
			if (total_working_hrs==100 || i==20)
				break;
		}
	System.out.println("salary per month " + salary_per_month );
}					
}



