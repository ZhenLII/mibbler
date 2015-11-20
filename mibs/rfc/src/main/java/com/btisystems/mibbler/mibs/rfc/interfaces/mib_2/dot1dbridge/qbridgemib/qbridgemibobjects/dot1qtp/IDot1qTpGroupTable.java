
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qtpgrouptable.IDot1qTpGroupEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qTpGroupTable
    extends IDeviceEntity
{


    Map<String, IDot1qTpGroupEntry> getDot1qTpGroupEntry();

    IDot1qTpGroupTable clone();

}
