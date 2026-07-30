package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class ApiBase implements Serializable {
    private static ClientInfo clientInfo_;
    private static OnEventTrackingListener sListener_;

    public static ClientInfo getClientInfo() {
        return clientInfo_;
    }

    public static OnEventTrackingListener getsListener() {
        return sListener_;
    }

    public static void setClientInfo(ClientInfo clientInfo) {
        clientInfo_ = clientInfo;
    }

    public static void setsListener(OnEventTrackingListener onEventTrackingListener) {
        sListener_ = onEventTrackingListener;
    }
}
