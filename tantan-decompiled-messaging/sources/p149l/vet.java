package p149l;

import android.app.Dialog;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class vet {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m198221e(d30 d30Var, Dialog dialog, soj0 soj0Var) {
        d30Var.call();
        dialog.dismiss();
        h5j0.INSTANCE.m129404c("voice_anchor_call", "checkWithDialog");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m198228l(Dialog dialog, Throwable th) {
        gkh0.m126627j("live_sdk", "checkWithDialog_fail:" + th.getMessage());
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static C22306c<soj0> m198232p(final int i, @Nullable Act act, Object... objArr) {
        if (m198237u(i)) {
            return C22306c.just(soj0.f165695a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<hgt> it = hgt.INSTANCE.m130913T(i).iterator();
        while (it.hasNext()) {
            C22306c<hgt> c22306cM130910Q = hgt.INSTANCE.m130910Q(act, it.next(), objArr);
            if (c22306cM130910Q != null) {
                arrayList.add(c22306cM130910Q);
            }
        }
        return C22306c.merge(arrayList).map(new w9j() { // from class: l.oet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        }).takeUntil(new w9j() { // from class: l.pet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.INSTANCE.m130906M(i));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q */
    public static void m198233q(Act act, int i, int i2, final d30 d30Var) {
        if (m198237u(i)) {
            d30Var.call();
            h5j0.INSTANCE.m129404c("voice_anchor_call", "resCheckPassed");
        } else {
            final Dialog dialogProgress = act.progress(i2, true);
            dialogProgress.setCancelable(true);
            dialogProgress.setCanceledOnTouchOutside(false);
            m198232p(i, act, new Object[0]).subscribe(ffw.m121194e(new e30() { // from class: l.ket
                @Override // p149l.e30
                public final void call(Object obj) {
                    vet.m198221e(d30Var, dialogProgress, (soj0) obj);
                }
            }, new e30() { // from class: l.let
                @Override // p149l.e30
                public final void call(Object obj) {
                    vet.m198228l(dialogProgress, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<NetworkInfo> m198234r() {
        return ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.uet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!ConnectivityReceiver.m81284g());
            }
        }).flatMap(new w9j() { // from class: l.het
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.error(new RuntimeException("connect_loss"));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<Long> m198235s(final d30 d30Var, final int i) {
        return C22306c.interval(1L, TimeUnit.SECONDS).take(1).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.iet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!hgt.INSTANCE.m130906M(i));
            }
        }).doOnNext(new e30() { // from class: l.jet
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m198236t(final int i, Act act, final d30 d30Var, e30<Throwable> e30Var) {
        act.duringCreated(C22306c.merge(C22306c.merge(m198234r(), m198239w()).takeUntil(new w9j() { // from class: l.get
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.INSTANCE.m130906M(i));
            }
        }).materialize().filter(new w9j() { // from class: l.met
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.INSTANCE.m130906M(i));
            }
        }).dematerialize(), m198232p(i, act, new Object[0]))).onBackpressureLatest().subscribe(ffw.m121194e(new e30() { // from class: l.net
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, e30Var));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m198237u(int i) {
        return hgt.INSTANCE.m130906M(i);
    }

    /* JADX INFO: renamed from: v */
    public static void m198238v(Act act, AnchorStartData anchorStartData, final int i, d30 d30Var, final d30 d30Var2, e30<Throwable> e30Var) {
        hgt.INSTANCE.m130918Y(i);
        act.duringCreated(C22306c.merge(C22306c.merge(m198235s(d30Var, i), m198234r(), m198239w()).takeUntil(new w9j() { // from class: l.qet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.INSTANCE.m130906M(i));
            }
        }).materialize().filter(new w9j() { // from class: l.ret
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(hgt.INSTANCE.m130906M(i));
            }
        }).dematerialize(), m198232p(i, act, anchorStartData))).onBackpressureLatest().subscribe(ffw.m121194e(new e30() { // from class: l.set
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var2.call();
            }
        }, e30Var));
    }

    /* JADX INFO: renamed from: w */
    public static C22306c<Object> m198239w() {
        return C22306c.timer(3L, TimeUnit.MINUTES).take(1).flatMap(new w9j() { // from class: l.tet
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.error(new RuntimeException("time_out"));
            }
        });
    }
}
