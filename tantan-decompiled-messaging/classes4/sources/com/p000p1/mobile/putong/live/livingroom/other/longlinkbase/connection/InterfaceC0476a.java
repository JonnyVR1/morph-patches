package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface InterfaceC0476a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo9145a();

        /* JADX INFO: renamed from: b */
        String mo9146b();
    }

    /* JADX INFO: renamed from: a */
    boolean mo9132a();

    /* JADX INFO: renamed from: b */
    void mo9133b(Buffer buffer) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo9144c();

    int getCurrentState();

    boolean isConnected();

    BufferedSource read() throws IOException;
}
