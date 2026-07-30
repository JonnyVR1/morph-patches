package p006l;

import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterAct;
import com.p1.mobile.android.app.Act;
import l.d30;
import l.tzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zq20 {

    /* JADX INFO: renamed from: a */
    public static d30 f28908a;

    /* JADX INFO: renamed from: a */
    public static void m28787a() {
        f28908a = null;
    }

    /* JADX INFO: renamed from: b */
    public static d30 m28788b() {
        return f28908a;
    }

    /* JADX INFO: renamed from: c */
    public static void m28789c(Act act, int i) {
        if (!ura.m25555e().m25559d().m5636I4()) {
            ip20.m16777I(act, i);
        } else {
            act.startActivity(NewFilterAct.m8799a2(act, "", i));
            act.overridePendingTransition(tzb0.h, tzb0.c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m28790d(Act act, String str) {
        hno.m16292F(act);
    }

    /* JADX INFO: renamed from: e */
    public static void m28791e(Act act, String str, d30 d30Var) {
        if (!ura.m25555e().m25559d().m5636I4()) {
            ip20.m16778J(act, str, d30Var);
            return;
        }
        f28908a = d30Var;
        act.startActivity(NewFilterAct.m8798Z1(act, str));
        act.overridePendingTransition(tzb0.h, tzb0.c);
    }
}
