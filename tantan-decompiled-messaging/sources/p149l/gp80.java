package p149l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gp80 {

    /* JADX INFO: renamed from: a */
    public static final tpd0 f103768a = new tpd0("privacy_policy_version", 0);

    /* JADX INFO: renamed from: l.gp80$a */
    public class DialogInterfaceOnDismissListenerC17134a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f103769a;

        public DialogInterfaceOnDismissListenerC17134a(cwf0 cwf0Var) {
            this.f103769a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f103769a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m127333a(dd80[] dd80VarArr, Activity activity, e30 e30Var) {
        zvf0.m220396r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        dd80VarArr[0].m110917Y(activity.getString(R$string.f17303A1));
        qib0.f154681B.put(Boolean.TRUE);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(dd80VarArr[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m127334b(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.m220396r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m127336d(dd80[] dd80VarArr, cwf0 cwf0Var) {
        dd80 dd80Var = dd80VarArr[0];
        if (dd80Var != null) {
            dd80Var.show();
        }
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m127337e(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.m220396r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m127338f(dd80[] dd80VarArr, d30 d30Var) {
        zvf0.m220396r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        dd80VarArr[0].dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m127339g() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m127341i(Runnable runnable, Runnable runnable2, dd80 dd80Var, View view) {
        FakeSplashView.setVisitorHasClick(true);
        if (NullChecker.m81303a(runnable)) {
            runnable2.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m127343k(final Activity activity, final e30<dd80> e30Var) {
        if (qib0.f154681B.get().booleanValue()) {
            return;
        }
        if (PermissionHelper.m79881b("android.permission-group.LOCATION")) {
            final String str = "Privacy Dialog Show With Location Permission";
            au2.m98935w(new Exception(str) { // from class: com.p1.mobile.putong.util.DataFileObserver$FileModifyException
            });
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_first_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(e6c0.f89532N, (ViewGroup) null, false);
        ((VText) viewInflate.findViewById(s4c0.f162360s0)).setTypeface(eqh0.m117752c(2));
        VText vText = (VText) viewInflate.findViewById(s4c0.f162372y0);
        final dd80[] dd80VarArr = {dd80VarM110960O};
        final d30 d30Var = new d30() { // from class: l.wo80
            @Override // p149l.d30
            public final void call() {
                Activity activity2 = activity;
                gp80.m127346n(activity2, new Runnable() { // from class: l.ap80
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp80.m127336d(dd80VarArr, cwf0Var);
                    }
                }, new Runnable() { // from class: l.bp80
                    @Override // java.lang.Runnable
                    public final void run() {
                        Activity activity3 = activity2;
                        activity3.startActivity(WebViewPreAct.m79403K0(activity3, juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true&dialog=true#/"));
                    }
                }, new Runnable() { // from class: l.cp80
                    @Override // java.lang.Runnable
                    public final void run() {
                        gp80.m127339g();
                    }
                });
            }
        };
        dd80 dd80VarM110960O = new dd80.C16336a(activity).m110963R(viewInflate).m110961P(false).m110958M(false).m110972a0(R$string.f17522x1, new Runnable() { // from class: l.xo80
            @Override // java.lang.Runnable
            public final void run() {
                gp80.m127333a(dd80VarArr, activity, e30Var);
            }
        }).m110966U(R$string.f17531z1, new Runnable() { // from class: l.yo80
            @Override // java.lang.Runnable
            public final void run() {
                gp80.m127338f(dd80VarArr, d30Var);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.zo80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
        String string = activity.getString(R$string.f17327G1);
        String string2 = activity.getString(R$string.f17307B1);
        vText.setText(i0g0.m133837D(activity, activity.getResources().getColor(v0c0.f179101h), String.format(activity.getString(R$string.f17527y1), string, string2), string, juk.m143328j(), string2, juk.m143327i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: n */
    public static void m127346n(Activity activity, final Runnable runnable, final Runnable runnable2, final Runnable runnable3) {
        if (NullChecker.m81303a(activity)) {
            cwf0 cwf0VarM133794c = i0e.m133794c("p_second_privacy_policy_popup", Dialog.class.getName());
            cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
            View viewInflate = activity.getLayoutInflater().inflate(e6c0.f89558q, (ViewGroup) null);
            ((VText) viewInflate.findViewById(s4c0.f162284A0)).setTypeface(eqh0.m117752c(3), 1);
            VButton vButton = (VButton) viewInflate.findViewById(s4c0.f162347m);
            VText vText = (VText) viewInflate.findViewById(s4c0.f162370x0);
            VText vText2 = (VText) viewInflate.findViewById(s4c0.f162374z0);
            if (TextUtils.equals("zh", Locale.getDefault().getLanguage())) {
                VText vText3 = (VText) viewInflate.findViewById(s4c0.f162284A0);
                vText.setText("访客模式");
                vText3.setText("用户隐私政策");
            }
            final dd80 dd80VarM110960O = new dd80.C16336a(activity).m110963R(viewInflate).m110961P(false).m110960O();
            dd80VarM110960O.setOnDismissListener(new DialogInterfaceOnDismissListenerC17134a(cwf0VarM133794c));
            dd80VarM110960O.setCanceledOnTouchOutside(false);
            if (dd80VarM110960O.isShowing()) {
                return;
            }
            xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.dp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m127337e(runnable, dd80VarM110960O, view);
                }
            });
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ep80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m127341i(runnable3, runnable2, dd80VarM110960O, view);
                }
            });
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.fp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gp80.m127334b(runnable3, dd80VarM110960O, view);
                }
            });
            dd80VarM110960O.show();
            i0e.m133797f(cwf0VarM133794c);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m127344l(Activity activity) {
    }

    /* JADX INFO: renamed from: m */
    public static void m127345m(Activity activity, boolean z) {
    }
}
