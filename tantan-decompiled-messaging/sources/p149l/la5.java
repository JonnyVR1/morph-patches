package p149l;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class la5 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final Logger f127166a = Logger.getLogger(la5.class.getName());

    /* JADX INFO: renamed from: a */
    public static void m149127a(Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (!z) {
                throw e;
            }
            f127166a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m149128b(InputStream inputStream) {
        try {
            m149127a(inputStream, true);
        } catch (IOException e) {
            y9g0.m213537a(e);
        }
    }
}
