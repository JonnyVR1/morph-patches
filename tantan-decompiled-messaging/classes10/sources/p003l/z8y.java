package p003l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.Evaluation;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import l.cwf0;
import l.d30;
import l.e30;
import l.g30;
import l.i0e;
import l.i0g0;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.roj0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z8y {

    /* JADX INFO: renamed from: a */
    public static long f9205a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11364a(d30 d30Var, cwf0 cwf0Var, DialogInterface dialogInterface) {
        d30Var.call();
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11365b(Act act, Throwable th) {
        act.progressDismiss();
        lsi0.j("支付失败，请重新操作");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11367d(l5j0 l5j0Var, roj0 roj0Var) {
        f9205a = CoreModule.c.H0.Y4();
        if (l5j0Var.isShowing()) {
            ((TextView) l5j0Var.findViewById(x4c0.f8325S)).setText(i0g0.b0(String.format("余额：%s 探探币", Long.valueOf(f9205a)), vwb.f0(new String[]{f9205a + ""}), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m11369f(Act act, l5j0 l5j0Var, e30 e30Var, Evaluation evaluation) {
        act.progressDismiss();
        l5j0Var.dismiss();
        e30Var.call(evaluation.detailUrl);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m11370g(int i, final Act act, long j, String str, final l5j0 l5j0Var, final e30 e30Var, View view) {
        if (i > f9205a) {
            CoreModule.P().a().ye(act, new g30() { // from class: l.w8y
                /* JADX INFO: renamed from: a */
                public final void m10455a(Object obj, Object obj2, Object obj3) {
                    CoreModule.c.H0.k5().subscribe(mkd0.H(new e30() { // from class: l.x8y
                        public final void call(Object obj4) {
                            z8y.m11367d(l5j0Var, (roj0) obj4);
                        }
                    }, new e30() { // from class: l.y8y
                        public final void call(Object obj4) {
                            z8y.m11371h((Throwable) obj4);
                        }
                    }));
                }
            });
        } else {
            act.progress(R$string.f249I);
            act.duringCreated(CoreModule.c.l1.i3(j, str)).subscribe(mkd0.H(new e30() { // from class: l.u8y
                public final void call(Object obj) {
                    z8y.m11369f(act, l5j0Var, e30Var, (Evaluation) obj);
                }
            }, new e30() { // from class: l.v8y
                public final void call(Object obj) {
                    z8y.m11365b(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m11371h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m11372i(final Act act, final long j, final String str, final e30<String> e30Var, final d30 d30Var) {
        final cwf0 cwf0VarC = i0e.c("p_knowmyself_purchase", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("test_id", Long.valueOf(j))});
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setContentView(k6c0.f5544g);
        View viewG = l5j0Var.getDelegate().g(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewG);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        viewG.setBackgroundColor(act.getResources().getColor(R.color.transparent));
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.r8y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        l5j0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.s8y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                z8y.m11364a(d30Var, cwf0VarC, dialogInterface);
            }
        });
        final int iK3 = o.k3(str);
        f9205a = CoreModule.c.H0.Y4();
        ((TextView) l5j0Var.findViewById(x4c0.f8323Q)).setText(iK3 + "");
        ((TextView) l5j0Var.findViewById(x4c0.f8325S)).setText(i0g0.b0(String.format("余额：%s 探探币", Long.valueOf(f9205a)), vwb.f0(new String[]{f9205a + ""}), Color.parseColor("#e6000000"), Typeface.create("sans-serif", 1)));
        xdl0.E0(l5j0Var.findViewById(x4c0.f8322P), new View.OnClickListener() { // from class: l.t8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z8y.m11370g(iK3, act, j, str, l5j0Var, e30Var, view);
            }
        });
        l5j0Var.show();
    }
}
