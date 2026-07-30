package p153l;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class ua5 {
    /* JADX INFO: renamed from: a */
    public static void m195157a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: renamed from: b */
    public static void m195158b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
