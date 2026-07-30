package p153l;

import android.app.Application;
import com.immomo.momosec.jni.MNative;

/* JADX INFO: loaded from: classes7.dex */
public class pmw {

    /* JADX INFO: renamed from: a */
    private String f153236a = null;

    /* JADX INFO: renamed from: b */
    private String f153237b = null;

    /* JADX INFO: renamed from: c */
    private String f153238c;

    public pmw(String str, Application application) {
        this.f153238c = null;
        synchronized (MNative.class) {
            giw.m130386c(application);
            this.f153238c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m172976a(String str) {
        try {
            String str2 = this.f153236a;
            if (str2 != null && str != null) {
                return MNative.m20274b().m20276h(str, giw.m130384a(str2));
            }
            return null;
        } catch (Exception e) {
            mmw.m159100a(e);
            return null;
        }
    }
}
