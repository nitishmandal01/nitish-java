package ques1;
/*### Question-1

Create class with named SimpleInterest with three variables for principle amount, time period and interest rate of double data type.

Create two methods with following proto-type

```java
void setValues(double pa, double tp, double ir){
    //write code to assign value here
}
```

and

```java
double getInterestAmount(){
    //write code to computer and return the interest amount rounded to two decimal places
}
```

//Use following code to round up to two decimal places (Math.round(value * 100))/100.0
//Tip: Say the interest amount is 253.2659874 then ***(Math.round(253.2659874 * 100))/100.0*** so it should return 253.27

```java
class SimpleInterestTester{
    public static void main(String args[]){
        SimpleInterest siOne = new SimpleInterest();
        SimpleInterest siTwo = new SimpleInterest();
        siOne.setValues(1005, 2, 7.5);
        siTwo.setValues(1235.50, 2.5, 8.25);
    }
}
```

### Sample Output

Simple interest amount for siOne is 150.75
Simple interest amount for siTwo is 254.82
 * */

public class SimpleInterest {
	double principleAmount;
	double timePeriod;
	double interestRate;

	void setValues(double pa, double tp, double ir){
		principleAmount = pa;
		timePeriod = tp;
		interestRate = ir;
	}
	
	double getInterestAmount(){
	   double value = (principleAmount*timePeriod*interestRate)/100;
	    double amount = (Math.round(value * 100))/100.0;
		return amount;
	}
	
	public static void main(String args[]){
        SimpleInterest siOne = new SimpleInterest();
        SimpleInterest siTwo = new SimpleInterest();
        siOne.setValues(1005, 2, 7.5);
        siTwo.setValues(1235.50, 2.5, 8.25);
        double rate1 = siOne.getInterestAmount();
        System.out.println(rate1);
        
        double rate2 = siTwo.getInterestAmount();
        System.out.println(rate2);
    }
}





