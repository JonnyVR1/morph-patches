package p149l;

import android.text.TextUtils;
import android.view.View;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public class lk2<T extends s7m> extends x6s<ho2, T> {
    public lk2(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ int m150125S3(xaj0 xaj0Var, xaj0 xaj0Var2) {
        return ((Integer) xaj0Var.f191753c).intValue() - ((Integer) xaj0Var2.f191753c).intValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m150126T3(e30 e30Var, gul gulVar) {
        if (gulVar instanceof lk2) {
            try {
                e30Var.call((lk2) gulVar);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                ztr.m220136a(e);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m150129W3(List list, lk2 lk2Var) {
        if (lk2Var.mo150133a4() != null) {
            list.add(lk2Var.mo150133a4());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m150131Y3(final e30<lk2> e30Var) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.kk2
            @Override // p149l.e30
            public final void call(Object obj) {
                lk2.m150126T3(e30Var, (gul) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: Z3 */
    public final j6g m150132Z3() {
        return m206027E2().f108741B;
    }

    /* JADX INFO: renamed from: a4 */
    public xaj0<String, View, Integer> mo150133a4() {
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public List<j760<String, View>> m150134b4() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        m150131Y3(new e30() { // from class: l.fk2
            @Override // p149l.e30
            public final void call(Object obj) {
                lk2.m150129W3(arrayList2, (lk2) obj);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.gk2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lk2.m150125S3((xaj0) obj, (xaj0) obj2);
            }
        });
        vwb.m200354z(arrayList2, new e30() { // from class: l.hk2
            @Override // p149l.e30
            public final void call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                arrayList.add(vwb.m200311Y((String) xaj0Var.f191751a, (View) xaj0Var.f191752b));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m150135c4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7001).m206701e(str).m206699c());
        if (z) {
            m206028F2().FansClubEvent.hideFansClubDialog().m172467p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void mo106221d4() {
        m150131Y3(new e30() { // from class: l.ik2
            @Override // p149l.e30
            public final void call(Object obj) {
                ((lk2) obj).mo106221d4();
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final void m150136e4(boolean z, mcg mcgVar) {
        m206028F2().FansClubEvent.hideFansClubDialog().m172467p();
        m206028F2().FansClubEvent.showFansClubCompanyDialog().mo172463j(new a5g(z, mcgVar));
    }

    /* JADX INFO: renamed from: f4 */
    public void m150137f4(final mcg mcgVar) {
        m150131Y3(new e30() { // from class: l.ek2
            @Override // p149l.e30
            public final void call(Object obj) {
                ((lk2) obj).mo105325g4(mcgVar);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public void mo106222h4(final mcg mcgVar) {
        m150131Y3(new e30() { // from class: l.jk2
            @Override // p149l.e30
            public final void call(Object obj) {
                ((lk2) obj).mo106222h4(mcgVar);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public void mo105325g4(mcg mcgVar) {
    }
}
