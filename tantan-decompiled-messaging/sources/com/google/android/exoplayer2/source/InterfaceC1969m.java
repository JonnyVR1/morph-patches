package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p149l.fd80;
import p149l.uqf;
import p149l.v680;
import p149l.w4c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1969m {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC1969m mo11327a(v680 v680Var);
    }

    /* JADX INFO: renamed from: a */
    void mo11322a(long j, long j2);

    /* JADX INFO: renamed from: b */
    long mo11323b();

    /* JADX INFO: renamed from: c */
    int mo11324c(fd80 fd80Var) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo11325d();

    /* JADX INFO: renamed from: e */
    void mo11326e(w4c w4cVar, Uri uri, Map<String, List<String>> map, long j, long j2, uqf uqfVar) throws IOException;

    void release();
}
