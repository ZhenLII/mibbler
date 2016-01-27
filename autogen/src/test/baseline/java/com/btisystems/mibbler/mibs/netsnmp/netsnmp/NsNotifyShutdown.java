
package com.btisystems.mibbler.mibs.netsnmp.netsnmp;

import java.io.Serializable;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.INotification;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class NsNotifyShutdown
    extends DeviceEntity
    implements Serializable, INotification
{

    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public NsNotifyShutdown() {
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        NsNotifyShutdown rhs = ((NsNotifyShutdown) obj);
        return new EqualsBuilder().isEquals();
    }

    public NsNotifyShutdown clone() {
        NsNotifyShutdown _copy = new NsNotifyShutdown();
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.8072.4.0.2"));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
