package p153l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.DialogAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class q6e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ uxj0 m175558e(uxj0 uxj0Var, uxj0 uxj0Var2) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m175560g(User user) {
        Application application = CoreModule.f18263b;
        application.startActivity(DialogAct.m80561Q0(application, 2, user, false));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m175561h(z20 z20Var, Act act, Throwable th) {
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call("done", null);
        }
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m175562i(z20 z20Var, Act act, final User user, uxj0 uxj0Var) {
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call("done", null);
        }
        act.progressDismiss();
        act.m68056e2();
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.p6e0
            @Override // java.lang.Runnable
            public final void run() {
                q6e0.m175560g(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m175563j(z20 z20Var, View view) {
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call("cancel", null);
        }
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, final z20<String, String> z20Var) {
        final Map<String, String> mapM96743f = abe0Var.m96743f();
        if (TextUtils.isEmpty(mapM96743f.get(Oauth2AccessToken.KEY_UID))) {
            return;
        }
        th0.C20312a c20312a = new th0.C20312a(abe0Var.m96739b());
        c20312a.m191151j(abe0Var.m96739b().getString(R$string.f18735Oi)).m191146e(R$string.f19138c).m191144c(new View.OnClickListener() { // from class: l.k6e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q6e0.m175563j(z20Var, view);
            }
        }).m191158q(R$string.f19292h).m191156o(new View.OnClickListener() { // from class: l.l6e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130248a.m175564k(abe0Var, mapM96743f, z20Var, view);
            }
        });
        c20312a.m191142a().m191141g();
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m175564k(abe0 abe0Var, Map map, z20 z20Var, View view) {
        m175565l((Act) abe0Var.m96739b(), map, z20Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m175565l(final Act act, Map<String, String> map, final z20<String, String> z20Var) {
        String str = map.get("msgId");
        String str2 = map.get("value");
        String str3 = map.get("conType");
        String str4 = map.get(Oauth2AccessToken.KEY_UID);
        act.progress(R$string.f18632L5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str2;
        report.contentType = str3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get("blocked");
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str4);
        psd0.m173625r(CoreModule.f18264c.f20381e0.m116569ha(str4, report), CoreModule.f18264c.f20384f0.m34093qe(str4, act), new rcj() { // from class: l.m6e0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return q6e0.m175558e((uxj0) obj, (uxj0) obj2);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.n6e0
            @Override // p153l.y20
            public final void call(Object obj) {
                q6e0.m175562i(z20Var, act, userM116503Pa, (uxj0) obj);
            }
        }, new y20() { // from class: l.o6e0
            @Override // p153l.y20
            public final void call(Object obj) {
                q6e0.m175561h(z20Var, act, (Throwable) obj);
            }
        }));
    }
}
