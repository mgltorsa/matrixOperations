/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ClientInterfaceClassGenerator
 * on: Mon Jun 03 20:26:22 COT 2019
 */

package co.edu.icesi.interfaces;


public class ISerializerFcOutItf
extends co.edu.icesi.interfaces.ISerializerFcInItf
implements co.edu.icesi.interfaces.ISerializer,org.ow2.frascati.tinfi.TinfiComponentOutInterface<co.edu.icesi.interfaces.ISerializer> {

  public ISerializerFcOutItf()  {
  }

  public ISerializerFcOutItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public org.oasisopen.sca.ServiceReference<co.edu.icesi.interfaces.ISerializer> getServiceReference()  {
    return new co.edu.icesi.interfaces.ISerializerFcSR(co.edu.icesi.interfaces.ISerializer.class,this);
  }

}