package p153l;

import android.annotation.TargetApi;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.sharedlibrary.loader.C13846a;
import com.tantanapp.sharedlibrary.loader.internal.UtilKt;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class o0j0 {

    /* JADX INFO: renamed from: l.o0j0$a */
    public static final class C19004a {
        /* JADX INFO: renamed from: b */
        public static void m165533b(ClassLoader classLoader, File file) throws Throwable {
            d3f0.m113808a(d3f0.m113809b(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    /* JADX INFO: renamed from: l.o0j0$b */
    public static final class C19005b {
        /* JADX INFO: renamed from: b */
        public static void m165535b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = d3f0.m113809b(classLoader, "pathList").get(classLoader);
            List list = (List) d3f0.m113809b(obj, "nativeLibraryDirectories").get(obj);
            tu2.m192703a("[SharedLibraryLoader]", "V23-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) d3f0.m113809b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM113810c = d3f0.m113810c(obj, "makePathElements", List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM113810c.invoke(obj, list, null, arrayList);
            Field fieldM113809b = d3f0.m113809b(obj, "nativeLibraryPathElements");
            fieldM113809b.setAccessible(true);
            fieldM113809b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.o0j0$c */
    public static final class C19006c {
        /* JADX INFO: renamed from: b */
        public static void m165537b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = d3f0.m113809b(classLoader, "pathList").get(classLoader);
            List list = (List) d3f0.m113809b(obj, "nativeLibraryDirectories").get(obj);
            tu2.m192703a("[SharedLibraryLoader]", "V25-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) d3f0.m113809b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM113810c = d3f0.m113810c(obj, "makePathElements", List.class);
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM113810c.invoke(obj, list);
            Field fieldM113809b = d3f0.m113809b(obj, "nativeLibraryPathElements");
            fieldM113809b.setAccessible(true);
            fieldM113809b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.o0j0$d */
    public static final class C19007d {
        /* JADX INFO: renamed from: b */
        public static void m165539b(ClassLoader classLoader, File file, String str) throws Throwable {
            Object obj = d3f0.m113809b(classLoader, "pathList").get(classLoader);
            ((List) d3f0.m113809b(obj, "nativeLibraryDirectories").get(obj)).add(file);
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            Object objInvoke = d3f0.m113810c(obj, "makePathElements", List.class).invoke(obj, arrayList);
            Field fieldM113809b = d3f0.m113809b(obj, "nativeLibraryPathElements");
            Object obj2 = fieldM113809b.get(obj);
            int length = Array.getLength(obj2);
            int length2 = Array.getLength(objInvoke);
            Object objNewInstance = Array.newInstance(obj2.getClass().getComponentType(), length2 + length);
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = 0;
                    break;
                }
                Object obj3 = Array.get(obj2, i);
                if (obj3 != null && !obj3.toString().contains(str)) {
                    break;
                }
                Array.set(objNewInstance, i, obj3);
                i++;
            }
            for (int i2 = 0; i2 < length2; i2++) {
                Array.set(objNewInstance, i + i2, Array.get(objInvoke, i2));
            }
            while (i < length) {
                Array.set(objNewInstance, i + length2, Array.get(obj2, i));
                i++;
            }
            fieldM113809b.set(obj, objNewInstance);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m165527a(ClassLoader classLoader, File file, C13846a c13846a, Throwable[] thArr, CountDownLatch countDownLatch) {
        try {
            m165531e(classLoader, file, c13846a);
        } catch (Throwable th) {
            try {
                thArr[0] = th;
            } finally {
                countDownLatch.countDown();
            }
        }
        return Unit.INSTANCE;
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: b */
    public static int m165528b() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m165529c(C13846a c13846a, File file) {
        if (file == null) {
            UtilKt.m82704b("failed to get current patch directory.");
            return false;
        }
        if (!file.exists()) {
            UtilKt.m82704b(String.format("tinker lib path [%s] is not exists.", file));
            return false;
        }
        ClassLoader classLoader = c13846a.getContext().getClassLoader();
        if (classLoader == null) {
            UtilKt.m82704b("classloader is null");
            return false;
        }
        UtilKt.m82705c("before hack classloader:" + classLoader.toString());
        try {
            Method declaredMethod = o0j0.class.getDeclaredMethod(Constants.INAPP_DATA_TAG, ClassLoader.class, File.class, C13846a.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, classLoader, file, c13846a);
            return true;
        } catch (IllegalAccessException e) {
            UtilKt.m82704b("installNativeLibraryPath fail:" + file + ", e: " + e);
            return false;
        } catch (NoSuchMethodException e2) {
            UtilKt.m82704b("installNativeLibraryPath fail:" + file + ", e: " + e2);
            return false;
        } catch (InvocationTargetException e3) {
            UtilKt.m82704b("installNativeLibraryPath fail:" + file + ", e: " + e3);
            return false;
        } finally {
            UtilKt.m82705c("after hack classloader:" + classLoader.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m165530d(final ClassLoader classLoader, final File file, final C13846a c13846a) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        c13846a.m82663f().invoke(new Function0() { // from class: l.l0j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o0j0.m165527a(classLoader, file, c13846a, thArr, countDownLatch);
            }
        });
        countDownLatch.await();
        Throwable th = thArr[0];
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m165531e(ClassLoader classLoader, File file, C13846a c13846a) throws Throwable {
        if (file == null || !file.exists()) {
            UtilKt.m82704b(String.format("installNativeLibraryPath, folder %s is illegal", file));
            return;
        }
        tu2.m192703a("[SharedLibraryLoader]", "installNativeLibraryPath folder : " + file.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                C19007d.m165539b(classLoader, file, c13846a.getContext().getPackageName());
                return;
            } catch (Exception e) {
                CrashHelper.m82483g(new RuntimeException("insert so on android 11 error", e));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if ((i != 25 || m165528b() == 0) && i <= 25) {
            try {
                C19005b.m165535b(classLoader, file);
                return;
            } catch (Throwable th) {
                UtilKt.m82704b(String.format("installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage()));
                C19004a.m165533b(classLoader, file);
                return;
            }
        }
        try {
            C19006c.m165537b(classLoader, file);
        } catch (Throwable th2) {
            UtilKt.m82704b(String.format("installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th2.getMessage()));
            C19005b.m165535b(classLoader, file);
        }
    }
}
