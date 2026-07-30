package p153l;

import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2380y0;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class vcy0 {

    /* JADX INFO: renamed from: a */
    public static final hfy0<?, ?> f183499a = new C2380y0();

    /* JADX INFO: renamed from: A */
    public static int m200841A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14695T(i, 0L);
    }

    /* JADX INFO: renamed from: B */
    public static int m200842B(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: renamed from: C */
    public static void m200843C(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185957D(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static int m200844D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200845E(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: E */
    public static int m200845E(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m2y0)) {
            int iM14718k0 = 0;
            while (i < size) {
                iM14718k0 += zzjc.m14718k0(list.get(i).intValue());
                i++;
            }
            return iM14718k0;
        }
        m2y0 m2y0Var = (m2y0) list;
        int iM14718k1 = 0;
        while (i < size) {
            iM14718k1 += zzjc.m14718k0(m2y0Var.m156911c(i));
            i++;
        }
        return iM14718k1;
    }

    /* JADX INFO: renamed from: F */
    public static void m200846F(int i, List<Long> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185956C(i, list, z);
    }

    /* JADX INFO: renamed from: G */
    public static int m200847G(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m200848H(list) + (list.size() * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: H */
    public static int m200848H(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f6y0)) {
            int iM14707e0 = 0;
            while (i < size) {
                iM14707e0 += zzjc.m14707e0(list.get(i).longValue());
                i++;
            }
            return iM14707e0;
        }
        f6y0 f6y0Var = (f6y0) list;
        int iM14707e1 = 0;
        while (i < size) {
            iM14707e1 += zzjc.m14707e0(f6y0Var.mo102379e(i));
            i++;
        }
        return iM14707e1;
    }

    /* JADX INFO: renamed from: I */
    public static void m200849I(int i, List<Float> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185958E(i, list, z);
    }

    /* JADX INFO: renamed from: J */
    public static int m200850J(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200851K(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: K */
    public static int m200851K(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m2y0)) {
            int iM14726s0 = 0;
            while (i < size) {
                iM14726s0 += zzjc.m14726s0(list.get(i).intValue());
                i++;
            }
            return iM14726s0;
        }
        m2y0 m2y0Var = (m2y0) list;
        int iM14726s1 = 0;
        while (i < size) {
            iM14726s1 += zzjc.m14726s0(m2y0Var.m156911c(i));
            i++;
        }
        return iM14726s1;
    }

    /* JADX INFO: renamed from: L */
    public static void m200852L(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185973g(i, list, z);
    }

    /* JADX INFO: renamed from: M */
    public static int m200853M(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200854N(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: N */
    public static int m200854N(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f6y0)) {
            int iM14721n0 = 0;
            while (i < size) {
                iM14721n0 += zzjc.m14721n0(list.get(i).longValue());
                i++;
            }
            return iM14721n0;
        }
        f6y0 f6y0Var = (f6y0) list;
        int iM14721n1 = 0;
        while (i < size) {
            iM14721n1 += zzjc.m14721n0(f6y0Var.mo102379e(i));
            i++;
        }
        return iM14721n1;
    }

    /* JADX INFO: renamed from: O */
    public static void m200855O(int i, List<Long> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185954A(i, list, z);
    }

    /* JADX INFO: renamed from: P */
    public static int m200856P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200857Q(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: Q */
    public static int m200857Q(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m2y0)) {
            int iM14732z0 = 0;
            while (i < size) {
                iM14732z0 += zzjc.m14732z0(list.get(i).intValue());
                i++;
            }
            return iM14732z0;
        }
        m2y0 m2y0Var = (m2y0) list;
        int iM14732z1 = 0;
        while (i < size) {
            iM14732z1 += zzjc.m14732z0(m2y0Var.m156911c(i));
            i++;
        }
        return iM14732z1;
    }

    /* JADX INFO: renamed from: R */
    public static void m200858R(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185991y(i, list, z);
    }

    /* JADX INFO: renamed from: S */
    public static int m200859S(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200860T(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: T */
    public static int m200860T(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f6y0)) {
            int iM14725r0 = 0;
            while (i < size) {
                iM14725r0 += zzjc.m14725r0(list.get(i).longValue());
                i++;
            }
            return iM14725r0;
        }
        f6y0 f6y0Var = (f6y0) list;
        int iM14725r1 = 0;
        while (i < size) {
            iM14725r1 += zzjc.m14725r0(f6y0Var.mo102379e(i));
            i++;
        }
        return iM14725r1;
    }

    /* JADX INFO: renamed from: U */
    public static void m200861U(int i, List<Long> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185972f(i, list, z);
    }

    /* JADX INFO: renamed from: V */
    public static void m200862V(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185955B(i, list, z);
    }

    /* JADX INFO: renamed from: W */
    public static void m200863W(int i, List<Long> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185969c(i, list, z);
    }

    /* JADX INFO: renamed from: X */
    public static void m200864X(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185961H(i, list, z);
    }

    /* JADX INFO: renamed from: Y */
    public static void m200865Y(int i, List<Long> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185975i(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static int m200866a(int i, Object obj, ocy0<?> ocy0Var) {
        return obj instanceof s5y0 ? zzjc.m14685A(i, (s5y0) obj) : zzjc.m14697V(i, (m9y0) obj, ocy0Var);
    }

    /* JADX INFO: renamed from: b */
    public static int m200867b(int i, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14728w0 = size * zzjc.m14728w0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM14728w0 += zzjc.m14691E(list.get(i2));
        }
        return iM14728w0;
    }

    /* JADX INFO: renamed from: c */
    public static int m200868c(int i, List<m9y0> list, ocy0<?> ocy0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14688C = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM14688C += zzjc.m14688C(i, list.get(i2), ocy0Var);
        }
        return iM14688C;
    }

    /* JADX INFO: renamed from: d */
    public static int m200869d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14689D(i, true);
    }

    /* JADX INFO: renamed from: e */
    public static int m200870e(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public static <UT, UB> UB m200871f(Object obj, int i, int i2, UB ub, hfy0<UT, UB> hfy0Var) {
        if (ub == null) {
            ub = hfy0Var.mo14592o(obj);
        }
        hfy0Var.mo14589l(ub, i, i2);
        return ub;
    }

    /* JADX INFO: renamed from: g */
    public static <UT, UB> UB m200872g(Object obj, int i, List<Integer> list, r2y0 r2y0Var, UB ub, hfy0<UT, UB> hfy0Var) {
        if (r2y0Var == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!r2y0Var.zza(iIntValue)) {
                    ub = (UB) m200871f(obj, i, iIntValue, ub, hfy0Var);
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
            if (r2y0Var.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m200871f(obj, i, iIntValue2, ub, hfy0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: h */
    public static hfy0<?, ?> m200873h() {
        return f183499a;
    }

    /* JADX INFO: renamed from: i */
    public static void m200874i(int i, List<zzik> list, shy0 shy0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185963J(i, list);
    }

    /* JADX INFO: renamed from: j */
    public static void m200875j(int i, List<?> list, shy0 shy0Var, ocy0<?> ocy0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185964K(i, list, ocy0Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m200876k(int i, List<Boolean> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185978l(i, list, z);
    }

    /* JADX INFO: renamed from: l */
    public static void m200877l(Class<?> cls) {
        AbstractC2372u0.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: m */
    public static <T, FT extends e1y0<FT>> void m200878m(e0y0<FT> e0y0Var, T t, T t2) {
        v0y0<T> v0y0VarMo14388d = e0y0Var.mo14388d(t2);
        if (v0y0VarMo14388d.f181911a.isEmpty()) {
            return;
        }
        e0y0Var.mo14393i(t).m198955h(v0y0VarMo14388d);
    }

    /* JADX INFO: renamed from: n */
    public static <T> void m200879n(q7y0 q7y0Var, T t, T t2, long j) {
        kfy0.m149647j(t, j, q7y0Var.mo114985c(kfy0.m149633B(t, j), kfy0.m149633B(t2, j)));
    }

    /* JADX INFO: renamed from: o */
    public static <T, UT, UB> void m200880o(hfy0<UT, UB> hfy0Var, T t, T t2) {
        hfy0Var.mo14593p(t, hfy0Var.mo14581c(hfy0Var.mo14594q(t), hfy0Var.mo14594q(t2)));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m200881p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static int m200882q(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM14728w0 = zzjc.m14728w0(i) * size;
        if (!(list instanceof n5y0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM14728w0 += obj instanceof zzik ? zzjc.m14691E((zzik) obj) : zzjc.m14692F((String) obj);
                i2++;
            }
            return iM14728w0;
        }
        n5y0 n5y0Var = (n5y0) list;
        while (i2 < size) {
            Object objZza = n5y0Var.zza(i2);
            iM14728w0 += objZza instanceof zzik ? zzjc.m14691E((zzik) objZza) : zzjc.m14692F((String) objZza);
            i2++;
        }
        return iM14728w0;
    }

    /* JADX INFO: renamed from: r */
    public static int m200883r(int i, List<?> list, ocy0<?> ocy0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM14728w0 = zzjc.m14728w0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iM14728w0 += obj instanceof s5y0 ? zzjc.m14711h((s5y0) obj) : zzjc.m14713i((m9y0) obj, ocy0Var);
        }
        return iM14728w0;
    }

    /* JADX INFO: renamed from: s */
    public static int m200884s(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m200885t(list) + (size * zzjc.m14728w0(i));
    }

    /* JADX INFO: renamed from: t */
    public static int m200885t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m2y0)) {
            int iM14701b0 = 0;
            while (i < size) {
                iM14701b0 += zzjc.m14701b0(list.get(i).intValue());
                i++;
            }
            return iM14701b0;
        }
        m2y0 m2y0Var = (m2y0) list;
        int iM14701b1 = 0;
        while (i < size) {
            iM14701b1 += zzjc.m14701b0(m2y0Var.m156911c(i));
            i++;
        }
        return iM14701b1;
    }

    /* JADX INFO: renamed from: u */
    public static void m200886u(int i, List<String> list, shy0 shy0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185962I(i, list);
    }

    /* JADX INFO: renamed from: v */
    public static void m200887v(int i, List<?> list, shy0 shy0Var, ocy0<?> ocy0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185965L(i, list, ocy0Var);
    }

    /* JADX INFO: renamed from: w */
    public static void m200888w(int i, List<Double> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185982p(i, list, z);
    }

    /* JADX INFO: renamed from: x */
    public static int m200889x(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.m14719l0(i, 0);
    }

    /* JADX INFO: renamed from: y */
    public static int m200890y(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: renamed from: z */
    public static void m200891z(int i, List<Integer> list, shy0 shy0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        shy0Var.mo185967a(i, list, z);
    }
}
