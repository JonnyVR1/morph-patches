package org.fourthline.cling.support.lastchange;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes3.dex */
public class InstanceID {

    /* JADX INFO: renamed from: id */
    protected UnsignedIntegerFourBytes f205932id;
    protected List<EventedValue> values;

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes, List<EventedValue> list) {
        new ArrayList();
        this.f205932id = unsignedIntegerFourBytes;
        this.values = list;
    }

    public UnsignedIntegerFourBytes getId() {
        return this.f205932id;
    }

    public List<EventedValue> getValues() {
        return this.values;
    }

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        this(unsignedIntegerFourBytes, new ArrayList());
    }
}
