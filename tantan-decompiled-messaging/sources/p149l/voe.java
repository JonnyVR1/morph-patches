package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class voe {

    /* JADX INFO: renamed from: a */
    public static File f182382a;

    /* JADX INFO: renamed from: a */
    public static File m199163a() {
        return ypv.f199497e.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m199164b() {
        if (f182382a == null) {
            f182382a = new File(m199163a(), "effectCache");
        }
        if (!f182382a.exists()) {
            f182382a.mkdirs();
        }
        return f182382a;
    }
}
