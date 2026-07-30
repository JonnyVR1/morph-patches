package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class nzi0 {

    /* JADX INFO: renamed from: c */
    public static volatile nzi0 f144439c;

    /* JADX INFO: renamed from: a */
    public byd0 f144440a = new byd0("tiered_prom_dlg_show_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public wyd0 f144441b = new wyd0("tiered_prom_coupon_id" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: a */
    public static nzi0 m165372a() {
        if (f144439c == null) {
            synchronized (nzi0.class) {
                try {
                    if (f144439c == null) {
                        f144439c = new nzi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f144439c;
    }

    /* JADX INFO: renamed from: b */
    public static String m165373b(UserPrivilege userPrivilege) {
        return NullChecker.m82486a(userPrivilege) ? String.valueOf(m165374c(uqb0.f180376H.guessedCurrentServerTime() - userPrivilege.content.expiredTime)) : "";
    }

    /* JADX INFO: renamed from: c */
    public static long m165374c(long j) {
        return (j / 86400000) + 1;
    }

    /* JADX INFO: renamed from: d */
    public void m165375d() {
        f144439c = null;
    }
}
