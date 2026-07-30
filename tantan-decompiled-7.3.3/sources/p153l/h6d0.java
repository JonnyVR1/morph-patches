package p153l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class h6d0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m133684a() {
        if (uqb0.f180385Q == null) {
            uqb0.f180385Q = new C18334l2();
        }
        if (m133693j()) {
            uqb0.f180385Q.m152544a0().take(1500L, TimeUnit.MILLISECONDS).toBlocking().m165964c(null);
        } else if (TantanApp.f17901e.mo107143b() != null) {
            uqb0.f180385Q.m152541U();
        } else {
            uqb0.f180385Q.m152540T();
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m133686c(Activity activity, AuthData authData, HashMap map) {
        try {
            m133692i(activity, map);
        } catch (Exception unused) {
        } finally {
            TantanApp.f17901e.m123197l(authData);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m133687d(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m133690g(Activity activity, uxj0 uxj0Var) {
        activity.startActivity(SplashProxyAct.m81288l(App.f16088e));
        activity.finish();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m133691h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m133692i(Activity activity, HashMap<Integer, ArrayList<Act.C4450r>> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator<ArrayList<Act.C4450r>> it = map.values().iterator();
        while (it.hasNext()) {
            for (Act.C4450r c4450r : it.next()) {
                if (NullChecker.m82486a(c4450r.f16062a.get()) && c4450r.f16062a.get() != activity && (c4450r.f16062a.get() instanceof Act)) {
                    ((Act) c4450r.f16062a.get()).finishWithoutCustomAnimation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m133693j() {
        return TantanApp.f17901e.mo107143b() != null && TantanApp.f17900d.mo107143b().booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m133694k(@NonNull final Activity activity, final AuthData authData) {
        uqb0.m197257Y0(true, null, false, true, false).map(new qcj() { // from class: l.c6d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Act.globalLifeCycle_();
            }
        }).doOnNext(new y20() { // from class: l.d6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                h6d0.m133686c(activity, authData, (HashMap) obj);
            }
        }).flatMap(new qcj() { // from class: l.e6d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.m197270f0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.f6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                h6d0.m133690g(activity, (uxj0) obj);
            }
        }, new y20() { // from class: l.g6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                yx0.m217669d();
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m133695l() {
        C22421c.fromCallable(new Callable() { // from class: l.z5d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h6d0.m133684a();
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.a6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                h6d0.m133687d((uxj0) obj);
            }
        }, new y20() { // from class: l.b6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                h6d0.m133691h((Throwable) obj);
            }
        }));
    }
}
