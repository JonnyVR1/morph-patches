package p009l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.cwf0;
import l.d30;
import l.dd80;
import l.f6c0;
import l.j760;
import l.ogl0;
import l.pvv;
import l.u4c0;
import l.upa;
import l.vwb;
import l.wvv;
import l.x2c0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e4w {

    /* JADX INFO: renamed from: a */
    public static WeakReference<dd80> f12365a;

    /* JADX INFO: renamed from: b */
    public static boolean f12366b;

    /* JADX INFO: renamed from: l.e4w$a */
    public class C0870a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f12367a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f12368b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f12369c;

        public C0870a(int i, Act act, d30 d30Var) {
            this.f12367a = i;
            this.f12368b = act;
            this.f12369c = d30Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m13731a(int i, int i2, Intent intent) {
            if (i != this.f12367a) {
                return false;
            }
            this.f12368b.unregisterOnActivityResultListener(this);
            if (!NullChecker.a(this.f12369c)) {
                return false;
            }
            this.f12369c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13722b(CheckBox checkBox, d30 d30Var, boolean z, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (checkBox.isChecked() && NullChecker.a(d30Var) && z) {
            d30Var.call();
        }
        f12365a = null;
        i0e.m16064e(cwf0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13723c(String str, boolean z, CheckBox checkBox, final Act act, final d30 d30Var) {
        m13728h(str, z ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_confirm_click");
        if (!pvv.c()) {
            wvv.s(act, new d30() { // from class: l.c4w
                public final void call() {
                    e4w.m13725e(d30Var);
                }
            });
            return;
        }
        if (!PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            wvv.s(act, new d30() { // from class: l.d4w
                public final void call() {
                    e4w.m13724d(act, d30Var);
                }
            });
            return;
        }
        if (!wvv.o()) {
            act.registerOnActivityResultListener(new C0870a(1010, act, d30Var));
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13724d(Act act, d30 d30Var) {
        if (!wvv.o()) {
            CoreDlg.Y1(act, true, d30Var);
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13725e(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m13726f() {
        if (NullChecker.a(f12365a) && NullChecker.a(f12365a.get()) && f12365a.get().isShowing()) {
            f12365a.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m13727g() {
        return NullChecker.a(f12365a) && NullChecker.a(f12365a.get()) && f12365a.get().isShowing();
    }

    /* JADX INFO: renamed from: h */
    public static void m13728h(String str, boolean z, String str2) {
        zvf0.u(str2, "p_alert_positioning_authority_open_guide_popup", new j760[]{vwb.Y("from_exp", str), vwb.Y("no_longer_prompt", z ? "on" : "off")});
    }

    /* JADX INFO: renamed from: i */
    public static void m13729i(Act act, d30 d30Var, d30 d30Var2, boolean z) {
        m13730j(act, d30Var, d30Var2, z, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m13730j(final Act act, final d30 d30Var, final d30 d30Var2, final boolean z, final boolean z2, String str) {
        if (act.isDialogShowing()) {
            return;
        }
        if (z2 && !ogl0.F() && f12366b) {
            return;
        }
        if (z2) {
            f12366b = true;
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_alert_positioning_authority_open_guide_popup", Dialog.class.getName());
        String str2 = z2 ? "explore_tab" : "card";
        String str3 = z2 ? "explore_page" : "swipe_page";
        final String str4 = z2 ? "explore_tab" : "swipe_page";
        cwf0VarM16062c.p(ic50.m16316j().m16322f().m17401V(str, vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_page", str3), vwb.Y("tooltips_trigger_module", str2), vwb.Y("tooltips_trigger_reason", "no_location_permission_tips"), vwb.Y("from_exp", z2 ? "explore_tab" : "swipe_page")));
        i0e.m16065f(cwf0VarM16062c);
        View viewInflate = o7r.m19649a(act).inflate(f6c0.v6, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.P1);
        View viewFindViewById = viewInflate.findViewById(u4c0.U8);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.T8);
        if (upa.z()) {
            viewInflate.findViewById(u4c0.Z2).setImageResource(x2c0.ph);
        }
        textView.getPaint().setFakeBoldText(true);
        xdl0.M(viewFindViewById, z);
        f12365a = new WeakReference<>(new dd80.a(act).R(viewInflate).P(false).a0(R.string.nh, new Runnable() { // from class: l.z3w
            @Override // java.lang.Runnable
            public final void run() {
                e4w.m13723c(str4, z2, checkBox, act, d30Var);
            }
        }).d0(upa.z() ? x2c0.Q : -1).U(R.string.mh, new Runnable() { // from class: l.a4w
            @Override // java.lang.Runnable
            public final void run() {
                e4w.m13728h(str4, z2 ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_cancel_click");
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.b4w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                e4w.m13722b(checkBox, d30Var2, z, cwf0VarM16062c, dialogInterface);
            }
        }).r0());
    }
}
