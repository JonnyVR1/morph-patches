package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.ExtraActLifecycle;
import com.p046p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class waf0 {

    /* JADX INFO: renamed from: f */
    public static long f185457f;

    /* JADX INFO: renamed from: g */
    public static waf0 f185458g;

    /* JADX INFO: renamed from: a */
    public final zpd0 f185459a = new zpd0("sign_up_back_last_to_background_time", 0L);

    /* JADX INFO: renamed from: b */
    public final hpd0 f185460b = new hpd0("sign_up_back_has_seen_back_button", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public C22392a<roj0> f185461c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public e30<Act> f185462d = new e30() { // from class: l.uaf0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f175600a.m202391d((Act) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public e30<Act> f185463e = new e30() { // from class: l.vaf0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f180732a.m202392e((Act) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    public static waf0 m202385c() {
        if (f185458g == null) {
            synchronized (waf0.class) {
                try {
                    if (f185458g == null) {
                        f185458g = new waf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185458g;
    }

    /* JADX INFO: renamed from: f */
    public static uqd0 m202386f(AuthData authData) {
        return new uqd0("last_signin_type" + authData.accessToken, "", false);
    }

    /* JADX INFO: renamed from: g */
    public static uqd0 m202387g() {
        return new uqd0("last_signin_type", "", false);
    }

    /* JADX INFO: renamed from: i */
    public static void m202388i() {
        if (NullChecker.m81303a(f185458g)) {
            f185458g.m202394l();
            f185458g.f185461c.onCompleted();
            f185458g = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m202389j(AuthData authData) {
        if (TextUtils.isEmpty(m202387g().get())) {
            return;
        }
        m202386f(authData).put(m202387g().get());
    }

    /* JADX INFO: renamed from: k */
    public static hpd0 m202390k() {
        return new hpd0("remember_sign_in_dialog_enable", Boolean.TRUE, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m202391d(Act act) {
        if (act instanceof g3m) {
            this.f185459a.put(Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m202392e(Act act) {
        f185457f = SystemClock.elapsedRealtime();
        this.f185461c.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: h */
    public void m202393h() {
        lqf.m151015a().m151016b(ExtraActLifecycle.onStopToBackground, this.f185462d);
        lqf.m151015a().m151016b(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f185463e);
    }

    /* JADX INFO: renamed from: l */
    public void m202394l() {
        lqf.m151015a().m151018d(ExtraActLifecycle.onStopToBackground, this.f185462d);
        lqf.m151015a().m151018d(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f185463e);
    }
}
