package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import l.uqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kqi0 {

    /* JADX INFO: renamed from: c */
    public static volatile kqi0 f15812c;

    /* JADX INFO: renamed from: a */
    public zpd0 f15813a = new zpd0("tiered_prom_dlg_show_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public uqd0 f15814b = new uqd0("tiered_prom_coupon_id" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: a */
    public static kqi0 m17596a() {
        if (f15812c == null) {
            synchronized (kqi0.class) {
                try {
                    if (f15812c == null) {
                        f15812c = new kqi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15812c;
    }

    /* JADX INFO: renamed from: b */
    public static String m17597b(UserPrivilege userPrivilege) {
        return NullChecker.a(userPrivilege) ? String.valueOf(m17598c(qib0.H.guessedCurrentServerTime() - userPrivilege.content.expiredTime)) : "";
    }

    /* JADX INFO: renamed from: c */
    public static long m17598c(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: d */
    public void m17599d() {
        f15812c = null;
    }
}
