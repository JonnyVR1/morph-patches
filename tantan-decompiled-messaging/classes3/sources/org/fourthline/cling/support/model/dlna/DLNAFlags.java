package org.fourthline.cling.support.model.dlna;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum DLNAFlags {
    SENDER_PACED(PKIFailureInfo.systemUnavail),
    TIME_BASED_SEEK(1073741824),
    BYTE_BASED_SEEK(PKIFailureInfo.duplicateCertReq),
    FLAG_PLAY_CONTAINER(268435456),
    S0_INCREASE(134217728),
    SN_INCREASE(67108864),
    RTSP_PAUSE(33554432),
    STREAMING_TRANSFER_MODE(16777216),
    INTERACTIVE_TRANSFERT_MODE(8388608),
    BACKGROUND_TRANSFERT_MODE(4194304),
    CONNECTION_STALL(PKIFailureInfo.badSenderNonce),
    DLNA_V15(PKIFailureInfo.badCertTemplate);

    private int code;

    DLNAFlags(int i) {
        this.code = i;
    }

    public static DLNAFlags valueOf(int i) {
        for (DLNAFlags dLNAFlags : values()) {
            if (dLNAFlags.getCode() == i) {
                return dLNAFlags;
            }
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }
}
