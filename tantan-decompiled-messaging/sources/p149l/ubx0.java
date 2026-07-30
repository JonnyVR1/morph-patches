package p149l;

import com.google.android.gms.internal.ads.AbstractC2214o5;
import com.google.android.gms.internal.ads.AbstractC2222p5;
import com.google.android.gms.internal.ads.C2230q5;
import com.google.android.gms.internal.ads.C2286x5;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ubx0 {

    /* JADX INFO: renamed from: a */
    public static final Class f175768a;

    /* JADX INFO: renamed from: b */
    public static final icx0 f175769b;

    /* JADX INFO: renamed from: c */
    public static final icx0 f175770c;

    static {
        Class<?> cls;
        Class<?> cls2;
        icx0 icx0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f175768a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                icx0Var = (icx0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f175769b = icx0Var;
        f175770c = new C2286x5();
    }

    /* JADX INFO: renamed from: A */
    public static void m192940A(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217530n(i, list, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m192941B(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217534r(i, list, z);
    }

    /* JADX INFO: renamed from: C */
    public static void m192942C(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217537u(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static void m192943D(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217539w(i, list, z);
    }

    /* JADX INFO: renamed from: E */
    public static void m192944E(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217541y(i, list, z);
    }

    /* JADX INFO: renamed from: F */
    public static void m192945F(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217507A(i, list, z);
    }

    /* JADX INFO: renamed from: G */
    public static void m192946G(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217510D(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m192947a(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217512F(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m192948b(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217515I(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m192949c(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217517K(i, list, z);
    }

    /* JADX INFO: renamed from: d */
    public static void m192950d(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217519b(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static void m192951e(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217521d(i, list, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m192952f(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217526i(i, list, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m192953g(int i, List list, z7x0 z7x0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        z7x0Var.m217528k(i, list, z);
    }

    /* JADX INFO: renamed from: h */
    public static int m192954h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q8x0)) {
            int iM13096b = 0;
            while (i < size) {
                iM13096b += AbstractC2214o5.m13096b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13096b;
        }
        q8x0 q8x0Var = (q8x0) list;
        int iM13096b2 = 0;
        while (i < size) {
            iM13096b2 += AbstractC2214o5.m13096b(q8x0Var.m173577c(i));
            i++;
        }
        return iM13096b2;
    }

    /* JADX INFO: renamed from: i */
    public static int m192955i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2214o5.m13095B(i << 3) + 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m192956j(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: k */
    public static int m192957k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2214o5.m13095B(i << 3) + 8);
    }

    /* JADX INFO: renamed from: l */
    public static int m192958l(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m192959m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q8x0)) {
            int iM13096b = 0;
            while (i < size) {
                iM13096b += AbstractC2214o5.m13096b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13096b;
        }
        q8x0 q8x0Var = (q8x0) list;
        int iM13096b2 = 0;
        while (i < size) {
            iM13096b2 += AbstractC2214o5.m13096b(q8x0Var.m173577c(i));
            i++;
        }
        return iM13096b2;
    }

    /* JADX INFO: renamed from: n */
    public static int m192960n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kax0)) {
            int iM13096b = 0;
            while (i < size) {
                iM13096b += AbstractC2214o5.m13096b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13096b;
        }
        kax0 kax0Var = (kax0) list;
        int iM13096b2 = 0;
        while (i < size) {
            iM13096b2 += AbstractC2214o5.m13096b(kax0Var.m145190c(i));
            i++;
        }
        return iM13096b2;
    }

    /* JADX INFO: renamed from: o */
    public static int m192961o(int i, Object obj, obx0 obx0Var) {
        int i2 = i << 3;
        if (!(obj instanceof C2230q5)) {
            return AbstractC2214o5.m13095B(i2) + AbstractC2214o5.m13100z((zax0) obj, obx0Var);
        }
        int iM13095B = AbstractC2214o5.m13095B(i2);
        int iM13209a = ((C2230q5) obj).m13209a();
        return iM13095B + AbstractC2214o5.m13095B(iM13209a) + iM13209a;
    }

    /* JADX INFO: renamed from: p */
    public static int m192962p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q8x0)) {
            int iM13095B = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM13095B += AbstractC2214o5.m13095B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM13095B;
        }
        q8x0 q8x0Var = (q8x0) list;
        int iM13095B2 = 0;
        while (i < size) {
            int iM173577c = q8x0Var.m173577c(i);
            iM13095B2 += AbstractC2214o5.m13095B((iM173577c >> 31) ^ (iM173577c + iM173577c));
            i++;
        }
        return iM13095B2;
    }

    /* JADX INFO: renamed from: q */
    public static int m192963q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kax0)) {
            int iM13096b = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM13096b += AbstractC2214o5.m13096b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM13096b;
        }
        kax0 kax0Var = (kax0) list;
        int iM13096b2 = 0;
        while (i < size) {
            long jM145190c = kax0Var.m145190c(i);
            iM13096b2 += AbstractC2214o5.m13096b((jM145190c >> 63) ^ (jM145190c + jM145190c));
            i++;
        }
        return iM13096b2;
    }

    /* JADX INFO: renamed from: r */
    public static int m192964r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q8x0)) {
            int iM13095B = 0;
            while (i < size) {
                iM13095B += AbstractC2214o5.m13095B(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13095B;
        }
        q8x0 q8x0Var = (q8x0) list;
        int iM13095B2 = 0;
        while (i < size) {
            iM13095B2 += AbstractC2214o5.m13095B(q8x0Var.m173577c(i));
            i++;
        }
        return iM13095B2;
    }

    /* JADX INFO: renamed from: s */
    public static int m192965s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof kax0)) {
            int iM13096b = 0;
            while (i < size) {
                iM13096b += AbstractC2214o5.m13096b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13096b;
        }
        kax0 kax0Var = (kax0) list;
        int iM13096b2 = 0;
        while (i < size) {
            iM13096b2 += AbstractC2214o5.m13096b(kax0Var.m145190c(i));
            i++;
        }
        return iM13096b2;
    }

    /* JADX INFO: renamed from: t */
    public static icx0 m192966t() {
        return f175769b;
    }

    /* JADX INFO: renamed from: u */
    public static icx0 m192967u() {
        return f175770c;
    }

    /* JADX INFO: renamed from: v */
    public static Object m192968v(Object obj, int i, List list, t8x0 t8x0Var, Object obj2, icx0 icx0Var) {
        if (t8x0Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!t8x0Var.zza(iIntValue)) {
                    obj2 = m192969w(obj, i, iIntValue, obj2, icx0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (t8x0Var.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m192969w(obj, i, iIntValue2, obj2, icx0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: w */
    public static Object m192969w(Object obj, int i, int i2, Object obj2, icx0 icx0Var) {
        if (obj2 == null) {
            obj2 = icx0Var.mo13463c(obj);
        }
        icx0Var.mo13472l(obj2, i, i2);
        return obj2;
    }

    /* JADX INFO: renamed from: x */
    public static void m192970x(icx0 icx0Var, Object obj, Object obj2) {
        icx0Var.mo13475o(obj, icx0Var.mo13465e(icx0Var.mo13464d(obj), icx0Var.mo13464d(obj2)));
    }

    /* JADX INFO: renamed from: y */
    public static void m192971y(Class cls) {
        Class cls2;
        if (AbstractC2222p5.class.isAssignableFrom(cls) || (cls2 = f175768a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        ig3.m135964a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: renamed from: z */
    public static boolean m192972z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
