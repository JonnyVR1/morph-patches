package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class zzc0 extends ogl0 {

    /* JADX INFO: renamed from: b */
    public static C22392a<roj0> f205794b = C22392a.m221512b();

    /* JADX INFO: renamed from: c0 */
    public static C22306c<roj0> m221012c0() {
        return f205794b;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m221013d0() {
        int iM79335y;
        try {
            iM79335y = RemoteConfig.m79298x().m79335y("guide_give_superlike_frequency");
        } catch (Exception unused) {
            iM79335y = -1;
        }
        if (iM79335y > 0) {
            return iM79335y;
        }
        return 180;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m221014e0(boolean z) {
        int iM79335y;
        try {
            iM79335y = RemoteConfig.m79298x().m79335y(z ? "guide_give_superlike_pop_female" : "guide_give_superlike_pop");
        } catch (Exception unused) {
            iM79335y = 0;
        }
        if (iM79335y == 0) {
            return z ? 6 : 7;
        }
        return iM79335y;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m221015f0() {
        CoreModule.f17545c.f19639e0.m169527p9();
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m221016g0() {
        if (f205794b.m221519i()) {
            return;
        }
        f205794b.m132487l(roj0.f160388a);
    }
}
