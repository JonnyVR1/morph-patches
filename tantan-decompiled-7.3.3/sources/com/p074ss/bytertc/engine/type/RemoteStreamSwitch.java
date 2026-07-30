package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalRemoteStreamSwitch;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteStreamSwitch {
    public boolean afterEnable;
    public int afterVideoIndex;
    public boolean beforeEnable;
    public int beforeVideoIndex;
    public boolean isScreen;
    public FallbackOrRecoverReason reason;
    public String uid;

    public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        this.uid = internalRemoteStreamSwitch.uid;
        this.beforeVideoIndex = internalRemoteStreamSwitch.beforeVideoIndex;
        this.afterVideoIndex = internalRemoteStreamSwitch.afterVideoIndex;
        this.beforeEnable = internalRemoteStreamSwitch.beforeEnable;
        this.afterEnable = internalRemoteStreamSwitch.afterEnable;
        this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
    }

    private FallbackOrRecoverReason getFallbackOrRecoverReason(int i) {
        switch (i) {
            case 0:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH;
            case 1:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE;
            case 2:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH;
            case 3:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE;
            case 4:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH;
            case 5:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE;
            case 6:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH;
            case 7:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE;
            default:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_UNKNOWN;
        }
    }

    public String toString() {
        return "RemoteStreamSwitch{uid='" + this.uid + "', isScreen='" + this.isScreen + "', before_video_index='" + this.beforeVideoIndex + "', after_video_index='" + this.afterVideoIndex + "', before_enable='" + this.beforeEnable + "', after_enable='" + this.afterEnable + "', reason='" + this.reason + "'}";
    }

    public RemoteStreamSwitch() {
    }
}
