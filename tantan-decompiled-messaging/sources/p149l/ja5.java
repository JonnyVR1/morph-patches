package p149l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ja5 {
    /* JADX INFO: renamed from: a */
    public static void m140688a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
