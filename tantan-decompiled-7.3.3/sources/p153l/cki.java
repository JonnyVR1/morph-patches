package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class cki {
    /* JADX INFO: renamed from: a */
    public static boolean m110338a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM110339b = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zM110339b &= m110339b(file2);
            }
        }
        return zM110339b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m110339b(File file) {
        if (file.isDirectory()) {
            m110338a(file);
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static void m110340c(File file, dki dkiVar) {
        dkiVar.mo8157c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m110340c(file2, dkiVar);
                } else {
                    dkiVar.mo8155a(file2);
                }
            }
        }
        dkiVar.mo8156b(file);
    }
}
