package p153l;

import com.google.android.gms.internal.ads.AbstractC2237o5;
import com.google.android.gms.internal.ads.AbstractC2245p5;
import com.google.android.gms.internal.ads.C2253q5;
import com.google.android.gms.internal.ads.C2309x5;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class alx0 {

    /* JADX INFO: renamed from: a */
    public static final Class f72165a;

    /* JADX INFO: renamed from: b */
    public static final olx0 f72166b;

    /* JADX INFO: renamed from: c */
    public static final olx0 f72167c;

    static {
        Class<?> cls;
        Class<?> cls2;
        olx0 olx0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f72165a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                olx0Var = (olx0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f72166b = olx0Var;
        f72167c = new C2309x5();
    }

    /* JADX INFO: renamed from: A */
    public static void m98735A(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125634n(i, list, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m98736B(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125638r(i, list, z);
    }

    /* JADX INFO: renamed from: C */
    public static void m98737C(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125641u(i, list, z);
    }

    /* JADX INFO: renamed from: D */
    public static void m98738D(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125643w(i, list, z);
    }

    /* JADX INFO: renamed from: E */
    public static void m98739E(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125645y(i, list, z);
    }

    /* JADX INFO: renamed from: F */
    public static void m98740F(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125611A(i, list, z);
    }

    /* JADX INFO: renamed from: G */
    public static void m98741G(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125614D(i, list, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m98742a(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125616F(i, list, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m98743b(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125619I(i, list, z);
    }

    /* JADX INFO: renamed from: c */
    public static void m98744c(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125621K(i, list, z);
    }

    /* JADX INFO: renamed from: d */
    public static void m98745d(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125623b(i, list, z);
    }

    /* JADX INFO: renamed from: e */
    public static void m98746e(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125625d(i, list, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m98747f(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125630i(i, list, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m98748g(int i, List list, fhx0 fhx0Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        fhx0Var.m125632k(i, list, z);
    }

    /* JADX INFO: renamed from: h */
    public static int m98749h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM13150b = 0;
            while (i < size) {
                iM13150b += AbstractC2237o5.m13150b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13150b;
        }
        whx0 whx0Var = (whx0) list;
        int iM13150b2 = 0;
        while (i < size) {
            iM13150b2 += AbstractC2237o5.m13150b(whx0Var.m206525c(i));
            i++;
        }
        return iM13150b2;
    }

    /* JADX INFO: renamed from: i */
    public static int m98750i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2237o5.m13149B(i << 3) + 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m98751j(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: k */
    public static int m98752k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2237o5.m13149B(i << 3) + 8);
    }

    /* JADX INFO: renamed from: l */
    public static int m98753l(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m98754m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM13150b = 0;
            while (i < size) {
                iM13150b += AbstractC2237o5.m13150b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13150b;
        }
        whx0 whx0Var = (whx0) list;
        int iM13150b2 = 0;
        while (i < size) {
            iM13150b2 += AbstractC2237o5.m13150b(whx0Var.m206525c(i));
            i++;
        }
        return iM13150b2;
    }

    /* JADX INFO: renamed from: n */
    public static int m98755n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qjx0)) {
            int iM13150b = 0;
            while (i < size) {
                iM13150b += AbstractC2237o5.m13150b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13150b;
        }
        qjx0 qjx0Var = (qjx0) list;
        int iM13150b2 = 0;
        while (i < size) {
            iM13150b2 += AbstractC2237o5.m13150b(qjx0Var.m176901c(i));
            i++;
        }
        return iM13150b2;
    }

    /* JADX INFO: renamed from: o */
    public static int m98756o(int i, Object obj, ukx0 ukx0Var) {
        int i2 = i << 3;
        if (!(obj instanceof C2253q5)) {
            return AbstractC2237o5.m13149B(i2) + AbstractC2237o5.m13154z((fkx0) obj, ukx0Var);
        }
        int iM13149B = AbstractC2237o5.m13149B(i2);
        int iM13263a = ((C2253q5) obj).m13263a();
        return iM13149B + AbstractC2237o5.m13149B(iM13263a) + iM13263a;
    }

    /* JADX INFO: renamed from: p */
    public static int m98757p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM13149B = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM13149B += AbstractC2237o5.m13149B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM13149B;
        }
        whx0 whx0Var = (whx0) list;
        int iM13149B2 = 0;
        while (i < size) {
            int iM206525c = whx0Var.m206525c(i);
            iM13149B2 += AbstractC2237o5.m13149B((iM206525c >> 31) ^ (iM206525c + iM206525c));
            i++;
        }
        return iM13149B2;
    }

    /* JADX INFO: renamed from: q */
    public static int m98758q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qjx0)) {
            int iM13150b = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM13150b += AbstractC2237o5.m13150b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM13150b;
        }
        qjx0 qjx0Var = (qjx0) list;
        int iM13150b2 = 0;
        while (i < size) {
            long jM176901c = qjx0Var.m176901c(i);
            iM13150b2 += AbstractC2237o5.m13150b((jM176901c >> 63) ^ (jM176901c + jM176901c));
            i++;
        }
        return iM13150b2;
    }

    /* JADX INFO: renamed from: r */
    public static int m98759r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof whx0)) {
            int iM13149B = 0;
            while (i < size) {
                iM13149B += AbstractC2237o5.m13149B(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM13149B;
        }
        whx0 whx0Var = (whx0) list;
        int iM13149B2 = 0;
        while (i < size) {
            iM13149B2 += AbstractC2237o5.m13149B(whx0Var.m206525c(i));
            i++;
        }
        return iM13149B2;
    }

    /* JADX INFO: renamed from: s */
    public static int m98760s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qjx0)) {
            int iM13150b = 0;
            while (i < size) {
                iM13150b += AbstractC2237o5.m13150b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM13150b;
        }
        qjx0 qjx0Var = (qjx0) list;
        int iM13150b2 = 0;
        while (i < size) {
            iM13150b2 += AbstractC2237o5.m13150b(qjx0Var.m176901c(i));
            i++;
        }
        return iM13150b2;
    }

    /* JADX INFO: renamed from: t */
    public static olx0 m98761t() {
        return f72166b;
    }

    /* JADX INFO: renamed from: u */
    public static olx0 m98762u() {
        return f72167c;
    }

    /* JADX INFO: renamed from: v */
    public static Object m98763v(Object obj, int i, List list, zhx0 zhx0Var, Object obj2, olx0 olx0Var) {
        if (zhx0Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zhx0Var.zza(iIntValue)) {
                    obj2 = m98764w(obj, i, iIntValue, obj2, olx0Var);
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
            if (zhx0Var.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m98764w(obj, i, iIntValue2, obj2, olx0Var);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: w */
    public static Object m98764w(Object obj, int i, int i2, Object obj2, olx0 olx0Var) {
        if (obj2 == null) {
            obj2 = olx0Var.mo13517c(obj);
        }
        olx0Var.mo13526l(obj2, i, i2);
        return obj2;
    }

    /* JADX INFO: renamed from: x */
    public static void m98765x(olx0 olx0Var, Object obj, Object obj2) {
        olx0Var.mo13529o(obj, olx0Var.mo13519e(olx0Var.mo13518d(obj), olx0Var.mo13518d(obj2)));
    }

    /* JADX INFO: renamed from: y */
    public static void m98766y(Class cls) {
        Class cls2;
        if (AbstractC2245p5.class.isAssignableFrom(cls) || (cls2 = f72165a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        wg3.m206174a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: renamed from: z */
    public static boolean m98767z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
