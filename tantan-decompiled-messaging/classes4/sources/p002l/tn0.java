package p002l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.d7l0;
import l.e30;
import l.ffw;
import l.gkh0;
import l.hgt;
import l.jo0;
import l.lsi0;
import l.u0t;
import l.un0;
import l.w9j;
import l.ypv;
import l.z3g0;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tn0 {

    /* JADX INFO: renamed from: l.tn0$a */
    public static class C0836a {

        /* JADX INFO: renamed from: a */
        public Dialog f20310a;

        /* JADX INFO: renamed from: a */
        public void m23083a() {
            Dialog dialog = this.f20310a;
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m23084b(Dialog dialog) {
            this.f20310a = dialog;
        }

        /* JADX INFO: renamed from: c */
        public boolean m23085c() {
            Dialog dialog = this.f20310a;
            return dialog == null || dialog.isShowing();
        }

        /* JADX INFO: renamed from: d */
        public boolean m23086d() {
            Dialog dialog = this.f20310a;
            return dialog != null && dialog.isShowing();
        }

        /* JADX INFO: renamed from: e */
        public void m23087e() {
            Dialog dialog = this.f20310a;
            if (dialog == null) {
                return;
            }
            View viewFindViewById = dialog.getWindow().getDecorView().findViewById(g5c0.f11008Y3);
            if (this.f20310a.isShowing() && (viewFindViewById instanceof TextView)) {
                ((TextView) viewFindViewById).setText(String.format("%s %d%%", ypv.e.getString(R$string.f2990S2), Integer.valueOf(hgt.Companion.Z())));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23066b(int i, C0836a c0836a, Throwable th) {
        hgt.a aVar = hgt.Companion;
        if (!aVar.M(i)) {
            lsi0.w(R$string.f2806J9);
            gkh0.j(u0t.d, "check_error_type: " + i + ",reason:" + th.getMessage() + ",state:" + aVar.U(i));
        }
        c0836a.m23083a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m23067c(Notification notification) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23069e(C0836a c0836a, int i, long j, d30 d30Var) {
        c0836a.m23087e();
        if (hgt.Companion.M(i) && c0836a.m23085c()) {
            gkh0.j(u0t.d, "all_check_list_pass type_" + i + "_use:" + (System.currentTimeMillis() - j) + ", dialog show:" + c0836a.m23086d());
            d30Var.call();
            c0836a.m23083a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23071g(Act act, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.n(R$string.f3352j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            act.dialog().G0(ypv.e.getString(R$string.f2910O6)).u0(ypv.e.getString(R$string.f2664D)).z0();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23073i(d30 d30Var, DialogInterface dialogInterface) {
        if (d30Var != null) {
            d30Var.call();
        }
        gkh0.j(u0t.d, "wait_dialog_dismiss_when_process:" + hgt.Companion.Z());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m23074j(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.n(R$string.f3352j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            lsi0.j(ypv.e.getString(R$string.f2910O6));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m23075k(z3g0 z3g0Var) {
        z3g0Var.onNext(d7l0.INSTANCE);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: l */
    public static c<hgt> m23076l(final Act act) {
        return act == null ? LivingNormalApiProvider.m4558C3().doOnError(new e30() { // from class: l.nn0
            public final void call(Object obj) {
                tn0.m23074j((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.on0
            public final Object call(Object obj) {
                return un0.INSTANCE;
            }
        }) : act.duringCreated(LivingNormalApiProvider.m4558C3()).doOnError(new e30() { // from class: l.pn0
            public final void call(Object obj) {
                tn0.m23071g(act, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.qn0
            public final Object call(Object obj) {
                return un0.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static c<hgt> m23077m() {
        return c.create(new c.a() { // from class: l.rn0
            public final void call(Object obj) {
                LivingNormalApiProvider.m4613I4().materialize().take(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).doOnCompleted(new d30() { // from class: l.sn0
                    public final void call() {
                        tn0.m23075k(z3g0Var);
                    }
                }).subscribe(ffw.h(new e30() { // from class: l.jn0
                    public final void call(Object obj2) {
                        tn0.m23067c((Notification) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static Dialog m23078n(Act act, final d30 d30Var) {
        act.progressDismiss();
        Dialog dialogProgress = act.progress(ypv.e.getString(R$string.f2990S2));
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        gkh0.j(u0t.d, "anchor_start_live_wait_dialog_show");
        dialogProgress.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.mn0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                tn0.m23073i(d30Var, dialogInterface);
            }
        });
        return dialogProgress;
    }

    /* JADX INFO: renamed from: o */
    public static void m23079o(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m5048m2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m23080p(final Act act, AnchorStartData anchorStartData, final int i, final d30 d30Var, final d30 d30Var2) {
        act.progressDismiss();
        final C0836a c0836a = new C0836a();
        gkh0.j(u0t.d, "check_live_res_" + i);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        vet.m23930v(act, anchorStartData, i, new d30() { // from class: l.in0
            public final void call() {
                c0836a.m23084b(tn0.m23078n(act, d30Var2));
            }
        }, new d30() { // from class: l.kn0
            public final void call() {
                tn0.m23069e(c0836a, i, jCurrentTimeMillis, d30Var);
            }
        }, new e30() { // from class: l.ln0
            public final void call(Object obj) {
                tn0.m23066b(i, c0836a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static void m23081q(Act act) {
        m23082r(act, new AnchorStartData.a().k());
    }

    /* JADX INFO: renamed from: r */
    public static void m23082r(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m5049n2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }
}
