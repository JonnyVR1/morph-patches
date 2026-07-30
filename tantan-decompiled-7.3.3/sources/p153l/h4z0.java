package p153l;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class h4z0 extends scu0 {

    /* JADX INFO: renamed from: A0 */
    public static final h4z0 f107840A0;

    /* JADX INFO: renamed from: B0 */
    @Deprecated
    public static final h4z0 f107841B0;

    /* JADX INFO: renamed from: C0 */
    public static final String f107842C0;

    /* JADX INFO: renamed from: D0 */
    public static final String f107843D0;

    /* JADX INFO: renamed from: E0 */
    public static final String f107844E0;

    /* JADX INFO: renamed from: F0 */
    public static final String f107845F0;

    /* JADX INFO: renamed from: G0 */
    public static final String f107846G0;

    /* JADX INFO: renamed from: H0 */
    public static final String f107847H0;

    /* JADX INFO: renamed from: I0 */
    public static final String f107848I0;

    /* JADX INFO: renamed from: J0 */
    public static final String f107849J0;

    /* JADX INFO: renamed from: K0 */
    public static final String f107850K0;

    /* JADX INFO: renamed from: L0 */
    public static final String f107851L0;

    /* JADX INFO: renamed from: M0 */
    public static final String f107852M0;

    /* JADX INFO: renamed from: N0 */
    public static final String f107853N0;

    /* JADX INFO: renamed from: O0 */
    public static final String f107854O0;

    /* JADX INFO: renamed from: P0 */
    public static final String f107855P0;

    /* JADX INFO: renamed from: Q0 */
    public static final String f107856Q0;

    /* JADX INFO: renamed from: R0 */
    public static final String f107857R0;

    /* JADX INFO: renamed from: S0 */
    public static final String f107858S0;

    /* JADX INFO: renamed from: T0 */
    public static final String f107859T0;

    /* JADX INFO: renamed from: U0 */
    public static final String f107860U0;

    /* JADX INFO: renamed from: V0 */
    @Deprecated
    public static final mhy0 f107861V0;

    /* JADX INFO: renamed from: k0 */
    public final boolean f107862k0;

    /* JADX INFO: renamed from: l0 */
    public final boolean f107863l0;

    /* JADX INFO: renamed from: m0 */
    public final boolean f107864m0;

    /* JADX INFO: renamed from: n0 */
    public final boolean f107865n0;

    /* JADX INFO: renamed from: o0 */
    public final boolean f107866o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f107867p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f107868q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f107869r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f107870s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f107871t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f107872u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f107873v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f107874w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f107875x0;

    /* JADX INFO: renamed from: y0 */
    public final SparseArray f107876y0;

    /* JADX INFO: renamed from: z0 */
    public final SparseBooleanArray f107877z0;

    static {
        h4z0 h4z0Var = new h4z0(new f4z0());
        f107840A0 = h4z0Var;
        f107841B0 = h4z0Var;
        f107842C0 = Integer.toString(1000, 36);
        f107843D0 = Integer.toString(1001, 36);
        f107844E0 = Integer.toString(1002, 36);
        f107845F0 = Integer.toString(1003, 36);
        f107846G0 = Integer.toString(1004, 36);
        f107847H0 = Integer.toString(1005, 36);
        f107848I0 = Integer.toString(1006, 36);
        f107849J0 = Integer.toString(1007, 36);
        f107850K0 = Integer.toString(1008, 36);
        f107851L0 = Integer.toString(1009, 36);
        f107852M0 = Integer.toString(1010, 36);
        f107853N0 = Integer.toString(1011, 36);
        f107854O0 = Integer.toString(1012, 36);
        f107855P0 = Integer.toString(1013, 36);
        f107856Q0 = Integer.toString(1014, 36);
        f107857R0 = Integer.toString(1015, 36);
        f107858S0 = Integer.toString(1016, 36);
        f107859T0 = Integer.toString(1017, 36);
        f107860U0 = Integer.toString(1018, 36);
        f107861V0 = new mhy0() { // from class: l.d4z0
        };
    }

    public h4z0(f4z0 f4z0Var) {
        super(f4z0Var);
        this.f107862k0 = f4z0Var.f97167r;
        this.f107863l0 = false;
        this.f107864m0 = f4z0Var.f97168s;
        this.f107865n0 = false;
        this.f107866o0 = f4z0Var.f97169t;
        this.f107867p0 = false;
        this.f107868q0 = false;
        this.f107869r0 = false;
        this.f107870s0 = false;
        this.f107871t0 = f4z0Var.f97170u;
        this.f107872u0 = f4z0Var.f97171v;
        this.f107873v0 = f4z0Var.f97172w;
        this.f107874w0 = false;
        this.f107875x0 = f4z0Var.f97173x;
        this.f107876y0 = f4z0Var.f97174y;
        this.f107877z0 = f4z0Var.f97175z;
    }

    /* JADX INFO: renamed from: d */
    public static h4z0 m133600d(Context context) {
        return new h4z0(new f4z0(context));
    }

    /* JADX INFO: renamed from: c */
    public final f4z0 m133601c() {
        return new f4z0(this, null);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final j4z0 m133602e(int i, q2z0 q2z0Var) {
        Map map = (Map) this.f107876y0.get(i);
        if (map != null) {
            return (j4z0) map.get(q2z0Var);
        }
        return null;
    }

    @Override // p153l.scu0
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h4z0.class == obj.getClass()) {
            h4z0 h4z0Var = (h4z0) obj;
            if (super.equals(h4z0Var) && this.f107862k0 == h4z0Var.f107862k0 && this.f107864m0 == h4z0Var.f107864m0 && this.f107866o0 == h4z0Var.f107866o0 && this.f107871t0 == h4z0Var.f107871t0 && this.f107872u0 == h4z0Var.f107872u0 && this.f107873v0 == h4z0Var.f107873v0 && this.f107875x0 == h4z0Var.f107875x0) {
                SparseBooleanArray sparseBooleanArray = this.f107877z0;
                SparseBooleanArray sparseBooleanArray2 = h4z0Var.f107877z0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.f107876y0;
                    SparseArray sparseArray2 = h4z0Var.f107876y0;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        q2z0 q2z0Var = (q2z0) entry.getKey();
                                        if (!map2.containsKey(q2z0Var) || !mpw0.m159408f(entry.getValue(), map2.get(q2z0Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m133603f(int i) {
        return this.f107877z0.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final boolean m133604g(int i, q2z0 q2z0Var) {
        Map map = (Map) this.f107876y0.get(i);
        return map != null && map.containsKey(q2z0Var);
    }

    @Override // p153l.scu0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f107862k0 ? 1 : 0)) * 961) + (this.f107864m0 ? 1 : 0)) * 961) + (this.f107866o0 ? 1 : 0)) * 28629151) + (this.f107871t0 ? 1 : 0)) * 31) + (this.f107872u0 ? 1 : 0)) * 31) + (this.f107873v0 ? 1 : 0)) * 961) + (this.f107875x0 ? 1 : 0)) * 31;
    }
}
