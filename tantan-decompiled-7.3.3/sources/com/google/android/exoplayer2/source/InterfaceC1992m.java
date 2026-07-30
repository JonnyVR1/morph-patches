package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p153l.bf80;
import p153l.bsf;
import p153l.e6c;
import p153l.ll80;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1992m {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.m$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC1992m mo11381a(bf80 bf80Var);
    }

    /* JADX INFO: renamed from: a */
    void mo11376a(long j, long j2);

    /* JADX INFO: renamed from: b */
    long mo11377b();

    /* JADX INFO: renamed from: c */
    int mo11378c(ll80 ll80Var) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo11379d();

    /* JADX INFO: renamed from: e */
    void mo11380e(e6c e6cVar, Uri uri, Map<String, List<String>> map, long j, long j2, bsf bsfVar) throws IOException;

    void release();
}
