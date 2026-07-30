package p149l;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2116c3;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public final class fwy0 extends kwy0 implements s5y0 {

    /* JADX INFO: renamed from: k */
    public static final AbstractC2116c3 f99706k = AbstractC2116c3.zzb(new Comparator() { // from class: l.juy0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            AbstractC2116c3 abstractC2116c3 = fwy0.f99706k;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* JADX INFO: renamed from: l */
    public static final AbstractC2116c3 f99707l = AbstractC2116c3.zzb(new Comparator() { // from class: l.luy0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC2116c3 abstractC2116c3 = fwy0.f99706k;
            return 0;
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f99708d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Context f99709e;

    /* JADX INFO: renamed from: f */
    public final boolean f99710f;

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public bvy0 f99711g;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public gvy0 f99712h;

    /* JADX INFO: renamed from: i */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public qux0 f99713i;

    /* JADX INFO: renamed from: j */
    public final pty0 f99714j;

    public fwy0(Context context) {
        pty0 pty0Var = new pty0();
        bvy0 bvy0VarM104097d = bvy0.m104097d(context);
        this.f99708d = new Object();
        this.f99709e = context != null ? context.getApplicationContext() : null;
        this.f99714j = pty0Var;
        this.f99711g = bvy0VarM104097d;
        this.f99713i = qux0.f156553b;
        boolean z = false;
        if (context != null && ggw0.m126068j(context)) {
            z = true;
        }
        this.f99710f = z;
        if (!z && context != null && ggw0.f102568a >= 32) {
            this.f99712h = gvy0.m128295a(context);
        }
        if (this.f99711g.f77537u0 && context == null) {
            svv0.m186111f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ int m123578k(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: l */
    public static int m123579l(mhr0 mhr0Var, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(mhr0Var.f133883c)) {
            return 4;
        }
        String strM123582p = m123582p(str);
        String strM123582p2 = m123582p(mhr0Var.f133883c);
        if (strM123582p2 == null || strM123582p == null) {
            return (z && strM123582p2 == null) ? 1 : 0;
        }
        if (strM123582p2.startsWith(strM123582p) || strM123582p.startsWith(strM123582p2)) {
            return 3;
        }
        int i = ggw0.f102568a;
        return strM123582p2.split("-", 2)[0].equals(strM123582p.split("-", 2)[0]) ? 2 : 0;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static String m123582p(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x000e, B:10:0x0013, B:36:0x0056, B:38:0x005b, B:40:0x005f, B:42:0x0065, B:44:0x006b, B:46:0x0073, B:13:0x001a, B:27:0x0045, B:29:0x0049, B:31:0x004d, B:50:0x007f), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x000e, B:10:0x0013, B:36:0x0056, B:38:0x005b, B:40:0x005f, B:42:0x0065, B:44:0x006b, B:46:0x0073, B:13:0x001a, B:27:0x0045, B:29:0x0049, B:31:0x004d, B:50:0x007f), top: B:54:0x0003 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m123584s(fwy0 fwy0Var, mhr0 mhr0Var) {
        boolean z;
        gvy0 gvy0Var;
        gvy0 gvy0Var2;
        synchronized (fwy0Var.f99708d) {
            try {
                z = true;
                if (fwy0Var.f99711g.f77537u0 && !fwy0Var.f99710f && mhr0Var.f133905y > 2) {
                    String str = mhr0Var.f133892l;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    if (ggw0.f102568a >= 32 && (gvy0Var = fwy0Var.f99712h) != null && gvy0Var.m128301g()) {
                                    }
                                }
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    if (ggw0.f102568a >= 32) {
                                    }
                                }
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    if (ggw0.f102568a >= 32) {
                                    }
                                }
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    if (ggw0.f102568a >= 32) {
                                    }
                                }
                                break;
                        }
                    }
                    if (ggw0.f102568a < 32 || (gvy0Var2 = fwy0Var.f99712h) == null || !gvy0Var2.m128301g() || !gvy0Var2.m128299e() || !fwy0Var.f99712h.m128300f() || !fwy0Var.f99712h.m128298d(fwy0Var.f99713i, mhr0Var)) {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m123585t(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static void m123586u(kty0 kty0Var, m3u0 m3u0Var, Map map) {
        for (int i = 0; i < kty0Var.f124629a; i++) {
            if (((gxt0) m3u0Var.f131157A.get(kty0Var.m147224b(i))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static final Pair m123587w(int i, jwy0 jwy0Var, int[][][] iArr, awy0 awy0Var, Comparator comparator) {
        boolean z;
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == jwy0Var.m143697c(i2)) {
                kty0 kty0VarM143698d = jwy0Var.m143698d(i2);
                for (int i3 = 0; i3 < kty0VarM143698d.f124629a; i3++) {
                    ntt0 ntt0VarM147224b = kty0VarM143698d.m147224b(i3);
                    List listMo99330a = awy0Var.mo99330a(i2, ntt0VarM147224b, iArr[i2][i3]);
                    int i4 = ntt0VarM147224b.f140535a;
                    boolean z2 = true;
                    boolean[] zArr = new boolean[1];
                    int i5 = 0;
                    while (i5 <= 0) {
                        int i6 = i5 + 1;
                        bwy0 bwy0Var = (bwy0) listMo99330a.get(i5);
                        int iMo104256a = bwy0Var.mo104256a();
                        if (zArr[i5] || iMo104256a == 0) {
                            z = z2;
                        } else {
                            if (iMo104256a == z2) {
                                arrayList = zzgaa.zzm(bwy0Var);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(bwy0Var);
                                int i7 = i6;
                                while (i7 <= 0) {
                                    boolean z3 = z2;
                                    bwy0 bwy0Var2 = (bwy0) listMo99330a.get(i7);
                                    if (bwy0Var2.mo104256a() == 2 && bwy0Var.mo104257b(bwy0Var2)) {
                                        arrayList.add(bwy0Var2);
                                        zArr[i7] = z3;
                                    }
                                    i7++;
                                    z2 = z3;
                                }
                            }
                            z = z2;
                            arrayList2.add(arrayList);
                        }
                        i5 = i6;
                        z2 = z;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((bwy0) list.get(i8)).f77720c;
        }
        bwy0 bwy0Var3 = (bwy0) list.get(0);
        return Pair.create(new gwy0(bwy0Var3.f77719b, iArr2, 0), Integer.valueOf(bwy0Var3.f77718a));
    }

    @Override // p149l.nwy0
    /* JADX INFO: renamed from: b */
    public final void mo123589b() {
        gvy0 gvy0Var;
        synchronized (this.f99708d) {
            try {
                if (ggw0.f102568a >= 32 && (gvy0Var = this.f99712h) != null) {
                    gvy0Var.m128297c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo123589b();
    }

    @Override // p149l.nwy0
    /* JADX INFO: renamed from: c */
    public final void mo123590c(qux0 qux0Var) {
        boolean zEquals;
        synchronized (this.f99708d) {
            zEquals = this.f99713i.equals(qux0Var);
            this.f99713i = qux0Var;
        }
        if (zEquals) {
            return;
        }
        m123595v();
    }

    @Override // p149l.nwy0
    /* JADX INFO: renamed from: d */
    public final boolean mo123591d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.kwy0
    /* JADX INFO: renamed from: j */
    public final Pair mo123592j(jwy0 jwy0Var, int[][][] iArr, final int[] iArr2, eqy0 eqy0Var, xqt0 xqt0Var) throws zziz {
        final bvy0 bvy0Var;
        int i;
        final boolean z;
        final String str;
        pty0 pty0Var;
        int[] iArr3;
        int length;
        hwy0 hwy0VarM171388a;
        gvy0 gvy0Var;
        synchronized (this.f99708d) {
            try {
                bvy0Var = this.f99711g;
                if (bvy0Var.f77537u0 && ggw0.f102568a >= 32 && (gvy0Var = this.f99712h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    f5v0.m119531b(looperMyLooper);
                    gvy0Var.m128296b(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 2;
        gwy0[] gwy0VarArr = new gwy0[2];
        Pair pairM123587w = m123587w(2, jwy0Var, iArr, new awy0() { // from class: l.ruy0
            /* JADX WARN: Code duplicated, block: B:22:0x0042  */
            @Override // p149l.awy0
            /* JADX INFO: renamed from: a */
            public final List mo99330a(int i3, ntt0 ntt0Var, int[] iArr4) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                ntt0 ntt0Var2 = ntt0Var;
                AbstractC2116c3 abstractC2116c3 = fwy0.f99706k;
                bvy0 bvy0Var2 = bvy0Var;
                int i10 = iArr2[i3];
                int i11 = bvy0Var2.f131167i;
                int i12 = bvy0Var2.f131168j;
                boolean z2 = bvy0Var2.f131169k;
                if (i11 == Integer.MAX_VALUE) {
                    i4 = -1;
                    i5 = Integer.MAX_VALUE;
                } else if (i12 == Integer.MAX_VALUE) {
                    i5 = Integer.MAX_VALUE;
                    i4 = -1;
                } else {
                    char c = 0;
                    int i13 = Integer.MAX_VALUE;
                    while (true) {
                        int i14 = ntt0Var2.f140535a;
                        if (c > 0) {
                            break;
                        }
                        mhr0 mhr0VarM161414b = ntt0Var2.m161414b(0);
                        int i15 = mhr0VarM161414b.f133897q;
                        if (i15 > 0 && (i7 = mhr0VarM161414b.f133898r) > 0) {
                            if (z2) {
                                if ((i15 > i7) != (i11 > i12)) {
                                    i9 = i11;
                                    i8 = i12;
                                } else {
                                    i8 = i11;
                                    i9 = i12;
                                }
                            } else {
                                i8 = i11;
                                i9 = i12;
                            }
                            int i16 = i15 * i9;
                            int i17 = i7 * i8;
                            if (i16 >= i17) {
                                int i18 = ggw0.f102568a;
                                point = new Point(i8, ((i17 + i15) - 1) / i15);
                            } else {
                                int i19 = ggw0.f102568a;
                                point = new Point(((i16 + i7) - 1) / i7, i9);
                            }
                            int i20 = mhr0VarM161414b.f133897q;
                            int i21 = mhr0VarM161414b.f133898r;
                            int i22 = i20 * i21;
                            if (i20 >= ((int) (point.x * 0.98f)) && i21 >= ((int) (point.y * 0.98f)) && i22 < i13) {
                                i13 = i22;
                            }
                        }
                        c = 1;
                    }
                    i4 = -1;
                    i5 = i13;
                }
                ghw0 ghw0Var = new ghw0();
                char c2 = 0;
                while (true) {
                    int i23 = ntt0Var2.f140535a;
                    if (c2 > 0) {
                        return ghw0Var.m126243j();
                    }
                    int iM154633a = ntt0Var2.m161414b(0).m154633a();
                    if (i5 != Integer.MAX_VALUE) {
                        i6 = i4;
                        boolean z3 = iM154633a != i6 && iM154633a <= i5;
                        ghw0Var.m126240g(new ewy0(i3, ntt0Var2, 0, bvy0Var2, iArr4[0], i10, z3));
                        ntt0Var2 = ntt0Var;
                        i4 = i6;
                        c2 = 1;
                    } else {
                        i6 = i4;
                    }
                    ghw0Var.m126240g(new ewy0(i3, ntt0Var2, 0, bvy0Var2, iArr4[0], i10, z3));
                    ntt0Var2 = ntt0Var;
                    i4 = i6;
                    c2 = 1;
                }
            }
        }, new Comparator() { // from class: l.suy0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                ahw0 ahw0VarM96742j = ahw0.m96742j();
                cwy0 cwy0Var = new Comparator() { // from class: l.cwy0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ewy0.m118528g((ewy0) obj3, (ewy0) obj4);
                    }
                };
                ahw0 ahw0VarMo96744b = ahw0VarM96742j.mo96746d((ewy0) Collections.max(list, cwy0Var), (ewy0) Collections.max(list2, cwy0Var), cwy0Var).mo96744b(list.size(), list2.size());
                dwy0 dwy0Var = new Comparator() { // from class: l.dwy0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ewy0.m118527f((ewy0) obj3, (ewy0) obj4);
                    }
                };
                return ahw0VarMo96744b.mo96746d((ewy0) Collections.max(list, dwy0Var), (ewy0) Collections.max(list2, dwy0Var), dwy0Var).mo96743a();
            }
        });
        int i3 = 4;
        Pair pairM123587w2 = pairM123587w == null ? m123587w(4, jwy0Var, iArr, new awy0() { // from class: l.muy0
            @Override // p149l.awy0
            /* JADX INFO: renamed from: a */
            public final List mo99330a(int i4, ntt0 ntt0Var, int[] iArr4) {
                AbstractC2116c3 abstractC2116c3 = fwy0.f99706k;
                ghw0 ghw0Var = new ghw0();
                int i5 = 0;
                while (true) {
                    int i6 = ntt0Var.f140535a;
                    if (i5 > 0) {
                        return ghw0Var.m126243j();
                    }
                    ghw0Var.m126240g(new vuy0(i4, ntt0Var, i5, bvy0Var, iArr4[i5]));
                    i5++;
                }
            }
        }, new Comparator() { // from class: l.nuy0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((vuy0) ((List) obj).get(0)).m200143f((vuy0) ((List) obj2).get(0));
            }
        }) : null;
        if (pairM123587w2 != null) {
            gwy0VarArr[((Integer) pairM123587w2.second).intValue()] = (gwy0) pairM123587w2.first;
        } else if (pairM123587w != null) {
            gwy0VarArr[((Integer) pairM123587w.second).intValue()] = (gwy0) pairM123587w.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (jwy0Var.m143697c(i4) == 2 && jwy0Var.m143698d(i4).f124629a > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM123587w3 = m123587w(1, jwy0Var, iArr, new awy0() { // from class: l.puy0
            @Override // p149l.awy0
            /* JADX INFO: renamed from: a */
            public final List mo99330a(int i5, ntt0 ntt0Var, int[] iArr4) {
                final fwy0 fwy0Var = this.f151371a;
                ofw0 ofw0Var = new ofw0() { // from class: l.ouy0
                    @Override // p149l.ofw0
                    public final boolean zza(Object obj) {
                        return fwy0.m123584s(fwy0Var, (mhr0) obj);
                    }
                };
                int i6 = iArr2[i5];
                ghw0 ghw0Var = new ghw0();
                int i7 = 0;
                while (true) {
                    int i8 = ntt0Var.f140535a;
                    if (i7 > 0) {
                        return ghw0Var.m126243j();
                    }
                    ghw0Var.m126240g(new uuy0(i5, ntt0Var, i7, bvy0Var, iArr4[i7], z, ofw0Var, i6));
                    i7++;
                }
            }
        }, new Comparator() { // from class: l.quy0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((uuy0) Collections.max((List) obj)).m196046f((uuy0) Collections.max((List) obj2));
            }
        });
        if (pairM123587w3 != null) {
            gwy0VarArr[((Integer) pairM123587w3.second).intValue()] = (gwy0) pairM123587w3.first;
        }
        if (pairM123587w3 == null) {
            str = null;
        } else {
            Object obj = pairM123587w3.first;
            str = ((gwy0) obj).f104802a.m161414b(((gwy0) obj).f104803b[0]).f133883c;
        }
        int i5 = 3;
        Pair pairM123587w4 = m123587w(3, jwy0Var, iArr, new awy0() { // from class: l.tuy0
            @Override // p149l.awy0
            /* JADX INFO: renamed from: a */
            public final List mo99330a(int i6, ntt0 ntt0Var, int[] iArr4) {
                AbstractC2116c3 abstractC2116c3 = fwy0.f99706k;
                ghw0 ghw0Var = new ghw0();
                int i7 = 0;
                while (true) {
                    int i8 = ntt0Var.f140535a;
                    if (i7 > 0) {
                        return ghw0Var.m126243j();
                    }
                    ghw0Var.m126240g(new zvy0(i6, ntt0Var, i7, bvy0Var, iArr4[i7], str));
                    i7++;
                }
            }
        }, new Comparator() { // from class: l.kuy0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zvy0) ((List) obj2).get(0)).m220496f((zvy0) ((List) obj3).get(0));
            }
        });
        if (pairM123587w4 != null) {
            gwy0VarArr[((Integer) pairM123587w4.second).intValue()] = (gwy0) pairM123587w4.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int iM143697c = jwy0Var.m143697c(i6);
            if (iM143697c != i2 && iM143697c != i && iM143697c != i5 && iM143697c != i3) {
                kty0 kty0VarM143698d = jwy0Var.m143698d(i6);
                int[][] iArr4 = iArr[i6];
                int i7 = 0;
                ntt0 ntt0Var = null;
                wuy0 wuy0Var = null;
                while (i7 < kty0VarM143698d.f124629a) {
                    ntt0 ntt0VarM147224b = kty0VarM143698d.m147224b(i7);
                    int[] iArr5 = iArr4[i7];
                    wuy0 wuy0Var2 = wuy0Var;
                    char c = 0;
                    while (true) {
                        int i8 = ntt0VarM147224b.f140535a;
                        if (c <= 0) {
                            if (m123585t(iArr5[0], bvy0Var.f77538v0)) {
                                wuy0 wuy0Var3 = new wuy0(ntt0VarM147224b.m161414b(0), iArr5[0]);
                                if (wuy0Var2 == null || wuy0Var3.compareTo(wuy0Var2) > 0) {
                                    ntt0Var = ntt0VarM147224b;
                                    wuy0Var2 = wuy0Var3;
                                }
                            }
                            c = 1;
                        }
                    }
                    i7++;
                    wuy0Var = wuy0Var2;
                }
                gwy0VarArr[i6] = ntt0Var == null ? null : new gwy0(ntt0Var, new int[]{0}, 0);
            }
            i6++;
            i2 = 2;
            i3 = 4;
            i = 1;
            i5 = 3;
        }
        HashMap map = new HashMap();
        int i9 = 2;
        for (int i10 = 0; i10 < 2; i10++) {
            m123586u(jwy0Var.m143698d(i10), bvy0Var, map);
        }
        m123586u(jwy0Var.m143699e(), bvy0Var, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((gxt0) map.get(Integer.valueOf(jwy0Var.m143697c(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        while (i12 < i9) {
            kty0 kty0VarM143698d2 = jwy0Var.m143698d(i12);
            if (bvy0Var.m104101g(i12, kty0VarM143698d2)) {
                if (bvy0Var.m104099e(i12, kty0VarM143698d2) != null) {
                    throw null;
                }
                gwy0VarArr[i12] = null;
            }
            i12++;
            i9 = 2;
        }
        int i13 = 0;
        while (i13 < i9) {
            int iM143697c2 = jwy0Var.m143697c(i13);
            if (bvy0Var.m104100f(i13) || bvy0Var.f131158B.contains(Integer.valueOf(iM143697c2))) {
                gwy0VarArr[i13] = null;
            }
            i13++;
            i9 = 2;
        }
        pty0 pty0Var2 = this.f99714j;
        vwy0 vwy0VarM161922g = m161922g();
        zzgaa zzgaaVarM176489a = qty0.m176489a(gwy0VarArr);
        int i14 = 2;
        hwy0[] hwy0VarArr = new hwy0[2];
        int i15 = 0;
        while (i15 < i14) {
            gwy0 gwy0Var = gwy0VarArr[i15];
            if (gwy0Var == null || (length = (iArr3 = gwy0Var.f104803b).length) == 0) {
                pty0Var = pty0Var2;
            } else {
                ntt0 ntt0Var2 = gwy0Var.f104802a;
                if (length == 1) {
                    hwy0VarM171388a = new iwy0(ntt0Var2, iArr3[0], 0, 0, null);
                    pty0Var = pty0Var2;
                } else {
                    pty0Var = pty0Var2;
                    hwy0VarM171388a = pty0Var.m171388a(ntt0Var2, iArr3, 0, vwy0VarM161922g, (zzgaa) zzgaaVarM176489a.get(i15));
                }
                hwy0VarArr[i15] = hwy0VarM171388a;
            }
            i15++;
            pty0Var2 = pty0Var;
            i14 = 2;
        }
        x5y0[] x5y0VarArr = new x5y0[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            x5y0VarArr[i16] = (bvy0Var.m104100f(i16) || bvy0Var.f131158B.contains(Integer.valueOf(jwy0Var.m143697c(i16))) || (jwy0Var.m143697c(i16) != -2 && hwy0VarArr[i16] == null)) ? null : x5y0.f191204b;
        }
        return Pair.create(x5y0VarArr, hwy0VarArr);
    }

    /* JADX INFO: renamed from: m */
    public final bvy0 m123593m() {
        bvy0 bvy0Var;
        synchronized (this.f99708d) {
            bvy0Var = this.f99711g;
        }
        return bvy0Var;
    }

    /* JADX INFO: renamed from: r */
    public final void m123594r(zuy0 zuy0Var) {
        boolean zEquals;
        bvy0 bvy0Var = new bvy0(zuy0Var);
        synchronized (this.f99708d) {
            zEquals = this.f99711g.equals(bvy0Var);
            this.f99711g = bvy0Var;
        }
        if (zEquals) {
            return;
        }
        if (bvy0Var.f77537u0 && this.f99709e == null) {
            svv0.m186111f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m161924i();
    }

    /* JADX INFO: renamed from: v */
    public final void m123595v() {
        boolean z;
        gvy0 gvy0Var;
        synchronized (this.f99708d) {
            try {
                z = false;
                if (this.f99711g.f77537u0 && !this.f99710f && ggw0.f102568a >= 32 && (gvy0Var = this.f99712h) != null && gvy0Var.m128301g()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m161924i();
        }
    }

    @Override // p149l.nwy0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final s5y0 mo123588a() {
        return this;
    }
}
