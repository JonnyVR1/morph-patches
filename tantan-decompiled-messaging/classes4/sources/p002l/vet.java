package p002l;

import android.app.Dialog;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.e30;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.hgt;
import l.jo0;
import l.soj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vet {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23913e(d30 d30Var, Dialog dialog, soj0 soj0Var) {
        d30Var.call();
        dialog.dismiss();
        h5j0.INSTANCE.c("voice_anchor_call", "checkWithDialog");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23920l(Dialog dialog, Throwable th) {
        gkh0.j("live_sdk", "checkWithDialog_fail:" + th.getMessage());
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static c<soj0> m23924p(final int i, @Nullable Act act, Object... objArr) {
        if (m23929u(i)) {
            return c.just(soj0.a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hgt.Companion.T(i).iterator();
        while (it.hasNext()) {
            c cVarQ = hgt.Companion.Q(act, (hgt) it.next(), objArr);
            if (cVarQ != null) {
                arrayList.add(cVarQ);
            }
        }
        return c.merge(arrayList).map(new w9j() { // from class: l.oet
            public final Object call(Object obj) {
                return soj0.a;
            }
        }).takeUntil(new w9j() { // from class: l.pet
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.Companion.M(i));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: q */
    public static void m23925q(Act act, int i, int i2, final d30 d30Var) {
        if (m23929u(i)) {
            d30Var.call();
            h5j0.INSTANCE.c("voice_anchor_call", "resCheckPassed");
        } else {
            final Dialog dialogProgress = act.progress(i2, true);
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(false);
            m23924p(i, act, new Object[0]).subscribe(ffw.e(new e30() { // from class: l.ket
                public final void call(Object obj) {
                    vet.m23913e(d30Var, dialogProgress, (soj0) obj);
                }
            }, new e30() { // from class: l.let
                public final void call(Object obj) {
                    vet.m23920l(dialogProgress, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static c<NetworkInfo> m23926r() {
        return ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.uet
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.g());
            }
        }).flatMap(new w9j() { // from class: l.het
            public final Object call(Object obj) {
                return c.error(new RuntimeException("connect_loss"));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static c<Long> m23927s(final d30 d30Var, final int i) {
        return c.interval(1L, TimeUnit.SECONDS).take(1).observeOn(jo0.a()).filter(new w9j() { // from class: l.iet
            public final Object call(Object obj) {
                return Boolean.valueOf(!hgt.Companion.M(i));
            }
        }).doOnNext(new e30() { // from class: l.jet
            public final void call(Object obj) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m23928t(final int i, Act act, final d30 d30Var, e30<Throwable> e30Var) {
        act.duringCreated(c.merge(c.merge(m23926r(), m23931w()).takeUntil(new w9j() { // from class: l.get
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.Companion.M(i));
            }
        }).materialize().filter(new w9j() { // from class: l.met
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.Companion.M(i));
            }
        }).dematerialize(), m23924p(i, act, new Object[0]))).onBackpressureLatest().subscribe(ffw.e(new e30() { // from class: l.net
            public final void call(Object obj) {
                d30Var.call();
            }
        }, e30Var));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m23929u(int i) {
        return hgt.Companion.M(i);
    }

    /* JADX INFO: renamed from: v */
    public static void m23930v(Act act, AnchorStartData anchorStartData, final int i, d30 d30Var, final d30 d30Var2, e30<Throwable> e30Var) {
        hgt.Companion.Y(i);
        act.duringCreated(c.merge(c.merge(m23927s(d30Var, i), m23926r(), m23931w()).takeUntil(new w9j() { // from class: l.qet
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.Companion.M(i));
            }
        }).materialize().filter(new w9j() { // from class: l.ret
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.Companion.M(i));
            }
        }).dematerialize(), m23924p(i, act, anchorStartData))).onBackpressureLatest().subscribe(ffw.e(new e30() { // from class: l.set
            public final void call(Object obj) {
                d30Var2.call();
            }
        }, e30Var));
    }

    /* JADX INFO: renamed from: w */
    public static c<Object> m23931w() {
        return c.timer(3L, TimeUnit.MINUTES).take(1).flatMap(new w9j() { // from class: l.tet
            public final Object call(Object obj) {
                return c.error(new RuntimeException("time_out"));
            }
        });
    }
}
