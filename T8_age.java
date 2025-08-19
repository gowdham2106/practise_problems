package assesment;

import java.time.LocalDate;
import java.time.Period;

public class T8_age {
public static void main(String[] args) {
	LocalDate dob=LocalDate.of(2004, 06, 21);
	LocalDate c=LocalDate.now();
	Period d=Period.between(dob,c);
	System.out.println(d.getYears());
	System.out.println(d.getMonths());
	System.out.println(d.getDays());
}
}
