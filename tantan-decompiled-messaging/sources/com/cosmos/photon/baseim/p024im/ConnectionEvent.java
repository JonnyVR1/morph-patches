package com.cosmos.photon.baseim.p024im;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface ConnectionEvent {
    public static final int CONN_EVENT_AUTH_FAILED = 2;
    public static final int CONN_EVENT_AUTH_SUCCESS = 1;
    public static final int CONN_EVENT_AUTO_CONNECTING = 0;
    public static final int CONN_EVENT_KICK = 3;
    public static final int CONN_EVENT_NET_UNAVAILABLE = 4;
}
