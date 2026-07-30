package p149l;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class t95 {
    /* JADX INFO: renamed from: a */
    public static void m187603a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: renamed from: b */
    public static void m187604b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
