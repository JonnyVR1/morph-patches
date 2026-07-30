package p153l;

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
public class goj0 extends loj0 {

    /* JADX INFO: renamed from: b */
    public static Class<?> f105299b = null;

    /* JADX INFO: renamed from: c */
    public static Constructor<?> f105300c = null;

    /* JADX INFO: renamed from: d */
    public static Method f105301d = null;

    /* JADX INFO: renamed from: e */
    public static Method f105302e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f105303f = false;

    /* JADX INFO: renamed from: h */
    public static boolean m131111h(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m131113k();
        try {
            return ((Boolean) f105301d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            iig0.m140070a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m131112i(Object obj) throws NoSuchMethodException {
        m131113k();
        try {
            Object objNewInstance = Array.newInstance(f105299b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f105302e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m131113k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f105303f) {
            return;
        }
        f105303f = true;
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
        f105300c = constructor;
        f105299b = cls;
        f105301d = method2;
        f105302e = method;
    }

    /* JADX INFO: renamed from: l */
    private static Object m131114l() throws NoSuchMethodException {
        m131113k();
        try {
            return f105300c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @Override // p153l.loj0
    /* JADX INFO: renamed from: a */
    public Typeface mo131115a(Context context, w0j.C20974c c20974c, Resources resources, int i) throws NoSuchMethodException {
        Object objM131114l = m131114l();
        for (w0j.C20975d c20975d : c20974c.m204190a()) {
            File fileM159293e = moj0.m159293e(context);
            if (fileM159293e == null) {
                return null;
            }
            try {
                if (!moj0.m159291c(fileM159293e, resources, c20975d.m204192b())) {
                    return null;
                }
                if (!m131111h(objM131114l, fileM159293e.getPath(), c20975d.m204195e(), c20975d.m204196f())) {
                    return null;
                }
                fileM159293e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM159293e.delete();
            }
        }
        return m131112i(objM131114l);
    }

    @Override // p153l.loj0
    /* JADX INFO: renamed from: b */
    public Typeface mo131116b(Context context, CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        Typeface typefaceM155087c;
        if (c21223bArr.length < 1) {
            return null;
        }
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
                File fileM131117j = m131117j(parcelFileDescriptorOpenFileDescriptor);
                if (fileM131117j == null || !fileM131117j.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceM155087c = super.m155087c(context, fileInputStream);
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
                    typefaceM155087c = Typeface.createFromFile(fileM131117j);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceM155087c;
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
    public final File m131117j(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
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
