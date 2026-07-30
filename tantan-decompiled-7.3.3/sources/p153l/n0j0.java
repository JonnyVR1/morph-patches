package p153l;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import com.tantanapp.common.nativelib.manager.SharedLibraryManagerInitializer;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class n0j0 {

    /* JADX INFO: renamed from: l.n0j0$a */
    public static final class C18754a {
        /* JADX INFO: renamed from: b */
        public static void m160997b(ClassLoader classLoader, File file) throws Throwable {
            e3f0.m119283a(e3f0.m119284b(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    /* JADX INFO: renamed from: l.n0j0$b */
    public static final class C18755b {
        /* JADX INFO: renamed from: b */
        public static void m160999b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = e3f0.m119284b(classLoader, "pathList").get(classLoader);
            List list = (List) e3f0.m119284b(obj, "nativeLibraryDirectories").get(obj);
            tu2.m192703a("[putong-common]", "V23-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) e3f0.m119284b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM119285c = e3f0.m119285c(obj, "makePathElements", List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM119285c.invoke(obj, list, null, arrayList);
            Field fieldM119284b = e3f0.m119284b(obj, "nativeLibraryPathElements");
            fieldM119284b.setAccessible(true);
            fieldM119284b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.n0j0$c */
    public static final class C18756c {
        /* JADX INFO: renamed from: b */
        public static void m161001b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = e3f0.m119284b(classLoader, "pathList").get(classLoader);
            List list = (List) e3f0.m119284b(obj, "nativeLibraryDirectories").get(obj);
            tu2.m192703a("[putong-common]", "V25-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) e3f0.m119284b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM119285c = e3f0.m119285c(obj, "makePathElements", List.class);
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM119285c.invoke(obj, list);
            Field fieldM119284b = e3f0.m119284b(obj, "nativeLibraryPathElements");
            fieldM119284b.setAccessible(true);
            fieldM119284b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.n0j0$d */
    public static final class C18757d {
        /* JADX INFO: renamed from: b */
        public static void m161003b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = e3f0.m119284b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            arrayList.add(file.getAbsolutePath());
            e3f0.m119285c(obj, "addNativePath", Collection.class).invoke(obj, arrayList);
            ((List) e3f0.m119284b(obj, "nativeLibraryDirectories").get(obj)).add(file);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable m160990a(ClassLoader classLoader, File file) {
        try {
            m160995f(classLoader, file);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m160991b(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        return absolutePath.endsWith(".zip!") ? new File(absolutePath.substring(0, absolutePath.length() - 1)).exists() : file.exists();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: c */
    public static int m160992c() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m160993d(Application application, File file) {
        if (file == null) {
            p0j0.m170057a("Tinker.LoadLibrary", "failed to get current patch directory.", new Object[0]);
            return false;
        }
        if (!m160991b(file)) {
            p0j0.m170057a("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", file);
            return false;
        }
        ClassLoader classLoader = application.getClassLoader();
        if (classLoader == null) {
            p0j0.m170057a("Tinker.LoadLibrary", "classloader is null", new Object[0]);
            return false;
        }
        p0j0.m170058b("Tinker.LoadLibrary", "before hack classloader:" + classLoader.toString(), new Object[0]);
        try {
            try {
                Method declaredMethod = n0j0.class.getDeclaredMethod("e", ClassLoader.class, File.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader, file);
                p0j0.m170058b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return true;
            } catch (IllegalAccessException e) {
                p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e, new Object[0]);
                p0j0.m170058b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (NoSuchMethodException e2) {
                p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e2, new Object[0]);
                p0j0.m170058b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (InvocationTargetException e3) {
                p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e3, new Object[0]);
                p0j0.m170058b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            p0j0.m170058b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m160994e(final ClassLoader classLoader, final File file) throws Throwable {
        Throwable thInvoke = SharedLibraryManagerInitializer.m82452a().invoke(new Function0() { // from class: l.m0j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n0j0.m160990a(classLoader, file);
            }
        });
        if (thInvoke != null) {
            throw thInvoke;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m160995f(ClassLoader classLoader, File file) throws Throwable {
        if (!m160991b(file)) {
            p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", file);
            return;
        }
        tu2.m192703a("[putong-common]", "installNativeLibraryPath folder : " + file.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                C18757d.m161003b(classLoader, file);
                return;
            } catch (Exception e) {
                CrashHelper.m82483g(new RuntimeException("insert so on android 11 error", e));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if ((i != 25 || m160992c() == 0) && i <= 25) {
            try {
                C18755b.m160999b(classLoader, file);
                return;
            } catch (Throwable th) {
                p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage());
                C18754a.m160997b(classLoader, file);
                return;
            }
        }
        try {
            C18756c.m161001b(classLoader, file);
        } catch (Throwable th2) {
            p0j0.m170057a("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th2.getMessage());
            C18755b.m160999b(classLoader, file);
        }
    }
}
