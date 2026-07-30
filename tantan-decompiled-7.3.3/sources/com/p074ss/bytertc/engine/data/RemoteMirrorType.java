package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: loaded from: classes11.dex */
public enum RemoteMirrorType {
    NONE(0),
    RENDER(1);

    private int value;

    RemoteMirrorType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RemoteMirrorType fromId(int i) {
        for (RemoteMirrorType remoteMirrorType : values()) {
            if (remoteMirrorType.value() == i) {
                return remoteMirrorType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        if (this == NONE) {
            return Constraint.NONE;
        }
        return this == RENDER ? "RENDER" : "";
    }

    public int value() {
        return this.value;
    }
}
