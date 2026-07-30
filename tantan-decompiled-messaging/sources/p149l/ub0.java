package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes10.dex */
public class ub0 {

    /* JADX INFO: renamed from: c */
    public static ub0 f175663c;

    /* JADX INFO: renamed from: a */
    public tpd0 f175664a = new tpd0("dlg_show_times" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f175665b = new zpd0("age_alert_last_show_dlg_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static ub0 m192811a() {
        if (f175663c == null) {
            synchronized (ub0.class) {
                try {
                    if (f175663c == null) {
                        f175663c = new ub0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f175663c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m192812b(long j) {
        return false;
    }
}
