
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable.StmnProtGrpEntry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.IStmnProtGrpTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.btisystems.btiproducts.bti7000.objects.protection.stmnprotgrptable.IStmnProtGrpEntry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class StmnProtGrpTable
    extends DeviceEntity
    implements Serializable, IStmnProtGrpTable, ITableAccess<IStmnProtGrpEntry>
{

    private Map<String, IStmnProtGrpEntry> stmnProtGrpEntry = new TreeMap<String, IStmnProtGrpEntry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public StmnProtGrpTable() {
    }

    public Map<String, IStmnProtGrpEntry> getStmnProtGrpEntry() {
        return this.stmnProtGrpEntry;
    }

    public IStmnProtGrpEntry getEntry(String key) {
        return stmnProtGrpEntry.get(key);
    }

    public void setEntry(String key, IStmnProtGrpEntry value) {
        stmnProtGrpEntry.put(key, value);
        ((StmnProtGrpEntry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, IStmnProtGrpEntry> getEntries() {
        return stmnProtGrpEntry;
    }

    public StmnProtGrpEntry createEntry(String entryIndex) {
        StmnProtGrpEntry newEntry = new StmnProtGrpEntry();
        newEntry._setIndex(new OID(("1.3.6.1.4.1.18070.2.2.1.10.3.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("stmnProtGrpEntry", stmnProtGrpEntry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(stmnProtGrpEntry).toHashCode();
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
        StmnProtGrpTable rhs = ((StmnProtGrpTable) obj);
        return new EqualsBuilder().append(stmnProtGrpEntry, rhs.stmnProtGrpEntry).isEquals();
    }

    public StmnProtGrpTable clone() {
        StmnProtGrpTable _copy = new StmnProtGrpTable();
        for (Map.Entry<String, IStmnProtGrpEntry> _entry: stmnProtGrpEntry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.4.1.18070.2.2.1.10.3"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "stmnProtGrpEntry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
