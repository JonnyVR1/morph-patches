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
import kotlin.ranges.C15274a;
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
import p153l.nbr;
import p153l.pnj0;
import p153l.qnj0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeParameterUpperBoundEraser {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ErasureProjectionComputer f66946a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterErasureOptions f66947b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LockBasedStorageManager f66948c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f66949d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNotNull<C15450a, KotlinType> f66950e;

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
        public final KotlinType m93644a(@NotNull KotlinType kotlinType, @NotNull TypeSubstitutor typeSubstitutor, @Nullable Set<? extends TypeParameterDescriptor> set, boolean z) {
            UnwrappedType unwrappedTypeM93656f;
            KotlinType type;
            KotlinType type2;
            KotlinType type3;
            kotlinType.getClass();
            typeSubstitutor.getClass();
            UnwrappedType unwrappedTypeMo93516J0 = kotlinType.mo93516J0();
            if (unwrappedTypeMo93516J0 instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedTypeMo93516J0;
                SimpleType simpleTypeM93488O0 = flexibleType.m93488O0();
                if (!simpleTypeM93488O0.mo92781G0().getParameters().isEmpty() && simpleTypeM93488O0.mo92781G0().mo89207e() != null) {
                    List<TypeParameterDescriptor> parameters = simpleTypeM93488O0.mo92781G0().getParameters();
                    parameters.getClass();
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection starProjectionImpl = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo92779E0(), typeParameterDescriptor.getIndex());
                        if (!z || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null || TypeUtilsKt.m93980i(type3)) {
                            boolean z2 = set != null && set.contains(typeParameterDescriptor);
                            if (starProjectionImpl == null || z2) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution typeSubstitutionM93669k = typeSubstitutor.m93669k();
                                KotlinType type4 = starProjectionImpl.getType();
                                type4.getClass();
                                if (typeSubstitutionM93669k.mo90772e(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    simpleTypeM93488O0 = TypeSubstitutionKt.m93656f(simpleTypeM93488O0, arrayList, null, 2, null);
                }
                SimpleType simpleTypeM93489P0 = flexibleType.m93489P0();
                if (!simpleTypeM93489P0.mo92781G0().getParameters().isEmpty() && simpleTypeM93489P0.mo92781G0().mo89207e() != null) {
                    List<TypeParameterDescriptor> parameters2 = simpleTypeM93489P0.mo92781G0().getParameters();
                    parameters2.getClass();
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection starProjectionImpl2 = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo92779E0(), typeParameterDescriptor2.getIndex());
                        if (!z || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null || TypeUtilsKt.m93980i(type2)) {
                            boolean z3 = set != null && set.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 == null || z3) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution typeSubstitutionM93669k2 = typeSubstitutor.m93669k();
                                KotlinType type5 = starProjectionImpl2.getType();
                                type5.getClass();
                                if (typeSubstitutionM93669k2.mo90772e(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    simpleTypeM93489P0 = TypeSubstitutionKt.m93656f(simpleTypeM93489P0, arrayList2, null, 2, null);
                }
                unwrappedTypeM93656f = KotlinTypeFactory.m93520e(simpleTypeM93488O0, simpleTypeM93489P0);
            } else {
                if (!(unwrappedTypeMo93516J0 instanceof SimpleType)) {
                    nbr.m162172a();
                    return null;
                }
                SimpleType simpleType = (SimpleType) unwrappedTypeMo93516J0;
                if (simpleType.mo92781G0().getParameters().isEmpty() || simpleType.mo92781G0().mo89207e() == null) {
                    unwrappedTypeM93656f = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.mo92781G0().getParameters();
                    parameters3.getClass();
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection starProjectionImpl3 = (TypeProjection) CollectionsKt.getOrNull(kotlinType.mo92779E0(), typeParameterDescriptor3.getIndex());
                        if (!z || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null || TypeUtilsKt.m93980i(type)) {
                            boolean z4 = set != null && set.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 == null || z4) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution typeSubstitutionM93669k3 = typeSubstitutor.m93669k();
                                KotlinType type6 = starProjectionImpl3.getType();
                                type6.getClass();
                                if (typeSubstitutionM93669k3.mo90772e(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    unwrappedTypeM93656f = TypeSubstitutionKt.m93656f(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType kotlinTypeM93672o = typeSubstitutor.m93672o(TypeWithEnhancementKt.m93707b(unwrappedTypeM93656f, unwrappedTypeMo93516J0), Variance.OUT_VARIANCE);
            kotlinTypeM93672o.getClass();
            return kotlinTypeM93672o;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$a */
    public static final class C15450a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final TypeParameterDescriptor f66951a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final ErasureTypeAttributes f66952b;

        public C15450a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
            typeParameterDescriptor.getClass();
            erasureTypeAttributes.getClass();
            this.f66951a = typeParameterDescriptor;
            this.f66952b = erasureTypeAttributes;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ErasureTypeAttributes m93645a() {
            return this.f66952b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final TypeParameterDescriptor m93646b() {
            return this.f66951a;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof C15450a)) {
                return false;
            }
            C15450a c15450a = (C15450a) obj;
            return Intrinsics.m88377d(c15450a.f66951a, this.f66951a) && Intrinsics.m88377d(c15450a.f66952b, this.f66952b);
        }

        public int hashCode() {
            int iHashCode = this.f66951a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f66952b.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f66951a + ", typeAttr=" + this.f66952b + ')';
        }
    }

    public TypeParameterUpperBoundEraser(@NotNull ErasureProjectionComputer erasureProjectionComputer, @NotNull TypeParameterErasureOptions typeParameterErasureOptions) {
        erasureProjectionComputer.getClass();
        typeParameterErasureOptions.getClass();
        this.f66946a = erasureProjectionComputer;
        this.f66947b = typeParameterErasureOptions;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f66948c = lockBasedStorageManager;
        this.f66949d = LazyKt__LazyJVMKt.m88118b(new pnj0(this));
        MemoizedFunctionToNotNull<C15450a, KotlinType> memoizedFunctionToNotNullMo93341i = lockBasedStorageManager.mo93341i(new qnj0(this));
        memoizedFunctionToNotNullMo93341i.getClass();
        this.f66950e = memoizedFunctionToNotNullMo93341i;
    }

    /* JADX INFO: renamed from: c */
    public static final ErrorType m93637c(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        return ErrorUtils.m93893d(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, typeParameterUpperBoundEraser.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final KotlinType m93638f(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, C15450a c15450a) {
        return typeParameterUpperBoundEraser.m93641g(c15450a.m93646b(), c15450a.m93645a());
    }

    /* JADX INFO: renamed from: d */
    public final KotlinType m93639d(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeM93969D;
        SimpleType simpleTypeMo90736a = erasureTypeAttributes.mo90736a();
        return (simpleTypeMo90736a == null || (kotlinTypeM93969D = TypeUtilsKt.m93969D(simpleTypeMo90736a)) == null) ? m93642h() : kotlinTypeM93969D;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KotlinType m93640e(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        KotlinType kotlinTypeInvoke = this.f66950e.invoke(new C15450a(typeParameterDescriptor, erasureTypeAttributes));
        kotlinTypeInvoke.getClass();
        return kotlinTypeInvoke;
    }

    /* JADX INFO: renamed from: g */
    public final KotlinType m93641g(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection typeProjectionMo90768a;
        Set<TypeParameterDescriptor> setMo90738c = erasureTypeAttributes.mo90738c();
        if (setMo90738c != null && setMo90738c.contains(typeParameterDescriptor.mo89336a())) {
            return m93639d(erasureTypeAttributes);
        }
        SimpleType simpleTypeMo89349o = typeParameterDescriptor.mo89349o();
        simpleTypeMo89349o.getClass();
        Set<TypeParameterDescriptor> setM93983l = TypeUtilsKt.m93983l(simpleTypeMo89349o, setMo90738c);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setM93983l, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setM93983l) {
            if (setMo90738c == null || !setMo90738c.contains(typeParameterDescriptor2)) {
                typeProjectionMo90768a = this.f66946a.mo90768a(typeParameterDescriptor2, erasureTypeAttributes, this, m93640e(typeParameterDescriptor2, erasureTypeAttributes.mo90739d(typeParameterDescriptor)));
            } else {
                typeProjectionMo90768a = TypeUtils.m93700t(typeParameterDescriptor2, erasureTypeAttributes);
                typeProjectionMo90768a.getClass();
            }
            Pair pairM88129a = TuplesKt.m88129a(typeParameterDescriptor2.mo89196l(), typeProjectionMo90768a);
            linkedHashMap.put(pairM88129a.getFirst(), pairM88129a.getSecond());
        }
        TypeSubstitutor typeSubstitutorM93664h = TypeSubstitutor.m93664h(TypeConstructorSubstitution.Companion.m93628e(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        typeSubstitutorM93664h.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        Set<KotlinType> setM93643i = m93643i(typeSubstitutorM93664h, upperBounds, erasureTypeAttributes);
        if (setM93643i.isEmpty()) {
            return m93639d(erasureTypeAttributes);
        }
        if (!this.f66947b.m93633a()) {
            if (setM93643i.size() == 1) {
                return (KotlinType) CollectionsKt.single(setM93643i);
            }
            wg3.m206174a("Should only be one computed upper bound if no need to intersect all bounds");
            return null;
        }
        List list = CollectionsKt.toList(setM93643i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).mo93516J0());
        }
        return IntersectionTypeKt.m93793a(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final ErrorType m93642h() {
        return (ErrorType) this.f66949d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final Set<KotlinType> m93643i(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
            if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
                setCreateSetBuilder.add(Companion.m93644a(kotlinType, typeSubstitutor, erasureTypeAttributes.mo90738c(), this.f66947b.m93634b()));
            } else if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> setMo90738c = erasureTypeAttributes.mo90738c();
                if (setMo90738c == null || !setMo90738c.contains(classifierDescriptorMo89207e)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorMo89207e).getUpperBounds();
                    upperBounds.getClass();
                    setCreateSetBuilder.addAll(m93643i(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setCreateSetBuilder.add(m93639d(erasureTypeAttributes));
                }
            }
            if (!this.f66947b.m93633a()) {
                break;
            }
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
