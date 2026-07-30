package p149l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class u95 {
    /* JADX INFO: renamed from: a */
    public static void m192263a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
