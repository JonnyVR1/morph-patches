package p153l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.data.Evaluation;
import com.p051p1.mobile.putong.core.member.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class why {

    /* JADX INFO: renamed from: a */
    public static long f189323a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m206528a(x20 x20Var, l4g0 l4g0Var, DialogInterface dialogInterface) {
        x20Var.call();
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m206529b(Act act, Throwable th) {
        act.progressDismiss();
        o1j0.m165636j("支付失败，请重新操作");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m206531d(pej0 pej0Var, uxj0 uxj0Var) {
        f189323a = CoreModule.f18264c.f20312H0.m155435Y4();
        if (pej0Var.isShowing()) {
            ((TextView) pej0Var.findViewById(ddc0.f87889S)).setText(q8g0.m175796b0(String.format("余额：%s 探探币", Long.valueOf(f189323a)), jyb.m147507f0(f189323a + ""), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m206533f(Act act, pej0 pej0Var, y20 y20Var, Evaluation evaluation) {
        act.progressDismiss();
        pej0Var.m176562T();
        y20Var.call(evaluation.detailUrl);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m206534g(int i, final Act act, long j, String str, final pej0 pej0Var, final y20 y20Var, View view) {
        if (i > f189323a) {
            CoreModule.m30933P().m143405a().mo34632ye(act, new a30() { // from class: l.thy
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    CoreModule.f18264c.f20312H0.m155449k5().subscribe(psd0.m173597H(new y20() { // from class: l.uhy
                        @Override // p153l.y20
                        public final void call(Object obj4) {
                            why.m206531d(pej0Var, (uxj0) obj4);
                        }
                    }, new y20() { // from class: l.vhy
                        @Override // p153l.y20
                        public final void call(Object obj4) {
                            why.m206535h((Throwable) obj4);
                        }
                    }));
                }
            });
        } else {
            act.progress(R$string.f21329I);
            act.duringCreated(CoreModule.f18264c.f20403l1.m35349i3(j, str)).subscribe(psd0.m173597H(new y20() { // from class: l.rhy
                @Override // p153l.y20
                public final void call(Object obj) {
                    why.m206533f(act, pej0Var, y20Var, (Evaluation) obj);
                }
            }, new y20() { // from class: l.shy
                @Override // p153l.y20
                public final void call(Object obj) {
                    why.m206529b(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m206535h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m206536i(final Act act, final long j, final String str, final y20<String> y20Var, final x20 x20Var) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_knowmyself_purchase", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("test_id", Long.valueOf(j)));
        final pej0 pej0Var = new pej0(act);
        pej0Var.setContentView(pec0.f151989g);
        View viewMo303g = pej0Var.getDelegate().mo303g(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo303g);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewMo303g.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.ohy
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        pej0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.phy
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                why.m206528a(x20Var, l4g0VarM204399c, dialogInterface);
            }
        });
        final int iM35343k3 = C4900o.m35343k3(str);
        f189323a = CoreModule.f18264c.f20312H0.m155435Y4();
        ((TextView) pej0Var.findViewById(ddc0.f87887Q)).setText(iM35343k3 + "");
        ((TextView) pej0Var.findViewById(ddc0.f87889S)).setText(q8g0.m175796b0(String.format("余额：%s 探探币", Long.valueOf(f189323a)), jyb.m147507f0(f189323a + ""), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        bnl0.m105509E0(pej0Var.findViewById(ddc0.f87886P), new View.OnClickListener() { // from class: l.qhy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                why.m206534g(iM35343k3, act, j, str, pej0Var, y20Var, view);
            }
        });
        pej0Var.show();
    }
}
