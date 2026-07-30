package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class tn0 {

    /* JADX INFO: renamed from: l.tn0$a */
    public static class C20215a {

        /* JADX INFO: renamed from: a */
        public Dialog f171200a;

        /* JADX INFO: renamed from: a */
        public void m189751a() {
            Dialog dialog = this.f171200a;
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m189752b(Dialog dialog) {
            this.f171200a = dialog;
        }

        /* JADX INFO: renamed from: c */
        public boolean m189753c() {
            Dialog dialog = this.f171200a;
            return dialog == null || dialog.isShowing();
        }

        /* JADX INFO: renamed from: d */
        public boolean m189754d() {
            Dialog dialog = this.f171200a;
            return dialog != null && dialog.isShowing();
        }

        /* JADX INFO: renamed from: e */
        public void m189755e() {
            Dialog dialog = this.f171200a;
            if (dialog == null) {
                return;
            }
            View viewFindViewById = dialog.getWindow().getDecorView().findViewById(g5c0.f100858Y3);
            if (this.f171200a.isShowing() && (viewFindViewById instanceof TextView)) {
                ((TextView) viewFindViewById).setText(String.format("%s %d%%", ypv.f199497e.getString(R$string.f46948S2), Integer.valueOf(hgt.INSTANCE.m130919Z())));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m189734b(int i, C20215a c20215a, Throwable th) {
        hgt.Companion companion = hgt.INSTANCE;
        if (!companion.m130906M(i)) {
            lsi0.m151593w(R$string.f46764J9);
            gkh0.m126627j(u0t.f172945d, "check_error_type: " + i + ",reason:" + th.getMessage() + ",state:" + companion.m130914U(i));
        }
        c20215a.m189751a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m189735c(Notification notification) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m189737e(C20215a c20215a, int i, long j, d30 d30Var) {
        c20215a.m189755e();
        if (hgt.INSTANCE.m130906M(i) && c20215a.m189753c()) {
            gkh0.m126627j(u0t.f172945d, "all_check_list_pass type_" + i + "_use:" + (System.currentTimeMillis() - j) + ", dialog show:" + c20215a.m189754d());
            d30Var.call();
            c20215a.m189751a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m189739g(Act act, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151584n(R$string.f47310j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            act.dialog().m20507G0(ypv.f199497e.getString(R$string.f46868O6)).m20558u0(ypv.f199497e.getString(R$string.f46622D)).m20568z0();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m189741i(d30 d30Var, DialogInterface dialogInterface) {
        if (d30Var != null) {
            d30Var.call();
        }
        gkh0.m126627j(u0t.f172945d, "wait_dialog_dismiss_when_process:" + hgt.INSTANCE.m130919Z());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m189742j(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151584n(R$string.f47310j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f46868O6));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m189743k(z3g0 z3g0Var) {
        z3g0Var.onNext(d7l0.INSTANCE);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<hgt> m189744l(final Act act) {
        return act == null ? LivingNormalApiProvider.m71192C3().doOnError(new e30() { // from class: l.nn0
            @Override // p149l.e30
            public final void call(Object obj) {
                tn0.m189742j((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.on0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return un0.INSTANCE;
            }
        }) : act.duringCreated(LivingNormalApiProvider.m71192C3()).doOnError(new e30() { // from class: l.pn0
            @Override // p149l.e30
            public final void call(Object obj) {
                tn0.m189739g(act, (Throwable) obj);
            }
        }).map(new w9j() { // from class: l.qn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return un0.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<hgt> m189745m() {
        return C22306c.create(new C22306c.a() { // from class: l.rn0
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71247I4().materialize().take(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).doOnCompleted(new d30() { // from class: l.sn0
                    @Override // p149l.d30
                    public final void call() {
                        tn0.m189743k(z3g0Var);
                    }
                }).subscribe(ffw.m121197h(new e30() { // from class: l.jn0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        tn0.m189735c((Notification) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static Dialog m189746n(Act act, final d30 d30Var) {
        act.progressDismiss();
        Dialog dialogProgress = act.progress(ypv.f199497e.getString(R$string.f46948S2));
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        gkh0.m126627j(u0t.f172945d, "anchor_start_live_wait_dialog_show");
        dialogProgress.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.mn0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                tn0.m189741i(d30Var, dialogInterface);
            }
        });
        return dialogProgress;
    }

    /* JADX INFO: renamed from: o */
    public static void m189747o(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m71682m2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m189748p(final Act act, AnchorStartData anchorStartData, final int i, final d30 d30Var, final d30 d30Var2) {
        act.progressDismiss();
        final C20215a c20215a = new C20215a();
        gkh0.m126627j(u0t.f172945d, "check_live_res_" + i);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        vet.m198238v(act, anchorStartData, i, new d30() { // from class: l.in0
            @Override // p149l.d30
            public final void call() {
                c20215a.m189752b(tn0.m189746n(act, d30Var2));
            }
        }, new d30() { // from class: l.kn0
            @Override // p149l.d30
            public final void call() {
                tn0.m189737e(c20215a, i, jCurrentTimeMillis, d30Var);
            }
        }, new e30() { // from class: l.ln0
            @Override // p149l.e30
            public final void call(Object obj) {
                tn0.m189734b(i, c20215a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static void m189749q(Act act) {
        m189750r(act, new AnchorStartData.C11429a().m67560k());
    }

    /* JADX INFO: renamed from: r */
    public static void m189750r(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m71683n2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }
}
