package p003l;

import com.p1.mobile.putong.core.CoreModule;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ufe {

    /* JADX INFO: renamed from: a */
    public static File f7747a;

    /* JADX INFO: renamed from: a */
    public static final File m9717a() {
        return CoreModule.b.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m9718b() {
        if (f7747a == null) {
            f7747a = new File(m9717a(), "dynamicCache");
        }
        if (!f7747a.exists()) {
            f7747a.mkdirs();
        }
        return f7747a;
    }
}
