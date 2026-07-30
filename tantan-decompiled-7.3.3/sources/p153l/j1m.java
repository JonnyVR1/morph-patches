package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class j1m {
    /* JADX INFO: renamed from: a */
    public static void m143147a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m143148b(Closeable closeable) {
        m143147a(closeable);
    }
}
