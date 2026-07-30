package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p149l.a5c;
import p149l.d5c;
import p149l.gwf0;
import p149l.lrv;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2050d<T> implements Loader.InterfaceC2044e {

    /* JADX INFO: renamed from: a */
    public final long f9524a;

    /* JADX INFO: renamed from: b */
    public final C2047a f9525b;

    /* JADX INFO: renamed from: c */
    public final int f9526c;

    /* JADX INFO: renamed from: d */
    public final gwf0 f9527d;

    /* JADX INFO: renamed from: e */
    public final a<? extends T> f9528e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public volatile T f9529f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.d$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        T mo11019a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C2050d(a5c a5cVar, C2047a c2047a, int i, a<? extends T> aVar) {
        this.f9527d = new gwf0(a5cVar);
        this.f9525b = c2047a;
        this.f9526c = i;
        this.f9528e = aVar;
        this.f9524a = lrv.m151512a();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public final void mo11377a() throws IOException {
        this.f9527d.m128405s();
        d5c d5cVar = new d5c(this.f9527d, this.f9525b);
        try {
            d5cVar.m110049m();
            this.f9529f = this.f9528e.mo11019a((Uri) p11.m167011e(this.f9527d.mo11121a()), d5cVar);
        } finally {
            vck0.m197878n(d5cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public long m12124b() {
        return this.f9527d.m128402j();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public final void mo11378c() {
    }

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> m12125d() {
        return this.f9527d.m128404r();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final T m12126e() {
        return this.f9529f;
    }

    /* JADX INFO: renamed from: f */
    public Uri m12127f() {
        return this.f9527d.m128403q();
    }

    public C2050d(a5c a5cVar, Uri uri, int i, a<? extends T> aVar) {
        this(a5cVar, new C2047a.b().m12116i(uri).m12109b(1).m12108a(), i, aVar);
    }
}
