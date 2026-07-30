package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class zpe {

    /* JADX INFO: renamed from: a */
    public static File f205458a;

    /* JADX INFO: renamed from: a */
    public static File m220834a() {
        return zrv.f205803e.getFilesDir();
    }

    /* JADX INFO: renamed from: b */
    public static File m220835b() {
        if (f205458a == null) {
            f205458a = new File(m220834a(), "effectCache");
        }
        if (!f205458a.exists()) {
            f205458a.mkdirs();
        }
        return f205458a;
    }
}
