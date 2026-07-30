package p153l;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class f5d0 {

    /* JADX INFO: renamed from: a */
    public static Field f97215a;

    /* JADX INFO: renamed from: b */
    public static boolean f97216b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f97217c;

    /* JADX INFO: renamed from: d */
    public static boolean f97218d;

    /* JADX INFO: renamed from: e */
    public static Field f97219e;

    /* JADX INFO: renamed from: f */
    public static boolean f97220f;

    /* JADX INFO: renamed from: g */
    public static Field f97221g;

    /* JADX INFO: renamed from: h */
    public static boolean f97222h;

    /* JADX INFO: renamed from: a */
    public static void m124118a(@NonNull Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m124119b(resources);
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: b */
    public static void m124119b(@NonNull Resources resources) {
        Object obj;
        if (!f97222h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f97221g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f97222h = true;
        }
        Field field = f97221g;
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
        if (!f97216b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f97215a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f97216b = true;
        }
        Field field2 = f97215a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m124120c(obj2);
        }
    }

    @RequiresApi(16)
    /* JADX INFO: renamed from: c */
    public static void m124120c(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f97218d) {
            try {
                f97217c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f97218d = true;
        }
        Class<?> cls = f97217c;
        if (cls == null) {
            return;
        }
        if (!f97220f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f97219e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f97220f = true;
        }
        Field field = f97219e;
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
