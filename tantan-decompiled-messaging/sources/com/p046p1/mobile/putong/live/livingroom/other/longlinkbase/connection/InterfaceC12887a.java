package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12887a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo75510a();

        /* JADX INFO: renamed from: b */
        String mo75511b();
    }

    /* JADX INFO: renamed from: a */
    boolean mo75497a();

    /* JADX INFO: renamed from: b */
    void mo75498b(Buffer buffer) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo75509c();

    int getCurrentState();

    boolean isConnected();

    BufferedSource read() throws IOException;
}
