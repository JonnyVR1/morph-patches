package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class cmk0 {
    /* JADX INFO: renamed from: a */
    public static void m111281a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
