package p153l;

import com.p051p1.mobile.putong.data.XmlMonitorConfig;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class imq0 {

    /* JADX INFO: renamed from: b */
    public static volatile imq0 f115824b;

    /* JADX INFO: renamed from: a */
    public XmlMonitorConfig f115825a;

    /* JADX INFO: renamed from: a */
    public static imq0 m140986a() {
        if (f115824b == null) {
            synchronized (imq0.class) {
                try {
                    if (f115824b == null) {
                        f115824b = new imq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f115824b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m140987b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public int m140988c() {
        try {
            if (NullChecker.m82486a(this.f115825a)) {
                return this.f115825a.xml_monitor_cons_min;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }
}
