package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.card.SpeedUpCardAct;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jof0 implements s7m<pnf0> {

    /* JADX INFO: renamed from: a */
    public VImage f118956a;

    /* JADX INFO: renamed from: b */
    public VImage f118957b;

    /* JADX INFO: renamed from: c */
    public VLinear f118958c;

    /* JADX INFO: renamed from: d */
    public VText f118959d;

    /* JADX INFO: renamed from: e */
    public VText f118960e;

    /* JADX INFO: renamed from: f */
    public VRelative f118961f;

    /* JADX INFO: renamed from: g */
    public VText f118962g;

    /* JADX INFO: renamed from: h */
    public VText f118963h;

    /* JADX INFO: renamed from: i */
    public VFrame f118964i;

    /* JADX INFO: renamed from: j */
    public VText f118965j;

    /* JADX INFO: renamed from: k */
    public VText f118966k;

    /* JADX INFO: renamed from: l */
    public VText f118967l;

    /* JADX INFO: renamed from: m */
    public VImage f118968m;

    /* JADX INFO: renamed from: n */
    public SpeedUpCardAct f118969n;

    /* JADX INFO: renamed from: o */
    public pnf0 f118970o;

    /* JADX INFO: renamed from: p */
    public View f118971p;

    /* JADX INFO: renamed from: q */
    public Pair<String, Integer> f118972q = Pair.create("", 0);

    public jof0(SpeedUpCardAct speedUpCardAct) {
        this.f118969n = speedUpCardAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m142457A() {
        if (hmb.m131711p1() || this.f118961f.getBottom() <= this.f118958c.getTop()) {
            return;
        }
        this.f118961f.setScaleX(0.95f);
        this.f118961f.setScaleY(0.95f);
        xdl0.m208357U(this.f118958c, t100.m186890d(40.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m142458B(View view) {
        this.f118969n.m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m142459C(View view) {
        m142488M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m142460E(View view) {
        zvf0.m220396r("e_propscard_buy", "p_propscard");
        m142489N(this.f118969n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m142461G(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m142462H(View view) {
        zvf0.m220396r("e_propscard_start", "p_propscard");
        act().progress(R$string.f17842J5, true);
        this.f118970o.m170414l0().subscribe(mkd0.m154956H(new e30() { // from class: l.hof0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108822a.m142483F((roj0) obj);
            }
        }, new e30() { // from class: l.iof0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114157a.m142461G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m142477r() {
        if (hmb.m131711p1()) {
            this.f118961f.setScaleX(0.85f);
            this.f118961f.setScaleY(0.85f);
            xdl0.m208357U(this.f118958c, t100.m186890d(30.0f));
        }
        this.f118961f.post(new Runnable() { // from class: l.qnf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155432a.m142457A();
            }
        });
        this.f118962g.setTypeface(eqh0.m117752c(3), 1);
        this.f118963h.setTypeface(eqh0.m117752c(3), 1);
        this.f118960e.setTypeface(eqh0.m117752c(3), 1);
        this.f118959d.setTypeface(eqh0.m117752c(3), 1);
        this.f118966k.setTypeface(eqh0.m117752c(3), 1);
        this.f118965j.setTypeface(eqh0.m117752c(3), 1);
        this.f118967l.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f118956a, new View.OnClickListener() { // from class: l.aof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70859a.m142458B(view);
            }
        });
        xdl0.m208329E0(this.f118957b, new View.OnClickListener() { // from class: l.bof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76512a.m142459C(view);
            }
        });
        xdl0.m208329E0(this.f118959d, new View.OnClickListener() { // from class: l.cof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81836a.m142460E(view);
            }
        });
        xdl0.m208329E0(this.f118960e, new View.OnClickListener() { // from class: l.dof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87166a.m142462H(view);
            }
        });
        this.f118967l.setText(String.format("%s人正在使用该道具", Integer.valueOf((int) ((Math.random() * 20000.0d) + 30000.0d))));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m142478s(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).subCode == 4000101) {
            lsi0.m151580j("10秒内只能买一次哦，请稍后再试");
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m142482x(l5j0 l5j0Var, roj0 roj0Var) {
        lsi0.m151595y("购买成功");
        l5j0Var.dismiss();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f118969n;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m142483F(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m142484I(View view, View view2, View view3, View view4) {
        this.f118972q = Pair.create(CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX1)), Integer.valueOf(CoreModule.f17545c.f19570H0.m210356h5()));
        view.setBackgroundResource(x2c0.f189465Jq);
        view2.setBackgroundResource(x2c0.f190636v1);
        view3.setBackgroundResource(x2c0.f190636v1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m142485J(View view, View view2, View view3, View view4) {
        this.f118972q = Pair.create(CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX10)), Integer.valueOf(CoreModule.f17545c.f19570H0.m210355g5()));
        view.setBackgroundResource(x2c0.f189465Jq);
        view2.setBackgroundResource(x2c0.f190636v1);
        view3.setBackgroundResource(x2c0.f190636v1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m142486K(View view, View view2, View view3, View view4) {
        this.f118972q = Pair.create(CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNumX20)), Integer.valueOf(CoreModule.f17545c.f19570H0.m210357i5()));
        view.setBackgroundResource(x2c0.f189465Jq);
        view2.setBackgroundResource(x2c0.f190636v1);
        view3.setBackgroundResource(x2c0.f190636v1);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m142487L(final l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_propscard_buy_confirm", "p_propscard_buy_popup");
        if (CoreModule.f17545c.f19570H0.m210347Y4() >= ((Integer) this.f118972q.second).intValue()) {
            this.f118970o.m170413k0((String) this.f118972q.first).subscribe(mkd0.m154956H(new e30() { // from class: l.ynf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    jof0.m142482x(l5j0Var, (roj0) obj);
                }
            }, new e30() { // from class: l.znf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    jof0.m142478s((Throwable) obj);
                }
            }));
        } else {
            swh0.m186190F1(act(), "p_propscard_buy,e_propscard_buy_confirm,click");
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m142488M() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_propscard_explain_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(j760.m140076a("tooltips_trigger_mode", Active.TYPE));
        final l5j0 l5j0Var = new l5j0(this.f118969n);
        l5j0Var.setContentView(f6c0.f95871l2);
        View viewMo302g = l5j0Var.getDelegate().mo302g(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo302g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo302g.setBackgroundColor(this.f118969n.getResources().getColor(R.color.transparent));
        xdl0.m208329E0(l5j0Var.findViewById(u4c0.f174360m5), new View.OnClickListener() { // from class: l.eof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.cancel();
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.fof0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gof0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: N */
    public final void m142489N(Act act) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_propscard_buy_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(j760.m140076a("tooltips_trigger_mode", Active.TYPE));
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(f6c0.f95854k2);
        View viewMo302g = l5j0Var.getDelegate().mo302g(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo302g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo302g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        ((TextView) l5j0Var.findViewById(u4c0.f174435qc)).setTypeface(eqh0.m117752c(3), 1);
        ((TextView) l5j0Var.findViewById(u4c0.f174418pc)).setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(l5j0Var.findViewById(u4c0.f174401oc), new View.OnClickListener() { // from class: l.rnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.cancel();
            }
        });
        final View viewFindViewById = l5j0Var.findViewById(u4c0.f174452rc);
        ((TextView) viewFindViewById.findViewById(u4c0.f174096W8)).setText("x1");
        ((TextView) viewFindViewById.findViewById(u4c0.f173837H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f17545c.f19570H0.m210356h5())));
        final View viewFindViewById2 = l5j0Var.findViewById(u4c0.f174469sc);
        ((TextView) viewFindViewById2.findViewById(u4c0.f174096W8)).setText("x10");
        ((TextView) viewFindViewById2.findViewById(u4c0.f173837H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f17545c.f19570H0.m210355g5())));
        final View viewFindViewById3 = l5j0Var.findViewById(u4c0.f174486tc);
        ((TextView) viewFindViewById3.findViewById(u4c0.f174096W8)).setText("x20");
        ((TextView) viewFindViewById3.findViewById(u4c0.f173837H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f17545c.f19570H0.m210357i5())));
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.snf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165447a.m142484I(viewFindViewById, viewFindViewById2, viewFindViewById3, view);
            }
        });
        viewFindViewById.performClick();
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.tnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171227a.m142485J(viewFindViewById2, viewFindViewById, viewFindViewById3, view);
            }
        });
        xdl0.m208329E0(viewFindViewById3, new View.OnClickListener() { // from class: l.unf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177361a.m142486K(viewFindViewById3, viewFindViewById, viewFindViewById2, view);
            }
        });
        xdl0.m208329E0(l5j0Var.findViewById(u4c0.f174418pc), new View.OnClickListener() { // from class: l.vnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182241a.m142487L(l5j0Var, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wnf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xnf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: O */
    public void m142490O() {
        int iM50235S = C8609a.m50235S();
        zvf0.m220368A("e_propscard_number", "p_propscard", vwb.m200311Y("propscard_count", Integer.valueOf(iM50235S)));
        this.f118966k.setText(iM50235S > 99 ? "99+" : String.valueOf(iM50235S));
        xdl0.m208344M(this.f118960e, iM50235S > 0);
    }

    /* JADX INFO: renamed from: P */
    public void m142491P(boolean z) {
        VText vText = this.f118960e;
        if (z) {
            vText.setAlpha(0.6f);
            this.f118960e.setText("暂不使用");
        } else {
            vText.setAlpha(1.0f);
            this.f118960e.setText("开始使用");
        }
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f118969n;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f118971p = m142492y(layoutInflater, viewGroup);
        m142477r();
        return this.f118971p;
    }

    /* JADX INFO: renamed from: y */
    public View m142492y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kof0.m146705b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pnf0 pnf0Var) {
        this.f118970o = pnf0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
