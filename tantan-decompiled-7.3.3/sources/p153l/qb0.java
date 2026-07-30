package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes3.dex */
public class qb0 {

    /* JADX INFO: renamed from: c */
    public static qb0 f156443c;

    /* JADX INFO: renamed from: a */
    public vxd0 f156444a = new vxd0("dlg_show_times" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public byd0 f156445b = new byd0("age_alert_last_show_dlg_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static qb0 m176005a() {
        if (f156443c == null) {
            synchronized (qb0.class) {
                try {
                    if (f156443c == null) {
                        f156443c = new qb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f156443c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m176006b(long j) {
        return false;
    }
}
