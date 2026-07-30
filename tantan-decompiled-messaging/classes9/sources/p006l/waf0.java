package p006l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.ExtraActLifecycle;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hpd0;
import l.lqf;
import l.roj0;
import l.uqd0;
import l.zpd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class waf0 {

    /* JADX INFO: renamed from: f */
    public static long f25063f;

    /* JADX INFO: renamed from: g */
    public static waf0 f25064g;

    /* JADX INFO: renamed from: a */
    public final zpd0 f25065a = new zpd0("sign_up_back_last_to_background_time", 0L);

    /* JADX INFO: renamed from: b */
    public final hpd0 f25066b = new hpd0("sign_up_back_has_seen_back_button", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public a<roj0> f25067c = a.b();

    /* JADX INFO: renamed from: d */
    public e30<Act> f25068d = new e30() { // from class: l.uaf0
        public final void call(Object obj) {
            this.f23474a.m26305d((Act) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public e30<Act> f25069e = new e30() { // from class: l.vaf0
        public final void call(Object obj) {
            this.f24237a.m26306e((Act) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    public static waf0 m26299c() {
        if (f25064g == null) {
            synchronized (waf0.class) {
                try {
                    if (f25064g == null) {
                        f25064g = new waf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25064g;
    }

    /* JADX INFO: renamed from: f */
    public static uqd0 m26300f(AuthData authData) {
        return new uqd0("last_signin_type" + authData.accessToken, "", false);
    }

    /* JADX INFO: renamed from: g */
    public static uqd0 m26301g() {
        return new uqd0("last_signin_type", "", false);
    }

    /* JADX INFO: renamed from: i */
    public static void m26302i() {
        if (NullChecker.a(f25064g)) {
            f25064g.m26308l();
            f25064g.f25067c.onCompleted();
            f25064g = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m26303j(AuthData authData) {
        if (TextUtils.isEmpty((CharSequence) m26301g().get())) {
            return;
        }
        m26300f(authData).put((String) m26301g().get());
    }

    /* JADX INFO: renamed from: k */
    public static hpd0 m26304k() {
        return new hpd0("remember_sign_in_dialog_enable", Boolean.TRUE, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m26305d(Act act) {
        if (act instanceof g3m) {
            this.f25065a.put(Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m26306e(Act act) {
        f25063f = SystemClock.elapsedRealtime();
        this.f25067c.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h */
    public void m26307h() {
        lqf.a().b(ExtraActLifecycle.onStopToBackground, this.f25068d);
        lqf.a().b(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f25069e);
    }

    /* JADX INFO: renamed from: l */
    public void m26308l() {
        lqf.a().d(ExtraActLifecycle.onStopToBackground, this.f25068d);
        lqf.a().d(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f25069e);
    }
}
