import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Ant {
 private static Ant istance;
 private double best;
 private double result;


 public void setBest(double best) {
  this.best = best;
 }

 public void setResult(double result) {
  this.result = result;
 }
 public double getBest() {
  return this.best;
 }

 public double getResult() {
  return this.result;
 }


}
