package org.fourthline.cling.support.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EventedValueString extends EventedValue<String> {
    public EventedValueString(String str) {
        super(str);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return Datatype.Builtin.STRING.getDatatype();
    }

    public EventedValueString(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }
}
