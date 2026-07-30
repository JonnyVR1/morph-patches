package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aoj0;
import p153l.nbr;
import p153l.ynj0;
import p153l.znj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeUtilsKt {
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final KotlinType m93966A(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType kotlinTypeM93694n = TypeUtils.m93694n(kotlinType);
        kotlinTypeM93694n.getClass();
        return kotlinTypeM93694n;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final KotlinType m93967B(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType kotlinTypeM93695o = TypeUtils.m93695o(kotlinType);
        kotlinTypeM93695o.getClass();
        return kotlinTypeM93695o;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final KotlinType m93968C(@NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        kotlinType.getClass();
        annotations.getClass();
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.mo93516J0().mo90785M0(TypeAttributesKt.m93601a(kotlinType.mo92780F0(), annotations));
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final KotlinType m93969D(@NotNull KotlinType kotlinType) {
        SimpleType simpleType;
        UnwrappedType unwrappedTypeM93656f;
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
        if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo93516J0;
            SimpleType simpleTypeM93488O0 = flexibleType.m93488O0();
            if (!simpleTypeM93488O0.mo92781G0().getParameters().isEmpty() && simpleTypeM93488O0.mo92781G0().mo89207e() != null) {
                List<TypeParameterDescriptor> parameters = simpleTypeM93488O0.mo92781G0().getParameters();
                parameters.getClass();
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleTypeM93488O0 = TypeSubstitutionKt.m93656f(simpleTypeM93488O0, arrayList, null, 2, null);
            }
            SimpleType simpleTypeM93489P0 = flexibleType.m93489P0();
            if (!simpleTypeM93489P0.mo92781G0().getParameters().isEmpty() && simpleTypeM93489P0.mo92781G0().mo89207e() != null) {
                List<TypeParameterDescriptor> parameters2 = simpleTypeM93489P0.mo92781G0().getParameters();
                parameters2.getClass();
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleTypeM93489P0 = TypeSubstitutionKt.m93656f(simpleTypeM93489P0, arrayList2, null, 2, null);
            }
            unwrappedTypeM93656f = KotlinTypeFactory.m93520e(simpleTypeM93488O0, simpleTypeM93489P0);
        } else {
            if (!(unwrappedTypeMo93516J0 instanceof SimpleType)) {
                nbr.m162172a();
                return null;
            }
            simpleType = (SimpleType) unwrappedTypeMo93516J0;
            if (!simpleType.mo92781G0().getParameters().isEmpty() && simpleType.mo92781G0().mo89207e() != null) {
                unwrappedTypeM93656f = simpleType;
                unwrappedTypeM93656f = simpleType;
                List<TypeParameterDescriptor> parameters3 = simpleType.mo92781G0().getParameters();
                parameters3.getClass();
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                }
                unwrappedTypeM93656f = TypeSubstitutionKt.m93656f(simpleType, arrayList3, null, 2, null);
            }
        }
        unwrappedTypeM93656f = simpleType;
        unwrappedTypeM93656f = simpleType;
        unwrappedTypeM93656f = simpleType;
        return TypeWithEnhancementKt.m93707b(unwrappedTypeM93656f, unwrappedTypeMo93516J0);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m93970E(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m93976e(kotlinType, aoj0.INSTANCE);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m93971F(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = unwrappedType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e != null) {
            return (classifierDescriptorMo89207e instanceof TypeAliasDescriptor) || (classifierDescriptorMo89207e instanceof TypeParameterDescriptor);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final TypeProjection m93975d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(kotlinType);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m93976e(@NotNull KotlinType kotlinType, @NotNull Function1<? super UnwrappedType, Boolean> function1) {
        kotlinType.getClass();
        function1.getClass();
        return TypeUtils.m93683c(kotlinType, function1);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m93977f(KotlinType kotlinType, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        boolean zM93977f;
        if (Intrinsics.m88377d(kotlinType.mo92781G0(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo89207e instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo89207e : null;
        List<TypeParameterDescriptor> listMo89200p = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.mo89200p() : null;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(kotlinType.mo92779E0());
        if ((iterableWithIndex instanceof Collection) && ((Collection) iterableWithIndex).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            TypeProjection typeProjection = (TypeProjection) indexedValue.component2();
            TypeParameterDescriptor typeParameterDescriptor = listMo89200p != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(listMo89200p, index) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.mo93557b()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                zM93977f = m93977f(type, typeConstructor, set);
            } else {
                zM93977f = false;
            }
            if (zM93977f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m93978g(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m93976e(kotlinType, znj0.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m93979h(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = unwrappedType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e != null) {
            return m93995x(classifierDescriptorMo89207e);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m93980i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m93683c(kotlinType, ynj0.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m93981j(UnwrappedType unwrappedType) {
        return Boolean.valueOf(TypeUtils.m93693m(unwrappedType));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final TypeProjection m93982k(@NotNull KotlinType kotlinType, @NotNull Variance variance, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        kotlinType.getClass();
        variance.getClass();
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.mo89492h() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<TypeParameterDescriptor> m93983l(@NotNull KotlinType kotlinType, @Nullable Set<? extends TypeParameterDescriptor> set) {
        kotlinType.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m93984m(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m */
    public static final void m93984m(KotlinType kotlinType, KotlinType kotlinType2, Set<TypeParameterDescriptor> set, Set<? extends TypeParameterDescriptor> set2) {
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
            if (!Intrinsics.m88377d(kotlinType.mo92781G0(), kotlinType2.mo92781G0())) {
                set.add(classifierDescriptorMo89207e);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) classifierDescriptorMo89207e).getUpperBounds()) {
                kotlinType3.getClass();
                m93984m(kotlinType3, kotlinType2, set, set2);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorMo89207e2 = kotlinType.mo92781G0().mo89207e();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo89207e2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo89207e2 : null;
        List<TypeParameterDescriptor> listMo89200p = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.mo89200p() : null;
        int i = 0;
        for (TypeProjection typeProjection : kotlinType.mo92779E0()) {
            int i2 = i + 1;
            TypeParameterDescriptor typeParameterDescriptor = listMo89200p != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(listMo89200p, i) : null;
            if ((typeParameterDescriptor == null || set2 == null || !set2.contains(typeParameterDescriptor)) && !typeProjection.mo93557b() && !CollectionsKt.contains(set, typeProjection.getType().mo92781G0().mo89207e()) && !Intrinsics.m88377d(typeProjection.getType().mo92781G0(), kotlinType2.mo92781G0())) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                m93984m(type, kotlinType2, set, set2);
            }
            i = i2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final KotlinBuiltIns m93985n(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinBuiltIns kotlinBuiltInsMo89570f = kotlinType.mo92781G0().mo89570f();
        kotlinBuiltInsMo89570f.getClass();
        return kotlinBuiltInsMo89570f;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final KotlinType m93986o(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        typeParameterDescriptor.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorMo89207e = ((KotlinType) next).mo92781G0().mo89207e();
            ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        upperBounds3.getClass();
        Object objFirst = CollectionsKt.first((List<? extends Object>) upperBounds3);
        objFirst.getClass();
        return (KotlinType) objFirst;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: p */
    public static final boolean m93987p(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return m93989r(typeParameterDescriptor, null, null, 6, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: q */
    public static final boolean m93988q(@NotNull TypeParameterDescriptor typeParameterDescriptor, @Nullable TypeConstructor typeConstructor, @Nullable Set<? extends TypeParameterDescriptor> set) {
        typeParameterDescriptor.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            kotlinType.getClass();
            if (m93977f(kotlinType, typeParameterDescriptor.mo89349o().mo92781G0(), set) && (typeConstructor == null || Intrinsics.m88377d(kotlinType.mo92781G0(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m93989r(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m93988q(typeParameterDescriptor, typeConstructor, set);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m93990s(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.m89076g0(kotlinType);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m93991t(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.m89084o0(kotlinType);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m93992u(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof AbstractStubType) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).m93463S0() instanceof AbstractStubType);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m93993v(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof StubTypeForBuilderInference) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).m93463S0() instanceof StubTypeForBuilderInference);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m93994w(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return KotlinTypeChecker.f66972a.mo93795d(kotlinType, kotlinType2);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m93995x(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).mo89190b() instanceof TypeAliasDescriptor);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m93996y(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m93693m(kotlinType);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m93997z(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return (kotlinType instanceof ErrorType) && ((ErrorType) kotlinType).m93886Q0().isUnresolved();
    }
}
