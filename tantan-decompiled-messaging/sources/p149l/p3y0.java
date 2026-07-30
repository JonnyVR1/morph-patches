package p149l;

import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2357y0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class p3y0 {

    /* JADX INFO: renamed from: a */
    public static final b6y0<?, ?> f147025a = new C2357y0();

    /* JADX INFO: renamed from: A */
    public static int m167281A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14641T(i, 0L);
    }

    /* JADX INFO: renamed from: B */
    public static int m167282B(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: renamed from: C */
    public static void m167283C(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153528D(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static int m167284D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167285E(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: E */
    public static int m167285E(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gtx0)) {
            int iM14664k0 = 0;
            while (i < size) {
                iM14664k0 += zzjc.m14664k0(list.get(i).intValue());
                i++;
            }
            return iM14664k0;
        }
        gtx0 gtx0Var = (gtx0) list;
        int iM14664k1 = 0;
        while (i < size) {
            iM14664k1 += zzjc.m14664k0(gtx0Var.m128007c(i));
            i++;
        }
        return iM14664k1;
    }

    /* JADX INFO: renamed from: F */
    public static void m167286F(int i, List<Long> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153527C(i, list, z);
    }

    /* JADX INFO: renamed from: G */
    public static int m167287G(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m167288H(list) + (list.size() * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: H */
    public static int m167288H(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zwx0)) {
            int iM14653e0 = 0;
            while (i < size) {
                iM14653e0 += zzjc.m14653e0(list.get(i).longValue());
                i++;
            }
            return iM14653e0;
        }
        zwx0 zwx0Var = (zwx0) list;
        int iM14653e1 = 0;
        while (i < size) {
            iM14653e1 += zzjc.m14653e0(zwx0Var.mo200056e(i));
            i++;
        }
        return iM14653e1;
    }

    /* JADX INFO: renamed from: I */
    public static void m167289I(int i, List<Float> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153529E(i, list, z);
    }

    /* JADX INFO: renamed from: J */
    public static int m167290J(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167291K(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: K */
    public static int m167291K(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gtx0)) {
            int iM14672s0 = 0;
            while (i < size) {
                iM14672s0 += zzjc.m14672s0(list.get(i).intValue());
                i++;
            }
            return iM14672s0;
        }
        gtx0 gtx0Var = (gtx0) list;
        int iM14672s1 = 0;
        while (i < size) {
            iM14672s1 += zzjc.m14672s0(gtx0Var.m128007c(i));
            i++;
        }
        return iM14672s1;
    }

    /* JADX INFO: renamed from: L */
    public static void m167292L(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153544g(i, list, z);
    }

    /* JADX INFO: renamed from: M */
    public static int m167293M(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167294N(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: N */
    public static int m167294N(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zwx0)) {
            int iM14667n0 = 0;
            while (i < size) {
                iM14667n0 += zzjc.m14667n0(list.get(i).longValue());
                i++;
            }
            return iM14667n0;
        }
        zwx0 zwx0Var = (zwx0) list;
        int iM14667n1 = 0;
        while (i < size) {
            iM14667n1 += zzjc.m14667n0(zwx0Var.mo200056e(i));
            i++;
        }
        return iM14667n1;
    }

    /* JADX INFO: renamed from: O */
    public static void m167295O(int i, List<Long> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153525A(i, list, z);
    }

    /* JADX INFO: renamed from: P */
    public static int m167296P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167297Q(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: Q */
    public static int m167297Q(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gtx0)) {
            int iM14678z0 = 0;
            while (i < size) {
                iM14678z0 += zzjc.m14678z0(list.get(i).intValue());
                i++;
            }
            return iM14678z0;
        }
        gtx0 gtx0Var = (gtx0) list;
        int iM14678z1 = 0;
        while (i < size) {
            iM14678z1 += zzjc.m14678z0(gtx0Var.m128007c(i));
            i++;
        }
        return iM14678z1;
    }

    /* JADX INFO: renamed from: R */
    public static void m167298R(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153562y(i, list, z);
    }

    /* JADX INFO: renamed from: S */
    public static int m167299S(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167300T(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: T */
    public static int m167300T(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zwx0)) {
            int iM14671r0 = 0;
            while (i < size) {
                iM14671r0 += zzjc.m14671r0(list.get(i).longValue());
                i++;
            }
            return iM14671r0;
        }
        zwx0 zwx0Var = (zwx0) list;
        int iM14671r1 = 0;
        while (i < size) {
            iM14671r1 += zzjc.m14671r0(zwx0Var.mo200056e(i));
            i++;
        }
        return iM14671r1;
    }

    /* JADX INFO: renamed from: U */
    public static void m167301U(int i, List<Long> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153543f(i, list, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m167302V(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153526B(i, list, z);
    }

    /* JADX INFO: renamed from: W */
    public static void m167303W(int i, List<Long> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153540c(i, list, z);
    }

    /* JADX INFO: renamed from: X */
    public static void m167304X(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153532H(i, list, z);
    }

    /* JADX INFO: renamed from: Y */
    public static void m167305Y(int i, List<Long> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153546i(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static int m167306a(int i, Object obj, i3y0<?> i3y0Var) {
        return obj instanceof mwx0 ? zzjc.m14631A(i, (mwx0) obj) : zzjc.m14643V(i, (g0y0) obj, i3y0Var);
    }

    /* JADX INFO: renamed from: b */
    public static int m167307b(int i, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14674w0 = size * zzjc.m14674w0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM14674w0 += zzjc.m14637E(list.get(i2));
        }
        return iM14674w0;
    }

    /* JADX INFO: renamed from: c */
    public static int m167308c(int i, List<g0y0> list, i3y0<?> i3y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14634C = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM14634C += zzjc.m14634C(i, list.get(i2), i3y0Var);
        }
        return iM14634C;
    }

    /* JADX INFO: renamed from: d */
    public static int m167309d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14635D(i, true);
    }

    /* JADX INFO: renamed from: e */
    public static int m167310e(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public static <UT, UB> UB m167311f(Object obj, int i, int i2, UB ub, b6y0<UT, UB> b6y0Var) {
        if (ub == null) {
            ub = b6y0Var.mo14538o(obj);
        }
        b6y0Var.mo14535l(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: g */
    public static <UT, UB> UB m167312g(Object obj, int i, List<Integer> list, ltx0 ltx0Var, UB ub, b6y0<UT, UB> b6y0Var) {
        if (ltx0Var == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!ltx0Var.zza(iIntValue)) {
                    ub = (UB) m167311f(obj, i, iIntValue, ub, b6y0Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (ltx0Var.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m167311f(obj, i, iIntValue2, ub, b6y0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: h */
    public static b6y0<?, ?> m167313h() {
        return f147025a;
    }

    /* JADX INFO: renamed from: i */
    public static void m167314i(int i, List<zzik> list, m8y0 m8y0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153534J(i, list);
    }

    /* JADX INFO: renamed from: j */
    public static void m167315j(int i, List<?> list, m8y0 m8y0Var, i3y0<?> i3y0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153535K(i, list, i3y0Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m167316k(int i, List<Boolean> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153549l(i, list, z);
    }

    /* JADX INFO: renamed from: l */
    public static void m167317l(Class<?> cls) {
        AbstractC2349u0.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: m */
    public static <T, FT extends yrx0<FT>> void m167318m(yqx0<FT> yqx0Var, T t, T t2) {
        prx0<T> prx0VarMo14334d = yqx0Var.mo14334d(t2);
        if (prx0VarMo14334d.f150958a.isEmpty()) {
            return;
        }
        yqx0Var.mo14339i(t).m171085h(prx0VarMo14334d);
    }

    /* JADX INFO: renamed from: n */
    public static <T> void m167319n(kyx0 kyx0Var, T t, T t2, long j) {
        e6y0.m115137j(t, j, kyx0Var.mo147909c(e6y0.m115123B(t, j), e6y0.m115123B(t2, j)));
    }

    /* JADX INFO: renamed from: o */
    public static <T, UT, UB> void m167320o(b6y0<UT, UB> b6y0Var, T t, T t2) {
        b6y0Var.mo14539p(t, b6y0Var.mo14527c(b6y0Var.mo14540q(t), b6y0Var.mo14540q(t2)));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m167321p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static int m167322q(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM14674w0 = zzjc.m14674w0(i) * size;
        if (!(list instanceof hwx0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM14674w0 += obj instanceof zzik ? zzjc.m14637E((zzik) obj) : zzjc.m14638F((String) obj);
                i2++;
            }
            return iM14674w0;
        }
        hwx0 hwx0Var = (hwx0) list;
        while (i2 < size) {
            Object objZza = hwx0Var.zza(i2);
            iM14674w0 += objZza instanceof zzik ? zzjc.m14637E((zzik) objZza) : zzjc.m14638F((String) objZza);
            i2++;
        }
        return iM14674w0;
    }

    /* JADX INFO: renamed from: r */
    public static int m167323r(int i, List<?> list, i3y0<?> i3y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14674w0 = zzjc.m14674w0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM14674w0 += obj instanceof mwx0 ? zzjc.m14657h((mwx0) obj) : zzjc.m14659i((g0y0) obj, i3y0Var);
        }
        return iM14674w0;
    }

    /* JADX INFO: renamed from: s */
    public static int m167324s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m167325t(list) + (size * zzjc.m14674w0(i));
    }

    /* JADX INFO: renamed from: t */
    public static int m167325t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gtx0)) {
            int iM14647b0 = 0;
            while (i < size) {
                iM14647b0 += zzjc.m14647b0(list.get(i).intValue());
                i++;
            }
            return iM14647b0;
        }
        gtx0 gtx0Var = (gtx0) list;
        int iM14647b1 = 0;
        while (i < size) {
            iM14647b1 += zzjc.m14647b0(gtx0Var.m128007c(i));
            i++;
        }
        return iM14647b1;
    }

    /* JADX INFO: renamed from: u */
    public static void m167326u(int i, List<String> list, m8y0 m8y0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153533I(i, list);
    }

    /* JADX INFO: renamed from: v */
    public static void m167327v(int i, List<?> list, m8y0 m8y0Var, i3y0<?> i3y0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153536L(i, list, i3y0Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m167328w(int i, List<Double> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153553p(i, list, z);
    }

    /* JADX INFO: renamed from: x */
    public static int m167329x(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14665l0(i, 0);
    }

    /* JADX INFO: renamed from: y */
    public static int m167330y(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: renamed from: z */
    public static void m167331z(int i, List<Integer> list, m8y0 m8y0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m8y0Var.mo153538a(i, list, z);
    }
}
