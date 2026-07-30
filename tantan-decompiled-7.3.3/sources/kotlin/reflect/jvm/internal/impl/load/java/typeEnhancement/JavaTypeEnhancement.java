package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l2f;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaResolverSettings f65631a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a */
    public static final class C15329a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final KotlinType f65632a;

        /* JADX INFO: renamed from: b */
        public final int f65633b;

        public C15329a(@Nullable KotlinType kotlinType, int i) {
            this.f65632a = kotlinType;
            this.f65633b = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m90843a() {
            return this.f65633b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final KotlinType m90844b() {
            return this.f65632a;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$b */
    public static final class C15330b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final SimpleType f65634a;

        /* JADX INFO: renamed from: b */
        public final int f65635b;

        /* JADX INFO: renamed from: c */
        public final boolean f65636c;

        public C15330b(@Nullable SimpleType simpleType, int i, boolean z) {
            this.f65634a = simpleType;
            this.f65635b = i;
            this.f65636c = z;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m90845a() {
            return this.f65636c;
        }

        /* JADX INFO: renamed from: b */
        public final int m90846b() {
            return this.f65635b;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final SimpleType m90847c() {
            return this.f65634a;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        javaResolverSettings.getClass();
        this.f65631a = javaResolverSettings;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C15330b m90838c(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return javaTypeEnhancement.m90840b(simpleType, function1, i, typeComponentPosition, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final KotlinType m90839a(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> function1, boolean z) {
        kotlinType.getClass();
        function1.getClass();
        return m90841d(kotlinType.mo93516J0(), function1, 0, z).m90844b();
    }

    /* JADX INFO: renamed from: b */
    public final C15330b m90840b(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        TypeConstructor typeConstructorMo92781G0;
        Boolean bool;
        C15329a c15329a;
        TypeProjection typeProjectionM93699s;
        Function1<? super Integer, JavaTypeQualifiers> function2 = function1;
        boolean zM90993a = TypeComponentPositionKt.m90993a(typeComponentPosition);
        boolean z3 = (z2 && z) ? false : true;
        KotlinType kotlinType = null;
        if (!zM90993a && simpleType.mo92779E0().isEmpty()) {
            return new C15330b(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo89207e = simpleType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e == null) {
            return new C15330b(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function2.invoke(Integer.valueOf(i));
        ClassifierDescriptor classifierDescriptorM91001f = TypeEnhancementKt.m91001f(classifierDescriptorMo89207e, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean boolM91003h = TypeEnhancementKt.m91003h(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorM91001f == null || (typeConstructorMo92781G0 = classifierDescriptorM91001f.mo89196l()) == null) {
            typeConstructorMo92781G0 = simpleType.mo92781G0();
        }
        TypeConstructor typeConstructor = typeConstructorMo92781G0;
        int iM90843a = i + 1;
        List<TypeProjection> listMo92779E0 = simpleType.mo92779E0();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        parameters.getClass();
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = listMo92779E0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(listMo92779E0, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z3) {
                bool = boolM91003h;
                if (!typeProjection.mo93557b()) {
                    c15329a = m90841d(typeProjection.getType().mo93516J0(), function2, iM90843a, z2);
                } else if (function2.invoke(Integer.valueOf(iM90843a)).m90853f() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeMo93516J0 = typeProjection.getType().mo93516J0();
                    c15329a = new C15329a(KotlinTypeFactory.m93520e(FlexibleTypesKt.m93498c(unwrappedTypeMo93516J0).mo90858N0(false), FlexibleTypesKt.m93499d(unwrappedTypeMo93516J0).mo90858N0(true)), 1);
                } else {
                    c15329a = new C15329a(null, 1);
                }
            } else {
                bool = boolM91003h;
                c15329a = new C15329a(kotlinType, 0);
            }
            iM90843a += c15329a.m90843a();
            if (c15329a.m90844b() != null) {
                KotlinType kotlinTypeM90844b = c15329a.m90844b();
                Variance varianceMo93558c = typeProjection.mo93558c();
                varianceMo93558c.getClass();
                typeProjectionM93699s = TypeUtilsKt.m93982k(kotlinTypeM90844b, varianceMo93558c, typeParameterDescriptor);
            } else if (classifierDescriptorM91001f == null || typeProjection.mo93557b()) {
                typeProjectionM93699s = classifierDescriptorM91001f != null ? TypeUtils.m93699s(typeParameterDescriptor) : null;
            } else {
                KotlinType type = typeProjection.getType();
                type.getClass();
                Variance varianceMo93558c2 = typeProjection.mo93558c();
                varianceMo93558c2.getClass();
                typeProjectionM93699s = TypeUtilsKt.m93982k(type, varianceMo93558c2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionM93699s);
            function2 = function1;
            boolM91003h = bool;
            kotlinType = null;
        }
        Boolean bool2 = boolM91003h;
        int i2 = iM90843a - i;
        if (classifierDescriptorM91001f == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new C15330b(null, i2, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        l2f l2fVar = TypeEnhancementKt.f65664b;
        if (classifierDescriptorM91001f == null) {
            l2fVar = null;
        }
        TypeAttributes typeAttributesM93602b = TypeAttributesKt.m93602b(TypeEnhancementKt.m91000e(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, l2fVar, bool2 != null ? TypeEnhancementKt.m91002g() : null})));
        List<TypeProjection> listMo92779E1 = simpleType.mo92779E0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listMo92779E1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(listMo92779E1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeM93525k = KotlinTypeFactory.m93525k(typeAttributesM93602b, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.mo90857H0(), null, 16, null);
        if (javaTypeQualifiersInvoke.m90851d()) {
            simpleTypeM93525k = m90842e(simpleTypeM93525k);
        }
        return new C15330b(simpleTypeM93525k, i2, bool2 != null && javaTypeQualifiersInvoke.m90854g());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX INFO: renamed from: d */
    public final C15329a m90841d(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, boolean z) {
        KotlinType kotlinTypeM90847c;
        KotlinType kotlinTypeM93709d = null;
        if (KotlinTypeKt.m93535a(unwrappedType)) {
            return new C15329a(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (unwrappedType instanceof SimpleType) {
                C15330b c15330bM90838c = m90838c(this, (SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
                return new C15329a(c15330bM90838c.m90845a() ? TypeWithEnhancementKt.m93709d(unwrappedType, c15330bM90838c.m90847c()) : c15330bM90838c.m90847c(), c15330bM90838c.m90846b());
            }
            nbr.m162172a();
            return null;
        }
        boolean z2 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        C15330b c15330bM90840b = m90840b(flexibleType.m93488O0(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
        C15330b c15330bM90840b2 = m90840b(flexibleType.m93489P0(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
        c15330bM90840b.m90846b();
        c15330bM90840b2.m90846b();
        if (c15330bM90840b.m90847c() != null || c15330bM90840b2.m90847c() != null) {
            if (c15330bM90840b.m90845a() || c15330bM90840b2.m90845a()) {
                SimpleType simpleTypeM90847c = c15330bM90840b2.m90847c();
                if (simpleTypeM90847c == null) {
                    kotlinTypeM90847c = c15330bM90840b.m90847c();
                    kotlinTypeM90847c.getClass();
                } else {
                    SimpleType simpleTypeM90847c2 = c15330bM90840b.m90847c();
                    if (simpleTypeM90847c2 == null) {
                        simpleTypeM90847c2 = simpleTypeM90847c;
                    }
                    kotlinTypeM90847c = KotlinTypeFactory.m93520e(simpleTypeM90847c2, simpleTypeM90847c);
                    if (kotlinTypeM90847c == null) {
                        kotlinTypeM90847c = c15330bM90840b.m90847c();
                        kotlinTypeM90847c.getClass();
                    }
                }
                kotlinTypeM93709d = TypeWithEnhancementKt.m93709d(unwrappedType, kotlinTypeM90847c);
            } else if (z2) {
                SimpleType simpleTypeM90847c3 = c15330bM90840b.m90847c();
                if (simpleTypeM90847c3 == null) {
                    simpleTypeM90847c3 = flexibleType.m93488O0();
                }
                SimpleType simpleTypeM90847c4 = c15330bM90840b2.m90847c();
                if (simpleTypeM90847c4 == null) {
                    simpleTypeM90847c4 = flexibleType.m93489P0();
                }
                kotlinTypeM93709d = new RawTypeImpl(simpleTypeM90847c3, simpleTypeM90847c4);
            } else {
                SimpleType simpleTypeM90847c5 = c15330bM90840b.m90847c();
                if (simpleTypeM90847c5 == null) {
                    simpleTypeM90847c5 = flexibleType.m93488O0();
                }
                SimpleType simpleTypeM90847c6 = c15330bM90840b2.m90847c();
                if (simpleTypeM90847c6 == null) {
                    simpleTypeM90847c6 = flexibleType.m93489P0();
                }
                kotlinTypeM93709d = KotlinTypeFactory.m93520e(simpleTypeM90847c5, simpleTypeM90847c6);
            }
        }
        return new C15329a(kotlinTypeM93709d, c15330bM90840b.m90846b());
    }

    /* JADX INFO: renamed from: e */
    public final SimpleType m90842e(SimpleType simpleType) {
        return this.f65631a.mo90497a() ? SpecialTypesKt.m93552h(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }
}
