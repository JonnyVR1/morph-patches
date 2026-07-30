package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RankLevel;

/* JADX INFO: loaded from: classes9.dex */
public class da0 {

    /* JADX INFO: renamed from: c */
    public static da0 f85166c;

    /* JADX INFO: renamed from: a */
    public uqd0 f85167a = new uqd0(RankLevel.city + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: b */
    public tpd0 f85168b = new tpd0("advanced_swipe_card_times" + CoreModule.m29931H().userId(), 1);

    /* JADX INFO: renamed from: a */
    public static da0 m110520a() {
        if (f85166c == null) {
            synchronized (da0.class) {
                try {
                    if (f85166c == null) {
                        f85166c = new da0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f85166c;
    }

    /* JADX INFO: renamed from: c */
    public static void m110521c() {
        f85166c = null;
    }

    /* JADX INFO: renamed from: b */
    public String m110522b() {
        return this.f85167a.get();
    }

    /* JADX INFO: renamed from: d */
    public void m110523d(String str) {
        this.f85167a.put(str);
    }
}
