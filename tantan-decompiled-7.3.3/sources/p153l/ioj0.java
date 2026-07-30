package p153l;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ioj0 extends goj0 {

    /* JADX INFO: renamed from: g */
    public final Class<?> f116169g;

    /* JADX INFO: renamed from: h */
    public final Constructor<?> f116170h;

    /* JADX INFO: renamed from: i */
    public final Method f116171i;

    /* JADX INFO: renamed from: j */
    public final Method f116172j;

    /* JADX INFO: renamed from: k */
    public final Method f116173k;

    /* JADX INFO: renamed from: l */
    public final Method f116174l;

    /* JADX INFO: renamed from: m */
    public final Method f116175m;

    public ioj0() {
        Class<?> clsM141331v;
        Constructor<?> constructorM141332w;
        Method methodM141328s;
        Method methodM141329t;
        Method methodM141333x;
        Method methodM141327r;
        Method methodMo141330u;
        try {
            clsM141331v = m141331v();
            constructorM141332w = m141332w(clsM141331v);
            methodM141328s = m141328s(clsM141331v);
            methodM141329t = m141329t(clsM141331v);
            methodM141333x = m141333x(clsM141331v);
            methodM141327r = m141327r(clsM141331v);
            methodMo141330u = mo141330u(clsM141331v);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            clsM141331v = null;
            constructorM141332w = null;
            methodM141328s = null;
            methodM141329t = null;
            methodM141333x = null;
            methodM141327r = null;
            methodMo141330u = null;
        }
        this.f116169g = clsM141331v;
        this.f116170h = constructorM141332w;
        this.f116171i = methodM141328s;
        this.f116172j = methodM141329t;
        this.f116173k = methodM141333x;
        this.f116174l = methodM141327r;
        this.f116175m = methodMo141330u;
    }

    @Override // p153l.goj0, p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo131115a(Context context, w0j.C20974c c20974c, Resources resources, int i) {
        if (!m141326q()) {
            return super.mo131115a(context, c20974c, resources, i);
        }
        Object objM141321l = m141321l();
        if (objM141321l == null) {
            return null;
        }
        w0j.C20975d[] c20975dArrM204190a = c20974c.m204190a();
        int length = c20975dArrM204190a.length;
        int i2 = 0;
        while (i2 < length) {
            w0j.C20975d c20975d = c20975dArrM204190a[i2];
            String strM204191a = c20975d.m204191a();
            int iM204193c = c20975d.m204193c();
            int iM204195e = c20975d.m204195e();
            boolean zM204196f = c20975d.m204196f();
            FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c20975d.m204194d());
            ioj0 ioj0Var = this;
            Context context2 = context;
            if (!ioj0Var.m141323n(context2, objM141321l, strM204191a, iM204193c, iM204195e, zM204196f ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                ioj0Var.m141322m(objM141321l);
                return null;
            }
            i2++;
            this = ioj0Var;
            context = context2;
        }
        ioj0 ioj0Var2 = this;
        if (ioj0Var2.m141325p(objM141321l)) {
            return ioj0Var2.mo141320i(objM141321l);
        }
        return null;
    }

    @Override // p153l.goj0, p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo131116b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        Typeface typefaceMo141320i;
        Object obj;
        ioj0 ioj0Var;
        if (c21223bArr.length < 1) {
            return null;
        }
        if (!m141326q()) {
            x0j.C21223b c21223bM155088g = m155088g(c21223bArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c21223bM155088g.m208864d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c21223bM155088g.m208865e()).setItalic(c21223bM155088g.m208866f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM159296h = moj0.m159296h(context, c21223bArr, cancellationSignal);
        Object objM141321l = m141321l();
        if (objM141321l == null) {
            return null;
        }
        int length = c21223bArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            x0j.C21223b c21223b = c21223bArr[i2];
            ByteBuffer byteBuffer = mapM159296h.get(c21223b.m208864d());
            if (byteBuffer == null) {
                obj = objM141321l;
                ioj0Var = this;
            } else {
                ioj0 ioj0Var2 = this;
                boolean zM141324o = ioj0Var2.m141324o(objM141321l, byteBuffer, c21223b.m208863c(), c21223b.m208865e(), c21223b.m208866f() ? 1 : 0);
                obj = objM141321l;
                ioj0Var = ioj0Var2;
                if (!zM141324o) {
                    ioj0Var.m141322m(obj);
                    return null;
                }
                z = true;
            }
            i2++;
            this = ioj0Var;
            objM141321l = obj;
            z = z;
        }
        Object obj2 = objM141321l;
        ioj0 ioj0Var3 = this;
        if (!z) {
            ioj0Var3.m141322m(obj2);
            return null;
        }
        if (ioj0Var3.m141325p(obj2) && (typefaceMo141320i = ioj0Var3.mo141320i(obj2)) != null) {
            return Typeface.create(typefaceMo141320i, i);
        }
        return null;
    }

    @Override // p153l.loj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo141319d(Context context, Resources resources, int i, String str, int i2) {
        if (!m141326q()) {
            return super.mo141319d(context, resources, i, str, i2);
        }
        Object objM141321l = m141321l();
        if (objM141321l == null) {
            return null;
        }
        if (!m141323n(context, objM141321l, str, 0, -1, -1, null)) {
            m141322m(objM141321l);
            return null;
        }
        if (m141325p(objM141321l)) {
            return mo141320i(objM141321l);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Typeface mo141320i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f116169g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f116175m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m141321l() {
        try {
            return this.f116170h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m141322m(Object obj) {
        try {
            this.f116174l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m141323n(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f116171i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m141324o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f116172j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m141325p(Object obj) {
        try {
            return ((Boolean) this.f116173k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m141326q() {
        return this.f116171i != null;
    }

    /* JADX INFO: renamed from: r */
    public Method m141327r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    /* JADX INFO: renamed from: s */
    public Method m141328s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: t */
    public Method m141329t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: u */
    public Method mo141330u(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: v */
    public Class<?> m141331v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: w */
    public Constructor<?> m141332w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: x */
    public Method m141333x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }
}
