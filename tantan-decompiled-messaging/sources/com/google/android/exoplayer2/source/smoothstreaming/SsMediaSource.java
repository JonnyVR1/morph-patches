package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.drm.C1853a;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1934a;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1967k;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2000a;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.C2050d;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.exoplayer2.upstream.Loader;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p149l.a5c;
import p149l.as5;
import p149l.cif0;
import p149l.l7j0;
import p149l.lrv;
import p149l.mmd;
import p149l.n8f;
import p149l.nkx;
import p149l.p11;
import p149l.rki;
import p149l.sj0;
import p149l.urv;
import p149l.vce;
import p149l.vck0;
import p149l.za5;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SsMediaSource extends AbstractC1934a implements Loader.InterfaceC2041b<C2050d<C2000a>> {

    /* JADX INFO: renamed from: a */
    public final boolean f8962a;

    /* JADX INFO: renamed from: b */
    public final Uri f8963b;

    /* JADX INFO: renamed from: c */
    public final C1921n.h f8964c;

    /* JADX INFO: renamed from: d */
    public final C1921n f8965d;

    /* JADX INFO: renamed from: e */
    public final a5c.InterfaceC15531a f8966e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1993b.a f8967f;

    /* JADX INFO: renamed from: g */
    public final as5 f8968g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1855c f8969h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2049c f8970i;

    /* JADX INFO: renamed from: j */
    public final long f8971j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1966j.a f8972k;

    /* JADX INFO: renamed from: l */
    public final C2050d.a<? extends C2000a> f8973l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<C1994c> f8974m;

    /* JADX INFO: renamed from: n */
    public a5c f8975n;

    /* JADX INFO: renamed from: o */
    public Loader f8976o;

    /* JADX INFO: renamed from: p */
    public urv f8977p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public l7j0 f8978q;

    /* JADX INFO: renamed from: r */
    public long f8979r;

    /* JADX INFO: renamed from: s */
    public C2000a f8980s;

    /* JADX INFO: renamed from: t */
    public Handler f8981t;

    static {
        n8f.m158492a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(C1921n c1921n, @Nullable C2000a c2000a, @Nullable a5c.InterfaceC15531a interfaceC15531a, @Nullable C2050d.a<? extends C2000a> aVar, InterfaceC1993b.a aVar2, as5 as5Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, long j) {
        p11.m167013g(c2000a == null || !c2000a.f9051d);
        this.f8965d = c1921n;
        C1921n.h hVar = (C1921n.h) p11.m167011e(c1921n.f7960b);
        this.f8964c = hVar;
        this.f8980s = c2000a;
        this.f8963b = hVar.f8057a.equals(Uri.EMPTY) ? null : vck0.m197791C(hVar.f8057a);
        this.f8966e = interfaceC15531a;
        this.f8973l = aVar;
        this.f8967f = aVar2;
        this.f8968g = as5Var;
        this.f8969h = interfaceC1855c;
        this.f8970i = interfaceC2049c;
        this.f8971j = j;
        this.f8972k = createEventDispatcher(null);
        this.f8962a = c2000a != null;
        this.f8974m = new ArrayList<>();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo11024n(C2050d<C2000a> c2050d, long j, long j2, boolean z) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8970i.m12122c(c2050d.f9524a);
        this.f8972k.m11280j(lrvVar, c2050d.f9526c);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        InterfaceC1966j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        C1994c c1994c = new C1994c(this.f8980s, this.f8967f, this.f8978q, this.f8968g, null, this.f8969h, createDrmEventDispatcher(bVar), this.f8970i, aVarCreateEventDispatcher, this.f8977p, sj0Var);
        this.f8974m.add(c1994c);
        return c1994c;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo11025o(C2050d<C2000a> c2050d, long j, long j2) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        this.f8970i.m12122c(c2050d.f9524a);
        this.f8972k.m11283m(lrvVar, c2050d.f9526c);
        this.f8980s = c2050d.m12126e();
        this.f8979r = j - j2;
        m11683f();
        m11684g();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Loader.C2042c mo11026q(C2050d<C2000a> c2050d, long j, long j2, IOException iOException, int i) {
        lrv lrvVar = new lrv(c2050d.f9524a, c2050d.f9525b, c2050d.m12127f(), c2050d.m12125d(), j, j2, c2050d.m12124b());
        long jMo12118a = this.f8970i.mo12118a(new InterfaceC2049c.c(lrvVar, new nkx(c2050d.f9526c), iOException, i));
        Loader.C2042c c2042cM12084h = jMo12118a == -9223372036854775807L ? Loader.f9459g : Loader.m12084h(false, jMo12118a);
        boolean zM12095c = c2042cM12084h.m12095c();
        this.f8972k.m11287q(lrvVar, c2050d.f9526c, iOException, !zM12095c);
        if (!zM12095c) {
            this.f8970i.m12122c(c2050d.f9524a);
        }
        return c2042cM12084h;
    }

    /* JADX INFO: renamed from: f */
    public final void m11683f() {
        cif0 cif0Var;
        for (int i = 0; i < this.f8974m.size(); i++) {
            this.f8974m.get(i).m11700v(this.f8980s);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (C2000a.b bVar : this.f8980s.f9053f) {
            if (bVar.f9069k > 0) {
                jMax2 = Math.min(jMax2, bVar.m11732e(0));
                jMax = Math.max(jMax, bVar.m11732e(bVar.f9069k - 1) + bVar.m11730c(bVar.f9069k - 1));
            }
        }
        C2000a c2000a = this.f8980s;
        if (jMax2 == Long.MAX_VALUE) {
            long j = c2000a.f9051d ? -9223372036854775807L : 0L;
            C2000a c2000a2 = this.f8980s;
            boolean z = c2000a2.f9051d;
            cif0Var = new cif0(j, 0L, 0L, 0L, true, z, z, c2000a2, this.f8965d);
        } else if (c2000a.f9051d) {
            long j2 = c2000a.f9055h;
            if (j2 != -9223372036854775807L && j2 > 0) {
                jMax2 = Math.max(jMax2, jMax - j2);
            }
            long j3 = jMax2;
            long j4 = jMax - j3;
            long jM197806J0 = j4 - vck0.m197806J0(this.f8971j);
            if (jM197806J0 < 5000000) {
                jM197806J0 = Math.min(5000000L, j4 / 2);
            }
            cif0Var = new cif0(-9223372036854775807L, j4, j3, jM197806J0, true, true, true, this.f8980s, this.f8965d);
        } else {
            long j5 = c2000a.f9054g;
            if (j5 == -9223372036854775807L) {
                j5 = jMax - jMax2;
            }
            long j6 = j5;
            cif0Var = new cif0(jMax2 + j6, j6, jMax2, 0L, true, false, false, this.f8980s, this.f8965d);
        }
        refreshSourceInfo(cif0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m11684g() {
        if (this.f8980s.f9051d) {
            this.f8981t.postDelayed(new Runnable() { // from class: l.lsf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129864a.m11685h();
                }
            }, Math.max(0L, (this.f8979r + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f8965d;
    }

    /* JADX INFO: renamed from: h */
    public final void m11685h() {
        if (this.f8976o.m12087i()) {
            return;
        }
        C2050d c2050d = new C2050d(this.f8975n, this.f8963b, 4, this.f8973l);
        this.f8972k.m11289s(new lrv(c2050d.f9524a, c2050d.f9525b, this.f8976o.m12092n(c2050d, this, this.f8970i.mo12120d(c2050d.f9526c))), c2050d.f9526c);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f8977p.mo11027a();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.f8978q = l7j0Var;
        this.f8969h.mo9877d(Looper.myLooper(), getPlayerId());
        this.f8969h.prepare();
        if (this.f8962a) {
            this.f8977p = new urv.C20495a();
            m11683f();
            return;
        }
        this.f8975n = this.f8966e.mo95019a();
        Loader loader = new Loader("SsMediaSource");
        this.f8976o = loader;
        this.f8977p = loader;
        this.f8981t = vck0.m197896w();
        m11685h();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((C1994c) interfaceC1953h).m11699u();
        this.f8974m.remove(interfaceC1953h);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        this.f8980s = this.f8962a ? this.f8980s : null;
        this.f8975n = null;
        this.f8979r = 0L;
        Loader loader = this.f8976o;
        if (loader != null) {
            loader.m12090l();
            this.f8976o = null;
        }
        Handler handler = this.f8981t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8981t = null;
        }
        this.f8969h.release();
    }

    public static final class Factory implements InterfaceC1967k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int f8982k = 0;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1993b.a f8983c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final a5c.InterfaceC15531a f8984d;

        /* JADX INFO: renamed from: e */
        public as5 f8985e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public za5.InterfaceC21651a f8986f;

        /* JADX INFO: renamed from: g */
        public vce f8987g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2049c f8988h;

        /* JADX INFO: renamed from: i */
        public long f8989i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public C2050d.a<? extends C2000a> f8990j;

        public Factory(InterfaceC1993b.a aVar, @Nullable a5c.InterfaceC15531a interfaceC15531a) {
            this.f8983c = (InterfaceC1993b.a) p11.m167011e(aVar);
            this.f8984d = interfaceC15531a;
            this.f8987g = new C1853a();
            this.f8988h = new C2048b();
            this.f8989i = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f8985e = new mmd();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SsMediaSource mo10958c(C1921n c1921n) {
            p11.m167011e(c1921n.f7960b);
            C2050d.a ssManifestParser = this.f8990j;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List<StreamKey> list = c1921n.f7960b.f8061e;
            C2050d.a rkiVar = !list.isEmpty() ? new rki(ssManifestParser, list) : ssManifestParser;
            za5.InterfaceC21651a interfaceC21651a = this.f8986f;
            if (interfaceC21651a != null) {
                interfaceC21651a.m217721a(c1921n);
            }
            return new SsMediaSource(c1921n, null, this.f8984d, rkiVar, this.f8983c, this.f8985e, null, this.f8987g.mo9910a(c1921n), this.f8988h, this.f8989i);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo10959d(za5.InterfaceC21651a interfaceC21651a) {
            this.f8986f = (za5.InterfaceC21651a) p11.m167011e(interfaceC21651a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo10956a(vce vceVar) {
            this.f8987g = (vce) p11.m167012f(vceVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo10957b(InterfaceC2049c interfaceC2049c) {
            this.f8988h = (InterfaceC2049c) p11.m167012f(interfaceC2049c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(a5c.InterfaceC15531a interfaceC15531a) {
            this(new C1992a.a(interfaceC15531a), interfaceC15531a);
        }
    }
}
