package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class wa5 {
    /* JADX INFO: renamed from: a */
    public static void m205634a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
