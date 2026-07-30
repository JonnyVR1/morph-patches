package com.google.common.reflect;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p149l.aag0;
import p149l.aiq;
import p149l.dpj0;
import p149l.gaj;
import p149l.qq3;
import p149l.rmc0;
import p149l.sf80;
import p149l.shg0;
import p149l.v050;
import p149l.vnq;
import p149l.xdj0;
import p149l.y9g0;
import p149l.yej0;

/* JADX INFO: loaded from: classes7.dex */
public final class Types {

    /* JADX INFO: renamed from: a */
    public static final vnq f11295a = vnq.m199040h(", ").mo199048j("null");

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return v050.m196470a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.m16547s(this.componentType)).concat(WeJson.EMPTY_ARR);
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(Type type, Class<?> cls, Type[] typeArr) {
            sf80.m183894p(cls);
            sf80.m183882d(typeArr.length == cls.getTypeParameters().length);
            Types.m16534f(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && v050.m196470a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.m16546r(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return this.rawType.hashCode() ^ ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb.append(javaVersion.typeName(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            vnq vnqVar = Types.f11295a;
            ImmutableList<Type> immutableList = this.argumentsList;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb.append(vnqVar.m199044d(aiq.m96893s(immutableList, new gaj() { // from class: com.google.common.reflect.c
                @Override // p149l.gaj
                public final Object apply(Object obj) {
                    return javaVersion2.typeName((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.m16534f(typeArr, "lower bound for wildcard");
            Types.m16534f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.lowerBounds = javaVersion.usedInGenericType(typeArr);
            this.upperBounds = javaVersion.usedInGenericType(typeArr2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.m16546r(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.m16546r(this.upperBounds);
        }

        public int hashCode() {
            return this.upperBounds.hashCode() ^ this.lowerBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            dpj0<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.m16535g(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$a */
    public class C3039a extends yej0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f11296b;

        public C3039a(AtomicReference atomicReference) {
            this.f11296b = atomicReference;
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: b */
        public void mo16512b(Class<?> cls) {
            this.f11296b.set(cls.getComponentType());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: c */
        public void mo16508c(GenericArrayType genericArrayType) {
            this.f11296b.set(genericArrayType.getGenericComponentType());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: e */
        public void mo16510e(TypeVariable<?> typeVariable) {
            this.f11296b.set(Types.m16544p(typeVariable.getBounds()));
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: f */
        public void mo16511f(WildcardType wildcardType) {
            this.f11296b.set(Types.m16544p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$b */
    public static final class C3040b<X> {

        /* JADX INFO: renamed from: a */
        public static final boolean f11297a = !C3040b.class.getTypeParameters()[0].equals(Types.m16539k(C3040b.class, "X", new Type[0]));
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$c */
    public static final class C3041c<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a */
        public final D f11298a;

        /* JADX INFO: renamed from: b */
        public final String f11299b;

        /* JADX INFO: renamed from: c */
        public final ImmutableList<Type> f11300c;

        public C3041c(D d, String str, Type[] typeArr) {
            Types.m16534f(typeArr, "bound for type variable");
            this.f11298a = (D) sf80.m183894p(d);
            this.f11299b = (String) sf80.m183894p(str);
            this.f11300c = ImmutableList.copyOf(typeArr);
        }

        /* JADX INFO: renamed from: a */
        public D m16548a() {
            return this.f11298a;
        }

        /* JADX INFO: renamed from: b */
        public String m16549b() {
            return this.f11299b;
        }

        public boolean equals(Object obj) {
            if (!C3040b.f11297a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f11299b.equals(typeVariable.getName()) && this.f11298a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof C3042d)) {
                C3041c c3041c = ((C3042d) Proxy.getInvocationHandler(obj)).f11302a;
                if (this.f11299b.equals(c3041c.m16549b()) && this.f11298a.equals(c3041c.m16548a()) && this.f11300c.equals(c3041c.f11300c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f11299b.hashCode() ^ this.f11298a.hashCode();
        }

        public String toString() {
            return this.f11299b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$d */
    public static final class C3042d implements InvocationHandler {

        /* JADX INFO: renamed from: b */
        public static final ImmutableMap<String, Method> f11301b;

        /* JADX INFO: renamed from: a */
        public final C3041c<?> f11302a;

        static {
            ImmutableMap.C2786b c2786bBuilder = ImmutableMap.builder();
            for (Method method : C3041c.class.getMethods()) {
                if (method.getDeclaringClass().equals(C3041c.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    c2786bBuilder.mo15661g(method.getName(), method);
                }
            }
            f11301b = c2786bBuilder.mo15659c();
        }

        public C3042d(C3041c<?> c3041c) {
            this.f11302a = c3041c;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f11301b.get(name);
            if (method2 == null) {
                qq3.m175877a(name);
                return null;
            }
            try {
                return method2.invoke(this.f11302a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16534f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                sf80.m183890l(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Iterable<Type> m16535g(Iterable<Type> iterable) {
        return aiq.m96879e(iterable, Predicates.m15422i(Predicates.m15419f(Object.class)));
    }

    /* JADX INFO: renamed from: h */
    public static Class<?> m16536h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* JADX INFO: renamed from: i */
    public static Type m16537i(Type type) {
        sf80.m183894p(type);
        AtomicReference atomicReference = new AtomicReference();
        new C3039a(atomicReference).m214350a(type);
        return (Type) atomicReference.get();
    }

    /* JADX INFO: renamed from: j */
    public static Type m16538j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        sf80.m183883e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m16545q(m16538j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        sf80.m183883e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return m16543o(m16538j(upperBounds[0]));
    }

    /* JADX INFO: renamed from: k */
    public static <D extends GenericDeclaration> TypeVariable<D> m16539k(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m16542n(d, str, typeArr);
    }

    /* JADX INFO: renamed from: l */
    public static ParameterizedType m16540l(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    /* JADX INFO: renamed from: m */
    public static ParameterizedType m16541m(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m16540l(cls, typeArr);
        }
        sf80.m183894p(typeArr);
        sf80.m183889k(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    /* JADX INFO: renamed from: n */
    public static <D extends GenericDeclaration> TypeVariable<D> m16542n(D d, String str, Type[] typeArr) {
        return (TypeVariable) rmc0.m179975a(TypeVariable.class, new C3042d(new C3041c(d, str, typeArr)));
    }

    /* JADX INFO: renamed from: o */
    public static WildcardType m16543o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* JADX INFO: renamed from: p */
    public static Type m16544p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeM16537i = m16537i(type);
            if (typeM16537i != null) {
                if (typeM16537i instanceof Class) {
                    Class cls = (Class) typeM16537i;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m16543o(typeM16537i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static WildcardType m16545q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: renamed from: r */
    public static Type[] m16546r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    /* JADX INFO: renamed from: s */
    public static String m16547s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            public Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            public Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$a */
        public class C3031a<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$b */
        public class C3032b extends C3031a<String> {
        }

        private static ClassOwnership detectJvmBehavior() {
            new C3032b();
            ParameterizedType parameterizedType = (ParameterizedType) C3032b.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C3031a.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            shg0.m184191a();
            return null;
        }

        public abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ ClassOwnership(C3039a c3039a) {
            this();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
      (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:100) com.google.common.reflect.Types.JavaVersion.CURRENT com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                sf80.m183894p(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return type instanceof Class ? Types.m16536h((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return (Type) sf80.m183894p(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    aag0.m95543a(e);
                    return null;
                } catch (NoSuchMethodException unused) {
                    y9g0.m213537a("Type.getTypeName should be available in Java 8");
                    return null;
                } catch (InvocationTargetException e2) {
                    aag0.m95543a(e2);
                    return null;
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }
        };

        static final JavaVersion CURRENT;

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$a */
        public class C3037a extends xdj0<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$b */
        public class C3038b extends xdj0<int[]> {
        }

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C3037a().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion;
                    return;
                } else {
                    CURRENT = javaVersion;
                    return;
                }
            }
            if (new C3038b().capture() instanceof Class) {
                CURRENT = javaVersion;
            } else {
                CURRENT = javaVersion;
            }
        }

        private JavaVersion(String str, int i) {
            super(str, i);
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) $VALUES.clone();
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            return Types.m16547s(type);
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (Type type : typeArr) {
                c2781aBuilder.mo15683a(usedInGenericType(type));
            }
            return c2781aBuilder.m15702m();
        }

        public abstract Type usedInGenericType(Type type);

        public /* synthetic */ JavaVersion(String str, int i, C3039a c3039a) {
            this(str, i);
        }
    }
}
