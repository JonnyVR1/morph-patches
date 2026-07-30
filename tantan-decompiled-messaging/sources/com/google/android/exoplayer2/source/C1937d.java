package com.google.android.exoplayer2.source;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.source.C1937d;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p149l.a5c;
import p149l.fd80;
import p149l.h5g0;
import p149l.hce0;
import p149l.i5g0;
import p149l.jwv;
import p149l.m6j0;
import p149l.ond;
import p149l.p11;
import p149l.phg0;
import p149l.qmd;
import p149l.sqf;
import p149l.tqf;
import p149l.tyg0;
import p149l.uqf;
import p149l.vce;
import p149l.vck0;
import p149l.xqf;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1937d implements InterfaceC1967k {

    /* JADX INFO: renamed from: c */
    public final a f8303c;

    /* JADX INFO: renamed from: d */
    public a5c.InterfaceC15531a f8304d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC1965i.a f8305e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public InterfaceC2049c f8306f;

    /* JADX INFO: renamed from: g */
    public long f8307g;

    /* JADX INFO: renamed from: h */
    public long f8308h;

    /* JADX INFO: renamed from: i */
    public long f8309i;

    /* JADX INFO: renamed from: j */
    public float f8310j;

    /* JADX INFO: renamed from: k */
    public float f8311k;

    /* JADX INFO: renamed from: l */
    public boolean f8312l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final xqf f8313a;

        /* JADX INFO: renamed from: b */
        public final Map<Integer, tyg0<InterfaceC1965i.a>> f8314b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Set<Integer> f8315c = new HashSet();

        /* JADX INFO: renamed from: d */
        public final Map<Integer, InterfaceC1965i.a> f8316d = new HashMap();

        /* JADX INFO: renamed from: e */
        public a5c.InterfaceC15531a f8317e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public za5.InterfaceC21651a f8318f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public vce f8319g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public InterfaceC2049c f8320h;

        public a(xqf xqfVar) {
            this.f8313a = xqfVar;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC1965i.a m10967d(a aVar, a5c.InterfaceC15531a interfaceC15531a) {
            aVar.getClass();
            return new C1971o.b(interfaceC15531a, aVar.f8313a);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public InterfaceC1965i.a m10969f(int i) {
            InterfaceC1965i.a aVar = this.f8316d.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            tyg0<InterfaceC1965i.a> tyg0VarM10970g = m10970g(i);
            if (tyg0VarM10970g == null) {
                return null;
            }
            InterfaceC1965i.a aVar2 = tyg0VarM10970g.get();
            za5.InterfaceC21651a interfaceC21651a = this.f8318f;
            if (interfaceC21651a != null) {
                aVar2.mo10959d(interfaceC21651a);
            }
            vce vceVar = this.f8319g;
            if (vceVar != null) {
                aVar2.mo10956a(vceVar);
            }
            InterfaceC2049c interfaceC2049c = this.f8320h;
            if (interfaceC2049c != null) {
                aVar2.mo10957b(interfaceC2049c);
            }
            this.f8316d.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        @Nullable
        /* JADX INFO: renamed from: g */
        public final tyg0<InterfaceC1965i.a> m10970g(int i) {
            tyg0<InterfaceC1965i.a> tyg0Var;
            tyg0<InterfaceC1965i.a> tyg0Var2;
            if (this.f8314b.containsKey(Integer.valueOf(i))) {
                return this.f8314b.get(Integer.valueOf(i));
            }
            final a5c.InterfaceC15531a interfaceC15531a = (a5c.InterfaceC15531a) p11.m167011e(this.f8317e);
            tyg0<InterfaceC1965i.a> tyg0Var3 = null;
            try {
                if (i == 0) {
                    int i2 = DashMediaSource.Factory.f8357l;
                    final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(InterfaceC1965i.a.class);
                    tyg0Var = new tyg0() { // from class: l.dpd
                        @Override // p149l.tyg0
                        public final Object get() {
                            return C1937d.m10955k(clsAsSubclass, interfaceC15531a);
                        }
                    };
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                int i3 = RtspMediaSource.Factory.f8809h;
                                final Class clsAsSubclass2 = RtspMediaSource.Factory.class.asSubclass(InterfaceC1965i.a.class);
                                tyg0Var2 = new tyg0() { // from class: l.gpd
                                    @Override // p149l.tyg0
                                    public final Object get() {
                                        return C1937d.m10954j(clsAsSubclass2);
                                    }
                                };
                            } else if (i == 4) {
                                tyg0Var2 = new tyg0() { // from class: l.hpd
                                    @Override // p149l.tyg0
                                    public final Object get() {
                                        return C1937d.a.m10967d(this.f108911a, interfaceC15531a);
                                    }
                                };
                            }
                            tyg0Var3 = tyg0Var2;
                        } else {
                            int i4 = HlsMediaSource.Factory.f8485p;
                            final Class clsAsSubclass3 = HlsMediaSource.Factory.class.asSubclass(InterfaceC1965i.a.class);
                            tyg0Var = new tyg0() { // from class: l.fpd
                                @Override // p149l.tyg0
                                public final Object get() {
                                    return C1937d.m10955k(clsAsSubclass3, interfaceC15531a);
                                }
                            };
                        }
                        this.f8314b.put(Integer.valueOf(i), tyg0Var3);
                        if (tyg0Var3 != null) {
                            this.f8315c.add(Integer.valueOf(i));
                        }
                        return tyg0Var3;
                    }
                    int i5 = SsMediaSource.Factory.f8982k;
                    final Class clsAsSubclass4 = SsMediaSource.Factory.class.asSubclass(InterfaceC1965i.a.class);
                    tyg0Var = new tyg0() { // from class: l.epd
                        @Override // p149l.tyg0
                        public final Object get() {
                            return C1937d.m10955k(clsAsSubclass4, interfaceC15531a);
                        }
                    };
                }
                tyg0Var3 = tyg0Var;
            } catch (ClassNotFoundException unused) {
            }
            this.f8314b.put(Integer.valueOf(i), tyg0Var3);
            if (tyg0Var3 != null) {
                this.f8315c.add(Integer.valueOf(i));
            }
            return tyg0Var3;
        }

        /* JADX INFO: renamed from: h */
        public void m10971h(za5.InterfaceC21651a interfaceC21651a) {
            this.f8318f = interfaceC21651a;
            Iterator<InterfaceC1965i.a> it = this.f8316d.values().iterator();
            while (it.hasNext()) {
                it.next().mo10959d(interfaceC21651a);
            }
        }

        /* JADX INFO: renamed from: i */
        public void m10972i(a5c.InterfaceC15531a interfaceC15531a) {
            if (interfaceC15531a != this.f8317e) {
                this.f8317e = interfaceC15531a;
                this.f8314b.clear();
                this.f8316d.clear();
            }
        }

        /* JADX INFO: renamed from: j */
        public void m10973j(vce vceVar) {
            this.f8319g = vceVar;
            Iterator<InterfaceC1965i.a> it = this.f8316d.values().iterator();
            while (it.hasNext()) {
                it.next().mo10956a(vceVar);
            }
        }

        /* JADX INFO: renamed from: k */
        public void m10974k(InterfaceC2049c interfaceC2049c) {
            this.f8320h = interfaceC2049c;
            Iterator<InterfaceC1965i.a> it = this.f8316d.values().iterator();
            while (it.hasNext()) {
                it.next().mo10957b(interfaceC2049c);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$b */
    public static final class b implements sqf {

        /* JADX INFO: renamed from: a */
        public final C1871k f8321a;

        public b(C1871k c1871k) {
            this.f8321a = c1871k;
        }

        @Override // p149l.sqf
        /* JADX INFO: renamed from: a */
        public void mo10975a(long j, long j2) {
        }

        @Override // p149l.sqf
        /* JADX INFO: renamed from: b */
        public void mo10976b(uqf uqfVar) {
            m6j0 m6j0VarMo11362b = uqfVar.mo11362b(0, 3);
            uqfVar.mo11370k(new hce0.C17275b(-9223372036854775807L));
            uqfVar.mo11371l();
            m6j0VarMo11362b.mo11110b(this.f8321a.m10282b().m10346g0("text/x-unknown").m10324K(this.f8321a.f7748l).m10320G());
        }

        @Override // p149l.sqf
        /* JADX INFO: renamed from: f */
        public boolean mo10977f(tqf tqfVar) {
            return true;
        }

        @Override // p149l.sqf
        /* JADX INFO: renamed from: h */
        public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
            return tqfVar.skip(Api.BaseClientBuilder.API_PRIORITY_OTHER) == -1 ? -1 : 0;
        }

        @Override // p149l.sqf
        public void release() {
        }
    }

    public C1937d(a5c.InterfaceC15531a interfaceC15531a, xqf xqfVar) {
        this.f8304d = interfaceC15531a;
        a aVar = new a(xqfVar);
        this.f8303c = aVar;
        aVar.m10972i(interfaceC15531a);
        this.f8307g = -9223372036854775807L;
        this.f8308h = -9223372036854775807L;
        this.f8309i = -9223372036854775807L;
        this.f8310j = -3.4028235E38f;
        this.f8311k = -3.4028235E38f;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ sqf[] m10950e(C1871k c1871k) {
        h5g0 h5g0Var = h5g0.f105947a;
        return new sqf[]{h5g0Var.mo129398a(c1871k) ? new i5g0(h5g0Var.mo129399b(c1871k), c1871k) : new b(c1871k)};
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC1965i m10953h(C1921n c1921n, InterfaceC1965i interfaceC1965i) {
        C1921n.d dVar = c1921n.f7964f;
        if (dVar.f7993a == 0 && dVar.f7994b == Long.MIN_VALUE && !dVar.f7996d) {
            return interfaceC1965i;
        }
        long jM197806J0 = vck0.m197806J0(c1921n.f7964f.f7993a);
        long jM197806J1 = vck0.m197806J0(c1921n.f7964f.f7994b);
        C1921n.d dVar2 = c1921n.f7964f;
        return new ClippingMediaSource(interfaceC1965i, jM197806J0, jM197806J1, !dVar2.f7997e, dVar2.f7995c, dVar2.f7996d);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC1965i.a m10954j(Class<? extends InterfaceC1965i.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            phg0.m168968a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1965i.a m10955k(Class<? extends InterfaceC1965i.a> cls, a5c.InterfaceC15531a interfaceC15531a) {
        try {
            return cls.getConstructor(a5c.InterfaceC15531a.class).newInstance(interfaceC15531a);
        } catch (Exception e) {
            phg0.m168968a(e);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
    /* JADX INFO: renamed from: c */
    public InterfaceC1965i mo10958c(C1921n c1921n) {
        p11.m167011e(c1921n.f7960b);
        String scheme = c1921n.f7960b.f8057a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC1965i.a) p11.m167011e(this.f8305e)).mo10958c(c1921n);
        }
        C1921n.h hVar = c1921n.f7960b;
        int iM197899x0 = vck0.m197899x0(hVar.f8057a, hVar.f8058b);
        InterfaceC1965i.a aVarM10969f = this.f8303c.m10969f(iM197899x0);
        p11.m167016j(aVarM10969f, "No suitable media source factory found for content type: " + iM197899x0);
        C1921n.g.a aVarM10676b = c1921n.f7962d.m10676b();
        if (c1921n.f7962d.f8039a == -9223372036854775807L) {
            aVarM10676b.m10687k(this.f8307g);
        }
        if (c1921n.f7962d.f8042d == -3.4028235E38f) {
            aVarM10676b.m10686j(this.f8310j);
        }
        if (c1921n.f7962d.f8043e == -3.4028235E38f) {
            aVarM10676b.m10684h(this.f8311k);
        }
        if (c1921n.f7962d.f8040b == -9223372036854775807L) {
            aVarM10676b.m10685i(this.f8308h);
        }
        if (c1921n.f7962d.f8041c == -9223372036854775807L) {
            aVarM10676b.m10683g(this.f8309i);
        }
        C1921n.g gVarM10682f = aVarM10676b.m10682f();
        if (!gVarM10682f.equals(c1921n.f7962d)) {
            c1921n = c1921n.m10627b().m10634b(gVarM10682f).m10633a();
        }
        InterfaceC1965i interfaceC1965iMo10958c = aVarM10969f.mo10958c(c1921n);
        ImmutableList<C1921n.k> immutableList = ((C1921n.h) vck0.m197866j(c1921n.f7960b)).f8063g;
        if (!immutableList.isEmpty()) {
            InterfaceC1965i[] interfaceC1965iArr = new InterfaceC1965i[immutableList.size() + 1];
            interfaceC1965iArr[0] = interfaceC1965iMo10958c;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.f8312l) {
                    final C1871k c1871kM10320G = new C1871k.b().m10346g0(immutableList.get(i).f8086b).m10337X(immutableList.get(i).f8087c).m10348i0(immutableList.get(i).f8088d).m10344e0(immutableList.get(i).f8089e).m10336W(immutableList.get(i).f8090f).m10334U(immutableList.get(i).f8091g).m10320G();
                    C1971o.b bVar = new C1971o.b(this.f8304d, new xqf() { // from class: l.cpd
                        @Override // p149l.xqf
                        /* JADX INFO: renamed from: b */
                        public final sqf[] mo95334b() {
                            return C1937d.m10950e(c1871kM10320G);
                        }
                    });
                    InterfaceC2049c interfaceC2049c = this.f8306f;
                    if (interfaceC2049c != null) {
                        bVar.mo10957b(interfaceC2049c);
                    }
                    interfaceC1965iArr[i + 1] = bVar.mo10958c(C1921n.m10625d(immutableList.get(i).f8085a.toString()));
                } else {
                    C2001t.b bVar2 = new C2001t.b(this.f8304d);
                    InterfaceC2049c interfaceC2049c2 = this.f8306f;
                    if (interfaceC2049c2 != null) {
                        bVar2.m11734b(interfaceC2049c2);
                    }
                    interfaceC1965iArr[i + 1] = bVar2.m11733a(immutableList.get(i), -9223372036854775807L);
                }
            }
            interfaceC1965iMo10958c = new MergingMediaSource(interfaceC1965iArr);
        }
        return m10960i(c1921n, m10953h(c1921n, interfaceC1965iMo10958c));
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC1965i m10960i(C1921n c1921n, InterfaceC1965i interfaceC1965i) {
        p11.m167011e(c1921n.f7960b);
        if (c1921n.f7960b.f8060d == null) {
            return interfaceC1965i;
        }
        jwv.m143689i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return interfaceC1965i;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1937d mo10959d(za5.InterfaceC21651a interfaceC21651a) {
        this.f8303c.m10971h((za5.InterfaceC21651a) p11.m167011e(interfaceC21651a));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1937d mo10956a(vce vceVar) {
        this.f8303c.m10973j((vce) p11.m167012f(vceVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1937d mo10957b(InterfaceC2049c interfaceC2049c) {
        this.f8306f = (InterfaceC2049c) p11.m167012f(interfaceC2049c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f8303c.m10974k(interfaceC2049c);
        return this;
    }

    public C1937d(a5c.InterfaceC15531a interfaceC15531a) {
        this(interfaceC15531a, new ond());
    }

    public C1937d(Context context, xqf xqfVar) {
        this(new qmd.C19539a(context), xqfVar);
    }
}
