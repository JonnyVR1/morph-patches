package org.fourthline.cling.support.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.shared.AbstractMap;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EventedValue<V> {
    protected final V value;

    public EventedValue(Map.Entry<String, String>[] entryArr) {
        try {
            this.value = valueOf(entryArr);
        } catch (InvalidValueException e) {
            aag0.m95543a(e);
            throw null;
        }
    }

    public Map.Entry<String, String>[] getAttributes() {
        return new Map.Entry[]{new AbstractMap.SimpleEntry("val", toString())};
    }

    public abstract Datatype getDatatype();

    public String getName() {
        return getClass().getSimpleName();
    }

    public V getValue() {
        return this.value;
    }

    public String toString() {
        return getDatatype().getString(getValue());
    }

    public V valueOf(Map.Entry<String, String>[] entryArr) throws InvalidValueException {
        V vValueOf = null;
        for (Map.Entry<String, String> entry : entryArr) {
            if (entry.getKey().equals("val")) {
                vValueOf = valueOf(entry.getValue());
            }
        }
        return vValueOf;
    }

    public EventedValue(V v2) {
        this.value = v2;
    }

    public V valueOf(String str) throws InvalidValueException {
        return (V) getDatatype().valueOf(str);
    }
}
