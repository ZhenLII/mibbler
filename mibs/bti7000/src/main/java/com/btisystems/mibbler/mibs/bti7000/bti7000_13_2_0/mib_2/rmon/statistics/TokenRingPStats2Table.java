
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.rmon.statistics.tokenringpstats2table.TokenRingPStats2Entry;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.ITokenRingPStats2Table;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.rmon.statistics.tokenringpstats2table.ITokenRingPStats2Entry;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.ITableAccess;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;

public class TokenRingPStats2Table
    extends DeviceEntity
    implements Serializable, ITokenRingPStats2Table, ITableAccess<ITokenRingPStats2Entry>
{

    private Map<String, ITokenRingPStats2Entry> tokenRingPStats2Entry = new TreeMap<String, ITokenRingPStats2Entry>();
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public TokenRingPStats2Table() {
    }

    public Map<String, ITokenRingPStats2Entry> getTokenRingPStats2Entry() {
        return this.tokenRingPStats2Entry;
    }

    public ITokenRingPStats2Entry getEntry(String key) {
        return tokenRingPStats2Entry.get(key);
    }

    public void setEntry(String key, ITokenRingPStats2Entry value) {
        tokenRingPStats2Entry.put(key, value);
        ((TokenRingPStats2Entry) value)._setTable(this);
        addChild(value);
    }

    public Map<String, ITokenRingPStats2Entry> getEntries() {
        return tokenRingPStats2Entry;
    }

    public TokenRingPStats2Entry createEntry(String entryIndex) {
        TokenRingPStats2Entry newEntry = new TokenRingPStats2Entry();
        newEntry._setIndex(new OID(("1.3.6.1.2.1.16.1.6.1"+(".0."+ entryIndex))));
        setEntry(entryIndex, newEntry);
        return newEntry;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("tokenRingPStats2Entry", tokenRingPStats2Entry).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(tokenRingPStats2Entry).toHashCode();
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
        TokenRingPStats2Table rhs = ((TokenRingPStats2Table) obj);
        return new EqualsBuilder().append(tokenRingPStats2Entry, rhs.tokenRingPStats2Entry).isEquals();
    }

    public TokenRingPStats2Table clone() {
        TokenRingPStats2Table _copy = new TokenRingPStats2Table();
        for (Map.Entry<String, ITokenRingPStats2Entry> _entry: tokenRingPStats2Entry.entrySet()) {
            _copy.setEntry(_entry.getKey(), _entry.getValue().clone());
        }
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.16.1.6"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "tokenRingPStats2Entry", DeviceEntityDescription.FieldType.TABLE, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
