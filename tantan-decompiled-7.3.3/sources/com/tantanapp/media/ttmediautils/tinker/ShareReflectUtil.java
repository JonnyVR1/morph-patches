package com.tantanapp.media.ttmediautils.tinker;

import android.content.Context;
import com.tantanapp.media.ttmediautils.log.SLog;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import p153l.sr10;

/* JADX INFO: loaded from: classes12.dex */
public class ShareReflectUtil {
    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldFindField = findField(obj, str);
        Object[] objArr2 = (Object[]) fieldFindField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        fieldFindField.set(obj, objArr3);
    }

    public static Constructor<?> findConstructor(Object obj, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Constructor<?> declaredConstructor = superclass.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Constructor with parameters ");
        sb.append(Arrays.asList(clsArr));
        sr10.m187582a(sb, obj.getClass());
        return null;
    }

    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    public static Object getActivityThread(Context context, Class<?> cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (ClassNotFoundException e) {
                SLog.printStackTrace(e);
                return null;
            } catch (IllegalAccessException e2) {
                SLog.printStackTrace(e2);
                return null;
            } catch (NoSuchFieldException e3) {
                SLog.printStackTrace(e3);
                return null;
            } catch (NoSuchMethodException e4) {
                SLog.printStackTrace(e4);
                return null;
            } catch (InvocationTargetException e5) {
                SLog.printStackTrace(e5);
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", null);
        method.setAccessible(true);
        Object objInvoke = method.invoke(null, null);
        if (objInvoke != null || context == null) {
            return objInvoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static int getValueOfStaticIntField(Class<?> cls, String str, int i) {
        try {
            return findField(cls, str).getInt(null);
        } catch (IllegalAccessException e) {
            SLog.printStackTrace(e);
            return i;
        } catch (NoSuchFieldException e2) {
            SLog.printStackTrace(e2);
            return i;
        }
    }

    public static void reduceFieldArray(Object obj, String str, int i) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (i <= 0) {
            return;
        }
        Field fieldFindField = findField(obj, str);
        Object[] objArr = (Object[]) fieldFindField.get(obj);
        int length = objArr.length - i;
        if (length <= 0) {
            return;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        System.arraycopy(objArr, i, objArr2, 0, length);
        fieldFindField.set(obj, objArr2);
    }

    public static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sr10.m187582a(sb, obj.getClass());
        return null;
    }
}
