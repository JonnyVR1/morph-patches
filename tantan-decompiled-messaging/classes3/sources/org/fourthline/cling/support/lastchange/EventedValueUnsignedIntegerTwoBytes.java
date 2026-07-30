package org.fourthline.cling.support.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.UnsignedIntegerTwoBytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EventedValueUnsignedIntegerTwoBytes extends EventedValue<UnsignedIntegerTwoBytes> {
    public EventedValueUnsignedIntegerTwoBytes(UnsignedIntegerTwoBytes unsignedIntegerTwoBytes) {
        super(unsignedIntegerTwoBytes);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return Datatype.Builtin.UI2.getDatatype();
    }

    public EventedValueUnsignedIntegerTwoBytes(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }
}
