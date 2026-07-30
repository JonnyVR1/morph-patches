package p003l;

import com.p1.mobile.putong.core.CoreModule;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ub0 {

    /* JADX INFO: renamed from: c */
    public static ub0 f7730c;

    /* JADX INFO: renamed from: a */
    public tpd0 f7731a = new tpd0("dlg_show_times" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f7732b = new zpd0("age_alert_last_show_dlg_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static ub0 m9711a() {
        if (f7730c == null) {
            synchronized (ub0.class) {
                try {
                    if (f7730c == null) {
                        f7730c = new ub0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7730c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m9712b(long j) {
        return false;
    }
}
