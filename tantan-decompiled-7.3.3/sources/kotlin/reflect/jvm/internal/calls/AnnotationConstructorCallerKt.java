package kotlin.reflect.jvm.internal.calls;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.tr0;
import p153l.ur0;
import p153l.vr0;
import p153l.wr0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m88121d2 = {"", "Ljava/lang/Class;", "expectedType", "q", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.INDEX, "", AuthenticationTokenClaims.JSON_KEY_NAME, "expectedJvmType", "", "p", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", p7f.GPS_DIRECTION_TRUE, "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "g", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AnnotationConstructorCallerKt {
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> T m88961g(@NotNull Class<T> cls, @NotNull Map<String, ? extends Object> map, @NotNull List<Method> list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        Lazy lazyM88118b = LazyKt__LazyJVMKt.m88118b(new tr0(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new vr0(cls, map, LazyKt__LazyJVMKt.m88118b(new ur0(cls, map)), lazyM88118b, list));
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m88962h(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return m88961g(cls, map, list);
    }

    /* JADX INFO: renamed from: i */
    public static final <T> boolean m88963i(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zM88377d;
        boolean z;
        KClass kClassM88340a;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (Intrinsics.m88377d((annotation == null || (kClassM88340a = JvmClassMappingKt.m88340a(annotation)) == null) ? null : JvmClassMappingKt.m88341b(kClassM88340a), cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = true;
            } else {
                for (Method method : list2) {
                    Object obj2 = map.get(method.getName());
                    Object objInvoke = method.invoke(obj, null);
                    if (obj2 instanceof boolean[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        objInvoke.getClass();
                        zM88377d = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM88377d = Intrinsics.m88377d(obj2, objInvoke);
                    }
                    if (!zM88377d) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final int m88964j(Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) value);
            } else {
                iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * 127);
        }
        return iHashCode2;
    }

    /* JADX INFO: renamed from: k */
    public static final int m88965k(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* JADX INFO: renamed from: l */
    public static final String m88966l(Class cls, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        CollectionsKt.joinTo$default(map.entrySet(), sb, ", ", "(", ")", 0, null, wr0.INSTANCE, 48, null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m88967m(Map.Entry entry) {
        String string;
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            string.getClass();
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            string.getClass();
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            string.getClass();
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            string.getClass();
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            string.getClass();
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            string.getClass();
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            string.getClass();
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            string.getClass();
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            string.getClass();
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    /* JADX INFO: renamed from: n */
    public static final String m88968n(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static final Object m88969o(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(m88965k(lazy2));
                }
            } else if (name.equals("toString")) {
                return m88968n(lazy);
            }
        }
        if (Intrinsics.m88377d(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(m88963i(cls, list, map, ArraysKt.single(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(ArraysKt.toList(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* JADX INFO: renamed from: p */
    public static final Void m88970p(int i, String str, Class<?> cls) {
        KClass kClassM88396b;
        String strMo88359r;
        if (Intrinsics.m88377d(cls, Class.class)) {
            kClassM88396b = Reflection.m88396b(KClass.class);
        } else {
            kClassM88396b = (cls.isArray() && Intrinsics.m88377d(cls.getComponentType(), Class.class)) ? Reflection.m88396b(KClass[].class) : JvmClassMappingKt.m88344e(cls);
        }
        if (Intrinsics.m88377d(kClassM88396b.mo88359r(), Reflection.m88396b(Object[].class).mo88359r())) {
            StringBuilder sb = new StringBuilder();
            sb.append(kClassM88396b.mo88359r());
            sb.append('<');
            Class<?> componentType = JvmClassMappingKt.m88341b(kClassM88396b).getComponentType();
            componentType.getClass();
            sb.append(JvmClassMappingKt.m88344e(componentType).mo88359r());
            sb.append('>');
            strMo88359r = sb.toString();
        } else {
            strMo88359r = kClassM88396b.mo88359r();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + strMo88359r);
    }

    /* JADX INFO: renamed from: q */
    public static final Object m88971q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = JvmClassMappingKt.m88341b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(JvmClassMappingKt.m88341b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
