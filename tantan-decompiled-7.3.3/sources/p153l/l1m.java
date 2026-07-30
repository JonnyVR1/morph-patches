package p153l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class l1m {
    /* JADX INFO: renamed from: a */
    public static void m152507a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
