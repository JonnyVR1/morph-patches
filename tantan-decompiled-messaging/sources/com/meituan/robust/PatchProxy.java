package com.meituan.robust;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class PatchProxy {
    private static CopyOnWriteArrayList<RobustExtension> registerExtensionList = new CopyOnWriteArrayList<>();
    private static ThreadLocal<RobustExtension> robustExtensionThreadLocal = new ThreadLocal<>();

    public static Object accessDispatch(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            String classMethod = getClassMethod(z, i);
            if (TextUtils.isEmpty(classMethod)) {
                return null;
            }
            notify(Constants.PATCH_EXECUTE);
            return changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
        }
        RobustExtension robustExtension = robustExtensionThreadLocal.get();
        robustExtensionThreadLocal.remove();
        if (robustExtension == null) {
            return null;
        }
        notify(robustExtension.describeSelfFunction());
        return robustExtension.accessDispatch(new RobustArguments(objArr, obj, z, i, clsArr, cls));
    }

    public static void accessDispatchVoid(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            notify(Constants.PATCH_EXECUTE);
            String classMethod = getClassMethod(z, i);
            if (TextUtils.isEmpty(classMethod)) {
                return;
            }
            changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
            return;
        }
        RobustExtension robustExtension = robustExtensionThreadLocal.get();
        robustExtensionThreadLocal.remove();
        if (robustExtension != null) {
            notify(robustExtension.describeSelfFunction());
            robustExtension.accessDispatch(new RobustArguments(objArr, obj, z, i, clsArr, cls));
        }
    }

    private static String getClassMethod(boolean z, int i) {
        try {
            return "::" + z + ":" + i;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String[] getClassMethodName() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return new String[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()};
    }

    private static Object[] getObjects(Object[] objArr, Object obj, boolean z) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        Object[] objArr2 = z ? new Object[length] : new Object[length + 1];
        int i = 0;
        while (i < length) {
            objArr2[i] = objArr[i];
            i++;
        }
        if (!z) {
            objArr2[i] = obj;
        }
        return objArr2;
    }

    public static boolean isSupport(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        if (changeQuickRedirect != null) {
            String classMethod = getClassMethod(z, i);
            if (TextUtils.isEmpty(classMethod)) {
                return false;
            }
            try {
                return changeQuickRedirect.isSupport(classMethod, getObjects(objArr, obj, z));
            } catch (Throwable unused) {
                return false;
            }
        }
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            for (RobustExtension robustExtension : registerExtensionList) {
                Object[] objArr2 = objArr;
                Object obj2 = obj;
                boolean z2 = z;
                int i2 = i;
                Class[] clsArr2 = clsArr;
                Class cls2 = cls;
                if (robustExtension.isSupport(new RobustArguments(objArr2, obj2, z2, i2, clsArr2, cls2))) {
                    robustExtensionThreadLocal.set(robustExtension);
                    return true;
                }
                objArr = objArr2;
                obj = obj2;
                z = z2;
                i = i2;
                clsArr = clsArr2;
                cls = cls2;
            }
        }
        return false;
    }

    private static void notify(String str) {
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator<RobustExtension> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().notifyListner(str);
        }
    }

    public static PatchProxyResult proxy(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, int i, Class[] clsArr, Class cls) {
        PatchProxyResult patchProxyResult = new PatchProxyResult();
        if (isSupport(objArr, obj, changeQuickRedirect, z, i, clsArr, cls)) {
            patchProxyResult.isSupported = true;
            patchProxyResult.result = accessDispatch(objArr, obj, changeQuickRedirect, z, i, clsArr, cls);
        }
        return patchProxyResult;
    }

    public static synchronized boolean register(RobustExtension robustExtension) {
        try {
            if (registerExtensionList == null) {
                registerExtensionList = new CopyOnWriteArrayList<>();
            }
        } catch (Throwable th) {
            throw th;
        }
        return registerExtensionList.addIfAbsent(robustExtension);
    }

    public static void reset() {
        registerExtensionList = new CopyOnWriteArrayList<>();
        robustExtensionThreadLocal = new ThreadLocal<>();
    }

    public static synchronized boolean unregister(RobustExtension robustExtension) {
        CopyOnWriteArrayList<RobustExtension> copyOnWriteArrayList = registerExtensionList;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(robustExtension);
    }
}
