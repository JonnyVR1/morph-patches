package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HeartbeatMessageType {
    public static final short heartbeat_request = 1;
    public static final short heartbeat_response = 2;

    public static boolean isValid(short s) {
        return s >= 1 && s <= 2;
    }
}
