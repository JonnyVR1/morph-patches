package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import l.roj0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zzc0 extends ogl0 {

    /* JADX INFO: renamed from: b */
    public static a<roj0> f29050b = a.b();

    /* JADX INFO: renamed from: c0 */
    public static c<roj0> m28864c0() {
        return f29050b;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m28865d0() {
        int iY;
        try {
            iY = RemoteConfig.x().y("guide_give_superlike_frequency");
        } catch (Exception unused) {
            iY = -1;
        }
        if (iY > 0) {
            return iY;
        }
        return 180;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m28866e0(boolean z) {
        int iY;
        try {
            iY = RemoteConfig.x().y(z ? "guide_give_superlike_pop_female" : "guide_give_superlike_pop");
        } catch (Exception unused) {
            iY = 0;
        }
        if (iY == 0) {
            return z ? 6 : 7;
        }
        return iY;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m28867f0() {
        CoreModule.f1534c.f3628e0.m21490p9();
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m28868g0() {
        if (f29050b.i()) {
            return;
        }
        f29050b.onNext(roj0.a);
    }
}
