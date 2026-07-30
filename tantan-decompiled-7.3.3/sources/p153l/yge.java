package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class yge {

    /* JADX INFO: renamed from: a */
    public static File f199823a;

    /* JADX INFO: renamed from: a */
    public static final File m215839a() {
        return CoreModule.f18263b.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m215840b() {
        if (f199823a == null) {
            f199823a = new File(m215839a(), "dynamicCache");
        }
        if (!f199823a.exists()) {
            f199823a.mkdirs();
        }
        return f199823a;
    }
}
