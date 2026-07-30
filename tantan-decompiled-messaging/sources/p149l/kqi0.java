package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class kqi0 {

    /* JADX INFO: renamed from: c */
    public static volatile kqi0 f124270c;

    /* JADX INFO: renamed from: a */
    public zpd0 f124271a = new zpd0("tiered_prom_dlg_show_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f124272b = new uqd0("tiered_prom_coupon_id" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: a */
    public static kqi0 m146947a() {
        if (f124270c == null) {
            synchronized (kqi0.class) {
                try {
                    if (f124270c == null) {
                        f124270c = new kqi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f124270c;
    }

    /* JADX INFO: renamed from: b */
    public static String m146948b(UserPrivilege userPrivilege) {
        return NullChecker.m81303a(userPrivilege) ? String.valueOf(m146949c(qib0.f154693H.guessedCurrentServerTime() - userPrivilege.content.expiredTime)) : "";
    }

    /* JADX INFO: renamed from: c */
    public static long m146949c(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: d */
    public void m146950d() {
        f124270c = null;
    }
}
