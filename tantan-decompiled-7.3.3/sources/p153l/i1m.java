package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class i1m {
    /* JADX INFO: renamed from: a */
    public static void m138141a(Closeable... closeableArr) {
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
    public static void m138142b(Closeable closeable) {
        m138141a(closeable);
    }
}
