package org.fourthline.cling.support.lastchange;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InstanceID {

    /* JADX INFO: renamed from: id */
    protected UnsignedIntegerFourBytes f9557id;
    protected List<EventedValue> values;

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes, List<EventedValue> list) {
        new ArrayList();
        this.f9557id = unsignedIntegerFourBytes;
        this.values = list;
    }

    public UnsignedIntegerFourBytes getId() {
        return this.f9557id;
    }

    public List<EventedValue> getValues() {
        return this.values;
    }

    public InstanceID(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        this(unsignedIntegerFourBytes, new ArrayList());
    }
}
