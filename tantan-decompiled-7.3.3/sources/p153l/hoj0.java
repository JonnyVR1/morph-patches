package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class hoj0 extends loj0 {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f110926b;

    /* JADX INFO: renamed from: c */
    public static final Constructor<?> f110927c;

    /* JADX INFO: renamed from: d */
    public static final Method f110928d;

    /* JADX INFO: renamed from: e */
    public static final Method f110929e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f110927c = constructor;
        f110926b = cls;
        f110928d = method2;
        f110929e = method;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m136439h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f110928d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m136440i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f110926b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f110929e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m136441j() {
        return f110928d != null;
    }

    /* JADX INFO: renamed from: k */
    private static Object m136442k() {
        try {
            return f110927c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo131115a(Context context, w0j.C20974c c20974c, Resources resources, int i) {
        Object objM136442k = m136442k();
        if (objM136442k == null) {
            return null;
        }
        for (w0j.C20975d c20975d : c20974c.m204190a()) {
            ByteBuffer byteBufferM159290b = moj0.m159290b(context, resources, c20975d.m204192b());
            if (byteBufferM159290b == null || !m136439h(objM136442k, byteBufferM159290b, c20975d.m204193c(), c20975d.m204195e(), c20975d.m204196f())) {
                return null;
            }
        }
        return m136440i(objM136442k);
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo131116b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        Object objM136442k = m136442k();
        if (objM136442k == null) {
            return null;
        }
        oof0 oof0Var = new oof0();
        for (x0j.C21223b c21223b : c21223bArr) {
            Uri uriM208864d = c21223b.m208864d();
            ByteBuffer byteBufferM159294f = (ByteBuffer) oof0Var.get(uriM208864d);
            if (byteBufferM159294f == null) {
                byteBufferM159294f = moj0.m159294f(context, cancellationSignal, uriM208864d);
                oof0Var.put(uriM208864d, byteBufferM159294f);
            }
            if (byteBufferM159294f == null || !m136439h(objM136442k, byteBufferM159294f, c21223b.m208863c(), c21223b.m208865e(), c21223b.m208866f())) {
                return null;
            }
        }
        Typeface typefaceM136440i = m136440i(objM136442k);
        if (typefaceM136440i == null) {
            return null;
        }
        return Typeface.create(typefaceM136440i, i);
    }
}
