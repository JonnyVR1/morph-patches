package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mpq;
import p153l.slc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RawSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final JavaTypeAttributes f65624d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final JavaTypeAttributes f65625e;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RawProjectionComputer f65626b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeParameterUpperBoundEraser f65627c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f65624d = JavaTypeAttributesKt.m90749b(typeUsage, false, true, null, 5, null).m90746l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f65625e = JavaTypeAttributesKt.m90749b(typeUsage, false, true, null, 5, null).m90746l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f65626b = rawProjectionComputer;
        if (typeParameterUpperBoundEraser == null) {
            typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
        }
        this.f65627c = typeParameterUpperBoundEraser;
    }

    /* JADX INFO: renamed from: k */
    public static final SimpleType m90770k(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassDescriptor classDescriptorMo93798b;
        kotlinTypeRefiner.getClass();
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classDescriptor);
        if (classIdM92872n == null || (classDescriptorMo93798b = kotlinTypeRefiner.mo93798b(classIdM92872n)) == null || Intrinsics.m88377d(classDescriptorMo93798b, classDescriptor)) {
            return null;
        }
        return rawSubstitution.m90774j(simpleType, classDescriptorMo93798b, javaTypeAttributes).getFirst();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ KotlinType m90771m(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i, Object obj) {
        if ((i & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.m90775l(kotlinType, javaTypeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo90773f() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<SimpleType, Boolean> m90774j(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.mo92781G0().getParameters().isEmpty()) {
            return TuplesKt.m88129a(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.m89072d0(simpleType)) {
            TypeProjection typeProjection = simpleType.mo92779E0().get(0);
            Variance varianceMo93558c = typeProjection.mo93558c();
            KotlinType type = typeProjection.getType();
            type.getClass();
            return TuplesKt.m88129a(KotlinTypeFactory.m93525k(simpleType.mo92780F0(), simpleType.mo92781G0(), CollectionsKt.listOf(new TypeProjectionImpl(varianceMo93558c, m90775l(type, javaTypeAttributes))), simpleType.mo90857H0(), null, 16, null), Boolean.FALSE);
        }
        if (KotlinTypeKt.m93535a(simpleType)) {
            return TuplesKt.m88129a(ErrorUtils.m93893d(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.mo92781G0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeMo89350s0 = classDescriptor.mo89350s0(this);
        memberScopeMo89350s0.getClass();
        TypeAttributes typeAttributesMo92780F0 = simpleType.mo92780F0();
        TypeConstructor typeConstructorMo89196l = classDescriptor.mo89196l();
        typeConstructorMo89196l.getClass();
        List<TypeParameterDescriptor> parameters = classDescriptor.mo89196l().getParameters();
        parameters.getClass();
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            RawProjectionComputer rawProjectionComputer = this.f65626b;
            typeParameterDescriptor.getClass();
            arrayList.add(ErasureProjectionComputer.m93481b(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.f65627c, null, 8, null));
        }
        return TuplesKt.m88129a(KotlinTypeFactory.m93528n(typeAttributesMo92780F0, typeConstructorMo89196l, arrayList, simpleType.mo90857H0(), memberScopeMo89350s0, new slc0(classDescriptor, this, simpleType, javaTypeAttributes)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l */
    public final KotlinType m90775l(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
            return m90775l(this.f65627c.m93640e((TypeParameterDescriptor) classifierDescriptorMo89207e, javaTypeAttributes.m90744j(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo89207e instanceof ClassDescriptor)) {
            mpq.m159379a("Unexpected declaration kind: ", classifierDescriptorMo89207e);
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89207e2 = FlexibleTypesKt.m93499d(kotlinType).mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e2 instanceof ClassDescriptor) {
            Pair<SimpleType, Boolean> pairM90774j = m90774j(FlexibleTypesKt.m93498c(kotlinType), (ClassDescriptor) classifierDescriptorMo89207e, f65624d);
            SimpleType simpleTypeComponent1 = pairM90774j.component1();
            boolean zBooleanValue = pairM90774j.component2().booleanValue();
            Pair<SimpleType, Boolean> pairM90774j2 = m90774j(FlexibleTypesKt.m93499d(kotlinType), (ClassDescriptor) classifierDescriptorMo89207e2, f65625e);
            SimpleType simpleTypeComponent2 = pairM90774j2.component1();
            return (zBooleanValue || pairM90774j2.component2().booleanValue()) ? new RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2) : KotlinTypeFactory.m93520e(simpleTypeComponent1, simpleTypeComponent2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo89207e2 + "\" while for lower it's \"" + classifierDescriptorMo89207e + '\"').toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public TypeProjectionImpl mo90772e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(m90771m(this, kotlinType, null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
