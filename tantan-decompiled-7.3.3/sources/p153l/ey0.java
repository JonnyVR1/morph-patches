package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes12.dex */
public class ey0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123119a(Act act, th0[] th0VarArr, View view) {
        act.startActivity(CoreModule.m30930K().startMessagesAct(act, User.ID_TEAM_ACCOUNT, true, false));
        th0VarArr[0].m191137c();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m123120b(th0[] th0VarArr, boolean z, Act act, View view) {
        th0VarArr[0].m191137c();
        if (z) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m123122d(th0[] th0VarArr, Act act, View view) {
        th0VarArr[0].m191137c();
        act.m68056e2();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123123e(Act act, th0[] th0VarArr, boolean z, View view) {
        act.startActivity(CoreModule.m30930K().startMessagesAct(act, User.ID_TEAM_ACCOUNT, true, false));
        th0VarArr[0].m191137c();
        if (z) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m123124f(final Act act) {
        if (gta.m132210e().m132214d().mo34721Ln() || act == null) {
            return;
        }
        th0 th0VarM191142a = new th0.C20312a(act).m191148g(false).m191149h(false).m191151j(act.getString(R$string.f28598N)).m191159r(act.getResources().getString(R$string.f28588L)).m191156o(new View.OnClickListener() { // from class: l.zx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ey0.m123122d(th0VarArr, act, view);
            }
        }).m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: g */
    public static void m123125g(final Act act) {
        if (act == null) {
            return;
        }
        th0.C20312a c20312aM191156o = new th0.C20312a(act).m191148g(false).m191149h(false).m191159r(act.getResources().getString(R$string.f28588L)).m191156o(new View.OnClickListener() { // from class: l.ay0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th0VarArr[0].m191137c();
            }
        });
        c20312aM191156o.m191151j(act.getString(R$string.f28593M)).m191147f(act.getResources().getString(R$string.f28583K)).m191144c(new View.OnClickListener() { // from class: l.by0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ey0.m123119a(act, th0VarArr, view);
            }
        });
        th0 th0VarM191142a = c20312aM191156o.m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: h */
    public static void m123126h(Act act) {
        m123127i(act, true);
    }

    /* JADX INFO: renamed from: i */
    public static void m123127i(final Act act, final boolean z) {
        if (act == null) {
            return;
        }
        th0.C20312a c20312aM191156o = new th0.C20312a(act).m191148g(false).m191149h(false).m191159r(act.getResources().getString(R$string.f28588L)).m191156o(new View.OnClickListener() { // from class: l.cy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ey0.m123120b(th0VarArr, z, act, view);
            }
        });
        c20312aM191156o.m191151j(act.getString(R$string.f28603O)).m191147f(act.getResources().getString(R$string.f28583K)).m191144c(new View.OnClickListener() { // from class: l.dy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ey0.m123123e(act, th0VarArr, z, view);
            }
        });
        th0 th0VarM191142a = c20312aM191156o.m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
    }
}
