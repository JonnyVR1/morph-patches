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
import p153l.adj;
import p153l.akq;
import p153l.aqg0;
import p153l.bnj0;
import p153l.coj0;
import p153l.gig0;
import p153l.gyj0;
import p153l.iig0;
import p153l.k950;
import p153l.pr3;
import p153l.upq;
import p153l.wuc0;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
public final class Types {

    /* JADX INFO: renamed from: a */
    public static final upq f11332a = upq.m197175h(", ").mo197183j("null");

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return k950.m148863a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
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
            return String.valueOf(Types.m16602s(this.componentType)).concat(WeJson.EMPTY_ARR);
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(Type type, Class<?> cls, Type[] typeArr) {
            xn80.m212111p(cls);
            xn80.m212099d(typeArr.length == cls.getTypeParameters().length);
            Types.m16589f(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && k950.m148863a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.m16601r(this.argumentsList);
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
            upq upqVar = Types.f11332a;
            ImmutableList<Type> immutableList = this.argumentsList;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb.append(upqVar.m197179d(akq.m98611s(immutableList, new adj() { // from class: com.google.common.reflect.c
                @Override // p153l.adj
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
            Types.m16589f(typeArr, "lower bound for wildcard");
            Types.m16589f(typeArr2, "upper bound for wildcard");
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
            return Types.m16601r(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.m16601r(this.upperBounds);
        }

        public int hashCode() {
            return this.upperBounds.hashCode() ^ this.lowerBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            gyj0<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.m16590g(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$a */
    public class C3062a extends coj0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f11333b;

        public C3062a(AtomicReference atomicReference) {
            this.f11333b = atomicReference;
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: b */
        public void mo16567b(Class<?> cls) {
            this.f11333b.set(cls.getComponentType());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: c */
        public void mo16563c(GenericArrayType genericArrayType) {
            this.f11333b.set(genericArrayType.getGenericComponentType());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: e */
        public void mo16565e(TypeVariable<?> typeVariable) {
            this.f11333b.set(Types.m16599p(typeVariable.getBounds()));
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: f */
        public void mo16566f(WildcardType wildcardType) {
            this.f11333b.set(Types.m16599p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$b */
    public static final class C3063b<X> {

        /* JADX INFO: renamed from: a */
        public static final boolean f11334a = !C3063b.class.getTypeParameters()[0].equals(Types.m16594k(C3063b.class, "X", new Type[0]));
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$c */
    public static final class C3064c<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a */
        public final D f11335a;

        /* JADX INFO: renamed from: b */
        public final String f11336b;

        /* JADX INFO: renamed from: c */
        public final ImmutableList<Type> f11337c;

        public C3064c(D d, String str, Type[] typeArr) {
            Types.m16589f(typeArr, "bound for type variable");
            this.f11335a = (D) xn80.m212111p(d);
            this.f11336b = (String) xn80.m212111p(str);
            this.f11337c = ImmutableList.copyOf(typeArr);
        }

        /* JADX INFO: renamed from: a */
        public D m16603a() {
            return this.f11335a;
        }

        /* JADX INFO: renamed from: b */
        public String m16604b() {
            return this.f11336b;
        }

        public boolean equals(Object obj) {
            if (!C3063b.f11334a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f11336b.equals(typeVariable.getName()) && this.f11335a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof C3065d)) {
                C3064c c3064c = ((C3065d) Proxy.getInvocationHandler(obj)).f11339a;
                if (this.f11336b.equals(c3064c.m16604b()) && this.f11335a.equals(c3064c.m16603a()) && this.f11337c.equals(c3064c.f11337c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f11336b.hashCode() ^ this.f11335a.hashCode();
        }

        public String toString() {
            return this.f11336b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$d */
    public static final class C3065d implements InvocationHandler {

        /* JADX INFO: renamed from: b */
        public static final ImmutableMap<String, Method> f11338b;

        /* JADX INFO: renamed from: a */
        public final C3064c<?> f11339a;

        static {
            ImmutableMap.C2809b c2809bBuilder = ImmutableMap.builder();
            for (Method method : C3064c.class.getMethods()) {
                if (method.getDeclaringClass().equals(C3064c.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    c2809bBuilder.mo15715g(method.getName(), method);
                }
            }
            f11338b = c2809bBuilder.mo15713c();
        }

        public C3065d(C3064c<?> c3064c) {
            this.f11339a = c3064c;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f11338b.get(name);
            if (method2 == null) {
                pr3.m173429a(name);
                return null;
            }
            try {
                return method2.invoke(this.f11339a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16589f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                xn80.m212107l(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Iterable<Type> m16590g(Iterable<Type> iterable) {
        return akq.m98597e(iterable, Predicates.m15476i(Predicates.m15473f(Object.class)));
    }

    /* JADX INFO: renamed from: h */
    public static Class<?> m16591h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* JADX INFO: renamed from: i */
    public static Type m16592i(Type type) {
        xn80.m212111p(type);
        AtomicReference atomicReference = new AtomicReference();
        new C3062a(atomicReference).m111669a(type);
        return (Type) atomicReference.get();
    }

    /* JADX INFO: renamed from: j */
    public static Type m16593j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        xn80.m212100e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m16600q(m16593j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        xn80.m212100e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return m16598o(m16593j(upperBounds[0]));
    }

    /* JADX INFO: renamed from: k */
    public static <D extends GenericDeclaration> TypeVariable<D> m16594k(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return m16597n(d, str, typeArr);
    }

    /* JADX INFO: renamed from: l */
    public static ParameterizedType m16595l(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    /* JADX INFO: renamed from: m */
    public static ParameterizedType m16596m(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m16595l(cls, typeArr);
        }
        xn80.m212111p(typeArr);
        xn80.m212106k(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    /* JADX INFO: renamed from: n */
    public static <D extends GenericDeclaration> TypeVariable<D> m16597n(D d, String str, Type[] typeArr) {
        return (TypeVariable) wuc0.m207944a(TypeVariable.class, new C3065d(new C3064c(d, str, typeArr)));
    }

    /* JADX INFO: renamed from: o */
    public static WildcardType m16598o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* JADX INFO: renamed from: p */
    public static Type m16599p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeM16592i = m16592i(type);
            if (typeM16592i != null) {
                if (typeM16592i instanceof Class) {
                    Class cls = (Class) typeM16592i;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m16598o(typeM16592i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static WildcardType m16600q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: renamed from: r */
    public static Type[] m16601r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    /* JADX INFO: renamed from: s */
    public static String m16602s(Type type) {
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
        public class C3054a<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$b */
        public class C3055b extends C3054a<String> {
        }

        private static ClassOwnership detectJvmBehavior() {
            new C3055b();
            ParameterizedType parameterizedType = (ParameterizedType) C3055b.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C3054a.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            aqg0.m99478a();
            return null;
        }

        public abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ ClassOwnership(C3062a c3062a) {
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
                xn80.m212111p(type);
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
                return type instanceof Class ? Types.m16591h((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return (Type) xn80.m212111p(type);
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
                    iig0.m140070a(e);
                    return null;
                } catch (NoSuchMethodException unused) {
                    gig0.m130323a("Type.getTypeName should be available in Java 8");
                    return null;
                } catch (InvocationTargetException e2) {
                    iig0.m140070a(e2);
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
        public class C3060a extends bnj0<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$b */
        public class C3061b extends bnj0<int[]> {
        }

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C3060a().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion;
                    return;
                } else {
                    CURRENT = javaVersion;
                    return;
                }
            }
            if (new C3061b().capture() instanceof Class) {
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
            return Types.m16602s(type);
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (Type type : typeArr) {
                c2804aBuilder.mo15737a(usedInGenericType(type));
            }
            return c2804aBuilder.m15756m();
        }

        public abstract Type usedInGenericType(Type type);

        public /* synthetic */ JavaVersion(String str, int i, C3062a c3062a) {
            this(str, i);
        }
    }
}
