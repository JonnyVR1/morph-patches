package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p153l.bmk0;
import p153l.g6c;
import p153l.j6c;
import p153l.mtv;
import p153l.p4g0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2073d<T> implements Loader.InterfaceC2067e {

    /* JADX INFO: renamed from: a */
    public final long f9561a;

    /* JADX INFO: renamed from: b */
    public final C2070a f9562b;

    /* JADX INFO: renamed from: c */
    public final int f9563c;

    /* JADX INFO: renamed from: d */
    public final p4g0 f9564d;

    /* JADX INFO: renamed from: e */
    public final a<? extends T> f9565e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public volatile T f9566f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo11073a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C2073d(g6c g6cVar, C2070a c2070a, int i, a<? extends T> aVar) {
        this.f9564d = new p4g0(g6cVar);
        this.f9562b = c2070a;
        this.f9563c = i;
        this.f9565e = aVar;
        this.f9561a = mtv.m160053a();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public final void mo11431a() throws IOException {
        this.f9564d.m170568s();
        j6c j6cVar = new j6c(this.f9564d, this.f9562b);
        try {
            j6cVar.m143636m();
            this.f9566f = this.f9565e.mo11073a((Uri) w11.m204369e(this.f9564d.mo11176d()), j6cVar);
        } finally {
            bmk0.m105156n(j6cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public long m12178b() {
        return this.f9564d.m170565j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public final void mo11432c() {
    }

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> m12179d() {
        return this.f9564d.m170567r();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final T m12180e() {
        return this.f9566f;
    }

    /* JADX INFO: renamed from: f */
    public Uri m12181f() {
        return this.f9564d.m170566q();
    }

    public C2073d(g6c g6cVar, Uri uri, int i, a<? extends T> aVar) {
        this(g6cVar, new C2070a.b().m12170i(uri).m12163b(1).m12162a(), i, aVar);
    }
}
