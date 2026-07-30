package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAnchorCheckAct;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class pn0 {

    /* JADX INFO: renamed from: l.pn0$a */
    public static class C19406a {

        /* JADX INFO: renamed from: a */
        public Dialog f153244a;

        /* JADX INFO: renamed from: a */
        public void m172995a() {
            Dialog dialog = this.f153244a;
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m172996b(Dialog dialog) {
            this.f153244a = dialog;
        }

        /* JADX INFO: renamed from: c */
        public boolean m172997c() {
            Dialog dialog = this.f153244a;
            return dialog == null || dialog.isShowing();
        }

        /* JADX INFO: renamed from: d */
        public boolean m172998d() {
            Dialog dialog = this.f153244a;
            return dialog != null && dialog.isShowing();
        }

        /* JADX INFO: renamed from: e */
        public void m172999e() {
            Dialog dialog = this.f153244a;
            if (dialog == null) {
                return;
            }
            View viewFindViewById = dialog.getWindow().getDecorView().findViewById(mdc0.f136103Y3);
            if (this.f153244a.isShowing() && (viewFindViewById instanceof TextView)) {
                ((TextView) viewFindViewById).setText(String.format("%s %d%%", zrv.f205803e.getString(R$string.f47796S2), Integer.valueOf(iit.INSTANCE.m140140Z())));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m172978b(int i, C19406a c19406a, Throwable th) {
        iit.Companion companion = iit.INSTANCE;
        if (!companion.m140127M(i)) {
            o1j0.m165649w(R$string.f47612J9);
            nsh0.m164608j(v2t.f182114d, "check_error_type: " + i + ",reason:" + th.getMessage() + ",state:" + companion.m140135U(i));
        }
        c19406a.m172995a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m172979c(Notification notification) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m172981e(C19406a c19406a, int i, long j, x20 x20Var) {
        c19406a.m172999e();
        if (iit.INSTANCE.m140127M(i) && c19406a.m172997c()) {
            nsh0.m164608j(v2t.f182114d, "all_check_list_pass type_" + i + "_use:" + (System.currentTimeMillis() - j) + ", dialog show:" + c19406a.m172998d());
            x20Var.call();
            c19406a.m172995a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m172983g(Act act, Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165640n(R$string.f48158j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            act.dialog().m21506G0(zrv.f205803e.getString(R$string.f47716O6)).m21557u0(zrv.f205803e.getString(R$string.f47470D)).m21567z0();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m172985i(x20 x20Var, DialogInterface dialogInterface) {
        if (x20Var != null) {
            x20Var.call();
        }
        nsh0.m164608j(v2t.f182114d, "wait_dialog_dismiss_when_process:" + iit.INSTANCE.m140140Z());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m172986j(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165640n(R$string.f48158j);
        } else if (((TantanException.Client.CoreService) th).code == 41026) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f47716O6));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m172987k(gcg0 gcg0Var) {
        gcg0Var.onNext(hgl0.INSTANCE);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<iit> m172988l(final Act act) {
        return act == null ? LivingNormalApiProvider.m72375C3().doOnError(new y20() { // from class: l.jn0
            @Override // p153l.y20
            public final void call(Object obj) {
                pn0.m172986j((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.kn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qn0.INSTANCE;
            }
        }) : act.duringCreated(LivingNormalApiProvider.m72375C3()).doOnError(new y20() { // from class: l.ln0
            @Override // p153l.y20
            public final void call(Object obj) {
                pn0.m172983g(act, (Throwable) obj);
            }
        }).map(new qcj() { // from class: l.mn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qn0.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<iit> m172989m() {
        return C22421c.create(new C22421c.a() { // from class: l.nn0
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72430I4().materialize().take(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).doOnCompleted(new x20() { // from class: l.on0
                    @Override // p153l.x20
                    public final void call() {
                        pn0.m172987k(gcg0Var);
                    }
                }).subscribe(dhw.m115829h(new y20() { // from class: l.fn0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        pn0.m172979c((Notification) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static Dialog m172990n(Act act, final x20 x20Var) {
        act.progressDismiss();
        Dialog dialogProgress = act.progress(zrv.f205803e.getString(R$string.f47796S2));
        dialogProgress.setCancelable(true);
        dialogProgress.setCanceledOnTouchOutside(true);
        nsh0.m164608j(v2t.f182114d, "anchor_start_live_wait_dialog_show");
        dialogProgress.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.in0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                pn0.m172985i(x20Var, dialogInterface);
            }
        });
        return dialogProgress;
    }

    /* JADX INFO: renamed from: o */
    public static void m172991o(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m72865n2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m172992p(final Act act, AnchorStartData anchorStartData, final int i, final x20 x20Var, final x20 x20Var2) {
        act.progressDismiss();
        final C19406a c19406a = new C19406a();
        nsh0.m164608j(v2t.f182114d, "check_live_res_" + i);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        wgt.m206255v(act, anchorStartData, i, new x20() { // from class: l.en0
            @Override // p153l.x20
            public final void call() {
                c19406a.m172996b(pn0.m172990n(act, x20Var2));
            }
        }, new x20() { // from class: l.gn0
            @Override // p153l.x20
            public final void call() {
                pn0.m172981e(c19406a, i, jCurrentTimeMillis, x20Var);
            }
        }, new y20() { // from class: l.hn0
            @Override // p153l.y20
            public final void call(Object obj) {
                pn0.m172978b(i, c19406a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static void m172993q(Act act) {
        m172994r(act, new AnchorStartData.C11592a().m68743k());
    }

    /* JADX INFO: renamed from: r */
    public static void m172994r(Act act, AnchorStartData anchorStartData) {
        act.startActivity(LiveAnchorCheckAct.m72866o2(act, anchorStartData));
        act.overridePendingTransition(0, 0);
    }
}
