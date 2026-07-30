package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class c6w {

    /* JADX INFO: renamed from: a */
    public static WeakReference<jl80> f80001a;

    /* JADX INFO: renamed from: b */
    public static boolean f80002b;

    /* JADX INFO: renamed from: l.c6w$a */
    public class C16202a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f80003a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f80004b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x20 f80005c;

        public C16202a(int i, Act act, x20 x20Var) {
            this.f80003a = i;
            this.f80004b = act;
            this.f80005c = x20Var;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i != this.f80003a) {
                return false;
            }
            this.f80004b.unregisterOnActivityResultListener(this);
            if (!NullChecker.m82486a(this.f80005c)) {
                return false;
            }
            this.f80005c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m108178b(CheckBox checkBox, x20 x20Var, boolean z, l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (checkBox.isChecked() && NullChecker.m82486a(x20Var) && z) {
            x20Var.call();
        }
        f80001a = null;
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m108179c(String str, boolean z, CheckBox checkBox, final Act act, final x20 x20Var) {
        m108184h(str, z ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_confirm_click");
        if (!qxv.m178618c()) {
            xxv.m213592s(act, new x20() { // from class: l.a6w
                @Override // p153l.x20
                public final void call() {
                    c6w.m108181e(x20Var);
                }
            });
            return;
        }
        if (!PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            xxv.m213592s(act, new x20() { // from class: l.b6w
                @Override // p153l.x20
                public final void call() {
                    c6w.m108180d(act, x20Var);
                }
            });
            return;
        }
        if (!xxv.m213588o()) {
            act.registerOnActivityResultListener(new C16202a(1010, act, x20Var));
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m108180d(Act act, x20 x20Var) {
        if (!xxv.m213588o()) {
            CoreDlg.m46224Y1(act, true, x20Var);
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m108181e(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m108182f() {
        if (NullChecker.m82486a(f80001a) && NullChecker.m82486a(f80001a.get()) && f80001a.get().isShowing()) {
            f80001a.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m108183g() {
        return NullChecker.m82486a(f80001a) && NullChecker.m82486a(f80001a.get()) && f80001a.get().isShowing();
    }

    /* JADX INFO: renamed from: h */
    public static void m108184h(String str, boolean z, String str2) {
        i4g0.m138523u(str2, "p_alert_positioning_authority_open_guide_popup", jyb.m147494Y("from_exp", str), jyb.m147494Y("no_longer_prompt", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: i */
    public static void m108185i(Act act, x20 x20Var, x20 x20Var2, boolean z) {
        m108186j(act, x20Var, x20Var2, z, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m108186j(final Act act, final x20 x20Var, final x20 x20Var2, final boolean z, final boolean z2, String str) {
        if (act.isDialogShowing()) {
            return;
        }
        if (z2 && !spl0.m187354F() && f80002b) {
            return;
        }
        if (z2) {
            f80002b = true;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_positioning_authority_open_guide_popup", Dialog.class.getName());
        String str2 = z2 ? "explore_tab" : "card";
        String str3 = z2 ? "explore_page" : "swipe_page";
        final String str4 = z2 ? "explore_tab" : "swipe_page";
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V(str, jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_page", str3), jyb.m147494Y("tooltips_trigger_module", str2), jyb.m147494Y("tooltips_trigger_reason", "no_location_permission_tips"), jyb.m147494Y("from_exp", z2 ? "explore_tab" : "swipe_page")));
        w1e.m204402f(l4g0VarM204399c);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f126116w6, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70061P1);
        View viewFindViewById = viewInflate.findViewById(adc0.f70187W8);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(adc0.f70170V8);
        if (gra.m131778z()) {
            ((VImage) viewInflate.findViewById(adc0.f70263b3)).setImageResource(dbc0.f86926di);
        }
        textView.getPaint().setFakeBoldText(true);
        bnl0.m105524M(viewFindViewById, z);
        f80001a = new WeakReference<>(new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146032a0(R$string.f18551Ih, new Runnable() { // from class: l.x5w
            @Override // java.lang.Runnable
            public final void run() {
                c6w.m108179c(str4, z2, checkBox, act, x20Var);
            }
        }).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146026U(R$string.f18520Hh, new Runnable() { // from class: l.y5w
            @Override // java.lang.Runnable
            public final void run() {
                c6w.m108184h(str4, z2 ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_cancel_click");
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.z5w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c6w.m108178b(checkBox, x20Var2, z, l4g0VarM204399c, dialogInterface);
            }
        }).m146049r0());
    }
}
