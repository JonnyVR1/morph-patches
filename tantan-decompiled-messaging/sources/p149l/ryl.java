package p149l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ryl {
    /* JADX INFO: renamed from: a */
    public static void m181666a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
