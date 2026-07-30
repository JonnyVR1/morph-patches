package p153l;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class lb5 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final Logger f130775a = Logger.getLogger(lb5.class.getName());

    /* JADX INFO: renamed from: a */
    public static void m153574a(Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            if (!z) {
                throw e;
            }
            f130775a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m153575b(InputStream inputStream) {
        try {
            m153574a(inputStream, true);
        } catch (IOException e) {
            gig0.m130323a(e);
        }
    }
}
