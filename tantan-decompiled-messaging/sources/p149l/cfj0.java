package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class cfj0 extends hfj0 {

    /* JADX INFO: renamed from: b */
    public static Class<?> f80627b = null;

    /* JADX INFO: renamed from: c */
    public static Constructor<?> f80628c = null;

    /* JADX INFO: renamed from: d */
    public static Method f80629d = null;

    /* JADX INFO: renamed from: e */
    public static Method f80630e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f80631f = false;

    /* JADX INFO: renamed from: h */
    public static boolean m106573h(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m106575k();
        try {
            return ((Boolean) f80629d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            aag0.m95543a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m106574i(Object obj) throws NoSuchMethodException {
        m106575k();
        try {
            Object objNewInstance = Array.newInstance(f80627b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f80630e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m106575k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f80631f) {
            return;
        }
        f80631f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f80628c = constructor;
        f80627b = cls;
        f80629d = method2;
        f80630e = method;
    }

    /* JADX INFO: renamed from: l */
    private static Object m106576l() throws NoSuchMethodException {
        m106575k();
        try {
            return f80628c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    @Override // p149l.hfj0
    /* JADX INFO: renamed from: a */
    public Typeface mo106577a(Context context, ayi.C15760c c15760c, Resources resources, int i) throws NoSuchMethodException {
        Object objM106576l = m106576l();
        for (ayi.C15761d c15761d : c15760c.m99554a()) {
            File fileM135933e = ifj0.m135933e(context);
            if (fileM135933e == null) {
                return null;
            }
            try {
                if (!ifj0.m135931c(fileM135933e, resources, c15761d.m99556b())) {
                    return null;
                }
                if (!m106573h(objM106576l, fileM135933e.getPath(), c15761d.m99559e(), c15761d.m99560f())) {
                    return null;
                }
                fileM135933e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM135933e.delete();
            }
        }
        return m106574i(objM106576l);
    }

    @Override // p149l.hfj0
    /* JADX INFO: renamed from: b */
    public Typeface mo106578b(Context context, CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        Typeface typefaceM130768c;
        if (c16014bArr.length < 1) {
            return null;
        }
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
                File fileM106579j = m106579j(parcelFileDescriptorOpenFileDescriptor);
                if (fileM106579j == null || !fileM106579j.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceM130768c = super.m130768c(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    typefaceM130768c = Typeface.createFromFile(fileM106579j);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceM130768c;
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final File m106579j(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
