import java.util.ArrayList;
public class StepTracker
{
 private int numActiveDays, goalSteps, numDays, totalSteps;
  public StepTracker(int goal){
  goalSteps = goal;
  numActiveDays = 0;
  numDays = 0;
  totalSteps = 0;
 }
 public void addDailySteps(int numSteps){
  numDays++;
  totalSteps = totalSteps + numSteps;
  if(numSteps >= goalSteps)
   numActiveDays++;
 }
 public int activeDays(){
  return numActiveDays;
 }
 public double averageSteps(){
  if(numDays == 0)
    return 0.0;
  double averageStep = totalSteps/numDays;
  return averageStep;
 }
} 
