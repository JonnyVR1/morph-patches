package p153l;

import android.text.TextUtils;
import android.view.View;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p153l.iam;

/* JADX INFO: loaded from: classes4.dex */
public class tk2<T extends iam> extends y8s<oo2, T> {
    public tk2(dum<? extends oo2> dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ int m191474S3(bkj0 bkj0Var, bkj0 bkj0Var2) {
        return ((Integer) bkj0Var.f77083c).intValue() - ((Integer) bkj0Var2.f77083c).intValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m191475T3(y20 y20Var, uwl uwlVar) {
        if (uwlVar instanceof tk2) {
            try {
                y20Var.call((tk2) uwlVar);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                awr.m100707a(e);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m191478W3(List list, tk2 tk2Var) {
        if (tk2Var.mo153492a4() != null) {
            list.add(tk2Var.mo153492a4());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m191480Y3(final y20<tk2> y20Var) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.sk2
            @Override // p153l.y20
            public final void call(Object obj) {
                tk2.m191475T3(y20Var, (uwl) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: Z3 */
    public final x7g m191481Z3() {
        return m213810E2().f148254B;
    }

    /* JADX INFO: renamed from: a4 */
    public bkj0<String, View, Integer> mo153492a4() {
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public List<pf60<String, View>> m191482b4() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        m191480Y3(new y20() { // from class: l.nk2
            @Override // p153l.y20
            public final void call(Object obj) {
                tk2.m191478W3(arrayList2, (tk2) obj);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.ok2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tk2.m191474S3((bkj0) obj, (bkj0) obj2);
            }
        });
        jyb.m147537z(arrayList2, new y20() { // from class: l.pk2
            @Override // p153l.y20
            public final void call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                arrayList.add(jyb.m147494Y((String) bkj0Var.f77081a, (View) bkj0Var.f77082b));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m191483c4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7001).m103154e(str).m103152c());
        if (z) {
            m213811F2().FansClubEvent.hideFansClubDialog().m199277p();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void mo176237d4() {
        m191480Y3(new y20() { // from class: l.qk2
            @Override // p153l.y20
            public final void call(Object obj) {
                ((tk2) obj).mo176237d4();
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final void m191484e4(boolean z, aeg aegVar) {
        m213811F2().FansClubEvent.hideFansClubDialog().m199277p();
        m213811F2().FansClubEvent.showFansClubCompanyDialog().mo199273j(new o6g(z, aegVar));
    }

    /* JADX INFO: renamed from: f4 */
    public void m191485f4(final aeg aegVar) {
        m191480Y3(new y20() { // from class: l.mk2
            @Override // p153l.y20
            public final void call(Object obj) {
                ((tk2) obj).mo175592g4(aegVar);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public void mo176238h4(final aeg aegVar) {
        m191480Y3(new y20() { // from class: l.rk2
            @Override // p153l.y20
            public final void call(Object obj) {
                ((tk2) obj).mo176238h4(aegVar);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public void mo175592g4(aeg aegVar) {
    }
}
