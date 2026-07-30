package p153l;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2139c3;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
public final class l5z0 extends q5z0 implements yey0 {

    /* JADX INFO: renamed from: k */
    public static final AbstractC2139c3 f130209k = AbstractC2139c3.zzb(new Comparator() { // from class: l.p3z0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            AbstractC2139c3 abstractC2139c3 = l5z0.f130209k;
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
    public static final AbstractC2139c3 f130210l = AbstractC2139c3.zzb(new Comparator() { // from class: l.r3z0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC2139c3 abstractC2139c3 = l5z0.f130209k;
            return 0;
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f130211d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Context f130212e;

    /* JADX INFO: renamed from: f */
    public final boolean f130213f;

    /* JADX INFO: renamed from: g */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public h4z0 f130214g;

    /* JADX INFO: renamed from: h */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public m4z0 f130215h;

    /* JADX INFO: renamed from: i */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public w3y0 f130216i;

    /* JADX INFO: renamed from: j */
    public final v2z0 f130217j;

    public l5z0(Context context) {
        v2z0 v2z0Var = new v2z0();
        h4z0 h4z0VarM133600d = h4z0.m133600d(context);
        this.f130211d = new Object();
        this.f130212e = context != null ? context.getApplicationContext() : null;
        this.f130217j = v2z0Var;
        this.f130214g = h4z0VarM133600d;
        this.f130216i = w3y0.f187185b;
        boolean z = false;
        if (context != null && mpw0.m159412j(context)) {
            z = true;
        }
        this.f130213f = z;
        if (!z && context != null && mpw0.f137957a >= 32) {
            this.f130215h = m4z0.m157065a(context);
        }
        if (this.f130214g.f107872u0 && context == null) {
            y4w0.m214278f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ int m153027k(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: l */
    public static int m153028l(sqr0 sqr0Var, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(sqr0Var.f170242c)) {
            return 4;
        }
        String strM153031p = m153031p(str);
        String strM153031p2 = m153031p(sqr0Var.f170242c);
        if (strM153031p2 == null || strM153031p == null) {
            return (z && strM153031p2 == null) ? 1 : 0;
        }
        if (strM153031p2.startsWith(strM153031p) || strM153031p.startsWith(strM153031p2)) {
            return 3;
        }
        int i = mpw0.f137957a;
        return strM153031p2.split("-", 2)[0].equals(strM153031p.split("-", 2)[0]) ? 2 : 0;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static String m153031p(@Nullable String str) {
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
    public static /* synthetic */ boolean m153033s(l5z0 l5z0Var, sqr0 sqr0Var) {
        boolean z;
        m4z0 m4z0Var;
        m4z0 m4z0Var2;
        synchronized (l5z0Var.f130211d) {
            try {
                z = true;
                if (l5z0Var.f130214g.f107872u0 && !l5z0Var.f130213f && sqr0Var.f170264y > 2) {
                    String str = sqr0Var.f170251l;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    if (mpw0.f137957a >= 32 && (m4z0Var = l5z0Var.f130215h) != null && m4z0Var.m157071g()) {
                                    }
                                }
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    if (mpw0.f137957a >= 32) {
                                    }
                                }
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    if (mpw0.f137957a >= 32) {
                                    }
                                }
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    if (mpw0.f137957a >= 32) {
                                    }
                                }
                                break;
                        }
                    }
                    if (mpw0.f137957a < 32 || (m4z0Var2 = l5z0Var.f130215h) == null || !m4z0Var2.m157071g() || !m4z0Var2.m157069e() || !l5z0Var.f130215h.m157070f() || !l5z0Var.f130215h.m157068d(l5z0Var.f130216i, sqr0Var)) {
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
    public static boolean m153034t(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static void m153035u(q2z0 q2z0Var, scu0 scu0Var, Map map) {
        for (int i = 0; i < q2z0Var.f155401a; i++) {
            if (((m6u0) scu0Var.f167318A.get(q2z0Var.m175102b(i))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static final Pair m153036w(int i, p5z0 p5z0Var, int[][][] iArr, g5z0 g5z0Var, Comparator comparator) {
        boolean z;
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == p5z0Var.m170703c(i2)) {
                q2z0 q2z0VarM170704d = p5z0Var.m170704d(i2);
                for (int i3 = 0; i3 < q2z0VarM170704d.f155401a; i3++) {
                    t2u0 t2u0VarM175102b = q2z0VarM170704d.m175102b(i3);
                    List listMo129077a = g5z0Var.mo129077a(i2, t2u0VarM175102b, iArr[i2][i3]);
                    int i4 = t2u0VarM175102b.f171820a;
                    boolean z2 = true;
                    boolean[] zArr = new boolean[1];
                    int i5 = 0;
                    while (i5 <= 0) {
                        int i6 = i5 + 1;
                        h5z0 h5z0Var = (h5z0) listMo129077a.get(i5);
                        int iMo96008a = h5z0Var.mo96008a();
                        if (zArr[i5] || iMo96008a == 0) {
                            z = z2;
                        } else {
                            if (iMo96008a == z2) {
                                arrayList = zzgaa.zzm(h5z0Var);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(h5z0Var);
                                int i7 = i6;
                                while (i7 <= 0) {
                                    boolean z3 = z2;
                                    h5z0 h5z0Var2 = (h5z0) listMo129077a.get(i7);
                                    if (h5z0Var2.mo96008a() == 2 && h5z0Var.mo96009b(h5z0Var2)) {
                                        arrayList.add(h5z0Var2);
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
            iArr2[i8] = ((h5z0) list.get(i8)).f107991c;
        }
        h5z0 h5z0Var3 = (h5z0) list.get(0);
        return Pair.create(new m5z0(h5z0Var3.f107990b, iArr2, 0), Integer.valueOf(h5z0Var3.f107989a));
    }

    @Override // p153l.t5z0
    /* JADX INFO: renamed from: b */
    public final void mo153038b() {
        m4z0 m4z0Var;
        synchronized (this.f130211d) {
            try {
                if (mpw0.f137957a >= 32 && (m4z0Var = this.f130215h) != null) {
                    m4z0Var.m157067c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo153038b();
    }

    @Override // p153l.t5z0
    /* JADX INFO: renamed from: c */
    public final void mo153039c(w3y0 w3y0Var) {
        boolean zEquals;
        synchronized (this.f130211d) {
            zEquals = this.f130216i.equals(w3y0Var);
            this.f130216i = w3y0Var;
        }
        if (zEquals) {
            return;
        }
        m153044v();
    }

    @Override // p153l.t5z0
    /* JADX INFO: renamed from: d */
    public final boolean mo153040d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.q5z0
    /* JADX INFO: renamed from: j */
    public final Pair mo153041j(p5z0 p5z0Var, int[][][] iArr, final int[] iArr2, kzy0 kzy0Var, d0u0 d0u0Var) throws zziz {
        final h4z0 h4z0Var;
        int i;
        final boolean z;
        final String str;
        v2z0 v2z0Var;
        int[] iArr3;
        int length;
        n5z0 n5z0VarM199159a;
        m4z0 m4z0Var;
        synchronized (this.f130211d) {
            try {
                h4z0Var = this.f130214g;
                if (h4z0Var.f107872u0 && mpw0.f137957a >= 32 && (m4z0Var = this.f130215h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    lev0.m153954b(looperMyLooper);
                    m4z0Var.m157066b(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 2;
        m5z0[] m5z0VarArr = new m5z0[2];
        Pair pairM153036w = m153036w(2, p5z0Var, iArr, new g5z0() { // from class: l.x3z0
            /* JADX WARN: Code duplicated, block: B:22:0x0042  */
            @Override // p153l.g5z0
            /* JADX INFO: renamed from: a */
            public final List mo129077a(int i3, t2u0 t2u0Var, int[] iArr4) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                Point point;
                t2u0 t2u0Var2 = t2u0Var;
                AbstractC2139c3 abstractC2139c3 = l5z0.f130209k;
                h4z0 h4z0Var2 = h4z0Var;
                int i10 = iArr2[i3];
                int i11 = h4z0Var2.f167328i;
                int i12 = h4z0Var2.f167329j;
                boolean z2 = h4z0Var2.f167330k;
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
                        int i14 = t2u0Var2.f171820a;
                        if (c > 0) {
                            break;
                        }
                        sqr0 sqr0VarM189003b = t2u0Var2.m189003b(0);
                        int i15 = sqr0VarM189003b.f170256q;
                        if (i15 > 0 && (i7 = sqr0VarM189003b.f170257r) > 0) {
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
                                int i18 = mpw0.f137957a;
                                point = new Point(i8, ((i17 + i15) - 1) / i15);
                            } else {
                                int i19 = mpw0.f137957a;
                                point = new Point(((i16 + i7) - 1) / i7, i9);
                            }
                            int i20 = sqr0VarM189003b.f170256q;
                            int i21 = sqr0VarM189003b.f170257r;
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
                mqw0 mqw0Var = new mqw0();
                char c2 = 0;
                while (true) {
                    int i23 = t2u0Var2.f171820a;
                    if (c2 > 0) {
                        return mqw0Var.m159616j();
                    }
                    int iM187558a = t2u0Var2.m189003b(0).m187558a();
                    if (i5 != Integer.MAX_VALUE) {
                        i6 = i4;
                        boolean z3 = iM187558a != i6 && iM187558a <= i5;
                        mqw0Var.m159613g(new k5z0(i3, t2u0Var2, 0, h4z0Var2, iArr4[0], i10, z3));
                        t2u0Var2 = t2u0Var;
                        i4 = i6;
                        c2 = 1;
                    } else {
                        i6 = i4;
                    }
                    mqw0Var.m159613g(new k5z0(i3, t2u0Var2, 0, h4z0Var2, iArr4[0], i10, z3));
                    t2u0Var2 = t2u0Var;
                    i4 = i6;
                    c2 = 1;
                }
            }
        }, new Comparator() { // from class: l.y3z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                gqw0 gqw0VarM131503j = gqw0.m131503j();
                i5z0 i5z0Var = new Comparator() { // from class: l.i5z0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return k5z0.m148509g((k5z0) obj3, (k5z0) obj4);
                    }
                };
                gqw0 gqw0VarMo117578b = gqw0VarM131503j.mo117580d((k5z0) Collections.max(list, i5z0Var), (k5z0) Collections.max(list2, i5z0Var), i5z0Var).mo117578b(list.size(), list2.size());
                j5z0 j5z0Var = new Comparator() { // from class: l.j5z0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return k5z0.m148508f((k5z0) obj3, (k5z0) obj4);
                    }
                };
                return gqw0VarMo117578b.mo117580d((k5z0) Collections.max(list, j5z0Var), (k5z0) Collections.max(list2, j5z0Var), j5z0Var).mo117577a();
            }
        });
        int i3 = 4;
        Pair pairM153036w2 = pairM153036w == null ? m153036w(4, p5z0Var, iArr, new g5z0() { // from class: l.s3z0
            @Override // p153l.g5z0
            /* JADX INFO: renamed from: a */
            public final List mo129077a(int i4, t2u0 t2u0Var, int[] iArr4) {
                AbstractC2139c3 abstractC2139c3 = l5z0.f130209k;
                mqw0 mqw0Var = new mqw0();
                int i5 = 0;
                while (true) {
                    int i6 = t2u0Var.f171820a;
                    if (i5 > 0) {
                        return mqw0Var.m159616j();
                    }
                    mqw0Var.m159613g(new b4z0(i4, t2u0Var, i5, h4z0Var, iArr4[i5]));
                    i5++;
                }
            }
        }, new Comparator() { // from class: l.t3z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((b4z0) ((List) obj).get(0)).m102544f((b4z0) ((List) obj2).get(0));
            }
        }) : null;
        if (pairM153036w2 != null) {
            m5z0VarArr[((Integer) pairM153036w2.second).intValue()] = (m5z0) pairM153036w2.first;
        } else if (pairM153036w != null) {
            m5z0VarArr[((Integer) pairM153036w.second).intValue()] = (m5z0) pairM153036w.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (p5z0Var.m170703c(i4) == 2 && p5z0Var.m170704d(i4).f155401a > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair pairM153036w3 = m153036w(1, p5z0Var, iArr, new g5z0() { // from class: l.v3z0
            @Override // p153l.g5z0
            /* JADX INFO: renamed from: a */
            public final List mo129077a(int i5, t2u0 t2u0Var, int[] iArr4) {
                final l5z0 l5z0Var = this.f182316a;
                uow0 uow0Var = new uow0() { // from class: l.u3z0
                    @Override // p153l.uow0
                    public final boolean zza(Object obj) {
                        return l5z0.m153033s(l5z0Var, (sqr0) obj);
                    }
                };
                int i6 = iArr2[i5];
                mqw0 mqw0Var = new mqw0();
                int i7 = 0;
                while (true) {
                    int i8 = t2u0Var.f171820a;
                    if (i7 > 0) {
                        return mqw0Var.m159616j();
                    }
                    mqw0Var.m159613g(new a4z0(i5, t2u0Var, i7, h4z0Var, iArr4[i7], z, uow0Var, i6));
                    i7++;
                }
            }
        }, new Comparator() { // from class: l.w3z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((a4z0) Collections.max((List) obj)).m96010f((a4z0) Collections.max((List) obj2));
            }
        });
        if (pairM153036w3 != null) {
            m5z0VarArr[((Integer) pairM153036w3.second).intValue()] = (m5z0) pairM153036w3.first;
        }
        if (pairM153036w3 == null) {
            str = null;
        } else {
            Object obj = pairM153036w3.first;
            str = ((m5z0) obj).f134954a.m189003b(((m5z0) obj).f134955b[0]).f170242c;
        }
        int i5 = 3;
        Pair pairM153036w4 = m153036w(3, p5z0Var, iArr, new g5z0() { // from class: l.z3z0
            @Override // p153l.g5z0
            /* JADX INFO: renamed from: a */
            public final List mo129077a(int i6, t2u0 t2u0Var, int[] iArr4) {
                AbstractC2139c3 abstractC2139c3 = l5z0.f130209k;
                mqw0 mqw0Var = new mqw0();
                int i7 = 0;
                while (true) {
                    int i8 = t2u0Var.f171820a;
                    if (i7 > 0) {
                        return mqw0Var.m159616j();
                    }
                    mqw0Var.m159613g(new f5z0(i6, t2u0Var, i7, h4z0Var, iArr4[i7], str));
                    i7++;
                }
            }
        }, new Comparator() { // from class: l.q3z0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((f5z0) ((List) obj2).get(0)).m124262f((f5z0) ((List) obj3).get(0));
            }
        });
        if (pairM153036w4 != null) {
            m5z0VarArr[((Integer) pairM153036w4.second).intValue()] = (m5z0) pairM153036w4.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int iM170703c = p5z0Var.m170703c(i6);
            if (iM170703c != i2 && iM170703c != i && iM170703c != i5 && iM170703c != i3) {
                q2z0 q2z0VarM170704d = p5z0Var.m170704d(i6);
                int[][] iArr4 = iArr[i6];
                int i7 = 0;
                t2u0 t2u0Var = null;
                c4z0 c4z0Var = null;
                while (i7 < q2z0VarM170704d.f155401a) {
                    t2u0 t2u0VarM175102b = q2z0VarM170704d.m175102b(i7);
                    int[] iArr5 = iArr4[i7];
                    c4z0 c4z0Var2 = c4z0Var;
                    char c = 0;
                    while (true) {
                        int i8 = t2u0VarM175102b.f171820a;
                        if (c <= 0) {
                            if (m153034t(iArr5[0], h4z0Var.f107873v0)) {
                                c4z0 c4z0Var3 = new c4z0(t2u0VarM175102b.m189003b(0), iArr5[0]);
                                if (c4z0Var2 == null || c4z0Var3.compareTo(c4z0Var2) > 0) {
                                    t2u0Var = t2u0VarM175102b;
                                    c4z0Var2 = c4z0Var3;
                                }
                            }
                            c = 1;
                        }
                    }
                    i7++;
                    c4z0Var = c4z0Var2;
                }
                m5z0VarArr[i6] = t2u0Var == null ? null : new m5z0(t2u0Var, new int[]{0}, 0);
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
            m153035u(p5z0Var.m170704d(i10), h4z0Var, map);
        }
        m153035u(p5z0Var.m170705e(), h4z0Var, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((m6u0) map.get(Integer.valueOf(p5z0Var.m170703c(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        while (i12 < i9) {
            q2z0 q2z0VarM170704d2 = p5z0Var.m170704d(i12);
            if (h4z0Var.m133604g(i12, q2z0VarM170704d2)) {
                if (h4z0Var.m133602e(i12, q2z0VarM170704d2) != null) {
                    throw null;
                }
                m5z0VarArr[i12] = null;
            }
            i12++;
            i9 = 2;
        }
        int i13 = 0;
        while (i13 < i9) {
            int iM170703c2 = p5z0Var.m170703c(i13);
            if (h4z0Var.m133603f(i13) || h4z0Var.f167319B.contains(Integer.valueOf(iM170703c2))) {
                m5z0VarArr[i13] = null;
            }
            i13++;
            i9 = 2;
        }
        v2z0 v2z0Var2 = this.f130217j;
        b6z0 b6z0VarM189440g = m189440g();
        zzgaa zzgaaVarM204611a = w2z0.m204611a(m5z0VarArr);
        int i14 = 2;
        n5z0[] n5z0VarArr = new n5z0[2];
        int i15 = 0;
        while (i15 < i14) {
            m5z0 m5z0Var = m5z0VarArr[i15];
            if (m5z0Var == null || (length = (iArr3 = m5z0Var.f134955b).length) == 0) {
                v2z0Var = v2z0Var2;
            } else {
                t2u0 t2u0Var2 = m5z0Var.f134954a;
                if (length == 1) {
                    n5z0VarM199159a = new o5z0(t2u0Var2, iArr3[0], 0, 0, null);
                    v2z0Var = v2z0Var2;
                } else {
                    v2z0Var = v2z0Var2;
                    n5z0VarM199159a = v2z0Var.m199159a(t2u0Var2, iArr3, 0, b6z0VarM189440g, (zzgaa) zzgaaVarM204611a.get(i15));
                }
                n5z0VarArr[i15] = n5z0VarM199159a;
            }
            i15++;
            v2z0Var2 = v2z0Var;
            i14 = 2;
        }
        dfy0[] dfy0VarArr = new dfy0[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            dfy0VarArr[i16] = (h4z0Var.m133603f(i16) || h4z0Var.f167319B.contains(Integer.valueOf(p5z0Var.m170703c(i16))) || (p5z0Var.m170703c(i16) != -2 && n5z0VarArr[i16] == null)) ? null : dfy0.f88236b;
        }
        return Pair.create(dfy0VarArr, n5z0VarArr);
    }

    /* JADX INFO: renamed from: m */
    public final h4z0 m153042m() {
        h4z0 h4z0Var;
        synchronized (this.f130211d) {
            h4z0Var = this.f130214g;
        }
        return h4z0Var;
    }

    /* JADX INFO: renamed from: r */
    public final void m153043r(f4z0 f4z0Var) {
        boolean zEquals;
        h4z0 h4z0Var = new h4z0(f4z0Var);
        synchronized (this.f130211d) {
            zEquals = this.f130214g.equals(h4z0Var);
            this.f130214g = h4z0Var;
        }
        if (zEquals) {
            return;
        }
        if (h4z0Var.f107872u0 && this.f130212e == null) {
            y4w0.m214278f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m189442i();
    }

    /* JADX INFO: renamed from: v */
    public final void m153044v() {
        boolean z;
        m4z0 m4z0Var;
        synchronized (this.f130211d) {
            try {
                z = false;
                if (this.f130214g.f107872u0 && !this.f130213f && mpw0.f137957a >= 32 && (m4z0Var = this.f130215h) != null && m4z0Var.m157071g()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m189442i();
        }
    }

    @Override // p153l.t5z0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final yey0 mo153037a() {
        return this;
    }
}
