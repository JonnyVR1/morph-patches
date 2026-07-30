package p149l;

import android.annotation.TargetApi;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.sharedlibrary.loader.C13683a;
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

/* JADX INFO: loaded from: classes13.dex */
public class lri0 {

    /* JADX INFO: renamed from: l.lri0$a */
    public static final class C18304a {
        /* JADX INFO: renamed from: b */
        public static void m151381b(ClassLoader classLoader, File file) throws Throwable {
            wue0.m205619a(wue0.m205620b(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    /* JADX INFO: renamed from: l.lri0$b */
    public static final class C18305b {
        /* JADX INFO: renamed from: b */
        public static void m151383b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = wue0.m205620b(classLoader, "pathList").get(classLoader);
            List list = (List) wue0.m205620b(obj, "nativeLibraryDirectories").get(obj);
            du2.m113670a("[SharedLibraryLoader]", "V23-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) wue0.m205620b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM205621c = wue0.m205621c(obj, "makePathElements", List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM205621c.invoke(obj, list, null, arrayList);
            Field fieldM205620b = wue0.m205620b(obj, "nativeLibraryPathElements");
            fieldM205620b.setAccessible(true);
            fieldM205620b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.lri0$c */
    public static final class C18306c {
        /* JADX INFO: renamed from: b */
        public static void m151385b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = wue0.m205620b(classLoader, "pathList").get(classLoader);
            List list = (List) wue0.m205620b(obj, "nativeLibraryDirectories").get(obj);
            du2.m113670a("[SharedLibraryLoader]", "V25-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) wue0.m205620b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM205621c = wue0.m205621c(obj, "makePathElements", List.class);
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM205621c.invoke(obj, list);
            Field fieldM205620b = wue0.m205620b(obj, "nativeLibraryPathElements");
            fieldM205620b.setAccessible(true);
            fieldM205620b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.lri0$d */
    public static final class C18307d {
        /* JADX INFO: renamed from: b */
        public static void m151387b(ClassLoader classLoader, File file, String str) throws Throwable {
            Object obj = wue0.m205620b(classLoader, "pathList").get(classLoader);
            ((List) wue0.m205620b(obj, "nativeLibraryDirectories").get(obj)).add(file);
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            Object objInvoke = wue0.m205621c(obj, "makePathElements", List.class).invoke(obj, arrayList);
            Field fieldM205620b = wue0.m205620b(obj, "nativeLibraryPathElements");
            Object obj2 = fieldM205620b.get(obj);
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
            fieldM205620b.set(obj, objNewInstance);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m151375a(ClassLoader classLoader, File file, C13683a c13683a, Throwable[] thArr, CountDownLatch countDownLatch) {
        try {
            m151379e(classLoader, file, c13683a);
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
    public static int m151376b() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m151377c(C13683a c13683a, File file) {
        if (file == null) {
            UtilKt.m81521b("failed to get current patch directory.");
            return false;
        }
        if (!file.exists()) {
            UtilKt.m81521b(String.format("tinker lib path [%s] is not exists.", file));
            return false;
        }
        ClassLoader classLoader = c13683a.getContext().getClassLoader();
        if (classLoader == null) {
            UtilKt.m81521b("classloader is null");
            return false;
        }
        UtilKt.m81522c("before hack classloader:" + classLoader.toString());
        try {
            Method declaredMethod = lri0.class.getDeclaredMethod(Constants.INAPP_DATA_TAG, ClassLoader.class, File.class, C13683a.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, classLoader, file, c13683a);
            return true;
        } catch (IllegalAccessException e) {
            UtilKt.m81521b("installNativeLibraryPath fail:" + file + ", e: " + e);
            return false;
        } catch (NoSuchMethodException e2) {
            UtilKt.m81521b("installNativeLibraryPath fail:" + file + ", e: " + e2);
            return false;
        } catch (InvocationTargetException e3) {
            UtilKt.m81521b("installNativeLibraryPath fail:" + file + ", e: " + e3);
            return false;
        } finally {
            UtilKt.m81522c("after hack classloader:" + classLoader.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m151378d(final ClassLoader classLoader, final File file, final C13683a c13683a) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] thArr = new Throwable[1];
        c13683a.m81480f().invoke(new Function0() { // from class: l.iri0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lri0.m151375a(classLoader, file, c13683a, thArr, countDownLatch);
            }
        });
        countDownLatch.await();
        Throwable th = thArr[0];
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m151379e(ClassLoader classLoader, File file, C13683a c13683a) throws Throwable {
        if (file == null || !file.exists()) {
            UtilKt.m81521b(String.format("installNativeLibraryPath, folder %s is illegal", file));
            return;
        }
        du2.m113670a("[SharedLibraryLoader]", "installNativeLibraryPath folder : " + file.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                C18307d.m151387b(classLoader, file, c13683a.getContext().getPackageName());
                return;
            } catch (Exception e) {
                CrashHelper.m81300g(new RuntimeException("insert so on android 11 error", e));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if ((i != 25 || m151376b() == 0) && i <= 25) {
            try {
                C18305b.m151383b(classLoader, file);
                return;
            } catch (Throwable th) {
                UtilKt.m81521b(String.format("installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage()));
                C18304a.m151381b(classLoader, file);
                return;
            }
        }
        try {
            C18306c.m151385b(classLoader, file);
        } catch (Throwable th2) {
            UtilKt.m81521b(String.format("installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th2.getMessage()));
            C18305b.m151383b(classLoader, file);
        }
    }
}
