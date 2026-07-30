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
import p149l.g1f;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JavaResolverSettings f64957a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$a */
    public static final class C15222a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final KotlinType f64958a;

        /* JADX INFO: renamed from: b */
        public final int f64959b;

        public C15222a(@Nullable KotlinType kotlinType, int i) {
            this.f64958a = kotlinType;
            this.f64959b = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m89952a() {
            return this.f64959b;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final KotlinType m89953b() {
            return this.f64958a;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$b */
    public static final class C15223b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final SimpleType f64960a;

        /* JADX INFO: renamed from: b */
        public final int f64961b;

        /* JADX INFO: renamed from: c */
        public final boolean f64962c;

        public C15223b(@Nullable SimpleType simpleType, int i, boolean z) {
            this.f64960a = simpleType;
            this.f64961b = i;
            this.f64962c = z;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m89954a() {
            return this.f64962c;
        }

        /* JADX INFO: renamed from: b */
        public final int m89955b() {
            return this.f64961b;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final SimpleType m89956c() {
            return this.f64960a;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        javaResolverSettings.getClass();
        this.f64957a = javaResolverSettings;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C15223b m89947c(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return javaTypeEnhancement.m89949b(simpleType, function1, i, typeComponentPosition, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final KotlinType m89948a(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> function1, boolean z) {
        kotlinType.getClass();
        function1.getClass();
        return m89950d(kotlinType.mo92625J0(), function1, 0, z).m89953b();
    }

    /* JADX INFO: renamed from: b */
    public final C15223b m89949b(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        TypeConstructor typeConstructorMo91890G0;
        Boolean bool;
        C15222a c15222a;
        TypeProjection typeProjectionM92808s;
        Function1<? super Integer, JavaTypeQualifiers> function2 = function1;
        boolean zM90102a = TypeComponentPositionKt.m90102a(typeComponentPosition);
        boolean z3 = (z2 && z) ? false : true;
        KotlinType kotlinType = null;
        if (!zM90102a && simpleType.mo91888E0().isEmpty()) {
            return new C15223b(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo88316e = simpleType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e == null) {
            return new C15223b(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function2.invoke(Integer.valueOf(i));
        ClassifierDescriptor classifierDescriptorM90110f = TypeEnhancementKt.m90110f(classifierDescriptorMo88316e, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean boolM90112h = TypeEnhancementKt.m90112h(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorM90110f == null || (typeConstructorMo91890G0 = classifierDescriptorM90110f.mo88305l()) == null) {
            typeConstructorMo91890G0 = simpleType.mo91890G0();
        }
        TypeConstructor typeConstructor = typeConstructorMo91890G0;
        int iM89952a = i + 1;
        List<TypeProjection> listMo91888E0 = simpleType.mo91888E0();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        parameters.getClass();
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = listMo91888E0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(listMo91888E0, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z3) {
                bool = boolM90112h;
                if (!typeProjection.mo92666b()) {
                    c15222a = m89950d(typeProjection.getType().mo92625J0(), function2, iM89952a, z2);
                } else if (function2.invoke(Integer.valueOf(iM89952a)).m89962f() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeMo92625J0 = typeProjection.getType().mo92625J0();
                    c15222a = new C15222a(KotlinTypeFactory.m92629e(FlexibleTypesKt.m92607c(unwrappedTypeMo92625J0).mo89967N0(false), FlexibleTypesKt.m92608d(unwrappedTypeMo92625J0).mo89967N0(true)), 1);
                } else {
                    c15222a = new C15222a(null, 1);
                }
            } else {
                bool = boolM90112h;
                c15222a = new C15222a(kotlinType, 0);
            }
            iM89952a += c15222a.m89952a();
            if (c15222a.m89953b() != null) {
                KotlinType kotlinTypeM89953b = c15222a.m89953b();
                Variance varianceMo92667c = typeProjection.mo92667c();
                varianceMo92667c.getClass();
                typeProjectionM92808s = TypeUtilsKt.m93091k(kotlinTypeM89953b, varianceMo92667c, typeParameterDescriptor);
            } else if (classifierDescriptorM90110f == null || typeProjection.mo92666b()) {
                typeProjectionM92808s = classifierDescriptorM90110f != null ? TypeUtils.m92808s(typeParameterDescriptor) : null;
            } else {
                KotlinType type = typeProjection.getType();
                type.getClass();
                Variance varianceMo92667c2 = typeProjection.mo92667c();
                varianceMo92667c2.getClass();
                typeProjectionM92808s = TypeUtilsKt.m93091k(type, varianceMo92667c2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionM92808s);
            function2 = function1;
            boolM90112h = bool;
            kotlinType = null;
        }
        Boolean bool2 = boolM90112h;
        int i2 = iM89952a - i;
        if (classifierDescriptorM90110f == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new C15223b(null, i2, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        g1f g1fVar = TypeEnhancementKt.f64990b;
        if (classifierDescriptorM90110f == null) {
            g1fVar = null;
        }
        TypeAttributes typeAttributesM92711b = TypeAttributesKt.m92711b(TypeEnhancementKt.m90109e(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, g1fVar, bool2 != null ? TypeEnhancementKt.m90111g() : null})));
        List<TypeProjection> listMo91888E1 = simpleType.mo91888E0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listMo91888E1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(listMo91888E1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeM92634k = KotlinTypeFactory.m92634k(typeAttributesM92711b, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.mo89966H0(), null, 16, null);
        if (javaTypeQualifiersInvoke.m89960d()) {
            simpleTypeM92634k = m89951e(simpleTypeM92634k);
        }
        return new C15223b(simpleTypeM92634k, i2, bool2 != null && javaTypeQualifiersInvoke.m89963g());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX INFO: renamed from: d */
    public final C15222a m89950d(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, boolean z) {
        KotlinType kotlinTypeM89956c;
        KotlinType kotlinTypeM92818d = null;
        if (KotlinTypeKt.m92644a(unwrappedType)) {
            return new C15222a(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (unwrappedType instanceof SimpleType) {
                C15223b c15223bM89947c = m89947c(this, (SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
                return new C15222a(c15223bM89947c.m89954a() ? TypeWithEnhancementKt.m92818d(unwrappedType, c15223bM89947c.m89956c()) : c15223bM89947c.m89956c(), c15223bM89947c.m89955b());
            }
            l9r.m149037a();
            return null;
        }
        boolean z2 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        C15223b c15223bM89949b = m89949b(flexibleType.m92597O0(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
        C15223b c15223bM89949b2 = m89949b(flexibleType.m92598P0(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
        c15223bM89949b.m89955b();
        c15223bM89949b2.m89955b();
        if (c15223bM89949b.m89956c() != null || c15223bM89949b2.m89956c() != null) {
            if (c15223bM89949b.m89954a() || c15223bM89949b2.m89954a()) {
                SimpleType simpleTypeM89956c = c15223bM89949b2.m89956c();
                if (simpleTypeM89956c == null) {
                    kotlinTypeM89956c = c15223bM89949b.m89956c();
                    kotlinTypeM89956c.getClass();
                } else {
                    SimpleType simpleTypeM89956c2 = c15223bM89949b.m89956c();
                    if (simpleTypeM89956c2 == null) {
                        simpleTypeM89956c2 = simpleTypeM89956c;
                    }
                    kotlinTypeM89956c = KotlinTypeFactory.m92629e(simpleTypeM89956c2, simpleTypeM89956c);
                    if (kotlinTypeM89956c == null) {
                        kotlinTypeM89956c = c15223bM89949b.m89956c();
                        kotlinTypeM89956c.getClass();
                    }
                }
                kotlinTypeM92818d = TypeWithEnhancementKt.m92818d(unwrappedType, kotlinTypeM89956c);
            } else if (z2) {
                SimpleType simpleTypeM89956c3 = c15223bM89949b.m89956c();
                if (simpleTypeM89956c3 == null) {
                    simpleTypeM89956c3 = flexibleType.m92597O0();
                }
                SimpleType simpleTypeM89956c4 = c15223bM89949b2.m89956c();
                if (simpleTypeM89956c4 == null) {
                    simpleTypeM89956c4 = flexibleType.m92598P0();
                }
                kotlinTypeM92818d = new RawTypeImpl(simpleTypeM89956c3, simpleTypeM89956c4);
            } else {
                SimpleType simpleTypeM89956c5 = c15223bM89949b.m89956c();
                if (simpleTypeM89956c5 == null) {
                    simpleTypeM89956c5 = flexibleType.m92597O0();
                }
                SimpleType simpleTypeM89956c6 = c15223bM89949b2.m89956c();
                if (simpleTypeM89956c6 == null) {
                    simpleTypeM89956c6 = flexibleType.m92598P0();
                }
                kotlinTypeM92818d = KotlinTypeFactory.m92629e(simpleTypeM89956c5, simpleTypeM89956c6);
            }
        }
        return new C15222a(kotlinTypeM92818d, c15223bM89949b.m89955b());
    }

    /* JADX INFO: renamed from: e */
    public final SimpleType m89951e(SimpleType simpleType) {
        return this.f64957a.mo89606a() ? SpecialTypesKt.m92661h(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }
}
