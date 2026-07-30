package p149l;

import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kwq0 {
    /* JADX INFO: renamed from: a */
    public static void m147628a(Object obj) {
        if (hrq0.m132702k().m143408l()) {
            String.valueOf(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m147629b(String str) {
        hrq0.m132702k().m143408l();
    }

    /* JADX INFO: renamed from: c */
    public static void m147630c(String str, Object obj) {
        if (hrq0.m132702k().m143408l()) {
            Objects.toString(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147631d(String str, Object obj, Throwable th) {
        if (hrq0.m132702k().m143408l()) {
            Log.e("npth", str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + obj, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m147632e(String str, Throwable th) {
        if (hrq0.m132702k().m143408l()) {
            Log.e("npth", str + " NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m147633f(Throwable th) {
        if (hrq0.m132702k().m143408l()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m147634g(Throwable th) {
        hrq0.m132702k().m143408l();
    }
}
