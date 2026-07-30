package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class c8d0 extends spl0 {

    /* JADX INFO: renamed from: b */
    public static C22507a<uxj0> f80203b = C22507a.m222758b();

    /* JADX INFO: renamed from: c0 */
    public static C22421c<uxj0> m108353c0() {
        return f80203b;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m108354d0() {
        int iM80518y;
        try {
            iM80518y = RemoteConfig.m80481x().m80518y("guide_give_superlike_frequency");
        } catch (Exception unused) {
            iM80518y = -1;
        }
        if (iM80518y > 0) {
            return iM80518y;
        }
        return 180;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m108355e0(boolean z) {
        int iM80518y;
        try {
            iM80518y = RemoteConfig.m80481x().m80518y(z ? "guide_give_superlike_pop_female" : "guide_give_superlike_pop");
        } catch (Exception unused) {
            iM80518y = 0;
        }
        if (iM80518y == 0) {
            return z ? 6 : 7;
        }
        return iM80518y;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m108356f0() {
        CoreModule.f18264c.f20381e0.m116600p9();
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static void m108357g0() {
        if (f80203b.m222765i()) {
            return;
        }
        f80203b.m137019l(uxj0.f181467a);
    }
}
