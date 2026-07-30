package com.google.android.exoplayer2.source;

import java.io.IOException;
import p153l.ffj0;
import p153l.nke0;
import p153l.u9f;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1976h extends InterfaceC1997r {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.h$a */
    public interface a extends InterfaceC1997r.a<InterfaceC1976h> {
        /* JADX INFO: renamed from: l */
        void mo10275l(InterfaceC1976h interfaceC1976h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    boolean mo10977c(long j);

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    long mo10978d();

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    void mo10979e(long j);

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    long mo10980f();

    /* JADX INFO: renamed from: g */
    long mo10981g(long j, nke0 nke0Var);

    /* JADX INFO: renamed from: h */
    long mo10982h(long j);

    /* JADX INFO: renamed from: i */
    long mo10983i();

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r
    boolean isLoading();

    /* JADX INFO: renamed from: m */
    ffj0 mo10984m();

    /* JADX INFO: renamed from: p */
    void mo10987p(a aVar, long j);

    /* JADX INFO: renamed from: r */
    long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j);

    /* JADX INFO: renamed from: s */
    void mo10990s() throws IOException;

    /* JADX INFO: renamed from: t */
    void mo10991t(long j, boolean z);
}
