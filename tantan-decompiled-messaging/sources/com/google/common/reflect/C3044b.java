package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.acc0;
import p149l.sej0;
import p149l.sf80;
import p149l.v050;
import p149l.vnq;
import p149l.y9g0;
import p149l.yej0;

/* JADX INFO: renamed from: com.google.common.reflect.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3044b {

    /* JADX INFO: renamed from: a */
    public final c f11307a;

    /* JADX INFO: renamed from: com.google.common.reflect.b$a */
    public class a extends yej0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f11308b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Type f11309c;

        public a(Map map, Type type) {
            this.f11308b = map;
            this.f11309c = type;
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: b */
        public void mo16512b(Class<?> cls) {
            if (this.f11309c instanceof WildcardType) {
                return;
            }
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(this.f11309c);
            acc0.m95719a(strValueOf.length() + 25 + strValueOf2.length(), "No type mapping from ", strValueOf, " to ", strValueOf2);
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: c */
        public void mo16508c(GenericArrayType genericArrayType) {
            Type type = this.f11309c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeM16537i = Types.m16537i(type);
            sf80.m183889k(typeM16537i != null, "%s is not an array type.", this.f11309c);
            C3044b.m16558g(this.f11308b, genericArrayType.getGenericComponentType(), typeM16537i);
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: d */
        public void mo16509d(ParameterizedType parameterizedType) {
            Type type = this.f11309c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) C3044b.m16556e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                C3044b.m16558g(this.f11308b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            sf80.m183890l(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f11309c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            sf80.m183890l(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                C3044b.m16558g(this.f11308b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: e */
        public void mo16510e(TypeVariable<?> typeVariable) {
            this.f11308b.put(new d(typeVariable), this.f11309c);
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: f */
        public void mo16511f(WildcardType wildcardType) {
            Type type = this.f11309c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                sf80.m183890l(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f11309c);
                for (int i = 0; i < upperBounds.length; i++) {
                    C3044b.m16558g(this.f11308b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    C3044b.m16558g(this.f11308b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$b */
    public static final class b extends yej0 {

        /* JADX INFO: renamed from: b */
        public final Map<d, Type> f11310b = Maps.m16041p();

        /* JADX INFO: renamed from: g */
        public static ImmutableMap<d, Type> m16567g(Type type) {
            sf80.m183894p(type);
            b bVar = new b();
            bVar.m214350a(type);
            return ImmutableMap.copyOf((Map) bVar.f11310b);
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: b */
        public void mo16512b(Class<?> cls) {
            m214350a(cls.getGenericSuperclass());
            m214350a(cls.getGenericInterfaces());
        }

        @Override // p149l.yej0
        /* JADX INFO: renamed from: d */
        public void mo16509d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            sf80.m183900v(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                m16568h(new d(typeParameters[i]), actualTypeArguments[i]);
            }
            m214350a(cls);
            m214350a(parameterizedType.getOwnerType());
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

        /* JADX INFO: renamed from: h */
        public final void m16568h(d dVar, Type type) {
            if (this.f11310b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.m16573a(type2)) {
                    while (type != null) {
                        type = this.f11310b.remove(d.m16572c(type));
                    }
                    return;
                }
                type2 = this.f11310b.get(d.m16572c(type2));
            }
            this.f11310b.put(dVar, type);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final TypeVariable<?> f11314a;

        public d(TypeVariable<?> typeVariable) {
            this.f11314a = (TypeVariable) sf80.m183894p(typeVariable);
        }

        /* JADX INFO: renamed from: c */
        public static d m16572c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16573a(Type type) {
            if (type instanceof TypeVariable) {
                return m16574b((TypeVariable) type);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m16574b(TypeVariable<?> typeVariable) {
            return this.f11314a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f11314a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return m16574b(((d) obj).f11314a);
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(this.f11314a.getGenericDeclaration(), this.f11314a.getName());
        }

        public String toString() {
            return this.f11314a.toString();
        }
    }

    public C3044b() {
        this.f11307a = new c();
    }

    /* JADX INFO: renamed from: d */
    public static C3044b m16555d(Type type) {
        return new C3044b().m16566o(b.m16567g(type));
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m16556e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String strValueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            sej0.m183662a(strValueOf.length() + 10 + simpleName.length(), strValueOf, " is not a ", simpleName);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C3044b m16557f(Type type) {
        return new C3044b().m16566o(b.m16567g(e.INSTANCE.m16575a(type)));
    }

    /* JADX INFO: renamed from: g */
    public static void m16558g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).m214350a(type);
    }

    /* JADX INFO: renamed from: h */
    public final Type m16559h(GenericArrayType genericArrayType) {
        return Types.m16538j(m16561j(genericArrayType.getGenericComponentType()));
    }

    /* JADX INFO: renamed from: i */
    public final ParameterizedType m16560i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.m16541m(ownerType == null ? null : m16561j(ownerType), (Class) m16561j(parameterizedType.getRawType()), m16562k(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: renamed from: j */
    public Type m16561j(Type type) {
        sf80.m183894p(type);
        if (type instanceof TypeVariable) {
            return this.f11307a.m16569a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m16560i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m16559h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m16564m((WildcardType) type) : type;
    }

    /* JADX INFO: renamed from: k */
    public final Type[] m16562k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = m16561j(typeArr[i]);
        }
        return typeArr2;
    }

    /* JADX INFO: renamed from: l */
    public Type[] m16563l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = m16561j(typeArr[i]);
        }
        return typeArr;
    }

    /* JADX INFO: renamed from: m */
    public final WildcardType m16564m(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(m16562k(wildcardType.getLowerBounds()), m16562k(wildcardType.getUpperBounds()));
    }

    /* JADX INFO: renamed from: n */
    public C3044b m16565n(Type type, Type type2) {
        HashMap mapM16041p = Maps.m16041p();
        m16558g(mapM16041p, (Type) sf80.m183894p(type), (Type) sf80.m183894p(type2));
        return m16566o(mapM16041p);
    }

    /* JADX INFO: renamed from: o */
    public C3044b m16566o(Map<d, ? extends Type> map) {
        return new C3044b(this.f11307a.m16571c(map));
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$e */
    public static class e {
        static final e INSTANCE = new e();

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f11315a;

        /* JADX INFO: renamed from: com.google.common.reflect.b$e$a */
        public class a extends e {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeVariable f11316b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f11316b = typeVariable;
            }

            @Override // com.google.common.reflect.C3044b.e
            /* JADX INFO: renamed from: b */
            public TypeVariable<?> mo16576b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f11316b.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo16576b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public e() {
            this(new AtomicInteger());
        }

        /* JADX INFO: renamed from: a */
        public final Type m16575a(Type type) {
            sf80.m183894p(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m16538j(m16579e().m16575a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    return wildcardType.getLowerBounds().length == 0 ? mo16576b(wildcardType.getUpperBounds()) : type;
                }
                y9g0.m213537a("must have been one of the known types");
                return null;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = m16578d(typeParameters[i]).m16575a(actualTypeArguments[i]);
            }
            return Types.m16541m(m16579e().m16577c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        /* JADX INFO: renamed from: b */
        public TypeVariable<?> mo16576b(Type[] typeArr) {
            int iIncrementAndGet = this.f11315a.incrementAndGet();
            String strM199046f = vnq.m199039g('&').m199046f(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(strM199046f).length() + 33);
            sb.append("capture#");
            sb.append(iIncrementAndGet);
            sb.append("-of ? extends ");
            sb.append(strM199046f);
            return Types.m16539k(e.class, sb.toString(), typeArr);
        }

        /* JADX INFO: renamed from: c */
        public final Type m16577c(Type type) {
            if (type == null) {
                return null;
            }
            return m16575a(type);
        }

        /* JADX INFO: renamed from: d */
        public final e m16578d(TypeVariable<?> typeVariable) {
            return new a(this, this.f11315a, typeVariable);
        }

        /* JADX INFO: renamed from: e */
        public final e m16579e() {
            return new e(this.f11315a);
        }

        public /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        public e(AtomicInteger atomicInteger) {
            this.f11315a = atomicInteger;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap<d, Type> f11311a;

        /* JADX INFO: renamed from: com.google.common.reflect.b$c$a */
        public class a extends c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeVariable f11312b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f11313c;

            public a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f11312b = typeVariable;
                this.f11313c = cVar2;
            }

            @Override // com.google.common.reflect.C3044b.c
            /* JADX INFO: renamed from: b */
            public Type mo16570b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f11312b.getGenericDeclaration()) ? typeVariable : this.f11313c.mo16570b(typeVariable, cVar);
            }
        }

        public c() {
            this.f11311a = ImmutableMap.m15715of();
        }

        /* JADX INFO: renamed from: a */
        public final Type m16569a(TypeVariable<?> typeVariable) {
            return mo16570b(typeVariable, new a(this, typeVariable, this));
        }

        /* JADX INFO: renamed from: b */
        public Type mo16570b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f11311a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new C3044b(cVar, aVar).m16561j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrM16562k = new C3044b(cVar, aVar).m16562k(bounds);
                if (!Types.C3040b.f11297a || !Arrays.equals(bounds, typeArrM16562k)) {
                    return Types.m16539k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrM16562k);
                }
            }
            return typeVariable;
        }

        /* JADX INFO: renamed from: c */
        public final c m16571c(Map<d, ? extends Type> map) {
            ImmutableMap.C2786b c2786bBuilder = ImmutableMap.builder();
            c2786bBuilder.mo15664j(this.f11311a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                sf80.m183889k(!key.m16573a(value), "Type variable %s bound to itself", key);
                c2786bBuilder.mo15661g(key, value);
            }
            return new c(c2786bBuilder.mo15660d());
        }

        public c(ImmutableMap<d, Type> immutableMap) {
            this.f11311a = immutableMap;
        }
    }

    public /* synthetic */ C3044b(c cVar, a aVar) {
        this(cVar);
    }

    public C3044b(c cVar) {
        this.f11307a = cVar;
    }
}
