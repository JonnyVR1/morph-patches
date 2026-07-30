package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1893j;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.C1912a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.b7h0;
import p153l.bf80;
import p153l.bmk0;
import p153l.cgj0;
import p153l.dgj0;
import p153l.dk0;
import p153l.esi0;
import p153l.eyx;
import p153l.fe80;
import p153l.ffj0;
import p153l.gyx;
import p153l.iig0;
import p153l.jzc0;
import p153l.kyv;
import p153l.ltv;
import p153l.md2;
import p153l.n8f0;
import p153l.nej0;
import p153l.nke0;
import p153l.qa5;
import p153l.sxk;
import p153l.u9f;
import p153l.w11;
import p153l.wtq0;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1893j implements Handler.Callback, InterfaceC1976h.a, cgj0.InterfaceC16249a, C1951q.d, C1890g.a, C2027u.a {

    /* JADX INFO: renamed from: A */
    public boolean f7660A;

    /* JADX INFO: renamed from: B */
    public boolean f7661B;

    /* JADX INFO: renamed from: C */
    public boolean f7662C;

    /* JADX INFO: renamed from: D */
    public boolean f7663D;

    /* JADX INFO: renamed from: E */
    public int f7664E;

    /* JADX INFO: renamed from: F */
    public boolean f7665F;

    /* JADX INFO: renamed from: G */
    public boolean f7666G;

    /* JADX INFO: renamed from: H */
    public boolean f7667H;

    /* JADX INFO: renamed from: I */
    public boolean f7668I;

    /* JADX INFO: renamed from: J */
    public int f7669J;

    /* JADX INFO: renamed from: K */
    @Nullable
    public h f7670K;

    /* JADX INFO: renamed from: L */
    public long f7671L;

    /* JADX INFO: renamed from: M */
    public int f7672M;

    /* JADX INFO: renamed from: N */
    public boolean f7673N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public ExoPlaybackException f7674O;

    /* JADX INFO: renamed from: P */
    public long f7675P;

    /* JADX INFO: renamed from: Q */
    public long f7676Q = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2089x[] f7677a;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC2089x> f7678b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2090y[] f7679c;

    /* JADX INFO: renamed from: d */
    public final cgj0 f7680d;

    /* JADX INFO: renamed from: e */
    public final dgj0 f7681e;

    /* JADX INFO: renamed from: f */
    public final ltv f7682f;

    /* JADX INFO: renamed from: g */
    public final md2 f7683g;

    /* JADX INFO: renamed from: h */
    public final sxk f7684h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final HandlerThread f7685i;

    /* JADX INFO: renamed from: j */
    public final Looper f7686j;

    /* JADX INFO: renamed from: k */
    public final AbstractC1857c0.d f7687k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1857c0.b f7688l;

    /* JADX INFO: renamed from: m */
    public final long f7689m;

    /* JADX INFO: renamed from: n */
    public final boolean f7690n;

    /* JADX INFO: renamed from: o */
    public final C1890g f7691o;

    /* JADX INFO: renamed from: p */
    public final ArrayList<d> f7692p;

    /* JADX INFO: renamed from: q */
    public final qa5 f7693q;

    /* JADX INFO: renamed from: r */
    public final f f7694r;

    /* JADX INFO: renamed from: s */
    public final C1950p f7695s;

    /* JADX INFO: renamed from: t */
    public final C1951q f7696t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC1896m f7697u;

    /* JADX INFO: renamed from: v */
    public final long f7698v;

    /* JADX INFO: renamed from: w */
    public nke0 f7699w;

    /* JADX INFO: renamed from: x */
    public fe80 f7700x;

    /* JADX INFO: renamed from: y */
    public e f7701y;

    /* JADX INFO: renamed from: z */
    public boolean f7702z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$a */
    public class a implements InterfaceC2089x.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2089x.a
        /* JADX INFO: renamed from: a */
        public void mo10317a() {
            C1893j.this.f7667H = true;
        }

        @Override // com.google.android.exoplayer2.InterfaceC2089x.a
        /* JADX INFO: renamed from: b */
        public void mo10318b() {
            C1893j.this.f7684h.mo131272j(2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f7708a;

        /* JADX INFO: renamed from: b */
        public final int f7709b;

        /* JADX INFO: renamed from: c */
        public final int f7710c;

        /* JADX INFO: renamed from: d */
        public final n8f0 f7711d;

        public c(int i, int i2, int i3, n8f0 n8f0Var) {
            this.f7708a = i;
            this.f7709b = i2;
            this.f7710c = i3;
            this.f7711d = n8f0Var;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$d */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a */
        public final C2027u f7712a;

        /* JADX INFO: renamed from: b */
        public int f7713b;

        /* JADX INFO: renamed from: c */
        public long f7714c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Object f7715d;

        public d(C2027u c2027u) {
            this.f7712a = c2027u;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f7715d;
            if ((obj == null) != (dVar.f7715d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f7713b - dVar.f7713b;
            return i != 0 ? i : bmk0.m105158o(this.f7714c, dVar.f7714c);
        }

        /* JADX INFO: renamed from: b */
        public void m10324b(int i, long j, Object obj) {
            this.f7713b = i;
            this.f7714c = j;
            this.f7715d = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public boolean f7716a;

        /* JADX INFO: renamed from: b */
        public fe80 f7717b;

        /* JADX INFO: renamed from: c */
        public int f7718c;

        /* JADX INFO: renamed from: d */
        public boolean f7719d;

        /* JADX INFO: renamed from: e */
        public int f7720e;

        /* JADX INFO: renamed from: f */
        public boolean f7721f;

        /* JADX INFO: renamed from: g */
        public int f7722g;

        public e(fe80 fe80Var) {
            this.f7717b = fe80Var;
        }

        /* JADX INFO: renamed from: b */
        public void m10326b(int i) {
            this.f7716a |= i > 0;
            this.f7718c += i;
        }

        /* JADX INFO: renamed from: c */
        public void m10327c(int i) {
            this.f7716a = true;
            this.f7721f = true;
            this.f7722g = i;
        }

        /* JADX INFO: renamed from: d */
        public void m10328d(fe80 fe80Var) {
            this.f7716a |= this.f7717b != fe80Var;
            this.f7717b = fe80Var;
        }

        /* JADX INFO: renamed from: e */
        public void m10329e(int i) {
            if (this.f7719d && this.f7720e != 5) {
                w11.m204365a(i == 5);
                return;
            }
            this.f7716a = true;
            this.f7719d = true;
            this.f7720e = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo10330a(e eVar);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1988i.b f7723a;

        /* JADX INFO: renamed from: b */
        public final long f7724b;

        /* JADX INFO: renamed from: c */
        public final long f7725c;

        /* JADX INFO: renamed from: d */
        public final boolean f7726d;

        /* JADX INFO: renamed from: e */
        public final boolean f7727e;

        /* JADX INFO: renamed from: f */
        public final boolean f7728f;

        public g(InterfaceC1988i.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7723a = bVar;
            this.f7724b = j;
            this.f7725c = j2;
            this.f7726d = z;
            this.f7727e = z2;
            this.f7728f = z3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final AbstractC1857c0 f7729a;

        /* JADX INFO: renamed from: b */
        public final int f7730b;

        /* JADX INFO: renamed from: c */
        public final long f7731c;

        public h(AbstractC1857c0 abstractC1857c0, int i, long j) {
            this.f7729a = abstractC1857c0;
            this.f7730b = i;
            this.f7731c = j;
        }
    }

    public C1893j(InterfaceC2089x[] interfaceC2089xArr, cgj0 cgj0Var, dgj0 dgj0Var, ltv ltvVar, md2 md2Var, int i, boolean z, dk0 dk0Var, nke0 nke0Var, InterfaceC1896m interfaceC1896m, long j, boolean z2, Looper looper, qa5 qa5Var, f fVar, bf80 bf80Var, Looper looper2) {
        this.f7694r = fVar;
        this.f7677a = interfaceC2089xArr;
        this.f7680d = cgj0Var;
        this.f7681e = dgj0Var;
        this.f7682f = ltvVar;
        this.f7683g = md2Var;
        this.f7664E = i;
        this.f7665F = z;
        this.f7699w = nke0Var;
        this.f7697u = interfaceC1896m;
        this.f7698v = j;
        this.f7675P = j;
        this.f7660A = z2;
        this.f7693q = qa5Var;
        this.f7689m = ltvVar.mo155819g();
        this.f7690n = ltvVar.mo155814b();
        fe80 fe80VarM125284k = fe80.m125284k(dgj0Var);
        this.f7700x = fe80VarM125284k;
        this.f7701y = new e(fe80VarM125284k);
        this.f7679c = new InterfaceC2090y[interfaceC2089xArr.length];
        InterfaceC2090y.a aVarMo100065d = cgj0Var.mo100065d();
        for (int i2 = 0; i2 < interfaceC2089xArr.length; i2++) {
            interfaceC2089xArr[i2].mo9838x(i2, bf80Var);
            this.f7679c[i2] = interfaceC2089xArr[i2].mo9839y();
            if (aVarMo100065d != null) {
                this.f7679c[i2].mo9833n(aVarMo100065d);
            }
        }
        this.f7691o = new C1890g(this, qa5Var);
        this.f7692p = new ArrayList<>();
        this.f7678b = Sets.m16177h();
        this.f7687k = new AbstractC1857c0.d();
        this.f7688l = new AbstractC1857c0.b();
        cgj0Var.m109692e(this, md2Var);
        this.f7673N = true;
        sxk sxkVarMo111761c = qa5Var.mo111761c(looper, null);
        this.f7695s = new C1950p(dk0Var, sxkVarMo111761c);
        this.f7696t = new C1951q(this, dk0Var, sxkVarMo111761c, bf80Var);
        if (looper2 != null) {
            this.f7685i = null;
            this.f7686j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f7685i = handlerThread;
            handlerThread.start();
            this.f7686j = handlerThread.getLooper();
        }
        this.f7684h = qa5Var.mo111761c(this.f7686j, this);
    }

    /* JADX INFO: renamed from: B */
    public static C1894k[] m10190B(u9f u9fVar) {
        int length = u9fVar != null ? u9fVar.length() : 0;
        C1894k[] c1894kArr = new C1894k[length];
        for (int i = 0; i < length; i++) {
            c1894kArr[i] = u9fVar.mo11366m(i);
        }
        return c1894kArr;
    }

    /* JADX INFO: renamed from: B0 */
    public static g m10191B0(AbstractC1857c0 abstractC1857c0, fe80 fe80Var, @Nullable h hVar, C1950p c1950p, int i, boolean z, AbstractC1857c0.d dVar, AbstractC1857c0.b bVar) {
        int iMo9449e;
        boolean z2;
        boolean z3;
        boolean z4;
        int iMo9449e2;
        boolean z5;
        AbstractC1857c0 abstractC1857c1;
        AbstractC1857c0.b bVar2;
        long j;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        if (abstractC1857c0.m9776u()) {
            return new g(fe80.m125285l(), 0L, -9223372036854775807L, false, true, false);
        }
        InterfaceC1988i.b bVar3 = fe80Var.f98630b;
        Object obj = bVar3.f101422a;
        boolean zM10196W = m10196W(fe80Var, bVar);
        long jLongValue = (fe80Var.f98630b.m128142b() || zM10196W) ? fe80Var.f98631c : fe80Var.f98646r;
        long j2 = -9223372036854775807L;
        boolean z9 = false;
        if (hVar != null) {
            Pair<Object, Long> pairM10192C0 = m10192C0(abstractC1857c0, hVar, true, i, z, dVar, bVar);
            if (pairM10192C0 == null) {
                iMo9449e = abstractC1857c0.mo9449e(z);
                jLongValue = jLongValue;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                long j3 = hVar.f7731c;
                Object obj2 = pairM10192C0.first;
                if (j3 == -9223372036854775807L) {
                    iMo9449e = abstractC1857c0.mo9454l(obj2, bVar).f7339c;
                    jLongValue = jLongValue;
                    z6 = false;
                } else {
                    jLongValue = ((Long) pairM10192C0.second).longValue();
                    obj = obj2;
                    iMo9449e = -1;
                    z6 = true;
                }
                z7 = fe80Var.f98633e == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
        } else {
            j2 = -9223372036854775807L;
            if (fe80Var.f98629a.m9776u()) {
                iMo9449e = abstractC1857c0.mo9449e(z);
            } else if (abstractC1857c0.mo9450f(obj) == -1) {
                Object objM10193D0 = m10193D0(dVar, bVar, i, z, obj, fe80Var.f98629a, abstractC1857c0);
                if (objM10193D0 == null) {
                    iMo9449e2 = abstractC1857c0.mo9449e(z);
                    z5 = true;
                } else {
                    iMo9449e2 = abstractC1857c0.mo9454l(objM10193D0, bVar).f7339c;
                    z5 = false;
                }
                iMo9449e = iMo9449e2;
                obj = obj;
                jLongValue = jLongValue;
                z3 = z5;
                z2 = false;
                z4 = false;
            } else if (jLongValue == -9223372036854775807L) {
                iMo9449e = abstractC1857c0.mo9454l(obj, bVar).f7339c;
                obj = obj;
            } else if (zM10196W) {
                fe80Var.f98629a.mo9454l(bVar3.f101422a, bVar);
                if (fe80Var.f98629a.m9774r(bVar.f7339c, dVar).f7379o == fe80Var.f98629a.mo9450f(bVar3.f101422a)) {
                    Pair<Object, Long> pairM9772n = abstractC1857c0.m9772n(dVar, bVar, abstractC1857c0.mo9454l(obj, bVar).f7339c, bVar.m9794q() + jLongValue);
                    obj = pairM9772n.first;
                    jLongValue = ((Long) pairM9772n.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jLongValue;
                }
                iMo9449e = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                obj = obj;
                iMo9449e = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (iMo9449e != -1) {
            abstractC1857c1 = abstractC1857c0;
            Pair<Object, Long> pairM9772n2 = abstractC1857c1.m9772n(dVar, bVar, iMo9449e, -9223372036854775807L);
            bVar2 = bVar;
            obj = pairM9772n2.first;
            jLongValue = ((Long) pairM9772n2.second).longValue();
            j = j2;
        } else {
            abstractC1857c1 = abstractC1857c0;
            bVar2 = bVar;
            j = jLongValue;
        }
        InterfaceC1988i.b bVarM10867E = c1950p.m10867E(abstractC1857c1, obj, jLongValue);
        int i3 = bVarM10867E.f101426e;
        boolean z10 = i3 == -1 || ((i2 = bVar3.f101426e) != -1 && i3 >= i2);
        if (bVar3.f101422a.equals(obj) && !bVar3.m128142b() && !bVarM10867E.m128142b() && z10) {
            z9 = true;
        }
        InterfaceC1988i.b bVar4 = bVarM10867E;
        boolean zM10194S = m10194S(zM10196W, bVar3, jLongValue, bVar4, abstractC1857c1.mo9454l(obj, bVar2), j);
        if (z9 || zM10194S) {
            bVar4 = bVar3;
        }
        if (bVar4.m128142b()) {
            if (bVar4.equals(bVar3)) {
                jLongValue = fe80Var.f98646r;
            } else {
                abstractC1857c1.mo9454l(bVar4.f101422a, bVar2);
                jLongValue = bVar4.f101424c == bVar2.m9791n(bVar4.f101423b) ? bVar2.m9787j() : 0L;
            }
        }
        return new g(bVar4, jLongValue, j, z2, z3, z4);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public static Pair<Object, Long> m10192C0(AbstractC1857c0 abstractC1857c0, h hVar, boolean z, int i, boolean z2, AbstractC1857c0.d dVar, AbstractC1857c0.b bVar) {
        AbstractC1857c0 abstractC1857c1;
        Object objM10193D0;
        AbstractC1857c0 abstractC1857c2 = hVar.f7729a;
        if (abstractC1857c0.m9776u()) {
            return null;
        }
        if (abstractC1857c2.m9776u()) {
            abstractC1857c1 = abstractC1857c2;
            abstractC1857c1 = abstractC1857c0;
        }
        try {
            abstractC1857c1 = abstractC1857c2;
            Pair<Object, Long> pairM9772n = abstractC1857c1.m9772n(dVar, bVar, hVar.f7730b, hVar.f7731c);
            AbstractC1857c0 abstractC1857c3 = abstractC1857c1;
            if (abstractC1857c0.equals(abstractC1857c3)) {
                return pairM9772n;
            }
            if (abstractC1857c0.mo9450f(pairM9772n.first) != -1) {
                return (abstractC1857c3.mo9454l(pairM9772n.first, bVar).f7342f && abstractC1857c3.m9774r(bVar.f7339c, dVar).f7379o == abstractC1857c3.mo9450f(pairM9772n.first)) ? abstractC1857c0.m9772n(dVar, bVar, abstractC1857c0.mo9454l(pairM9772n.first, bVar).f7339c, hVar.f7731c) : pairM9772n;
            }
            if (z && (objM10193D0 = m10193D0(dVar, bVar, i, z2, pairM9772n.first, abstractC1857c3, abstractC1857c0)) != null) {
                return abstractC1857c0.m9772n(dVar, bVar, abstractC1857c0.mo9454l(objM10193D0, bVar).f7339c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: D0 */
    public static Object m10193D0(AbstractC1857c0.d dVar, AbstractC1857c0.b bVar, int i, boolean z, Object obj, AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1) {
        int iMo9450f = abstractC1857c0.mo9450f(obj);
        int iMo9771m = abstractC1857c0.mo9771m();
        int i2 = 0;
        int iM9769h = iMo9450f;
        int iMo9450f2 = -1;
        while (i2 < iMo9771m && iMo9450f2 == -1) {
            AbstractC1857c0.d dVar2 = dVar;
            AbstractC1857c0.b bVar2 = bVar;
            int i3 = i;
            boolean z2 = z;
            AbstractC1857c0 abstractC1857c2 = abstractC1857c0;
            iM9769h = abstractC1857c2.m9769h(iM9769h, bVar2, dVar2, i3, z2);
            if (iM9769h == -1) {
                break;
            }
            iMo9450f2 = abstractC1857c1.mo9450f(abstractC1857c2.mo9456q(iM9769h));
            i2++;
            abstractC1857c0 = abstractC1857c2;
            bVar = bVar2;
            dVar = dVar2;
            i = i3;
            z = z2;
        }
        if (iMo9450f2 == -1) {
            return null;
        }
        return abstractC1857c1.mo9456q(iMo9450f2);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m10194S(boolean z, InterfaceC1988i.b bVar, long j, InterfaceC1988i.b bVar2, AbstractC1857c0.b bVar3, long j2) {
        if (!z && j == j2 && bVar.f101422a.equals(bVar2.f101422a)) {
            if (bVar.m128142b() && bVar3.m9798u(bVar.f101423b)) {
                return (bVar3.m9788k(bVar.f101423b, bVar.f101424c) == 4 || bVar3.m9788k(bVar.f101423b, bVar.f101424c) == 2) ? false : true;
            }
            if (bVar2.m128142b() && bVar3.m9798u(bVar2.f101423b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m10195U(InterfaceC2089x interfaceC2089x) {
        return interfaceC2089x.getState() != 0;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m10196W(fe80 fe80Var, AbstractC1857c0.b bVar) {
        InterfaceC1988i.b bVar2 = fe80Var.f98630b;
        AbstractC1857c0 abstractC1857c0 = fe80Var.f98629a;
        return abstractC1857c0.m9776u() || abstractC1857c0.mo9454l(bVar2.f101422a, bVar).f7342f;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10198g(C1893j c1893j, C2027u c2027u) {
        c1893j.getClass();
        try {
            c1893j.m10287p(c2027u);
        } catch (ExoPlaybackException e2) {
            kyv.m152146d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            iig0.m140070a(e2);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m10201y0(AbstractC1857c0 abstractC1857c0, d dVar, AbstractC1857c0.d dVar2, AbstractC1857c0.b bVar) {
        int i = abstractC1857c0.m9774r(abstractC1857c0.mo9454l(dVar.f7715d, bVar).f7339c, dVar2).f7380p;
        Object obj = abstractC1857c0.mo9453k(i, bVar, true).f7338b;
        long j = bVar.f7340d;
        dVar.m10324b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m10202z0(d dVar, AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1, int i, boolean z, AbstractC1857c0.d dVar2, AbstractC1857c0.b bVar) {
        Object obj = dVar.f7715d;
        if (obj == null) {
            Pair<Object, Long> pairM10192C0 = m10192C0(abstractC1857c0, new h(dVar.f7712a.m11851h(), dVar.f7712a.m11847d(), dVar.f7712a.m11849f() == Long.MIN_VALUE ? -9223372036854775807L : bmk0.m105084J0(dVar.f7712a.m11849f())), false, i, z, dVar2, bVar);
            if (pairM10192C0 == null) {
                return false;
            }
            dVar.m10324b(abstractC1857c0.mo9450f(pairM10192C0.first), ((Long) pairM10192C0.second).longValue(), pairM10192C0.first);
            if (dVar.f7712a.m11849f() == Long.MIN_VALUE) {
                m10201y0(abstractC1857c0, dVar, dVar2, bVar);
            }
            return true;
        }
        int iMo9450f = abstractC1857c0.mo9450f(obj);
        if (iMo9450f == -1) {
            return false;
        }
        if (dVar.f7712a.m11849f() == Long.MIN_VALUE) {
            m10201y0(abstractC1857c0, dVar, dVar2, bVar);
            return true;
        }
        dVar.f7713b = iMo9450f;
        abstractC1857c1.mo9454l(dVar.f7715d, bVar);
        if (bVar.f7342f && abstractC1857c1.m9774r(bVar.f7339c, dVar2).f7379o == abstractC1857c1.mo9450f(dVar.f7715d)) {
            Pair<Object, Long> pairM9772n = abstractC1857c0.m9772n(dVar2, bVar, abstractC1857c0.mo9454l(dVar.f7715d, bVar).f7339c, dVar.f7714c + bVar.m9794q());
            dVar.m10324b(abstractC1857c0.mo9450f(pairM9772n.first), ((Long) pairM9772n.second).longValue(), pairM9772n.first);
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final long m10203A() {
        fe80 fe80Var = this.f7700x;
        return m10205C(fe80Var.f98629a, fe80Var.f98630b.f101422a, fe80Var.f98646r);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m10204A0(AbstractC1857c0 abstractC1857c0, AbstractC1857c0 abstractC1857c1) {
        if (abstractC1857c0.m9776u() && abstractC1857c1.m9776u()) {
            return;
        }
        int size = this.f7692p.size() - 1;
        while (true) {
            ArrayList<d> arrayList = this.f7692p;
            if (size < 0) {
                Collections.sort(arrayList);
                return;
            }
            AbstractC1857c0 abstractC1857c2 = abstractC1857c0;
            AbstractC1857c0 abstractC1857c3 = abstractC1857c1;
            if (!m10202z0(arrayList.get(size), abstractC1857c2, abstractC1857c3, this.f7664E, this.f7665F, this.f7687k, this.f7688l)) {
                this.f7692p.get(size).f7712a.m11854k(false);
                this.f7692p.remove(size);
            }
            size--;
            abstractC1857c0 = abstractC1857c2;
            abstractC1857c1 = abstractC1857c3;
        }
    }

    /* JADX INFO: renamed from: C */
    public final long m10205C(AbstractC1857c0 abstractC1857c0, Object obj, long j) {
        abstractC1857c0.m9774r(abstractC1857c0.mo9454l(obj, this.f7688l).f7339c, this.f7687k);
        AbstractC1857c0.d dVar = this.f7687k;
        if (dVar.f7370f != -9223372036854775807L && dVar.m9808h()) {
            AbstractC1857c0.d dVar2 = this.f7687k;
            if (dVar2.f7373i) {
                return bmk0.m105084J0(dVar2.m9803c() - this.f7687k.f7370f) - (j + this.f7688l.m9794q());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: D */
    public final long m10206D() {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        if (eyxVarM10891s == null) {
            return 0L;
        }
        long jM123286l = eyxVarM10891s.m123286l();
        if (!eyxVarM10891s.f96525d) {
            return jM123286l;
        }
        int i = 0;
        while (true) {
            InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
            if (i >= interfaceC2089xArr.length) {
                return jM123286l;
            }
            if (m10195U(interfaceC2089xArr[i]) && this.f7677a[i].getStream() == eyxVarM10891s.f96524c[i]) {
                long jMo9831k = this.f7677a[i].mo9831k();
                if (jMo9831k == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM123286l = Math.max(jMo9831k, jM123286l);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: E */
    public final Pair<InterfaceC1988i.b, Long> m10207E(AbstractC1857c0 abstractC1857c0) {
        if (abstractC1857c0.m9776u()) {
            return Pair.create(fe80.m125285l(), 0L);
        }
        Pair<Object, Long> pairM9772n = abstractC1857c0.m9772n(this.f7687k, this.f7688l, abstractC1857c0.mo9449e(this.f7665F), -9223372036854775807L);
        InterfaceC1988i.b bVarM10867E = this.f7695s.m10867E(abstractC1857c0, pairM9772n.first, 0L);
        long jLongValue = ((Long) pairM9772n.second).longValue();
        if (bVarM10867E.m128142b()) {
            abstractC1857c0.mo9454l(bVarM10867E.f101422a, this.f7688l);
            jLongValue = bVarM10867E.f101424c == this.f7688l.m9791n(bVarM10867E.f101423b) ? this.f7688l.m9787j() : 0L;
        }
        return Pair.create(bVarM10867E, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m10208E0(long j, long j2) {
        this.f7684h.mo131273k(2, j + j2);
    }

    /* JADX INFO: renamed from: F */
    public Looper m10209F() {
        return this.f7686j;
    }

    /* JADX INFO: renamed from: F0 */
    public void m10210F0(AbstractC1857c0 abstractC1857c0, int i, long j) {
        this.f7684h.mo131265c(3, new h(abstractC1857c0, i, j)).mo131275a();
    }

    /* JADX INFO: renamed from: G */
    public final long m10211G() {
        return m10213H(this.f7700x.f98644p);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10212G0(boolean z) throws ExoPlaybackException {
        InterfaceC1988i.b bVar = this.f7695s.m10890r().f96527f.f107120a;
        long jM10218J0 = m10218J0(bVar, this.f7700x.f98646r, true, false);
        if (jM10218J0 != this.f7700x.f98646r) {
            fe80 fe80Var = this.f7700x;
            this.f7700x = m10229P(bVar, jM10218J0, fe80Var.f98631c, fe80Var.f98632d, z, 5);
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m10213H(long j) {
        eyx eyxVarM10884l = this.f7695s.m10884l();
        if (eyxVarM10884l == null) {
            return 0L;
        }
        return Math.max(0L, j - eyxVarM10884l.m123298y(this.f7671L));
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
    public final void m10214H0(h hVar) throws Throwable {
        long jLongValue;
        InterfaceC1988i.b bVarM10867E;
        long j;
        boolean z;
        long j2;
        long j3;
        fe80 fe80Var;
        long jMo10981g;
        boolean z2;
        long jM10216I0;
        InterfaceC1988i.b bVar;
        long j4;
        InterfaceC1988i.b bVar2;
        long j5;
        eyx eyxVarM10890r;
        fe80 fe80Var2;
        int i;
        int i2;
        long j6;
        C1893j c1893j = this;
        c1893j.f7701y.m10326b(1);
        Pair<Object, Long> pairM10192C0 = m10192C0(c1893j.f7700x.f98629a, hVar, true, c1893j.f7664E, c1893j.f7665F, c1893j.f7687k, c1893j.f7688l);
        try {
            try {
                if (pairM10192C0 != null) {
                    Object obj = pairM10192C0.first;
                    jLongValue = ((Long) pairM10192C0.second).longValue();
                    long j7 = hVar.f7731c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    bVarM10867E = c1893j.f7695s.m10867E(c1893j.f7700x.f98629a, obj, jLongValue);
                    if (bVarM10867E.m128142b()) {
                        c1893j.f7700x.f98629a.mo9454l(bVarM10867E.f101422a, c1893j.f7688l);
                        jLongValue = c1893j.f7688l.m9791n(bVarM10867E.f101423b) == bVarM10867E.f101424c ? c1893j.f7688l.m9787j() : 0L;
                        z = true;
                        j2 = j7;
                    } else {
                        j = 0;
                        z = hVar.f7731c == -9223372036854775807L;
                        j2 = j7;
                    }
                    if (c1893j.f7700x.f98629a.m9776u()) {
                        fe80Var = c1893j.f7700x;
                        if (pairM10192C0 == null) {
                            if (fe80Var.f98633e != 1) {
                                c1893j.m10272j1(4);
                            }
                            c1893j.m10305v0(false, true, false, true);
                        } else {
                            if (bVarM10867E.equals(fe80Var.f98630b)) {
                                eyxVarM10890r = c1893j.f7695s.m10890r();
                                if (eyxVarM10890r == null && eyxVarM10890r.f96525d && jLongValue != j) {
                                    jMo10981g = eyxVarM10890r.f96522a.mo10981g(jLongValue, c1893j.f7699w);
                                } else {
                                    jMo10981g = jLongValue;
                                }
                                if (bmk0.m105152l1(jMo10981g) != bmk0.m105152l1(c1893j.f7700x.f98646r) && ((i = (fe80Var2 = c1893j.f7700x).f98633e) == 2 || i == 3)) {
                                    j5 = fe80Var2.f98646r;
                                    bVar2 = bVarM10867E;
                                    i2 = 2;
                                    z = z;
                                    j6 = j5;
                                }
                            } else {
                                jMo10981g = jLongValue;
                            }
                            try {
                                if (c1893j.f7700x.f98633e == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                jM10216I0 = c1893j.m10216I0(bVarM10867E, jMo10981g, z2);
                                z = (jLongValue != jM10216I0) | z;
                                try {
                                    fe80 fe80Var3 = c1893j.f7700x;
                                    bVar = bVarM10867E;
                                    try {
                                        AbstractC1857c0 abstractC1857c0 = fe80Var3.f98629a;
                                        j4 = j2;
                                        try {
                                            c1893j.m10312x1(abstractC1857c0, bVar, abstractC1857c0, fe80Var3.f98630b, j4, true);
                                            bVar2 = bVar;
                                            j2 = j4;
                                            j5 = jM10216I0;
                                            i2 = 2;
                                            j6 = j5;
                                            c1893j = this;
                                        } catch (Throwable th) {
                                            th = th;
                                            bVarM10867E = bVar;
                                            j2 = j4;
                                            j3 = jM10216I0;
                                            c1893j.f7700x = c1893j.m10229P(bVarM10867E, j3, j2, j3, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVarM10867E = bVar;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j3 = jLongValue;
                                c1893j.f7700x = c1893j.m10229P(bVarM10867E, j3, j2, j3, z, 2);
                                throw th;
                            }
                        }
                        c1893j.f7700x = c1893j.m10229P(bVar2, j5, j2, j6, z, i2);
                        return;
                    }
                    c1893j.f7670K = hVar;
                    z = z;
                    bVar2 = bVarM10867E;
                    j5 = jLongValue;
                    i2 = 2;
                    j6 = j5;
                    c1893j = this;
                    c1893j.f7700x = c1893j.m10229P(bVar2, j5, j2, j6, z, i2);
                    return;
                }
                Pair<InterfaceC1988i.b, Long> pairM10207E = c1893j.m10207E(c1893j.f7700x.f98629a);
                bVarM10867E = (InterfaceC1988i.b) pairM10207E.first;
                jLongValue = ((Long) pairM10207E.second).longValue();
                z = !c1893j.f7700x.f98629a.m9776u();
                j2 = -9223372036854775807L;
                if (c1893j.f7700x.f98629a.m9776u()) {
                    fe80Var = c1893j.f7700x;
                    if (pairM10192C0 == null) {
                        if (fe80Var.f98633e != 1) {
                            c1893j.m10272j1(4);
                        }
                        c1893j.m10305v0(false, true, false, true);
                    } else {
                        if (bVarM10867E.equals(fe80Var.f98630b)) {
                            eyxVarM10890r = c1893j.f7695s.m10890r();
                            if (eyxVarM10890r == null) {
                                jMo10981g = jLongValue;
                            } else {
                                jMo10981g = jLongValue;
                            }
                            if (bmk0.m105152l1(jMo10981g) != bmk0.m105152l1(c1893j.f7700x.f98646r)) {
                            }
                        } else {
                            jMo10981g = jLongValue;
                        }
                        if (c1893j.f7700x.f98633e == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jM10216I0 = c1893j.m10216I0(bVarM10867E, jMo10981g, z2);
                        z = (jLongValue != jM10216I0) | z;
                        fe80 fe80Var4 = c1893j.f7700x;
                        bVar = bVarM10867E;
                        AbstractC1857c0 abstractC1857c1 = fe80Var4.f98629a;
                        j4 = j2;
                        c1893j.m10312x1(abstractC1857c1, bVar, abstractC1857c1, fe80Var4.f98630b, j4, true);
                        bVar2 = bVar;
                        j2 = j4;
                        j5 = jM10216I0;
                        i2 = 2;
                        j6 = j5;
                        c1893j = this;
                    }
                    c1893j.f7700x = c1893j.m10229P(bVar2, j5, j2, j6, z, i2);
                    return;
                }
                c1893j.f7670K = hVar;
                z = z;
                bVar2 = bVarM10867E;
                j5 = jLongValue;
                i2 = 2;
                j6 = j5;
                c1893j = this;
                c1893j.f7700x = c1893j.m10229P(bVar2, j5, j2, j6, z, i2);
                return;
            } catch (Throwable th5) {
                th = th5;
                bVarM10867E = bVarM10867E;
                j3 = jLongValue;
                c1893j.f7700x = c1893j.m10229P(bVarM10867E, j3, j2, j3, z, 2);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bVarM10867E = bVarM10867E;
        }
        j = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m10215I(InterfaceC1976h interfaceC1976h) {
        if (this.f7695s.m10897y(interfaceC1976h)) {
            this.f7695s.m10865B(this.f7671L);
            m10242X();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final long m10216I0(InterfaceC1988i.b bVar, long j, boolean z) throws ExoPlaybackException {
        return m10218J0(bVar, j, this.f7695s.m10890r() != this.f7695s.m10891s(), z);
    }

    /* JADX INFO: renamed from: J */
    public final void m10217J(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i);
        eyx eyxVarM10890r = this.f7695s.m10890r();
        if (eyxVarM10890r != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(eyxVarM10890r.f96527f.f107120a);
        }
        kyv.m152146d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForSource);
        m10295r1(false, false);
        this.f7700x = this.f7700x.m125291f(exoPlaybackExceptionCreateForSource);
    }

    /* JADX INFO: renamed from: J0 */
    public final long m10218J0(InterfaceC1988i.b bVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        C1950p c1950p;
        m10297s1();
        this.f7662C = false;
        if (z2 || this.f7700x.f98633e == 3) {
            m10272j1(2);
        }
        eyx eyxVarM10890r = this.f7695s.m10890r();
        eyx eyxVarM123284j = eyxVarM10890r;
        while (eyxVarM123284j != null && !bVar.equals(eyxVarM123284j.f96527f.f107120a)) {
            eyxVarM123284j = eyxVarM123284j.m123284j();
        }
        if (z || eyxVarM10890r != eyxVarM123284j || (eyxVarM123284j != null && eyxVarM123284j.m123299z(j) < 0)) {
            for (InterfaceC2089x interfaceC2089x : this.f7677a) {
                m10290q(interfaceC2089x);
            }
            if (eyxVarM123284j != null) {
                while (true) {
                    eyx eyxVarM10890r2 = this.f7695s.m10890r();
                    c1950p = this.f7695s;
                    if (eyxVarM10890r2 == eyxVarM123284j) {
                        break;
                    }
                    c1950p.m10874b();
                }
                c1950p.m10866C(eyxVarM123284j);
                eyxVarM123284j.m123297x(1000000000000L);
                m10301u();
            }
        }
        C1950p c1950p2 = this.f7695s;
        if (eyxVarM123284j != null) {
            c1950p2.m10866C(eyxVarM123284j);
            if (!eyxVarM123284j.f96525d) {
                eyxVarM123284j.f96527f = eyxVarM123284j.f96527f.m133032b(j);
            } else if (eyxVarM123284j.f96526e) {
                j = eyxVarM123284j.f96522a.mo10982h(j);
                eyxVarM123284j.f96522a.mo10991t(j - this.f7689m, this.f7690n);
            }
            m10311x0(j);
            m10242X();
        } else {
            c1950p2.m10878f();
            m10311x0(j);
        }
        m10219K(false);
        this.f7684h.mo131272j(2);
        return j;
    }

    /* JADX INFO: renamed from: K */
    public final void m10219K(boolean z) {
        eyx eyxVarM10884l = this.f7695s.m10884l();
        InterfaceC1988i.b bVar = eyxVarM10884l == null ? this.f7700x.f98630b : eyxVarM10884l.f96527f.f107120a;
        boolean zEquals = this.f7700x.f98639k.equals(bVar);
        if (!zEquals) {
            this.f7700x = this.f7700x.m125288c(bVar);
        }
        fe80 fe80Var = this.f7700x;
        fe80Var.f98644p = eyxVarM10884l == null ? fe80Var.f98646r : eyxVarM10884l.m123283i();
        this.f7700x.f98645q = m10211G();
        if ((!zEquals || z) && eyxVarM10884l != null && eyxVarM10884l.f96525d) {
            m10303u1(eyxVarM10884l.f96527f.f107120a, eyxVarM10884l.m123288n(), eyxVarM10884l.m123289o());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m10220K0(C2027u c2027u) throws ExoPlaybackException {
        if (c2027u.m11849f() == -9223372036854775807L) {
            m10222L0(c2027u);
            return;
        }
        if (this.f7700x.f98629a.m9776u()) {
            this.f7692p.add(new d(c2027u));
            return;
        }
        d dVar = new d(c2027u);
        AbstractC1857c0 abstractC1857c0 = this.f7700x.f98629a;
        if (!m10202z0(dVar, abstractC1857c0, abstractC1857c0, this.f7664E, this.f7665F, this.f7687k, this.f7688l)) {
            c2027u.m11854k(false);
        } else {
            this.f7692p.add(dVar);
            Collections.sort(this.f7692p);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m10221L(AbstractC1857c0 abstractC1857c0, boolean z) throws Throwable {
        int i;
        AbstractC1857c0 abstractC1857c1;
        AbstractC1857c0 abstractC1857c2;
        g gVarM10191B0 = m10191B0(abstractC1857c0, this.f7700x, this.f7670K, this.f7695s, this.f7664E, this.f7665F, this.f7687k, this.f7688l);
        InterfaceC1988i.b bVar = gVarM10191B0.f7723a;
        long j = gVarM10191B0.f7725c;
        boolean z2 = gVarM10191B0.f7726d;
        long jM10216I0 = gVarM10191B0.f7724b;
        int i2 = 1;
        boolean z3 = (this.f7700x.f98630b.equals(bVar) && jM10216I0 == this.f7700x.f98646r) ? false : true;
        AbstractC1857c0 abstractC1857c3 = null;
        try {
            if (gVarM10191B0.f7727e) {
                if (this.f7700x.f98633e != 1) {
                    m10272j1(4);
                }
                m10305v0(false, false, false, true);
            }
            try {
                if (z3) {
                    abstractC1857c2 = abstractC1857c0;
                    i2 = -1;
                    i = 4;
                    if (!abstractC1857c2.m9776u()) {
                        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null; eyxVarM10890r = eyxVarM10890r.m123284j()) {
                            if (eyxVarM10890r.f96527f.f107120a.equals(bVar)) {
                                eyxVarM10890r.f96527f = this.f7695s.m10892t(abstractC1857c2, eyxVarM10890r.f96527f);
                                eyxVarM10890r.m123275A();
                            }
                        }
                        jM10216I0 = m10216I0(bVar, jM10216I0, z2);
                    }
                } else {
                    try {
                        try {
                            i = 4;
                            try {
                                i2 = -1;
                                try {
                                    abstractC1857c2 = abstractC1857c0;
                                    if (!this.f7695s.m10871I(abstractC1857c0, this.f7671L, m10206D())) {
                                        m10212G0(false);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    abstractC1857c3 = abstractC1857c0;
                                    abstractC1857c1 = abstractC1857c3;
                                    fe80 fe80Var = this.f7700x;
                                    m10312x1(abstractC1857c1, bVar, fe80Var.f98629a, fe80Var.f98630b, gVarM10191B0.f7728f ? jM10216I0 : -9223372036854775807L, false);
                                    if (z3 || j != this.f7700x.f98631c) {
                                        fe80 fe80Var2 = this.f7700x;
                                        Object obj = fe80Var2.f98630b.f101422a;
                                        AbstractC1857c0 abstractC1857c4 = fe80Var2.f98629a;
                                        this.f7700x = m10229P(bVar, jM10216I0, j, this.f7700x.f98632d, z3 && z && !abstractC1857c4.m9776u() && !abstractC1857c4.mo9454l(obj, this.f7688l).f7342f, abstractC1857c1.mo9450f(obj) == i2 ? i : 3);
                                    }
                                    m10308w0();
                                    m10204A0(abstractC1857c1, this.f7700x.f98629a);
                                    this.f7700x = this.f7700x.m125295j(abstractC1857c1);
                                    if (!abstractC1857c1.m9776u()) {
                                        this.f7670K = null;
                                    }
                                    m10219K(false);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                abstractC1857c3 = abstractC1857c0;
                                i2 = -1;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC1857c3 = abstractC1857c0;
                            i2 = -1;
                            i = 4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC1857c3 = abstractC1857c0;
                        i2 = -1;
                        i = 4;
                    }
                }
                fe80 fe80Var3 = this.f7700x;
                m10312x1(abstractC1857c2, bVar, fe80Var3.f98629a, fe80Var3.f98630b, gVarM10191B0.f7728f ? jM10216I0 : -9223372036854775807L, false);
                if (z3 || j != this.f7700x.f98631c) {
                    fe80 fe80Var4 = this.f7700x;
                    Object obj2 = fe80Var4.f98630b.f101422a;
                    AbstractC1857c0 abstractC1857c5 = fe80Var4.f98629a;
                    this.f7700x = m10229P(bVar, jM10216I0, j, this.f7700x.f98632d, z3 && z && !abstractC1857c5.m9776u() && !abstractC1857c5.mo9454l(obj2, this.f7688l).f7342f, abstractC1857c2.mo9450f(obj2) == i2 ? i : 3);
                }
                m10308w0();
                m10204A0(abstractC1857c2, this.f7700x.f98629a);
                this.f7700x = this.f7700x.m125295j(abstractC1857c2);
                if (!abstractC1857c2.m9776u()) {
                    this.f7670K = null;
                }
                m10219K(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i2 = -1;
            i = 4;
            abstractC1857c1 = abstractC1857c0;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m10222L0(C2027u c2027u) throws ExoPlaybackException {
        if (c2027u.m11846c() != this.f7686j) {
            this.f7684h.mo131265c(15, c2027u).mo131275a();
            return;
        }
        m10287p(c2027u);
        int i = this.f7700x.f98633e;
        if (i == 3 || i == 2) {
            this.f7684h.mo131272j(2);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10223M(InterfaceC1976h interfaceC1976h) throws ExoPlaybackException {
        C1893j c1893j;
        if (this.f7695s.m10897y(interfaceC1976h)) {
            eyx eyxVarM10884l = this.f7695s.m10884l();
            eyxVarM10884l.m123290p(this.f7691o.getPlaybackParameters().f8288a, this.f7700x.f98629a);
            m10303u1(eyxVarM10884l.f96527f.f107120a, eyxVarM10884l.m123288n(), eyxVarM10884l.m123289o());
            if (eyxVarM10884l == this.f7695s.m10890r()) {
                m10311x0(eyxVarM10884l.f96527f.f107121b);
                m10301u();
                fe80 fe80Var = this.f7700x;
                InterfaceC1988i.b bVar = fe80Var.f98630b;
                long j = eyxVarM10884l.f96527f.f107121b;
                c1893j = this;
                c1893j.f7700x = c1893j.m10229P(bVar, j, fe80Var.f98631c, j, false, 5);
            } else {
                c1893j = this;
            }
            c1893j.m10242X();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m10224M0(final C2027u c2027u) {
        Looper looperM11846c = c2027u.m11846c();
        if (looperM11846c.getThread().isAlive()) {
            this.f7693q.mo111761c(looperM11846c, null).mo131271i(new Runnable() { // from class: l.s9f
                @Override // java.lang.Runnable
                public final void run() {
                    C1893j.m10198g(this.f166931a, c2027u);
                }
            });
        } else {
            kyv.m152151i("TAG", "Trying to send message on a dead thread.");
            c2027u.m11854k(false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10225N(C1953s c1953s, float f2, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.f7701y.m10326b(1);
            }
            this.f7700x = this.f7700x.m125292g(c1953s);
        }
        m10314y1(c1953s.f8288a);
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            if (interfaceC2089x != null) {
                interfaceC2089x.mo10422A(f2, c1953s.f8288a);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m10226N0(long j) {
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            if (interfaceC2089x.getStream() != null) {
                m10228O0(interfaceC2089x, j);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m10227O(C1953s c1953s, boolean z) throws ExoPlaybackException {
        m10225N(c1953s, c1953s.f8288a, true, z);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m10228O0(InterfaceC2089x interfaceC2089x, long j) {
        interfaceC2089x.mo9836s();
        if (interfaceC2089x instanceof esi0) {
            ((esi0) interfaceC2089x).m122369h0(j);
        }
    }

    @CheckResult
    /* JADX INFO: renamed from: P */
    public final fe80 m10229P(InterfaceC1988i.b bVar, long j, long j2, long j3, boolean z, int i) {
        List<Metadata> list;
        ffj0 ffj0Var;
        dgj0 dgj0Var;
        this.f7673N = (!this.f7673N && j == this.f7700x.f98646r && bVar.equals(this.f7700x.f98630b)) ? false : true;
        m10308w0();
        fe80 fe80Var = this.f7700x;
        ffj0 ffj0Var2 = fe80Var.f98636h;
        dgj0 dgj0Var2 = fe80Var.f98637i;
        List<Metadata> listM15739of = fe80Var.f98638j;
        if (this.f7696t.m10921t()) {
            eyx eyxVarM10890r = this.f7695s.m10890r();
            ffj0 ffj0VarM123288n = eyxVarM10890r == null ? ffj0.f98782d : eyxVarM10890r.m123288n();
            dgj0 dgj0VarM123289o = eyxVarM10890r == null ? this.f7681e : eyxVarM10890r.m123289o();
            ImmutableList<Metadata> immutableListM10315z = m10315z(dgj0VarM123289o.f88312c);
            if (eyxVarM10890r != null) {
                gyx gyxVar = eyxVarM10890r.f96527f;
                if (gyxVar.f107122c != j2) {
                    eyxVarM10890r.f96527f = gyxVar.m133031a(j2);
                }
            }
            ffj0Var = ffj0VarM123288n;
            dgj0Var = dgj0VarM123289o;
            list = immutableListM10315z;
        } else {
            if (!bVar.equals(this.f7700x.f98630b)) {
                ffj0Var2 = ffj0.f98782d;
                dgj0Var2 = this.f7681e;
                listM15739of = ImmutableList.m15739of();
            }
            list = listM15739of;
            ffj0Var = ffj0Var2;
            dgj0Var = dgj0Var2;
        }
        if (z) {
            this.f7701y.m10329e(i);
        }
        return this.f7700x.m125289d(bVar, j, j2, j3, m10211G(), ffj0Var, dgj0Var, list);
    }

    /* JADX INFO: renamed from: P0 */
    public synchronized boolean m10230P0(boolean z) {
        if (!this.f7702z && this.f7686j.getThread().isAlive()) {
            if (z) {
                this.f7684h.mo131267e(13, 1, 0).mo131275a();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f7684h.mo131268f(13, 0, 0, atomicBoolean).mo131275a();
            m10316z1(new b7h0() { // from class: l.q9f
                @Override // p153l.b7h0
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.f7675P);
            return atomicBoolean.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10231Q(InterfaceC2089x interfaceC2089x, eyx eyxVar) {
        eyx eyxVarM123284j = eyxVar.m123284j();
        if (eyxVar.f96527f.f107125f && eyxVarM123284j.f96525d) {
            return (interfaceC2089x instanceof esi0) || (interfaceC2089x instanceof C1912a) || interfaceC2089x.mo9831k() >= eyxVarM123284j.m123287m();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10232Q0(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f7666G != z) {
            this.f7666G = z;
            if (!z) {
                for (InterfaceC2089x interfaceC2089x : this.f7677a) {
                    if (!m10195U(interfaceC2089x) && this.f7678b.remove(interfaceC2089x)) {
                        interfaceC2089x.reset();
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
    public final boolean m10233R() {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        if (!eyxVarM10891s.f96525d) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
            if (i >= interfaceC2089xArr.length) {
                return true;
            }
            InterfaceC2089x interfaceC2089x = interfaceC2089xArr[i];
            xwd0 xwd0Var = eyxVarM10891s.f96524c[i];
            if (interfaceC2089x.getStream() != xwd0Var || (xwd0Var != null && !interfaceC2089x.mo9829d() && !m10231Q(interfaceC2089x, eyxVarM10891s))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m10234R0(C1953s c1953s) {
        this.f7684h.mo131274l(16);
        this.f7691o.setPlaybackParameters(c1953s);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m10235S0(b bVar) throws Throwable {
        this.f7701y.m10326b(1);
        if (bVar.f7706c != -1) {
            this.f7670K = new h(new C2080v(bVar.f7704a, bVar.f7705b), bVar.f7706c, bVar.f7707d);
        }
        m10221L(this.f7696t.m10910C(bVar.f7704a, bVar.f7705b), false);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m10236T() {
        eyx eyxVarM10884l = this.f7695s.m10884l();
        return (eyxVarM10884l == null || eyxVarM10884l.m123285k() == Long.MIN_VALUE) ? false : true;
    }

    /* JADX INFO: renamed from: T0 */
    public void m10237T0(List<C1951q.c> list, int i, long j, n8f0 n8f0Var) {
        this.f7684h.mo131265c(17, new b(list, n8f0Var, i, j, null)).mo131275a();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m10238U0(boolean z) {
        if (z == this.f7668I) {
            return;
        }
        this.f7668I = z;
        if (z || !this.f7700x.f98643o) {
            return;
        }
        this.f7684h.mo131272j(2);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m10239V() {
        eyx eyxVarM10890r = this.f7695s.m10890r();
        long j = eyxVarM10890r.f96527f.f107124e;
        if (eyxVarM10890r.f96525d) {
            return j == -9223372036854775807L || this.f7700x.f98646r < j || !m10280m1();
        }
        return false;
    }

    /* JADX INFO: renamed from: V0 */
    public void m10240V0(boolean z) {
        this.f7684h.mo131267e(23, z ? 1 : 0, 0).mo131275a();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m10241W0(boolean z) throws ExoPlaybackException {
        this.f7660A = z;
        m10308w0();
        if (!this.f7661B || this.f7695s.m10891s() == this.f7695s.m10890r()) {
            return;
        }
        m10212G0(true);
        m10219K(false);
    }

    /* JADX INFO: renamed from: X */
    public final void m10242X() {
        boolean zM10277l1 = m10277l1();
        this.f7663D = zM10277l1;
        if (zM10277l1) {
            this.f7695s.m10884l().m123279d(this.f7671L);
        }
        m10300t1();
    }

    /* JADX INFO: renamed from: X0 */
    public void m10243X0(boolean z, int i) {
        this.f7684h.mo131267e(1, z ? 1 : 0, i).mo131275a();
    }

    /* JADX INFO: renamed from: Y */
    public final void m10244Y() {
        this.f7701y.m10328d(this.f7700x);
        if (this.f7701y.f7716a) {
            this.f7694r.mo10330a(this.f7701y);
            this.f7701y = new e(this.f7700x);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m10245Y0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f7701y.m10326b(z2 ? 1 : 0);
        this.f7701y.m10327c(i2);
        this.f7700x = this.f7700x.m125290e(z, i);
        this.f7662C = false;
        m10268i0(z);
        if (!m10280m1()) {
            m10297s1();
            m10309w1();
            return;
        }
        int i3 = this.f7700x.f98633e;
        if (i3 == 3) {
            m10289p1();
            this.f7684h.mo131272j(2);
        } else if (i3 == 2) {
            this.f7684h.mo131272j(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10246Z(long j, long j2) throws ExoPlaybackException {
        if (this.f7692p.isEmpty() || this.f7700x.f98630b.m128142b()) {
            return;
        }
        if (this.f7673N) {
            j--;
            this.f7673N = false;
        }
        fe80 fe80Var = this.f7700x;
        int iMo9450f = fe80Var.f98629a.mo9450f(fe80Var.f98630b.f101422a);
        int iMin = Math.min(this.f7672M, this.f7692p.size());
        d dVar = iMin > 0 ? this.f7692p.get(iMin - 1) : null;
        while (dVar != null) {
            int i = dVar.f7713b;
            if (i <= iMo9450f && (i != iMo9450f || dVar.f7714c <= j)) {
                break;
            }
            int i2 = iMin - 1;
            dVar = i2 > 0 ? this.f7692p.get(iMin - 2) : null;
            iMin = i2;
        }
        if (iMin < this.f7692p.size()) {
            d dVar2 = this.f7692p.get(iMin);
            while (dVar2 != null && dVar2.f7715d != null) {
                int i3 = dVar2.f7713b;
                if (i3 >= iMo9450f && (i3 != iMo9450f || dVar2.f7714c > j)) {
                    break;
                }
                iMin++;
                dVar2 = iMin < this.f7692p.size() ? this.f7692p.get(iMin) : null;
            }
            while (dVar2 != null && dVar2.f7715d != null && dVar2.f7713b == iMo9450f) {
                long j3 = dVar2.f7714c;
                if (j3 <= j || j3 > j2) {
                    break;
                }
                try {
                    m10222L0(dVar2.f7712a);
                    if (dVar2.f7712a.m11845b() || dVar2.f7712a.m11853j()) {
                        this.f7692p.remove(iMin);
                    } else {
                        iMin++;
                    }
                    dVar2 = iMin < this.f7692p.size() ? this.f7692p.get(iMin) : null;
                } catch (Throwable th) {
                    if (dVar2.f7712a.m11845b() || dVar2.f7712a.m11853j()) {
                        this.f7692p.remove(iMin);
                    }
                    throw th;
                }
            }
            this.f7672M = iMin;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m10247Z0(C1953s c1953s) {
        this.f7684h.mo131265c(4, c1953s).mo131275a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10248a0() throws ExoPlaybackException {
        gyx gyxVarM10889q;
        this.f7695s.m10865B(this.f7671L);
        if (this.f7695s.m10869G() && (gyxVarM10889q = this.f7695s.m10889q(this.f7671L, this.f7700x)) != null) {
            eyx eyxVarM10879g = this.f7695s.m10879g(this.f7679c, this.f7680d, this.f7682f.mo155821i(), this.f7696t, gyxVarM10889q, this.f7681e);
            eyxVarM10879g.f96522a.mo10987p(this, gyxVarM10889q.f107121b);
            if (this.f7695s.m10890r() == eyxVarM10879g) {
                m10311x0(gyxVarM10889q.f107121b);
            }
            m10219K(false);
        }
        if (!this.f7663D) {
            m10242X();
        } else {
            this.f7663D = m10236T();
            m10300t1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m10249a1(C1953s c1953s) throws ExoPlaybackException {
        m10234R0(c1953s);
        m10227O(this.f7691o.getPlaybackParameters(), true);
    }

    @Override // p153l.cgj0.InterfaceC16249a
    /* JADX INFO: renamed from: b */
    public void mo10250b(InterfaceC2089x interfaceC2089x) {
        this.f7684h.mo131272j(26);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX INFO: renamed from: b0 */
    public final void m10251b0() throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        while (this.m10274k1()) {
            if (z2) {
                this.m10244Y();
            }
            eyx eyxVar = (eyx) w11.m204369e(this.f7695s.m10874b());
            if (this.f7700x.f98630b.f101422a.equals(eyxVar.f96527f.f107120a.f101422a)) {
                InterfaceC1988i.b bVar = this.f7700x.f98630b;
                if (bVar.f101423b == -1) {
                    InterfaceC1988i.b bVar2 = eyxVar.f96527f.f107120a;
                    if (bVar2.f101423b != -1 || bVar.f101426e == bVar2.f101426e) {
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
            gyx gyxVar = eyxVar.f96527f;
            InterfaceC1988i.b bVar3 = gyxVar.f107120a;
            long j = gyxVar.f107121b;
            C1893j c1893j = this;
            c1893j.f7700x = c1893j.m10229P(bVar3, j, gyxVar.f107122c, j, !z, 0);
            c1893j.m10308w0();
            c1893j.m10309w1();
            z2 = true;
            this = c1893j;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m10252b1(int i) {
        this.f7684h.mo131267e(11, i, 0).mo131275a();
    }

    @Override // p153l.cgj0.InterfaceC16249a
    /* JADX INFO: renamed from: c */
    public void mo10253c() {
        this.f7684h.mo131272j(10);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m10254c0() throws ExoPlaybackException {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        if (eyxVarM10891s == null) {
            return;
        }
        int i = 0;
        if (eyxVarM10891s.m123284j() != null && !this.f7661B) {
            if (m10233R()) {
                if (eyxVarM10891s.m123284j().f96525d || this.f7671L >= eyxVarM10891s.m123284j().m123287m()) {
                    dgj0 dgj0VarM123289o = eyxVarM10891s.m123289o();
                    eyx eyxVarM10875c = this.f7695s.m10875c();
                    dgj0 dgj0VarM123289o2 = eyxVarM10875c.m123289o();
                    AbstractC1857c0 abstractC1857c0 = this.f7700x.f98629a;
                    m10312x1(abstractC1857c0, eyxVarM10875c.f96527f.f107120a, abstractC1857c0, eyxVarM10891s.f96527f.f107120a, -9223372036854775807L, false);
                    if (eyxVarM10875c.f96525d && eyxVarM10875c.f96522a.mo10983i() != -9223372036854775807L) {
                        m10226N0(eyxVarM10875c.m123287m());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f7677a.length; i2++) {
                        boolean zM115654c = dgj0VarM123289o.m115654c(i2);
                        boolean zM115654c2 = dgj0VarM123289o2.m115654c(i2);
                        if (zM115654c && !this.f7677a[i2].mo9830g()) {
                            boolean z = this.f7679c[i2].getTrackType() == -2;
                            jzc0 jzc0Var = dgj0VarM123289o.f88311b[i2];
                            jzc0 jzc0Var2 = dgj0VarM123289o2.f88311b[i2];
                            if (!zM115654c2 || !jzc0Var2.equals(jzc0Var) || z) {
                                m10228O0(this.f7677a[i2], eyxVarM10875c.m123287m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!eyxVarM10891s.f96527f.f107128i && !this.f7661B) {
            return;
        }
        while (true) {
            InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
            if (i >= interfaceC2089xArr.length) {
                return;
            }
            InterfaceC2089x interfaceC2089x = interfaceC2089xArr[i];
            xwd0 xwd0Var = eyxVarM10891s.f96524c[i];
            if (xwd0Var != null && interfaceC2089x.getStream() == xwd0Var && interfaceC2089x.mo9829d()) {
                long j = eyxVarM10891s.f96527f.f107124e;
                m10228O0(interfaceC2089x, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : eyxVarM10891s.m123286l() + eyxVarM10891s.f96527f.f107124e);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m10255c1(int i) throws ExoPlaybackException {
        this.f7664E = i;
        if (!this.f7695s.m10872J(this.f7700x.f98629a, i)) {
            m10212G0(true);
        }
        m10219K(false);
    }

    @Override // com.google.android.exoplayer2.C1951q.d
    /* JADX INFO: renamed from: d */
    public void mo10256d() {
        this.f7684h.mo131272j(22);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m10257d0() throws ExoPlaybackException {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        if (eyxVarM10891s == null || this.f7695s.m10890r() == eyxVarM10891s || eyxVarM10891s.f96528g || !m10296s0()) {
            return;
        }
        m10301u();
    }

    /* JADX INFO: renamed from: d1 */
    public void m10258d1(nke0 nke0Var) {
        this.f7684h.mo131265c(5, nke0Var).mo131275a();
    }

    @Override // com.google.android.exoplayer2.C2027u.a
    /* JADX INFO: renamed from: e */
    public synchronized void mo10259e(C2027u c2027u) {
        if (!this.f7702z && this.f7686j.getThread().isAlive()) {
            this.f7684h.mo131265c(14, c2027u).mo131275a();
            return;
        }
        kyv.m152151i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c2027u.m11854k(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m10260e0() throws Throwable {
        m10221L(this.f7696t.m10915i(), true);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m10261e1(nke0 nke0Var) {
        this.f7699w = nke0Var;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m10262f0(c cVar) throws Throwable {
        this.f7701y.m10326b(1);
        m10221L(this.f7696t.m10923v(cVar.f7708a, cVar.f7709b, cVar.f7710c, cVar.f7711d), false);
    }

    /* JADX INFO: renamed from: f1 */
    public void m10263f1(boolean z) {
        this.f7684h.mo131267e(12, z ? 1 : 0, 0).mo131275a();
    }

    /* JADX INFO: renamed from: g0 */
    public void m10264g0(int i, int i2, int i3, n8f0 n8f0Var) {
        this.f7684h.mo131265c(19, new c(i, i2, i3, n8f0Var)).mo131275a();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m10265g1(boolean z) throws ExoPlaybackException {
        this.f7665F = z;
        if (!this.f7695s.m10873K(this.f7700x.f98629a, z)) {
            m10212G0(true);
        }
        m10219K(false);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m10266h0() {
        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null; eyxVarM10890r = eyxVarM10890r.m123284j()) {
            for (u9f u9fVar : eyxVarM10890r.m123289o().f88312c) {
                if (u9fVar != null) {
                    u9fVar.mo11358e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m10267h1(n8f0 n8f0Var) {
        this.f7684h.mo131265c(21, n8f0Var).mo131275a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        C1950p c1950p;
        eyx eyxVarM10891s;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    m10279m0();
                    break;
                case 1:
                    m10245Y0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m10293r();
                    break;
                case 3:
                    m10214H0((h) message.obj);
                    break;
                case 4:
                    m10249a1((C1953s) message.obj);
                    break;
                case 5:
                    m10261e1((nke0) message.obj);
                    break;
                case 6:
                    m10295r1(false, true);
                    break;
                case 7:
                    m10285o0();
                    return true;
                case 8:
                    m10223M((InterfaceC1976h) message.obj);
                    break;
                case 9:
                    m10215I((InterfaceC1976h) message.obj);
                    break;
                case 10:
                    m10299t0();
                    break;
                case 11:
                    m10255c1(message.arg1);
                    break;
                case 12:
                    m10265g1(message.arg1 != 0);
                    break;
                case 13:
                    m10232Q0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m10220K0((C2027u) message.obj);
                    break;
                case 15:
                    m10224M0((C2027u) message.obj);
                    break;
                case 16:
                    m10227O((C1953s) message.obj, false);
                    break;
                case 17:
                    m10235S0((b) message.obj);
                    break;
                case 18:
                    m10278m((b) message.obj, message.arg1);
                    break;
                case 19:
                    m10262f0((c) message.obj);
                    break;
                case 20:
                    m10291q0(message.arg1, message.arg2, (n8f0) message.obj);
                    break;
                case 21:
                    m10269i1((n8f0) message.obj);
                    break;
                case 22:
                    m10260e0();
                    break;
                case 23:
                    m10241W0(message.arg1 != 0);
                    break;
                case 24:
                    m10238U0(message.arg1 == 1);
                    break;
                case 25:
                    m10284o();
                    break;
                case 26:
                    m10302u0();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.type == 1 && (eyxVarM10891s = this.f7695s.m10891s()) != null) {
                e = e.copyWithMediaPeriodId(eyxVarM10891s.f96527f.f107120a);
            }
            if (e.isRecoverable && this.f7674O == null) {
                kyv.m152152j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f7674O = e;
                sxk sxkVar = this.f7684h;
                sxkVar.mo131270h(sxkVar.mo131265c(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f7674O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f7674O;
                }
                kyv.m152146d("ExoPlayerImplInternal", "Playback error", e);
                if (e.type == 1 && this.f7695s.m10890r() != this.f7695s.m10891s()) {
                    while (true) {
                        eyx eyxVarM10890r = this.f7695s.m10890r();
                        eyx eyxVarM10891s2 = this.f7695s.m10891s();
                        c1950p = this.f7695s;
                        if (eyxVarM10890r == eyxVarM10891s2) {
                            break;
                        }
                        c1950p.m10874b();
                    }
                    gyx gyxVar = ((eyx) w11.m204369e(c1950p.m10890r())).f96527f;
                    InterfaceC1988i.b bVar = gyxVar.f107120a;
                    long j = gyxVar.f107121b;
                    this.f7700x = m10229P(bVar, j, gyxVar.f107122c, j, true, 0);
                }
                m10295r1(true, false);
                this.f7700x = this.f7700x.m125291f(e);
            }
        } catch (ParserException e3) {
            int i3 = e3.dataType;
            if (i3 == 1) {
                i = e3.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i3 == 4) {
                    i = e3.contentIsMalformed ? 3002 : 3004;
                }
                m10217J(e3, i2);
            }
            i2 = i;
            m10217J(e3, i2);
        } catch (DrmSession.DrmSessionException e4) {
            m10217J(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            m10217J(e5, 1002);
        } catch (DataSourceException e6) {
            m10217J(e6, e6.reason);
        } catch (IOException e7) {
            m10217J(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            kyv.m152146d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionCreateForUnexpected);
            m10295r1(true, false);
            this.f7700x = this.f7700x.m125291f(exoPlaybackExceptionCreateForUnexpected);
        }
        m10244Y();
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10268i0(boolean z) {
        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null; eyxVarM10890r = eyxVarM10890r.m123284j()) {
            for (u9f u9fVar : eyxVarM10890r.m123289o().f88312c) {
                if (u9fVar != null) {
                    u9fVar.mo11370q(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m10269i1(n8f0 n8f0Var) throws Throwable {
        this.f7701y.m10326b(1);
        m10221L(this.f7696t.m10911D(n8f0Var), false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10271j0() {
        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null; eyxVarM10890r = eyxVarM10890r.m123284j()) {
            for (u9f u9fVar : eyxVarM10890r.m123289o().f88312c) {
                if (u9fVar != null) {
                    u9fVar.mo11365l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m10272j1(int i) {
        fe80 fe80Var = this.f7700x;
        if (fe80Var.f98633e != i) {
            if (i != 2) {
                this.f7676Q = -9223372036854775807L;
            }
            this.f7700x = fe80Var.m125293h(i);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo10270j(InterfaceC1976h interfaceC1976h) {
        this.f7684h.mo131265c(9, interfaceC1976h).mo131275a();
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m10274k1() {
        eyx eyxVarM10890r;
        eyx eyxVarM123284j;
        return m10280m1() && !this.f7661B && (eyxVarM10890r = this.f7695s.m10890r()) != null && (eyxVarM123284j = eyxVarM10890r.m123284j()) != null && this.f7671L >= eyxVarM123284j.m123287m() && eyxVarM123284j.f96528g;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h.a
    /* JADX INFO: renamed from: l */
    public void mo10275l(InterfaceC1976h interfaceC1976h) {
        this.f7684h.mo131265c(8, interfaceC1976h).mo131275a();
    }

    /* JADX INFO: renamed from: l0 */
    public void m10276l0() {
        this.f7684h.mo131263a(0).mo131275a();
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m10277l1() {
        if (!m10236T()) {
            return false;
        }
        eyx eyxVarM10884l = this.f7695s.m10884l();
        long jM10213H = m10213H(eyxVarM10884l.m123285k());
        eyx eyxVarM10890r = this.f7695s.m10890r();
        long j = this.f7671L;
        long jM123298y = eyxVarM10884l == eyxVarM10890r ? eyxVarM10884l.m123298y(j) : eyxVarM10884l.m123298y(j) - eyxVarM10884l.f96527f.f107121b;
        boolean zMo155817e = this.f7682f.mo155817e(jM123298y, jM10213H, this.f7691o.getPlaybackParameters().f8288a);
        if (zMo155817e || jM10213H >= 500000 || (this.f7689m <= 0 && !this.f7690n)) {
            return zMo155817e;
        }
        this.f7695s.m10890r().f96522a.mo10991t(this.f7700x.f98646r, false);
        return this.f7682f.mo155817e(jM123298y, jM10213H, this.f7691o.getPlaybackParameters().f8288a);
    }

    /* JADX INFO: renamed from: m */
    public final void m10278m(b bVar, int i) throws Throwable {
        this.f7701y.m10326b(1);
        C1951q c1951q = this.f7696t;
        if (i == -1) {
            i = c1951q.m10920r();
        }
        m10221L(c1951q.m10912f(i, bVar.f7704a, bVar.f7705b), false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m10279m0() {
        this.f7701y.m10326b(1);
        m10305v0(false, false, false, true);
        this.f7682f.mo155813a();
        m10272j1(this.f7700x.f98629a.m9776u() ? 4 : 2);
        this.f7696t.m10924w(this.f7683g.mo157943g());
        this.f7684h.mo131272j(2);
    }

    /* JADX INFO: renamed from: m1 */
    public final boolean m10280m1() {
        fe80 fe80Var = this.f7700x;
        return fe80Var.f98640l && fe80Var.f98641m == 0;
    }

    /* JADX INFO: renamed from: n */
    public void m10281n(int i, List<C1951q.c> list, n8f0 n8f0Var) {
        this.f7684h.mo131268f(18, i, 0, new b(list, n8f0Var, -1, -9223372036854775807L, null)).mo131275a();
    }

    /* JADX INFO: renamed from: n0 */
    public synchronized boolean m10282n0() {
        if (!this.f7702z && this.f7686j.getThread().isAlive()) {
            this.f7684h.mo131272j(7);
            m10316z1(new b7h0() { // from class: l.r9f
                @Override // p153l.b7h0
                public final Object get() {
                    return Boolean.valueOf(this.f161807a.f7702z);
                }
            }, this.f7698v);
            return this.f7702z;
        }
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m10283n1(boolean z) {
        if (this.f7669J == 0) {
            return m10239V();
        }
        if (!z) {
            return false;
        }
        if (!this.f7700x.f98635g) {
            return true;
        }
        eyx eyxVarM10890r = this.f7695s.m10890r();
        long jMo10041c = m10286o1(this.f7700x.f98629a, eyxVarM10890r.f96527f.f107120a) ? this.f7697u.mo10041c() : -9223372036854775807L;
        eyx eyxVarM10884l = this.f7695s.m10884l();
        return (eyxVarM10884l.m123291q() && eyxVarM10884l.f96527f.f107128i) || (eyxVarM10884l.f96527f.f107120a.m128142b() && !eyxVarM10884l.f96525d) || this.f7682f.mo155823k(this.f7700x.f98629a, eyxVarM10890r.f96527f.f107120a, m10211G(), this.f7691o.getPlaybackParameters().f8288a, this.f7662C, jMo10041c);
    }

    /* JADX INFO: renamed from: o */
    public final void m10284o() throws ExoPlaybackException {
        m10302u0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m10285o0() {
        m10305v0(true, false, true, false);
        m10288p0();
        this.f7682f.mo155816d();
        m10272j1(1);
        HandlerThread handlerThread = this.f7685i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f7702z = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m10286o1(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar) {
        if (!bVar.m128142b() && !abstractC1857c0.m9776u()) {
            abstractC1857c0.m9774r(abstractC1857c0.mo9454l(bVar.f101422a, this.f7688l).f7339c, this.f7687k);
            if (this.f7687k.m9808h()) {
                AbstractC1857c0.d dVar = this.f7687k;
                if (dVar.f7373i && dVar.f7370f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m10287p(C2027u c2027u) throws ExoPlaybackException {
        if (c2027u.m11853j()) {
            return;
        }
        try {
            c2027u.m11850g().mo9709f(c2027u.m11852i(), c2027u.m11848e());
        } finally {
            c2027u.m11854k(true);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10288p0() {
        for (int i = 0; i < this.f7677a.length; i++) {
            this.f7679c[i].mo9835q();
            this.f7677a[i].release();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m10289p1() throws ExoPlaybackException {
        this.f7662C = false;
        this.f7691o.m10052e();
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            if (m10195U(interfaceC2089x)) {
                interfaceC2089x.start();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10290q(InterfaceC2089x interfaceC2089x) throws ExoPlaybackException {
        if (m10195U(interfaceC2089x)) {
            this.f7691o.m10048a(interfaceC2089x);
            m10307w(interfaceC2089x);
            interfaceC2089x.disable();
            this.f7669J--;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m10291q0(int i, int i2, n8f0 n8f0Var) throws Throwable {
        this.f7701y.m10326b(1);
        m10221L(this.f7696t.m10908A(i, i2, n8f0Var), false);
    }

    /* JADX INFO: renamed from: q1 */
    public void m10292q1() {
        this.f7684h.mo131263a(6).mo131275a();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX INFO: renamed from: r */
    public final void m10293r() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        int i;
        long jMo111759a = this.f7693q.mo111759a();
        this.f7684h.mo131274l(2);
        m10306v1();
        int i2 = this.f7700x.f98633e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        eyx eyxVarM10890r = this.f7695s.m10890r();
        if (eyxVarM10890r == null) {
            m10208E0(jMo111759a, 10L);
            return;
        }
        nej0.m162903a("doSomeWork");
        m10309w1();
        if (eyxVarM10890r.f96525d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            eyxVarM10890r.f96522a.mo10991t(this.f7700x.f98646r - this.f7689m, this.f7690n);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
                if (i3 >= interfaceC2089xArr.length) {
                    break;
                }
                InterfaceC2089x interfaceC2089x = interfaceC2089xArr[i3];
                if (m10195U(interfaceC2089x)) {
                    interfaceC2089x.mo10447j(this.f7671L, jElapsedRealtime);
                    z = z && interfaceC2089x.mo9708c();
                    boolean z3 = eyxVarM10890r.f96524c[i3] != interfaceC2089x.getStream();
                    boolean z4 = z3 || (!z3 && interfaceC2089x.mo9829d()) || interfaceC2089x.mo9707b() || interfaceC2089x.mo9708c();
                    z2 = z2 && z4;
                    if (!z4) {
                        interfaceC2089x.mo9837w();
                    }
                }
                i3++;
            }
        } else {
            eyxVarM10890r.f96522a.mo10990s();
            z = true;
            z2 = true;
        }
        long j = eyxVarM10890r.f96527f.f107124e;
        boolean z5 = z && eyxVarM10890r.f96525d && (j == -9223372036854775807L || j <= this.f7700x.f98646r);
        if (z5 && this.f7661B) {
            this.f7661B = false;
            m10245Y0(false, this.f7700x.f98641m, false, 5);
        }
        if (z5 && eyxVarM10890r.f96527f.f107128i) {
            m10272j1(4);
            m10297s1();
        } else if (this.f7700x.f98633e == 2 && m10283n1(z2)) {
            m10272j1(3);
            this.f7674O = null;
            if (m10280m1()) {
                m10289p1();
            }
        } else if (this.f7700x.f98633e == 3 && (this.f7669J != 0 ? !z2 : !m10239V())) {
            this.f7662C = m10280m1();
            m10272j1(2);
            if (this.f7662C) {
                m10271j0();
                this.f7697u.mo10042d();
            }
            m10297s1();
        }
        if (this.f7700x.f98633e == 2) {
            int i4 = 0;
            while (true) {
                InterfaceC2089x[] interfaceC2089xArr2 = this.f7677a;
                if (i4 >= interfaceC2089xArr2.length) {
                    break;
                }
                if (m10195U(interfaceC2089xArr2[i4]) && this.f7677a[i4].getStream() == eyxVarM10890r.f96524c[i4]) {
                    this.f7677a[i4].mo9837w();
                }
                i4++;
            }
            fe80 fe80Var = this.f7700x;
            if (fe80Var.f98635g || fe80Var.f98645q >= 500000 || !m10236T()) {
                this.f7676Q = -9223372036854775807L;
            } else {
                long j2 = this.f7676Q;
                qa5 qa5Var = this.f7693q;
                if (j2 == -9223372036854775807L) {
                    this.f7676Q = qa5Var.elapsedRealtime();
                } else if (qa5Var.elapsedRealtime() - this.f7676Q >= 4000) {
                    wtq0.m207906a("Playback stuck buffering and not loading");
                    return;
                }
            }
        } else {
            this.f7676Q = -9223372036854775807L;
        }
        boolean z6 = m10280m1() && this.f7700x.f98633e == 3;
        boolean z7 = this.f7668I && this.f7667H && z6;
        fe80 fe80Var2 = this.f7700x;
        if (fe80Var2.f98643o != z7) {
            this.f7700x = fe80Var2.m125294i(z7);
        }
        this.f7667H = false;
        if (!z7 && (i = this.f7700x.f98633e) != 4) {
            if (z6 || i == 2) {
                m10208E0(jMo111759a, 10L);
            } else if (i == 3 && this.f7669J != 0) {
                m10208E0(jMo111759a, 1000L);
            }
        }
        nej0.m162905c();
    }

    /* JADX INFO: renamed from: r0 */
    public void m10294r0(int i, int i2, n8f0 n8f0Var) {
        this.f7684h.mo131268f(20, i, i2, n8f0Var).mo131275a();
    }

    /* JADX INFO: renamed from: r1 */
    public final void m10295r1(boolean z, boolean z2) {
        m10305v0(z || !this.f7666G, false, true, false);
        this.f7701y.m10326b(z2 ? 1 : 0);
        this.f7682f.mo155822j();
        m10272j1(1);
    }

    @Override // com.google.android.exoplayer2.C1890g.a
    /* JADX INFO: renamed from: s */
    public void mo10056s(C1953s c1953s) {
        this.f7684h.mo131265c(16, c1953s).mo131275a();
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m10296s0() throws ExoPlaybackException {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        dgj0 dgj0VarM123289o = eyxVarM10891s.m123289o();
        int i = 0;
        boolean z = false;
        while (true) {
            InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
            if (i >= interfaceC2089xArr.length) {
                return !z;
            }
            InterfaceC2089x interfaceC2089x = interfaceC2089xArr[i];
            if (m10195U(interfaceC2089x)) {
                boolean z2 = interfaceC2089x.getStream() != eyxVarM10891s.f96524c[i];
                if (!dgj0VarM123289o.m115654c(i) || z2) {
                    if (!interfaceC2089x.mo9830g()) {
                        interfaceC2089x.mo9834o(m10190B(dgj0VarM123289o.f88312c[i]), eyxVarM10891s.f96524c[i], eyxVarM10891s.m123287m(), eyxVarM10891s.m123286l());
                    } else if (interfaceC2089x.mo9708c()) {
                        m10290q(interfaceC2089x);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m10297s1() throws ExoPlaybackException {
        this.f7691o.m10053f();
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            if (m10195U(interfaceC2089x)) {
                m10307w(interfaceC2089x);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10298t(int i, boolean z) throws ExoPlaybackException {
        InterfaceC2089x interfaceC2089x = this.f7677a[i];
        if (m10195U(interfaceC2089x)) {
            return;
        }
        eyx eyxVarM10891s = this.f7695s.m10891s();
        boolean z2 = eyxVarM10891s == this.f7695s.m10890r();
        dgj0 dgj0VarM123289o = eyxVarM10891s.m123289o();
        jzc0 jzc0Var = dgj0VarM123289o.f88311b[i];
        C1894k[] c1894kArrM10190B = m10190B(dgj0VarM123289o.f88312c[i]);
        boolean z3 = m10280m1() && this.f7700x.f98633e == 3;
        boolean z4 = !z && z3;
        this.f7669J++;
        this.f7678b.add(interfaceC2089x);
        interfaceC2089x.mo9814B(jzc0Var, c1894kArrM10190B, eyxVarM10891s.f96524c[i], this.f7671L, z4, z2, eyxVarM10891s.m123287m(), eyxVarM10891s.m123286l());
        interfaceC2089x.mo9709f(11, new a());
        this.f7691o.m10049b(interfaceC2089x);
        if (z3) {
            interfaceC2089x.start();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10299t0() throws ExoPlaybackException {
        int i;
        float f2 = this.f7691o.getPlaybackParameters().f8288a;
        eyx eyxVarM10891s = this.f7695s.m10891s();
        boolean z = true;
        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null && eyxVarM10890r.f96525d; eyxVarM10890r = eyxVarM10890r.m123284j()) {
            dgj0 dgj0VarM123295v = eyxVarM10890r.m123295v(f2, this.f7700x.f98629a);
            if (!dgj0VarM123295v.m115652a(eyxVarM10890r.m123289o())) {
                C1950p c1950p = this.f7695s;
                if (z) {
                    eyx eyxVarM10890r2 = c1950p.m10890r();
                    boolean zM10866C = this.f7695s.m10866C(eyxVarM10890r2);
                    boolean[] zArr = new boolean[this.f7677a.length];
                    long jM123277b = eyxVarM10890r2.m123277b(dgj0VarM123295v, this.f7700x.f98646r, zM10866C, zArr);
                    fe80 fe80Var = this.f7700x;
                    boolean z2 = (fe80Var.f98633e == 4 || jM123277b == fe80Var.f98646r) ? false : true;
                    fe80 fe80Var2 = this.f7700x;
                    i = 4;
                    this.f7700x = m10229P(fe80Var2.f98630b, jM123277b, fe80Var2.f98631c, fe80Var2.f98632d, z2, 5);
                    if (z2) {
                        m10311x0(jM123277b);
                    }
                    boolean[] zArr2 = new boolean[this.f7677a.length];
                    int i2 = 0;
                    while (true) {
                        InterfaceC2089x[] interfaceC2089xArr = this.f7677a;
                        if (i2 >= interfaceC2089xArr.length) {
                            break;
                        }
                        InterfaceC2089x interfaceC2089x = interfaceC2089xArr[i2];
                        boolean zM10195U = m10195U(interfaceC2089x);
                        zArr2[i2] = zM10195U;
                        xwd0 xwd0Var = eyxVarM10890r2.f96524c[i2];
                        if (zM10195U) {
                            if (xwd0Var != interfaceC2089x.getStream()) {
                                m10290q(interfaceC2089x);
                            } else if (zArr[i2]) {
                                interfaceC2089x.mo9832l(this.f7671L);
                            }
                        }
                        i2++;
                    }
                    m10304v(zArr2);
                } else {
                    i = 4;
                    c1950p.m10866C(eyxVarM10890r);
                    if (eyxVarM10890r.f96525d) {
                        eyxVarM10890r.m123276a(dgj0VarM123295v, Math.max(eyxVarM10890r.f96527f.f107121b, eyxVarM10890r.m123298y(this.f7671L)), false);
                    }
                }
                m10219K(true);
                if (this.f7700x.f98633e != i) {
                    m10242X();
                    m10309w1();
                    this.f7684h.mo131272j(2);
                    return;
                }
                return;
            }
            if (eyxVarM10890r == eyxVarM10891s) {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m10300t1() {
        eyx eyxVarM10884l = this.f7695s.m10884l();
        boolean z = this.f7663D || (eyxVarM10884l != null && eyxVarM10884l.f96522a.isLoading());
        fe80 fe80Var = this.f7700x;
        if (z != fe80Var.f98635g) {
            this.f7700x = fe80Var.m125287b(z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10301u() throws ExoPlaybackException {
        m10304v(new boolean[this.f7677a.length]);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m10302u0() throws ExoPlaybackException {
        m10299t0();
        m10212G0(true);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m10303u1(InterfaceC1988i.b bVar, ffj0 ffj0Var, dgj0 dgj0Var) {
        this.f7682f.mo155818f(this.f7700x.f98629a, bVar, this.f7677a, ffj0Var, dgj0Var.f88312c);
    }

    /* JADX INFO: renamed from: v */
    public final void m10304v(boolean[] zArr) throws ExoPlaybackException {
        eyx eyxVarM10891s = this.f7695s.m10891s();
        dgj0 dgj0VarM123289o = eyxVarM10891s.m123289o();
        for (int i = 0; i < this.f7677a.length; i++) {
            if (!dgj0VarM123289o.m115654c(i) && this.f7678b.remove(this.f7677a[i])) {
                this.f7677a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f7677a.length; i2++) {
            if (dgj0VarM123289o.m115654c(i2)) {
                m10298t(i2, zArr[i2]);
            }
        }
        eyxVarM10891s.f96528g = true;
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
    public final void m10305v0(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        AbstractC1857c0 abstractC1857c0;
        InterfaceC1988i.b bVar;
        this.f7684h.mo131274l(2);
        this.f7674O = null;
        this.f7662C = false;
        this.f7691o.m10053f();
        this.f7671L = 1000000000000L;
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            try {
                m10290q(interfaceC2089x);
            } catch (ExoPlaybackException | RuntimeException e2) {
                kyv.m152146d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (InterfaceC2089x interfaceC2089x2 : this.f7677a) {
                if (this.f7678b.remove(interfaceC2089x2)) {
                    try {
                        interfaceC2089x2.reset();
                    } catch (RuntimeException e3) {
                        kyv.m152146d("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.f7669J = 0;
        fe80 fe80Var = this.f7700x;
        InterfaceC1988i.b bVar2 = fe80Var.f98630b;
        long jLongValue = fe80Var.f98646r;
        long j = (this.f7700x.f98630b.m128142b() || m10196W(this.f7700x, this.f7688l)) ? this.f7700x.f98631c : this.f7700x.f98646r;
        if (z2) {
            this.f7670K = null;
            Pair<InterfaceC1988i.b, Long> pairM10207E = m10207E(this.f7700x.f98629a);
            bVar2 = (InterfaceC1988i.b) pairM10207E.first;
            jLongValue = ((Long) pairM10207E.second).longValue();
            j = -9223372036854775807L;
            if (bVar2.equals(this.f7700x.f98630b)) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = false;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f7695s.m10878f();
        this.f7663D = false;
        AbstractC1857c0 abstractC1857c0M12229I = this.f7700x.f98629a;
        if (z3 && (abstractC1857c0M12229I instanceof C2080v)) {
            abstractC1857c0M12229I = ((C2080v) abstractC1857c0M12229I).m12229I(this.f7696t.m10919q());
            if (bVar2.f101423b != -1) {
                abstractC1857c0M12229I.mo9454l(bVar2.f101422a, this.f7688l);
                if (abstractC1857c0M12229I.m9774r(this.f7688l.f7339c, this.f7687k).m9808h()) {
                    abstractC1857c0 = abstractC1857c0M12229I;
                    bVar = new InterfaceC1988i.b(bVar2.f101422a, bVar2.f101425d);
                } else {
                    abstractC1857c0 = abstractC1857c0M12229I;
                    bVar = bVar2;
                }
            } else {
                abstractC1857c0 = abstractC1857c0M12229I;
                bVar = bVar2;
            }
        } else {
            abstractC1857c0 = abstractC1857c0M12229I;
            bVar = bVar2;
        }
        fe80 fe80Var2 = this.f7700x;
        int i = fe80Var2.f98633e;
        ExoPlaybackException exoPlaybackException = z4 ? null : fe80Var2.f98634f;
        ffj0 ffj0Var = z5 ? ffj0.f98782d : fe80Var2.f98636h;
        dgj0 dgj0Var = z5 ? this.f7681e : fe80Var2.f98637i;
        List listM15739of = z5 ? ImmutableList.m15739of() : fe80Var2.f98638j;
        fe80 fe80Var3 = this.f7700x;
        this.f7700x = new fe80(abstractC1857c0, bVar, j3, j2, i, exoPlaybackException, false, ffj0Var, dgj0Var, listM15739of, bVar, fe80Var3.f98640l, fe80Var3.f98641m, fe80Var3.f98642n, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f7696t.m10926y();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m10306v1() throws ExoPlaybackException {
        if (this.f7700x.f98629a.m9776u() || !this.f7696t.m10921t()) {
            return;
        }
        m10248a0();
        m10254c0();
        m10257d0();
        m10251b0();
    }

    /* JADX INFO: renamed from: w */
    public final void m10307w(InterfaceC2089x interfaceC2089x) {
        if (interfaceC2089x.getState() == 2) {
            interfaceC2089x.stop();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10308w0() {
        eyx eyxVarM10890r = this.f7695s.m10890r();
        this.f7661B = eyxVarM10890r != null && eyxVarM10890r.f96527f.f107127h && this.f7660A;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m10309w1() throws ExoPlaybackException {
        eyx eyxVarM10890r = this.f7695s.m10890r();
        if (eyxVarM10890r == null) {
            return;
        }
        long jMo10983i = eyxVarM10890r.f96525d ? eyxVarM10890r.f96522a.mo10983i() : -9223372036854775807L;
        if (jMo10983i != -9223372036854775807L) {
            m10311x0(jMo10983i);
            if (jMo10983i != this.f7700x.f98646r) {
                fe80 fe80Var = this.f7700x;
                long j = jMo10983i;
                this.f7700x = m10229P(fe80Var.f98630b, j, fe80Var.f98631c, j, true, 5);
            }
        } else {
            long jM10054g = this.f7691o.m10054g(eyxVarM10890r != this.f7695s.m10891s());
            this.f7671L = jM10054g;
            long jM123298y = eyxVarM10890r.m123298y(jM10054g);
            m10246Z(this.f7700x.f98646r, jM123298y);
            this.f7700x.m125298o(jM123298y);
        }
        this.f7700x.f98644p = this.f7695s.m10884l().m123283i();
        this.f7700x.f98645q = m10211G();
        fe80 fe80Var2 = this.f7700x;
        if (fe80Var2.f98640l && fe80Var2.f98633e == 3 && m10286o1(fe80Var2.f98629a, fe80Var2.f98630b) && this.f7700x.f98642n.f8288a == 1.0f) {
            float fMo10040b = this.f7697u.mo10040b(m10203A(), m10211G());
            if (this.f7691o.getPlaybackParameters().f8288a != fMo10040b) {
                m10234R0(this.f7700x.f98642n.m10952c(fMo10040b));
                m10225N(this.f7700x.f98642n, this.f7691o.getPlaybackParameters().f8288a, false, false);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m10310x(long j) {
        this.f7675P = j;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m10311x0(long j) throws ExoPlaybackException {
        eyx eyxVarM10890r = this.f7695s.m10890r();
        long jM123299z = eyxVarM10890r == null ? j + 1000000000000L : eyxVarM10890r.m123299z(j);
        this.f7671L = jM123299z;
        this.f7691o.m10050c(jM123299z);
        for (InterfaceC2089x interfaceC2089x : this.f7677a) {
            if (m10195U(interfaceC2089x)) {
                interfaceC2089x.mo9832l(this.f7671L);
            }
        }
        m10266h0();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10312x1(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c1, InterfaceC1988i.b bVar2, long j, boolean z) throws ExoPlaybackException {
        if (!m10286o1(abstractC1857c0, bVar)) {
            C1953s c1953s = bVar.m128142b() ? C1953s.f8284d : this.f7700x.f98642n;
            if (this.f7691o.getPlaybackParameters().equals(c1953s)) {
                return;
            }
            m10234R0(c1953s);
            m10225N(this.f7700x.f98642n, c1953s.f8288a, false, false);
            return;
        }
        abstractC1857c0.m9774r(abstractC1857c0.mo9454l(bVar.f101422a, this.f7688l).f7339c, this.f7687k);
        this.f7697u.mo10039a((C1944n.g) bmk0.m105144j(this.f7687k.f7375k));
        if (j != -9223372036854775807L) {
            this.f7697u.mo10043e(m10205C(abstractC1857c0, bVar.f101422a, j));
            return;
        }
        if (!bmk0.m105123c(!abstractC1857c1.m9776u() ? abstractC1857c1.m9774r(abstractC1857c1.mo9454l(bVar2.f101422a, this.f7688l).f7339c, this.f7687k).f7365a : null, this.f7687k.f7365a) || z) {
            this.f7697u.mo10043e(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10313y(boolean z) {
        this.f7684h.mo131267e(24, z ? 1 : 0, 0).mo131275a();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m10314y1(float f2) {
        for (eyx eyxVarM10890r = this.f7695s.m10890r(); eyxVarM10890r != null; eyxVarM10890r = eyxVarM10890r.m123284j()) {
            for (u9f u9fVar : eyxVarM10890r.m123289o().f88312c) {
                if (u9fVar != null) {
                    u9fVar.mo11367n(f2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final ImmutableList<Metadata> m10315z(u9f[] u9fVarArr) {
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        boolean z = false;
        for (u9f u9fVar : u9fVarArr) {
            if (u9fVar != null) {
                Metadata metadata = u9fVar.mo11366m(0).f7783j;
                if (metadata == null) {
                    c2804a.mo15737a(new Metadata(new Metadata.Entry[0]));
                } else {
                    c2804a.mo15737a(metadata);
                    z = true;
                }
            }
        }
        return z ? c2804a.m15756m() : ImmutableList.m15739of();
    }

    /* JADX INFO: renamed from: z1 */
    public final synchronized void m10316z1(b7h0<Boolean> b7h0Var, long j) {
        long jElapsedRealtime = this.f7693q.elapsedRealtime() + j;
        boolean z = false;
        while (!b7h0Var.get().booleanValue() && j > 0) {
            try {
                this.f7693q.mo111760b();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f7693q.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.j$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<C1951q.c> f7704a;

        /* JADX INFO: renamed from: b */
        public final n8f0 f7705b;

        /* JADX INFO: renamed from: c */
        public final int f7706c;

        /* JADX INFO: renamed from: d */
        public final long f7707d;

        public b(List<C1951q.c> list, n8f0 n8f0Var, int i, long j) {
            this.f7704a = list;
            this.f7705b = n8f0Var;
            this.f7706c = i;
            this.f7707d = j;
        }

        public /* synthetic */ b(List list, n8f0 n8f0Var, int i, long j, a aVar) {
            this(list, n8f0Var, i, j);
        }
    }
}
