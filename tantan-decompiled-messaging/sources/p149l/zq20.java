package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterAct;

/* JADX INFO: loaded from: classes9.dex */
public class zq20 {

    /* JADX INFO: renamed from: a */
    public static d30 f204341a;

    /* JADX INFO: renamed from: a */
    public static void m219836a() {
        f204341a = null;
    }

    /* JADX INFO: renamed from: b */
    public static d30 m219837b() {
        return f204341a;
    }

    /* JADX INFO: renamed from: c */
    public static void m219838c(Act act, int i) {
        if (!ura.m195053e().m195057d().mo33699I4()) {
            ip20.m137442I(act, i);
        } else {
            act.startActivity(NewFilterAct.m55424a2(act, "", i));
            act.overridePendingTransition(tzb0.f172721h, tzb0.f172716c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m219839d(Act act, String str) {
        hno.m131953F(act);
    }

    /* JADX INFO: renamed from: e */
    public static void m219840e(Act act, String str, d30 d30Var) {
        if (!ura.m195053e().m195057d().mo33699I4()) {
            ip20.m137443J(act, str, d30Var);
            return;
        }
        f204341a = d30Var;
        act.startActivity(NewFilterAct.m55423Z1(act, str));
        act.overridePendingTransition(tzb0.f172721h, tzb0.f172716c);
    }
}
