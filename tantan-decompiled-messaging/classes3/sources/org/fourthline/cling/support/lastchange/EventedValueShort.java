package org.fourthline.cling.support.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EventedValueShort extends EventedValue<Short> {
    public EventedValueShort(Short sh) {
        super(sh);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return Datatype.Builtin.I2_SHORT.getDatatype();
    }

    public EventedValueShort(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }
}
