package p153l;

import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q5r0 {
    /* JADX INFO: renamed from: a */
    public static void m175511a(Object obj) {
        if (n0r0.m161024k().m169529l()) {
            String.valueOf(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m175512b(String str) {
        n0r0.m161024k().m169529l();
    }

    /* JADX INFO: renamed from: c */
    public static void m175513c(String str, Object obj) {
        if (n0r0.m161024k().m169529l()) {
            Objects.toString(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m175514d(String str, Object obj, Throwable th) {
        if (n0r0.m161024k().m169529l()) {
            Log.e("npth", str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + obj, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m175515e(String str, Throwable th) {
        if (n0r0.m161024k().m169529l()) {
            Log.e("npth", str + " NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m175516f(Throwable th) {
        if (n0r0.m161024k().m169529l()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m175517g(Throwable th) {
        n0r0.m161024k().m169529l();
    }
}
