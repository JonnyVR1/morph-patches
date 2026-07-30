package p003l;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pc8 extends vwb {
    /* JADX INFO: renamed from: q0 */
    public static List<String> m8725q0(List<String> list) {
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
    public static Field m8726r0(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m8727s0(Object obj, String str) {
        Field fieldM8726r0 = m8726r0(obj, str);
        try {
            fieldM8726r0.setAccessible(true);
            return fieldM8726r0.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static <T> T m8728t0(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m8729u0(List<String> list) {
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
    public static <T> List<T> m8730v0(List<T> list, int i) {
        if (vwb.J(list)) {
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
    public static <A, B, C> xaj0<A, B, C> m8731w0(A a, B b, C c) {
        return new xaj0<>(a, b, c);
    }
}
