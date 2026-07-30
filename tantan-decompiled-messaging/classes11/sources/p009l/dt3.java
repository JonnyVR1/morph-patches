package p009l;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import l.q0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dt3 {
    /* JADX INFO: renamed from: a */
    public static boolean m13469a(@NonNull Context context) {
        return context.getResources().getBoolean(q0c0.a) && m13470b(context).equals("64");
    }

    /* JADX INFO: renamed from: b */
    public static String m13470b(@NonNull Context context) {
        return (m13471c("ro.product.cpu.abilist64", "").length() <= 0 && !Process.is64Bit()) ? "32" : "64";
    }

    /* JADX INFO: renamed from: c */
    public static String m13471c(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            CrashHelper.c(e);
            e.getMessage();
            return str2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m13472d() {
        return m13471c("ro.product.cpu.abilist64", "");
    }
}
