package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class ciq0 {

    /* JADX INFO: renamed from: a */
    private static volatile UUID f81107a = null;

    /* JADX INFO: renamed from: b */
    private static String f81108b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private ciq0(Context context) {
        if (f81107a == null) {
            synchronized (ciq0.class) {
                if (f81107a == null) {
                    String string = null;
                    String strM118496b = ewq0.m118487c().m118496b(null);
                    if (strM118496b != null) {
                        f81107a = UUID.fromString(strM118496b);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            f81107a = string != null ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            ewq0.m118487c().m118502l(f81107a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m107095a(Context context) {
        UUID uuidM107096b;
        try {
            if (TextUtils.isEmpty(f81108b) && (uuidM107096b = new ciq0(context).m107096b()) != null) {
                f81108b = uuidM107096b.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f81108b;
    }

    /* JADX INFO: renamed from: b */
    public UUID m107096b() {
        return f81107a;
    }
}
