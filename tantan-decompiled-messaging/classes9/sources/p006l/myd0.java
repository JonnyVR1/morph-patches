package p006l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.DialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.e30;
import l.e51;
import l.f30;
import l.mkd0;
import l.roj0;
import l.x9j;
import l.xh0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class myd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ roj0 m19584e(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m19586g(User user) {
        Application application = CoreModule.f1533b;
        application.startActivity(DialogAct.P0(application, 2, user, false));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m19587h(f30 f30Var, Act act, Throwable th) {
        if (NullChecker.a(f30Var)) {
            f30Var.call("done", (Object) null);
        }
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m19588i(f30 f30Var, Act act, final User user, roj0 roj0Var) {
        if (NullChecker.a(f30Var)) {
            f30Var.call("done", (Object) null);
        }
        act.progressDismiss();
        act.finish();
        e51.H(CoreModule.f1533b, new Runnable() { // from class: l.lyd0
            @Override // java.lang.Runnable
            public final void run() {
                myd0.m19586g(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m19589j(f30 f30Var, View view) {
        if (NullChecker.a(f30Var)) {
            f30Var.call("cancel", (Object) null);
        }
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, final f30<String, String> f30Var) {
        final Map<String, String> mapM26160f = w2e0Var.m26160f();
        if (TextUtils.isEmpty(mapM26160f.get("uid"))) {
            return;
        }
        xh0.a aVar = new xh0.a(w2e0Var.m26156b());
        aVar.j(w2e0Var.m26156b().getString(R$string.f2906si)).e(R$string.f2397c).c(new View.OnClickListener() { // from class: l.gyd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myd0.m19589j(f30Var, view);
            }
        }).q(R$string.f2551h).o(new View.OnClickListener() { // from class: l.hyd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14131a.m19590k(w2e0Var, mapM26160f, f30Var, view);
            }
        });
        aVar.a().g();
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m19590k(w2e0 w2e0Var, Map map, f30 f30Var, View view) {
        m19591l((Act) w2e0Var.m26156b(), map, f30Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m19591l(final Act act, Map<String, String> map, final f30<String, String> f30Var) {
        String str = map.get("msgId");
        String str2 = map.get("value");
        String str3 = map.get("conType");
        String str4 = map.get("uid");
        act.progress(R$string.f1831J5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str2;
        report.contentType = str3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get("blocked");
        final User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(str4);
        mkd0.r(CoreModule.f1534c.f3628e0.m21459ha(str4, report), CoreModule.f1534c.f3631f0.m5020qe(str4, act), new x9j() { // from class: l.iyd0
            public final Object call(Object obj, Object obj2) {
                return myd0.m19584e((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.jyd0
            public final void call(Object obj) {
                myd0.m19588i(f30Var, act, userM21393Pa, (roj0) obj);
            }
        }, new e30() { // from class: l.kyd0
            public final void call(Object obj) {
                myd0.m19587h(f30Var, act, (Throwable) obj);
            }
        }));
    }
}
