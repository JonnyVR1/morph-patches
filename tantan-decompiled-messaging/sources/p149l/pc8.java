package p149l;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class pc8 extends vwb {
    /* JADX INFO: renamed from: q0 */
    public static List<String> m168313q0(List<String> list) {
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
    public static Field m168314r0(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m168315s0(Object obj, String str) {
        Field fieldM168314r0 = m168314r0(obj, str);
        try {
            fieldM168314r0.setAccessible(true);
            return fieldM168314r0.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static <T> T m168316t0(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m168317u0(List<String> list) {
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
    public static <T> List<T> m168318v0(List<T> list, int i) {
        if (vwb.m200296J(list)) {
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
    public static <A, B, C> xaj0<A, B, C> m168319w0(A a, B b, C c) {
        return new xaj0<>(a, b, c);
    }
}
