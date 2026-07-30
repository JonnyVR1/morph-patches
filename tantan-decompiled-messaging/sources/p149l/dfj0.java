package p149l;

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
public class dfj0 extends hfj0 {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f85949b;

    /* JADX INFO: renamed from: c */
    public static final Constructor<?> f85950c;

    /* JADX INFO: renamed from: d */
    public static final Method f85951d;

    /* JADX INFO: renamed from: e */
    public static final Method f85952e;

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
        f85950c = constructor;
        f85949b = cls;
        f85951d = method2;
        f85952e = method;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m111468h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f85951d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m111469i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f85949b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f85952e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m111470j() {
        return f85951d != null;
    }

    /* JADX INFO: renamed from: k */
    private static Object m111471k() {
        try {
            return f85950c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo106577a(Context context, ayi.C15760c c15760c, Resources resources, int i) {
        Object objM111471k = m111471k();
        if (objM111471k == null) {
            return null;
        }
        for (ayi.C15761d c15761d : c15760c.m99554a()) {
            ByteBuffer byteBufferM135930b = ifj0.m135930b(context, resources, c15761d.m99556b());
            if (byteBufferM135930b == null || !m111468h(objM111471k, byteBufferM135930b, c15761d.m99557c(), c15761d.m99559e(), c15761d.m99560f())) {
                return null;
            }
        }
        return m111469i(objM111471k);
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo106578b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        Object objM111471k = m111471k();
        if (objM111471k == null) {
            return null;
        }
        hgf0 hgf0Var = new hgf0();
        for (byi.C16014b c16014b : c16014bArr) {
            Uri uriM104467d = c16014b.m104467d();
            ByteBuffer byteBufferM135934f = (ByteBuffer) hgf0Var.get(uriM104467d);
            if (byteBufferM135934f == null) {
                byteBufferM135934f = ifj0.m135934f(context, cancellationSignal, uriM104467d);
                hgf0Var.put(uriM104467d, byteBufferM135934f);
            }
            if (byteBufferM135934f == null || !m111468h(objM111471k, byteBufferM135934f, c16014b.m104466c(), c16014b.m104468e(), c16014b.m104469f())) {
                return null;
            }
        }
        Typeface typefaceM111469i = m111469i(objM111471k);
        if (typefaceM111469i == null) {
            return null;
        }
        return Typeface.create(typefaceM111469i, i);
    }
}
