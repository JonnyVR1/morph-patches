package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class fhi {
    /* JADX INFO: renamed from: a */
    public static boolean m121357a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM121358b = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zM121358b &= m121358b(file2);
            }
        }
        return zM121358b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m121358b(File file) {
        if (file.isDirectory()) {
            m121357a(file);
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static void m121359c(File file, ghi ghiVar) {
        ghiVar.mo8103c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m121359c(file2, ghiVar);
                } else {
                    ghiVar.mo8101a(file2);
                }
            }
        }
        ghiVar.mo8102b(file);
    }
}
