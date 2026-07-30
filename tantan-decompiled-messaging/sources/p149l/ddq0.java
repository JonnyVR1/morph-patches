package p149l;

import com.p046p1.mobile.putong.data.XmlMonitorConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ddq0 {

    /* JADX INFO: renamed from: b */
    public static volatile ddq0 f85624b;

    /* JADX INFO: renamed from: a */
    public XmlMonitorConfig f85625a;

    /* JADX INFO: renamed from: a */
    public static ddq0 m111055a() {
        if (f85624b == null) {
            synchronized (ddq0.class) {
                try {
                    if (f85624b == null) {
                        f85624b = new ddq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f85624b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m111056b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int m111057c() {
        try {
            if (NullChecker.m81303a(this.f85625a)) {
                return this.f85625a.xml_monitor_cons_min;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }
}
