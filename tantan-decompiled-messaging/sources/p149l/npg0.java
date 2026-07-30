package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class npg0 extends heg0 {

    /* JADX INFO: renamed from: b */
    public static final String[] f139964b = {Constants.KEY_ORIENTATION};

    public npg0(Context context) {
        super(context);
    }

    @Override // p149l.heg0, p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        ContentResolver contentResolver = this.f107371a.getContentResolver();
        int i2 = 0;
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(dpg0Var.f87271a, f139964b, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        i2 = cursorQuery.getInt(0);
                    } else if (cursorQuery != null) {
                    }
                    cursorQuery.close();
                } catch (RuntimeException unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (RuntimeException unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        String type = contentResolver.getType(dpg0Var.f87271a);
        if (type != null) {
            type.startsWith("video/");
        }
        return new s9g0(null, Okio.source(this.f107371a.getContentResolver().openInputStream(dpg0Var.f87271a)), 2, i2);
    }

    @Override // p149l.heg0, p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        Uri uri = dpg0Var.f87271a;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
