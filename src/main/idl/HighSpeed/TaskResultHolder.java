package HighSpeed;

/**
* HighSpeed/TaskResultHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/


// Task result
public final class TaskResultHolder implements org.omg.CORBA.portable.Streamable
{
  public HighSpeed.TaskResult value = null;

  public TaskResultHolder ()
  {
  }

  public TaskResultHolder (HighSpeed.TaskResult initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HighSpeed.TaskResultHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HighSpeed.TaskResultHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HighSpeed.TaskResultHelper.type ();
  }

}
