package p149l;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ffj0 extends efj0 {
    @Override // p149l.efj0
    /* JADX INFO: renamed from: i */
    public Typeface mo116072i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f90841g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f90847m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    @Override // p149l.efj0
    /* JADX INFO: renamed from: u */
    public Method mo116082u(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
