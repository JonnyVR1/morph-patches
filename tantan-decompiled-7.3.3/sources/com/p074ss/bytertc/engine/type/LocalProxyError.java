package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum LocalProxyError {
    OK(0),
    SOCKS5_VERSION_ERROR(1),
    SOCKS5_FORMAT_ERROR(2),
    SOCKS5_INVALID_VALUE(3),
    SOCKS5_USER_PASS_NOT_GIVEN(4),
    SOCKS5_TCP_CLOSED(5),
    HTTP_TUNNEL_FAILED(6);

    private int value;

    LocalProxyError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static LocalProxyError fromId(int i) {
        for (LocalProxyError localProxyError : values()) {
            if (localProxyError.value() == i) {
                return localProxyError;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
