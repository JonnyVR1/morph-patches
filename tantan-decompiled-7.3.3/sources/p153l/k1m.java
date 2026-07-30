package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class k1m {
    /* JADX INFO: renamed from: a */
    public static void m147892a(Closeable... closeableArr) {
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
    public static void m147893b(Closeable closeable) {
        m147892a(closeable);
    }
}
