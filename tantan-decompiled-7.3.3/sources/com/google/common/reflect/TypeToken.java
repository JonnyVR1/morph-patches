package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.bnj0;
import p153l.coj0;
import p153l.gyj0;
import p153l.onj0;
import p153l.tp80;
import p153l.upq;
import p153l.vu80;
import p153l.wnj0;
import p153l.xn80;
import p153l.xvi;
import p153l.z2j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeToken<T> extends bnj0<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient C3067b covariantTypeResolver;
    private transient C3067b invariantTypeResolver;
    private final Type runtimeType;

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private final transient TypeToken<T>.TypeSet allTypes;
        private transient ImmutableSet<TypeToken<? super T>> interfaces;

        public InterfaceSet(TypeToken<T>.TypeSet typeSet) {
            super();
            this.allTypes = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, p153l.z2j, p153l.l2j, p153l.v2j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.interfaces;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM213234i = xvi.m213231g(this.allTypes).m213232f(TypeFilter.INTERFACE_ONLY).m213234i();
            this.interfaces = immutableSetM213234i;
            return immutableSetM213234i;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return xvi.m213231g(AbstractC3051f.f11328b.mo16573c(TypeToken.this.getRawTypes())).m213232f(new tp80() { // from class: l.xnj0
                @Override // p153l.tp80
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).m213234i();
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    public class TypeSet extends z2j<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet(TypeToken.this, null);
        }

        @Override // p153l.z2j, p153l.l2j, p153l.v2j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM213234i = xvi.m213231g(AbstractC3051f.f11327a.m16574d(TypeToken.this)).m213232f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).m213234i();
            this.types = immutableSetM213234i;
            return immutableSetM213234i;
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC3051f.f11328b.mo16573c(TypeToken.this.getRawTypes()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$a */
    public class C3046a extends AbstractC3066a.b<T> {
        public C3046a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.AbstractC3066a
        /* JADX INFO: renamed from: a */
        public TypeToken<T> mo16561a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.AbstractC3066a
        public String toString() {
            String strValueOf = String.valueOf(mo16561a());
            String string = super.toString();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(string).length());
            sb.append(strValueOf);
            sb.append(".");
            sb.append(string);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$b */
    public class C3047b extends AbstractC3066a.a<T> {
        public C3047b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.AbstractC3066a
        /* JADX INFO: renamed from: a */
        public TypeToken<T> mo16561a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.AbstractC3066a.a
        /* JADX INFO: renamed from: b */
        public Type[] mo16562b() {
            return TypeToken.this.getInvariantTypeResolver().m16618l(super.mo16562b());
        }

        @Override // com.google.common.reflect.AbstractC3066a
        public String toString() {
            String strValueOf = String.valueOf(mo16561a());
            String strM197181f = upq.m197175h(", ").m197181f(mo16562b());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strM197181f).length());
            sb.append(strValueOf);
            sb.append("(");
            sb.append(strM197181f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$c */
    public class C3048c extends coj0 {
        public C3048c() {
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: c */
        public void mo16563c(GenericArrayType genericArrayType) {
            m111669a(genericArrayType.getGenericComponentType());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: d */
        public void mo16564d(ParameterizedType parameterizedType) {
            m111669a(parameterizedType.getActualTypeArguments());
            m111669a(parameterizedType.getOwnerType());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: e */
        public void mo16565e(TypeVariable<?> typeVariable) {
            String strValueOf = String.valueOf(TypeToken.this.runtimeType);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append(strValueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: f */
        public void mo16566f(WildcardType wildcardType) {
            m111669a(wildcardType.getLowerBounds());
            m111669a(wildcardType.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$d */
    public class C3049d extends coj0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImmutableSet.C2825a f11324b;

        public C3049d(TypeToken typeToken, ImmutableSet.C2825a c2825a) {
            this.f11324b = c2825a;
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: b */
        public void mo16567b(Class<?> cls) {
            this.f11324b.mo15737a(cls);
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: c */
        public void mo16563c(GenericArrayType genericArrayType) {
            this.f11324b.mo15737a(Types.m16591h(TypeToken.m16560of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: d */
        public void mo16564d(ParameterizedType parameterizedType) {
            this.f11324b.mo15737a((Class) parameterizedType.getRawType());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: e */
        public void mo16565e(TypeVariable<?> typeVariable) {
            m111669a(typeVariable.getBounds());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: f */
        public void mo16566f(WildcardType wildcardType) {
            m111669a(wildcardType.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$e */
    public static class C3050e {

        /* JADX INFO: renamed from: a */
        public final Type[] f11325a;

        /* JADX INFO: renamed from: b */
        public final boolean f11326b;

        public C3050e(Type[] typeArr, boolean z) {
            this.f11325a = typeArr;
            this.f11326b = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16568a(Type type) {
            for (Type type2 : this.f11325a) {
                boolean zIsSubtypeOf = TypeToken.m16560of(type2).isSubtypeOf(type);
                boolean z = this.f11326b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f11326b;
        }

        /* JADX INFO: renamed from: b */
        public boolean m16569b(Type type) {
            TypeToken<?> typeTokenM16560of = TypeToken.m16560of(type);
            for (Type type2 : this.f11325a) {
                boolean zIsSubtypeOf = typeTokenM16560of.isSubtypeOf(type2);
                boolean z = this.f11326b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f11326b;
        }
    }

    public TypeToken(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = C3067b.m16610d(cls).m16616j(typeCapture);
        }
    }

    private static C3050e any(Type[] typeArr) {
        return new C3050e(typeArr, true);
    }

    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) m16560of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenM16560of = m16560of(type);
            if (typeTokenM16560of.getRawType().isInterface()) {
                c2804aBuilder.mo15737a(typeTokenM16560of);
            }
        }
        return c2804aBuilder.m15756m();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).m16568a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return Types.m16596m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? Types.m16593j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static C3050e every(Type[] typeArr) {
        return new C3050e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) m16560of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        wnj0.m207212a(strValueOf.length() + 36 + strValueOf2.length(), strValueOf, " does not appear to be a subtype of ", strValueOf2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) m16560of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        wnj0.m207212a(strValueOf.length() + 23 + strValueOf2.length(), strValueOf, " isn't a super type of ", strValueOf2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3067b getCovariantTypeResolver() {
        C3067b c3067b = this.covariantTypeResolver;
        if (c3067b != null) {
            return c3067b;
        }
        C3067b c3067bM16610d = C3067b.m16610d(this.runtimeType);
        this.covariantTypeResolver = c3067bM16610d;
        return c3067bM16610d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3067b getInvariantTypeResolver() {
        C3067b c3067b = this.invariantTypeResolver;
        if (c3067b != null) {
            return c3067b;
        }
        C3067b c3067bM16612f = C3067b.m16612f(this.runtimeType);
        this.invariantTypeResolver = c3067bM16612f;
        return c3067bM16612f;
    }

    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.C2825a c2825aBuilder = ImmutableSet.builder();
        new C3049d(this, c2825aBuilder).m111669a(this.runtimeType);
        return c2825aBuilder.mo15834n();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) m16560of(typeArr[0]).getSubtype(cls);
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        wnj0.m207212a(strValueOf.length() + 21 + strValueOf2.length(), strValueOf, " isn't a subclass of ", strValueOf2);
        return null;
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenM16560of = m16560of(type);
            if (typeTokenM16560of.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenM16560of.getSupertype(cls);
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        wnj0.m207212a(strValueOf.length() + 23 + strValueOf2.length(), strValueOf, " isn't a super type of ", strValueOf2);
        return null;
    }

    /* JADX INFO: renamed from: is */
    private boolean m16558is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).m16569b(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).m16568a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m16560of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return m16560of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return m16559of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = m16560of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m16560of(getCovariantTypeResolver().m16616j(typeParameters[i])).m16558is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : m16560of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return m16560of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return vu80.m202778b().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    /* JADX INFO: renamed from: of */
    public static <T> TypeToken<T> m16559of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenM16560of = m16560of(getCovariantTypeResolver().m16616j(type));
        typeTokenM16560of.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenM16560of.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenM16560of;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new C3067b().m16620n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).m16616j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        gyj0<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) m16560of(Types.m16593j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) m16560of(Types.m16596m(type, cls, typeParameters)) : m16559of((Class) cls);
    }

    public final AbstractC3066a<T, T> constructor(Constructor<?> constructor) {
        xn80.m212107l(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new C3047b(constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type typeM16592i = Types.m16592i(this.runtimeType);
        if (typeM16592i == null) {
            return null;
        }
        return m16560of(typeM16592i);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            c2804aBuilder.mo15737a(resolveSupertype(type2));
        }
        return c2804aBuilder.m15756m();
    }

    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        xn80.m212106k(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        xn80.m212107l(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) m16560of(resolveTypeArgsForSubclass(cls));
        xn80.m212107l(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        xn80.m212107l(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? getArraySupertype(cls) : (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(Type type) {
        xn80.m212111p(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).m16569b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).m16568a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).m16568a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return m16560of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        }
        if (type instanceof Class) {
            return someRawTypeIsSubclassOf((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return m16560of(type).isSubtypeOf(getType());
    }

    public final AbstractC3066a<T, Object> method(Method method) {
        xn80.m212107l(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C3046a(method);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new C3048c().m111669a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        xn80.m212111p(type);
        return m16560of(getInvariantTypeResolver().m16616j(type));
    }

    public String toString() {
        return Types.m16602s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? m16559of(vu80.m202779c((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(onj0<X> onj0Var, Class<X> cls) {
        return where(onj0Var, m16559of((Class) cls));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? m16559of(vu80.m202780d((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return m16560of(new C3067b().m16616j(this.runtimeType));
    }

    public enum TypeFilter implements tp80<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.reflect.TypeToken.TypeFilter, p153l.tp80
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.reflect.TypeToken.TypeFilter, p153l.tp80
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        };

        @Override // p153l.tp80
        public abstract /* synthetic */ boolean apply(TypeToken<?> typeToken);

        /* synthetic */ TypeFilter(C3046a c3046a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f */
    public static abstract class AbstractC3051f<K> {

        /* JADX INFO: renamed from: a */
        public static final AbstractC3051f<TypeToken<?>> f11327a = new a();

        /* JADX INFO: renamed from: b */
        public static final AbstractC3051f<Class<?>> f11328b = new b();

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$a */
        public class a extends AbstractC3051f<TypeToken<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> mo16575e(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16576f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> mo16577g(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$b */
        public class b extends AbstractC3051f<Class<?>> {
            public b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> mo16575e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16576f(Class<?> cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16577g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$c */
        public class c extends e<K> {
            public c(AbstractC3051f abstractC3051f, AbstractC3051f abstractC3051f2) {
                super(abstractC3051f2);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: c */
            public ImmutableList<K> mo16573c(Iterable<? extends K> iterable) {
                ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
                for (K k : iterable) {
                    if (!mo16576f(k).isInterface()) {
                        c2804aBuilder.mo15737a(k);
                    }
                }
                return super.mo16573c(c2804aBuilder.m15756m());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: e */
            public Iterable<? extends K> mo16575e(K k) {
                return ImmutableSet.m15822of();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$d */
        public class d extends Ordering<K> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Comparator f11329a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Map f11330b;

            public d(Comparator comparator, Map map) {
                this.f11329a = comparator;
                this.f11330b = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(K k, K k2) {
                Comparator comparator = this.f11329a;
                Object obj = this.f11330b.get(k);
                Objects.requireNonNull(obj);
                Object obj2 = this.f11330b.get(k2);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$e */
        public static class e<K> extends AbstractC3051f<K> {

            /* JADX INFO: renamed from: c */
            public final AbstractC3051f<K> f11331c;

            public e(AbstractC3051f<K> abstractC3051f) {
                super(null);
                this.f11331c = abstractC3051f;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: f */
            public Class<?> mo16576f(K k) {
                return this.f11331c.mo16576f(k);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3051f
            /* JADX INFO: renamed from: g */
            public K mo16577g(K k) {
                return this.f11331c.mo16577g(k);
            }
        }

        public AbstractC3051f() {
        }

        /* JADX INFO: renamed from: h */
        public static <K, V> ImmutableList<K> m16570h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).immutableSortedCopy(map.keySet());
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3051f<K> m16571a() {
            return new c(this, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final int m16572b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = mo16576f(k).isInterface();
            Iterator<? extends K> it = mo16575e(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, m16572b(it.next(), map));
            }
            K kMo16577g = mo16577g(k);
            int iMax2 = iMax;
            if (kMo16577g != null) {
                iMax2 = Math.max(iMax, m16572b(kMo16577g, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableList<K> mo16573c(Iterable<? extends K> iterable) {
            HashMap mapM16095p = Maps.m16095p();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                m16572b(it.next(), mapM16095p);
            }
            return m16570h(mapM16095p, Ordering.natural().reverse());
        }

        /* JADX INFO: renamed from: d */
        public final ImmutableList<K> m16574d(K k) {
            return mo16573c(ImmutableList.m15740of(k));
        }

        /* JADX INFO: renamed from: e */
        public abstract Iterable<? extends K> mo16575e(K k);

        /* JADX INFO: renamed from: f */
        public abstract Class<?> mo16576f(K k);

        /* JADX INFO: renamed from: g */
        public abstract K mo16577g(K k);

        public /* synthetic */ AbstractC3051f(C3046a c3046a) {
            this();
        }
    }

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> classes;

        private ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, p153l.z2j, p153l.l2j, p153l.v2j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.classes;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM213234i = xvi.m213231g(AbstractC3051f.f11327a.m16571a().m16574d(TypeToken.this)).m213232f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).m213234i();
            this.classes = immutableSetM213234i;
            return immutableSetM213234i;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC3051f.f11328b.m16571a().mo16573c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ ClassSet(TypeToken typeToken, C3046a c3046a) {
            this();
        }
    }

    /* JADX INFO: renamed from: of */
    public static TypeToken<?> m16560of(Type type) {
        return new SimpleTypeToken(type);
    }

    public final <X> TypeToken<T> where(onj0<X> onj0Var, TypeToken<X> typeToken) {
        new C3067b();
        throw null;
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        xn80.m212121z(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    public /* synthetic */ TypeToken(Type type, C3046a c3046a) {
        this(type);
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) xn80.m212111p(type);
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }
}
