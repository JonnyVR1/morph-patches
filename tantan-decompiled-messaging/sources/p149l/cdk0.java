package p149l;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes.dex */
final class cdk0 {

    /* JADX INFO: renamed from: a */
    static final Charset f80374a = Charset.forName(CharEncoding.US_ASCII);

    /* JADX INFO: renamed from: b */
    static final Charset f80375b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m106252a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m106253b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            mll.m155165a("not a readable directory: ", file);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m106253b(file2);
            }
            if (!file2.delete()) {
                mll.m155165a("failed to delete file: ", file2);
                return;
            }
        }
    }
}
