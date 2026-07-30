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
import p149l.bti;
import p149l.dpj0;
import p149l.e0j;
import p149l.kej0;
import p149l.oh80;
import p149l.rm80;
import p149l.sej0;
import p149l.sf80;
import p149l.vnq;
import p149l.xdj0;
import p149l.yej0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeToken<T> extends xdj0<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient C3044b covariantTypeResolver;
    private transient C3044b invariantTypeResolver;
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

        @Override // com.google.common.reflect.TypeToken.TypeSet, p149l.e0j, p149l.qzi, p149l.a0j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.interfaces;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM103843i = bti.m103840g(this.allTypes).m103841f(TypeFilter.INTERFACE_ONLY).m103843i();
            this.interfaces = immutableSetM103843i;
            return immutableSetM103843i;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return bti.m103840g(AbstractC3028f.f11291b.mo16518c(TypeToken.this.getRawTypes())).m103841f(new oh80() { // from class: l.tej0
                @Override // p149l.oh80
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).m103843i();
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    public class TypeSet extends e0j<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet(TypeToken.this, null);
        }

        @Override // p149l.e0j, p149l.qzi, p149l.a0j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM103843i = bti.m103840g(AbstractC3028f.f11290a.m16519d(TypeToken.this)).m103841f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).m103843i();
            this.types = immutableSetM103843i;
            return immutableSetM103843i;
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC3028f.f11291b.mo16518c(TypeToken.this.getRawTypes()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$a */
    public class C3023a extends AbstractC3043a.b<T> {
        public C3023a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.AbstractC3043a
        /* JADX INFO: renamed from: a */
        public TypeToken<T> mo16506a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.AbstractC3043a
        public String toString() {
            String strValueOf = String.valueOf(mo16506a());
            String string = super.toString();
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(string).length());
            sb.append(strValueOf);
            sb.append(".");
            sb.append(string);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$b */
    public class C3024b extends AbstractC3043a.a<T> {
        public C3024b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.AbstractC3043a
        /* JADX INFO: renamed from: a */
        public TypeToken<T> mo16506a() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.AbstractC3043a.a
        /* JADX INFO: renamed from: b */
        public Type[] mo16507b() {
            return TypeToken.this.getInvariantTypeResolver().m16563l(super.mo16507b());
        }

        @Override // com.google.common.reflect.AbstractC3043a
        public String toString() {
            String strValueOf = String.valueOf(mo16506a());
            String strM199046f = vnq.m199040h(", ").m199046f(mo16507b());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + String.valueOf(strM199046f).length());
            sb.append(strValueOf);
            sb.append("(");
            sb.append(strM199046f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$c */
    public class C3025c extends yej0 {
        public C3025c() {
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: c */
        public void mo16508c(GenericArrayType genericArrayType) {
            m214350a(genericArrayType.getGenericComponentType());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: d */
        public void mo16509d(ParameterizedType parameterizedType) {
            m214350a(parameterizedType.getActualTypeArguments());
            m214350a(parameterizedType.getOwnerType());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: e */
        public void mo16510e(TypeVariable<?> typeVariable) {
            String strValueOf = String.valueOf(TypeToken.this.runtimeType);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append(strValueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: f */
        public void mo16511f(WildcardType wildcardType) {
            m214350a(wildcardType.getLowerBounds());
            m214350a(wildcardType.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$d */
    public class C3026d extends yej0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImmutableSet.C2802a f11287b;

        public C3026d(TypeToken typeToken, ImmutableSet.C2802a c2802a) {
            this.f11287b = c2802a;
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: b */
        public void mo16512b(Class<?> cls) {
            this.f11287b.mo15683a(cls);
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: c */
        public void mo16508c(GenericArrayType genericArrayType) {
            this.f11287b.mo15683a(Types.m16536h(TypeToken.m16505of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: d */
        public void mo16509d(ParameterizedType parameterizedType) {
            this.f11287b.mo15683a((Class) parameterizedType.getRawType());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: e */
        public void mo16510e(TypeVariable<?> typeVariable) {
            m214350a(typeVariable.getBounds());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: f */
        public void mo16511f(WildcardType wildcardType) {
            m214350a(wildcardType.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$e */
    public static class C3027e {

        /* JADX INFO: renamed from: a */
        public final Type[] f11288a;

        /* JADX INFO: renamed from: b */
        public final boolean f11289b;

        public C3027e(Type[] typeArr, boolean z) {
            this.f11288a = typeArr;
            this.f11289b = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16513a(Type type) {
            for (Type type2 : this.f11288a) {
                boolean zIsSubtypeOf = TypeToken.m16505of(type2).isSubtypeOf(type);
                boolean z = this.f11289b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f11289b;
        }

        /* JADX INFO: renamed from: b */
        public boolean m16514b(Type type) {
            TypeToken<?> typeTokenM16505of = TypeToken.m16505of(type);
            for (Type type2 : this.f11288a) {
                boolean zIsSubtypeOf = typeTokenM16505of.isSubtypeOf(type2);
                boolean z = this.f11289b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f11289b;
        }
    }

    public TypeToken(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = C3044b.m16555d(cls).m16561j(typeCapture);
        }
    }

    private static C3027e any(Type[] typeArr) {
        return new C3027e(typeArr, true);
    }

    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) m16505of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] typeArr) {
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenM16505of = m16505of(type);
            if (typeTokenM16505of.getRawType().isInterface()) {
                c2781aBuilder.mo15683a(typeTokenM16505of);
            }
        }
        return c2781aBuilder.m15702m();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).m16513a(type)) {
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
        return Types.m16541m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? Types.m16538j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static C3027e every(Type[] typeArr) {
        return new C3027e(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) m16505of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        sej0.m183662a(strValueOf.length() + 36 + strValueOf2.length(), strValueOf, " does not appear to be a subtype of ", strValueOf2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) m16505of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        sej0.m183662a(strValueOf.length() + 23 + strValueOf2.length(), strValueOf, " isn't a super type of ", strValueOf2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3044b getCovariantTypeResolver() {
        C3044b c3044b = this.covariantTypeResolver;
        if (c3044b != null) {
            return c3044b;
        }
        C3044b c3044bM16555d = C3044b.m16555d(this.runtimeType);
        this.covariantTypeResolver = c3044bM16555d;
        return c3044bM16555d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3044b getInvariantTypeResolver() {
        C3044b c3044b = this.invariantTypeResolver;
        if (c3044b != null) {
            return c3044b;
        }
        C3044b c3044bM16557f = C3044b.m16557f(this.runtimeType);
        this.invariantTypeResolver = c3044bM16557f;
        return c3044bM16557f;
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
        ImmutableSet.C2802a c2802aBuilder = ImmutableSet.builder();
        new C3026d(this, c2802aBuilder).m214350a(this.runtimeType);
        return c2802aBuilder.mo15780n();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) m16505of(typeArr[0]).getSubtype(cls);
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        sej0.m183662a(strValueOf.length() + 21 + strValueOf2.length(), strValueOf, " isn't a subclass of ", strValueOf2);
        return null;
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenM16505of = m16505of(type);
            if (typeTokenM16505of.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenM16505of.getSupertype(cls);
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(this);
        sej0.m183662a(strValueOf.length() + 23 + strValueOf2.length(), strValueOf, " isn't a super type of ", strValueOf2);
        return null;
    }

    /* JADX INFO: renamed from: is */
    private boolean m16503is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).m16514b(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).m16513a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m16505of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return m16505of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return m16504of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = m16505of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m16505of(getCovariantTypeResolver().m16561j(typeParameters[i])).m16503is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : m16505of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return m16505of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return rm80.m179968b().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return Types.JavaVersion.JAVA7.newArrayType(type);
    }

    /* JADX INFO: renamed from: of */
    public static <T> TypeToken<T> m16504of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenM16505of = m16505of(getCovariantTypeResolver().m16561j(type));
        typeTokenM16505of.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenM16505of.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenM16505of;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        return new C3044b().m16565n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).m16561j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        dpj0<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) m16505of(Types.m16538j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) m16505of(Types.m16541m(type, cls, typeParameters)) : m16504of((Class) cls);
    }

    public final AbstractC3043a<T, T> constructor(Constructor<?> constructor) {
        sf80.m183890l(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new C3024b(constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type typeM16537i = Types.m16537i(this.runtimeType);
        if (typeM16537i == null) {
            return null;
        }
        return m16505of(typeM16537i);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            c2781aBuilder.mo15683a(resolveSupertype(type2));
        }
        return c2781aBuilder.m15702m();
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
        sf80.m183889k(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        sf80.m183890l(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) m16505of(resolveTypeArgsForSubclass(cls));
        sf80.m183890l(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        sf80.m183890l(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
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
        sf80.m183894p(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).m16514b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).m16513a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).m16513a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return m16505of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
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
        return m16505of(type).isSubtypeOf(getType());
    }

    public final AbstractC3043a<T, Object> method(Method method) {
        sf80.m183890l(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C3023a(method);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new C3025c().m214350a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        sf80.m183894p(type);
        return m16505of(getInvariantTypeResolver().m16561j(type));
    }

    public String toString() {
        return Types.m16547s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? m16504of(rm80.m179969c((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(kej0<X> kej0Var, Class<X> cls) {
        return where(kej0Var, m16504of((Class) cls));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? m16504of(rm80.m179970d((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return m16505of(new C3044b().m16561j(this.runtimeType));
    }

    public enum TypeFilter implements oh80<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.reflect.TypeToken.TypeFilter, p149l.oh80
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).runtimeType instanceof TypeVariable) || (((TypeToken) typeToken).runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.reflect.TypeToken.TypeFilter, p149l.oh80
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        };

        @Override // p149l.oh80
        public abstract /* synthetic */ boolean apply(TypeToken<?> typeToken);

        /* synthetic */ TypeFilter(C3023a c3023a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f */
    public static abstract class AbstractC3028f<K> {

        /* JADX INFO: renamed from: a */
        public static final AbstractC3028f<TypeToken<?>> f11290a = new a();

        /* JADX INFO: renamed from: b */
        public static final AbstractC3028f<Class<?>> f11291b = new b();

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$a */
        public class a extends AbstractC3028f<TypeToken<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> mo16520e(TypeToken<?> typeToken) {
                return typeToken.getGenericInterfaces();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16521f(TypeToken<?> typeToken) {
                return typeToken.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> mo16522g(TypeToken<?> typeToken) {
                return typeToken.getGenericSuperclass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$b */
        public class b extends AbstractC3028f<Class<?>> {
            public b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> mo16520e(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16521f(Class<?> cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16522g(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$c */
        public class c extends e<K> {
            public c(AbstractC3028f abstractC3028f, AbstractC3028f abstractC3028f2) {
                super(abstractC3028f2);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: c */
            public ImmutableList<K> mo16518c(Iterable<? extends K> iterable) {
                ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
                for (K k : iterable) {
                    if (!mo16521f(k).isInterface()) {
                        c2781aBuilder.mo15683a(k);
                    }
                }
                return super.mo16518c(c2781aBuilder.m15702m());
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: e */
            public Iterable<? extends K> mo16520e(K k) {
                return ImmutableSet.m15768of();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$d */
        public class d extends Ordering<K> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Comparator f11292a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Map f11293b;

            public d(Comparator comparator, Map map) {
                this.f11292a = comparator;
                this.f11293b = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(K k, K k2) {
                Comparator comparator = this.f11292a;
                Object obj = this.f11293b.get(k);
                Objects.requireNonNull(obj);
                Object obj2 = this.f11293b.get(k2);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$f$e */
        public static class e<K> extends AbstractC3028f<K> {

            /* JADX INFO: renamed from: c */
            public final AbstractC3028f<K> f11294c;

            public e(AbstractC3028f<K> abstractC3028f) {
                super(null);
                this.f11294c = abstractC3028f;
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: f */
            public Class<?> mo16521f(K k) {
                return this.f11294c.mo16521f(k);
            }

            @Override // com.google.common.reflect.TypeToken.AbstractC3028f
            /* JADX INFO: renamed from: g */
            public K mo16522g(K k) {
                return this.f11294c.mo16522g(k);
            }
        }

        public AbstractC3028f() {
        }

        /* JADX INFO: renamed from: h */
        public static <K, V> ImmutableList<K> m16515h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).immutableSortedCopy(map.keySet());
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3028f<K> m16516a() {
            return new c(this, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final int m16517b(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = mo16521f(k).isInterface();
            Iterator<? extends K> it = mo16520e(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, m16517b(it.next(), map));
            }
            K kMo16522g = mo16522g(k);
            int iMax2 = iMax;
            if (kMo16522g != null) {
                iMax2 = Math.max(iMax, m16517b(kMo16522g, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        /* JADX INFO: renamed from: c */
        public ImmutableList<K> mo16518c(Iterable<? extends K> iterable) {
            HashMap mapM16041p = Maps.m16041p();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                m16517b(it.next(), mapM16041p);
            }
            return m16515h(mapM16041p, Ordering.natural().reverse());
        }

        /* JADX INFO: renamed from: d */
        public final ImmutableList<K> m16519d(K k) {
            return mo16518c(ImmutableList.m15686of(k));
        }

        /* JADX INFO: renamed from: e */
        public abstract Iterable<? extends K> mo16520e(K k);

        /* JADX INFO: renamed from: f */
        public abstract Class<?> mo16521f(K k);

        /* JADX INFO: renamed from: g */
        public abstract K mo16522g(K k);

        public /* synthetic */ AbstractC3028f(C3023a c3023a) {
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

        @Override // com.google.common.reflect.TypeToken.TypeSet, p149l.e0j, p149l.qzi, p149l.a0j
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.classes;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> immutableSetM103843i = bti.m103840g(AbstractC3028f.f11290a.m16516a().m16519d(TypeToken.this)).m103841f(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).m103843i();
            this.classes = immutableSetM103843i;
            return immutableSetM103843i;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) AbstractC3028f.f11291b.m16516a().mo16518c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ ClassSet(TypeToken typeToken, C3023a c3023a) {
            this();
        }
    }

    /* JADX INFO: renamed from: of */
    public static TypeToken<?> m16505of(Type type) {
        return new SimpleTypeToken(type);
    }

    public final <X> TypeToken<T> where(kej0<X> kej0Var, TypeToken<X> typeToken) {
        new C3044b();
        throw null;
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        sf80.m183904z(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    public /* synthetic */ TypeToken(Type type, C3023a c3023a) {
        this(type);
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) sf80.m183894p(type);
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }
}
