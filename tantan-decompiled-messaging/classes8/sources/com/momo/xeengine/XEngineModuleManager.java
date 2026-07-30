package com.momo.xeengine;

import androidx.annotation.Keep;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class XEngineModuleManager {
    private static final Set<IXEngineModule> modules = new HashSet();

    public static void AddEngineModule(IXEngineModule iXEngineModule) {
        Set<IXEngineModule> set = modules;
        synchronized (set) {
            set.add(iXEngineModule);
        }
    }

    public static void engineCreate(IXEngine iXEngine) {
        Set<IXEngineModule> set = modules;
        synchronized (set) {
            try {
                Iterator<IXEngineModule> it = set.iterator();
                while (it.hasNext()) {
                    it.next().engineDidCreated(iXEngine);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void engineLibraryLoaded() {
        Set<IXEngineModule> set = modules;
        synchronized (set) {
            try {
                Iterator<IXEngineModule> it = set.iterator();
                while (it.hasNext()) {
                    it.next().engineWillCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
