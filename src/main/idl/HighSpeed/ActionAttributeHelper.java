package HighSpeed;


/**
* HighSpeed/ActionAttributeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/

abstract public class ActionAttributeHelper
{
  private static String  _id = "IDL:HighSpeed/ActionAttribute:1.0";

  public static void insert (org.omg.CORBA.Any a, HighSpeed.ActionAttribute that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HighSpeed.ActionAttribute extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "satId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "currentSacId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "newSacId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "dateFrom",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "dateTo",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (HighSpeed.ActionAttributeHelper.id (), "ActionAttribute", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HighSpeed.ActionAttribute read (org.omg.CORBA.portable.InputStream istream)
  {
    HighSpeed.ActionAttribute value = new HighSpeed.ActionAttribute ();
    value.satId = istream.read_string ();
    value.currentSacId = istream.read_string ();
    value.newSacId = istream.read_string ();
    value.dateFrom = istream.read_string ();
    value.dateTo = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HighSpeed.ActionAttribute value)
  {
    ostream.write_string (value.satId);
    ostream.write_string (value.currentSacId);
    ostream.write_string (value.newSacId);
    ostream.write_string (value.dateFrom);
    ostream.write_string (value.dateTo);
  }

}
