package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.l9r;
import p149l.lej0;
import p149l.mej0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeParameterUpperBoundEraser {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ErasureProjectionComputer f66272a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterErasureOptions f66273b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LockBasedStorageManager f66274c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f66275d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNotNull<C15343a, KotlinType> f66276e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009c  */
        /* JADX WARN: Code duplicated, block: B:57:0x012c  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final KotlinType m92753a(@NotNull KotlinType kotlinType, @NotNull TypeSubstitutor typeSubstitutor, @Nullable Set<? extends TypeParameterDescriptor> set, boolean z) {
            UnwrappedType unwrappedTypeM92765f;
            KotlinType type;
            KotlinType type2;
            KotlinType type3;
            kotlinType.getClass();
            typeSubstitutor.getClass();
            UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
            if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo92625J0;
                SimpleType simpleTypeM92597O0 = flexibleType.m92597O0();
                if (!simpleTypeM92597O0.mo91890G0().getParameters().isEmpty() && simpleTypeM92597O0.mo91890G0().mo88316e() != null) {
                    List<TypeParameterDescriptor> parameters = simpleTypeM92597O0.mo91890G0().getParameters();
                    parameters.getClass();
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection starProjectionImpl = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo91888E0(), typeParameterDescriptor.getIndex());
                        if (!z || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null || TypeUtilsKt.m93089i(type3)) {
                            boolean z2 = set != null && set.contains(typeParameterDescriptor);
                            if (starProjectionImpl == null || z2) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution typeSubstitutionM92778k = typeSubstitutor.m92778k();
                                KotlinType type4 = starProjectionImpl.getType();
                                type4.getClass();
                                if (typeSubstitutionM92778k.mo89881e(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    simpleTypeM92597O0 = TypeSubstitutionKt.m92765f(simpleTypeM92597O0, arrayList, null, 2, null);
                }
                SimpleType simpleTypeM92598P0 = flexibleType.m92598P0();
                if (!simpleTypeM92598P0.mo91890G0().getParameters().isEmpty() && simpleTypeM92598P0.mo91890G0().mo88316e() != null) {
                    List<TypeParameterDescriptor> parameters2 = simpleTypeM92598P0.mo91890G0().getParameters();
                    parameters2.getClass();
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection starProjectionImpl2 = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo91888E0(), typeParameterDescriptor2.getIndex());
                        if (!z || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null || TypeUtilsKt.m93089i(type2)) {
                            boolean z3 = set != null && set.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 == null || z3) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution typeSubstitutionM92778k2 = typeSubstitutor.m92778k();
                                KotlinType type5 = starProjectionImpl2.getType();
                                type5.getClass();
                                if (typeSubstitutionM92778k2.mo89881e(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    simpleTypeM92598P0 = TypeSubstitutionKt.m92765f(simpleTypeM92598P0, arrayList2, null, 2, null);
                }
                unwrappedTypeM92765f = KotlinTypeFactory.m92629e(simpleTypeM92597O0, simpleTypeM92598P0);
            } else {
                if (!(unwrappedTypeMo92625J0 instanceof SimpleType)) {
                    l9r.m149037a();
                    return null;
                }
                SimpleType simpleType = (SimpleType) unwrappedTypeMo92625J0;
                if (simpleType.mo91890G0().getParameters().isEmpty() || simpleType.mo91890G0().mo88316e() == null) {
                    unwrappedTypeM92765f = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.mo91890G0().getParameters();
                    parameters3.getClass();
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection starProjectionImpl3 = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo91888E0(), typeParameterDescriptor3.getIndex());
                        if (!z || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null || TypeUtilsKt.m93089i(type)) {
                            boolean z4 = set != null && set.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 == null || z4) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution typeSubstitutionM92778k3 = typeSubstitutor.m92778k();
                                KotlinType type6 = starProjectionImpl3.getType();
                                type6.getClass();
                                if (typeSubstitutionM92778k3.mo89881e(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    unwrappedTypeM92765f = TypeSubstitutionKt.m92765f(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType kotlinTypeM92781o = typeSubstitutor.m92781o(TypeWithEnhancementKt.m92816b(unwrappedTypeM92765f, unwrappedTypeMo92625J0), Variance.OUT_VARIANCE);
            kotlinTypeM92781o.getClass();
            return kotlinTypeM92781o;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$a */
    public static final class C15343a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final TypeParameterDescriptor f66277a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ErasureTypeAttributes f66278b;

        public C15343a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
            typeParameterDescriptor.getClass();
            erasureTypeAttributes.getClass();
            this.f66277a = typeParameterDescriptor;
            this.f66278b = erasureTypeAttributes;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ErasureTypeAttributes m92754a() {
            return this.f66278b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final TypeParameterDescriptor m92755b() {
            return this.f66277a;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof C15343a)) {
                return false;
            }
            C15343a c15343a = (C15343a) obj;
            return Intrinsics.m87488d(c15343a.f66277a, this.f66277a) && Intrinsics.m87488d(c15343a.f66278b, this.f66278b);
        }

        public int hashCode() {
            int iHashCode = this.f66277a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f66278b.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f66277a + ", typeAttr=" + this.f66278b + ')';
        }
    }

    public TypeParameterUpperBoundEraser(@NotNull ErasureProjectionComputer erasureProjectionComputer, @NotNull TypeParameterErasureOptions typeParameterErasureOptions) {
        erasureProjectionComputer.getClass();
        typeParameterErasureOptions.getClass();
        this.f66272a = erasureProjectionComputer;
        this.f66273b = typeParameterErasureOptions;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f66274c = lockBasedStorageManager;
        this.f66275d = LazyKt__LazyJVMKt.m87229b(new lej0(this));
        MemoizedFunctionToNotNull<C15343a, KotlinType> memoizedFunctionToNotNullMo92450i = lockBasedStorageManager.mo92450i(new mej0(this));
        memoizedFunctionToNotNullMo92450i.getClass();
        this.f66276e = memoizedFunctionToNotNullMo92450i;
    }

    /* JADX INFO: renamed from: c */
    public static final ErrorType m92746c(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        return ErrorUtils.m93002d(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, typeParameterUpperBoundEraser.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final KotlinType m92747f(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, C15343a c15343a) {
        return typeParameterUpperBoundEraser.m92750g(c15343a.m92755b(), c15343a.m92754a());
    }

    /* JADX INFO: renamed from: d */
    public final KotlinType m92748d(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeM93078D;
        SimpleType simpleTypeMo89845a = erasureTypeAttributes.mo89845a();
        return (simpleTypeMo89845a == null || (kotlinTypeM93078D = TypeUtilsKt.m93078D(simpleTypeMo89845a)) == null) ? m92751h() : kotlinTypeM93078D;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KotlinType m92749e(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        KotlinType kotlinTypeInvoke = this.f66276e.invoke(new C15343a(typeParameterDescriptor, erasureTypeAttributes));
        kotlinTypeInvoke.getClass();
        return kotlinTypeInvoke;
    }

    /* JADX INFO: renamed from: g */
    public final KotlinType m92750g(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection typeProjectionMo89877a;
        Set<TypeParameterDescriptor> setMo89847c = erasureTypeAttributes.mo89847c();
        if (setMo89847c != null && setMo89847c.contains(typeParameterDescriptor.mo88445a())) {
            return m92748d(erasureTypeAttributes);
        }
        SimpleType simpleTypeMo88458o = typeParameterDescriptor.mo88458o();
        simpleTypeMo88458o.getClass();
        Set<TypeParameterDescriptor> setM93092l = TypeUtilsKt.m93092l(simpleTypeMo88458o, setMo89847c);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setM93092l, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setM93092l) {
            if (setMo89847c == null || !setMo89847c.contains(typeParameterDescriptor2)) {
                typeProjectionMo89877a = this.f66272a.mo89877a(typeParameterDescriptor2, erasureTypeAttributes, this, m92749e(typeParameterDescriptor2, erasureTypeAttributes.mo89848d(typeParameterDescriptor)));
            } else {
                typeProjectionMo89877a = TypeUtils.m92809t(typeParameterDescriptor2, erasureTypeAttributes);
                typeProjectionMo89877a.getClass();
            }
            Pair pairM87240a = TuplesKt.m87240a(typeParameterDescriptor2.mo88305l(), typeProjectionMo89877a);
            linkedHashMap.put(pairM87240a.getFirst(), pairM87240a.getSecond());
        }
        TypeSubstitutor typeSubstitutorM92773h = TypeSubstitutor.m92773h(TypeConstructorSubstitution.Companion.m92737e(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        typeSubstitutorM92773h.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        Set<KotlinType> setM92752i = m92752i(typeSubstitutorM92773h, upperBounds, erasureTypeAttributes);
        if (setM92752i.isEmpty()) {
            return m92748d(erasureTypeAttributes);
        }
        if (!this.f66273b.m92742a()) {
            if (setM92752i.size() == 1) {
                return (KotlinType) CollectionsKt.single(setM92752i);
            }
            ig3.m135964a("Should only be one computed upper bound if no need to intersect all bounds");
            return null;
        }
        List list = CollectionsKt.toList(setM92752i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).mo92625J0());
        }
        return IntersectionTypeKt.m92902a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final ErrorType m92751h() {
        return (ErrorType) this.f66275d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final Set<KotlinType> m92752i(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
            if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
                setCreateSetBuilder.add(Companion.m92753a(kotlinType, typeSubstitutor, erasureTypeAttributes.mo89847c(), this.f66273b.m92743b()));
            } else if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> setMo89847c = erasureTypeAttributes.mo89847c();
                if (setMo89847c == null || !setMo89847c.contains(classifierDescriptorMo88316e)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorMo88316e).getUpperBounds();
                    upperBounds.getClass();
                    setCreateSetBuilder.addAll(m92752i(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setCreateSetBuilder.add(m92748d(erasureTypeAttributes));
                }
            }
            if (!this.f66273b.m92742a()) {
                break;
            }
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
