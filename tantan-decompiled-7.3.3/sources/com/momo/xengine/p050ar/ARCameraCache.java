package com.momo.xengine.p050ar;

import com.momo.xeengine.IXEngine;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ARCameraCache {
    private static final Map<IXEngine, IXARCamera> cameraMap = new HashMap();

    public static IXARCamera getARCamera(IXEngine iXEngine) {
        IXARCamera aRCameraImpl;
        Map<IXEngine, IXARCamera> map = cameraMap;
        synchronized (map) {
            aRCameraImpl = map.get(iXEngine);
            if (aRCameraImpl == null) {
                try {
                    aRCameraImpl = new ARCameraImpl(iXEngine);
                } catch (RuntimeException unused) {
                    return null;
                }
            }
            map.put(iXEngine, aRCameraImpl);
        }
        return aRCameraImpl;
    }

    public static void removeARCamera(IXARCamera iXARCamera) {
        IXEngine next;
        Map<IXEngine, IXARCamera> map = cameraMap;
        synchronized (map) {
            try {
                Iterator<IXEngine> it = map.keySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (cameraMap.get(next) != iXARCamera);
                if (next != null) {
                    cameraMap.remove(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
