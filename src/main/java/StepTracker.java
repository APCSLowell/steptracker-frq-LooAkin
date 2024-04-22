import java.util.ArrayList;
public class StepTracker
{
 private int numActiveDays;
 private int goalSteps;
 private ArrayList <Integer> dailySteps;
 public StepTracker(int goal){
 int goalSteps = goal;
 numActiveDays = 0;
 dailySteps = new ArrayList <Integer>();
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
  double averageStep = sumSteps/dailySteps.size();
  return averageStep;
 }
} 
