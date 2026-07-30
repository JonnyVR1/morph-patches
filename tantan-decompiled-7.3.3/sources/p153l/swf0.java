package p153l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.card.SpeedUpCardAct;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class swf0 implements iam<yvf0> {

    /* JADX INFO: renamed from: a */
    public VImage f170942a;

    /* JADX INFO: renamed from: b */
    public VImage f170943b;

    /* JADX INFO: renamed from: c */
    public VLinear f170944c;

    /* JADX INFO: renamed from: d */
    public VText f170945d;

    /* JADX INFO: renamed from: e */
    public VText f170946e;

    /* JADX INFO: renamed from: f */
    public VRelative f170947f;

    /* JADX INFO: renamed from: g */
    public VText f170948g;

    /* JADX INFO: renamed from: h */
    public VText f170949h;

    /* JADX INFO: renamed from: i */
    public VFrame f170950i;

    /* JADX INFO: renamed from: j */
    public VText f170951j;

    /* JADX INFO: renamed from: k */
    public VText f170952k;

    /* JADX INFO: renamed from: l */
    public VText f170953l;

    /* JADX INFO: renamed from: m */
    public VImage f170954m;

    /* JADX INFO: renamed from: n */
    public SpeedUpCardAct f170955n;

    /* JADX INFO: renamed from: o */
    public yvf0 f170956o;

    /* JADX INFO: renamed from: p */
    public View f170957p;

    /* JADX INFO: renamed from: q */
    public Pair<String, Integer> f170958q = Pair.create("", 0);

    public swf0(SpeedUpCardAct speedUpCardAct) {
        this.f170955n = speedUpCardAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m188280A() {
        if (vnb.m201956p1() || this.f170947f.getBottom() <= this.f170944c.getTop()) {
            return;
        }
        this.f170947f.setScaleX(0.95f);
        this.f170947f.setScaleY(0.95f);
        bnl0.m105537U(this.f170944c, qa00.m175859d(40.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m188281B(View view) {
        this.f170955n.m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m188282C(View view) {
        m188311M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m188283E(View view) {
        i4g0.m138520r("e_propscard_buy", "p_propscard");
        m188312N(this.f170955n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m188284G(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m188285H(View view) {
        i4g0.m138520r("e_propscard_start", "p_propscard");
        act().progress(R$string.f18632L5, true);
        this.f170956o.m217496l0().subscribe(psd0.m173597H(new y20() { // from class: l.qwf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159887a.m188306F((uxj0) obj);
            }
        }, new y20() { // from class: l.rwf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165133a.m188284G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m188300r() {
        if (vnb.m201956p1()) {
            this.f170947f.setScaleX(0.85f);
            this.f170947f.setScaleY(0.85f);
            bnl0.m105537U(this.f170944c, qa00.m175859d(30.0f));
        }
        this.f170947f.post(new Runnable() { // from class: l.zvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f206213a.m188280A();
            }
        });
        this.f170948g.setTypeface(lyh0.m156283c(3), 1);
        this.f170949h.setTypeface(lyh0.m156283c(3), 1);
        this.f170946e.setTypeface(lyh0.m156283c(3), 1);
        this.f170945d.setTypeface(lyh0.m156283c(3), 1);
        this.f170952k.setTypeface(lyh0.m156283c(3), 1);
        this.f170951j.setTypeface(lyh0.m156283c(3), 1);
        this.f170953l.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f170942a, new View.OnClickListener() { // from class: l.jwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122916a.m188281B(view);
            }
        });
        bnl0.m105509E0(this.f170943b, new View.OnClickListener() { // from class: l.kwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129064a.m188282C(view);
            }
        });
        bnl0.m105509E0(this.f170945d, new View.OnClickListener() { // from class: l.lwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133810a.m188283E(view);
            }
        });
        bnl0.m105509E0(this.f170946e, new View.OnClickListener() { // from class: l.mwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139092a.m188285H(view);
            }
        });
        this.f170953l.setText(String.format("%s人正在使用该道具", Integer.valueOf((int) ((Math.random() * 20000.0d) + 30000.0d))));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m188301s(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).subCode == 4000101) {
            o1j0.m165636j("10秒内只能买一次哦，请稍后再试");
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m188305x(pej0 pej0Var, uxj0 uxj0Var) {
        o1j0.m165651y("购买成功");
        pej0Var.dismiss();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f170955n;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m188306F(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m188307I(View view, View view2, View view3, View view4) {
        this.f170958q = Pair.create(CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX1)), Integer.valueOf(CoreModule.f18264c.f20312H0.m155444h5()));
        view.setBackgroundResource(dbc0.f87589xr);
        view2.setBackgroundResource(dbc0.f87531w1);
        view3.setBackgroundResource(dbc0.f87531w1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m188308J(View view, View view2, View view3, View view4) {
        this.f170958q = Pair.create(CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX10)), Integer.valueOf(CoreModule.f18264c.f20312H0.m155443g5()));
        view.setBackgroundResource(dbc0.f87589xr);
        view2.setBackgroundResource(dbc0.f87531w1);
        view3.setBackgroundResource(dbc0.f87531w1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m188309K(View view, View view2, View view3, View view4) {
        this.f170958q = Pair.create(CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX20)), Integer.valueOf(CoreModule.f18264c.f20312H0.m155445i5()));
        view.setBackgroundResource(dbc0.f87589xr);
        view2.setBackgroundResource(dbc0.f87531w1);
        view3.setBackgroundResource(dbc0.f87531w1);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m188310L(final pej0 pej0Var, View view) {
        i4g0.m138520r("e_propscard_buy_confirm", "p_propscard_buy_popup");
        if (CoreModule.f18264c.f20312H0.m155435Y4() >= ((Integer) this.f170958q.second).intValue()) {
            this.f170956o.m217495k0((String) this.f170958q.first).subscribe(psd0.m173597H(new y20() { // from class: l.hwf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    swf0.m188305x(pej0Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.iwf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    swf0.m188301s((Throwable) obj);
                }
            }));
        } else {
            a5i0.m96095F1(act(), "p_propscard_buy,e_propscard_buy_confirm,click");
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m188311M() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_propscard_explain_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pf60.m172085a("tooltips_trigger_mode", Active.TYPE));
        final pej0 pej0Var = new pej0(this.f170955n);
        pej0Var.setContentView(kec0.f125925l2);
        View viewMo303g = pej0Var.getDelegate().mo303g(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo303g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo303g.setBackgroundColor(this.f170955n.getResources().getColor(R.color.transparent));
        bnl0.m105509E0(pej0Var.findViewById(adc0.f70485o5), new View.OnClickListener() { // from class: l.nwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pej0Var.cancel();
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.owf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pwf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        pej0Var.show();
    }

    /* JADX INFO: renamed from: N */
    public final void m188312N(Act act) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_propscard_buy_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pf60.m172085a("tooltips_trigger_mode", Active.TYPE));
        final pej0 pej0Var = new pej0(act);
        pej0Var.setContentView(kec0.f125908k2);
        View viewMo303g = pej0Var.getDelegate().mo303g(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo303g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo303g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        ((TextView) pej0Var.findViewById(adc0.f70560sc)).setTypeface(lyh0.m156283c(3), 1);
        ((TextView) pej0Var.findViewById(adc0.f70543rc)).setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(pej0Var.findViewById(adc0.f70526qc), new View.OnClickListener() { // from class: l.awf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pej0Var.cancel();
            }
        });
        final View viewFindViewById = pej0Var.findViewById(adc0.f70577tc);
        ((TextView) viewFindViewById.findViewById(adc0.f70219Y8)).setText("x1");
        ((TextView) viewFindViewById.findViewById(adc0.f69925H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f18264c.f20312H0.m155444h5())));
        final View viewFindViewById2 = pej0Var.findViewById(adc0.f70594uc);
        ((TextView) viewFindViewById2.findViewById(adc0.f70219Y8)).setText("x10");
        ((TextView) viewFindViewById2.findViewById(adc0.f69925H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f18264c.f20312H0.m155443g5())));
        final View viewFindViewById3 = pej0Var.findViewById(adc0.f70611vc);
        ((TextView) viewFindViewById3.findViewById(adc0.f70219Y8)).setText("x20");
        ((TextView) viewFindViewById3.findViewById(adc0.f69925H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f18264c.f20312H0.m155445i5())));
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.bwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78723a.m188307I(viewFindViewById, viewFindViewById2, viewFindViewById3, view);
            }
        });
        viewFindViewById.performClick();
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.cwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84118a.m188308J(viewFindViewById2, viewFindViewById, viewFindViewById3, view);
            }
        });
        bnl0.m105509E0(viewFindViewById3, new View.OnClickListener() { // from class: l.dwf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91016a.m188309K(viewFindViewById3, viewFindViewById, viewFindViewById2, view);
            }
        });
        bnl0.m105509E0(pej0Var.findViewById(adc0.f70543rc), new View.OnClickListener() { // from class: l.ewf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96153a.m188310L(pej0Var, view);
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.fwf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gwf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        pej0Var.show();
    }

    /* JADX INFO: renamed from: O */
    public void m188313O() {
        int iM51418S = C8772a.m51418S();
        i4g0.m138492A("e_propscard_number", "p_propscard", jyb.m147494Y("propscard_count", Integer.valueOf(iM51418S)));
        this.f170952k.setText(iM51418S > 99 ? "99+" : String.valueOf(iM51418S));
        bnl0.m105524M(this.f170946e, iM51418S > 0);
    }

    /* JADX INFO: renamed from: P */
    public void m188314P(boolean z) {
        VText vText = this.f170946e;
        if (z) {
            vText.setAlpha(0.6f);
            this.f170946e.setText("暂不使用");
        } else {
            vText.setAlpha(1.0f);
            this.f170946e.setText("开始使用");
        }
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f170955n;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f170957p = m188315y(layoutInflater, viewGroup);
        m188300r();
        return this.f170957p;
    }

    /* JADX INFO: renamed from: y */
    public View m188315y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return twf0.m193346b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yvf0 yvf0Var) {
        this.f170956o = yvf0Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
