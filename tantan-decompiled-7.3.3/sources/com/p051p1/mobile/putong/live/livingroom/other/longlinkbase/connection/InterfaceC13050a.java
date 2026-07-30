package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC13050a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo76693a();

        /* JADX INFO: renamed from: b */
        String mo76694b();
    }

    /* JADX INFO: renamed from: a */
    boolean mo76680a();

    /* JADX INFO: renamed from: b */
    void mo76681b(Buffer buffer) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo76692c();

    int getCurrentState();

    boolean isConnected();

    BufferedSource read() throws IOException;
}
