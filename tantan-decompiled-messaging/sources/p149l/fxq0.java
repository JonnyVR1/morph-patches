package p149l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fxq0 {
    /* JADX INFO: renamed from: a */
    public static long m123679a(File file) {
        try {
            return new StatFs(file.getPath()).getTotalBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m123680b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m123682d());
            jSONObject.put("inner_total", m123684f());
            jSONObject.put("sdcard_free", m123687i());
            jSONObject.put("sdcard_total", m123688j());
            jSONObject.put("inner_free_real", m123685g());
            jSONObject.put("inner_total_real", m123686h());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m123681c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: d */
    private static long m123682d() {
        try {
            return m123683e(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m123683e(File file) {
        try {
            return new StatFs(file.getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    private static long m123684f() {
        try {
            return m123679a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    private static long m123685g() {
        try {
            return m123683e(hrq0.m132700i().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    private static long m123686h() {
        try {
            return m123679a(hrq0.m132700i().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    private static long m123687i() {
        try {
            if (m123681c()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: j */
    private static long m123688j() {
        try {
            if (m123681c()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
