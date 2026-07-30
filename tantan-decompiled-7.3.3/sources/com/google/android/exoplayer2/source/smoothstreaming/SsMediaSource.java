package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.drm.C1876a;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1957a;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1990k;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.C2023a;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.C2073d;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.exoplayer2.upstream.Loader;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p153l.bmk0;
import p153l.et5;
import p153l.g6c;
import p153l.ktx;
import p153l.lqf0;
import p153l.mtv;
import p153l.nni;
import p153l.oj0;
import p153l.pgj0;
import p153l.snd;
import p153l.t9f;
import p153l.vtv;
import p153l.w11;
import p153l.zb5;
import p153l.zde;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SsMediaSource extends AbstractC1957a implements Loader.InterfaceC2064b<C2073d<C2023a>> {

    /* JADX INFO: renamed from: a */
    public final boolean f8999a;

    /* JADX INFO: renamed from: b */
    public final Uri f9000b;

    /* JADX INFO: renamed from: c */
    public final C1944n.h f9001c;

    /* JADX INFO: renamed from: d */
    public final C1944n f9002d;

    /* JADX INFO: renamed from: e */
    public final g6c.InterfaceC17163a f9003e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2016b.a f9004f;

    /* JADX INFO: renamed from: g */
    public final et5 f9005g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1878c f9006h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2072c f9007i;

    /* JADX INFO: renamed from: j */
    public final long f9008j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1989j.a f9009k;

    /* JADX INFO: renamed from: l */
    public final C2073d.a<? extends C2023a> f9010l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<C2017c> f9011m;

    /* JADX INFO: renamed from: n */
    public g6c f9012n;

    /* JADX INFO: renamed from: o */
    public Loader f9013o;

    /* JADX INFO: renamed from: p */
    public vtv f9014p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public pgj0 f9015q;

    /* JADX INFO: renamed from: r */
    public long f9016r;

    /* JADX INFO: renamed from: s */
    public C2023a f9017s;

    /* JADX INFO: renamed from: t */
    public Handler f9018t;

    static {
        t9f.m189752a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(C1944n c1944n, @Nullable C2023a c2023a, @Nullable g6c.InterfaceC17163a interfaceC17163a, @Nullable C2073d.a<? extends C2023a> aVar, InterfaceC2016b.a aVar2, et5 et5Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, long j) {
        w11.m204371g(c2023a == null || !c2023a.f9088d);
        this.f9002d = c1944n;
        C1944n.h hVar = (C1944n.h) w11.m204369e(c1944n.f7997b);
        this.f9001c = hVar;
        this.f9017s = c2023a;
        this.f9000b = hVar.f8094a.equals(Uri.EMPTY) ? null : bmk0.m105069C(hVar.f8094a);
        this.f9003e = interfaceC17163a;
        this.f9010l = aVar;
        this.f9004f = aVar2;
        this.f9005g = et5Var;
        this.f9006h = interfaceC1878c;
        this.f9007i = interfaceC2072c;
        this.f9008j = j;
        this.f9009k = createEventDispatcher(null);
        this.f8999a = c2023a != null;
        this.f9011m = new ArrayList<>();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo11078n(C2073d<C2023a> c2073d, long j, long j2, boolean z) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f9007i.m12176c(c2073d.f9561a);
        this.f9009k.m11334j(mtvVar, c2073d.f9563c);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        InterfaceC1989j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        C2017c c2017c = new C2017c(this.f9017s, this.f9004f, this.f9015q, this.f9005g, null, this.f9006h, createDrmEventDispatcher(bVar), this.f9007i, aVarCreateEventDispatcher, this.f9014p, oj0Var);
        this.f9011m.add(c2017c);
        return c2017c;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo11079o(C2073d<C2023a> c2073d, long j, long j2) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        this.f9007i.m12176c(c2073d.f9561a);
        this.f9009k.m11337m(mtvVar, c2073d.f9563c);
        this.f9017s = c2073d.m12180e();
        this.f9016r = j - j2;
        m11737f();
        m11738g();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Loader.C2065c mo11080q(C2073d<C2023a> c2073d, long j, long j2, IOException iOException, int i) {
        mtv mtvVar = new mtv(c2073d.f9561a, c2073d.f9562b, c2073d.m12181f(), c2073d.m12179d(), j, j2, c2073d.m12178b());
        long jMo12172a = this.f9007i.mo12172a(new InterfaceC2072c.c(mtvVar, new ktx(c2073d.f9563c), iOException, i));
        Loader.C2065c c2065cM12138h = jMo12172a == -9223372036854775807L ? Loader.f9496g : Loader.m12138h(false, jMo12172a);
        boolean zM12149c = c2065cM12138h.m12149c();
        this.f9009k.m11341q(mtvVar, c2073d.f9563c, iOException, !zM12149c);
        if (!zM12149c) {
            this.f9007i.m12176c(c2073d.f9561a);
        }
        return c2065cM12138h;
    }

    /* JADX INFO: renamed from: f */
    public final void m11737f() {
        lqf0 lqf0Var;
        for (int i = 0; i < this.f9011m.size(); i++) {
            this.f9011m.get(i).m11754v(this.f9017s);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (C2023a.b bVar : this.f9017s.f9090f) {
            if (bVar.f9106k > 0) {
                jMax2 = Math.min(jMax2, bVar.m11786e(0));
                jMax = Math.max(jMax, bVar.m11786e(bVar.f9106k - 1) + bVar.m11784c(bVar.f9106k - 1));
            }
        }
        C2023a c2023a = this.f9017s;
        if (jMax2 == Long.MAX_VALUE) {
            long j = c2023a.f9088d ? -9223372036854775807L : 0L;
            C2023a c2023a2 = this.f9017s;
            boolean z = c2023a2.f9088d;
            lqf0Var = new lqf0(j, 0L, 0L, 0L, true, z, z, c2023a2, this.f9002d);
        } else if (c2023a.f9088d) {
            long j2 = c2023a.f9092h;
            if (j2 != -9223372036854775807L && j2 > 0) {
                jMax2 = Math.max(jMax2, jMax - j2);
            }
            long j3 = jMax2;
            long j4 = jMax - j3;
            long jM105084J0 = j4 - bmk0.m105084J0(this.f9008j);
            if (jM105084J0 < 5000000) {
                jM105084J0 = Math.min(5000000L, j4 / 2);
            }
            lqf0Var = new lqf0(-9223372036854775807L, j4, j3, jM105084J0, true, true, true, this.f9017s, this.f9002d);
        } else {
            long j5 = c2023a.f9091g;
            if (j5 == -9223372036854775807L) {
                j5 = jMax - jMax2;
            }
            long j6 = j5;
            lqf0Var = new lqf0(jMax2 + j6, j6, jMax2, 0L, true, false, false, this.f9017s, this.f9002d);
        }
        refreshSourceInfo(lqf0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m11738g() {
        if (this.f9017s.f9088d) {
            this.f9018t.postDelayed(new Runnable() { // from class: l.u0g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176883a.m11739h();
                }
            }, Math.max(0L, (this.f9016r + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f9002d;
    }

    /* JADX INFO: renamed from: h */
    public final void m11739h() {
        if (this.f9013o.m12141i()) {
            return;
        }
        C2073d c2073d = new C2073d(this.f9012n, this.f9000b, 4, this.f9010l);
        this.f9009k.m11343s(new mtv(c2073d.f9561a, c2073d.f9562b, this.f9013o.m12146n(c2073d, this, this.f9007i.mo12174d(c2073d.f9563c))), c2073d.f9563c);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f9014p.mo11081a();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.f9015q = pgj0Var;
        this.f9006h.mo9931d(Looper.myLooper(), getPlayerId());
        this.f9006h.prepare();
        if (this.f8999a) {
            this.f9014p = new vtv.C20933a();
            m11737f();
            return;
        }
        this.f9012n = this.f9003e.mo129219a();
        Loader loader = new Loader("SsMediaSource");
        this.f9013o = loader;
        this.f9014p = loader;
        this.f9018t = bmk0.m105174w();
        m11739h();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((C2017c) interfaceC1976h).m11753u();
        this.f9011m.remove(interfaceC1976h);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        this.f9017s = this.f8999a ? this.f9017s : null;
        this.f9012n = null;
        this.f9016r = 0L;
        Loader loader = this.f9013o;
        if (loader != null) {
            loader.m12144l();
            this.f9013o = null;
        }
        Handler handler = this.f9018t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9018t = null;
        }
        this.f9006h.release();
    }

    public static final class Factory implements InterfaceC1990k {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int f9019k = 0;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2016b.a f9020c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final g6c.InterfaceC17163a f9021d;

        /* JADX INFO: renamed from: e */
        public et5 f9022e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public zb5.InterfaceC21789a f9023f;

        /* JADX INFO: renamed from: g */
        public zde f9024g;

        /* JADX INFO: renamed from: h */
        public InterfaceC2072c f9025h;

        /* JADX INFO: renamed from: i */
        public long f9026i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public C2073d.a<? extends C2023a> f9027j;

        public Factory(InterfaceC2016b.a aVar, @Nullable g6c.InterfaceC17163a interfaceC17163a) {
            this.f9020c = (InterfaceC2016b.a) w11.m204369e(aVar);
            this.f9021d = interfaceC17163a;
            this.f9024g = new C1876a();
            this.f9025h = new C2071b();
            this.f9026i = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            this.f9022e = new snd();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SsMediaSource mo11012c(C1944n c1944n) {
            w11.m204369e(c1944n.f7997b);
            C2073d.a ssManifestParser = this.f9027j;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List<StreamKey> list = c1944n.f7997b.f8098e;
            C2073d.a nniVar = !list.isEmpty() ? new nni(ssManifestParser, list) : ssManifestParser;
            zb5.InterfaceC21789a interfaceC21789a = this.f9023f;
            if (interfaceC21789a != null) {
                interfaceC21789a.m219186a(c1944n);
            }
            return new SsMediaSource(c1944n, null, this.f9021d, nniVar, this.f9020c, this.f9022e, null, this.f9024g.mo9964a(c1944n), this.f9025h, this.f9026i);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo11013d(zb5.InterfaceC21789a interfaceC21789a) {
            this.f9023f = (zb5.InterfaceC21789a) w11.m204369e(interfaceC21789a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo11010a(zde zdeVar) {
            this.f9024g = (zde) w11.m204370f(zdeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo11011b(InterfaceC2072c interfaceC2072c) {
            this.f9025h = (InterfaceC2072c) w11.m204370f(interfaceC2072c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(g6c.InterfaceC17163a interfaceC17163a) {
            this(new C2015a.a(interfaceC17163a), interfaceC17163a);
        }
    }
}
