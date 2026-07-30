package org.fourthline.cling.support.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes3.dex */
public class EventedValueUnsignedIntegerFourBytes extends EventedValue<UnsignedIntegerFourBytes> {
    public EventedValueUnsignedIntegerFourBytes(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        super(unsignedIntegerFourBytes);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return Datatype.Builtin.UI4.getDatatype();
    }

    public EventedValueUnsignedIntegerFourBytes(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }
}
