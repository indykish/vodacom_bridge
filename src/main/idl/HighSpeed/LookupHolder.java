package HighSpeed;

/**
* HighSpeed/LookupHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/

public final class LookupHolder implements org.omg.CORBA.portable.Streamable
{
  public HighSpeed.Lookup value = null;

  public LookupHolder ()
  {
  }

  public LookupHolder (HighSpeed.Lookup initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HighSpeed.LookupHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HighSpeed.LookupHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HighSpeed.LookupHelper.type ();
  }

}
