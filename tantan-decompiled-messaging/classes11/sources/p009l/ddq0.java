package p009l;

import com.p1.mobile.putong.data.XmlMonitorConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ddq0 {

    /* JADX INFO: renamed from: b */
    public static volatile ddq0 f11779b;

    /* JADX INFO: renamed from: a */
    public XmlMonitorConfig f11780a;

    /* JADX INFO: renamed from: a */
    public static ddq0 m13175a() {
        if (f11779b == null) {
            synchronized (ddq0.class) {
                try {
                    if (f11779b == null) {
                        f11779b = new ddq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11779b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m13176b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int m13177c() {
        try {
            if (NullChecker.a(this.f11780a)) {
                return this.f11780a.xml_monitor_cons_min;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }
}
