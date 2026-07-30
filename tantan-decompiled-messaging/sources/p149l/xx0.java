package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes10.dex */
public class xx0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m211432a(Act act, xh0[] xh0VarArr, View view) {
        act.startActivity(CoreModule.m29932K().startMessagesAct(act, User.ID_TEAM_ACCOUNT, true, false));
        xh0VarArr[0].m208717c();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m211433b(xh0[] xh0VarArr, boolean z, Act act, View view) {
        xh0VarArr[0].m208717c();
        if (z) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211435d(xh0[] xh0VarArr, Act act, View view) {
        xh0VarArr[0].m208717c();
        act.m66873d2();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m211436e(Act act, xh0[] xh0VarArr, boolean z, View view) {
        act.startActivity(CoreModule.m29932K().startMessagesAct(act, User.ID_TEAM_ACCOUNT, true, false));
        xh0VarArr[0].m208717c();
        if (z) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m211437f(final Act act) {
        if (ura.m195053e().m195057d().mo33718Ln() || act == null) {
            return;
        }
        xh0 xh0VarM208722a = new xh0.C21150a(act).m208728g(false).m208729h(false).m208731j(act.getString(R$string.f27750N)).m208739r(act.getResources().getString(R$string.f27740L)).m208736o(new View.OnClickListener() { // from class: l.sx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m211435d(xh0VarArr, act, view);
            }
        }).m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: g */
    public static void m211438g(final Act act) {
        if (act == null) {
            return;
        }
        xh0.C21150a c21150aM208736o = new xh0.C21150a(act).m208728g(false).m208729h(false).m208739r(act.getResources().getString(R$string.f27740L)).m208736o(new View.OnClickListener() { // from class: l.tx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh0VarArr[0].m208717c();
            }
        });
        c21150aM208736o.m208731j(act.getString(R$string.f27745M)).m208727f(act.getResources().getString(R$string.f27735K)).m208724c(new View.OnClickListener() { // from class: l.ux0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m211432a(act, xh0VarArr, view);
            }
        });
        xh0 xh0VarM208722a = c21150aM208736o.m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: h */
    public static void m211439h(Act act) {
        m211440i(act, true);
    }

    /* JADX INFO: renamed from: i */
    public static void m211440i(final Act act, final boolean z) {
        if (act == null) {
            return;
        }
        xh0.C21150a c21150aM208736o = new xh0.C21150a(act).m208728g(false).m208729h(false).m208739r(act.getResources().getString(R$string.f27740L)).m208736o(new View.OnClickListener() { // from class: l.vx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m211433b(xh0VarArr, z, act, view);
            }
        });
        c21150aM208736o.m208731j(act.getString(R$string.f27755O)).m208727f(act.getResources().getString(R$string.f27735K)).m208724c(new View.OnClickListener() { // from class: l.wx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m211436e(act, xh0VarArr, z, view);
            }
        });
        xh0 xh0VarM208722a = c21150aM208736o.m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
    }
}
