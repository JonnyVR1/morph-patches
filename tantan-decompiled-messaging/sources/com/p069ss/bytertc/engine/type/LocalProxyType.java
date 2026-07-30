package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum LocalProxyType {
    SOCKS5(1),
    HTTP_TUNNEL(2);

    private int value;

    LocalProxyType(int i) {
        this.value = i;
    }

    @CalledByNative
    public static LocalProxyType fromId(int i) {
        for (LocalProxyType localProxyType : values()) {
            if (localProxyType.value() == i) {
                return localProxyType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
