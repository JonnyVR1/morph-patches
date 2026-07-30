package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class e4w {

    /* JADX INFO: renamed from: a */
    public static WeakReference<dd80> f89326a;

    /* JADX INFO: renamed from: b */
    public static boolean f89327b;

    /* JADX INFO: renamed from: l.e4w$a */
    public class C16537a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f89328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f89329b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f89330c;

        public C16537a(int i, Act act, d30 d30Var) {
            this.f89328a = i;
            this.f89329b = act;
            this.f89330c = d30Var;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i != this.f89328a) {
                return false;
            }
            this.f89329b.unregisterOnActivityResultListener(this);
            if (!NullChecker.m81303a(this.f89330c)) {
                return false;
            }
            this.f89330c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m114714b(CheckBox checkBox, d30 d30Var, boolean z, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (checkBox.isChecked() && NullChecker.m81303a(d30Var) && z) {
            d30Var.call();
        }
        f89326a = null;
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m114715c(String str, boolean z, CheckBox checkBox, final Act act, final d30 d30Var) {
        m114720h(str, z ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_confirm_click");
        if (!pvv.m171693c()) {
            wvv.m205779s(act, new d30() { // from class: l.c4w
                @Override // p149l.d30
                public final void call() {
                    e4w.m114717e(d30Var);
                }
            });
            return;
        }
        if (!PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            wvv.m205779s(act, new d30() { // from class: l.d4w
                @Override // p149l.d30
                public final void call() {
                    e4w.m114716d(act, d30Var);
                }
            });
            return;
        }
        if (!wvv.m205775o()) {
            act.registerOnActivityResultListener(new C16537a(1010, act, d30Var));
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m114716d(Act act, d30 d30Var) {
        if (!wvv.m205775o()) {
            CoreDlg.m45041Y1(act, true, d30Var);
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m114717e(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m114718f() {
        if (NullChecker.m81303a(f89326a) && NullChecker.m81303a(f89326a.get()) && f89326a.get().isShowing()) {
            f89326a.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m114719g() {
        return NullChecker.m81303a(f89326a) && NullChecker.m81303a(f89326a.get()) && f89326a.get().isShowing();
    }

    /* JADX INFO: renamed from: h */
    public static void m114720h(String str, boolean z, String str2) {
        zvf0.m220399u(str2, "p_alert_positioning_authority_open_guide_popup", vwb.m200311Y("from_exp", str), vwb.m200311Y("no_longer_prompt", z ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: i */
    public static void m114721i(Act act, d30 d30Var, d30 d30Var2, boolean z) {
        m114722j(act, d30Var, d30Var2, z, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m114722j(final Act act, final d30 d30Var, final d30 d30Var2, final boolean z, final boolean z2, String str) {
        if (act.isDialogShowing()) {
            return;
        }
        if (z2 && !ogl0.m164227F() && f89327b) {
            return;
        }
        if (z2) {
            f89327b = true;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_positioning_authority_open_guide_popup", Dialog.class.getName());
        String str2 = z2 ? "explore_tab" : "card";
        String str3 = z2 ? "explore_page" : "swipe_page";
        final String str4 = z2 ? "explore_tab" : "swipe_page";
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V(str, vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_page", str3), vwb.m200311Y("tooltips_trigger_module", str2), vwb.m200311Y("tooltips_trigger_reason", "no_location_permission_tips"), vwb.m200311Y("from_exp", z2 ? "explore_tab" : "swipe_page")));
        i0e.m133797f(cwf0VarM133794c);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f96045v6, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f173973P1);
        View viewFindViewById = viewInflate.findViewById(u4c0.f174064U8);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(u4c0.f174048T8);
        if (upa.m194847z()) {
            ((VImage) viewInflate.findViewById(u4c0.f174138Z2)).setImageResource(x2c0.f190460ph);
        }
        textView.getPaint().setFakeBoldText(true);
        xdl0.m208344M(viewFindViewById, z);
        f89326a = new WeakReference<>(new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110972a0(R$string.f18764nh, new Runnable() { // from class: l.z3w
            @Override // java.lang.Runnable
            public final void run() {
                e4w.m114715c(str4, z2, checkBox, act, d30Var);
            }
        }).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110966U(R$string.f18733mh, new Runnable() { // from class: l.a4w
            @Override // java.lang.Runnable
            public final void run() {
                e4w.m114720h(str4, z2 ? false : checkBox.isChecked(), "e_positioning_authority_open_guide_cancel_click");
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.b4w
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                e4w.m114714b(checkBox, d30Var2, z, cwf0VarM133794c, dialogInterface);
            }
        }).m110989r0());
    }
}
