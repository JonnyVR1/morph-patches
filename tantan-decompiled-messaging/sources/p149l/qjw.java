package p149l;

import android.app.Application;
import com.immomo.momosec.jni.MNative;

/* JADX INFO: loaded from: classes7.dex */
public class qjw {

    /* JADX INFO: renamed from: a */
    private String f154998a = null;

    /* JADX INFO: renamed from: b */
    private String f154999b = null;

    /* JADX INFO: renamed from: c */
    private String f155000c;

    public qjw(String str, Application application) {
        this.f155000c = null;
        synchronized (MNative.class) {
            igw.m136178c(application);
            this.f155000c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m175038a(String str) {
        try {
            String str2 = this.f154998a;
            if (str2 != null && str != null) {
                return MNative.m19294b().m19296h(str, igw.m136176a(str2));
            }
            return null;
        } catch (Exception e) {
            njw.m159796a(e);
            return null;
        }
    }
}
