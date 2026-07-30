package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class m5e {
    /* JADX INFO: renamed from: a */
    public static void m153136a(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                k5e.m144528a(autoCloseable);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m153137b(Context context, Uri uri) {
        return m153138c(context, uri, "_display_name", null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m153138c(Context context, Uri uri, String str, @Nullable String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            e.toString();
            return str2;
        } finally {
            m153136a(cursorQuery);
        }
    }
}
