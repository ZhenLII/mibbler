
package com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice;

import java.util.Map;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.hrdevice.hrnetworktable.IHrNetworkEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IHrNetworkTable
    extends IDeviceEntity
{


    Map<String, IHrNetworkEntry> getHrNetworkEntry();

    IHrNetworkTable clone();

}
