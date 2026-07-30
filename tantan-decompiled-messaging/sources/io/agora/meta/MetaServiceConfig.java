package io.agora.meta;

import io.agora.base.internal.CalledByNative;
import io.agora.rtc2.RtcEngine;

/* JADX INFO: loaded from: classes2.dex */
public class MetaServiceConfig {
    public RtcEngine mRtcEngine = null;
    public String mAppId = "";
    public String mRtmToken = "";
    public String mRtcToken = "";
    public String mLocalDownloadPath = "";
    public String mUserId = "";
    public IMetaServiceEventHandler mEventHandler = null;

    @CalledByNative
    public String getAppId() {
        return this.mAppId;
    }

    @CalledByNative
    public IMetaServiceEventHandler getEventHandler() {
        return this.mEventHandler;
    }

    @CalledByNative
    public String getLocalDownloadPath() {
        return this.mLocalDownloadPath;
    }

    @CalledByNative
    public String getRtcToken() {
        return this.mRtcToken;
    }

    @CalledByNative
    public String getRtmToken() {
        return this.mRtmToken;
    }

    @CalledByNative
    public String getUserId() {
        return this.mUserId;
    }

    public String toString() {
        return "MetaServiceConfig{mRtcEngine=" + this.mRtcEngine + ", mAppId='" + this.mAppId + "', mRtmToken='" + this.mRtmToken + ", mRtcToken='" + this.mRtcToken + "', mLocalDownloadPath='" + this.mLocalDownloadPath + "', mUserId='" + this.mUserId + "', mEventHandler=" + this.mEventHandler + '}';
    }
}
