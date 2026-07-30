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
import p149l.ldc0;
import p149l.nnq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class RawSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final JavaTypeAttributes f64950d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final JavaTypeAttributes f64951e;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RawProjectionComputer f64952b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeParameterUpperBoundEraser f64953c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f64950d = JavaTypeAttributesKt.m89858b(typeUsage, false, true, null, 5, null).m89855l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f64951e = JavaTypeAttributesKt.m89858b(typeUsage, false, true, null, 5, null).m89855l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f64952b = rawProjectionComputer;
        if (typeParameterUpperBoundEraser == null) {
            typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
        }
        this.f64953c = typeParameterUpperBoundEraser;
    }

    /* JADX INFO: renamed from: k */
    public static final SimpleType m89879k(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassDescriptor classDescriptorMo92907b;
        kotlinTypeRefiner.getClass();
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classDescriptor);
        if (classIdM91981n == null || (classDescriptorMo92907b = kotlinTypeRefiner.mo92907b(classIdM91981n)) == null || Intrinsics.m87488d(classDescriptorMo92907b, classDescriptor)) {
            return null;
        }
        return rawSubstitution.m89883j(simpleType, classDescriptorMo92907b, javaTypeAttributes).getFirst();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ KotlinType m89880m(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i, Object obj) {
        if ((i & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.m89884l(kotlinType, javaTypeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo89882f() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<SimpleType, Boolean> m89883j(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.mo91890G0().getParameters().isEmpty()) {
            return TuplesKt.m87240a(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.m88181d0(simpleType)) {
            TypeProjection typeProjection = simpleType.mo91888E0().get(0);
            Variance varianceMo92667c = typeProjection.mo92667c();
            KotlinType type = typeProjection.getType();
            type.getClass();
            return TuplesKt.m87240a(KotlinTypeFactory.m92634k(simpleType.mo91889F0(), simpleType.mo91890G0(), CollectionsKt.listOf(new TypeProjectionImpl(varianceMo92667c, m89884l(type, javaTypeAttributes))), simpleType.mo89966H0(), null, 16, null), Boolean.FALSE);
        }
        if (KotlinTypeKt.m92644a(simpleType)) {
            return TuplesKt.m87240a(ErrorUtils.m93002d(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.mo91890G0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeMo88459s0 = classDescriptor.mo88459s0(this);
        memberScopeMo88459s0.getClass();
        TypeAttributes typeAttributesMo91889F0 = simpleType.mo91889F0();
        TypeConstructor typeConstructorMo88305l = classDescriptor.mo88305l();
        typeConstructorMo88305l.getClass();
        List<TypeParameterDescriptor> parameters = classDescriptor.mo88305l().getParameters();
        parameters.getClass();
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            RawProjectionComputer rawProjectionComputer = this.f64952b;
            typeParameterDescriptor.getClass();
            arrayList.add(ErasureProjectionComputer.m92590b(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.f64953c, null, 8, null));
        }
        return TuplesKt.m87240a(KotlinTypeFactory.m92637n(typeAttributesMo91889F0, typeConstructorMo88305l, arrayList, simpleType.mo89966H0(), memberScopeMo88459s0, new ldc0(classDescriptor, this, simpleType, javaTypeAttributes)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l */
    public final KotlinType m89884l(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
            return m89884l(this.f64953c.m92749e((TypeParameterDescriptor) classifierDescriptorMo88316e, javaTypeAttributes.m89853j(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo88316e instanceof ClassDescriptor)) {
            nnq.m160357a("Unexpected declaration kind: ", classifierDescriptorMo88316e);
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo88316e2 = FlexibleTypesKt.m92608d(kotlinType).mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e2 instanceof ClassDescriptor) {
            Pair<SimpleType, Boolean> pairM89883j = m89883j(FlexibleTypesKt.m92607c(kotlinType), (ClassDescriptor) classifierDescriptorMo88316e, f64950d);
            SimpleType simpleTypeComponent1 = pairM89883j.component1();
            boolean zBooleanValue = pairM89883j.component2().booleanValue();
            Pair<SimpleType, Boolean> pairM89883j2 = m89883j(FlexibleTypesKt.m92608d(kotlinType), (ClassDescriptor) classifierDescriptorMo88316e2, f64951e);
            SimpleType simpleTypeComponent2 = pairM89883j2.component1();
            return (zBooleanValue || pairM89883j2.component2().booleanValue()) ? new RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2) : KotlinTypeFactory.m92629e(simpleTypeComponent1, simpleTypeComponent2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo88316e2 + "\" while for lower it's \"" + classifierDescriptorMo88316e + '\"').toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public TypeProjectionImpl mo89881e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(m89880m(this, kotlinType, null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
