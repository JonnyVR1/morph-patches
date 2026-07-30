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
import p153l.coj0;
import p153l.gig0;
import p153l.hkc0;
import p153l.k950;
import p153l.upq;
import p153l.wnj0;
import p153l.xn80;

/* JADX INFO: renamed from: com.google.common.reflect.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3067b {

    /* JADX INFO: renamed from: a */
    public final c f11344a;

    /* JADX INFO: renamed from: com.google.common.reflect.b$a */
    public class a extends coj0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f11345b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Type f11346c;

        public a(Map map, Type type) {
            this.f11345b = map;
            this.f11346c = type;
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: b */
        public void mo16567b(Class<?> cls) {
            if (this.f11346c instanceof WildcardType) {
                return;
            }
            String strValueOf = String.valueOf(cls);
            String strValueOf2 = String.valueOf(this.f11346c);
            hkc0.m135621a(strValueOf.length() + 25 + strValueOf2.length(), "No type mapping from ", strValueOf, " to ", strValueOf2);
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: c */
        public void mo16563c(GenericArrayType genericArrayType) {
            Type type = this.f11346c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeM16592i = Types.m16592i(type);
            xn80.m212106k(typeM16592i != null, "%s is not an array type.", this.f11346c);
            C3067b.m16613g(this.f11345b, genericArrayType.getGenericComponentType(), typeM16592i);
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: d */
        public void mo16564d(ParameterizedType parameterizedType) {
            Type type = this.f11346c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) C3067b.m16611e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                C3067b.m16613g(this.f11345b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            xn80.m212107l(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f11346c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            xn80.m212107l(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                C3067b.m16613g(this.f11345b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: e */
        public void mo16565e(TypeVariable<?> typeVariable) {
            this.f11345b.put(new d(typeVariable), this.f11346c);
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: f */
        public void mo16566f(WildcardType wildcardType) {
            Type type = this.f11346c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                xn80.m212107l(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f11346c);
                for (int i = 0; i < upperBounds.length; i++) {
                    C3067b.m16613g(this.f11345b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    C3067b.m16613g(this.f11345b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$b */
    public static final class b extends coj0 {

        /* JADX INFO: renamed from: b */
        public final Map<d, Type> f11347b = Maps.m16095p();

        /* JADX INFO: renamed from: g */
        public static ImmutableMap<d, Type> m16622g(Type type) {
            xn80.m212111p(type);
            b bVar = new b();
            bVar.m111669a(type);
            return ImmutableMap.copyOf((Map) bVar.f11347b);
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: b */
        public void mo16567b(Class<?> cls) {
            m111669a(cls.getGenericSuperclass());
            m111669a(cls.getGenericInterfaces());
        }

        @Override // p153l.coj0
        /* JADX INFO: renamed from: d */
        public void mo16564d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            xn80.m212117v(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                m16623h(new d(typeParameters[i]), actualTypeArguments[i]);
            }
            m111669a(cls);
            m111669a(parameterizedType.getOwnerType());
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

        /* JADX INFO: renamed from: h */
        public final void m16623h(d dVar, Type type) {
            if (this.f11347b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.m16628a(type2)) {
                    while (type != null) {
                        type = this.f11347b.remove(d.m16627c(type));
                    }
                    return;
                }
                type2 = this.f11347b.get(d.m16627c(type2));
            }
            this.f11347b.put(dVar, type);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final TypeVariable<?> f11351a;

        public d(TypeVariable<?> typeVariable) {
            this.f11351a = (TypeVariable) xn80.m212111p(typeVariable);
        }

        /* JADX INFO: renamed from: c */
        public static d m16627c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16628a(Type type) {
            if (type instanceof TypeVariable) {
                return m16629b((TypeVariable) type);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m16629b(TypeVariable<?> typeVariable) {
            return this.f11351a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f11351a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return m16629b(((d) obj).f11351a);
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(this.f11351a.getGenericDeclaration(), this.f11351a.getName());
        }

        public String toString() {
            return this.f11351a.toString();
        }
    }

    public C3067b() {
        this.f11344a = new c();
    }

    /* JADX INFO: renamed from: d */
    public static C3067b m16610d(Type type) {
        return new C3067b().m16621o(b.m16622g(type));
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m16611e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String strValueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            wnj0.m207212a(strValueOf.length() + 10 + simpleName.length(), strValueOf, " is not a ", simpleName);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C3067b m16612f(Type type) {
        return new C3067b().m16621o(b.m16622g(e.INSTANCE.m16630a(type)));
    }

    /* JADX INFO: renamed from: g */
    public static void m16613g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).m111669a(type);
    }

    /* JADX INFO: renamed from: h */
    public final Type m16614h(GenericArrayType genericArrayType) {
        return Types.m16593j(m16616j(genericArrayType.getGenericComponentType()));
    }

    /* JADX INFO: renamed from: i */
    public final ParameterizedType m16615i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.m16596m(ownerType == null ? null : m16616j(ownerType), (Class) m16616j(parameterizedType.getRawType()), m16617k(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: renamed from: j */
    public Type m16616j(Type type) {
        xn80.m212111p(type);
        if (type instanceof TypeVariable) {
            return this.f11344a.m16624a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m16615i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m16614h((GenericArrayType) type);
        }
        return type instanceof WildcardType ? m16619m((WildcardType) type) : type;
    }

    /* JADX INFO: renamed from: k */
    public final Type[] m16617k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = m16616j(typeArr[i]);
        }
        return typeArr2;
    }

    /* JADX INFO: renamed from: l */
    public Type[] m16618l(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = m16616j(typeArr[i]);
        }
        return typeArr;
    }

    /* JADX INFO: renamed from: m */
    public final WildcardType m16619m(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(m16617k(wildcardType.getLowerBounds()), m16617k(wildcardType.getUpperBounds()));
    }

    /* JADX INFO: renamed from: n */
    public C3067b m16620n(Type type, Type type2) {
        HashMap mapM16095p = Maps.m16095p();
        m16613g(mapM16095p, (Type) xn80.m212111p(type), (Type) xn80.m212111p(type2));
        return m16621o(mapM16095p);
    }

    /* JADX INFO: renamed from: o */
    public C3067b m16621o(Map<d, ? extends Type> map) {
        return new C3067b(this.f11344a.m16626c(map));
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$e */
    public static class e {
        static final e INSTANCE = new e();

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f11352a;

        /* JADX INFO: renamed from: com.google.common.reflect.b$e$a */
        public class a extends e {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeVariable f11353b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f11353b = typeVariable;
            }

            @Override // com.google.common.reflect.C3067b.e
            /* JADX INFO: renamed from: b */
            public TypeVariable<?> mo16631b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f11353b.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo16631b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public e() {
            this(new AtomicInteger());
        }

        /* JADX INFO: renamed from: a */
        public final Type m16630a(Type type) {
            xn80.m212111p(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.m16593j(m16634e().m16630a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    return wildcardType.getLowerBounds().length == 0 ? mo16631b(wildcardType.getUpperBounds()) : type;
                }
                gig0.m130323a("must have been one of the known types");
                return null;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = m16633d(typeParameters[i]).m16630a(actualTypeArguments[i]);
            }
            return Types.m16596m(m16634e().m16632c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        /* JADX INFO: renamed from: b */
        public TypeVariable<?> mo16631b(Type[] typeArr) {
            int iIncrementAndGet = this.f11352a.incrementAndGet();
            String strM197181f = upq.m197174g('&').m197181f(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(strM197181f).length() + 33);
            sb.append("capture#");
            sb.append(iIncrementAndGet);
            sb.append("-of ? extends ");
            sb.append(strM197181f);
            return Types.m16594k(e.class, sb.toString(), typeArr);
        }

        /* JADX INFO: renamed from: c */
        public final Type m16632c(Type type) {
            if (type == null) {
                return null;
            }
            return m16630a(type);
        }

        /* JADX INFO: renamed from: d */
        public final e m16633d(TypeVariable<?> typeVariable) {
            return new a(this, this.f11352a, typeVariable);
        }

        /* JADX INFO: renamed from: e */
        public final e m16634e() {
            return new e(this.f11352a);
        }

        public /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        public e(AtomicInteger atomicInteger) {
            this.f11352a = atomicInteger;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ImmutableMap<d, Type> f11348a;

        /* JADX INFO: renamed from: com.google.common.reflect.b$c$a */
        public class a extends c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeVariable f11349b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ c f11350c;

            public a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f11349b = typeVariable;
                this.f11350c = cVar2;
            }

            @Override // com.google.common.reflect.C3067b.c
            /* JADX INFO: renamed from: b */
            public Type mo16625b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f11349b.getGenericDeclaration()) ? typeVariable : this.f11350c.mo16625b(typeVariable, cVar);
            }
        }

        public c() {
            this.f11348a = ImmutableMap.m15769of();
        }

        /* JADX INFO: renamed from: a */
        public final Type m16624a(TypeVariable<?> typeVariable) {
            return mo16625b(typeVariable, new a(this, typeVariable, this));
        }

        /* JADX INFO: renamed from: b */
        public Type mo16625b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f11348a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new C3067b(cVar, aVar).m16616j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrM16617k = new C3067b(cVar, aVar).m16617k(bounds);
                if (!Types.C3063b.f11334a || !Arrays.equals(bounds, typeArrM16617k)) {
                    return Types.m16594k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrM16617k);
                }
            }
            return typeVariable;
        }

        /* JADX INFO: renamed from: c */
        public final c m16626c(Map<d, ? extends Type> map) {
            ImmutableMap.C2809b c2809bBuilder = ImmutableMap.builder();
            c2809bBuilder.mo15718j(this.f11348a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                xn80.m212106k(!key.m16628a(value), "Type variable %s bound to itself", key);
                c2809bBuilder.mo15715g(key, value);
            }
            return new c(c2809bBuilder.mo15714d());
        }

        public c(ImmutableMap<d, Type> immutableMap) {
            this.f11348a = immutableMap;
        }
    }

    public /* synthetic */ C3067b(c cVar, a aVar) {
        this(cVar);
    }

    public C3067b(c cVar) {
        this.f11344a = cVar;
    }
}
