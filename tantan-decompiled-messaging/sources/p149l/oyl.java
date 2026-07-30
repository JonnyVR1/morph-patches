package p149l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class oyl {
    /* JADX INFO: renamed from: a */
    public static void m166671a(Closeable... closeableArr) {
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
    public static void m166672b(Closeable closeable) {
        m166671a(closeable);
    }
}
