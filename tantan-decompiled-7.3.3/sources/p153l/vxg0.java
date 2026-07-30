package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class vxg0 extends pmg0 {

    /* JADX INFO: renamed from: b */
    public static final String[] f186259b = {Constants.KEY_ORIENTATION};

    public vxg0(Context context) {
        super(context);
    }

    @Override // p153l.pmg0, p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        ContentResolver contentResolver = this.f153183a.getContentResolver();
        int i2 = 0;
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(lxg0Var.f133955a, f186259b, null, null, null);
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
        String type = contentResolver.getType(lxg0Var.f133955a);
        if (type != null) {
            type.startsWith("video/");
        }
        return new aig0(null, Okio.source(this.f153183a.getContentResolver().openInputStream(lxg0Var.f133955a)), 2, i2);
    }

    @Override // p153l.pmg0, p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        Uri uri = lxg0Var.f133955a;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
