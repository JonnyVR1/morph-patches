package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import p149l.aox0;
import p149l.erx0;
import p149l.irx0;
import p149l.itx0;
import p149l.oox0;
import p149l.smx0;
import p149l.whx0;
import p149l.xkx0;
import p149l.y5x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2392j0 {

    /* JADX INFO: renamed from: a */
    public static final erx0 f10351a;

    static {
        aox0 aox0Var = aox0.f70954c;
        f10351a = new C2394k0();
    }

    /* JADX INFO: renamed from: A */
    public static void m14831A(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138287J(i, list, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m14832B(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138283F(i, list, z);
    }

    /* JADX INFO: renamed from: C */
    public static void m14833C(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138290M(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static void m14834D(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138288K(i, list, z);
    }

    /* JADX INFO: renamed from: E */
    public static void m14835E(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138299l(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m14836a(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138309v(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m14837b(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138278A(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m14838c(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138307t(i, list, z);
    }

    /* JADX INFO: renamed from: d */
    public static void m14839d(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138285H(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14840e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m14841f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM14718a = 0;
            while (i < size) {
                iM14718a += AbstractC2372a0.m14718a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14718a;
        }
        whx0 whx0Var = (whx0) list;
        int iM14718a2 = 0;
        while (i < size) {
            iM14718a2 += AbstractC2372a0.m14718a(whx0Var.m203255c(i));
            i++;
        }
        return iM14718a2;
    }

    /* JADX INFO: renamed from: g */
    public static int m14842g(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2372a0.m14717B(i << 3) + 4);
    }

    /* JADX INFO: renamed from: h */
    public static int m14843h(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: i */
    public static int m14844i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2372a0.m14717B(i << 3) + 8);
    }

    /* JADX INFO: renamed from: j */
    public static int m14845j(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m14846k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM14718a = 0;
            while (i < size) {
                iM14718a += AbstractC2372a0.m14718a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14718a;
        }
        whx0 whx0Var = (whx0) list;
        int iM14718a2 = 0;
        while (i < size) {
            iM14718a2 += AbstractC2372a0.m14718a(whx0Var.m203255c(i));
            i++;
        }
        return iM14718a2;
    }

    /* JADX INFO: renamed from: l */
    public static int m14847l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xkx0)) {
            int iM14718a = 0;
            while (i < size) {
                iM14718a += AbstractC2372a0.m14718a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM14718a;
        }
        xkx0 xkx0Var = (xkx0) list;
        int iM14718a2 = 0;
        while (i < size) {
            iM14718a2 += AbstractC2372a0.m14718a(xkx0Var.m209836c(i));
            i++;
        }
        return iM14718a2;
    }

    /* JADX INFO: renamed from: m */
    public static int m14848m(int i, Object obj, oox0 oox0Var) {
        int i2 = i << 3;
        if (!(obj instanceof C2382e0)) {
            return AbstractC2372a0.m14717B(i2) + AbstractC2372a0.m14721z((smx0) obj, oox0Var);
        }
        int iM14717B = AbstractC2372a0.m14717B(i2);
        int iM14785a = ((C2382e0) obj).m14785a();
        return iM14717B + AbstractC2372a0.m14717B(iM14785a) + iM14785a;
    }

    /* JADX INFO: renamed from: n */
    public static int m14849n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM14717B = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM14717B += AbstractC2372a0.m14717B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM14717B;
        }
        whx0 whx0Var = (whx0) list;
        int iM14717B2 = 0;
        while (i < size) {
            int iM203255c = whx0Var.m203255c(i);
            iM14717B2 += AbstractC2372a0.m14717B((iM203255c >> 31) ^ (iM203255c + iM203255c));
            i++;
        }
        return iM14717B2;
    }

    /* JADX INFO: renamed from: o */
    public static int m14850o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xkx0)) {
            int iM14718a = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM14718a += AbstractC2372a0.m14718a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM14718a;
        }
        xkx0 xkx0Var = (xkx0) list;
        int iM14718a2 = 0;
        while (i < size) {
            long jM209836c = xkx0Var.m209836c(i);
            iM14718a2 += AbstractC2372a0.m14718a((jM209836c >> 63) ^ (jM209836c + jM209836c));
            i++;
        }
        return iM14718a2;
    }

    /* JADX INFO: renamed from: p */
    public static int m14851p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM14717B = 0;
            while (i < size) {
                iM14717B += AbstractC2372a0.m14717B(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14717B;
        }
        whx0 whx0Var = (whx0) list;
        int iM14717B2 = 0;
        while (i < size) {
            iM14717B2 += AbstractC2372a0.m14717B(whx0Var.m203255c(i));
            i++;
        }
        return iM14717B2;
    }

    /* JADX INFO: renamed from: q */
    public static int m14852q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xkx0)) {
            int iM14718a = 0;
            while (i < size) {
                iM14718a += AbstractC2372a0.m14718a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM14718a;
        }
        xkx0 xkx0Var = (xkx0) list;
        int iM14718a2 = 0;
        while (i < size) {
            iM14718a2 += AbstractC2372a0.m14718a(xkx0Var.m209836c(i));
            i++;
        }
        return iM14718a2;
    }

    /* JADX INFO: renamed from: r */
    public static erx0 m14853r() {
        return f10351a;
    }

    /* JADX INFO: renamed from: s */
    public static Object m14854s(Object obj, int i, int i2, Object obj2, erx0 erx0Var) {
        AbstractC2380d0 abstractC2380d0;
        irx0 irx0Var;
        Object obj3 = obj2;
        if (obj2 == null && (irx0Var = (abstractC2380d0 = (AbstractC2380d0) obj).zzc) == irx0.m137921c()) {
            obj3 = irx0Var;
            irx0 irx0VarM137923f = irx0.m137923f();
            abstractC2380d0.zzc = irx0VarM137923f;
            obj3 = irx0VarM137923f;
        }
        obj3 = irx0Var;
        ((irx0) obj3).m137930j(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* JADX INFO: renamed from: t */
    public static void m14855t(y5x0 y5x0Var, Object obj, Object obj2) {
        if (((AbstractC2378c0) obj2).zzb.f163460a.isEmpty()) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static void m14856u(erx0 erx0Var, Object obj, Object obj2) {
        AbstractC2380d0 abstractC2380d0 = (AbstractC2380d0) obj;
        irx0 irx0VarM137922e = abstractC2380d0.zzc;
        irx0 irx0Var = ((AbstractC2380d0) obj2).zzc;
        if (!irx0.m137921c().equals(irx0Var)) {
            if (irx0.m137921c().equals(irx0VarM137922e)) {
                irx0VarM137922e = irx0.m137922e(irx0VarM137922e, irx0Var);
            } else {
                irx0VarM137922e.m137926d(irx0Var);
            }
        }
        abstractC2380d0.zzc = irx0VarM137922e;
    }

    /* JADX INFO: renamed from: v */
    public static void m14857v(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138291a(i, list, z);
    }

    /* JADX INFO: renamed from: w */
    public static void m14858w(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138294g(i, list, z);
    }

    /* JADX INFO: renamed from: x */
    public static void m14859x(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138293f(i, list, z);
    }

    /* JADX INFO: renamed from: y */
    public static void m14860y(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138292c(i, list, z);
    }

    /* JADX INFO: renamed from: z */
    public static void m14861z(int i, List list, itx0 itx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        itx0Var.mo138296i(i, list, z);
    }
}
