package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class BasicMarkerFactory implements IMarkerFactory {
    Map markerMap = new HashMap();

    @Override // org.slf4j.IMarkerFactory
    public boolean detachMarker(String str) {
        return (str == null || this.markerMap.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    public synchronized boolean exists(String str) {
        if (str == null) {
            return false;
        }
        return this.markerMap.containsKey(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public Marker getDetachedMarker(String str) {
        return new BasicMarker(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public synchronized Marker getMarker(String str) {
        Marker basicMarker;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Marker name cannot be null");
            }
            basicMarker = (Marker) this.markerMap.get(str);
            if (basicMarker == null) {
                basicMarker = new BasicMarker(str);
                this.markerMap.put(str, basicMarker);
            }
        } catch (Throwable th) {
            throw th;
        }
        return basicMarker;
    }
}
