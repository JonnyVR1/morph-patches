package p003l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.e0;
import com.p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.settings.IntlPersonalDetailsAct;
import com.p1.mobile.putong.core.ui.settings.PersonalDetailsAct;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.c4g0;
import l.dd80;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.myf;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import l.zch0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wm20 {

    /* JADX INFO: renamed from: l.wm20$a */
    public class C3462a implements FakeHoldFragment.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f8200a;

        public C3462a(e30 e30Var) {
            this.f8200a = e30Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10528a(ArrayList<Media> arrayList, String str) {
            this.f8200a.call(Boolean.TRUE);
        }

        public void onError() {
            this.f8200a.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10513b(c4g0 c4g0Var, e30 e30Var, DialogInterface dialogInterface) {
        zch0.a().j(false, "fakeDialogExample");
        mkd0.z(c4g0Var);
        ygh0.m11231o();
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10514c(e30 e30Var, dd80 dd80Var, View view) {
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        zvf0.r("e_fake_alert_popup_back_button", "p_fake_alert_popup_view");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10515d(Runnable runnable, dd80 dd80Var, View view) {
        runnable.run();
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        ygh0.m11229n();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10518g(dd80 dd80Var, Act act, View view) {
        zvf0.r("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        PersonalDetailsAct.V1(act, "alert");
        act.startActivity(IntlPersonalDetailsAct.Companion.a(act, "alert"));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10519h(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m10520i(Act act, Runnable runnable, View view) {
        zvf0.r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        gk90.m6717e(act, CoreModule.c.e0.p9().gender, runnable, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m10521j(final Act act, final Runnable runnable, String str, final e30<Boolean> e30Var, String str2) {
        if ((act instanceof NewMainAct) && zch0.a().d()) {
            return;
        }
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f3, (ViewGroup) null);
        qib0.G.J0(viewInflate.findViewById(u4c0.O), CoreModule.c.e0.p9().fp().profileMiddle(), false);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.ge);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.P1);
        xdl0.M(viewInflate.findViewById(u4c0.Pa), false);
        viewInflate.findViewById(u4c0.Z0).setBackgroundResource(x2c0.T);
        viewInflate.findViewById(u4c0.Y0).setBackgroundResource(x2c0.T);
        if (CoreModule.c.e0.k8()) {
            textView.setText(act.getString(R.string.y4));
            textView2.setText(act.getString(R.string.z4));
        } else {
            textView.setText(act.getText(R.string.B4));
            textView2.setText(act.getString(R.string.A4));
        }
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(true).O();
        dd80VarO.setCanceledOnTouchOutside(false);
        ygh0.m11232p(str);
        xdl0.E0(viewInflate.findViewById(u4c0.Q0), new View.OnClickListener() { // from class: l.nm20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wm20.m10514c(e30Var, dd80VarO, view);
            }
        });
        if (CoreModule.c.e0.k8()) {
            View viewFindViewById = viewInflate.findViewById(u4c0.Z0);
            xdl0.M(viewFindViewById, true);
            zvf0.x("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
            xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.om20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m10518g(dd80VarO, act, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
            layoutParams.topMargin = t100.d(8.0f);
            viewFindViewById.setLayoutParams(layoutParams);
            xdl0.M(viewInflate.findViewById(u4c0.Y0), false);
            xdl0.M(viewInflate.findViewById(u4c0.Pa), false);
        } else {
            if (e0.a().e() && !(act instanceof IntlTribeSwipeAct)) {
                return;
            }
            xdl0.E0(viewInflate.findViewById(u4c0.Pa), new View.OnClickListener() { // from class: l.pm20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m10520i(act, runnable, view);
                }
            });
            xdl0.E0(viewInflate.findViewById(u4c0.Y0), new View.OnClickListener() { // from class: l.qm20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m10515d(runnable, dd80VarO, view);
                }
            });
        }
        final c4g0 c4g0VarSubscribe = act.duringCreated(b.r().q(), false).subscribe(mkd0.G(new e30() { // from class: l.rm20
            public final void call(Object obj) {
                wm20.m10519h(dd80VarO, (roj0) obj);
            }
        }));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sm20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wm20.m10513b(c4g0VarSubscribe, e30Var, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        zch0.a().j(true, "fakeDialogExample");
        dd80VarO.show();
        if (CoreModule.c.e0.k8()) {
            return;
        }
        act.postDelayed(new Runnable() { // from class: l.tm20
            @Override // java.lang.Runnable
            public final void run() {
                e0.a().c(true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static Runnable m10522k(final Act act) {
        return new Runnable() { // from class: l.um20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                b.r().C(act2, myf.E(act2));
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static Runnable m10523l(final Act act, final e30<Boolean> e30Var) {
        return new Runnable() { // from class: l.vm20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                b.r().D(act2, myf.E(act2), new wm20.C3462a(e30Var));
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static void m10524m(Act act) {
        m10525n(act, m10522k(act));
    }

    /* JADX INFO: renamed from: n */
    public static void m10525n(Act act, Runnable runnable) {
        m10526o(act, runnable, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m10526o(Act act, Runnable runnable, String str) {
        m10527p(act, runnable, str, "");
    }

    /* JADX INFO: renamed from: p */
    public static void m10527p(Act act, Runnable runnable, String str, String str2) {
        m10521j(act, runnable, str, null, str2);
    }
}
