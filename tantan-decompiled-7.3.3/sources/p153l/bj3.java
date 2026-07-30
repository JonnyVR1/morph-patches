package p153l;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bj3 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Method f76953a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public static Method f76954b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static IBinder m104588a(Bundle bundle, @Nullable String str) {
        return bmk0.f77313a >= 18 ? bundle.getBinder(str) : m104589b(bundle, str);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static IBinder m104589b(Bundle bundle, @Nullable String str) {
        Method method = f76953a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f76953a = method2;
                method2.setAccessible(true);
                method = f76953a;
            } catch (NoSuchMethodException e) {
                kyv.m152149g("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            kyv.m152149g("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m104590c(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (bmk0.f77313a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m104591d(bundle, str, iBinder);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m104591d(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Method method = f76954b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f76954b = method2;
                method2.setAccessible(true);
                method = f76954b;
            } catch (NoSuchMethodException e) {
                kyv.m152149g("BundleUtil", "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            kyv.m152149g("BundleUtil", "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
