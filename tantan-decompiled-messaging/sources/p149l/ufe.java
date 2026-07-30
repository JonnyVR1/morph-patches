package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class ufe {

    /* JADX INFO: renamed from: a */
    public static File f176249a;

    /* JADX INFO: renamed from: a */
    public static final File m193381a() {
        return CoreModule.f17544b.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m193382b() {
        if (f176249a == null) {
            f176249a = new File(m193381a(), "dynamicCache");
        }
        if (!f176249a.exists()) {
            f176249a.mkdirs();
        }
        return f176249a;
    }
}
