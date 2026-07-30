package com.p074ss.bytertc.engine.live;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamPushTargetConfig {
    public String pushCDNURL;
    public MixedStreamPushTargetType pushTargetType;
    public String pushWTNStreamID;

    public MixedStreamPushTargetConfig() {
        this.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
        this.pushCDNURL = "";
        this.pushWTNStreamID = "";
    }

    @CalledByNative
    public String getMixedStreamPushTargetTypePushCDNURL() {
        String str = this.pushCDNURL;
        return str == null ? "" : str;
    }

    @CalledByNative
    public int getMixedStreamPushTargetTypePushTargetType() {
        return this.pushTargetType.value();
    }

    @CalledByNative
    public String getMixedStreamPushTargetTypePushWTNStreamID() {
        String str = this.pushWTNStreamID;
        return str == null ? "" : str;
    }

    public MixedStreamPushTargetConfig(MixedStreamPushTargetType mixedStreamPushTargetType, String str, String str2) {
        MixedStreamPushTargetType mixedStreamPushTargetType2 = MixedStreamPushTargetType.PUSH_TO_CDN;
        this.pushTargetType = mixedStreamPushTargetType;
        this.pushCDNURL = str;
        this.pushWTNStreamID = str2;
    }
}
