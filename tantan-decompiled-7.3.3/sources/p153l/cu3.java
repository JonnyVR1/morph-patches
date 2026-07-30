package p153l;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class cu3 {
    /* JADX INFO: renamed from: a */
    public static boolean m112649a(@NonNull Context context) {
        return context.getResources().getBoolean(v8c0.f182870a) && m112650b(context).equals("64");
    }

    /* JADX INFO: renamed from: b */
    public static String m112650b(@NonNull Context context) {
        return (m112651c("ro.product.cpu.abilist64", "").length() <= 0 && !Process.is64Bit()) ? "32" : "64";
    }

    /* JADX INFO: renamed from: c */
    public static String m112651c(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.getMessage();
            return str2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m112652d() {
        return m112651c("ro.product.cpu.abilist64", "");
    }
}
