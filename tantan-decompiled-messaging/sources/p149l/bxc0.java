package p149l;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class bxc0 {

    /* JADX INFO: renamed from: a */
    public static Field f77775a;

    /* JADX INFO: renamed from: b */
    public static boolean f77776b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f77777c;

    /* JADX INFO: renamed from: d */
    public static boolean f77778d;

    /* JADX INFO: renamed from: e */
    public static Field f77779e;

    /* JADX INFO: renamed from: f */
    public static boolean f77780f;

    /* JADX INFO: renamed from: g */
    public static Field f77781g;

    /* JADX INFO: renamed from: h */
    public static boolean f77782h;

    /* JADX INFO: renamed from: a */
    public static void m104310a(@NonNull Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m104311b(resources);
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: b */
    public static void m104311b(@NonNull Resources resources) {
        Object obj;
        if (!f77782h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f77781g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f77782h = true;
        }
        Field field = f77781g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f77776b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f77775a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f77776b = true;
        }
        Field field2 = f77775a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m104312c(obj2);
        }
    }

    @RequiresApi(16)
    /* JADX INFO: renamed from: c */
    public static void m104312c(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f77778d) {
            try {
                f77777c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f77778d = true;
        }
        Class<?> cls = f77777c;
        if (cls == null) {
            return;
        }
        if (!f77780f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f77779e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f77780f = true;
        }
        Field field = f77779e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
