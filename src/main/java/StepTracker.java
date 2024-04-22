import java.util.ArrayList;
public class StepTracker
{
 private int numActiveDays, goalSteps, numDays;
 public StepTracker(int goal){
 goalSteps = goal;
 numActiveDays = 0;
 numDays = 0;
 }
 public void addDailySteps(int numSteps){
  numDays++;
  if(numSteps >= goalSteps)
   numActiveDays++;
 }
 public int activeDays(){
  return numActiveDays;
 }
 public double averageSteps(){
  if(numActiveDays == 0)
    return 0.0;
  double averageStep = numActiveDays/numDays;
  return averageStep;
 }
} 
