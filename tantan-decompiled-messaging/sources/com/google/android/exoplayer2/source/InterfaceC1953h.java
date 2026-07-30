package com.google.android.exoplayer2.source;

import java.io.IOException;
import p149l.b6j0;
import p149l.ice0;
import p149l.o8f;
import p149l.vod0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1953h extends InterfaceC1974r {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.h$a */
    public interface a extends InterfaceC1974r.a<InterfaceC1953h> {
        /* JADX INFO: renamed from: l */
        void mo10221l(InterfaceC1953h interfaceC1953h);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    boolean mo10923c(long j);

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    long mo10924d();

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    void mo10925e(long j);

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    long mo10926f();

    /* JADX INFO: renamed from: g */
    long mo10927g(long j, ice0 ice0Var);

    /* JADX INFO: renamed from: h */
    long mo10928h(long j);

    /* JADX INFO: renamed from: i */
    long mo10929i();

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r
    boolean isLoading();

    /* JADX INFO: renamed from: m */
    b6j0 mo10930m();

    /* JADX INFO: renamed from: p */
    void mo10933p(a aVar, long j);

    /* JADX INFO: renamed from: r */
    long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j);

    /* JADX INFO: renamed from: s */
    void mo10936s() throws IOException;

    /* JADX INFO: renamed from: t */
    void mo10937t(long j, boolean z);
}
