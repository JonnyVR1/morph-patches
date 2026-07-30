package p149l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class myd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ roj0 m157013e(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m157015g(User user) {
        Application application = CoreModule.f17544b;
        application.startActivity(DialogAct.m79378P0(application, 2, user, false));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m157016h(f30 f30Var, Act act, Throwable th) {
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call("done", null);
        }
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m157017i(f30 f30Var, Act act, final User user, roj0 roj0Var) {
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call("done", null);
        }
        act.progressDismiss();
        act.m66873d2();
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.lyd0
            @Override // java.lang.Runnable
            public final void run() {
                myd0.m157015g(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m157018j(f30 f30Var, View view) {
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call("cancel", null);
        }
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, final f30<String, String> f30Var) {
        final Map<String, String> mapM201098f = w2e0Var.m201098f();
        if (TextUtils.isEmpty(mapM201098f.get(Oauth2AccessToken.KEY_UID))) {
            return;
        }
        xh0.C21150a c21150a = new xh0.C21150a(w2e0Var.m201094b());
        c21150a.m208731j(w2e0Var.m201094b().getString(R$string.f18917si)).m208726e(R$string.f18408c).m208724c(new View.OnClickListener() { // from class: l.gyd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myd0.m157018j(f30Var, view);
            }
        }).m208738q(R$string.f18562h).m208736o(new View.OnClickListener() { // from class: l.hyd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110095a.m157019k(w2e0Var, mapM201098f, f30Var, view);
            }
        });
        c21150a.m208722a().m208721g();
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m157019k(w2e0 w2e0Var, Map map, f30 f30Var, View view) {
        m157020l((Act) w2e0Var.m201094b(), map, f30Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m157020l(final Act act, Map<String, String> map, final f30<String, String> f30Var) {
        String str = map.get("msgId");
        String str2 = map.get("value");
        String str3 = map.get("conType");
        String str4 = map.get(Oauth2AccessToken.KEY_UID);
        act.progress(R$string.f17842J5, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str2;
        report.contentType = str3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        report.chatMessages = arrayList;
        new Relationship().state = RelationshipStatus.get("blocked");
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str4);
        mkd0.m154984r(CoreModule.f17545c.f19639e0.m169496ha(str4, report), CoreModule.f17545c.f19642f0.m33090qe(str4, act), new x9j() { // from class: l.iyd0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return myd0.m157013e((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.jyd0
            @Override // p149l.e30
            public final void call(Object obj) {
                myd0.m157017i(f30Var, act, userM169430Pa, (roj0) obj);
            }
        }, new e30() { // from class: l.kyd0
            @Override // p149l.e30
            public final void call(Object obj) {
                myd0.m157016h(f30Var, act, (Throwable) obj);
            }
        }));
    }
}
