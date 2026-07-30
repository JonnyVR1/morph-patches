package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import java.io.IOException;
import p149l.a5c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1977a extends a5c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.a$a */
    public interface a {
        @Nullable
        /* JADX INFO: renamed from: a */
        default a mo11475a() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        InterfaceC1977a mo11476b(int i) throws IOException;
    }

    int getLocalPort();

    String getTransport();

    /* JADX INFO: renamed from: i */
    boolean mo11473i();

    @Nullable
    /* JADX INFO: renamed from: l */
    C1983g.b mo11474l();
}
