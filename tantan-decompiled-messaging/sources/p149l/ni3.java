package p149l;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ni3 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Method f139053a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public static Method f139054b;

    @Nullable
    /* JADX INFO: renamed from: a */
    public static IBinder m159484a(Bundle bundle, @Nullable String str) {
        return vck0.f180948a >= 18 ? bundle.getBinder(str) : m159485b(bundle, str);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static IBinder m159485b(Bundle bundle, @Nullable String str) {
        Method method = f139053a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f139053a = method2;
                method2.setAccessible(true);
                method = f139053a;
            } catch (NoSuchMethodException e) {
                jwv.m143687g("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            jwv.m143687g("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m159486c(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (vck0.f180948a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m159487d(bundle, str, iBinder);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m159487d(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Method method = f139054b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f139054b = method2;
                method2.setAccessible(true);
                method = f139054b;
            } catch (NoSuchMethodException e) {
                jwv.m143687g("BundleUtil", "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            jwv.m143687g("BundleUtil", "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
