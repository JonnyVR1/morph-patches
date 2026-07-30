package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import java.io.IOException;
import p153l.g6c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2000a extends g6c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a$a */
    public interface a {
        @Nullable
        /* JADX INFO: renamed from: a */
        default a mo11529a() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        InterfaceC2000a mo11530b(int i) throws IOException;
    }

    int getLocalPort();

    String getTransport();

    /* JADX INFO: renamed from: i */
    boolean mo11527i();

    @Nullable
    /* JADX INFO: renamed from: l */
    C2006g.b mo11528l();
}
