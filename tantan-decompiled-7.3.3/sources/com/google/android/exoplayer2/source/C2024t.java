package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.base.C2677a;
import com.google.common.collect.ImmutableList;
import p153l.g6c;
import p153l.lqf0;
import p153l.oj0;
import p153l.pgj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.t */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2024t extends AbstractC1957a {

    /* JADX INFO: renamed from: a */
    public final C2070a f9112a;

    /* JADX INFO: renamed from: b */
    public final g6c.InterfaceC17163a f9113b;

    /* JADX INFO: renamed from: c */
    public final C1894k f9114c;

    /* JADX INFO: renamed from: d */
    public final long f9115d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072c f9116e;

    /* JADX INFO: renamed from: f */
    public final boolean f9117f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1857c0 f9118g;

    /* JADX INFO: renamed from: h */
    public final C1944n f9119h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public pgj0 f9120i;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final g6c.InterfaceC17163a f9121a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2072c f9122b = new C2071b();

        /* JADX INFO: renamed from: c */
        public boolean f9123c = true;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f9124d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f9125e;

        public b(g6c.InterfaceC17163a interfaceC17163a) {
            this.f9121a = (g6c.InterfaceC17163a) w11.m204369e(interfaceC17163a);
        }

        /* JADX INFO: renamed from: a */
        public C2024t m11787a(C1944n.k kVar, long j) {
            return new C2024t(this.f9125e, kVar, this.f9121a, j, this.f9122b, this.f9123c, this.f9124d);
        }

        /* JADX INFO: renamed from: b */
        public b m11788b(@Nullable InterfaceC2072c interfaceC2072c) {
            if (interfaceC2072c == null) {
                interfaceC2072c = new C2071b();
            }
            this.f9122b = interfaceC2072c;
            return this;
        }
    }

    public C2024t(@Nullable String str, C1944n.k kVar, g6c.InterfaceC17163a interfaceC17163a, long j, InterfaceC2072c interfaceC2072c, boolean z, @Nullable Object obj) {
        this.f9113b = interfaceC17163a;
        this.f9115d = j;
        this.f9116e = interfaceC2072c;
        this.f9117f = z;
        C1944n c1944nM10687a = new C1944n.c().m10692f(Uri.EMPTY).m10689c(kVar.f8122a.toString()).m10690d(ImmutableList.m15740of(kVar)).m10691e(obj).m10687a();
        this.f9119h = c1944nM10687a;
        C1894k.b bVarM10390W = new C1894k.b().m10400g0((String) C2677a.m15480a(kVar.f8123b, "text/x-unknown")).m10391X(kVar.f8124c).m10402i0(kVar.f8125d).m10398e0(kVar.f8126e).m10390W(kVar.f8127f);
        String str2 = kVar.f8128g;
        this.f9114c = bVarM10390W.m10388U(str2 != null ? str2 : str).m10374G();
        this.f9112a = new C2070a.b().m12170i(kVar.f8122a).m12163b(1).m12162a();
        this.f9118g = new lqf0(j, true, false, false, null, c1944nM10687a);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        return new C2013s(this.f9112a, this.f9113b, this.f9120i, this.f9114c, this.f9115d, this.f9116e, createEventDispatcher(bVar), this.f9117f);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f9119h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.f9120i = pgj0Var;
        refreshSourceInfo(this.f9118g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((C2013s) interfaceC1976h).m11728l();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
    }
}
