package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class hrq0 {

    /* JADX INFO: renamed from: a */
    private static volatile UUID f111378a = null;

    /* JADX INFO: renamed from: b */
    private static String f111379b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private hrq0(Context context) {
        if (f111378a == null) {
            synchronized (hrq0.class) {
                if (f111378a == null) {
                    String string = null;
                    String strM148486b = k5r0.m148477c().m148486b(null);
                    if (strM148486b != null) {
                        f111378a = UUID.fromString(strM148486b);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            f111378a = string != null ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            k5r0.m148477c().m148492l(f111378a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m136919a(Context context) {
        UUID uuidM136920b;
        try {
            if (TextUtils.isEmpty(f111379b) && (uuidM136920b = new hrq0(context).m136920b()) != null) {
                f111379b = uuidM136920b.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f111379b;
    }

    /* JADX INFO: renamed from: b */
    public UUID m136920b() {
        return f111378a;
    }
}
