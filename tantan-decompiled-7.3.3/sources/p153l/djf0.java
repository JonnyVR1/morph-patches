package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.ExtraActLifecycle;
import com.p051p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class djf0 {

    /* JADX INFO: renamed from: f */
    public static long f88841f;

    /* JADX INFO: renamed from: g */
    public static djf0 f88842g;

    /* JADX INFO: renamed from: a */
    public final byd0 f88843a = new byd0("sign_up_back_last_to_background_time", 0L);

    /* JADX INFO: renamed from: b */
    public final jxd0 f88844b = new jxd0("sign_up_back_has_seen_back_button", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public C22507a<uxj0> f88845c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public y20<Act> f88846d = new y20() { // from class: l.bjf0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f76987a.m116088d((Act) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public y20<Act> f88847e = new y20() { // from class: l.cjf0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f82152a.m116089e((Act) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    public static djf0 m116082c() {
        if (f88842g == null) {
            synchronized (djf0.class) {
                try {
                    if (f88842g == null) {
                        f88842g = new djf0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f88842g;
    }

    /* JADX INFO: renamed from: f */
    public static wyd0 m116083f(AuthData authData) {
        return new wyd0("last_signin_type" + authData.accessToken, "", false);
    }

    /* JADX INFO: renamed from: g */
    public static wyd0 m116084g() {
        return new wyd0("last_signin_type", "", false);
    }

    /* JADX INFO: renamed from: i */
    public static void m116085i() {
        if (NullChecker.m82486a(f88842g)) {
            f88842g.m116091l();
            f88842g.f88845c.onCompleted();
            f88842g = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m116086j(AuthData authData) {
        if (TextUtils.isEmpty(m116084g().get())) {
            return;
        }
        m116083f(authData).put(m116084g().get());
    }

    /* JADX INFO: renamed from: k */
    public static jxd0 m116087k() {
        return new jxd0("remember_sign_in_dialog_enable", Boolean.TRUE, false);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m116088d(Act act) {
        if (act instanceof x5m) {
            this.f88843a.put(Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m116089e(Act act) {
        f88841f = SystemClock.elapsedRealtime();
        this.f88845c.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: h */
    public void m116090h() {
        srf.m187598a().m187599b(ExtraActLifecycle.onStopToBackground, this.f88846d);
        srf.m187598a().m187599b(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f88847e);
    }

    /* JADX INFO: renamed from: l */
    public void m116091l() {
        srf.m187598a().m187601d(ExtraActLifecycle.onStopToBackground, this.f88846d);
        srf.m187598a().m187601d(ExtraActLifecycle.onResumeFromAppStartOrBackground, this.f88847e);
    }
}
