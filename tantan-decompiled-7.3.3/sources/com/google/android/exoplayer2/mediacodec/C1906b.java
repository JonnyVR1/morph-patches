package com.google.android.exoplayer2.mediacodec;

import java.io.IOException;
import p153l.bmk0;
import p153l.kb00;
import p153l.kyv;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1906b implements InterfaceC1907c.b {

    /* JADX INFO: renamed from: a */
    public int f7928a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f7929b;

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1907c.b
    /* JADX INFO: renamed from: a */
    public InterfaceC1907c mo10542a(InterfaceC1907c.a aVar) throws IOException {
        int i;
        int i2 = bmk0.f77313a;
        if (i2 < 23 || ((i = this.f7928a) != 1 && (i != 0 || i2 < 31))) {
            return new C1910f.b().mo10542a(aVar);
        }
        int iM149010k = kb00.m149010k(aVar.f7932c.f7785l);
        kyv.m152148f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + bmk0.m105161p0(iM149010k));
        return new C1905a.b(iM149010k, this.f7929b).mo10542a(aVar);
    }
}
