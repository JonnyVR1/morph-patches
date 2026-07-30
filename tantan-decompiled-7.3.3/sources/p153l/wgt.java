package p153l;

import android.app.Dialog;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class wgt {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m206238e(x20 x20Var, Dialog dialog, vxj0 vxj0Var) {
        x20Var.call();
        dialog.dismiss();
        lej0.INSTANCE.m153909c("voice_anchor_call", "checkWithDialog");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m206245l(Dialog dialog, Throwable th) {
        nsh0.m164608j("live_sdk", "checkWithDialog_fail:" + th.getMessage());
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static C22421c<vxj0> m206249p(final int i, @Nullable Act act, Object... objArr) {
        if (m206254u(i)) {
            return C22421c.just(vxj0.f186265a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<iit> it = iit.INSTANCE.m140134T(i).iterator();
        while (it.hasNext()) {
            C22421c<iit> c22421cM140131Q = iit.INSTANCE.m140131Q(act, it.next(), objArr);
            if (c22421cM140131Q != null) {
                arrayList.add(c22421cM140131Q);
            }
        }
        return C22421c.merge(arrayList).map(new qcj() { // from class: l.pgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        }).takeUntil(new qcj() { // from class: l.qgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(iit.INSTANCE.m140127M(i));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q */
    public static void m206250q(Act act, int i, int i2, final x20 x20Var) {
        if (m206254u(i)) {
            x20Var.call();
            lej0.INSTANCE.m153909c("voice_anchor_call", "resCheckPassed");
        } else {
            final Dialog dialogProgress = act.progress(i2, true);
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(false);
            m206249p(i, act, new Object[0]).subscribe(dhw.m115826e(new y20() { // from class: l.lgt
                @Override // p153l.y20
                public final void call(Object obj) {
                    wgt.m206238e(x20Var, dialogProgress, (vxj0) obj);
                }
            }, new y20() { // from class: l.mgt
                @Override // p153l.y20
                public final void call(Object obj) {
                    wgt.m206245l(dialogProgress, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<NetworkInfo> m206251r() {
        return ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.vgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.m82467g());
            }
        }).flatMap(new qcj() { // from class: l.igt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.error(new RuntimeException("connect_loss"));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<Long> m206252s(final x20 x20Var, final int i) {
        return C22421c.interval(1L, TimeUnit.SECONDS).take(1).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.jgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!iit.INSTANCE.m140127M(i));
            }
        }).doOnNext(new y20() { // from class: l.kgt
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m206253t(final int i, Act act, final x20 x20Var, y20<Throwable> y20Var) {
        act.duringCreated(C22421c.merge(C22421c.merge(m206251r(), m206256w()).takeUntil(new qcj() { // from class: l.hgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(iit.INSTANCE.m140127M(i));
            }
        }).materialize().filter(new qcj() { // from class: l.ngt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(iit.INSTANCE.m140127M(i));
            }
        }).dematerialize(), m206249p(i, act, new Object[0]))).onBackpressureLatest().subscribe(dhw.m115826e(new y20() { // from class: l.ogt
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, y20Var));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m206254u(int i) {
        return iit.INSTANCE.m140127M(i);
    }

    /* JADX INFO: renamed from: v */
    public static void m206255v(Act act, AnchorStartData anchorStartData, final int i, x20 x20Var, final x20 x20Var2, y20<Throwable> y20Var) {
        iit.INSTANCE.m140139Y(i);
        act.duringCreated(C22421c.merge(C22421c.merge(m206252s(x20Var, i), m206251r(), m206256w()).takeUntil(new qcj() { // from class: l.rgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(iit.INSTANCE.m140127M(i));
            }
        }).materialize().filter(new qcj() { // from class: l.sgt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(iit.INSTANCE.m140127M(i));
            }
        }).dematerialize(), m206249p(i, act, anchorStartData))).onBackpressureLatest().subscribe(dhw.m115826e(new y20() { // from class: l.tgt
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var2.call();
            }
        }, y20Var));
    }

    /* JADX INFO: renamed from: w */
    public static C22421c<Object> m206256w() {
        return C22421c.timer(3L, TimeUnit.MINUTES).take(1).flatMap(new qcj() { // from class: l.ugt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.error(new RuntimeException("time_out"));
            }
        });
    }
}
