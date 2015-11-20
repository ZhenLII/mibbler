
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.IUdp;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Udp
    extends DeviceEntity
    implements Serializable, IUdp, IVariableBindingSetter
{

    private int udpInDatagrams;
    private int udpNoPorts;
    private int udpInErrors;
    private int udpOutDatagrams;
    private long udpHCInDatagrams;
    private long udpHCOutDatagrams;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Udp() {
    }

    public int getUdpInDatagrams() {
        return this.udpInDatagrams;
    }

    public void setUdpInDatagrams(int udpInDatagrams) {
        int oldValue = getUdpInDatagrams();
        this.udpInDatagrams = udpInDatagrams;
        notifyChange(1, oldValue, udpInDatagrams);
    }

    public int getUdpNoPorts() {
        return this.udpNoPorts;
    }

    public void setUdpNoPorts(int udpNoPorts) {
        int oldValue = getUdpNoPorts();
        this.udpNoPorts = udpNoPorts;
        notifyChange(2, oldValue, udpNoPorts);
    }

    public int getUdpInErrors() {
        return this.udpInErrors;
    }

    public void setUdpInErrors(int udpInErrors) {
        int oldValue = getUdpInErrors();
        this.udpInErrors = udpInErrors;
        notifyChange(3, oldValue, udpInErrors);
    }

    public int getUdpOutDatagrams() {
        return this.udpOutDatagrams;
    }

    public void setUdpOutDatagrams(int udpOutDatagrams) {
        int oldValue = getUdpOutDatagrams();
        this.udpOutDatagrams = udpOutDatagrams;
        notifyChange(4, oldValue, udpOutDatagrams);
    }

    public long getUdpHCInDatagrams() {
        return this.udpHCInDatagrams;
    }

    public void setUdpHCInDatagrams(long udpHCInDatagrams) {
        long oldValue = getUdpHCInDatagrams();
        this.udpHCInDatagrams = udpHCInDatagrams;
        notifyChange(8, oldValue, udpHCInDatagrams);
    }

    public long getUdpHCOutDatagrams() {
        return this.udpHCOutDatagrams;
    }

    public void setUdpHCOutDatagrams(long udpHCOutDatagrams) {
        long oldValue = getUdpHCOutDatagrams();
        this.udpHCOutDatagrams = udpHCOutDatagrams;
        notifyChange(9, oldValue, udpHCOutDatagrams);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(7)) {
            case  1 :
                setUdpInDatagrams(binding.getVariable().toInt());
                break;
            case  2 :
                setUdpNoPorts(binding.getVariable().toInt());
                break;
            case  3 :
                setUdpInErrors(binding.getVariable().toInt());
                break;
            case  4 :
                setUdpOutDatagrams(binding.getVariable().toInt());
                break;
            case  8 :
                setUdpHCInDatagrams(binding.getVariable().toLong());
                break;
            case  9 :
                setUdpHCOutDatagrams(binding.getVariable().toLong());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("udpInDatagrams", udpInDatagrams).append("udpNoPorts", udpNoPorts).append("udpInErrors", udpInErrors).append("udpOutDatagrams", udpOutDatagrams).append("udpHCInDatagrams", udpHCInDatagrams).append("udpHCOutDatagrams", udpHCOutDatagrams).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(udpInDatagrams).append(udpNoPorts).append(udpInErrors).append(udpOutDatagrams).append(udpHCInDatagrams).append(udpHCOutDatagrams).toHashCode();
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
        Udp rhs = ((Udp) obj);
        return new EqualsBuilder().append(udpInDatagrams, rhs.udpInDatagrams).append(udpNoPorts, rhs.udpNoPorts).append(udpInErrors, rhs.udpInErrors).append(udpOutDatagrams, rhs.udpOutDatagrams).append(udpHCInDatagrams, rhs.udpHCInDatagrams).append(udpHCOutDatagrams, rhs.udpHCOutDatagrams).isEquals();
    }

    public Udp clone() {
        Udp _copy = new Udp();
        _copy.udpInDatagrams = udpInDatagrams;
        _copy.udpNoPorts = udpNoPorts;
        _copy.udpInErrors = udpInErrors;
        _copy.udpOutDatagrams = udpOutDatagrams;
        _copy.udpHCInDatagrams = udpHCInDatagrams;
        _copy.udpHCOutDatagrams = udpHCOutDatagrams;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.7"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "udpInDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "udpNoPorts", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(3, "udpInErrors", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(4, "udpOutDatagrams", DeviceEntityDescription.FieldType.INTEGER, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(8, "udpHCInDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(9, "udpHCOutDatagrams", DeviceEntityDescription.FieldType.UNSIGNED64, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
