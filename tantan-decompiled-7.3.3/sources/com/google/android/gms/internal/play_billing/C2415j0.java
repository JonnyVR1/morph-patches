package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import p153l.crx0;
import p153l.dux0;
import p153l.efx0;
import p153l.gxx0;
import p153l.k0y0;
import p153l.o0y0;
import p153l.o2y0;
import p153l.uxx0;
import p153l.yvx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2415j0 {

    /* JADX INFO: renamed from: a */
    public static final k0y0 f10388a;

    static {
        gxx0 gxx0Var = gxx0.f107009c;
        f10388a = new C2417k0();
    }

    /* JADX INFO: renamed from: A */
    public static void m14885A(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165804J(i, list, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m14886B(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165800F(i, list, z);
    }

    /* JADX INFO: renamed from: C */
    public static void m14887C(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165807M(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static void m14888D(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165805K(i, list, z);
    }

    /* JADX INFO: renamed from: E */
    public static void m14889E(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165816l(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m14890a(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165826v(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m14891b(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165795A(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m14892c(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165824t(i, list, z);
    }

    /* JADX INFO: renamed from: d */
    public static void m14893d(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165802H(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14894e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m14895f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof crx0)) {
            int iM14772a = 0;
            while (i < size) {
                iM14772a += AbstractC2395a0.m14772a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14772a;
        }
        crx0 crx0Var = (crx0) list;
        int iM14772a2 = 0;
        while (i < size) {
            iM14772a2 += AbstractC2395a0.m14772a(crx0Var.m112093c(i));
            i++;
        }
        return iM14772a2;
    }

    /* JADX INFO: renamed from: g */
    public static int m14896g(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2395a0.m14771B(i << 3) + 4);
    }

    /* JADX INFO: renamed from: h */
    public static int m14897h(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: i */
    public static int m14898i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2395a0.m14771B(i << 3) + 8);
    }

    /* JADX INFO: renamed from: j */
    public static int m14899j(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: k */
    public static int m14900k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof crx0)) {
            int iM14772a = 0;
            while (i < size) {
                iM14772a += AbstractC2395a0.m14772a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14772a;
        }
        crx0 crx0Var = (crx0) list;
        int iM14772a2 = 0;
        while (i < size) {
            iM14772a2 += AbstractC2395a0.m14772a(crx0Var.m112093c(i));
            i++;
        }
        return iM14772a2;
    }

    /* JADX INFO: renamed from: l */
    public static int m14901l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dux0)) {
            int iM14772a = 0;
            while (i < size) {
                iM14772a += AbstractC2395a0.m14772a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM14772a;
        }
        dux0 dux0Var = (dux0) list;
        int iM14772a2 = 0;
        while (i < size) {
            iM14772a2 += AbstractC2395a0.m14772a(dux0Var.m118227c(i));
            i++;
        }
        return iM14772a2;
    }

    /* JADX INFO: renamed from: m */
    public static int m14902m(int i, Object obj, uxx0 uxx0Var) {
        int i2 = i << 3;
        if (!(obj instanceof C2405e0)) {
            return AbstractC2395a0.m14771B(i2) + AbstractC2395a0.m14775z((yvx0) obj, uxx0Var);
        }
        int iM14771B = AbstractC2395a0.m14771B(i2);
        int iM14839a = ((C2405e0) obj).m14839a();
        return iM14771B + AbstractC2395a0.m14771B(iM14839a) + iM14839a;
    }

    /* JADX INFO: renamed from: n */
    public static int m14903n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof crx0)) {
            int iM14771B = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM14771B += AbstractC2395a0.m14771B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM14771B;
        }
        crx0 crx0Var = (crx0) list;
        int iM14771B2 = 0;
        while (i < size) {
            int iM112093c = crx0Var.m112093c(i);
            iM14771B2 += AbstractC2395a0.m14771B((iM112093c >> 31) ^ (iM112093c + iM112093c));
            i++;
        }
        return iM14771B2;
    }

    /* JADX INFO: renamed from: o */
    public static int m14904o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dux0)) {
            int iM14772a = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM14772a += AbstractC2395a0.m14772a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM14772a;
        }
        dux0 dux0Var = (dux0) list;
        int iM14772a2 = 0;
        while (i < size) {
            long jM118227c = dux0Var.m118227c(i);
            iM14772a2 += AbstractC2395a0.m14772a((jM118227c >> 63) ^ (jM118227c + jM118227c));
            i++;
        }
        return iM14772a2;
    }

    /* JADX INFO: renamed from: p */
    public static int m14905p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof crx0)) {
            int iM14771B = 0;
            while (i < size) {
                iM14771B += AbstractC2395a0.m14771B(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM14771B;
        }
        crx0 crx0Var = (crx0) list;
        int iM14771B2 = 0;
        while (i < size) {
            iM14771B2 += AbstractC2395a0.m14771B(crx0Var.m112093c(i));
            i++;
        }
        return iM14771B2;
    }

    /* JADX INFO: renamed from: q */
    public static int m14906q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dux0)) {
            int iM14772a = 0;
            while (i < size) {
                iM14772a += AbstractC2395a0.m14772a(((Long) list.get(i)).longValue());
                i++;
            }
            return iM14772a;
        }
        dux0 dux0Var = (dux0) list;
        int iM14772a2 = 0;
        while (i < size) {
            iM14772a2 += AbstractC2395a0.m14772a(dux0Var.m118227c(i));
            i++;
        }
        return iM14772a2;
    }

    /* JADX INFO: renamed from: r */
    public static k0y0 m14907r() {
        return f10388a;
    }

    /* JADX INFO: renamed from: s */
    public static Object m14908s(Object obj, int i, int i2, Object obj2, k0y0 k0y0Var) {
        AbstractC2403d0 abstractC2403d0;
        o0y0 o0y0Var;
        Object obj3 = obj2;
        if (obj2 == null && (o0y0Var = (abstractC2403d0 = (AbstractC2403d0) obj).zzc) == o0y0.m165555c()) {
            obj3 = o0y0Var;
            o0y0 o0y0VarM165557f = o0y0.m165557f();
            abstractC2403d0.zzc = o0y0VarM165557f;
            obj3 = o0y0VarM165557f;
        }
        obj3 = o0y0Var;
        ((o0y0) obj3).m165564j(i << 3, Long.valueOf(i2));
        return obj3;
    }

    /* JADX INFO: renamed from: t */
    public static void m14909t(efx0 efx0Var, Object obj, Object obj2) {
        if (((AbstractC2401c0) obj2).zzb.f200355a.isEmpty()) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static void m14910u(k0y0 k0y0Var, Object obj, Object obj2) {
        AbstractC2403d0 abstractC2403d0 = (AbstractC2403d0) obj;
        o0y0 o0y0VarM165556e = abstractC2403d0.zzc;
        o0y0 o0y0Var = ((AbstractC2403d0) obj2).zzc;
        if (!o0y0.m165555c().equals(o0y0Var)) {
            if (o0y0.m165555c().equals(o0y0VarM165556e)) {
                o0y0VarM165556e = o0y0.m165556e(o0y0VarM165556e, o0y0Var);
            } else {
                o0y0VarM165556e.m165560d(o0y0Var);
            }
        }
        abstractC2403d0.zzc = o0y0VarM165556e;
    }

    /* JADX INFO: renamed from: v */
    public static void m14911v(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165808a(i, list, z);
    }

    /* JADX INFO: renamed from: w */
    public static void m14912w(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165811g(i, list, z);
    }

    /* JADX INFO: renamed from: x */
    public static void m14913x(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165810f(i, list, z);
    }

    /* JADX INFO: renamed from: y */
    public static void m14914y(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165809c(i, list, z);
    }

    /* JADX INFO: renamed from: z */
    public static void m14915z(int i, List list, o2y0 o2y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o2y0Var.mo165813i(i, list, z);
    }
}
