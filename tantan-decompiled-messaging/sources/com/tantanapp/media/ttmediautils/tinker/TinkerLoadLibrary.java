package com.tantanapp.media.ttmediautils.tinker;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class TinkerLoadLibrary {
    private static final String TAG = "Tinker.LoadLibrary";

    public static final class V14 {
        private V14() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(ClassLoader classLoader, File file) throws Throwable {
            ShareReflectUtil.expandFieldArray(ShareReflectUtil.findField(classLoader, "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{file});
        }
    }

    public static final class V23 {
        private V23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(ClassLoader classLoader, File file) throws Throwable {
            Object obj = ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            List list = (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
            list.add(0, file);
            List list2 = (List) ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodFindMethod = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
            ArrayList arrayList = new ArrayList();
            list.addAll(list2);
            Object[] objArr = (Object[]) methodFindMethod.invoke(obj, list, null, arrayList);
            Field fieldFindField = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            fieldFindField.setAccessible(true);
            fieldFindField.set(obj, objArr);
        }
    }

    public static final class V25 {
        private V25() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void install(ClassLoader classLoader, File file) throws Throwable {
            Object obj = ShareReflectUtil.findField(classLoader, "pathList").get(classLoader);
            List list = (List) ShareReflectUtil.findField(obj, "nativeLibraryDirectories").get(obj);
            list.add(0, file);
            List list2 = (List) ShareReflectUtil.findField(obj, "systemNativeLibraryDirectories").get(obj);
            Method methodFindMethod = ShareReflectUtil.findMethod(obj, "makePathElements", (Class<?>[]) new Class[]{List.class});
            list.addAll(list2);
            Object[] objArr = (Object[]) methodFindMethod.invoke(obj, list);
            Field fieldFindField = ShareReflectUtil.findField(obj, "nativeLibraryPathElements");
            fieldFindField.setAccessible(true);
            fieldFindField.set(obj, objArr);
        }
    }

    @TargetApi(23)
    private static int getPreviousSdkInt() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static boolean installNativeLibraryABIWithoutTinkerInstalled(Application application, File file) {
        if (file == null) {
            TinkerLog.m81422e(TAG, "failed to get current patch directory.", new Object[0]);
            return false;
        }
        if (!file.exists()) {
            TinkerLog.m81422e(TAG, "tinker lib path [%s] is not exists.", file);
            return false;
        }
        ClassLoader classLoader = application.getClassLoader();
        if (classLoader == null) {
            TinkerLog.m81422e(TAG, "classloader is null", new Object[0]);
            return false;
        }
        TinkerLog.m81423i(TAG, "before hack classloader:" + classLoader.toString(), new Object[0]);
        try {
            try {
                Method declaredMethod = TinkerLoadLibrary.class.getDeclaredMethod("installNativeLibraryPath", ClassLoader.class, File.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader, file);
                TinkerLog.m81423i(TAG, "after hack classloader:" + classLoader.toString(), new Object[0]);
                return true;
            } catch (IllegalAccessException e) {
                TinkerLog.m81422e(TAG, "installNativeLibraryPath fail:" + file + ", e: " + e, new Object[0]);
                TinkerLog.m81423i(TAG, "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (NoSuchMethodException e2) {
                TinkerLog.m81422e(TAG, "installNativeLibraryPath fail:" + file + ", e: " + e2, new Object[0]);
                TinkerLog.m81423i(TAG, "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            } catch (InvocationTargetException e3) {
                TinkerLog.m81422e(TAG, "installNativeLibraryPath fail:" + file + ", e: " + e3, new Object[0]);
                TinkerLog.m81423i(TAG, "after hack classloader:" + classLoader.toString(), new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            TinkerLog.m81423i(TAG, "after hack classloader:" + classLoader.toString(), new Object[0]);
            throw th;
        }
    }

    public static synchronized void installNativeLibraryPath(ClassLoader classLoader, File file) throws Throwable {
        if (file != null) {
            try {
                if (file.exists()) {
                    file.getAbsolutePath();
                    int i = Build.VERSION.SDK_INT;
                    if ((i != 25 || getPreviousSdkInt() == 0) && i <= 25) {
                        try {
                            V23.install(classLoader, file);
                        } catch (Throwable th) {
                            TinkerLog.m81422e(TAG, "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", Integer.valueOf(Build.VERSION.SDK_INT), th.getMessage());
                            V14.install(classLoader, file);
                        }
                        return;
                    }
                    try {
                        V25.install(classLoader, file);
                        return;
                    } catch (Throwable th2) {
                        TinkerLog.m81422e(TAG, "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", Integer.valueOf(Build.VERSION.SDK_INT), th2.getMessage());
                        V23.install(classLoader, file);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        TinkerLog.m81422e(TAG, "installNativeLibraryPath, folder %s is illegal", file);
    }
}
