package com.google.android.exoplayer2.source;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.source.C1960d;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p153l.asf;
import p153l.b7h0;
import p153l.bmk0;
import p153l.bsf;
import p153l.esf;
import p153l.g6c;
import p153l.kyv;
import p153l.ll80;
import p153l.mke0;
import p153l.pdg0;
import p153l.qdg0;
import p153l.qfj0;
import p153l.tod;
import p153l.vnd;
import p153l.w11;
import p153l.xpg0;
import p153l.zb5;
import p153l.zde;
import p153l.zrf;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1960d implements InterfaceC1990k {

    /* JADX INFO: renamed from: c */
    public final a f8340c;

    /* JADX INFO: renamed from: d */
    public g6c.InterfaceC17163a f8341d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC1988i.a f8342e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC2072c f8343f;

    /* JADX INFO: renamed from: g */
    public long f8344g;

    /* JADX INFO: renamed from: h */
    public long f8345h;

    /* JADX INFO: renamed from: i */
    public long f8346i;

    /* JADX INFO: renamed from: j */
    public float f8347j;

    /* JADX INFO: renamed from: k */
    public float f8348k;

    /* JADX INFO: renamed from: l */
    public boolean f8349l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final esf f8350a;

        /* JADX INFO: renamed from: b */
        public final Map<Integer, b7h0<InterfaceC1988i.a>> f8351b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Set<Integer> f8352c = new HashSet();

        /* JADX INFO: renamed from: d */
        public final Map<Integer, InterfaceC1988i.a> f8353d = new HashMap();

        /* JADX INFO: renamed from: e */
        public g6c.InterfaceC17163a f8354e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public zb5.InterfaceC21789a f8355f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public zde f8356g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public InterfaceC2072c f8357h;

        public a(esf esfVar) {
            this.f8350a = esfVar;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC1988i.a m11021d(a aVar, g6c.InterfaceC17163a interfaceC17163a) {
            aVar.getClass();
            return new C1994o.b(interfaceC17163a, aVar.f8350a);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public InterfaceC1988i.a m11023f(int i) {
            InterfaceC1988i.a aVar = this.f8353d.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            b7h0<InterfaceC1988i.a> b7h0VarM11024g = m11024g(i);
            if (b7h0VarM11024g == null) {
                return null;
            }
            InterfaceC1988i.a aVar2 = b7h0VarM11024g.get();
            zb5.InterfaceC21789a interfaceC21789a = this.f8355f;
            if (interfaceC21789a != null) {
                aVar2.mo11013d(interfaceC21789a);
            }
            zde zdeVar = this.f8356g;
            if (zdeVar != null) {
                aVar2.mo11010a(zdeVar);
            }
            InterfaceC2072c interfaceC2072c = this.f8357h;
            if (interfaceC2072c != null) {
                aVar2.mo11011b(interfaceC2072c);
            }
            this.f8353d.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        @Nullable
        /* JADX INFO: renamed from: g */
        public final b7h0<InterfaceC1988i.a> m11024g(int i) {
            b7h0<InterfaceC1988i.a> b7h0Var;
            b7h0<InterfaceC1988i.a> b7h0Var2;
            if (this.f8351b.containsKey(Integer.valueOf(i))) {
                return this.f8351b.get(Integer.valueOf(i));
            }
            final g6c.InterfaceC17163a interfaceC17163a = (g6c.InterfaceC17163a) w11.m204369e(this.f8354e);
            b7h0<InterfaceC1988i.a> b7h0Var3 = null;
            try {
                if (i == 0) {
                    int i2 = DashMediaSource.Factory.f8394l;
                    final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(InterfaceC1988i.a.class);
                    b7h0Var = new b7h0() { // from class: l.iqd
                        @Override // p153l.b7h0
                        public final Object get() {
                            return C1960d.m11009k(clsAsSubclass, interfaceC17163a);
                        }
                    };
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                int i3 = RtspMediaSource.Factory.f8846h;
                                final Class clsAsSubclass2 = RtspMediaSource.Factory.class.asSubclass(InterfaceC1988i.a.class);
                                b7h0Var2 = new b7h0() { // from class: l.lqd
                                    @Override // p153l.b7h0
                                    public final Object get() {
                                        return C1960d.m11008j(clsAsSubclass2);
                                    }
                                };
                            } else if (i == 4) {
                                b7h0Var2 = new b7h0() { // from class: l.mqd
                                    @Override // p153l.b7h0
                                    public final Object get() {
                                        return C1960d.a.m11021d(this.f138040a, interfaceC17163a);
                                    }
                                };
                            }
                            b7h0Var3 = b7h0Var2;
                        } else {
                            int i4 = HlsMediaSource.Factory.f8522p;
                            final Class clsAsSubclass3 = HlsMediaSource.Factory.class.asSubclass(InterfaceC1988i.a.class);
                            b7h0Var = new b7h0() { // from class: l.kqd
                                @Override // p153l.b7h0
                                public final Object get() {
                                    return C1960d.m11009k(clsAsSubclass3, interfaceC17163a);
                                }
                            };
                        }
                        this.f8351b.put(Integer.valueOf(i), b7h0Var3);
                        if (b7h0Var3 != null) {
                            this.f8352c.add(Integer.valueOf(i));
                        }
                        return b7h0Var3;
                    }
                    int i5 = SsMediaSource.Factory.f9019k;
                    final Class clsAsSubclass4 = SsMediaSource.Factory.class.asSubclass(InterfaceC1988i.a.class);
                    b7h0Var = new b7h0() { // from class: l.jqd
                        @Override // p153l.b7h0
                        public final Object get() {
                            return C1960d.m11009k(clsAsSubclass4, interfaceC17163a);
                        }
                    };
                }
                b7h0Var3 = b7h0Var;
            } catch (ClassNotFoundException unused) {
            }
            this.f8351b.put(Integer.valueOf(i), b7h0Var3);
            if (b7h0Var3 != null) {
                this.f8352c.add(Integer.valueOf(i));
            }
            return b7h0Var3;
        }

        /* JADX INFO: renamed from: h */
        public void m11025h(zb5.InterfaceC21789a interfaceC21789a) {
            this.f8355f = interfaceC21789a;
            Iterator<InterfaceC1988i.a> it = this.f8353d.values().iterator();
            while (it.hasNext()) {
                it.next().mo11013d(interfaceC21789a);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m11026i(g6c.InterfaceC17163a interfaceC17163a) {
            if (interfaceC17163a != this.f8354e) {
                this.f8354e = interfaceC17163a;
                this.f8351b.clear();
                this.f8353d.clear();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m11027j(zde zdeVar) {
            this.f8356g = zdeVar;
            Iterator<InterfaceC1988i.a> it = this.f8353d.values().iterator();
            while (it.hasNext()) {
                it.next().mo11010a(zdeVar);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m11028k(InterfaceC2072c interfaceC2072c) {
            this.f8357h = interfaceC2072c;
            Iterator<InterfaceC1988i.a> it = this.f8353d.values().iterator();
            while (it.hasNext()) {
                it.next().mo11011b(interfaceC2072c);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$b */
    public static final class b implements zrf {

        /* JADX INFO: renamed from: a */
        public final C1894k f8358a;

        public b(C1894k c1894k) {
            this.f8358a = c1894k;
        }

        @Override // p153l.zrf
        /* JADX INFO: renamed from: a */
        public void mo11029a(long j, long j2) {
        }

        @Override // p153l.zrf
        /* JADX INFO: renamed from: b */
        public void mo11030b(bsf bsfVar) {
            qfj0 qfj0VarMo11416b = bsfVar.mo11416b(0, 3);
            bsfVar.mo11424k(new mke0.C18641b(-9223372036854775807L));
            bsfVar.mo11425l();
            qfj0VarMo11416b.mo11164b(this.f8358a.m10336b().m10400g0("text/x-unknown").m10378K(this.f8358a.f7785l).m10374G());
        }

        @Override // p153l.zrf
        /* JADX INFO: renamed from: f */
        public boolean mo11031f(asf asfVar) {
            return true;
        }

        @Override // p153l.zrf
        /* JADX INFO: renamed from: h */
        public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
            return asfVar.skip(Api.BaseClientBuilder.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // p153l.zrf
        public void release() {
        }
    }

    public C1960d(g6c.InterfaceC17163a interfaceC17163a, esf esfVar) {
        this.f8341d = interfaceC17163a;
        a aVar = new a(esfVar);
        this.f8340c = aVar;
        aVar.m11026i(interfaceC17163a);
        this.f8344g = -9223372036854775807L;
        this.f8345h = -9223372036854775807L;
        this.f8346i = -9223372036854775807L;
        this.f8347j = -3.4028235E38f;
        this.f8348k = -3.4028235E38f;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ zrf[] m11004e(C1894k c1894k) {
        pdg0 pdg0Var = pdg0.f151754a;
        return new zrf[]{pdg0Var.mo171812a(c1894k) ? new qdg0(pdg0Var.mo171813b(c1894k), c1894k) : new b(c1894k)};
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC1988i m11007h(C1944n c1944n, InterfaceC1988i interfaceC1988i) {
        C1944n.d dVar = c1944n.f8001f;
        if (dVar.f8030a == 0 && dVar.f8031b == Long.MIN_VALUE && !dVar.f8033d) {
            return interfaceC1988i;
        }
        long jM105084J0 = bmk0.m105084J0(c1944n.f8001f.f8030a);
        long jM105084J1 = bmk0.m105084J0(c1944n.f8001f.f8031b);
        C1944n.d dVar2 = c1944n.f8001f;
        return new ClippingMediaSource(interfaceC1988i, jM105084J0, jM105084J1, !dVar2.f8034e, dVar2.f8032c, dVar2.f8033d);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC1988i.a m11008j(Class<? extends InterfaceC1988i.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1988i.a m11009k(Class<? extends InterfaceC1988i.a> cls, g6c.InterfaceC17163a interfaceC17163a) {
        try {
            return cls.getConstructor(g6c.InterfaceC17163a.class).newInstance(interfaceC17163a);
        } catch (Exception e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
    /* JADX INFO: renamed from: c */
    public InterfaceC1988i mo11012c(C1944n c1944n) {
        w11.m204369e(c1944n.f7997b);
        String scheme = c1944n.f7997b.f8094a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC1988i.a) w11.m204369e(this.f8342e)).mo11012c(c1944n);
        }
        C1944n.h hVar = c1944n.f7997b;
        int iM105177x0 = bmk0.m105177x0(hVar.f8094a, hVar.f8095b);
        InterfaceC1988i.a aVarM11023f = this.f8340c.m11023f(iM105177x0);
        w11.m204374j(aVarM11023f, "No suitable media source factory found for content type: " + iM105177x0);
        C1944n.g.a aVarM10730b = c1944n.f7999d.m10730b();
        if (c1944n.f7999d.f8076a == -9223372036854775807L) {
            aVarM10730b.m10741k(this.f8344g);
        }
        if (c1944n.f7999d.f8079d == -3.4028235E38f) {
            aVarM10730b.m10740j(this.f8347j);
        }
        if (c1944n.f7999d.f8080e == -3.4028235E38f) {
            aVarM10730b.m10738h(this.f8348k);
        }
        if (c1944n.f7999d.f8077b == -9223372036854775807L) {
            aVarM10730b.m10739i(this.f8345h);
        }
        if (c1944n.f7999d.f8078c == -9223372036854775807L) {
            aVarM10730b.m10737g(this.f8346i);
        }
        C1944n.g gVarM10736f = aVarM10730b.m10736f();
        if (!gVarM10736f.equals(c1944n.f7999d)) {
            c1944n = c1944n.m10681b().m10688b(gVarM10736f).m10687a();
        }
        InterfaceC1988i interfaceC1988iMo11012c = aVarM11023f.mo11012c(c1944n);
        ImmutableList<C1944n.k> immutableList = ((C1944n.h) bmk0.m105144j(c1944n.f7997b)).f8100g;
        if (!immutableList.isEmpty()) {
            InterfaceC1988i[] interfaceC1988iArr = new InterfaceC1988i[immutableList.size() + 1];
            interfaceC1988iArr[0] = interfaceC1988iMo11012c;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.f8349l) {
                    final C1894k c1894kM10374G = new C1894k.b().m10400g0(immutableList.get(i).f8123b).m10391X(immutableList.get(i).f8124c).m10402i0(immutableList.get(i).f8125d).m10398e0(immutableList.get(i).f8126e).m10390W(immutableList.get(i).f8127f).m10388U(immutableList.get(i).f8128g).m10374G();
                    C1994o.b bVar = new C1994o.b(this.f8341d, new esf() { // from class: l.hqd
                        @Override // p153l.esf
                        /* JADX INFO: renamed from: b */
                        public final zrf[] mo96504b() {
                            return C1960d.m11004e(c1894kM10374G);
                        }
                    });
                    InterfaceC2072c interfaceC2072c = this.f8343f;
                    if (interfaceC2072c != null) {
                        bVar.mo11011b(interfaceC2072c);
                    }
                    interfaceC1988iArr[i + 1] = bVar.mo11012c(C1944n.m10679d(immutableList.get(i).f8122a.toString()));
                } else {
                    C2024t.b bVar2 = new C2024t.b(this.f8341d);
                    InterfaceC2072c interfaceC2072c2 = this.f8343f;
                    if (interfaceC2072c2 != null) {
                        bVar2.m11788b(interfaceC2072c2);
                    }
                    interfaceC1988iArr[i + 1] = bVar2.m11787a(immutableList.get(i), -9223372036854775807L);
                }
            }
            interfaceC1988iMo11012c = new MergingMediaSource(interfaceC1988iArr);
        }
        return m11014i(c1944n, m11007h(c1944n, interfaceC1988iMo11012c));
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC1988i m11014i(C1944n c1944n, InterfaceC1988i interfaceC1988i) {
        w11.m204369e(c1944n.f7997b);
        if (c1944n.f7997b.f8097d == null) {
            return interfaceC1988i;
        }
        kyv.m152151i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return interfaceC1988i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1960d mo11013d(zb5.InterfaceC21789a interfaceC21789a) {
        this.f8340c.m11025h((zb5.InterfaceC21789a) w11.m204369e(interfaceC21789a));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1960d mo11010a(zde zdeVar) {
        this.f8340c.m11027j((zde) w11.m204370f(zdeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1960d mo11011b(InterfaceC2072c interfaceC2072c) {
        this.f8343f = (InterfaceC2072c) w11.m204370f(interfaceC2072c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f8340c.m11028k(interfaceC2072c);
        return this;
    }

    public C1960d(g6c.InterfaceC17163a interfaceC17163a) {
        this(interfaceC17163a, new tod());
    }

    public C1960d(Context context, esf esfVar) {
        this(new vnd.C20866a(context), esfVar);
    }
}
