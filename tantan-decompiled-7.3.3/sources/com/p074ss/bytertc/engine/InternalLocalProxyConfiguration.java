package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.type.LocalProxyConfiguration;
import com.p074ss.bytertc.engine.type.LocalProxyType;

/* JADX INFO: loaded from: classes11.dex */
public class InternalLocalProxyConfiguration {
    public String localProxyIp;
    public String localProxyPassword;
    public int localProxyPort;
    public InternalLocalProxyType localProxyType;
    public String localProxyUsername;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.InternalLocalProxyConfiguration$1 */
    public static /* synthetic */ class C135611 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType;

        static {
            int[] iArr = new int[LocalProxyType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType = iArr;
            try {
                iArr[LocalProxyType.SOCKS5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[LocalProxyType.HTTP_TUNNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum InternalLocalProxyType {
        SOCKS5(1),
        HTTP_TUNNEL(2);

        private int value;

        InternalLocalProxyType(int i) {
            this.value = i;
        }

        @CalledByNative("InternalLocalProxyType")
        public int getIntValue() {
            return this.value;
        }
    }

    public InternalLocalProxyConfiguration(LocalProxyConfiguration localProxyConfiguration) {
        this.localProxyType = ConvertEnumValue(localProxyConfiguration.localProxyType);
        this.localProxyIp = localProxyConfiguration.localProxyIp;
        this.localProxyPort = localProxyConfiguration.localProxyPort;
        this.localProxyUsername = localProxyConfiguration.localProxyUsername;
        this.localProxyPassword = localProxyConfiguration.localProxyPassword;
    }

    private InternalLocalProxyType ConvertEnumValue(LocalProxyType localProxyType) {
        InternalLocalProxyType internalLocalProxyType = InternalLocalProxyType.SOCKS5;
        int i = C135611.$SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[localProxyType.ordinal()];
        return (i == 1 || i != 2) ? internalLocalProxyType : InternalLocalProxyType.HTTP_TUNNEL;
    }

    @CalledByNative
    public String getLocalProxyIp() {
        return this.localProxyIp;
    }

    @CalledByNative
    public String getLocalProxyPassword() {
        return this.localProxyPassword;
    }

    @CalledByNative
    public int getLocalProxyPort() {
        return this.localProxyPort;
    }

    @CalledByNative
    public InternalLocalProxyType getLocalProxyType() {
        return this.localProxyType;
    }

    @CalledByNative
    public String getLocalProxyUsername() {
        return this.localProxyUsername;
    }
}
