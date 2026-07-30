package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.anj0;
import p153l.eh4;
import p153l.nbr;
import p153l.xvq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CapturedTypeApproximationKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67023a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67023a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ApproximationBounds<KotlinType> m94003b(@NotNull KotlinType kotlinType) {
        Object objM94008g;
        kotlinType.getClass();
        if (FlexibleTypesKt.m93497b(kotlinType)) {
            ApproximationBounds<KotlinType> approximationBoundsM94003b = m94003b(FlexibleTypesKt.m93498c(kotlinType));
            ApproximationBounds<KotlinType> approximationBoundsM94003b2 = m94003b(FlexibleTypesKt.m93499d(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.m93707b(KotlinTypeFactory.m93520e(FlexibleTypesKt.m93498c(approximationBoundsM94003b.m94000c()), FlexibleTypesKt.m93499d(approximationBoundsM94003b2.m94000c())), kotlinType), TypeWithEnhancementKt.m93707b(KotlinTypeFactory.m93520e(FlexibleTypesKt.m93498c(approximationBoundsM94003b.m94001d()), FlexibleTypesKt.m93499d(approximationBoundsM94003b2.m94001d())), kotlinType));
        }
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        if (CapturedTypeConstructorKt.m92795f(kotlinType)) {
            typeConstructorMo92781G0.getClass();
            TypeProjection typeProjectionMo92785d = ((CapturedTypeConstructor) typeConstructorMo92781G0).mo92785d();
            KotlinType type = typeProjectionMo92785d.getType();
            type.getClass();
            KotlinType kotlinTypeM94004c = m94004c(type, kotlinType);
            int i = WhenMappings.f67023a[typeProjectionMo92785d.mo93558c().ordinal()];
            if (i == 2) {
                return new ApproximationBounds<>(kotlinTypeM94004c, TypeUtilsKt.m93985n(kotlinType).m89105J());
            }
            if (i != 3) {
                xvq.m213257a("Only nontrivial projections should have been captured, not: ", typeProjectionMo92785d);
                return null;
            }
            SimpleType simpleTypeM89104I = TypeUtilsKt.m93985n(kotlinType).m89104I();
            simpleTypeM89104I.getClass();
            return new ApproximationBounds<>(m94004c(simpleTypeM89104I, kotlinType), kotlinTypeM94004c);
        }
        if (kotlinType.mo92779E0().isEmpty() || kotlinType.mo92779E0().size() != typeConstructorMo92781G0.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> listMo92779E0 = kotlinType.mo92779E0();
        List<TypeParameterDescriptor> parameters = typeConstructorMo92781G0.getParameters();
        parameters.getClass();
        for (Pair pair : CollectionsKt.zip(listMo92779E0, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.component1();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
            typeParameterDescriptor.getClass();
            anj0 anj0VarM94010i = m94010i(typeProjection, typeParameterDescriptor);
            if (typeProjection.mo93557b()) {
                arrayList.add(anj0VarM94010i);
                arrayList2.add(anj0VarM94010i);
            } else {
                ApproximationBounds<anj0> approximationBoundsM94007f = m94007f(anj0VarM94010i);
                anj0 anj0VarM93998a = approximationBoundsM94007f.m93998a();
                anj0 anj0VarM93999b = approximationBoundsM94007f.m93999b();
                arrayList.add(anj0VarM93998a);
                arrayList2.add(anj0VarM93999b);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((anj0) it.next()).m98998d()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            objM94008g = TypeUtilsKt.m93985n(kotlinType).m89104I();
            objM94008g.getClass();
        } else {
            objM94008g = m94008g(kotlinType, arrayList);
        }
        return new ApproximationBounds<>(objM94008g, m94008g(kotlinType, arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public static final KotlinType m94004c(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeM93697q = TypeUtils.m93697q(kotlinType, kotlinType2.mo90857H0());
        kotlinTypeM93697q.getClass();
        return kotlinTypeM93697q;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final TypeProjection m94005d(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.mo93557b()) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (TypeUtils.m93683c(type, eh4.INSTANCE)) {
                Variance varianceMo93558c = typeProjection.mo93558c();
                varianceMo93558c.getClass();
                if (varianceMo93558c == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(varianceMo93558c, m94003b(type).m94001d());
                }
                return z ? new TypeProjectionImpl(varianceMo93558c, m94003b(type).m94000c()) : m94009h(typeProjection);
            }
        }
        return typeProjection;
    }

    /* JADX INFO: renamed from: e */
    public static final Boolean m94006e(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return Boolean.valueOf(CapturedTypeConstructorKt.m92795f(unwrappedType));
    }

    /* JADX INFO: renamed from: f */
    public static final ApproximationBounds<anj0> m94007f(anj0 anj0Var) {
        ApproximationBounds<KotlinType> approximationBoundsM94003b = m94003b(anj0Var.m98995a());
        KotlinType kotlinTypeM93998a = approximationBoundsM94003b.m93998a();
        KotlinType kotlinTypeM93999b = approximationBoundsM94003b.m93999b();
        ApproximationBounds<KotlinType> approximationBoundsM94003b2 = m94003b(anj0Var.m98996b());
        return new ApproximationBounds<>(new anj0(anj0Var.m98997c(), kotlinTypeM93999b, approximationBoundsM94003b2.m93998a()), new anj0(anj0Var.m98997c(), kotlinTypeM93998a, approximationBoundsM94003b2.m93999b()));
    }

    /* JADX INFO: renamed from: g */
    public static final KotlinType m94008g(KotlinType kotlinType, List<anj0> list) {
        kotlinType.mo92779E0().size();
        list.size();
        List<anj0> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m94011j((anj0) it.next()));
        }
        return TypeSubstitutionKt.m93655e(kotlinType, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final TypeProjection m94009h(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorM93664h = TypeSubstitutor.m93664h(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            /* JADX INFO: renamed from: k */
            public TypeProjection mo93564k(TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.mo92785d().mo93557b() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.mo92785d().getType()) : capturedTypeConstructor.mo92785d();
            }
        });
        typeSubstitutorM93664h.getClass();
        return typeSubstitutorM93664h.m93677u(typeProjection);
    }

    /* JADX INFO: renamed from: i */
    public static final anj0 m94010i(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.f67023a[TypeSubstitutor.m93659c(typeParameterDescriptor.mo89492h(), typeProjection).ordinal()];
        if (i == 1) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            return new anj0(typeParameterDescriptor, type, type2);
        }
        if (i == 2) {
            KotlinType type3 = typeProjection.getType();
            type3.getClass();
            SimpleType simpleTypeM89105J = DescriptorUtilsKt.m92871m(typeParameterDescriptor).m89105J();
            simpleTypeM89105J.getClass();
            return new anj0(typeParameterDescriptor, type3, simpleTypeM89105J);
        }
        if (i != 3) {
            nbr.m162172a();
            return null;
        }
        SimpleType simpleTypeM89104I = DescriptorUtilsKt.m92871m(typeParameterDescriptor).m89104I();
        simpleTypeM89104I.getClass();
        KotlinType type4 = typeProjection.getType();
        type4.getClass();
        return new anj0(typeParameterDescriptor, simpleTypeM89104I, type4);
    }

    /* JADX INFO: renamed from: j */
    public static final TypeProjection m94011j(anj0 anj0Var) {
        anj0Var.m98998d();
        if (!Intrinsics.m88377d(anj0Var.m98995a(), anj0Var.m98996b())) {
            Variance varianceMo89492h = anj0Var.m98997c().mo89492h();
            Variance variance = Variance.IN_VARIANCE;
            if (varianceMo89492h != variance) {
                if (!KotlinBuiltIns.m89084o0(anj0Var.m98995a()) || anj0Var.m98997c().mo89492h() == variance) {
                    return KotlinBuiltIns.m89086q0(anj0Var.m98996b()) ? new TypeProjectionImpl(m94012k(anj0Var, variance), anj0Var.m98995a()) : new TypeProjectionImpl(m94012k(anj0Var, Variance.OUT_VARIANCE), anj0Var.m98996b());
                }
                return new TypeProjectionImpl(m94012k(anj0Var, Variance.OUT_VARIANCE), anj0Var.m98996b());
            }
        }
        return new TypeProjectionImpl(anj0Var.m98995a());
    }

    /* JADX INFO: renamed from: k */
    public static final Variance m94012k(anj0 anj0Var, Variance variance) {
        return variance == anj0Var.m98997c().mo89492h() ? Variance.INVARIANT : variance;
    }
}
