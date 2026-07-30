package p002l;

import java.io.File;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class voe {

    /* JADX INFO: renamed from: a */
    public static File f21250a;

    /* JADX INFO: renamed from: a */
    public static File m24083a() {
        return ypv.e.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m24084b() {
        if (f21250a == null) {
            f21250a = new File(m24083a(), "effectCache");
        }
        if (!f21250a.exists()) {
            f21250a.mkdirs();
        }
        return f21250a;
    }
}
