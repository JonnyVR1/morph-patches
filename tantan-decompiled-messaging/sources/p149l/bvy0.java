package p149l;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bvy0 extends m3u0 {

    /* JADX INFO: renamed from: A0 */
    public static final bvy0 f77505A0;

    /* JADX INFO: renamed from: B0 */
    @Deprecated
    public static final bvy0 f77506B0;

    /* JADX INFO: renamed from: C0 */
    public static final String f77507C0;

    /* JADX INFO: renamed from: D0 */
    public static final String f77508D0;

    /* JADX INFO: renamed from: E0 */
    public static final String f77509E0;

    /* JADX INFO: renamed from: F0 */
    public static final String f77510F0;

    /* JADX INFO: renamed from: G0 */
    public static final String f77511G0;

    /* JADX INFO: renamed from: H0 */
    public static final String f77512H0;

    /* JADX INFO: renamed from: I0 */
    public static final String f77513I0;

    /* JADX INFO: renamed from: J0 */
    public static final String f77514J0;

    /* JADX INFO: renamed from: K0 */
    public static final String f77515K0;

    /* JADX INFO: renamed from: L0 */
    public static final String f77516L0;

    /* JADX INFO: renamed from: M0 */
    public static final String f77517M0;

    /* JADX INFO: renamed from: N0 */
    public static final String f77518N0;

    /* JADX INFO: renamed from: O0 */
    public static final String f77519O0;

    /* JADX INFO: renamed from: P0 */
    public static final String f77520P0;

    /* JADX INFO: renamed from: Q0 */
    public static final String f77521Q0;

    /* JADX INFO: renamed from: R0 */
    public static final String f77522R0;

    /* JADX INFO: renamed from: S0 */
    public static final String f77523S0;

    /* JADX INFO: renamed from: T0 */
    public static final String f77524T0;

    /* JADX INFO: renamed from: U0 */
    public static final String f77525U0;

    /* JADX INFO: renamed from: V0 */
    @Deprecated
    public static final g8y0 f77526V0;

    /* JADX INFO: renamed from: k0 */
    public final boolean f77527k0;

    /* JADX INFO: renamed from: l0 */
    public final boolean f77528l0;

    /* JADX INFO: renamed from: m0 */
    public final boolean f77529m0;

    /* JADX INFO: renamed from: n0 */
    public final boolean f77530n0;

    /* JADX INFO: renamed from: o0 */
    public final boolean f77531o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f77532p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f77533q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f77534r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f77535s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f77536t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f77537u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f77538v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f77539w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f77540x0;

    /* JADX INFO: renamed from: y0 */
    public final SparseArray f77541y0;

    /* JADX INFO: renamed from: z0 */
    public final SparseBooleanArray f77542z0;

    static {
        bvy0 bvy0Var = new bvy0(new zuy0());
        f77505A0 = bvy0Var;
        f77506B0 = bvy0Var;
        f77507C0 = Integer.toString(1000, 36);
        f77508D0 = Integer.toString(1001, 36);
        f77509E0 = Integer.toString(1002, 36);
        f77510F0 = Integer.toString(1003, 36);
        f77511G0 = Integer.toString(1004, 36);
        f77512H0 = Integer.toString(1005, 36);
        f77513I0 = Integer.toString(1006, 36);
        f77514J0 = Integer.toString(1007, 36);
        f77515K0 = Integer.toString(1008, 36);
        f77516L0 = Integer.toString(1009, 36);
        f77517M0 = Integer.toString(1010, 36);
        f77518N0 = Integer.toString(1011, 36);
        f77519O0 = Integer.toString(1012, 36);
        f77520P0 = Integer.toString(1013, 36);
        f77521Q0 = Integer.toString(1014, 36);
        f77522R0 = Integer.toString(1015, 36);
        f77523S0 = Integer.toString(1016, 36);
        f77524T0 = Integer.toString(1017, 36);
        f77525U0 = Integer.toString(1018, 36);
        f77526V0 = new g8y0() { // from class: l.xuy0
        };
    }

    public bvy0(zuy0 zuy0Var) {
        super(zuy0Var);
        this.f77527k0 = zuy0Var.f204916r;
        this.f77528l0 = false;
        this.f77529m0 = zuy0Var.f204917s;
        this.f77530n0 = false;
        this.f77531o0 = zuy0Var.f204918t;
        this.f77532p0 = false;
        this.f77533q0 = false;
        this.f77534r0 = false;
        this.f77535s0 = false;
        this.f77536t0 = zuy0Var.f204919u;
        this.f77537u0 = zuy0Var.f204920v;
        this.f77538v0 = zuy0Var.f204921w;
        this.f77539w0 = false;
        this.f77540x0 = zuy0Var.f204922x;
        this.f77541y0 = zuy0Var.f204923y;
        this.f77542z0 = zuy0Var.f204924z;
    }

    /* JADX INFO: renamed from: d */
    public static bvy0 m104097d(Context context) {
        return new bvy0(new zuy0(context));
    }

    /* JADX INFO: renamed from: c */
    public final zuy0 m104098c() {
        return new zuy0(this, null);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final dvy0 m104099e(int i, kty0 kty0Var) {
        Map map = (Map) this.f77541y0.get(i);
        if (map != null) {
            return (dvy0) map.get(kty0Var);
        }
        return null;
    }

    @Override // p149l.m3u0
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bvy0.class == obj.getClass()) {
            bvy0 bvy0Var = (bvy0) obj;
            if (super.equals(bvy0Var) && this.f77527k0 == bvy0Var.f77527k0 && this.f77529m0 == bvy0Var.f77529m0 && this.f77531o0 == bvy0Var.f77531o0 && this.f77536t0 == bvy0Var.f77536t0 && this.f77537u0 == bvy0Var.f77537u0 && this.f77538v0 == bvy0Var.f77538v0 && this.f77540x0 == bvy0Var.f77540x0) {
                SparseBooleanArray sparseBooleanArray = this.f77542z0;
                SparseBooleanArray sparseBooleanArray2 = bvy0Var.f77542z0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.f77541y0;
                    SparseArray sparseArray2 = bvy0Var.f77541y0;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        kty0 kty0Var = (kty0) entry.getKey();
                                        if (!map2.containsKey(kty0Var) || !ggw0.m126064f(entry.getValue(), map2.get(kty0Var))) {
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
    public final boolean m104100f(int i) {
        return this.f77542z0.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final boolean m104101g(int i, kty0 kty0Var) {
        Map map = (Map) this.f77541y0.get(i);
        return map != null && map.containsKey(kty0Var);
    }

    @Override // p149l.m3u0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f77527k0 ? 1 : 0)) * 961) + (this.f77529m0 ? 1 : 0)) * 961) + (this.f77531o0 ? 1 : 0)) * 28629151) + (this.f77536t0 ? 1 : 0)) * 31) + (this.f77537u0 ? 1 : 0)) * 31) + (this.f77538v0 ? 1 : 0)) * 961) + (this.f77540x0 ? 1 : 0)) * 31;
    }
}
