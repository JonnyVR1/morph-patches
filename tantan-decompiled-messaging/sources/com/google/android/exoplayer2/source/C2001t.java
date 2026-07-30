package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.base.C2654a;
import com.google.common.collect.ImmutableList;
import p149l.a5c;
import p149l.cif0;
import p149l.l7j0;
import p149l.p11;
import p149l.sj0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.t */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2001t extends AbstractC1934a {

    /* JADX INFO: renamed from: a */
    public final C2047a f9075a;

    /* JADX INFO: renamed from: b */
    public final a5c.InterfaceC15531a f9076b;

    /* JADX INFO: renamed from: c */
    public final C1871k f9077c;

    /* JADX INFO: renamed from: d */
    public final long f9078d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2049c f9079e;

    /* JADX INFO: renamed from: f */
    public final boolean f9080f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1834c0 f9081g;

    /* JADX INFO: renamed from: h */
    public final C1921n f9082h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public l7j0 f9083i;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final a5c.InterfaceC15531a f9084a;

        /* JADX INFO: renamed from: b */
        public InterfaceC2049c f9085b = new C2048b();

        /* JADX INFO: renamed from: c */
        public boolean f9086c = true;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f9087d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f9088e;

        public b(a5c.InterfaceC15531a interfaceC15531a) {
            this.f9084a = (a5c.InterfaceC15531a) p11.m167011e(interfaceC15531a);
        }

        /* JADX INFO: renamed from: a */
        public C2001t m11733a(C1921n.k kVar, long j) {
            return new C2001t(this.f9088e, kVar, this.f9084a, j, this.f9085b, this.f9086c, this.f9087d);
        }

        /* JADX INFO: renamed from: b */
        public b m11734b(@Nullable InterfaceC2049c interfaceC2049c) {
            if (interfaceC2049c == null) {
                interfaceC2049c = new C2048b();
            }
            this.f9085b = interfaceC2049c;
            return this;
        }
    }

    public C2001t(@Nullable String str, C1921n.k kVar, a5c.InterfaceC15531a interfaceC15531a, long j, InterfaceC2049c interfaceC2049c, boolean z, @Nullable Object obj) {
        this.f9076b = interfaceC15531a;
        this.f9078d = j;
        this.f9079e = interfaceC2049c;
        this.f9080f = z;
        C1921n c1921nM10633a = new C1921n.c().m10638f(Uri.EMPTY).m10635c(kVar.f8085a.toString()).m10636d(ImmutableList.m15686of(kVar)).m10637e(obj).m10633a();
        this.f9082h = c1921nM10633a;
        C1871k.b bVarM10336W = new C1871k.b().m10346g0((String) C2654a.m15426a(kVar.f8086b, "text/x-unknown")).m10337X(kVar.f8087c).m10348i0(kVar.f8088d).m10344e0(kVar.f8089e).m10336W(kVar.f8090f);
        String str2 = kVar.f8091g;
        this.f9077c = bVarM10336W.m10334U(str2 != null ? str2 : str).m10320G();
        this.f9075a = new C2047a.b().m12116i(kVar.f8085a).m12109b(1).m12108a();
        this.f9081g = new cif0(j, true, false, false, null, c1921nM10633a);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        return new C1990s(this.f9075a, this.f9076b, this.f9083i, this.f9077c, this.f9078d, this.f9079e, createEventDispatcher(bVar), this.f9080f);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f9082h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.f9083i = l7j0Var;
        refreshSourceInfo(this.f9081g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((C1990s) interfaceC1953h).m11674l();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
    }
}
