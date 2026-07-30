package p153l;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public class d7r {

    /* JADX INFO: renamed from: l.d7r$b */
    public static class C16477b implements Comparator<File> {
        public C16477b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m114753a(xx3 xx3Var) {
        File file = new File(xx3Var.m213490b());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        long jM163626i = nki.m163626i(file);
        Arrays.sort(fileArrListFiles, new C16477b());
        if (jM163626i >= xx3Var.m213491c()) {
            int length = (int) ((((double) fileArrListFiles.length) * 0.3d) + 1.0d);
            for (int i = 0; i < length; i++) {
                nki.m163623f(fileArrListFiles[i]);
            }
        }
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 == null) {
            return;
        }
        Arrays.sort(fileArrListFiles2, new C16477b());
        if (fileArrListFiles2.length > xx3Var.m213492d()) {
            for (int i2 = 0; i2 < fileArrListFiles2.length - xx3Var.m213492d(); i2++) {
                nki.m163623f(fileArrListFiles2[i2]);
            }
        }
    }
}
