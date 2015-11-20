
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.ip.ipaddrtable;

import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IIpAddrEntry
    extends IDeviceEntity
{


    void setIpAdEntAddr(String ipAdEntAddr);

    String getIpAdEntAddr();

    void setIpAdEntIfIndex(int ipAdEntIfIndex);

    int getIpAdEntIfIndex();

    void setIpAdEntNetMask(String ipAdEntNetMask);

    String getIpAdEntNetMask();

    void setIpAdEntBcastAddr(int ipAdEntBcastAddr);

    int getIpAdEntBcastAddr();

    void setIpAdEntReasmMaxSize(int ipAdEntReasmMaxSize);

    int getIpAdEntReasmMaxSize();

    IIpAddrEntry clone();

}
