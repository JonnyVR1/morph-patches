package p009l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.l2;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.rx0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class eyc0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m14157a() {
        if (qib0.Q == null) {
            qib0.Q = new l2();
        }
        if (m14166j()) {
            qib0.Q.a0().take(1500L, TimeUnit.MILLISECONDS).toBlocking().c((Object) null);
        } else if (TantanApp.e.b() != null) {
            qib0.Q.U();
        } else {
            qib0.Q.T();
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14159c(Activity activity, AuthData authData, HashMap map) {
        try {
            m14165i(activity, map);
        } catch (Exception unused) {
        } finally {
            TantanApp.e.l(authData);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14160d(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m14163g(Activity activity, roj0 roj0Var) {
        activity.startActivity(SplashProxyAct.m10434l(App.e));
        activity.finish();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14164h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m14165i(Activity activity, HashMap<Integer, ArrayList<Act.r>> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator<ArrayList<Act.r>> it = map.values().iterator();
        while (it.hasNext()) {
            for (Act.r rVar : it.next()) {
                if (NullChecker.a(rVar.a.get()) && rVar.a.get() != activity && (rVar.a.get() instanceof Act)) {
                    ((Act) rVar.a.get()).finishWithoutCustomAnimation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14166j() {
        return TantanApp.e.b() != null && ((Boolean) TantanApp.d.b()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m14167k(@NonNull final Activity activity, final AuthData authData) {
        qib0.Y0(true, (Class) null, false, true, false).map(new w9j() { // from class: l.zxc0
            public final Object call(Object obj) {
                return Act.globalLifeCycle_();
            }
        }).doOnNext(new e30() { // from class: l.ayc0
            public final void call(Object obj) {
                eyc0.m14159c(activity, authData, (HashMap) obj);
            }
        }).flatMap(new w9j() { // from class: l.byc0
            public final Object call(Object obj) {
                return qib0.f0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.cyc0
            public final void call(Object obj) {
                eyc0.m14163g(activity, (roj0) obj);
            }
        }, new e30() { // from class: l.dyc0
            public final void call(Object obj) {
                rx0.d();
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m14168l() {
        c.fromCallable(new Callable() { // from class: l.wxc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eyc0.m14157a();
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.xxc0
            public final void call(Object obj) {
                eyc0.m14160d((roj0) obj);
            }
        }, new e30() { // from class: l.yxc0
            public final void call(Object obj) {
                eyc0.m14164h((Throwable) obj);
            }
        }));
    }
}
