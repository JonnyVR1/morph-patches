package p002l;

import android.text.TextUtils;
import android.view.View;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.gul;
import l.j760;
import l.k4t;
import l.s7m;
import l.vwb;
import l.xaj0;
import l.ztr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lk2<T extends s7m> extends x6s<ho2, T> {
    public lk2(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ int m17279S3(xaj0 xaj0Var, xaj0 xaj0Var2) {
        return ((Integer) xaj0Var.c).intValue() - ((Integer) xaj0Var2.c).intValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m17280T3(e30 e30Var, gul gulVar) {
        if (gulVar instanceof lk2) {
            try {
                e30Var.call((lk2) gulVar);
            } catch (Exception e) {
                CrashHelper.c(e);
                ztr.a(e);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m17283W3(List list, lk2 lk2Var) {
        if (lk2Var.mo17287a4() != null) {
            list.add(lk2Var.mo17287a4());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m17285Y3(final e30<lk2> e30Var) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.kk2
            public final void call(Object obj) {
                lk2.m17280T3(e30Var, (gul) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: Z3 */
    public final j6g m17286Z3() {
        return m25547E2().f12141B;
    }

    /* JADX INFO: renamed from: a4 */
    public xaj0<String, View, Integer> mo17287a4() {
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public List<j760<String, View>> m17288b4() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        m17285Y3(new e30() { // from class: l.fk2
            public final void call(Object obj) {
                lk2.m17283W3(arrayList2, (lk2) obj);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.gk2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lk2.m17279S3((xaj0) obj, (xaj0) obj2);
            }
        });
        vwb.z(arrayList2, new e30() { // from class: l.hk2
            public final void call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                arrayList.add(vwb.Y((String) xaj0Var.a, (View) xaj0Var.b));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m17289c4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(7001).m25610e(str).m25608c());
        if (z) {
            m25548F2().FansClubEvent.hideFansClubDialog().p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void mo10939d4() {
        m17285Y3(new e30() { // from class: l.ik2
            public final void call(Object obj) {
                ((lk2) obj).mo10939d4();
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final void m17290e4(boolean z, mcg mcgVar) {
        m25548F2().FansClubEvent.hideFansClubDialog().p();
        m25548F2().FansClubEvent.showFansClubCompanyDialog().j(new a5g(z, mcgVar));
    }

    /* JADX INFO: renamed from: f4 */
    public void m17291f4(final mcg mcgVar) {
        m17285Y3(new e30() { // from class: l.ek2
            public final void call(Object obj) {
                ((lk2) obj).mo10746g4(mcgVar);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public void mo10940h4(final mcg mcgVar) {
        m17285Y3(new e30() { // from class: l.jk2
            public final void call(Object obj) {
                ((lk2) obj).mo10940h4(mcgVar);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public void mo10746g4(mcg mcgVar) {
    }
}
