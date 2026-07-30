package p153l;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l6r0 {
    /* JADX INFO: renamed from: a */
    public static long m153084a(File file) {
        try {
            return new StatFs(file.getPath()).getTotalBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m153085b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m153087d());
            jSONObject.put("inner_total", m153089f());
            jSONObject.put("sdcard_free", m153092i());
            jSONObject.put("sdcard_total", m153093j());
            jSONObject.put("inner_free_real", m153090g());
            jSONObject.put("inner_total_real", m153091h());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153086c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: d */
    private static long m153087d() {
        try {
            return m153088e(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m153088e(File file) {
        try {
            return new StatFs(file.getPath()).getFreeBytes();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    private static long m153089f() {
        try {
            return m153084a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: g */
    private static long m153090g() {
        try {
            return m153088e(n0r0.m161022i().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    private static long m153091h() {
        try {
            return m153084a(n0r0.m161022i().getFilesDir());
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    private static long m153092i() {
        try {
            if (m153086c()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: j */
    private static long m153093j() {
        try {
            if (m153086c()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
