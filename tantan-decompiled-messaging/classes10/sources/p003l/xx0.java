package p003l;

import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import l.ura;
import l.xh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xx0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10971a(Act act, xh0[] xh0VarArr, View view) {
        act.startActivity(CoreModule.K().startMessagesAct(act, "-1", true, false));
        xh0VarArr[0].c();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10972b(xh0[] xh0VarArr, boolean z, Act act, View view) {
        xh0VarArr[0].c();
        if (z) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10974d(xh0[] xh0VarArr, Act act, View view) {
        xh0VarArr[0].c();
        act.finish();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10975e(Act act, xh0[] xh0VarArr, boolean z, View view) {
        act.startActivity(CoreModule.K().startMessagesAct(act, "-1", true, false));
        xh0VarArr[0].c();
        if (z) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10976f(final Act act) {
        if (ura.e().d().Ln() || act == null) {
            return;
        }
        xh0 xh0VarA = new xh0.a(act).g(false).h(false).j(act.getString(R.string.N)).r(act.getResources().getString(R.string.L)).o(new View.OnClickListener() { // from class: l.sx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m10974d(xh0VarArr, act, view);
            }
        }).a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: g */
    public static void m10977g(final Act act) {
        if (act == null) {
            return;
        }
        xh0.a aVarO = new xh0.a(act).g(false).h(false).r(act.getResources().getString(R.string.L)).o(new View.OnClickListener() { // from class: l.tx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh0VarArr[0].c();
            }
        });
        aVarO.j(act.getString(R.string.M)).f(act.getResources().getString(R.string.K)).c(new View.OnClickListener() { // from class: l.ux0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m10971a(act, xh0VarArr, view);
            }
        });
        xh0 xh0VarA = aVarO.a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: h */
    public static void m10978h(Act act) {
        m10979i(act, true);
    }

    /* JADX INFO: renamed from: i */
    public static void m10979i(final Act act, final boolean z) {
        if (act == null) {
            return;
        }
        xh0.a aVarO = new xh0.a(act).g(false).h(false).r(act.getResources().getString(R.string.L)).o(new View.OnClickListener() { // from class: l.vx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m10972b(xh0VarArr, z, act, view);
            }
        });
        aVarO.j(act.getString(R.string.O)).f(act.getResources().getString(R.string.K)).c(new View.OnClickListener() { // from class: l.wx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xx0.m10975e(act, xh0VarArr, z, view);
            }
        });
        xh0 xh0VarA = aVarO.a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
    }
}
