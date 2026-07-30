package p149l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class eyc0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m118752a() {
        if (qib0.f154702Q == null) {
            qib0.f154702Q = new C18133l2();
        }
        if (m118761j()) {
            qib0.f154702Q.m148250a0().take(1500L, TimeUnit.MILLISECONDS).toBlocking().m212771c(null);
        } else if (TantanApp.f17182e.mo108248b() != null) {
            qib0.f154702Q.m148247U();
        } else {
            qib0.f154702Q.m148246T();
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m118754c(Activity activity, AuthData authData, HashMap map) {
        try {
            m118760i(activity, map);
        } catch (Exception unused) {
        } finally {
            TantanApp.f17182e.m108253l(authData);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m118755d(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m118758g(Activity activity, roj0 roj0Var) {
        activity.startActivity(SplashProxyAct.m80105l(App.f15369e));
        activity.finish();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m118759h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m118760i(Activity activity, HashMap<Integer, ArrayList<Act.C4299r>> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator<ArrayList<Act.C4299r>> it = map.values().iterator();
        while (it.hasNext()) {
            for (Act.C4299r c4299r : it.next()) {
                if (NullChecker.m81303a(c4299r.f15343a.get()) && c4299r.f15343a.get() != activity && (c4299r.f15343a.get() instanceof Act)) {
                    ((Act) c4299r.f15343a.get()).finishWithoutCustomAnimation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m118761j() {
        return TantanApp.f17182e.mo108248b() != null && TantanApp.f17181d.mo108248b().booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m118762k(@NonNull final Activity activity, final AuthData authData) {
        qib0.m174803Y0(true, null, false, true, false).map(new w9j() { // from class: l.zxc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Act.globalLifeCycle_();
            }
        }).doOnNext(new e30() { // from class: l.ayc0
            @Override // p149l.e30
            public final void call(Object obj) {
                eyc0.m118754c(activity, authData, (HashMap) obj);
            }
        }).flatMap(new w9j() { // from class: l.byc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.m174816f0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.cyc0
            @Override // p149l.e30
            public final void call(Object obj) {
                eyc0.m118758g(activity, (roj0) obj);
            }
        }, new e30() { // from class: l.dyc0
            @Override // p149l.e30
            public final void call(Object obj) {
                rx0.m181467d();
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m118763l() {
        C22306c.fromCallable(new Callable() { // from class: l.wxc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eyc0.m118752a();
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.xxc0
            @Override // p149l.e30
            public final void call(Object obj) {
                eyc0.m118755d((roj0) obj);
            }
        }, new e30() { // from class: l.yxc0
            @Override // p149l.e30
            public final void call(Object obj) {
                eyc0.m118759h((Throwable) obj);
            }
        }));
    }
}
