package p149l;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes13.dex */
public class c5r {

    /* JADX INFO: renamed from: l.c5r$b */
    public static class C16079b implements Comparator<File> {
        public C16079b() {
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
    public static void m105354a(yw3 yw3Var) {
        File file = new File(yw3Var.m216294b());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        long jM174548i = qhi.m174548i(file);
        Arrays.sort(fileArrListFiles, new C16079b());
        if (jM174548i >= yw3Var.m216295c()) {
            int length = (int) ((((double) fileArrListFiles.length) * 0.3d) + 1.0d);
            for (int i = 0; i < length; i++) {
                qhi.m174545f(fileArrListFiles[i]);
            }
        }
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 == null) {
            return;
        }
        Arrays.sort(fileArrListFiles2, new C16079b());
        if (fileArrListFiles2.length > yw3Var.m216296d()) {
            for (int i2 = 0; i2 < fileArrListFiles2.length - yw3Var.m216296d(); i2++) {
                qhi.m174545f(fileArrListFiles2[i2]);
            }
        }
    }
}
