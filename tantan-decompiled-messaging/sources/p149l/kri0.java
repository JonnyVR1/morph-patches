package p149l;

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

/* JADX INFO: loaded from: classes13.dex */
public class kri0 {

    /* JADX INFO: renamed from: l.kri0$a */
    public static final class C18063a {
        /* JADX INFO: renamed from: b */
        public static void m146986b(ClassLoader classLoader, File file) throws Throwable {
            xue0.m211091a(xue0.m211092b(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    /* JADX INFO: renamed from: l.kri0$b */
    public static final class C18064b {
        /* JADX INFO: renamed from: b */
        public static void m146988b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = xue0.m211092b(classLoader, "pathList").get(classLoader);
            List list = (List) xue0.m211092b(obj, "nativeLibraryDirectories").get(obj);
            du2.m113670a("[putong-common]", "V23-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) xue0.m211092b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM211093c = xue0.m211093c(obj, "makePathElements", List.class, File.class, List.class);
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM211093c.invoke(obj, list, null, arrayList);
            Field fieldM211092b = xue0.m211092b(obj, "nativeLibraryPathElements");
            fieldM211092b.setAccessible(true);
            fieldM211092b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.kri0$c */
    public static final class C18065c {
        /* JADX INFO: renamed from: b */
        public static void m146990b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = xue0.m211092b(classLoader, "pathList").get(classLoader);
            List list = (List) xue0.m211092b(obj, "nativeLibraryDirectories").get(obj);
            du2.m113670a("[putong-common]", "V25-nativeLibraryDirectories::" + list.toString());
            list.add(0, file);
            List list2 = (List) xue0.m211092b(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodM211093c = xue0.m211093c(obj, "makePathElements", List.class);
            list.addAll(list2);
            Object[] objArr = (Object[]) methodM211093c.invoke(obj, list);
            Field fieldM211092b = xue0.m211092b(obj, "nativeLibraryPathElements");
            fieldM211092b.setAccessible(true);
            fieldM211092b.set(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: l.kri0$d */
    public static final class C18066d {
        /* JADX INFO: renamed from: b */
        public static void m146992b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = xue0.m211092b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            arrayList.add(file.getAbsolutePath());
            xue0.m211093c(obj, "addNativePath", Collection.class).invoke(obj, arrayList);
            ((List) xue0.m211092b(obj, "nativeLibraryDirectories").get(obj)).add(file);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable m146979a(ClassLoader classLoader, File file) {
        try {
            m146984f(classLoader, file);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m146980b(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        return absolutePath.endsWith(".zip!") ? new File(absolutePath.substring(0, absolutePath.length() - 1)).exists() : file.exists();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: c */
    public static int m146981c() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m146982d(Application application, File file) {
        if (file == null) {
            mri0.m156028a("Tinker.LoadLibrary", "failed to get current patch directory.", new Object[0]);
            return false;
        }
        if (!m146980b(file)) {
            mri0.m156028a("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", file);
            return false;
        }
        ClassLoader classLoader = application.getClassLoader();
        if (classLoader == null) {
            mri0.m156028a("Tinker.LoadLibrary", "classloader is null", new Object[0]);
            return false;
        }
        mri0.m156029b("Tinker.LoadLibrary", "before hack classloader:" + classLoader.toString(), new Object[0]);
        try {
            try {
                Method declaredMethod = kri0.class.getDeclaredMethod("e", ClassLoader.class, File.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader, file);
                mri0.m156029b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return true;
            } catch (IllegalAccessException e) {
                mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e, new Object[0]);
                mri0.m156029b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (NoSuchMethodException e2) {
                mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e2, new Object[0]);
                mri0.m156029b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (InvocationTargetException e3) {
                mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", e: " + e3, new Object[0]);
                mri0.m156029b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            mri0.m156029b("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new Object[0]);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m146983e(final ClassLoader classLoader, final File file) throws Throwable {
        Throwable thInvoke = SharedLibraryManagerInitializer.m81269a().invoke(new Function0() { // from class: l.jri0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kri0.m146979a(classLoader, file);
            }
        });
        if (thInvoke != null) {
            throw thInvoke;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m146984f(ClassLoader classLoader, File file) throws Throwable {
        if (!m146980b(file)) {
            mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", file);
            return;
        }
        du2.m113670a("[putong-common]", "installNativeLibraryPath folder : " + file.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                C18066d.m146992b(classLoader, file);
                return;
            } catch (Exception e) {
                CrashHelper.m81300g(new RuntimeException("insert so on android 11 error", e));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if ((i != 25 || m146981c() == 0) && i <= 25) {
            try {
                C18064b.m146988b(classLoader, file);
                return;
            } catch (Throwable th) {
                mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage());
                C18063a.m146986b(classLoader, file);
                return;
            }
        }
        try {
            C18065c.m146990b(classLoader, file);
        } catch (Throwable th2) {
            mri0.m156028a("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th2.getMessage());
            C18064b.m146988b(classLoader, file);
        }
    }
}
