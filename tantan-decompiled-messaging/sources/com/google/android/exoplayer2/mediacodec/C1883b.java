package com.google.android.exoplayer2.mediacodec;

import java.io.IOException;
import p149l.jwv;
import p149l.n200;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1883b implements InterfaceC1884c.b {

    /* JADX INFO: renamed from: a */
    public int f7891a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f7892b;

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC1884c.b
    /* JADX INFO: renamed from: a */
    public InterfaceC1884c mo10488a(InterfaceC1884c.a aVar) throws IOException {
        int i;
        int i2 = vck0.f180948a;
        if (i2 < 23 || ((i = this.f7891a) != 1 && (i != 0 || i2 < 31))) {
            return new C1887f.b().mo10488a(aVar);
        }
        int iM157529k = n200.m157529k(aVar.f7895c.f7748l);
        jwv.m143686f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + vck0.m197883p0(iM157529k));
        return new C1882a.b(iM157529k, this.f7892b).mo10488a(aVar);
    }
}
