package org.fourthline.cling.support.model.dlna;

import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public enum DLNAFlags {
    SENDER_PACED(Integer.MIN_VALUE),
    TIME_BASED_SEEK(1073741824),
    BYTE_BASED_SEEK(536870912),
    FLAG_PLAY_CONTAINER(SQLiteDatabase.CREATE_IF_NECESSARY),
    S0_INCREASE(134217728),
    SN_INCREASE(AudioRoutingController.DEVICE_OUT_USB_HEADSET),
    RTSP_PAUSE(33554432),
    STREAMING_TRANSFER_MODE(16777216),
    INTERACTIVE_TRANSFERT_MODE(8388608),
    BACKGROUND_TRANSFERT_MODE(4194304),
    CONNECTION_STALL(2097152),
    DLNA_V15(1048576);

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
