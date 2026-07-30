package p149l;

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
public class efj0 extends cfj0 {

    /* JADX INFO: renamed from: g */
    public final Class<?> f90841g;

    /* JADX INFO: renamed from: h */
    public final Constructor<?> f90842h;

    /* JADX INFO: renamed from: i */
    public final Method f90843i;

    /* JADX INFO: renamed from: j */
    public final Method f90844j;

    /* JADX INFO: renamed from: k */
    public final Method f90845k;

    /* JADX INFO: renamed from: l */
    public final Method f90846l;

    /* JADX INFO: renamed from: m */
    public final Method f90847m;

    public efj0() {
        Class<?> clsM116083v;
        Constructor<?> constructorM116084w;
        Method methodM116080s;
        Method methodM116081t;
        Method methodM116085x;
        Method methodM116079r;
        Method methodMo116082u;
        try {
            clsM116083v = m116083v();
            constructorM116084w = m116084w(clsM116083v);
            methodM116080s = m116080s(clsM116083v);
            methodM116081t = m116081t(clsM116083v);
            methodM116085x = m116085x(clsM116083v);
            methodM116079r = m116079r(clsM116083v);
            methodMo116082u = mo116082u(clsM116083v);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            clsM116083v = null;
            constructorM116084w = null;
            methodM116080s = null;
            methodM116081t = null;
            methodM116085x = null;
            methodM116079r = null;
            methodMo116082u = null;
        }
        this.f90841g = clsM116083v;
        this.f90842h = constructorM116084w;
        this.f90843i = methodM116080s;
        this.f90844j = methodM116081t;
        this.f90845k = methodM116085x;
        this.f90846l = methodM116079r;
        this.f90847m = methodMo116082u;
    }

    @Override // p149l.cfj0, p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo106577a(Context context, ayi.C15760c c15760c, Resources resources, int i) {
        if (!m116078q()) {
            return super.mo106577a(context, c15760c, resources, i);
        }
        Object objM116073l = m116073l();
        if (objM116073l == null) {
            return null;
        }
        ayi.C15761d[] c15761dArrM99554a = c15760c.m99554a();
        int length = c15761dArrM99554a.length;
        int i2 = 0;
        while (i2 < length) {
            ayi.C15761d c15761d = c15761dArrM99554a[i2];
            String strM99555a = c15761d.m99555a();
            int iM99557c = c15761d.m99557c();
            int iM99559e = c15761d.m99559e();
            boolean zM99560f = c15761d.m99560f();
            FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c15761d.m99558d());
            efj0 efj0Var = this;
            Context context2 = context;
            if (!efj0Var.m116075n(context2, objM116073l, strM99555a, iM99557c, iM99559e, zM99560f ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                efj0Var.m116074m(objM116073l);
                return null;
            }
            i2++;
            this = efj0Var;
            context = context2;
        }
        efj0 efj0Var2 = this;
        if (efj0Var2.m116077p(objM116073l)) {
            return efj0Var2.mo116072i(objM116073l);
        }
        return null;
    }

    @Override // p149l.cfj0, p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo106578b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        Typeface typefaceMo116072i;
        Object obj;
        efj0 efj0Var;
        if (c16014bArr.length < 1) {
            return null;
        }
        if (!m116078q()) {
            byi.C16014b c16014bM130769g = m130769g(c16014bArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c16014bM130769g.m104467d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c16014bM130769g.m104468e()).setItalic(c16014bM130769g.m104469f()).build();
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
        Map<Uri, ByteBuffer> mapM135936h = ifj0.m135936h(context, c16014bArr, cancellationSignal);
        Object objM116073l = m116073l();
        if (objM116073l == null) {
            return null;
        }
        int length = c16014bArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            byi.C16014b c16014b = c16014bArr[i2];
            ByteBuffer byteBuffer = mapM135936h.get(c16014b.m104467d());
            if (byteBuffer == null) {
                obj = objM116073l;
                efj0Var = this;
            } else {
                efj0 efj0Var2 = this;
                boolean zM116076o = efj0Var2.m116076o(objM116073l, byteBuffer, c16014b.m104466c(), c16014b.m104468e(), c16014b.m104469f() ? 1 : 0);
                obj = objM116073l;
                efj0Var = efj0Var2;
                if (!zM116076o) {
                    efj0Var.m116074m(obj);
                    return null;
                }
                z = true;
            }
            i2++;
            this = efj0Var;
            objM116073l = obj;
            z = z;
        }
        Object obj2 = objM116073l;
        efj0 efj0Var3 = this;
        if (!z) {
            efj0Var3.m116074m(obj2);
            return null;
        }
        if (efj0Var3.m116077p(obj2) && (typefaceMo116072i = efj0Var3.mo116072i(obj2)) != null) {
            return Typeface.create(typefaceMo116072i, i);
        }
        return null;
    }

    @Override // p149l.hfj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo116071d(Context context, Resources resources, int i, String str, int i2) {
        if (!m116078q()) {
            return super.mo116071d(context, resources, i, str, i2);
        }
        Object objM116073l = m116073l();
        if (objM116073l == null) {
            return null;
        }
        if (!m116075n(context, objM116073l, str, 0, -1, -1, null)) {
            m116074m(objM116073l);
            return null;
        }
        if (m116077p(objM116073l)) {
            return mo116072i(objM116073l);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Typeface mo116072i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f90841g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f90847m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m116073l() {
        try {
            return this.f90842h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m116074m(Object obj) {
        try {
            this.f90846l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m116075n(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f90843i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m116076o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f90844j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m116077p(Object obj) {
        try {
            return ((Boolean) this.f90845k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m116078q() {
        return this.f90843i != null;
    }

    /* JADX INFO: renamed from: r */
    public Method m116079r(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    /* JADX INFO: renamed from: s */
    public Method m116080s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: t */
    public Method m116081t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: u */
    public Method mo116082u(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: v */
    public Class<?> m116083v() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: w */
    public Constructor<?> m116084w(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: x */
    public Method m116085x(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }
}
