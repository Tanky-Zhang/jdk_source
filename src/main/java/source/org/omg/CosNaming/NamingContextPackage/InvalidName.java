package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/InvalidName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /jenkins/workspace/8-2-build-macosx-x86_64/jdk8u281/880/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, December 9, 2020 12:45:07 PM GMT
*/

public final class InvalidName extends org.omg.CORBA.UserException
{

  public InvalidName ()
  {
    super(InvalidNameHelper.id());
  } // ctor


  public InvalidName (String $reason)
  {
    super(InvalidNameHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidName
