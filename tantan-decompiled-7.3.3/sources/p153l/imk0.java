package p153l;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes.dex */
final class imk0 {

    /* JADX INFO: renamed from: a */
    static final Charset f115784a = Charset.forName(CharEncoding.US_ASCII);

    /* JADX INFO: renamed from: b */
    static final Charset f115785b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m140935a(Closeable closeable) {
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
    public static void m140936b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            bol.m105705a("not a readable directory: ", file);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m140936b(file2);
            }
            if (!file2.delete()) {
                bol.m105705a("failed to delete file: ", file2);
                return;
            }
        }
    }
}
