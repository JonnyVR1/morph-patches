package com.momo.xengine.p045ar;

import com.momo.xeengine.IXEngine;
import com.momo.xeengine.IXEngineModule;

/* JADX INFO: loaded from: classes8.dex */
public abstract class XEngineAR implements IXEngineModule {

    public static class InstanceHolder {
        private static final XEngineAR instance = new XEngineARImpl();

        private InstanceHolder() {
        }
    }

    public enum SupportType {
        SupportSensor(0),
        SupportARCore(1),
        SupportXRKit(2);

        private final int value;

        SupportType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static XEngineAR getInstance() {
        return InstanceHolder.instance;
    }

    public abstract IXARCamera createCamera(IXEngine iXEngine);

    public abstract SupportType getSupportType();
}
