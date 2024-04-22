import java.util.ArrayList;
public class StepTracker
{
 public void stepTracker(int goal){
 private int goalSteps = goal;
 private int numActiveDays = 0;
 private ArrayList <Integer> dailySteps = new ArrayList <Integer>();
 }
 public void addDailySteps(int numSteps){
  if(numSteps >= goalSteps)
   numActiveDays++;
   dailySteps.add(numSteps);
 }

 public int activeDays(){
  return numActiveDays;
 }

 public double averageSteps(){
  double sumSteps = 0;
  for(int i = 0; i < dailySteps.size(); i++)
   sumSteps = sumSteps + dailySteps.get(i);
  double average = sumSteps/dailySteps.size();
  return average;
 }
} 
