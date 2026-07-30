package com.cosmos.photon.baseim.push;

/* JADX INFO: loaded from: classes.dex */
public interface ConnectStateChangeListener {
    public static final int Connected = 0;
    public static final int Connecting = 1;
    public static final int Disconnected = 2;
    public static final int IOError = 3;

    void onConnectStateChanged(int i);
}
