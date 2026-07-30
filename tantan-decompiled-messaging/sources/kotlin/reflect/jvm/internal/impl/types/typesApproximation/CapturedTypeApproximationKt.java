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
import p149l.fg4;
import p149l.l9r;
import p149l.wdj0;
import p149l.wtq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CapturedTypeApproximationKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66349a;

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
            f66349a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ApproximationBounds<KotlinType> m93112b(@NotNull KotlinType kotlinType) {
        Object objM93117g;
        kotlinType.getClass();
        if (FlexibleTypesKt.m92606b(kotlinType)) {
            ApproximationBounds<KotlinType> approximationBoundsM93112b = m93112b(FlexibleTypesKt.m92607c(kotlinType));
            ApproximationBounds<KotlinType> approximationBoundsM93112b2 = m93112b(FlexibleTypesKt.m92608d(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.m92816b(KotlinTypeFactory.m92629e(FlexibleTypesKt.m92607c(approximationBoundsM93112b.m93109c()), FlexibleTypesKt.m92608d(approximationBoundsM93112b2.m93109c())), kotlinType), TypeWithEnhancementKt.m92816b(KotlinTypeFactory.m92629e(FlexibleTypesKt.m92607c(approximationBoundsM93112b.m93110d()), FlexibleTypesKt.m92608d(approximationBoundsM93112b2.m93110d())), kotlinType));
        }
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        if (CapturedTypeConstructorKt.m91904f(kotlinType)) {
            typeConstructorMo91890G0.getClass();
            TypeProjection typeProjectionMo91894d = ((CapturedTypeConstructor) typeConstructorMo91890G0).mo91894d();
            KotlinType type = typeProjectionMo91894d.getType();
            type.getClass();
            KotlinType kotlinTypeM93113c = m93113c(type, kotlinType);
            int i = WhenMappings.f66349a[typeProjectionMo91894d.mo92667c().ordinal()];
            if (i == 2) {
                return new ApproximationBounds<>(kotlinTypeM93113c, TypeUtilsKt.m93094n(kotlinType).m88214J());
            }
            if (i != 3) {
                wtq.m205579a("Only nontrivial projections should have been captured, not: ", typeProjectionMo91894d);
                return null;
            }
            SimpleType simpleTypeM88213I = TypeUtilsKt.m93094n(kotlinType).m88213I();
            simpleTypeM88213I.getClass();
            return new ApproximationBounds<>(m93113c(simpleTypeM88213I, kotlinType), kotlinTypeM93113c);
        }
        if (kotlinType.mo91888E0().isEmpty() || kotlinType.mo91888E0().size() != typeConstructorMo91890G0.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> listMo91888E0 = kotlinType.mo91888E0();
        List<TypeParameterDescriptor> parameters = typeConstructorMo91890G0.getParameters();
        parameters.getClass();
        for (Pair pair : CollectionsKt.zip(listMo91888E0, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.component1();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
            typeParameterDescriptor.getClass();
            wdj0 wdj0VarM93119i = m93119i(typeProjection, typeParameterDescriptor);
            if (typeProjection.mo92666b()) {
                arrayList.add(wdj0VarM93119i);
                arrayList2.add(wdj0VarM93119i);
            } else {
                ApproximationBounds<wdj0> approximationBoundsM93116f = m93116f(wdj0VarM93119i);
                wdj0 wdj0VarM93107a = approximationBoundsM93116f.m93107a();
                wdj0 wdj0VarM93108b = approximationBoundsM93116f.m93108b();
                arrayList.add(wdj0VarM93107a);
                arrayList2.add(wdj0VarM93108b);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((wdj0) it.next()).m202740d()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            objM93117g = TypeUtilsKt.m93094n(kotlinType).m88213I();
            objM93117g.getClass();
        } else {
            objM93117g = m93117g(kotlinType, arrayList);
        }
        return new ApproximationBounds<>(objM93117g, m93117g(kotlinType, arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public static final KotlinType m93113c(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeM92806q = TypeUtils.m92806q(kotlinType, kotlinType2.mo89966H0());
        kotlinTypeM92806q.getClass();
        return kotlinTypeM92806q;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final TypeProjection m93114d(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.mo92666b()) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (TypeUtils.m92792c(type, fg4.INSTANCE)) {
                Variance varianceMo92667c = typeProjection.mo92667c();
                varianceMo92667c.getClass();
                if (varianceMo92667c == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(varianceMo92667c, m93112b(type).m93110d());
                }
                return z ? new TypeProjectionImpl(varianceMo92667c, m93112b(type).m93109c()) : m93118h(typeProjection);
            }
        }
        return typeProjection;
    }

    /* JADX INFO: renamed from: e */
    public static final Boolean m93115e(UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return Boolean.valueOf(CapturedTypeConstructorKt.m91904f(unwrappedType));
    }

    /* JADX INFO: renamed from: f */
    public static final ApproximationBounds<wdj0> m93116f(wdj0 wdj0Var) {
        ApproximationBounds<KotlinType> approximationBoundsM93112b = m93112b(wdj0Var.m202737a());
        KotlinType kotlinTypeM93107a = approximationBoundsM93112b.m93107a();
        KotlinType kotlinTypeM93108b = approximationBoundsM93112b.m93108b();
        ApproximationBounds<KotlinType> approximationBoundsM93112b2 = m93112b(wdj0Var.m202738b());
        return new ApproximationBounds<>(new wdj0(wdj0Var.m202739c(), kotlinTypeM93108b, approximationBoundsM93112b2.m93107a()), new wdj0(wdj0Var.m202739c(), kotlinTypeM93107a, approximationBoundsM93112b2.m93108b()));
    }

    /* JADX INFO: renamed from: g */
    public static final KotlinType m93117g(KotlinType kotlinType, List<wdj0> list) {
        kotlinType.mo91888E0().size();
        list.size();
        List<wdj0> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m93120j((wdj0) it.next()));
        }
        return TypeSubstitutionKt.m92764e(kotlinType, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final TypeProjection m93118h(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorM92773h = TypeSubstitutor.m92773h(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            /* JADX INFO: renamed from: k */
            public TypeProjection mo92673k(TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.mo91894d().mo92666b() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.mo91894d().getType()) : capturedTypeConstructor.mo91894d();
            }
        });
        typeSubstitutorM92773h.getClass();
        return typeSubstitutorM92773h.m92786u(typeProjection);
    }

    /* JADX INFO: renamed from: i */
    public static final wdj0 m93119i(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.f66349a[TypeSubstitutor.m92768c(typeParameterDescriptor.mo88601h(), typeProjection).ordinal()];
        if (i == 1) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            return new wdj0(typeParameterDescriptor, type, type2);
        }
        if (i == 2) {
            KotlinType type3 = typeProjection.getType();
            type3.getClass();
            SimpleType simpleTypeM88214J = DescriptorUtilsKt.m91980m(typeParameterDescriptor).m88214J();
            simpleTypeM88214J.getClass();
            return new wdj0(typeParameterDescriptor, type3, simpleTypeM88214J);
        }
        if (i != 3) {
            l9r.m149037a();
            return null;
        }
        SimpleType simpleTypeM88213I = DescriptorUtilsKt.m91980m(typeParameterDescriptor).m88213I();
        simpleTypeM88213I.getClass();
        KotlinType type4 = typeProjection.getType();
        type4.getClass();
        return new wdj0(typeParameterDescriptor, simpleTypeM88213I, type4);
    }

    /* JADX INFO: renamed from: j */
    public static final TypeProjection m93120j(wdj0 wdj0Var) {
        wdj0Var.m202740d();
        if (!Intrinsics.m87488d(wdj0Var.m202737a(), wdj0Var.m202738b())) {
            Variance varianceMo88601h = wdj0Var.m202739c().mo88601h();
            Variance variance = Variance.IN_VARIANCE;
            if (varianceMo88601h != variance) {
                if (!KotlinBuiltIns.m88193o0(wdj0Var.m202737a()) || wdj0Var.m202739c().mo88601h() == variance) {
                    return KotlinBuiltIns.m88195q0(wdj0Var.m202738b()) ? new TypeProjectionImpl(m93121k(wdj0Var, variance), wdj0Var.m202737a()) : new TypeProjectionImpl(m93121k(wdj0Var, Variance.OUT_VARIANCE), wdj0Var.m202738b());
                }
                return new TypeProjectionImpl(m93121k(wdj0Var, Variance.OUT_VARIANCE), wdj0Var.m202738b());
            }
        }
        return new TypeProjectionImpl(wdj0Var.m202737a());
    }

    /* JADX INFO: renamed from: k */
    public static final Variance m93121k(wdj0 wdj0Var, Variance variance) {
        return variance == wdj0Var.m202739c().mo88601h() ? Variance.INVARIANT : variance;
    }
}
