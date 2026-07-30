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
import p149l.l9r;
import p149l.uej0;
import p149l.vej0;
import p149l.wej0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeUtilsKt {
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final KotlinType m93075A(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType kotlinTypeM92803n = TypeUtils.m92803n(kotlinType);
        kotlinTypeM92803n.getClass();
        return kotlinTypeM92803n;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final KotlinType m93076B(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType kotlinTypeM92804o = TypeUtils.m92804o(kotlinType);
        kotlinTypeM92804o.getClass();
        return kotlinTypeM92804o;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final KotlinType m93077C(@NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        kotlinType.getClass();
        annotations.getClass();
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.mo92625J0().mo89894M0(TypeAttributesKt.m92710a(kotlinType.mo91889F0(), annotations));
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final KotlinType m93078D(@NotNull KotlinType kotlinType) {
        SimpleType simpleType;
        UnwrappedType unwrappedTypeM92765f;
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo92625J0;
            SimpleType simpleTypeM92597O0 = flexibleType.m92597O0();
            if (!simpleTypeM92597O0.mo91890G0().getParameters().isEmpty() && simpleTypeM92597O0.mo91890G0().mo88316e() != null) {
                List<TypeParameterDescriptor> parameters = simpleTypeM92597O0.mo91890G0().getParameters();
                parameters.getClass();
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleTypeM92597O0 = TypeSubstitutionKt.m92765f(simpleTypeM92597O0, arrayList, null, 2, null);
            }
            SimpleType simpleTypeM92598P0 = flexibleType.m92598P0();
            if (!simpleTypeM92598P0.mo91890G0().getParameters().isEmpty() && simpleTypeM92598P0.mo91890G0().mo88316e() != null) {
                List<TypeParameterDescriptor> parameters2 = simpleTypeM92598P0.mo91890G0().getParameters();
                parameters2.getClass();
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleTypeM92598P0 = TypeSubstitutionKt.m92765f(simpleTypeM92598P0, arrayList2, null, 2, null);
            }
            unwrappedTypeM92765f = KotlinTypeFactory.m92629e(simpleTypeM92597O0, simpleTypeM92598P0);
        } else {
            if (!(unwrappedTypeMo92625J0 instanceof SimpleType)) {
                l9r.m149037a();
                return null;
            }
            simpleType = (SimpleType) unwrappedTypeMo92625J0;
            if (!simpleType.mo91890G0().getParameters().isEmpty() && simpleType.mo91890G0().mo88316e() != null) {
                unwrappedTypeM92765f = simpleType;
                unwrappedTypeM92765f = simpleType;
                List<TypeParameterDescriptor> parameters3 = simpleType.mo91890G0().getParameters();
                parameters3.getClass();
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                }
                unwrappedTypeM92765f = TypeSubstitutionKt.m92765f(simpleType, arrayList3, null, 2, null);
            }
        }
        unwrappedTypeM92765f = simpleType;
        unwrappedTypeM92765f = simpleType;
        unwrappedTypeM92765f = simpleType;
        return TypeWithEnhancementKt.m92816b(unwrappedTypeM92765f, unwrappedTypeMo92625J0);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m93079E(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m93085e(kotlinType, wej0.INSTANCE);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m93080F(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = unwrappedType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e != null) {
            return (classifierDescriptorMo88316e instanceof TypeAliasDescriptor) || (classifierDescriptorMo88316e instanceof TypeParameterDescriptor);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final TypeProjection m93084d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(kotlinType);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m93085e(@NotNull KotlinType kotlinType, @NotNull Function1<? super UnwrappedType, Boolean> function1) {
        kotlinType.getClass();
        function1.getClass();
        return TypeUtils.m92792c(kotlinType, function1);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m93086f(KotlinType kotlinType, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        boolean zM93086f;
        if (Intrinsics.m87488d(kotlinType.mo91890G0(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo88316e instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo88316e : null;
        List<TypeParameterDescriptor> listMo88309p = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.mo88309p() : null;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(kotlinType.mo91888E0());
        if ((iterableWithIndex instanceof Collection) && ((Collection) iterableWithIndex).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            TypeProjection typeProjection = (TypeProjection) indexedValue.component2();
            TypeParameterDescriptor typeParameterDescriptor = listMo88309p != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(listMo88309p, index) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.mo92666b()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                zM93086f = m93086f(type, typeConstructor, set);
            } else {
                zM93086f = false;
            }
            if (zM93086f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m93087g(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return m93085e(kotlinType, vej0.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m93088h(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = unwrappedType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e != null) {
            return m93104x(classifierDescriptorMo88316e);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m93089i(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m92792c(kotlinType, uej0.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m93090j(UnwrappedType unwrappedType) {
        return Boolean.valueOf(TypeUtils.m92802m(unwrappedType));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final TypeProjection m93091k(@NotNull KotlinType kotlinType, @NotNull Variance variance, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        kotlinType.getClass();
        variance.getClass();
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.mo88601h() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<TypeParameterDescriptor> m93092l(@NotNull KotlinType kotlinType, @Nullable Set<? extends TypeParameterDescriptor> set) {
        kotlinType.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m93093m(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m */
    public static final void m93093m(KotlinType kotlinType, KotlinType kotlinType2, Set<TypeParameterDescriptor> set, Set<? extends TypeParameterDescriptor> set2) {
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
            if (!Intrinsics.m87488d(kotlinType.mo91890G0(), kotlinType2.mo91890G0())) {
                set.add(classifierDescriptorMo88316e);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) classifierDescriptorMo88316e).getUpperBounds()) {
                kotlinType3.getClass();
                m93093m(kotlinType3, kotlinType2, set, set2);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorMo88316e2 = kotlinType.mo91890G0().mo88316e();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo88316e2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo88316e2 : null;
        List<TypeParameterDescriptor> listMo88309p = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.mo88309p() : null;
        int i = 0;
        for (TypeProjection typeProjection : kotlinType.mo91888E0()) {
            int i2 = i + 1;
            TypeParameterDescriptor typeParameterDescriptor = listMo88309p != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(listMo88309p, i) : null;
            if ((typeParameterDescriptor == null || set2 == null || !set2.contains(typeParameterDescriptor)) && !typeProjection.mo92666b() && !CollectionsKt.contains(set, typeProjection.getType().mo91890G0().mo88316e()) && !Intrinsics.m87488d(typeProjection.getType().mo91890G0(), kotlinType2.mo91890G0())) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                m93093m(type, kotlinType2, set, set2);
            }
            i = i2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final KotlinBuiltIns m93094n(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinBuiltIns kotlinBuiltInsMo88679f = kotlinType.mo91890G0().mo88679f();
        kotlinBuiltInsMo88679f.getClass();
        return kotlinBuiltInsMo88679f;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final KotlinType m93095o(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
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
            ClassifierDescriptor classifierDescriptorMo88316e = ((KotlinType) next).mo91890G0().mo88316e();
            ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
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
    public static final boolean m93096p(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return m93098r(typeParameterDescriptor, null, null, 6, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: q */
    public static final boolean m93097q(@NotNull TypeParameterDescriptor typeParameterDescriptor, @Nullable TypeConstructor typeConstructor, @Nullable Set<? extends TypeParameterDescriptor> set) {
        typeParameterDescriptor.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            kotlinType.getClass();
            if (m93086f(kotlinType, typeParameterDescriptor.mo88458o().mo91890G0(), set) && (typeConstructor == null || Intrinsics.m87488d(kotlinType.mo91890G0(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m93098r(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m93097q(typeParameterDescriptor, typeConstructor, set);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m93099s(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.m88185g0(kotlinType);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m93100t(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.m88193o0(kotlinType);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m93101u(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof AbstractStubType) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).m92572S0() instanceof AbstractStubType);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m93102v(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof StubTypeForBuilderInference) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).m92572S0() instanceof StubTypeForBuilderInference);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m93103w(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return KotlinTypeChecker.f66298a.mo92904d(kotlinType, kotlinType2);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m93104x(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).mo88299b() instanceof TypeAliasDescriptor);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m93105y(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.m92802m(kotlinType);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m93106z(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return (kotlinType instanceof ErrorType) && ((ErrorType) kotlinType).m92995Q0().isUnresolved();
    }
}
