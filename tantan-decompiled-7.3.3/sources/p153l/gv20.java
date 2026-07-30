package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4888e0;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.settings.IntlPersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class gv20 {

    /* JADX INFO: renamed from: l.gv20$a */
    public class C17324a implements FakeHoldFragment.InterfaceC7995a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f106598a;

        public C17324a(y20 y20Var) {
            this.f106598a = y20Var;
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        /* JADX INFO: renamed from: a */
        public void mo37400a(ArrayList<Media> arrayList, String str) {
            this.f106598a.call(Boolean.TRUE);
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        public void onError() {
            this.f106598a.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m132467b(kcg0 kcg0Var, y20 y20Var, DialogInterface dialogInterface) {
        hlh0.m135741a().m135750j(false, "fakeDialogExample");
        psd0.m173633z(kcg0Var);
        fph0.m126684o();
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m132468c(y20 y20Var, jl80 jl80Var, View view) {
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
        i4g0.m138520r("e_fake_alert_popup_back_button", "p_fake_alert_popup_view");
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m132469d(Runnable runnable, jl80 jl80Var, View view) {
        runnable.run();
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
        fph0.m126682n();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m132472g(jl80 jl80Var, Act act, View view) {
        i4g0.m138520r("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
        PersonalDetailsAct.m56212X1(act, "alert");
        act.startActivity(IntlPersonalDetailsAct.INSTANCE.m56186a(act, "alert"));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m132473h(jl80 jl80Var, uxj0 uxj0Var) {
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m132474i(Act act, Runnable runnable, View view) {
        i4g0.m138520r("e_fake_alert_popup_example", "p_fake_alert_popup_view");
        ks90.m151153e(act, CoreModule.f18264c.f20381e0.m116600p9().gender, runnable, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m132475j(final Act act, final Runnable runnable, String str, final y20<Boolean> y20Var, String str2) {
        if ((act instanceof NewMainAct) && hlh0.m135741a().m135744d()) {
            return;
        }
        View viewInflate = act.getLayoutInflater().inflate(kec0.f125825f3, (ViewGroup) null);
        uqb0.f180374G.m127111J0((VDraweeView) viewInflate.findViewById(adc0.f70042O), CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle(), false);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70409je);
        TextView textView2 = (TextView) viewInflate.findViewById(adc0.f70061P1);
        bnl0.m105524M(viewInflate.findViewById(adc0.f70104Ra), false);
        viewInflate.findViewById(adc0.f70227Z0).setBackgroundResource(dbc0.f86616U);
        viewInflate.findViewById(adc0.f70211Y0).setBackgroundResource(dbc0.f86616U);
        if (CoreModule.f18264c.f20381e0.m116579k8()) {
            textView.setText(act.getString(R$string.f18290A4));
            textView2.setText(act.getString(R$string.f18321B4));
        } else {
            textView.setText(act.getText(R$string.f18383D4));
            textView2.setText(act.getString(R$string.f18352C4));
        }
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        fph0.m126685p(str);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70077Q0), new View.OnClickListener() { // from class: l.xu20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gv20.m132468c(y20Var, jl80VarM146020O, view);
            }
        });
        if (CoreModule.f18264c.f20381e0.m116579k8()) {
            View viewFindViewById = viewInflate.findViewById(adc0.f70227Z0);
            bnl0.m105524M(viewFindViewById, true);
            i4g0.m138526x("e_fake_alert_popup_age_change_button", "p_fake_alert_popup_view");
            bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.yu20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gv20.m132472g(jl80VarM146020O, act, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
            layoutParams.topMargin = qa00.m175859d(8.0f);
            viewFindViewById.setLayoutParams(layoutParams);
            bnl0.m105524M(viewInflate.findViewById(adc0.f70211Y0), false);
            bnl0.m105524M(viewInflate.findViewById(adc0.f70104Ra), false);
        } else {
            if (C4888e0.m32952a().m32957e() && !(act instanceof IntlTribeSwipeAct)) {
                return;
            }
            bnl0.m105509E0(viewInflate.findViewById(adc0.f70104Ra), new View.OnClickListener() { // from class: l.zu20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gv20.m132474i(act, runnable, view);
                }
            });
            bnl0.m105509E0(viewInflate.findViewById(adc0.f70211Y0), new View.OnClickListener() { // from class: l.av20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gv20.m132469d(runnable, jl80VarM146020O, view);
                }
            });
        }
        final kcg0 kcg0VarSubscribe = act.duringCreated((C22421c) C7997b.m37423r().m37437q(), false).subscribe(psd0.m173596G(new y20() { // from class: l.bv20
            @Override // p153l.y20
            public final void call(Object obj) {
                gv20.m132473h(jl80VarM146020O, (uxj0) obj);
            }
        }));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cv20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gv20.m132467b(kcg0VarSubscribe, y20Var, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        hlh0.m135741a().m135750j(true, "fakeDialogExample");
        jl80VarM146020O.show();
        if (CoreModule.f18264c.f20381e0.m116579k8()) {
            return;
        }
        act.postDelayed(new Runnable() { // from class: l.dv20
            @Override // java.lang.Runnable
            public final void run() {
                C4888e0.m32952a().m32955c(true);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: k */
    public static Runnable m132476k(final Act act) {
        return new Runnable() { // from class: l.ev20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                C7997b.m37423r().m37444y(act2, a0g.m95349E(act2));
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static Runnable m132477l(final Act act, final y20<Boolean> y20Var) {
        return new Runnable() { // from class: l.fv20
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                C7997b.m37423r().m37427D(act2, a0g.m95349E(act2), new gv20.C17324a(y20Var));
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static void m132478m(Act act) {
        m132479n(act, m132476k(act));
    }

    /* JADX INFO: renamed from: n */
    public static void m132479n(Act act, Runnable runnable) {
        m132480o(act, runnable, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m132480o(Act act, Runnable runnable, String str) {
        m132481p(act, runnable, str, "");
    }

    /* JADX INFO: renamed from: p */
    public static void m132481p(Act act, Runnable runnable, String str, String str2) {
        m132475j(act, runnable, str, null, str2);
    }
}
