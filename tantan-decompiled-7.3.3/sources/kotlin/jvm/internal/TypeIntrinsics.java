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
    public static Collection m88423a(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection)) {
            m88441s(obj, "kotlin.collections.MutableCollection");
        }
        return m88430h(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Iterable m88424b(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable)) {
            m88441s(obj, "kotlin.collections.MutableIterable");
        }
        return m88431i(obj);
    }

    /* JADX INFO: renamed from: c */
    public static List m88425c(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableList)) {
            m88441s(obj, "kotlin.collections.MutableList");
        }
        return m88432j(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Map m88426d(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap)) {
            m88441s(obj, "kotlin.collections.MutableMap");
        }
        return m88433k(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Map.Entry m88427e(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap.Entry)) {
            m88441s(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m88434l(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Set m88428f(Object obj) {
        if ((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet)) {
            m88441s(obj, "kotlin.collections.MutableSet");
        }
        return m88435m(obj);
    }

    /* JADX INFO: renamed from: g */
    public static Object m88429g(Object obj, int i) {
        if (obj != null && !m88437o(obj, i)) {
            m88441s(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Collection m88430h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Iterable m88431i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static List m88432j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Map m88433k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Map.Entry m88434l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Set m88435m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m88440r(e);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m88436n(Object obj) {
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
    public static boolean m88437o(Object obj, int i) {
        return (obj instanceof Function) && m88436n(obj) == i;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m88438p(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof KMappedMarker) || (obj instanceof KMutableMap);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static <T extends Throwable> T m88439q(T t) {
        return (T) Intrinsics.m88384k(t, TypeIntrinsics.class.getName());
    }

    /* JADX INFO: renamed from: r */
    public static ClassCastException m88440r(ClassCastException classCastException) {
        throw ((ClassCastException) m88439q(classCastException));
    }

    /* JADX INFO: renamed from: s */
    public static void m88441s(Object obj, String str) {
        m88442t((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: t */
    public static void m88442t(String str) {
        throw m88440r(new ClassCastException(str));
    }
}
