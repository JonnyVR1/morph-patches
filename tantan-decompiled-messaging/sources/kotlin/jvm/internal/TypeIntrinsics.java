package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes2.dex */
public class TypeIntrinsics {
    /* JADX INFO: renamed from: a */
    public static Collection m87534a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            m87551r(obj, "kotlin.collections.MutableCollection");
        }
        return m87541h(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Iterable m87535b(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            m87551r(obj, "kotlin.collections.MutableIterable");
        }
        return m87542i(obj);
    }

    /* JADX INFO: renamed from: c */
    public static List m87536c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            m87551r(obj, "kotlin.collections.MutableList");
        }
        return m87543j(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Map m87537d(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            m87551r(obj, "kotlin.collections.MutableMap");
        }
        return m87544k(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Map.Entry m87538e(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap.Entry)) {
            m87551r(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m87545l(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Set m87539f(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            m87551r(obj, "kotlin.collections.MutableSet");
        }
        return m87546m(obj);
    }

    /* JADX INFO: renamed from: g */
    public static Object m87540g(Object obj, int i) {
        if (obj != null && !m87548o(obj, i)) {
            m87551r(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Collection m87541h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Iterable m87542i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static List m87543j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Map m87544k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Map.Entry m87545l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Set m87546m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m87550q(e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m87547n(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        return obj instanceof Function22 ? 22 : -1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m87548o(Object obj, int i) {
        return (obj instanceof Function) && m87547n(obj) == i;
    }

    /* JADX INFO: renamed from: p */
    public static <T extends Throwable> T m87549p(T t) {
        return (T) Intrinsics.m87495k(t, TypeIntrinsics.class.getName());
    }

    /* JADX INFO: renamed from: q */
    public static ClassCastException m87550q(ClassCastException classCastException) {
        throw ((ClassCastException) m87549p(classCastException));
    }

    /* JADX INFO: renamed from: r */
    public static void m87551r(Object obj, String str) {
        m87552s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: s */
    public static void m87552s(String str) {
        throw m87550q(new ClassCastException(str));
    }
}
