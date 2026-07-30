package p153l;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class td8 extends jyb {
    /* JADX INFO: renamed from: q0 */
    public static List<String> m190607q0(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                if (str != null && !TextUtils.isEmpty(str.trim())) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static Field m190608r0(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m190609s0(Object obj, String str) {
        Field fieldM190608r0 = m190608r0(obj, str);
        try {
            fieldM190608r0.setAccessible(true);
            return fieldM190608r0.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static <T> T m190610t0(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m190611u0(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (str != null && !TextUtils.isEmpty(str.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public static <T> List<T> m190612v0(List<T> list, int i) {
        if (jyb.m147479J(list)) {
            return new ArrayList();
        }
        int iMin = Math.min(list.size(), i);
        if (iMin == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(list.get(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w0 */
    public static <A, B, C> bkj0<A, B, C> m190613w0(A a, B b, C c) {
        return new bkj0<>(a, b, c);
    }
}
