package io.agora.base.internal;

import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    @Nullable
    public static Object safeCallMethod(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (Throwable th) {
            ThrowableExtension.printStackTrace(th);
            method = null;
        }
        if (method == null) {
            Logging.m87209e(TAG, "cannot find method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable th2) {
            Logging.m87209e(TAG, "cannot execute method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            ThrowableExtension.printStackTrace(th2);
            return null;
        }
    }

    @Nullable
    public static Class<?> safeFindClass(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            ThrowableExtension.printStackTrace(th);
            return null;
        }
    }

    @Nullable
    public static Method safeGetMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable th) {
            ThrowableExtension.printStackTrace(th);
            return null;
        }
    }
}
