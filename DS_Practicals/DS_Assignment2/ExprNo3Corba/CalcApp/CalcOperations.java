package CalcApp;


/**
* CalcApp/CalcOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* Monday, 26 February, 2024 9:36:49 AM IST
*/

public interface CalcOperations 
{
  float sum (float a, float b);
  float div (float a, float b) throws CalcApp.CalcPackage.DivisionByZero;
  float mul (float a, float b);
  float sub (float a, float b);
} // interface CalcOperations
