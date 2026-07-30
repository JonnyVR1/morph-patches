package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMarkerBinder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarkerFactory {
    static IMarkerFactory markerFactory;

    static {
        try {
            markerFactory = StaticMarkerBinder.SINGLETON.getMarkerFactory();
        } catch (Exception e) {
            Util.report("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            markerFactory = new BasicMarkerFactory();
        }
    }

    private MarkerFactory() {
    }

    public static Marker getDetachedMarker(String str) {
        return markerFactory.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return markerFactory;
    }

    public static Marker getMarker(String str) {
        return markerFactory.getMarker(str);
    }
}
