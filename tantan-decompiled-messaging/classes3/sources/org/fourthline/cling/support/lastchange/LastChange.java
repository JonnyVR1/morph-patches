package org.fourthline.cling.support.lastchange;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Iterator;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LastChange {
    private final Event event;
    private final LastChangeParser parser;
    private String previousValue;

    public LastChange(LastChangeParser lastChangeParser, String str) throws Exception {
        if (str == null || str.length() <= 0) {
            this.event = new Event();
        } else {
            this.event = lastChangeParser.parse(str);
        }
        this.parser = lastChangeParser;
    }

    public synchronized void fire(PropertyChangeSupport propertyChangeSupport) {
        String string = toString();
        if (string != null && string.length() > 0) {
            propertyChangeSupport.firePropertyChange("LastChange", this.previousValue, string);
            reset();
        }
    }

    public synchronized <EV extends EventedValue> EV getEventedValue(int i, Class<EV> cls) {
        return (EV) getEventedValue(new UnsignedIntegerFourBytes(i), cls);
    }

    public synchronized EventedValue[] getEventedValues(UnsignedIntegerFourBytes unsignedIntegerFourBytes) {
        InstanceID instanceID;
        instanceID = this.event.getInstanceID(unsignedIntegerFourBytes);
        return instanceID != null ? (EventedValue[]) instanceID.getValues().toArray(new EventedValue[instanceID.getValues().size()]) : null;
    }

    public synchronized UnsignedIntegerFourBytes[] getInstanceIDs() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<InstanceID> it = this.event.getInstanceIDs().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getId());
            }
        } catch (Throwable th) {
            throw th;
        }
        return (UnsignedIntegerFourBytes[]) arrayList.toArray(new UnsignedIntegerFourBytes[arrayList.size()]);
    }

    public synchronized void reset() {
        this.previousValue = toString();
        this.event.clear();
    }

    public synchronized void setEventedValue(UnsignedIntegerFourBytes unsignedIntegerFourBytes, EventedValue... eventedValueArr) {
        for (EventedValue eventedValue : eventedValueArr) {
            if (eventedValue != null) {
                this.event.setEventedValue(unsignedIntegerFourBytes, eventedValue);
            }
        }
    }

    public synchronized String toString() {
        if (!this.event.hasChanges()) {
            return "";
        }
        try {
            return this.parser.generate(this.event);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized <EV extends EventedValue> EV getEventedValue(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Class<EV> cls) {
        return (EV) this.event.getEventedValue(unsignedIntegerFourBytes, cls);
    }

    public synchronized void setEventedValue(int i, EventedValue... eventedValueArr) {
        setEventedValue(new UnsignedIntegerFourBytes(i), eventedValueArr);
    }

    public LastChange(LastChangeParser lastChangeParser, Event event) {
        this.parser = lastChangeParser;
        this.event = event;
    }

    public LastChange(LastChangeParser lastChangeParser) {
        this(lastChangeParser, new Event());
    }

    public LastChange(String str) {
        throw new UnsupportedOperationException("This constructor is only for service binding detection");
    }
}
