package empwage;

public class empwageday4 {
	public static final int IS_FULL_PRESENT=1;
	public static final int IS_PART_PRESENT=2;
	public static void main(String[] args){
		System.out.println("welcome to Employee Wage Computation");
		int wage_per_hr=20,full_day_work_hr=8,part_day_work_hr=4; 
		int salary;
		int working_days=20;
		int salary_per_month=0;
		for (int i=1;i<working_days;i++)
		{
			double random= Math.floor(Math.random()*10)%2;
			if (IS_FULL_PRESENT==random)
			{
				salary=(wage_per_hr*full_day_work_hr);
				salary_per_month=(salary_per_month+salary);
			}
			else if (IS_PART_PRESENT==random)
			{
				salary=(wage_per_hr*part_day_work_hr);
				salary_per_month=(salary_per_month+salary);
			}
		}
		System.out.println("salary per month is"+salary_per_month);
	}					
}



