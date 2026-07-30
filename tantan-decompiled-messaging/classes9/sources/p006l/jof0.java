package p006l;

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
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.card.SpeedUpCardAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import l.cwf0;
import l.e30;
import l.eqh0;
import l.hmb;
import l.i0e;
import l.j760;
import l.kof0;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.roj0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jof0 implements s7m<pnf0> {

    /* JADX INFO: renamed from: a */
    public VImage f15293a;

    /* JADX INFO: renamed from: b */
    public VImage f15294b;

    /* JADX INFO: renamed from: c */
    public VLinear f15295c;

    /* JADX INFO: renamed from: d */
    public VText f15296d;

    /* JADX INFO: renamed from: e */
    public VText f15297e;

    /* JADX INFO: renamed from: f */
    public VRelative f15298f;

    /* JADX INFO: renamed from: g */
    public VText f15299g;

    /* JADX INFO: renamed from: h */
    public VText f15300h;

    /* JADX INFO: renamed from: i */
    public VFrame f15301i;

    /* JADX INFO: renamed from: j */
    public VText f15302j;

    /* JADX INFO: renamed from: k */
    public VText f15303k;

    /* JADX INFO: renamed from: l */
    public VText f15304l;

    /* JADX INFO: renamed from: m */
    public VImage f15305m;

    /* JADX INFO: renamed from: n */
    public SpeedUpCardAct f15306n;

    /* JADX INFO: renamed from: o */
    public pnf0 f15307o;

    /* JADX INFO: renamed from: p */
    public View f15308p;

    /* JADX INFO: renamed from: q */
    public Pair<String, Integer> f15309q = Pair.create("", 0);

    public jof0(SpeedUpCardAct speedUpCardAct) {
        this.f15306n = speedUpCardAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m17669A() {
        if (hmb.p1() || this.f15298f.getBottom() <= this.f15295c.getTop()) {
            return;
        }
        this.f15298f.setScaleX(0.95f);
        this.f15298f.setScaleY(0.95f);
        xdl0.U(this.f15295c, t100.d(40.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m17670B(View view) {
        this.f15306n.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m17671C(View view) {
        m17701M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m17672E(View view) {
        zvf0.r("e_propscard_buy", "p_propscard");
        m17702N(this.f15306n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m17673G(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m17674H(View view) {
        zvf0.r("e_propscard_start", "p_propscard");
        act().progress(R$string.f1831J5, true);
        this.f15307o.m21623l0().subscribe(mkd0.H(new e30() { // from class: l.hof0
            public final void call(Object obj) {
                this.f13989a.m17696F((roj0) obj);
            }
        }, new e30() { // from class: l.iof0
            public final void call(Object obj) {
                this.f14592a.m17673G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m17689r() {
        if (hmb.p1()) {
            this.f15298f.setScaleX(0.85f);
            this.f15298f.setScaleY(0.85f);
            xdl0.U(this.f15295c, t100.d(30.0f));
        }
        this.f15298f.post(new Runnable() { // from class: l.qnf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19943a.m17669A();
            }
        });
        this.f15299g.setTypeface(eqh0.c(3), 1);
        this.f15300h.setTypeface(eqh0.c(3), 1);
        this.f15297e.setTypeface(eqh0.c(3), 1);
        this.f15296d.setTypeface(eqh0.c(3), 1);
        this.f15303k.setTypeface(eqh0.c(3), 1);
        this.f15302j.setTypeface(eqh0.c(3), 1);
        this.f15304l.setTypeface(eqh0.c(3), 1);
        xdl0.E0(this.f15293a, new View.OnClickListener() { // from class: l.aof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8412a.m17670B(view);
            }
        });
        xdl0.E0(this.f15294b, new View.OnClickListener() { // from class: l.bof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9016a.m17671C(view);
            }
        });
        xdl0.E0(this.f15296d, new View.OnClickListener() { // from class: l.cof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9769a.m17672E(view);
            }
        });
        xdl0.E0(this.f15297e, new View.OnClickListener() { // from class: l.dof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10498a.m17674H(view);
            }
        });
        this.f15304l.setText(String.format("%s人正在使用该道具", Integer.valueOf((int) ((Math.random() * 20000.0d) + 30000.0d))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m17690s(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).subCode == 4000101) {
            lsi0.j("10秒内只能买一次哦，请稍后再试");
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m17694x(l5j0 l5j0Var, roj0 roj0Var) {
        lsi0.y("购买成功");
        l5j0Var.dismiss();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17695C0() {
        return this.f15306n;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m17696F(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m17697I(View view, View view2, View view3, View view4) {
        this.f15309q = Pair.create(CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("quickchatSpeedUpNumX1")), Integer.valueOf(CoreModule.f1534c.f3559H0.m27531h5()));
        view.setBackgroundResource(x2c0.f26001Jq);
        view2.setBackgroundResource(x2c0.f27172v1);
        view3.setBackgroundResource(x2c0.f27172v1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m17698J(View view, View view2, View view3, View view4) {
        this.f15309q = Pair.create(CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("quickchatSpeedUpNumX10")), Integer.valueOf(CoreModule.f1534c.f3559H0.m27530g5()));
        view.setBackgroundResource(x2c0.f26001Jq);
        view2.setBackgroundResource(x2c0.f27172v1);
        view3.setBackgroundResource(x2c0.f27172v1);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m17699K(View view, View view2, View view3, View view4) {
        this.f15309q = Pair.create(CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("quickchatSpeedUpNumX20")), Integer.valueOf(CoreModule.f1534c.f3559H0.m27532i5()));
        view.setBackgroundResource(x2c0.f26001Jq);
        view2.setBackgroundResource(x2c0.f27172v1);
        view3.setBackgroundResource(x2c0.f27172v1);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m17700L(final l5j0 l5j0Var, View view) {
        zvf0.r("e_propscard_buy_confirm", "p_propscard_buy_popup");
        if (CoreModule.f1534c.f3559H0.m27522Y4() >= ((Integer) this.f15309q.second).intValue()) {
            this.f15307o.m21622k0((String) this.f15309q.first).subscribe(mkd0.H(new e30() { // from class: l.ynf0
                public final void call(Object obj) {
                    jof0.m17694x(l5j0Var, (roj0) obj);
                }
            }, new e30() { // from class: l.znf0
                public final void call(Object obj) {
                    jof0.m17690s((Throwable) obj);
                }
            }));
        } else {
            swh0.m24241F1(act(), "p_propscard_buy,e_propscard_buy_confirm,click");
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m17701M() {
        final cwf0 cwf0VarC = i0e.c("p_propscard_explain_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{j760.a("tooltips_trigger_mode", "active")});
        final l5j0 l5j0Var = new l5j0(this.f15306n);
        l5j0Var.setContentView(f6c0.f12285l2);
        View viewG = l5j0Var.getDelegate().g(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewG);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewG.setBackgroundColor(this.f15306n.getResources().getColor(R.color.transparent));
        xdl0.E0(l5j0Var.findViewById(u4c0.f23108m5), new View.OnClickListener() { // from class: l.eof0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.cancel();
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.fof0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gof0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: N */
    public final void m17702N(Act act) {
        final cwf0 cwf0VarC = i0e.c("p_propscard_buy_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{j760.a("tooltips_trigger_mode", "active")});
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(f6c0.f12268k2);
        View viewG = l5j0Var.getDelegate().g(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewG);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewG.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        ((TextView) l5j0Var.findViewById(u4c0.f23183qc)).setTypeface(eqh0.c(3), 1);
        ((TextView) l5j0Var.findViewById(u4c0.f23166pc)).setTypeface(eqh0.c(3), 1);
        xdl0.E0(l5j0Var.findViewById(u4c0.f23149oc), new View.OnClickListener() { // from class: l.rnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.cancel();
            }
        });
        final View viewFindViewById = l5j0Var.findViewById(u4c0.f23200rc);
        ((TextView) viewFindViewById.findViewById(u4c0.f22844W8)).setText("x1");
        ((TextView) viewFindViewById.findViewById(u4c0.f22585H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f1534c.f3559H0.m27531h5())));
        final View viewFindViewById2 = l5j0Var.findViewById(u4c0.f23217sc);
        ((TextView) viewFindViewById2.findViewById(u4c0.f22844W8)).setText("x10");
        ((TextView) viewFindViewById2.findViewById(u4c0.f22585H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f1534c.f3559H0.m27530g5())));
        final View viewFindViewById3 = l5j0Var.findViewById(u4c0.f23234tc);
        ((TextView) viewFindViewById3.findViewById(u4c0.f22844W8)).setText("x20");
        ((TextView) viewFindViewById3.findViewById(u4c0.f22585H1)).setText(String.format("%s探探币", Integer.valueOf(CoreModule.f1534c.f3559H0.m27532i5())));
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.snf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21441a.m17697I(viewFindViewById, viewFindViewById2, viewFindViewById3, view);
            }
        });
        viewFindViewById.performClick();
        xdl0.E0(viewFindViewById2, new View.OnClickListener() { // from class: l.tnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22193a.m17698J(viewFindViewById2, viewFindViewById, viewFindViewById3, view);
            }
        });
        xdl0.E0(viewFindViewById3, new View.OnClickListener() { // from class: l.unf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23670a.m17699K(viewFindViewById3, viewFindViewById, viewFindViewById2, view);
            }
        });
        xdl0.E0(l5j0Var.findViewById(u4c0.f23166pc), new View.OnClickListener() { // from class: l.vnf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24391a.m17700L(l5j0Var, view);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wnf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xnf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: O */
    public void m17703O() {
        int iS = a.S();
        zvf0.A("e_propscard_number", "p_propscard", new j760[]{vwb.Y("propscard_count", Integer.valueOf(iS))});
        this.f15303k.setText(iS > 99 ? "99+" : String.valueOf(iS));
        xdl0.M(this.f15297e, iS > 0);
    }

    /* JADX INFO: renamed from: P */
    public void m17704P(boolean z) {
        VText vText = this.f15297e;
        if (z) {
            vText.setAlpha(0.6f);
            this.f15297e.setText("暂不使用");
        } else {
            vText.setAlpha(1.0f);
            this.f15297e.setText("开始使用");
        }
    }

    @Nullable
    public Act act() {
        return this.f15306n;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f15308p = m17706y(layoutInflater, viewGroup);
        m17689r();
        return this.f15308p;
    }

    /* JADX INFO: renamed from: y */
    public View m17706y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kof0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m17705i1(pnf0 pnf0Var) {
        this.f15307o = pnf0Var;
    }

    public void destroy() {
    }
}
