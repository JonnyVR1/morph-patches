package p009l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.p004ui.WebViewPreAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.splash.FakeSplashView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.au2;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.e6c0;
import l.eqh0;
import l.qib0;
import l.s4c0;
import l.tpd0;
import l.v0c0;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gp80 {

    /* JADX INFO: renamed from: a */
    public static final tpd0 f13661a = new tpd0("privacy_policy_version", 0);

    /* JADX INFO: renamed from: l.gp80$a */
    public class DialogInterfaceOnDismissListenerC0921a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f13662a;

        public DialogInterfaceOnDismissListenerC0921a(cwf0 cwf0Var) {
            this.f13662a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m16064e(this.f13662a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15132a(dd80[] dd80VarArr, Activity activity, e30 e30Var) {
        zvf0.r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        dd80VarArr[0].Y(activity.getString(R.string.A1));
        qib0.B.put(Boolean.TRUE);
        if (NullChecker.a(e30Var)) {
            e30Var.call(dd80VarArr[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15133b(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15135d(dd80[] dd80VarArr, cwf0 cwf0Var) {
        dd80 dd80Var = dd80VarArr[0];
        if (dd80Var != null) {
            dd80Var.show();
        }
        i0e.m16065f(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15136e(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15137f(dd80[] dd80VarArr, d30 d30Var) {
        zvf0.r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        dd80VarArr[0].dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15138g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15140i(Runnable runnable, Runnable runnable2, dd80 dd80Var, View view) {
        FakeSplashView.setVisitorHasClick(true);
        if (NullChecker.a(runnable)) {
            runnable2.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m15142k(final Activity activity, final e30<dd80> e30Var) {
        if (((Boolean) qib0.B.get()).booleanValue()) {
            return;
        }
        if (PermissionHelper.m10210b("android.permission-group.LOCATION")) {
            final String str = "Privacy Dialog Show With Location Permission";
            au2.w(new Exception(str) { // from class: com.p1.mobile.putong.util.DataFileObserver$FileModifyException
            });
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_first_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(e6c0.N, (ViewGroup) null, false);
        viewInflate.findViewById(s4c0.s0).setTypeface(eqh0.c(2));
        VText vTextFindViewById = viewInflate.findViewById(s4c0.y0);
        final dd80[] dd80VarArr = {dd80VarO};
        final d30 d30Var = new d30() { // from class: l.wo80
            public final void call() {
                Activity activity2 = activity;
                gp80.m15145n(activity2, new Runnable() { // from class: l.ap80
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp80.m15135d(dd80VarArr, cwf0Var);
                    }
                }, new Runnable() { // from class: l.bp80
                    @Override // java.lang.Runnable
                    public final void run() {
                        Activity activity3 = activity2;
                        activity3.startActivity(WebViewPreAct.m9724K0(activity3, juk.m17221e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/"));
                    }
                }, new Runnable() { // from class: l.cp80
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp80.m15138g();
                    }
                });
            }
        };
        dd80 dd80VarO = new dd80.a(activity).R(viewInflate).P(false).M(false).a0(R.string.x1, new Runnable() { // from class: l.xo80
            @Override // java.lang.Runnable
            public final void run() {
                gp80.m15132a(dd80VarArr, activity, e30Var);
            }
        }).U(R.string.z1, new Runnable() { // from class: l.yo80
            @Override // java.lang.Runnable
            public final void run() {
                gp80.m15137f(dd80VarArr, d30Var);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.zo80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).O();
        dd80VarO.show();
        i0e.m16065f(cwf0VarM16062c);
        String string = activity.getString(R.string.G1);
        String string2 = activity.getString(R.string.B1);
        vTextFindViewById.setText(i0g0.m16105D(activity, activity.getResources().getColor(v0c0.h), String.format(activity.getString(R.string.y1), string, string2), string, juk.m17226j(), string2, juk.m17225i()));
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: n */
    public static void m15145n(Activity activity, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        if (NullChecker.a(activity)) {
            cwf0 cwf0VarM16062c = i0e.m16062c("p_second_privacy_policy_popup", Dialog.class.getName());
            cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
            View viewInflate = activity.getLayoutInflater().inflate(e6c0.q, (ViewGroup) null);
            viewInflate.findViewById(s4c0.A0).setTypeface(eqh0.c(3), 1);
            VButton vButtonFindViewById = viewInflate.findViewById(s4c0.m);
            VText vTextFindViewById = viewInflate.findViewById(s4c0.x0);
            VText vTextFindViewById2 = viewInflate.findViewById(s4c0.z0);
            if (TextUtils.equals("zh", Locale.getDefault().getLanguage())) {
                VText vTextFindViewById3 = viewInflate.findViewById(s4c0.A0);
                vTextFindViewById.setText("访客模式");
                vTextFindViewById3.setText("用户隐私政策");
            }
            final dd80 dd80VarO = new dd80.a(activity).R(viewInflate).P(false).O();
            dd80VarO.setOnDismissListener(new DialogInterfaceOnDismissListenerC0921a(cwf0VarM16062c));
            dd80VarO.setCanceledOnTouchOutside(false);
            if (dd80VarO.isShowing()) {
                return;
            }
            xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.dp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m15136e(runnable, dd80VarO, view);
                }
            });
            xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.ep80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m15140i(runnable3, runnable2, dd80VarO, view);
                }
            });
            xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.fp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m15133b(runnable3, dd80VarO, view);
                }
            });
            dd80VarO.show();
            i0e.m16065f(cwf0VarM16062c);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m15143l(Activity activity) {
    }

    /* JADX INFO: renamed from: m */
    public static void m15144m(Activity activity, boolean z) {
    }
}
