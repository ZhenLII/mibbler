
package com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp;

import java.util.Map;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qforwardalltable.IDot1qForwardAllEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qForwardAllTable
    extends IDeviceEntity
{


    Map<String, IDot1qForwardAllEntry> getDot1qForwardAllEntry();

    IDot1qForwardAllTable clone();

}
