package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class m1m {
    /* JADX INFO: renamed from: a */
    public static void m156698a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
