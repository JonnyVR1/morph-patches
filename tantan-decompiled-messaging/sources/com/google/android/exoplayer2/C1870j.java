package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1870j;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.C1889a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.aag0;
import p149l.b6j0;
import p149l.cvk;
import p149l.eji0;
import p149l.erc0;
import p149l.fd2;
import p149l.g0f0;
import p149l.hk0;
import p149l.hpx;
import p149l.ice0;
import p149l.j5j0;
import p149l.jpx;
import p149l.jwv;
import p149l.krv;
import p149l.o8f;
import p149l.p11;
import p149l.p95;
import p149l.qkq0;
import p149l.tyg0;
import p149l.v680;
import p149l.vck0;
import p149l.vod0;
import p149l.y6j0;
import p149l.z580;
import p149l.z6j0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1870j implements Handler.Callback, InterfaceC1953h.a, y6j0.InterfaceC21314a, C1928q.d, C1867g.a, C2004u.a {

    /* JADX INFO: renamed from: A */
    public boolean f7623A;

    /* JADX INFO: renamed from: B */
    public boolean f7624B;

    /* JADX INFO: renamed from: C */
    public boolean f7625C;

    /* JADX INFO: renamed from: D */
    public boolean f7626D;

    /* JADX INFO: renamed from: E */
    public int f7627E;

    /* JADX INFO: renamed from: F */
    public boolean f7628F;

    /* JADX INFO: renamed from: G */
    public boolean f7629G;

    /* JADX INFO: renamed from: H */
    public boolean f7630H;

    /* JADX INFO: renamed from: I */
    public boolean f7631I;

    /* JADX INFO: renamed from: J */
    public int f7632J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public h f7633K;

    /* JADX INFO: renamed from: L */
    public long f7634L;

    /* JADX INFO: renamed from: M */
    public int f7635M;

    /* JADX INFO: renamed from: N */
    public boolean f7636N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public ExoPlaybackException f7637O;

    /* JADX INFO: renamed from: P */
    public long f7638P;

    /* JADX INFO: renamed from: Q */
    public long f7639Q = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2066x[] f7640a;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC2066x> f7641b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2067y[] f7642c;

    /* JADX INFO: renamed from: d */
    public final y6j0 f7643d;

    /* JADX INFO: renamed from: e */
    public final z6j0 f7644e;

    /* JADX INFO: renamed from: f */
    public final krv f7645f;

    /* JADX INFO: renamed from: g */
    public final fd2 f7646g;

    /* JADX INFO: renamed from: h */
    public final cvk f7647h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final HandlerThread f7648i;

    /* JADX INFO: renamed from: j */
    public final Looper f7649j;

    /* JADX INFO: renamed from: k */
    public final AbstractC1834c0.d f7650k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1834c0.b f7651l;

    /* JADX INFO: renamed from: m */
    public final long f7652m;

    /* JADX INFO: renamed from: n */
    public final boolean f7653n;

    /* JADX INFO: renamed from: o */
    public final C1867g f7654o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<d> f7655p;

    /* JADX INFO: renamed from: q */
    public final p95 f7656q;

    /* JADX INFO: renamed from: r */
    public final f f7657r;

    /* JADX INFO: renamed from: s */
    public final C1927p f7658s;

    /* JADX INFO: renamed from: t */
    public final C1928q f7659t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC1873m f7660u;

    /* JADX INFO: renamed from: v */
    public final long f7661v;

    /* JADX INFO: renamed from: w */
    public ice0 f7662w;

    /* JADX INFO: renamed from: x */
    public z580 f7663x;

    /* JADX INFO: renamed from: y */
    public e f7664y;

    /* JADX INFO: renamed from: z */
    public boolean f7665z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$a */
    public class a implements InterfaceC2066x.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2066x.a
        /* JADX INFO: renamed from: a */
        public void mo10263a() {
            C1870j.this.f7630H = true;
        }

        @Override // com.google.android.exoplayer2.InterfaceC2066x.a
        /* JADX INFO: renamed from: b */
        public void mo10264b() {
            C1870j.this.f7647h.mo108874j(2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f7671a;

        /* JADX INFO: renamed from: b */
        public final int f7672b;

        /* JADX INFO: renamed from: c */
        public final int f7673c;

        /* JADX INFO: renamed from: d */
        public final g0f0 f7674d;

        public c(int i, int i2, int i3, g0f0 g0f0Var) {
            this.f7671a = i;
            this.f7672b = i2;
            this.f7673c = i3;
            this.f7674d = g0f0Var;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$d */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a */
        public final C2004u f7675a;

        /* JADX INFO: renamed from: b */
        public int f7676b;

        /* JADX INFO: renamed from: c */
        public long f7677c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f7678d;

        public d(C2004u c2004u) {
            this.f7675a = c2004u;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f7678d;
            if ((obj == null) != (dVar.f7678d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f7676b - dVar.f7676b;
            return i != 0 ? i : vck0.m197880o(this.f7677c, dVar.f7677c);
        }

        /* JADX INFO: renamed from: b */
        public void m10270b(int i, long j, Object obj) {
            this.f7676b = i;
            this.f7677c = j;
            this.f7678d = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public boolean f7679a;

        /* JADX INFO: renamed from: b */
        public z580 f7680b;

        /* JADX INFO: renamed from: c */
        public int f7681c;

        /* JADX INFO: renamed from: d */
        public boolean f7682d;

        /* JADX INFO: renamed from: e */
        public int f7683e;

        /* JADX INFO: renamed from: f */
        public boolean f7684f;

        /* JADX INFO: renamed from: g */
        public int f7685g;

        public e(z580 z580Var) {
            this.f7680b = z580Var;
        }

        /* JADX INFO: renamed from: b */
        public void m10272b(int i) {
            this.f7679a |= i > 0;
            this.f7681c += i;
        }

        /* JADX INFO: renamed from: c */
        public void m10273c(int i) {
            this.f7679a = true;
            this.f7684f = true;
            this.f7685g = i;
        }

        /* JADX INFO: renamed from: d */
        public void m10274d(z580 z580Var) {
            this.f7679a |= this.f7680b != z580Var;
            this.f7680b = z580Var;
        }

        /* JADX INFO: renamed from: e */
        public void m10275e(int i) {
            if (this.f7682d && this.f7683e != 5) {
                p11.m167007a(i == 5);
                return;
            }
            this.f7679a = true;
            this.f7682d = true;
            this.f7683e = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo10276a(e eVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1965i.b f7686a;

        /* JADX INFO: renamed from: b */
        public final long f7687b;

        /* JADX INFO: renamed from: c */
        public final long f7688c;

        /* JADX INFO: renamed from: d */
        public final boolean f7689d;

        /* JADX INFO: renamed from: e */
        public final boolean f7690e;

        /* JADX INFO: renamed from: f */
        public final boolean f7691f;

        public g(InterfaceC1965i.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7686a = bVar;
            this.f7687b = j;
            this.f7688c = j2;
            this.f7689d = z;
            this.f7690e = z2;
            this.f7691f = z3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final AbstractC1834c0 f7692a;

        /* JADX INFO: renamed from: b */
        public final int f7693b;

        /* JADX INFO: renamed from: c */
        public final long f7694c;

        public h(AbstractC1834c0 abstractC1834c0, int i, long j) {
            this.f7692a = abstractC1834c0;
            this.f7693b = i;
            this.f7694c = j;
        }
    }

    public C1870j(InterfaceC2066x[] interfaceC2066xArr, y6j0 y6j0Var, z6j0 z6j0Var, krv krvVar, fd2 fd2Var, int i, boolean z, hk0 hk0Var, ice0 ice0Var, InterfaceC1873m interfaceC1873m, long j, boolean z2, Looper looper, p95 p95Var, f fVar, v680 v680Var, Looper looper2) {
        this.f7657r = fVar;
        this.f7640a = interfaceC2066xArr;
        this.f7643d = y6j0Var;
        this.f7644e = z6j0Var;
        this.f7645f = krvVar;
        this.f7646g = fd2Var;
        this.f7627E = i;
        this.f7628F = z;
        this.f7662w = ice0Var;
        this.f7660u = interfaceC1873m;
        this.f7661v = j;
        this.f7638P = j;
        this.f7623A = z2;
        this.f7656q = p95Var;
        this.f7652m = krvVar.mo147023g();
        this.f7653n = krvVar.mo147018b();
        z580 z580VarM217275k = z580.m217275k(z6j0Var);
        this.f7663x = z580VarM217275k;
        this.f7664y = new e(z580VarM217275k);
        this.f7642c = new InterfaceC2067y[interfaceC2066xArr.length];
        InterfaceC2067y.a aVarMo151246d = y6j0Var.mo151246d();
        for (int i2 = 0; i2 < interfaceC2066xArr.length; i2++) {
            interfaceC2066xArr[i2].mo9784x(i2, v680Var);
            this.f7642c[i2] = interfaceC2066xArr[i2].mo9785y();
            if (aVarMo151246d != null) {
                this.f7642c[i2].mo9779n(aVarMo151246d);
            }
        }
        this.f7654o = new C1867g(this, p95Var);
        this.f7655p = new ArrayList<>();
        this.f7641b = Sets.m16123h();
        this.f7650k = new AbstractC1834c0.d();
        this.f7651l = new AbstractC1834c0.b();
        y6j0Var.m213146e(this, fd2Var);
        this.f7636N = true;
        cvk cvkVarMo167857c = p95Var.mo167857c(looper, null);
        this.f7658s = new C1927p(hk0Var, cvkVarMo167857c);
        this.f7659t = new C1928q(this, hk0Var, cvkVarMo167857c, v680Var);
        if (looper2 != null) {
            this.f7648i = null;
            this.f7649j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f7648i = handlerThread;
            handlerThread.start();
            this.f7649j = handlerThread.getLooper();
        }
        this.f7647h = p95Var.mo167857c(this.f7649j, this);
    }

    /* JADX INFO: renamed from: B */
    public static C1871k[] m10136B(o8f o8fVar) {
        int length = o8fVar != null ? o8fVar.length() : 0;
        C1871k[] c1871kArr = new C1871k[length];
        for (int i = 0; i < length; i++) {
            c1871kArr[i] = o8fVar.mo11312m(i);
        }
        return c1871kArr;
    }

    /* JADX INFO: renamed from: B0 */
    public static g m10137B0(AbstractC1834c0 abstractC1834c0, z580 z580Var, @Nullable h hVar, C1927p c1927p, int i, boolean z, AbstractC1834c0.d dVar, AbstractC1834c0.b bVar) {
        int iMo9395e;
        boolean z2;
        boolean z3;
        boolean z4;
        int iMo9395e2;
        boolean z5;
        AbstractC1834c0 abstractC1834c1;
        AbstractC1834c0.b bVar2;
        long j;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        if (abstractC1834c0.m9722u()) {
            return new g(z580.m217276l(), 0L, -9223372036854775807L, false, true, false);
        }
        InterfaceC1965i.b bVar3 = z580Var.f201767b;
        Object obj = bVar3.f114355a;
        boolean zM10142W = m10142W(z580Var, bVar);
        long jLongValue = (z580Var.f201767b.m137607b() || zM10142W) ? z580Var.f201768c : z580Var.f201783r;
        long j2 = -9223372036854775807L;
        boolean z9 = false;
        if (hVar != null) {
            Pair<Object, Long> pairM10138C0 = m10138C0(abstractC1834c0, hVar, true, i, z, dVar, bVar);
            if (pairM10138C0 == null) {
                iMo9395e = abstractC1834c0.mo9395e(z);
                jLongValue = jLongValue;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                long j3 = hVar.f7694c;
                Object obj2 = pairM10138C0.first;
                if (j3 == -9223372036854775807L) {
                    iMo9395e = abstractC1834c0.mo9400l(obj2, bVar).f7302c;
                    jLongValue = jLongValue;
                    z6 = false;
                } else {
                    jLongValue = ((Long) pairM10138C0.second).longValue();
                    obj = obj2;
                    iMo9395e = -1;
                    z6 = true;
                }
                z7 = z580Var.f201770e == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
        } else {
            j2 = -9223372036854775807L;
            if (z580Var.f201766a.m9722u()) {
                iMo9395e = abstractC1834c0.mo9395e(z);
            } else if (abstractC1834c0.mo9396f(obj) == -1) {
                Object objM10139D0 = m10139D0(dVar, bVar, i, z, obj, z580Var.f201766a, abstractC1834c0);
                if (objM10139D0 == null) {
                    iMo9395e2 = abstractC1834c0.mo9395e(z);
                    z5 = true;
                } else {
                    iMo9395e2 = abstractC1834c0.mo9400l(objM10139D0, bVar).f7302c;
                    z5 = false;
                }
                iMo9395e = iMo9395e2;
                obj = obj;
                jLongValue = jLongValue;
                z3 = z5;
                z2 = false;
                z4 = false;
            } else if (jLongValue == -9223372036854775807L) {
                iMo9395e = abstractC1834c0.mo9400l(obj, bVar).f7302c;
                obj = obj;
            } else if (zM10142W) {
                z580Var.f201766a.mo9400l(bVar3.f114355a, bVar);
                if (z580Var.f201766a.m9720r(bVar.f7302c, dVar).f7342o == z580Var.f201766a.mo9396f(bVar3.f114355a)) {
                    Pair<Object, Long> pairM9718n = abstractC1834c0.m9718n(dVar, bVar, abstractC1834c0.mo9400l(obj, bVar).f7302c, bVar.m9740q() + jLongValue);
                    obj = pairM9718n.first;
                    jLongValue = ((Long) pairM9718n.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jLongValue;
                }
                iMo9395e = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                obj = obj;
                iMo9395e = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (iMo9395e != -1) {
            abstractC1834c1 = abstractC1834c0;
            Pair<Object, Long> pairM9718n2 = abstractC1834c1.m9718n(dVar, bVar, iMo9395e, -9223372036854775807L);
            bVar2 = bVar;
            obj = pairM9718n2.first;
            jLongValue = ((Long) pairM9718n2.second).longValue();
            j = j2;
        } else {
            abstractC1834c1 = abstractC1834c0;
            bVar2 = bVar;
            j = jLongValue;
        }
        InterfaceC1965i.b bVarM10813E = c1927p.m10813E(abstractC1834c1, obj, jLongValue);
        int i3 = bVarM10813E.f114359e;
        boolean z10 = i3 == -1 || ((i2 = bVar3.f114359e) != -1 && i3 >= i2);
        if (bVar3.f114355a.equals(obj) && !bVar3.m137607b() && !bVarM10813E.m137607b() && z10) {
            z9 = true;
        }
        InterfaceC1965i.b bVar4 = bVarM10813E;
        boolean zM10140S = m10140S(zM10142W, bVar3, jLongValue, bVar4, abstractC1834c1.mo9400l(obj, bVar2), j);
        if (z9 || zM10140S) {
            bVar4 = bVar3;
        }
        if (bVar4.m137607b()) {
            if (bVar4.equals(bVar3)) {
                jLongValue = z580Var.f201783r;
            } else {
                abstractC1834c1.mo9400l(bVar4.f114355a, bVar2);
                jLongValue = bVar4.f114357c == bVar2.m9737n(bVar4.f114356b) ? bVar2.m9733j() : 0L;
            }
        }
        return new g(bVar4, jLongValue, j, z2, z3, z4);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public static Pair<Object, Long> m10138C0(AbstractC1834c0 abstractC1834c0, h hVar, boolean z, int i, boolean z2, AbstractC1834c0.d dVar, AbstractC1834c0.b bVar) {
        AbstractC1834c0 abstractC1834c1;
        Object objM10139D0;
        AbstractC1834c0 abstractC1834c2 = hVar.f7692a;
        if (abstractC1834c0.m9722u()) {
            return null;
        }
        if (abstractC1834c2.m9722u()) {
            abstractC1834c1 = abstractC1834c2;
            abstractC1834c1 = abstractC1834c0;
        }
        try {
            abstractC1834c1 = abstractC1834c2;
            Pair<Object, Long> pairM9718n = abstractC1834c1.m9718n(dVar, bVar, hVar.f7693b, hVar.f7694c);
            AbstractC1834c0 abstractC1834c3 = abstractC1834c1;
            if (abstractC1834c0.equals(abstractC1834c3)) {
                return pairM9718n;
            }
            if (abstractC1834c0.mo9396f(pairM9718n.first) != -1) {
                return (abstractC1834c3.mo9400l(pairM9718n.first, bVar).f7305f && abstractC1834c3.m9720r(bVar.f7302c, dVar).f7342o == abstractC1834c3.mo9396f(pairM9718n.first)) ? abstractC1834c0.m9718n(dVar, bVar, abstractC1834c0.mo9400l(pairM9718n.first, bVar).f7302c, hVar.f7694c) : pairM9718n;
            }
            if (z && (objM10139D0 = m10139D0(dVar, bVar, i, z2, pairM9718n.first, abstractC1834c3, abstractC1834c0)) != null) {
                return abstractC1834c0.m9718n(dVar, bVar, abstractC1834c0.mo9400l(objM10139D0, bVar).f7302c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: D0 */
    public static Object m10139D0(AbstractC1834c0.d dVar, AbstractC1834c0.b bVar, int i, boolean z, Object obj, AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1) {
        int iMo9396f = abstractC1834c0.mo9396f(obj);
        int iMo9717m = abstractC1834c0.mo9717m();
        int i2 = 0;
        int iM9715h = iMo9396f;
        int iMo9396f2 = -1;
        while (i2 < iMo9717m && iMo9396f2 == -1) {
            AbstractC1834c0.d dVar2 = dVar;
            AbstractC1834c0.b bVar2 = bVar;
            int i3 = i;
            boolean z2 = z;
            AbstractC1834c0 abstractC1834c2 = abstractC1834c0;
            iM9715h = abstractC1834c2.m9715h(iM9715h, bVar2, dVar2, i3, z2);
            if (iM9715h == -1) {
                break;
            }
            iMo9396f2 = abstractC1834c1.mo9396f(abstractC1834c2.mo9402q(iM9715h));
            i2++;
            abstractC1834c0 = abstractC1834c2;
            bVar = bVar2;
            dVar = dVar2;
            i = i3;
            z = z2;
        }
        if (iMo9396f2 == -1) {
            return null;
        }
        return abstractC1834c1.mo9402q(iMo9396f2);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m10140S(boolean z, InterfaceC1965i.b bVar, long j, InterfaceC1965i.b bVar2, AbstractC1834c0.b bVar3, long j2) {
        if (!z && j == j2 && bVar.f114355a.equals(bVar2.f114355a)) {
            if (bVar.m137607b() && bVar3.m9744u(bVar.f114356b)) {
                return (bVar3.m9734k(bVar.f114356b, bVar.f114357c) == 4 || bVar3.m9734k(bVar.f114356b, bVar.f114357c) == 2) ? false : true;
            }
            if (bVar2.m137607b() && bVar3.m9744u(bVar2.f114356b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m10141U(InterfaceC2066x interfaceC2066x) {
        return interfaceC2066x.getState() != 0;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m10142W(z580 z580Var, AbstractC1834c0.b bVar) {
        InterfaceC1965i.b bVar2 = z580Var.f201767b;
        AbstractC1834c0 abstractC1834c0 = z580Var.f201766a;
        return abstractC1834c0.m9722u() || abstractC1834c0.mo9400l(bVar2.f114355a, bVar).f7305f;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10144g(C1870j c1870j, C2004u c2004u) {
        c1870j.getClass();
        try {
            c1870j.m10233p(c2004u);
        } catch (ExoPlaybackException e2) {
            jwv.m143684d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            aag0.m95543a(e2);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m10147y0(AbstractC1834c0 abstractC1834c0, d dVar, AbstractC1834c0.d dVar2, AbstractC1834c0.b bVar) {
        int i = abstractC1834c0.m9720r(abstractC1834c0.mo9400l(dVar.f7678d, bVar).f7302c, dVar2).f7343p;
        Object obj = abstractC1834c0.mo9399k(i, bVar, true).f7301b;
        long j = bVar.f7303d;
        dVar.m10270b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m10148z0(d dVar, AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1, int i, boolean z, AbstractC1834c0.d dVar2, AbstractC1834c0.b bVar) {
        Object obj = dVar.f7678d;
        if (obj == null) {
            Pair<Object, Long> pairM10138C0 = m10138C0(abstractC1834c0, new h(dVar.f7675a.m11797h(), dVar.f7675a.m11793d(), dVar.f7675a.m11795f() == Long.MIN_VALUE ? -9223372036854775807L : vck0.m197806J0(dVar.f7675a.m11795f())), false, i, z, dVar2, bVar);
            if (pairM10138C0 == null) {
                return false;
            }
            dVar.m10270b(abstractC1834c0.mo9396f(pairM10138C0.first), ((Long) pairM10138C0.second).longValue(), pairM10138C0.first);
            if (dVar.f7675a.m11795f() == Long.MIN_VALUE) {
                m10147y0(abstractC1834c0, dVar, dVar2, bVar);
            }
            return true;
        }
        int iMo9396f = abstractC1834c0.mo9396f(obj);
        if (iMo9396f == -1) {
            return false;
        }
        if (dVar.f7675a.m11795f() == Long.MIN_VALUE) {
            m10147y0(abstractC1834c0, dVar, dVar2, bVar);
            return true;
        }
        dVar.f7676b = iMo9396f;
        abstractC1834c1.mo9400l(dVar.f7678d, bVar);
        if (bVar.f7305f && abstractC1834c1.m9720r(bVar.f7302c, dVar2).f7342o == abstractC1834c1.mo9396f(dVar.f7678d)) {
            Pair<Object, Long> pairM9718n = abstractC1834c0.m9718n(dVar2, bVar, abstractC1834c0.mo9400l(dVar.f7678d, bVar).f7302c, dVar.f7677c + bVar.m9740q());
            dVar.m10270b(abstractC1834c0.mo9396f(pairM9718n.first), ((Long) pairM9718n.second).longValue(), pairM9718n.first);
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final long m10149A() {
        z580 z580Var = this.f7663x;
        return m10151C(z580Var.f201766a, z580Var.f201767b.f114355a, z580Var.f201783r);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m10150A0(AbstractC1834c0 abstractC1834c0, AbstractC1834c0 abstractC1834c1) {
        if (abstractC1834c0.m9722u() && abstractC1834c1.m9722u()) {
            return;
        }
        int size = this.f7655p.size() - 1;
        while (true) {
            ArrayList<d> arrayList = this.f7655p;
            if (size < 0) {
                Collections.sort(arrayList);
                return;
            }
            AbstractC1834c0 abstractC1834c2 = abstractC1834c0;
            AbstractC1834c0 abstractC1834c3 = abstractC1834c1;
            if (!m10148z0(arrayList.get(size), abstractC1834c2, abstractC1834c3, this.f7627E, this.f7628F, this.f7650k, this.f7651l)) {
                this.f7655p.get(size).f7675a.m11800k(false);
                this.f7655p.remove(size);
            }
            size--;
            abstractC1834c0 = abstractC1834c2;
            abstractC1834c1 = abstractC1834c3;
        }
    }

    /* JADX INFO: renamed from: C */
    public final long m10151C(AbstractC1834c0 abstractC1834c0, Object obj, long j) {
        abstractC1834c0.m9720r(abstractC1834c0.mo9400l(obj, this.f7651l).f7302c, this.f7650k);
        AbstractC1834c0.d dVar = this.f7650k;
        if (dVar.f7333f != -9223372036854775807L && dVar.m9754h()) {
            AbstractC1834c0.d dVar2 = this.f7650k;
            if (dVar2.f7336i) {
                return vck0.m197806J0(dVar2.m9749c() - this.f7650k.f7333f) - (j + this.f7651l.m9740q());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: D */
    public final long m10152D() {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        if (hpxVarM10837s == null) {
            return 0L;
        }
        long jM132404l = hpxVarM10837s.m132404l();
        if (!hpxVarM10837s.f108975d) {
            return jM132404l;
        }
        int i = 0;
        while (true) {
            InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
            if (i >= interfaceC2066xArr.length) {
                return jM132404l;
            }
            if (m10141U(interfaceC2066xArr[i]) && this.f7640a[i].getStream() == hpxVarM10837s.f108974c[i]) {
                long jMo9777k = this.f7640a[i].mo9777k();
                if (jMo9777k == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM132404l = Math.max(jMo9777k, jM132404l);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final Pair<InterfaceC1965i.b, Long> m10153E(AbstractC1834c0 abstractC1834c0) {
        if (abstractC1834c0.m9722u()) {
            return Pair.create(z580.m217276l(), 0L);
        }
        Pair<Object, Long> pairM9718n = abstractC1834c0.m9718n(this.f7650k, this.f7651l, abstractC1834c0.mo9395e(this.f7628F), -9223372036854775807L);
        InterfaceC1965i.b bVarM10813E = this.f7658s.m10813E(abstractC1834c0, pairM9718n.first, 0L);
        long jLongValue = ((Long) pairM9718n.second).longValue();
        if (bVarM10813E.m137607b()) {
            abstractC1834c0.mo9400l(bVarM10813E.f114355a, this.f7651l);
            jLongValue = bVarM10813E.f114357c == this.f7651l.m9737n(bVarM10813E.f114356b) ? this.f7651l.m9733j() : 0L;
        }
        return Pair.create(bVarM10813E, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m10154E0(long j, long j2) {
        this.f7647h.mo108875k(2, j + j2);
    }

    /* JADX INFO: renamed from: F */
    public Looper m10155F() {
        return this.f7649j;
    }

    /* JADX INFO: renamed from: F0 */
    public void m10156F0(AbstractC1834c0 abstractC1834c0, int i, long j) {
        this.f7647h.mo108868d(3, new h(abstractC1834c0, i, j)).mo108877a();
    }

    /* JADX INFO: renamed from: G */
    public final long m10157G() {
        return m10159H(this.f7663x.f201781p);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10158G0(boolean z) throws ExoPlaybackException {
        InterfaceC1965i.b bVar = this.f7658s.m10836r().f108977f.f119232a;
        long jM10164J0 = m10164J0(bVar, this.f7663x.f201783r, true, false);
        if (jM10164J0 != this.f7663x.f201783r) {
            z580 z580Var = this.f7663x;
            this.f7663x = m10175P(bVar, jM10164J0, z580Var.f201768c, z580Var.f201769d, z, 5);
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m10159H(long j) {
        hpx hpxVarM10830l = this.f7658s.m10830l();
        if (hpxVarM10830l == null) {
            return 0L;
        }
        return Math.max(0L, j - hpxVarM10830l.m132416y(this.f7634L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:40:0x00ce, B:44:0x00d6), top: B:95:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:40:0x00ce, B:44:0x00d6), top: B:95:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:40:0x00ce, B:44:0x00d6), top: B:95:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #4 {all -> 0x010a, blocks: (B:22:0x0097, B:36:0x00be, B:38:0x00c6, B:47:0x00e0, B:49:0x00f0, B:55:0x00fd), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #4 {all -> 0x010a, blocks: (B:22:0x0097, B:36:0x00be, B:38:0x00c6, B:47:0x00e0, B:49:0x00f0, B:55:0x00fd), top: B:98:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX INFO: renamed from: H0 */
    public final void m10160H0(h hVar) throws Throwable {
        long jLongValue;
        InterfaceC1965i.b bVarM10813E;
        long j;
        boolean z;
        long j2;
        long j3;
        z580 z580Var;
        long jMo10927g;
        boolean z2;
        long jM10162I0;
        InterfaceC1965i.b bVar;
        long j4;
        InterfaceC1965i.b bVar2;
        long j5;
        hpx hpxVarM10836r;
        z580 z580Var2;
        int i;
        int i2;
        long j6;
        C1870j c1870j = this;
        c1870j.f7664y.m10272b(1);
        Pair<Object, Long> pairM10138C0 = m10138C0(c1870j.f7663x.f201766a, hVar, true, c1870j.f7627E, c1870j.f7628F, c1870j.f7650k, c1870j.f7651l);
        try {
            try {
                if (pairM10138C0 != null) {
                    Object obj = pairM10138C0.first;
                    jLongValue = ((Long) pairM10138C0.second).longValue();
                    long j7 = hVar.f7694c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    bVarM10813E = c1870j.f7658s.m10813E(c1870j.f7663x.f201766a, obj, jLongValue);
                    if (bVarM10813E.m137607b()) {
                        c1870j.f7663x.f201766a.mo9400l(bVarM10813E.f114355a, c1870j.f7651l);
                        jLongValue = c1870j.f7651l.m9737n(bVarM10813E.f114356b) == bVarM10813E.f114357c ? c1870j.f7651l.m9733j() : 0L;
                        z = true;
                        j2 = j7;
                    } else {
                        j = 0;
                        z = hVar.f7694c == -9223372036854775807L;
                        j2 = j7;
                    }
                    if (c1870j.f7663x.f201766a.m9722u()) {
                        z580Var = c1870j.f7663x;
                        if (pairM10138C0 == null) {
                            if (z580Var.f201770e != 1) {
                                c1870j.m10218j1(4);
                            }
                            c1870j.m10251v0(false, true, false, true);
                        } else {
                            if (bVarM10813E.equals(z580Var.f201767b)) {
                                hpxVarM10836r = c1870j.f7658s.m10836r();
                                if (hpxVarM10836r == null && hpxVarM10836r.f108975d && jLongValue != j) {
                                    jMo10927g = hpxVarM10836r.f108972a.mo10927g(jLongValue, c1870j.f7662w);
                                } else {
                                    jMo10927g = jLongValue;
                                }
                                if (vck0.m197874l1(jMo10927g) != vck0.m197874l1(c1870j.f7663x.f201783r) && ((i = (z580Var2 = c1870j.f7663x).f201770e) == 2 || i == 3)) {
                                    j5 = z580Var2.f201783r;
                                    bVar2 = bVarM10813E;
                                    i2 = 2;
                                    z = z;
                                    j6 = j5;
                                }
                            } else {
                                jMo10927g = jLongValue;
                            }
                            try {
                                if (c1870j.f7663x.f201770e == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                jM10162I0 = c1870j.m10162I0(bVarM10813E, jMo10927g, z2);
                                z = (jLongValue != jM10162I0) | z;
                                try {
                                    z580 z580Var3 = c1870j.f7663x;
                                    bVar = bVarM10813E;
                                    try {
                                        AbstractC1834c0 abstractC1834c0 = z580Var3.f201766a;
                                        j4 = j2;
                                        try {
                                            c1870j.m10258x1(abstractC1834c0, bVar, abstractC1834c0, z580Var3.f201767b, j4, true);
                                            bVar2 = bVar;
                                            j2 = j4;
                                            j5 = jM10162I0;
                                            i2 = 2;
                                            j6 = j5;
                                            c1870j = this;
                                        } catch (Throwable th) {
                                            th = th;
                                            bVarM10813E = bVar;
                                            j2 = j4;
                                            j3 = jM10162I0;
                                            c1870j.f7663x = c1870j.m10175P(bVarM10813E, j3, j2, j3, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVarM10813E = bVar;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j3 = jLongValue;
                                c1870j.f7663x = c1870j.m10175P(bVarM10813E, j3, j2, j3, z, 2);
                                throw th;
                            }
                        }
                        c1870j.f7663x = c1870j.m10175P(bVar2, j5, j2, j6, z, i2);
                        return;
                    }
                    c1870j.f7633K = hVar;
                    z = z;
                    bVar2 = bVarM10813E;
                    j5 = jLongValue;
                    i2 = 2;
                    j6 = j5;
                    c1870j = this;
                    c1870j.f7663x = c1870j.m10175P(bVar2, j5, j2, j6, z, i2);
                    return;
                }
                Pair<InterfaceC1965i.b, Long> pairM10153E = c1870j.m10153E(c1870j.f7663x.f201766a);
                bVarM10813E = (InterfaceC1965i.b) pairM10153E.first;
                jLongValue = ((Long) pairM10153E.second).longValue();
                z = !c1870j.f7663x.f201766a.m9722u();
                j2 = -9223372036854775807L;
                if (c1870j.f7663x.f201766a.m9722u()) {
                    z580Var = c1870j.f7663x;
                    if (pairM10138C0 == null) {
                        if (z580Var.f201770e != 1) {
                            c1870j.m10218j1(4);
                        }
                        c1870j.m10251v0(false, true, false, true);
                    } else {
                        if (bVarM10813E.equals(z580Var.f201767b)) {
                            hpxVarM10836r = c1870j.f7658s.m10836r();
                            if (hpxVarM10836r == null) {
                                jMo10927g = jLongValue;
                            } else {
                                jMo10927g = jLongValue;
                            }
                            if (vck0.m197874l1(jMo10927g) != vck0.m197874l1(c1870j.f7663x.f201783r)) {
                            }
                        } else {
                            jMo10927g = jLongValue;
                        }
                        if (c1870j.f7663x.f201770e == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jM10162I0 = c1870j.m10162I0(bVarM10813E, jMo10927g, z2);
                        z = (jLongValue != jM10162I0) | z;
                        z580 z580Var4 = c1870j.f7663x;
                        bVar = bVarM10813E;
                        AbstractC1834c0 abstractC1834c1 = z580Var4.f201766a;
                        j4 = j2;
                        c1870j.m10258x1(abstractC1834c1, bVar, abstractC1834c1, z580Var4.f201767b, j4, true);
                        bVar2 = bVar;
                        j2 = j4;
                        j5 = jM10162I0;
                        i2 = 2;
                        j6 = j5;
                        c1870j = this;
                    }
                    c1870j.f7663x = c1870j.m10175P(bVar2, j5, j2, j6, z, i2);
                    return;
                }
                c1870j.f7633K = hVar;
                z = z;
                bVar2 = bVarM10813E;
                j5 = jLongValue;
                i2 = 2;
                j6 = j5;
                c1870j = this;
                c1870j.f7663x = c1870j.m10175P(bVar2, j5, j2, j6, z, i2);
                return;
            } catch (Throwable th5) {
                th = th5;
                bVarM10813E = bVarM10813E;
                j3 = jLongValue;
                c1870j.f7663x = c1870j.m10175P(bVarM10813E, j3, j2, j3, z, 2);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bVarM10813E = bVarM10813E;
        }
        j = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m10161I(InterfaceC1953h interfaceC1953h) {
        if (this.f7658s.m10843y(interfaceC1953h)) {
            this.f7658s.m10811B(this.f7634L);
            m10188X();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final long m10162I0(InterfaceC1965i.b bVar, long j, boolean z) throws ExoPlaybackException {
        return m10164J0(bVar, j, this.f7658s.m10836r() != this.f7658s.m10837s(), z);
    }

    /* JADX INFO: renamed from: J */
    public final void m10163J(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i);
        hpx hpxVarM10836r = this.f7658s.m10836r();
        if (hpxVarM10836r != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(hpxVarM10836r.f108977f.f119232a);
        }
        jwv.m143684d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
        m10241r1(false, false);
        this.f7663x = this.f7663x.m217282f(exoPlaybackExceptionCreateForSource);
    }

    /* JADX INFO: renamed from: J0 */
    public final long m10164J0(InterfaceC1965i.b bVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        C1927p c1927p;
        m10243s1();
        this.f7625C = false;
        if (z2 || this.f7663x.f201770e == 3) {
            m10218j1(2);
        }
        hpx hpxVarM10836r = this.f7658s.m10836r();
        hpx hpxVarM132402j = hpxVarM10836r;
        while (hpxVarM132402j != null && !bVar.equals(hpxVarM132402j.f108977f.f119232a)) {
            hpxVarM132402j = hpxVarM132402j.m132402j();
        }
        if (z || hpxVarM10836r != hpxVarM132402j || (hpxVarM132402j != null && hpxVarM132402j.m132417z(j) < 0)) {
            for (InterfaceC2066x interfaceC2066x : this.f7640a) {
                m10236q(interfaceC2066x);
            }
            if (hpxVarM132402j != null) {
                while (true) {
                    hpx hpxVarM10836r2 = this.f7658s.m10836r();
                    c1927p = this.f7658s;
                    if (hpxVarM10836r2 == hpxVarM132402j) {
                        break;
                    }
                    c1927p.m10820b();
                }
                c1927p.m10812C(hpxVarM132402j);
                hpxVarM132402j.m132415x(1000000000000L);
                m10247u();
            }
        }
        C1927p c1927p2 = this.f7658s;
        if (hpxVarM132402j != null) {
            c1927p2.m10812C(hpxVarM132402j);
            if (!hpxVarM132402j.f108975d) {
                hpxVarM132402j.f108977f = hpxVarM132402j.f108977f.m142767b(j);
            } else if (hpxVarM132402j.f108976e) {
                j = hpxVarM132402j.f108972a.mo10928h(j);
                hpxVarM132402j.f108972a.mo10937t(j - this.f7652m, this.f7653n);
            }
            m10257x0(j);
            m10188X();
        } else {
            c1927p2.m10824f();
            m10257x0(j);
        }
        m10165K(false);
        this.f7647h.mo108874j(2);
        return j;
    }

    /* JADX INFO: renamed from: K */
    public final void m10165K(boolean z) {
        hpx hpxVarM10830l = this.f7658s.m10830l();
        InterfaceC1965i.b bVar = hpxVarM10830l == null ? this.f7663x.f201767b : hpxVarM10830l.f108977f.f119232a;
        boolean zEquals = this.f7663x.f201776k.equals(bVar);
        if (!zEquals) {
            this.f7663x = this.f7663x.m217279c(bVar);
        }
        z580 z580Var = this.f7663x;
        z580Var.f201781p = hpxVarM10830l == null ? z580Var.f201783r : hpxVarM10830l.m132401i();
        this.f7663x.f201782q = m10157G();
        if ((!zEquals || z) && hpxVarM10830l != null && hpxVarM10830l.f108975d) {
            m10249u1(hpxVarM10830l.f108977f.f119232a, hpxVarM10830l.m132406n(), hpxVarM10830l.m132407o());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m10166K0(C2004u c2004u) throws ExoPlaybackException {
        if (c2004u.m11795f() == -9223372036854775807L) {
            m10168L0(c2004u);
            return;
        }
        if (this.f7663x.f201766a.m9722u()) {
            this.f7655p.add(new d(c2004u));
            return;
        }
        d dVar = new d(c2004u);
        AbstractC1834c0 abstractC1834c0 = this.f7663x.f201766a;
        if (!m10148z0(dVar, abstractC1834c0, abstractC1834c0, this.f7627E, this.f7628F, this.f7650k, this.f7651l)) {
            c2004u.m11800k(false);
        } else {
            this.f7655p.add(dVar);
            Collections.sort(this.f7655p);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m10167L(AbstractC1834c0 abstractC1834c0, boolean z) throws Throwable {
        int i;
        AbstractC1834c0 abstractC1834c1;
        AbstractC1834c0 abstractC1834c2;
        g gVarM10137B0 = m10137B0(abstractC1834c0, this.f7663x, this.f7633K, this.f7658s, this.f7627E, this.f7628F, this.f7650k, this.f7651l);
        InterfaceC1965i.b bVar = gVarM10137B0.f7686a;
        long j = gVarM10137B0.f7688c;
        boolean z2 = gVarM10137B0.f7689d;
        long jM10162I0 = gVarM10137B0.f7687b;
        int i2 = 1;
        boolean z3 = (this.f7663x.f201767b.equals(bVar) && jM10162I0 == this.f7663x.f201783r) ? false : true;
        AbstractC1834c0 abstractC1834c3 = null;
        try {
            if (gVarM10137B0.f7690e) {
                if (this.f7663x.f201770e != 1) {
                    m10218j1(4);
                }
                m10251v0(false, false, false, true);
            }
            try {
                if (z3) {
                    abstractC1834c2 = abstractC1834c0;
                    i2 = -1;
                    i = 4;
                    if (!abstractC1834c2.m9722u()) {
                        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null; hpxVarM10836r = hpxVarM10836r.m132402j()) {
                            if (hpxVarM10836r.f108977f.f119232a.equals(bVar)) {
                                hpxVarM10836r.f108977f = this.f7658s.m10838t(abstractC1834c2, hpxVarM10836r.f108977f);
                                hpxVarM10836r.m132393A();
                            }
                        }
                        jM10162I0 = m10162I0(bVar, jM10162I0, z2);
                    }
                } else {
                    try {
                        try {
                            i = 4;
                            try {
                                i2 = -1;
                                try {
                                    abstractC1834c2 = abstractC1834c0;
                                    if (!this.f7658s.m10817I(abstractC1834c0, this.f7634L, m10152D())) {
                                        m10158G0(false);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    abstractC1834c3 = abstractC1834c0;
                                    abstractC1834c1 = abstractC1834c3;
                                    z580 z580Var = this.f7663x;
                                    m10258x1(abstractC1834c1, bVar, z580Var.f201766a, z580Var.f201767b, gVarM10137B0.f7691f ? jM10162I0 : -9223372036854775807L, false);
                                    if (z3 || j != this.f7663x.f201768c) {
                                        z580 z580Var2 = this.f7663x;
                                        Object obj = z580Var2.f201767b.f114355a;
                                        AbstractC1834c0 abstractC1834c4 = z580Var2.f201766a;
                                        this.f7663x = m10175P(bVar, jM10162I0, j, this.f7663x.f201769d, z3 && z && !abstractC1834c4.m9722u() && !abstractC1834c4.mo9400l(obj, this.f7651l).f7305f, abstractC1834c1.mo9396f(obj) == i2 ? i : 3);
                                    }
                                    m10254w0();
                                    m10150A0(abstractC1834c1, this.f7663x.f201766a);
                                    this.f7663x = this.f7663x.m217286j(abstractC1834c1);
                                    if (!abstractC1834c1.m9722u()) {
                                        this.f7633K = null;
                                    }
                                    m10165K(false);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                abstractC1834c3 = abstractC1834c0;
                                i2 = -1;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC1834c3 = abstractC1834c0;
                            i2 = -1;
                            i = 4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC1834c3 = abstractC1834c0;
                        i2 = -1;
                        i = 4;
                    }
                }
                z580 z580Var3 = this.f7663x;
                m10258x1(abstractC1834c2, bVar, z580Var3.f201766a, z580Var3.f201767b, gVarM10137B0.f7691f ? jM10162I0 : -9223372036854775807L, false);
                if (z3 || j != this.f7663x.f201768c) {
                    z580 z580Var4 = this.f7663x;
                    Object obj2 = z580Var4.f201767b.f114355a;
                    AbstractC1834c0 abstractC1834c5 = z580Var4.f201766a;
                    this.f7663x = m10175P(bVar, jM10162I0, j, this.f7663x.f201769d, z3 && z && !abstractC1834c5.m9722u() && !abstractC1834c5.mo9400l(obj2, this.f7651l).f7305f, abstractC1834c2.mo9396f(obj2) == i2 ? i : 3);
                }
                m10254w0();
                m10150A0(abstractC1834c2, this.f7663x.f201766a);
                this.f7663x = this.f7663x.m217286j(abstractC1834c2);
                if (!abstractC1834c2.m9722u()) {
                    this.f7633K = null;
                }
                m10165K(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i2 = -1;
            i = 4;
            abstractC1834c1 = abstractC1834c0;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m10168L0(C2004u c2004u) throws ExoPlaybackException {
        if (c2004u.m11792c() != this.f7649j) {
            this.f7647h.mo108868d(15, c2004u).mo108877a();
            return;
        }
        m10233p(c2004u);
        int i = this.f7663x.f201770e;
        if (i == 3 || i == 2) {
            this.f7647h.mo108874j(2);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10169M(InterfaceC1953h interfaceC1953h) throws ExoPlaybackException {
        C1870j c1870j;
        if (this.f7658s.m10843y(interfaceC1953h)) {
            hpx hpxVarM10830l = this.f7658s.m10830l();
            hpxVarM10830l.m132408p(this.f7654o.getPlaybackParameters().f8251a, this.f7663x.f201766a);
            m10249u1(hpxVarM10830l.f108977f.f119232a, hpxVarM10830l.m132406n(), hpxVarM10830l.m132407o());
            if (hpxVarM10830l == this.f7658s.m10836r()) {
                m10257x0(hpxVarM10830l.f108977f.f119233b);
                m10247u();
                z580 z580Var = this.f7663x;
                InterfaceC1965i.b bVar = z580Var.f201767b;
                long j = hpxVarM10830l.f108977f.f119233b;
                c1870j = this;
                c1870j.f7663x = c1870j.m10175P(bVar, j, z580Var.f201768c, j, false, 5);
            } else {
                c1870j = this;
            }
            c1870j.m10188X();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m10170M0(final C2004u c2004u) {
        Looper looperM11792c = c2004u.m11792c();
        if (looperM11792c.getThread().isAlive()) {
            this.f7656q.mo167857c(looperM11792c, null).mo108865a(new Runnable() { // from class: l.m8f
                @Override // java.lang.Runnable
                public final void run() {
                    C1870j.m10144g(this.f132567a, c2004u);
                }
            });
        } else {
            jwv.m143689i("TAG", "Trying to send message on a dead thread.");
            c2004u.m11800k(false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10171N(C1930s c1930s, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.f7664y.m10272b(1);
            }
            this.f7663x = this.f7663x.m217283g(c1930s);
        }
        m10260y1(c1930s.f8251a);
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            if (interfaceC2066x != null) {
                interfaceC2066x.mo10368A(f2, c1930s.f8251a);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m10172N0(long j) {
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            if (interfaceC2066x.getStream() != null) {
                m10174O0(interfaceC2066x, j);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m10173O(C1930s c1930s, boolean z) throws ExoPlaybackException {
        m10171N(c1930s, c1930s.f8251a, true, z);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m10174O0(InterfaceC2066x interfaceC2066x, long j) {
        interfaceC2066x.mo9782s();
        if (interfaceC2066x instanceof eji0) {
            ((eji0) interfaceC2066x).m116857h0(j);
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: P */
    public final z580 m10175P(InterfaceC1965i.b bVar, long j, long j2, long j3, boolean z, int i) {
        List<Metadata> list;
        b6j0 b6j0Var;
        z6j0 z6j0Var;
        this.f7636N = (!this.f7636N && j == this.f7663x.f201783r && bVar.equals(this.f7663x.f201767b)) ? false : true;
        m10254w0();
        z580 z580Var = this.f7663x;
        b6j0 b6j0Var2 = z580Var.f201773h;
        z6j0 z6j0Var2 = z580Var.f201774i;
        List<Metadata> listM15685of = z580Var.f201775j;
        if (this.f7659t.m10867t()) {
            hpx hpxVarM10836r = this.f7658s.m10836r();
            b6j0 b6j0VarM132406n = hpxVarM10836r == null ? b6j0.f73823d : hpxVarM10836r.m132406n();
            z6j0 z6j0VarM132407o = hpxVarM10836r == null ? this.f7644e : hpxVarM10836r.m132407o();
            ImmutableList<Metadata> immutableListM10261z = m10261z(z6j0VarM132407o.f201930c);
            if (hpxVarM10836r != null) {
                jpx jpxVar = hpxVarM10836r.f108977f;
                if (jpxVar.f119234c != j2) {
                    hpxVarM10836r.f108977f = jpxVar.m142766a(j2);
                }
            }
            b6j0Var = b6j0VarM132406n;
            z6j0Var = z6j0VarM132407o;
            list = immutableListM10261z;
        } else {
            if (!bVar.equals(this.f7663x.f201767b)) {
                b6j0Var2 = b6j0.f73823d;
                z6j0Var2 = this.f7644e;
                listM15685of = ImmutableList.m15685of();
            }
            list = listM15685of;
            b6j0Var = b6j0Var2;
            z6j0Var = z6j0Var2;
        }
        if (z) {
            this.f7664y.m10275e(i);
        }
        return this.f7663x.m217280d(bVar, j, j2, j3, m10157G(), b6j0Var, z6j0Var, list);
    }

    /* JADX INFO: renamed from: P0 */
    public synchronized boolean m10176P0(boolean z) {
        if (!this.f7665z && this.f7649j.getThread().isAlive()) {
            if (z) {
                this.f7647h.mo108870f(13, 1, 0).mo108877a();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f7647h.mo108871g(13, 0, 0, atomicBoolean).mo108877a();
            m10262z1(new tyg0() { // from class: l.k8f
                @Override // p149l.tyg0
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.f7638P);
            return atomicBoolean.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10177Q(InterfaceC2066x interfaceC2066x, hpx hpxVar) {
        hpx hpxVarM132402j = hpxVar.m132402j();
        if (hpxVar.f108977f.f119237f && hpxVarM132402j.f108975d) {
            return (interfaceC2066x instanceof eji0) || (interfaceC2066x instanceof C1889a) || interfaceC2066x.mo9777k() >= hpxVarM132402j.m132405m();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10178Q0(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f7629G != z) {
            this.f7629G = z;
            if (!z) {
                for (InterfaceC2066x interfaceC2066x : this.f7640a) {
                    if (!m10141U(interfaceC2066x) && this.f7641b.remove(interfaceC2066x)) {
                        interfaceC2066x.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10179R() {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        if (!hpxVarM10837s.f108975d) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
            if (i >= interfaceC2066xArr.length) {
                return true;
            }
            InterfaceC2066x interfaceC2066x = interfaceC2066xArr[i];
            vod0 vod0Var = hpxVarM10837s.f108974c[i];
            if (interfaceC2066x.getStream() != vod0Var || (vod0Var != null && !interfaceC2066x.mo9775d() && !m10177Q(interfaceC2066x, hpxVarM10837s))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m10180R0(C1930s c1930s) {
        this.f7647h.mo108876l(16);
        this.f7654o.setPlaybackParameters(c1930s);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m10181S0(b bVar) throws Throwable {
        this.f7664y.m10272b(1);
        if (bVar.f7669c != -1) {
            this.f7633K = new h(new C2057v(bVar.f7667a, bVar.f7668b), bVar.f7669c, bVar.f7670d);
        }
        m10167L(this.f7659t.m10856C(bVar.f7667a, bVar.f7668b), false);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m10182T() {
        hpx hpxVarM10830l = this.f7658s.m10830l();
        return (hpxVarM10830l == null || hpxVarM10830l.m132403k() == Long.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: T0 */
    public void m10183T0(List<C1928q.c> list, int i, long j, g0f0 g0f0Var) {
        this.f7647h.mo108868d(17, new b(list, g0f0Var, i, j, null)).mo108877a();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m10184U0(boolean z) {
        if (z == this.f7631I) {
            return;
        }
        this.f7631I = z;
        if (z || !this.f7663x.f201780o) {
            return;
        }
        this.f7647h.mo108874j(2);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m10185V() {
        hpx hpxVarM10836r = this.f7658s.m10836r();
        long j = hpxVarM10836r.f108977f.f119236e;
        if (hpxVarM10836r.f108975d) {
            return j == -9223372036854775807L || this.f7663x.f201783r < j || !m10226m1();
        }
        return false;
    }

    /* JADX INFO: renamed from: V0 */
    public void m10186V0(boolean z) {
        this.f7647h.mo108870f(23, z ? 1 : 0, 0).mo108877a();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m10187W0(boolean z) throws ExoPlaybackException {
        this.f7623A = z;
        m10254w0();
        if (!this.f7624B || this.f7658s.m10837s() == this.f7658s.m10836r()) {
            return;
        }
        m10158G0(true);
        m10165K(false);
    }

    /* JADX INFO: renamed from: X */
    public final void m10188X() {
        boolean zM10223l1 = m10223l1();
        this.f7626D = zM10223l1;
        if (zM10223l1) {
            this.f7658s.m10830l().m132397d(this.f7634L);
        }
        m10246t1();
    }

    /* JADX INFO: renamed from: X0 */
    public void m10189X0(boolean z, int i) {
        this.f7647h.mo108870f(1, z ? 1 : 0, i).mo108877a();
    }

    /* JADX INFO: renamed from: Y */
    public final void m10190Y() {
        this.f7664y.m10274d(this.f7663x);
        if (this.f7664y.f7679a) {
            this.f7657r.mo10276a(this.f7664y);
            this.f7664y = new e(this.f7663x);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m10191Y0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f7664y.m10272b(z2 ? 1 : 0);
        this.f7664y.m10273c(i2);
        this.f7663x = this.f7663x.m217281e(z, i);
        this.f7625C = false;
        m10214i0(z);
        if (!m10226m1()) {
            m10243s1();
            m10255w1();
            return;
        }
        int i3 = this.f7663x.f201770e;
        if (i3 == 3) {
            m10235p1();
            this.f7647h.mo108874j(2);
        } else if (i3 == 2) {
            this.f7647h.mo108874j(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10192Z(long r9, long r11) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C1870j.m10192Z(long, long):void");
    }

    /* JADX INFO: renamed from: Z0 */
    public void m10193Z0(C1930s c1930s) {
        this.f7647h.mo108868d(4, c1930s).mo108877a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10194a0() throws ExoPlaybackException {
        jpx jpxVarM10835q;
        this.f7658s.m10811B(this.f7634L);
        if (this.f7658s.m10815G() && (jpxVarM10835q = this.f7658s.m10835q(this.f7634L, this.f7663x)) != null) {
            hpx hpxVarM10825g = this.f7658s.m10825g(this.f7642c, this.f7643d, this.f7645f.mo147025i(), this.f7659t, jpxVarM10835q, this.f7644e);
            hpxVarM10825g.f108972a.mo10933p(this, jpxVarM10835q.f119233b);
            if (this.f7658s.m10836r() == hpxVarM10825g) {
                m10257x0(jpxVarM10835q.f119233b);
            }
            m10165K(false);
        }
        if (!this.f7626D) {
            m10188X();
        } else {
            this.f7626D = m10182T();
            m10246t1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m10195a1(C1930s c1930s) throws ExoPlaybackException {
        m10180R0(c1930s);
        m10173O(this.f7654o.getPlaybackParameters(), true);
    }

    @Override // p149l.y6j0.InterfaceC21314a
    /* JADX INFO: renamed from: b */
    public void mo10196b(InterfaceC2066x interfaceC2066x) {
        this.f7647h.mo108874j(26);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX INFO: renamed from: b0 */
    public final void m10197b0() throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        while (this.m10220k1()) {
            if (z2) {
                this.m10190Y();
            }
            hpx hpxVar = (hpx) p11.m167011e(this.f7658s.m10820b());
            if (this.f7663x.f201767b.f114355a.equals(hpxVar.f108977f.f119232a.f114355a)) {
                InterfaceC1965i.b bVar = this.f7663x.f201767b;
                if (bVar.f114356b == -1) {
                    InterfaceC1965i.b bVar2 = hpxVar.f108977f.f119232a;
                    if (bVar2.f114356b != -1 || bVar.f114359e == bVar2.f114359e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            jpx jpxVar = hpxVar.f108977f;
            InterfaceC1965i.b bVar3 = jpxVar.f119232a;
            long j = jpxVar.f119233b;
            C1870j c1870j = this;
            c1870j.f7663x = c1870j.m10175P(bVar3, j, jpxVar.f119234c, j, !z, 0);
            c1870j.m10254w0();
            c1870j.m10255w1();
            z2 = true;
            this = c1870j;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m10198b1(int i) {
        this.f7647h.mo108870f(11, i, 0).mo108877a();
    }

    @Override // p149l.y6j0.InterfaceC21314a
    /* JADX INFO: renamed from: c */
    public void mo10199c() {
        this.f7647h.mo108874j(10);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m10200c0() throws ExoPlaybackException {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        if (hpxVarM10837s == null) {
            return;
        }
        int i = 0;
        if (hpxVarM10837s.m132402j() != null && !this.f7624B) {
            if (m10179R()) {
                if (hpxVarM10837s.m132402j().f108975d || this.f7634L >= hpxVarM10837s.m132402j().m132405m()) {
                    z6j0 z6j0VarM132407o = hpxVarM10837s.m132407o();
                    hpx hpxVarM10821c = this.f7658s.m10821c();
                    z6j0 z6j0VarM132407o2 = hpxVarM10821c.m132407o();
                    AbstractC1834c0 abstractC1834c0 = this.f7663x.f201766a;
                    m10258x1(abstractC1834c0, hpxVarM10821c.f108977f.f119232a, abstractC1834c0, hpxVarM10837s.f108977f.f119232a, -9223372036854775807L, false);
                    if (hpxVarM10821c.f108975d && hpxVarM10821c.f108972a.mo10929i() != -9223372036854775807L) {
                        m10172N0(hpxVarM10821c.m132405m());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f7640a.length; i2++) {
                        boolean zM217397c = z6j0VarM132407o.m217397c(i2);
                        boolean zM217397c2 = z6j0VarM132407o2.m217397c(i2);
                        if (zM217397c && !this.f7640a[i2].mo9776g()) {
                            boolean z = this.f7642c[i2].getTrackType() == -2;
                            erc0 erc0Var = z6j0VarM132407o.f201929b[i2];
                            erc0 erc0Var2 = z6j0VarM132407o2.f201929b[i2];
                            if (!zM217397c2 || !erc0Var2.equals(erc0Var) || z) {
                                m10174O0(this.f7640a[i2], hpxVarM10821c.m132405m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!hpxVarM10837s.f108977f.f119240i && !this.f7624B) {
            return;
        }
        while (true) {
            InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
            if (i >= interfaceC2066xArr.length) {
                return;
            }
            InterfaceC2066x interfaceC2066x = interfaceC2066xArr[i];
            vod0 vod0Var = hpxVarM10837s.f108974c[i];
            if (vod0Var != null && interfaceC2066x.getStream() == vod0Var && interfaceC2066x.mo9775d()) {
                long j = hpxVarM10837s.f108977f.f119236e;
                m10174O0(interfaceC2066x, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : hpxVarM10837s.m132404l() + hpxVarM10837s.f108977f.f119236e);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m10201c1(int i) throws ExoPlaybackException {
        this.f7627E = i;
        if (!this.f7658s.m10818J(this.f7663x.f201766a, i)) {
            m10158G0(true);
        }
        m10165K(false);
    }

    @Override // com.google.android.exoplayer2.C1928q.d
    /* JADX INFO: renamed from: d */
    public void mo10202d() {
        this.f7647h.mo108874j(22);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m10203d0() throws ExoPlaybackException {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        if (hpxVarM10837s == null || this.f7658s.m10836r() == hpxVarM10837s || hpxVarM10837s.f108978g || !m10242s0()) {
            return;
        }
        m10247u();
    }

    /* JADX INFO: renamed from: d1 */
    public void m10204d1(ice0 ice0Var) {
        this.f7647h.mo108868d(5, ice0Var).mo108877a();
    }

    @Override // com.google.android.exoplayer2.C2004u.a
    /* JADX INFO: renamed from: e */
    public synchronized void mo10205e(C2004u c2004u) {
        if (!this.f7665z && this.f7649j.getThread().isAlive()) {
            this.f7647h.mo108868d(14, c2004u).mo108877a();
            return;
        }
        jwv.m143689i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c2004u.m11800k(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m10206e0() throws Throwable {
        m10167L(this.f7659t.m10861i(), true);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m10207e1(ice0 ice0Var) {
        this.f7662w = ice0Var;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m10208f0(c cVar) throws Throwable {
        this.f7664y.m10272b(1);
        m10167L(this.f7659t.m10869v(cVar.f7671a, cVar.f7672b, cVar.f7673c, cVar.f7674d), false);
    }

    /* JADX INFO: renamed from: f1 */
    public void m10209f1(boolean z) {
        this.f7647h.mo108870f(12, z ? 1 : 0, 0).mo108877a();
    }

    /* JADX INFO: renamed from: g0 */
    public void m10210g0(int i, int i2, int i3, g0f0 g0f0Var) {
        this.f7647h.mo108868d(19, new c(i, i2, i3, g0f0Var)).mo108877a();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m10211g1(boolean z) throws ExoPlaybackException {
        this.f7628F = z;
        if (!this.f7658s.m10819K(this.f7663x.f201766a, z)) {
            m10158G0(true);
        }
        m10165K(false);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10212h0() {
        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null; hpxVarM10836r = hpxVarM10836r.m132402j()) {
            for (o8f o8fVar : hpxVarM10836r.m132407o().f201930c) {
                if (o8fVar != null) {
                    o8fVar.mo11304e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m10213h1(g0f0 g0f0Var) {
        this.f7647h.mo108868d(21, g0f0Var).mo108877a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        C1927p c1927p;
        hpx hpxVarM10837s;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    m10225m0();
                    break;
                case 1:
                    m10191Y0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m10239r();
                    break;
                case 3:
                    m10160H0((h) message.obj);
                    break;
                case 4:
                    m10195a1((C1930s) message.obj);
                    break;
                case 5:
                    m10207e1((ice0) message.obj);
                    break;
                case 6:
                    m10241r1(false, true);
                    break;
                case 7:
                    m10231o0();
                    return true;
                case 8:
                    m10169M((InterfaceC1953h) message.obj);
                    break;
                case 9:
                    m10161I((InterfaceC1953h) message.obj);
                    break;
                case 10:
                    m10245t0();
                    break;
                case 11:
                    m10201c1(message.arg1);
                    break;
                case 12:
                    m10211g1(message.arg1 != 0);
                    break;
                case 13:
                    m10178Q0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m10166K0((C2004u) message.obj);
                    break;
                case 15:
                    m10170M0((C2004u) message.obj);
                    break;
                case 16:
                    m10173O((C1930s) message.obj, false);
                    break;
                case 17:
                    m10181S0((b) message.obj);
                    break;
                case 18:
                    m10224m((b) message.obj, message.arg1);
                    break;
                case 19:
                    m10208f0((c) message.obj);
                    break;
                case 20:
                    m10237q0(message.arg1, message.arg2, (g0f0) message.obj);
                    break;
                case 21:
                    m10215i1((g0f0) message.obj);
                    break;
                case 22:
                    m10206e0();
                    break;
                case 23:
                    m10187W0(message.arg1 != 0);
                    break;
                case 24:
                    m10184U0(message.arg1 == 1);
                    break;
                case 25:
                    m10230o();
                    break;
                case 26:
                    m10248u0();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.type == 1 && (hpxVarM10837s = this.f7658s.m10837s()) != null) {
                e = e.copyWithMediaPeriodId(hpxVarM10837s.f108977f.f119232a);
            }
            if (e.isRecoverable && this.f7637O == null) {
                jwv.m143690j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f7637O = e;
                cvk cvkVar = this.f7647h;
                cvkVar.mo108873i(cvkVar.mo108868d(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f7637O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f7637O;
                }
                jwv.m143684d("ExoPlayerImplInternal", "Playback error", e);
                if (e.type == 1 && this.f7658s.m10836r() != this.f7658s.m10837s()) {
                    while (true) {
                        hpx hpxVarM10836r = this.f7658s.m10836r();
                        hpx hpxVarM10837s2 = this.f7658s.m10837s();
                        c1927p = this.f7658s;
                        if (hpxVarM10836r == hpxVarM10837s2) {
                            break;
                        }
                        c1927p.m10820b();
                    }
                    jpx jpxVar = ((hpx) p11.m167011e(c1927p.m10836r())).f108977f;
                    InterfaceC1965i.b bVar = jpxVar.f119232a;
                    long j = jpxVar.f119233b;
                    this.f7663x = m10175P(bVar, j, jpxVar.f119234c, j, true, 0);
                }
                m10241r1(true, false);
                this.f7663x = this.f7663x.m217282f(e);
            }
        } catch (ParserException e3) {
            int i3 = e3.dataType;
            if (i3 == 1) {
                i = e3.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i = e3.contentIsMalformed ? 3002 : 3004;
                }
                m10163J(e3, i2);
            }
            i2 = i;
            m10163J(e3, i2);
        } catch (DrmSession.DrmSessionException e4) {
            m10163J(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            m10163J(e5, 1002);
        } catch (DataSourceException e6) {
            m10163J(e6, e6.reason);
        } catch (IOException e7) {
            m10163J(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            jwv.m143684d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            m10241r1(true, false);
            this.f7663x = this.f7663x.m217282f(exoPlaybackExceptionCreateForUnexpected);
        }
        m10190Y();
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10214i0(boolean z) {
        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null; hpxVarM10836r = hpxVarM10836r.m132402j()) {
            for (o8f o8fVar : hpxVarM10836r.m132407o().f201930c) {
                if (o8fVar != null) {
                    o8fVar.mo11316q(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m10215i1(g0f0 g0f0Var) throws Throwable {
        this.f7664y.m10272b(1);
        m10167L(this.f7659t.m10857D(g0f0Var), false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10217j0() {
        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null; hpxVarM10836r = hpxVarM10836r.m132402j()) {
            for (o8f o8fVar : hpxVarM10836r.m132407o().f201930c) {
                if (o8fVar != null) {
                    o8fVar.mo11311l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m10218j1(int i) {
        z580 z580Var = this.f7663x;
        if (z580Var.f201770e != i) {
            if (i != 2) {
                this.f7639Q = -9223372036854775807L;
            }
            this.f7663x = z580Var.m217284h(i);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo10216j(InterfaceC1953h interfaceC1953h) {
        this.f7647h.mo108868d(9, interfaceC1953h).mo108877a();
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m10220k1() {
        hpx hpxVarM10836r;
        hpx hpxVarM132402j;
        return m10226m1() && !this.f7624B && (hpxVarM10836r = this.f7658s.m10836r()) != null && (hpxVarM132402j = hpxVarM10836r.m132402j()) != null && this.f7634L >= hpxVarM132402j.m132405m() && hpxVarM132402j.f108978g;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h.a
    /* JADX INFO: renamed from: l */
    public void mo10221l(InterfaceC1953h interfaceC1953h) {
        this.f7647h.mo108868d(8, interfaceC1953h).mo108877a();
    }

    /* JADX INFO: renamed from: l0 */
    public void m10222l0() {
        this.f7647h.mo108866b(0).mo108877a();
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m10223l1() {
        if (!m10182T()) {
            return false;
        }
        hpx hpxVarM10830l = this.f7658s.m10830l();
        long jM10159H = m10159H(hpxVarM10830l.m132403k());
        hpx hpxVarM10836r = this.f7658s.m10836r();
        long j = this.f7634L;
        long jM132416y = hpxVarM10830l == hpxVarM10836r ? hpxVarM10830l.m132416y(j) : hpxVarM10830l.m132416y(j) - hpxVarM10830l.f108977f.f119233b;
        boolean zMo147021e = this.f7645f.mo147021e(jM132416y, jM10159H, this.f7654o.getPlaybackParameters().f8251a);
        if (zMo147021e || jM10159H >= 500000 || (this.f7652m <= 0 && !this.f7653n)) {
            return zMo147021e;
        }
        this.f7658s.m10836r().f108972a.mo10937t(this.f7663x.f201783r, false);
        return this.f7645f.mo147021e(jM132416y, jM10159H, this.f7654o.getPlaybackParameters().f8251a);
    }

    /* JADX INFO: renamed from: m */
    public final void m10224m(b bVar, int i) throws Throwable {
        this.f7664y.m10272b(1);
        C1928q c1928q = this.f7659t;
        if (i == -1) {
            i = c1928q.m10866r();
        }
        m10167L(c1928q.m10858f(i, bVar.f7667a, bVar.f7668b), false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m10225m0() {
        this.f7664y.m10272b(1);
        m10251v0(false, false, false, true);
        this.f7645f.mo147017a();
        m10218j1(this.f7663x.f201766a.m9722u() ? 4 : 2);
        this.f7659t.m10870w(this.f7646g.mo120878g());
        this.f7647h.mo108874j(2);
    }

    /* JADX INFO: renamed from: m1 */
    public final boolean m10226m1() {
        z580 z580Var = this.f7663x;
        return z580Var.f201777l && z580Var.f201778m == 0;
    }

    /* JADX INFO: renamed from: n */
    public void m10227n(int i, List<C1928q.c> list, g0f0 g0f0Var) {
        this.f7647h.mo108871g(18, i, 0, new b(list, g0f0Var, -1, -9223372036854775807L, null)).mo108877a();
    }

    /* JADX INFO: renamed from: n0 */
    public synchronized boolean m10228n0() {
        if (!this.f7665z && this.f7649j.getThread().isAlive()) {
            this.f7647h.mo108874j(7);
            m10262z1(new tyg0() { // from class: l.l8f
                @Override // p149l.tyg0
                public final Object get() {
                    return Boolean.valueOf(this.f126823a.f7665z);
                }
            }, this.f7661v);
            return this.f7665z;
        }
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m10229n1(boolean z) {
        if (this.f7632J == 0) {
            return m10185V();
        }
        if (!z) {
            return false;
        }
        if (!this.f7663x.f201772g) {
            return true;
        }
        hpx hpxVarM10836r = this.f7658s.m10836r();
        long jMo9987c = m10232o1(this.f7663x.f201766a, hpxVarM10836r.f108977f.f119232a) ? this.f7660u.mo9987c() : -9223372036854775807L;
        hpx hpxVarM10830l = this.f7658s.m10830l();
        return (hpxVarM10830l.m132409q() && hpxVarM10830l.f108977f.f119240i) || (hpxVarM10830l.f108977f.f119232a.m137607b() && !hpxVarM10830l.f108975d) || this.f7645f.mo147027k(this.f7663x.f201766a, hpxVarM10836r.f108977f.f119232a, m10157G(), this.f7654o.getPlaybackParameters().f8251a, this.f7625C, jMo9987c);
    }

    /* JADX INFO: renamed from: o */
    public final void m10230o() throws ExoPlaybackException {
        m10248u0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m10231o0() {
        m10251v0(true, false, true, false);
        m10234p0();
        this.f7645f.mo147020d();
        m10218j1(1);
        HandlerThread handlerThread = this.f7648i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f7665z = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m10232o1(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar) {
        if (!bVar.m137607b() && !abstractC1834c0.m9722u()) {
            abstractC1834c0.m9720r(abstractC1834c0.mo9400l(bVar.f114355a, this.f7651l).f7302c, this.f7650k);
            if (this.f7650k.m9754h()) {
                AbstractC1834c0.d dVar = this.f7650k;
                if (dVar.f7336i && dVar.f7333f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m10233p(C2004u c2004u) throws ExoPlaybackException {
        if (c2004u.m11799j()) {
            return;
        }
        try {
            c2004u.m11796g().mo9655f(c2004u.m11798i(), c2004u.m11794e());
        } finally {
            c2004u.m11800k(true);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10234p0() {
        for (int i = 0; i < this.f7640a.length; i++) {
            this.f7642c[i].mo9781q();
            this.f7640a[i].release();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m10235p1() throws ExoPlaybackException {
        this.f7625C = false;
        this.f7654o.m9998e();
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            if (m10141U(interfaceC2066x)) {
                interfaceC2066x.start();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10236q(InterfaceC2066x interfaceC2066x) throws ExoPlaybackException {
        if (m10141U(interfaceC2066x)) {
            this.f7654o.m9994a(interfaceC2066x);
            m10253w(interfaceC2066x);
            interfaceC2066x.disable();
            this.f7632J--;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m10237q0(int i, int i2, g0f0 g0f0Var) throws Throwable {
        this.f7664y.m10272b(1);
        m10167L(this.f7659t.m10854A(i, i2, g0f0Var), false);
    }

    /* JADX INFO: renamed from: q1 */
    public void m10238q1() {
        this.f7647h.mo108866b(6).mo108877a();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX INFO: renamed from: r */
    public final void m10239r() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        int i;
        long jMo167855a = this.f7656q.mo167855a();
        this.f7647h.mo108876l(2);
        m10252v1();
        int i2 = this.f7663x.f201770e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        hpx hpxVarM10836r = this.f7658s.m10836r();
        if (hpxVarM10836r == null) {
            m10154E0(jMo167855a, 10L);
            return;
        }
        j5j0.m139865a("doSomeWork");
        m10255w1();
        if (hpxVarM10836r.f108975d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            hpxVarM10836r.f108972a.mo10937t(this.f7663x.f201783r - this.f7652m, this.f7653n);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
                if (i3 >= interfaceC2066xArr.length) {
                    break;
                }
                InterfaceC2066x interfaceC2066x = interfaceC2066xArr[i3];
                if (m10141U(interfaceC2066x)) {
                    interfaceC2066x.mo10393j(this.f7634L, jElapsedRealtime);
                    z = z && interfaceC2066x.mo9654c();
                    boolean z3 = hpxVarM10836r.f108974c[i3] != interfaceC2066x.getStream();
                    boolean z4 = z3 || (!z3 && interfaceC2066x.mo9775d()) || interfaceC2066x.mo9653b() || interfaceC2066x.mo9654c();
                    z2 = z2 && z4;
                    if (!z4) {
                        interfaceC2066x.mo9783w();
                    }
                }
                i3++;
            }
        } else {
            hpxVarM10836r.f108972a.mo10936s();
            z = true;
            z2 = true;
        }
        long j = hpxVarM10836r.f108977f.f119236e;
        boolean z5 = z && hpxVarM10836r.f108975d && (j == -9223372036854775807L || j <= this.f7663x.f201783r);
        if (z5 && this.f7624B) {
            this.f7624B = false;
            m10191Y0(false, this.f7663x.f201778m, false, 5);
        }
        if (z5 && hpxVarM10836r.f108977f.f119240i) {
            m10218j1(4);
            m10243s1();
        } else if (this.f7663x.f201770e == 2 && m10229n1(z2)) {
            m10218j1(3);
            this.f7637O = null;
            if (m10226m1()) {
                m10235p1();
            }
        } else if (this.f7663x.f201770e == 3 && (this.f7632J != 0 ? !z2 : !m10185V())) {
            this.f7625C = m10226m1();
            m10218j1(2);
            if (this.f7625C) {
                m10217j0();
                this.f7660u.mo9988d();
            }
            m10243s1();
        }
        if (this.f7663x.f201770e == 2) {
            int i4 = 0;
            while (true) {
                InterfaceC2066x[] interfaceC2066xArr2 = this.f7640a;
                if (i4 >= interfaceC2066xArr2.length) {
                    break;
                }
                if (m10141U(interfaceC2066xArr2[i4]) && this.f7640a[i4].getStream() == hpxVarM10836r.f108974c[i4]) {
                    this.f7640a[i4].mo9783w();
                }
                i4++;
            }
            z580 z580Var = this.f7663x;
            if (z580Var.f201772g || z580Var.f201782q >= 500000 || !m10182T()) {
                this.f7639Q = -9223372036854775807L;
            } else {
                long j2 = this.f7639Q;
                p95 p95Var = this.f7656q;
                if (j2 == -9223372036854775807L) {
                    this.f7639Q = p95Var.elapsedRealtime();
                } else if (p95Var.elapsedRealtime() - this.f7639Q >= 4000) {
                    qkq0.m175383a("Playback stuck buffering and not loading");
                    return;
                }
            }
        } else {
            this.f7639Q = -9223372036854775807L;
        }
        boolean z6 = m10226m1() && this.f7663x.f201770e == 3;
        boolean z7 = this.f7631I && this.f7630H && z6;
        z580 z580Var2 = this.f7663x;
        if (z580Var2.f201780o != z7) {
            this.f7663x = z580Var2.m217285i(z7);
        }
        this.f7630H = false;
        if (!z7 && (i = this.f7663x.f201770e) != 4) {
            if (z6 || i == 2) {
                m10154E0(jMo167855a, 10L);
            } else if (i == 3 && this.f7632J != 0) {
                m10154E0(jMo167855a, 1000L);
            }
        }
        j5j0.m139867c();
    }

    /* JADX INFO: renamed from: r0 */
    public void m10240r0(int i, int i2, g0f0 g0f0Var) {
        this.f7647h.mo108871g(20, i, i2, g0f0Var).mo108877a();
    }

    /* JADX INFO: renamed from: r1 */
    public final void m10241r1(boolean z, boolean z2) {
        m10251v0(z || !this.f7629G, false, true, false);
        this.f7664y.m10272b(z2 ? 1 : 0);
        this.f7645f.mo147026j();
        m10218j1(1);
    }

    @Override // com.google.android.exoplayer2.C1867g.a
    /* JADX INFO: renamed from: s */
    public void mo10002s(C1930s c1930s) {
        this.f7647h.mo108868d(16, c1930s).mo108877a();
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m10242s0() throws ExoPlaybackException {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        z6j0 z6j0VarM132407o = hpxVarM10837s.m132407o();
        int i = 0;
        boolean z = false;
        while (true) {
            InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
            if (i >= interfaceC2066xArr.length) {
                return !z;
            }
            InterfaceC2066x interfaceC2066x = interfaceC2066xArr[i];
            if (m10141U(interfaceC2066x)) {
                boolean z2 = interfaceC2066x.getStream() != hpxVarM10837s.f108974c[i];
                if (!z6j0VarM132407o.m217397c(i) || z2) {
                    if (!interfaceC2066x.mo9776g()) {
                        interfaceC2066x.mo9780o(m10136B(z6j0VarM132407o.f201930c[i]), hpxVarM10837s.f108974c[i], hpxVarM10837s.m132405m(), hpxVarM10837s.m132404l());
                    } else if (interfaceC2066x.mo9654c()) {
                        m10236q(interfaceC2066x);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m10243s1() throws ExoPlaybackException {
        this.f7654o.m9999f();
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            if (m10141U(interfaceC2066x)) {
                m10253w(interfaceC2066x);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10244t(int i, boolean z) throws ExoPlaybackException {
        InterfaceC2066x interfaceC2066x = this.f7640a[i];
        if (m10141U(interfaceC2066x)) {
            return;
        }
        hpx hpxVarM10837s = this.f7658s.m10837s();
        boolean z2 = hpxVarM10837s == this.f7658s.m10836r();
        z6j0 z6j0VarM132407o = hpxVarM10837s.m132407o();
        erc0 erc0Var = z6j0VarM132407o.f201929b[i];
        C1871k[] c1871kArrM10136B = m10136B(z6j0VarM132407o.f201930c[i]);
        boolean z3 = m10226m1() && this.f7663x.f201770e == 3;
        boolean z4 = !z && z3;
        this.f7632J++;
        this.f7641b.add(interfaceC2066x);
        interfaceC2066x.mo9760B(erc0Var, c1871kArrM10136B, hpxVarM10837s.f108974c[i], this.f7634L, z4, z2, hpxVarM10837s.m132405m(), hpxVarM10837s.m132404l());
        interfaceC2066x.mo9655f(11, new a());
        this.f7654o.m9995b(interfaceC2066x);
        if (z3) {
            interfaceC2066x.start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10245t0() throws ExoPlaybackException {
        int i;
        float f2 = this.f7654o.getPlaybackParameters().f8251a;
        hpx hpxVarM10837s = this.f7658s.m10837s();
        boolean z = true;
        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null && hpxVarM10836r.f108975d; hpxVarM10836r = hpxVarM10836r.m132402j()) {
            z6j0 z6j0VarM132413v = hpxVarM10836r.m132413v(f2, this.f7663x.f201766a);
            if (!z6j0VarM132413v.m217395a(hpxVarM10836r.m132407o())) {
                C1927p c1927p = this.f7658s;
                if (z) {
                    hpx hpxVarM10836r2 = c1927p.m10836r();
                    boolean zM10812C = this.f7658s.m10812C(hpxVarM10836r2);
                    boolean[] zArr = new boolean[this.f7640a.length];
                    long jM132395b = hpxVarM10836r2.m132395b(z6j0VarM132413v, this.f7663x.f201783r, zM10812C, zArr);
                    z580 z580Var = this.f7663x;
                    boolean z2 = (z580Var.f201770e == 4 || jM132395b == z580Var.f201783r) ? false : true;
                    z580 z580Var2 = this.f7663x;
                    i = 4;
                    this.f7663x = m10175P(z580Var2.f201767b, jM132395b, z580Var2.f201768c, z580Var2.f201769d, z2, 5);
                    if (z2) {
                        m10257x0(jM132395b);
                    }
                    boolean[] zArr2 = new boolean[this.f7640a.length];
                    int i2 = 0;
                    while (true) {
                        InterfaceC2066x[] interfaceC2066xArr = this.f7640a;
                        if (i2 >= interfaceC2066xArr.length) {
                            break;
                        }
                        InterfaceC2066x interfaceC2066x = interfaceC2066xArr[i2];
                        boolean zM10141U = m10141U(interfaceC2066x);
                        zArr2[i2] = zM10141U;
                        vod0 vod0Var = hpxVarM10836r2.f108974c[i2];
                        if (zM10141U) {
                            if (vod0Var != interfaceC2066x.getStream()) {
                                m10236q(interfaceC2066x);
                            } else if (zArr[i2]) {
                                interfaceC2066x.mo9778l(this.f7634L);
                            }
                        }
                        i2++;
                    }
                    m10250v(zArr2);
                } else {
                    i = 4;
                    c1927p.m10812C(hpxVarM10836r);
                    if (hpxVarM10836r.f108975d) {
                        hpxVarM10836r.m132394a(z6j0VarM132413v, Math.max(hpxVarM10836r.f108977f.f119233b, hpxVarM10836r.m132416y(this.f7634L)), false);
                    }
                }
                m10165K(true);
                if (this.f7663x.f201770e != i) {
                    m10188X();
                    m10255w1();
                    this.f7647h.mo108874j(2);
                    return;
                }
                return;
            }
            if (hpxVarM10836r == hpxVarM10837s) {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m10246t1() {
        hpx hpxVarM10830l = this.f7658s.m10830l();
        boolean z = this.f7626D || (hpxVarM10830l != null && hpxVarM10830l.f108972a.isLoading());
        z580 z580Var = this.f7663x;
        if (z != z580Var.f201772g) {
            this.f7663x = z580Var.m217278b(z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10247u() throws ExoPlaybackException {
        m10250v(new boolean[this.f7640a.length]);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m10248u0() throws ExoPlaybackException {
        m10245t0();
        m10158G0(true);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m10249u1(InterfaceC1965i.b bVar, b6j0 b6j0Var, z6j0 z6j0Var) {
        this.f7645f.mo147022f(this.f7663x.f201766a, bVar, this.f7640a, b6j0Var, z6j0Var.f201930c);
    }

    /* JADX INFO: renamed from: v */
    public final void m10250v(boolean[] zArr) throws ExoPlaybackException {
        hpx hpxVarM10837s = this.f7658s.m10837s();
        z6j0 z6j0VarM132407o = hpxVarM10837s.m132407o();
        for (int i = 0; i < this.f7640a.length; i++) {
            if (!z6j0VarM132407o.m217397c(i) && this.f7641b.remove(this.f7640a[i])) {
                this.f7640a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f7640a.length; i2++) {
            if (z6j0VarM132407o.m217397c(i2)) {
                m10244t(i2, zArr[i2]);
            }
        }
        hpxVarM10837s.f108978g = true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 com.google.android.exoplayer2.source.i$b) = (r4v2 com.google.android.exoplayer2.source.i$b), (r4v6 com.google.android.exoplayer2.source.i$b) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v16 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[PHI: r3
      0x00ea: PHI (r3v3 com.google.android.exoplayer2.c0) = 
      (r3v2 com.google.android.exoplayer2.c0)
      (r3v2 com.google.android.exoplayer2.c0)
      (r3v7 com.google.android.exoplayer2.c0)
      (r3v7 com.google.android.exoplayer2.c0)
     binds: [B:37:0x00b0, B:39:0x00b4, B:41:0x00c5, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v0 */
    public final void m10251v0(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        AbstractC1834c0 abstractC1834c0;
        InterfaceC1965i.b bVar;
        this.f7647h.mo108876l(2);
        this.f7637O = null;
        this.f7625C = false;
        this.f7654o.m9999f();
        this.f7634L = 1000000000000L;
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            try {
                m10236q(interfaceC2066x);
            } catch (ExoPlaybackException | RuntimeException e2) {
                jwv.m143684d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (InterfaceC2066x interfaceC2066x2 : this.f7640a) {
                if (this.f7641b.remove(interfaceC2066x2)) {
                    try {
                        interfaceC2066x2.reset();
                    } catch (RuntimeException e3) {
                        jwv.m143684d("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.f7632J = 0;
        z580 z580Var = this.f7663x;
        InterfaceC1965i.b bVar2 = z580Var.f201767b;
        long jLongValue = z580Var.f201783r;
        long j = (this.f7663x.f201767b.m137607b() || m10142W(this.f7663x, this.f7651l)) ? this.f7663x.f201768c : this.f7663x.f201783r;
        if (z2) {
            this.f7633K = null;
            Pair<InterfaceC1965i.b, Long> pairM10153E = m10153E(this.f7663x.f201766a);
            bVar2 = (InterfaceC1965i.b) pairM10153E.first;
            jLongValue = ((Long) pairM10153E.second).longValue();
            j = -9223372036854775807L;
            if (bVar2.equals(this.f7663x.f201767b)) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = false;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f7658s.m10824f();
        this.f7626D = false;
        AbstractC1834c0 abstractC1834c0M12175I = this.f7663x.f201766a;
        if (z3 && (abstractC1834c0M12175I instanceof C2057v)) {
            abstractC1834c0M12175I = ((C2057v) abstractC1834c0M12175I).m12175I(this.f7659t.m10865q());
            if (bVar2.f114356b != -1) {
                abstractC1834c0M12175I.mo9400l(bVar2.f114355a, this.f7651l);
                if (abstractC1834c0M12175I.m9720r(this.f7651l.f7302c, this.f7650k).m9754h()) {
                    abstractC1834c0 = abstractC1834c0M12175I;
                    bVar = new InterfaceC1965i.b(bVar2.f114355a, bVar2.f114358d);
                } else {
                    abstractC1834c0 = abstractC1834c0M12175I;
                    bVar = bVar2;
                }
            } else {
                abstractC1834c0 = abstractC1834c0M12175I;
                bVar = bVar2;
            }
        } else {
            abstractC1834c0 = abstractC1834c0M12175I;
            bVar = bVar2;
        }
        z580 z580Var2 = this.f7663x;
        int i = z580Var2.f201770e;
        ExoPlaybackException exoPlaybackException = z4 ? null : z580Var2.f201771f;
        b6j0 b6j0Var = z5 ? b6j0.f73823d : z580Var2.f201773h;
        z6j0 z6j0Var = z5 ? this.f7644e : z580Var2.f201774i;
        List listM15685of = z5 ? ImmutableList.m15685of() : z580Var2.f201775j;
        z580 z580Var3 = this.f7663x;
        this.f7663x = new z580(abstractC1834c0, bVar, j3, j2, i, exoPlaybackException, false, b6j0Var, z6j0Var, listM15685of, bVar, z580Var3.f201777l, z580Var3.f201778m, z580Var3.f201779n, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f7659t.m10872y();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m10252v1() throws ExoPlaybackException {
        if (this.f7663x.f201766a.m9722u() || !this.f7659t.m10867t()) {
            return;
        }
        m10194a0();
        m10200c0();
        m10203d0();
        m10197b0();
    }

    /* JADX INFO: renamed from: w */
    public final void m10253w(InterfaceC2066x interfaceC2066x) {
        if (interfaceC2066x.getState() == 2) {
            interfaceC2066x.stop();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10254w0() {
        hpx hpxVarM10836r = this.f7658s.m10836r();
        this.f7624B = hpxVarM10836r != null && hpxVarM10836r.f108977f.f119239h && this.f7623A;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m10255w1() throws ExoPlaybackException {
        hpx hpxVarM10836r = this.f7658s.m10836r();
        if (hpxVarM10836r == null) {
            return;
        }
        long jMo10929i = hpxVarM10836r.f108975d ? hpxVarM10836r.f108972a.mo10929i() : -9223372036854775807L;
        if (jMo10929i != -9223372036854775807L) {
            m10257x0(jMo10929i);
            if (jMo10929i != this.f7663x.f201783r) {
                z580 z580Var = this.f7663x;
                long j = jMo10929i;
                this.f7663x = m10175P(z580Var.f201767b, j, z580Var.f201768c, j, true, 5);
            }
        } else {
            long jM10000g = this.f7654o.m10000g(hpxVarM10836r != this.f7658s.m10837s());
            this.f7634L = jM10000g;
            long jM132416y = hpxVarM10836r.m132416y(jM10000g);
            m10192Z(this.f7663x.f201783r, jM132416y);
            this.f7663x.m217289o(jM132416y);
        }
        this.f7663x.f201781p = this.f7658s.m10830l().m132401i();
        this.f7663x.f201782q = m10157G();
        z580 z580Var2 = this.f7663x;
        if (z580Var2.f201777l && z580Var2.f201770e == 3 && m10232o1(z580Var2.f201766a, z580Var2.f201767b) && this.f7663x.f201779n.f8251a == 1.0f) {
            float fMo9986b = this.f7660u.mo9986b(m10149A(), m10157G());
            if (this.f7654o.getPlaybackParameters().f8251a != fMo9986b) {
                m10180R0(this.f7663x.f201779n.m10898c(fMo9986b));
                m10171N(this.f7663x.f201779n, this.f7654o.getPlaybackParameters().f8251a, false, false);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m10256x(long j) {
        this.f7638P = j;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m10257x0(long j) throws ExoPlaybackException {
        hpx hpxVarM10836r = this.f7658s.m10836r();
        long jM132417z = hpxVarM10836r == null ? j + 1000000000000L : hpxVarM10836r.m132417z(j);
        this.f7634L = jM132417z;
        this.f7654o.m9996c(jM132417z);
        for (InterfaceC2066x interfaceC2066x : this.f7640a) {
            if (m10141U(interfaceC2066x)) {
                interfaceC2066x.mo9778l(this.f7634L);
            }
        }
        m10212h0();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10258x1(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c1, InterfaceC1965i.b bVar2, long j, boolean z) throws ExoPlaybackException {
        if (!m10232o1(abstractC1834c0, bVar)) {
            C1930s c1930s = bVar.m137607b() ? C1930s.f8247d : this.f7663x.f201779n;
            if (this.f7654o.getPlaybackParameters().equals(c1930s)) {
                return;
            }
            m10180R0(c1930s);
            m10171N(this.f7663x.f201779n, c1930s.f8251a, false, false);
            return;
        }
        abstractC1834c0.m9720r(abstractC1834c0.mo9400l(bVar.f114355a, this.f7651l).f7302c, this.f7650k);
        this.f7660u.mo9985a((C1921n.g) vck0.m197866j(this.f7650k.f7338k));
        if (j != -9223372036854775807L) {
            this.f7660u.mo9989e(m10151C(abstractC1834c0, bVar.f114355a, j));
            return;
        }
        if (!vck0.m197845c(!abstractC1834c1.m9722u() ? abstractC1834c1.m9720r(abstractC1834c1.mo9400l(bVar2.f114355a, this.f7651l).f7302c, this.f7650k).f7328a : null, this.f7650k.f7328a) || z) {
            this.f7660u.mo9989e(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10259y(boolean z) {
        this.f7647h.mo108870f(24, z ? 1 : 0, 0).mo108877a();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m10260y1(float f2) {
        for (hpx hpxVarM10836r = this.f7658s.m10836r(); hpxVarM10836r != null; hpxVarM10836r = hpxVarM10836r.m132402j()) {
            for (o8f o8fVar : hpxVarM10836r.m132407o().f201930c) {
                if (o8fVar != null) {
                    o8fVar.mo11313n(f2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final ImmutableList<Metadata> m10261z(o8f[] o8fVarArr) {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        boolean z = false;
        for (o8f o8fVar : o8fVarArr) {
            if (o8fVar != null) {
                Metadata metadata = o8fVar.mo11312m(0).f7746j;
                if (metadata == null) {
                    c2781a.mo15683a(new Metadata(new Metadata.Entry[0]));
                } else {
                    c2781a.mo15683a(metadata);
                    z = true;
                }
            }
        }
        return z ? c2781a.m15702m() : ImmutableList.m15685of();
    }

    /* JADX INFO: renamed from: z1 */
    public final synchronized void m10262z1(tyg0<Boolean> tyg0Var, long j) {
        long jElapsedRealtime = this.f7656q.elapsedRealtime() + j;
        boolean z = false;
        while (!tyg0Var.get().booleanValue() && j > 0) {
            try {
                this.f7656q.mo167856b();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f7656q.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<C1928q.c> f7667a;

        /* JADX INFO: renamed from: b */
        public final g0f0 f7668b;

        /* JADX INFO: renamed from: c */
        public final int f7669c;

        /* JADX INFO: renamed from: d */
        public final long f7670d;

        public b(List<C1928q.c> list, g0f0 g0f0Var, int i, long j) {
            this.f7667a = list;
            this.f7668b = g0f0Var;
            this.f7669c = i;
            this.f7670d = j;
        }

        public /* synthetic */ b(List list, g0f0 g0f0Var, int i, long j, a aVar) {
            this(list, g0f0Var, i, j);
        }
    }
}
