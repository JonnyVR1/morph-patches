package p149l;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class dt3 {
    /* JADX INFO: renamed from: a */
    public static boolean m113531a(@NonNull Context context) {
        return context.getResources().getBoolean(q0c0.f152046a) && m113532b(context).equals("64");
    }

    /* JADX INFO: renamed from: b */
    public static String m113532b(@NonNull Context context) {
        return (m113533c("ro.product.cpu.abilist64", "").length() <= 0 && !Process.is64Bit()) ? "32" : "64";
    }

    /* JADX INFO: renamed from: c */
    public static String m113533c(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
            return str2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m113534d() {
        return m113533c("ro.product.cpu.abilist64", "");
    }
}
