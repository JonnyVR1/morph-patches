package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4737e0;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.settings.IntlPersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.PersonalDetailsAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class wm20 {

    /* JADX INFO: renamed from: l.wm20$a */
    public class C20893a implements FakeHoldFragment.InterfaceC7844a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f187044a;

        public C20893a(e30 e30Var) {
            this.f187044a = e30Var;
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        /* JADX INFO: renamed from: a */
        public void mo36397a(ArrayList<Media> arrayList, String str) {
            this.f187044a.call(Boolean.TRUE);
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        public void onError() {
            this.f187044a.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m203962b(c4g0 c4g0Var, e30 e30Var, DialogInterface dialogInterface) {
        zch0.m218024a().m218033j(false, "fakeDialogExample");
        mkd0.m154992z(c4g0Var);
        ygh0.m214696o();
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m203963c(e30 e30Var, dd80 dd80Var, View view) {
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        zvf0.m220396r("e_fake_alert_popup_back_button", "p_fake_alert_popup_view");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m203964d(Runnable runnable, dd80 dd80Var, View view) {
        runnable.run();
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        ygh0.m214694n();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m203967g(dd80 dd80Var, Act act, View view) {
        zvf0.m220396r("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
        PersonalDetailsAct.m55029V1(act, "alert");
        act.startActivity(IntlPersonalDetailsAct.INSTANCE.m55003a(act, "alert"));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m203968h(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m203969i(Act act, Runnable runnable, View view) {
        zvf0.m220396r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        gk90.m126611e(act, CoreModule.f17545c.f19639e0.m169527p9().gender, runnable, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m203970j(final Act act, final Runnable runnable, String str, final e30<Boolean> e30Var, String str2) {
        if ((act instanceof NewMainAct) && zch0.m218024a().m218027d()) {
            return;
        }
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f95771f3, (ViewGroup) null);
        qib0.f154691G.m102327J0((VDraweeView) viewInflate.findViewById(u4c0.f173954O), CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle(), false);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174268ge);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f173973P1);
        xdl0.m208344M(viewInflate.findViewById(u4c0.f173982Pa), false);
        viewInflate.findViewById(u4c0.f174136Z0).setBackgroundResource(x2c0.f189748T);
        viewInflate.findViewById(u4c0.f174120Y0).setBackgroundResource(x2c0.f189748T);
        if (CoreModule.f17545c.f19639e0.m169506k8()) {
            textView.setText(act.getString(R$string.f19083y4));
            textView2.setText(act.getString(R$string.f19113z4));
        } else {
            textView.setText(act.getText(R$string.f17601B4));
            textView2.setText(act.getString(R$string.f17571A4));
        }
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        ygh0.m214697p(str);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f173989Q0), new View.OnClickListener() { // from class: l.nm20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wm20.m203963c(e30Var, dd80VarM110960O, view);
            }
        });
        if (CoreModule.f17545c.f19639e0.m169506k8()) {
            View viewFindViewById = viewInflate.findViewById(u4c0.f174136Z0);
            xdl0.m208344M(viewFindViewById, true);
            zvf0.m220402x("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
            xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.om20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m203967g(dd80VarM110960O, act, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
            layoutParams.topMargin = t100.m186890d(8.0f);
            viewFindViewById.setLayoutParams(layoutParams);
            xdl0.m208344M(viewInflate.findViewById(u4c0.f174120Y0), false);
            xdl0.m208344M(viewInflate.findViewById(u4c0.f173982Pa), false);
        } else {
            if (C4737e0.m31949a().m31954e() && !(act instanceof IntlTribeSwipeAct)) {
                return;
            }
            xdl0.m208329E0(viewInflate.findViewById(u4c0.f173982Pa), new View.OnClickListener() { // from class: l.pm20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m203969i(act, runnable, view);
                }
            });
            xdl0.m208329E0(viewInflate.findViewById(u4c0.f174120Y0), new View.OnClickListener() { // from class: l.qm20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wm20.m203964d(runnable, dd80VarM110960O, view);
                }
            });
        }
        final c4g0 c4g0VarSubscribe = act.duringCreated((C22306c) C7846b.m36420r().m36434q(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.rm20
            @Override // p149l.e30
            public final void call(Object obj) {
                wm20.m203968h(dd80VarM110960O, (roj0) obj);
            }
        }));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sm20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wm20.m203962b(c4g0VarSubscribe, e30Var, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        zch0.m218024a().m218033j(true, "fakeDialogExample");
        dd80VarM110960O.show();
        if (CoreModule.f17545c.f19639e0.m169506k8()) {
            return;
        }
        act.postDelayed(new Runnable() { // from class: l.tm20
            @Override // java.lang.Runnable
            public final void run() {
                C4737e0.m31949a().m31952c(true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static Runnable m203971k(final Act act) {
        return new Runnable() { // from class: l.um20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                C7846b.m36420r().m36441y(act2, myf.m157025E(act2));
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static Runnable m203972l(final Act act, final e30<Boolean> e30Var) {
        return new Runnable() { // from class: l.vm20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                C7846b.m36420r().m36424D(act2, myf.m157025E(act2), new wm20.C20893a(e30Var));
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static void m203973m(Act act) {
        m203974n(act, m203971k(act));
    }

    /* JADX INFO: renamed from: n */
    public static void m203974n(Act act, Runnable runnable) {
        m203975o(act, runnable, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m203975o(Act act, Runnable runnable, String str) {
        m203976p(act, runnable, str, "");
    }

    /* JADX INFO: renamed from: p */
    public static void m203976p(Act act, Runnable runnable, String str, String str2) {
        m203970j(act, runnable, str, null, str2);
    }
}
