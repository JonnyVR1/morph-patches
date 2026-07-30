package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterAct;

/* JADX INFO: loaded from: classes12.dex */
public class jz20 {

    /* JADX INFO: renamed from: a */
    public static x20 f123220a;

    /* JADX INFO: renamed from: a */
    public static void m147633a() {
        f123220a = null;
    }

    /* JADX INFO: renamed from: b */
    public static x20 m147634b() {
        return f123220a;
    }

    /* JADX INFO: renamed from: c */
    public static void m147635c(Act act, int i) {
        if (!gta.m132210e().m132214d().mo34702I4()) {
            sx20.m188423I(act, i);
        } else {
            act.startActivity(NewFilterAct.m56607b2(act, "", i));
            act.overridePendingTransition(z7c0.f203239h, z7c0.f203234c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147636d(Act act, String str) {
        hpo.m136569F(act);
    }

    /* JADX INFO: renamed from: e */
    public static void m147637e(Act act, String str, x20 x20Var) {
        if (!gta.m132210e().m132214d().mo34702I4()) {
            sx20.m188424J(act, str, x20Var);
            return;
        }
        f123220a = x20Var;
        act.startActivity(NewFilterAct.m56606a2(act, str));
        act.overridePendingTransition(z7c0.f203239h, z7c0.f203234c);
    }
}
