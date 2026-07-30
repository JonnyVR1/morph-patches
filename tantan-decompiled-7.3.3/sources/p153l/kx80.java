package p153l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kx80 {

    /* JADX INFO: renamed from: a */
    public static final vxd0 f129176a = new vxd0("privacy_policy_version", 0);

    /* JADX INFO: renamed from: l.kx80$a */
    public class DialogInterfaceOnDismissListenerC18289a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f129177a;

        public DialogInterfaceOnDismissListenerC18289a(l4g0 l4g0Var) {
            this.f129177a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f129177a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m151809a(jl80[] jl80VarArr, Activity activity, y20 y20Var) {
        i4g0.m138520r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        jl80VarArr[0].m145977Y(activity.getString(R$string.f18022A1));
        uqb0.f180364B.put(Boolean.TRUE);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(jl80VarArr[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m151810b(Runnable runnable, jl80 jl80Var, View view) {
        i4g0.m138520r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m151812d(jl80[] jl80VarArr, l4g0 l4g0Var) {
        jl80 jl80Var = jl80VarArr[0];
        if (jl80Var != null) {
            jl80Var.show();
        }
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m151813e(Runnable runnable, jl80 jl80Var, View view) {
        i4g0.m138520r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m151814f(jl80[] jl80VarArr, x20 x20Var) {
        i4g0.m138520r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        jl80VarArr[0].dismiss();
        x20Var.call();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m151815g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m151817i(Runnable runnable, Runnable runnable2, jl80 jl80Var, View view) {
        FakeSplashView.setVisitorHasClick(true);
        if (NullChecker.m82486a(runnable)) {
            runnable2.run();
        }
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m151819k(final Activity activity, final y20<jl80> y20Var) {
        if (uqb0.f180364B.get().booleanValue()) {
            return;
        }
        if (PermissionHelper.m81064b("android.permission-group.LOCATION")) {
            final String str = "Privacy Dialog Show With Location Permission";
            qu2.m178128w(new Exception(str) { // from class: com.p1.mobile.putong.util.DataFileObserver$FileModifyException
            });
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_first_privacy_policy_popup", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(jec0.f120445N, (ViewGroup) null, false);
        ((VText) viewInflate.findViewById(ycc0.f198481s0)).setTypeface(lyh0.m156283c(2));
        VText vText = (VText) viewInflate.findViewById(ycc0.f198493y0);
        final jl80[] jl80VarArr = {jl80VarM146020O};
        final x20 x20Var = new x20() { // from class: l.ax80
            @Override // p153l.x20
            public final void call() {
                Activity activity2 = activity;
                kx80.m151822n(activity2, new Runnable() { // from class: l.ex80
                    @Override // java.lang.Runnable
                    public final void run() {
                        kx80.m151812d(jl80VarArr, l4g0Var);
                    }
                }, new Runnable() { // from class: l.fx80
                    @Override // java.lang.Runnable
                    public final void run() {
                        Activity activity3 = activity2;
                        activity3.startActivity(WebViewPreAct.m80586L0(activity3, zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/"));
                    }
                }, new Runnable() { // from class: l.gx80
                    @Override // java.lang.Runnable
                    public final void run() {
                        kx80.m151815g();
                    }
                });
            }
        };
        jl80 jl80VarM146020O = new jl80.C17971a(activity).m146023R(viewInflate).m146021P(false).m146018M(false).m146032a0(R$string.f18241x1, new Runnable() { // from class: l.bx80
            @Override // java.lang.Runnable
            public final void run() {
                kx80.m151809a(jl80VarArr, activity, y20Var);
            }
        }).m146026U(R$string.f18250z1, new Runnable() { // from class: l.cx80
            @Override // java.lang.Runnable
            public final void run() {
                kx80.m151814f(jl80VarArr, x20Var);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.dx80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
        String string = activity.getString(R$string.f18046G1);
        String string2 = activity.getString(R$string.f18026B1);
        vText.setText(q8g0.m175772D(activity, activity.getResources().getColor(b9c0.f75562h), String.format(activity.getString(R$string.f18246y1), string, string2), string, zwk.m221910j(), string2, zwk.m221909i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: n */
    public static void m151822n(Activity activity, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        if (NullChecker.m82486a(activity)) {
            l4g0 l4g0VarM204399c = w1e.m204399c("p_second_privacy_policy_popup", Dialog.class.getName());
            l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
            View viewInflate = activity.getLayoutInflater().inflate(jec0.f120471q, (ViewGroup) null);
            ((VText) viewInflate.findViewById(ycc0.f198405A0)).setTypeface(lyh0.m156283c(3), 1);
            VButton vButton = (VButton) viewInflate.findViewById(ycc0.f198468m);
            VText vText = (VText) viewInflate.findViewById(ycc0.f198491x0);
            VText vText2 = (VText) viewInflate.findViewById(ycc0.f198495z0);
            if (TextUtils.equals("zh", Locale.getDefault().getLanguage())) {
                VText vText3 = (VText) viewInflate.findViewById(ycc0.f198405A0);
                vText.setText("访客模式");
                vText3.setText("用户隐私政策");
            }
            final jl80 jl80VarM146020O = new jl80.C17971a(activity).m146023R(viewInflate).m146021P(false).m146020O();
            jl80VarM146020O.setOnDismissListener(new DialogInterfaceOnDismissListenerC18289a(l4g0VarM204399c));
            jl80VarM146020O.setCanceledOnTouchOutside(false);
            if (jl80VarM146020O.isShowing()) {
                return;
            }
            bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.hx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kx80.m151813e(runnable, jl80VarM146020O, view);
                }
            });
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.ix80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kx80.m151817i(runnable3, runnable2, jl80VarM146020O, view);
                }
            });
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.jx80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kx80.m151810b(runnable3, jl80VarM146020O, view);
                }
            });
            jl80VarM146020O.show();
            w1e.m204402f(l4g0VarM204399c);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m151820l(Activity activity) {
    }

    /* JADX INFO: renamed from: m */
    public static void m151821m(Activity activity, boolean z) {
    }
}
