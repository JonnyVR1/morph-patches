package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.wq4;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final TypeAliasExpander f66922c = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeAliasExpansionReportStrategy f66923a;

    /* JADX INFO: renamed from: b */
    public final boolean f66924b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final void m93579b(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            wq4.m207499a("Too deep recursion while expanding type alias ", typeAliasDescriptor.getName());
        }

        private Companion() {
        }
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        typeAliasExpansionReportStrategy.getClass();
        this.f66923a = typeAliasExpansionReportStrategy;
        this.f66924b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m93565a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo89522d());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.mo89522d())) {
                this.f66923a.mo93587c(annotationDescriptor);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m93566b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorM93663g = TypeSubstitutor.m93663g(kotlinType2);
        typeSubstitutorM93663g.getClass();
        int i = 0;
        for (Object obj : kotlinType2.mo92779E0()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.mo93557b()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                if (!TypeUtilsKt.m93978g(type)) {
                    TypeProjection typeProjection2 = kotlinType.mo92779E0().get(i);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.mo92781G0().getParameters().get(i);
                    if (this.f66924b) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f66923a;
                        KotlinType type2 = typeProjection2.getType();
                        type2.getClass();
                        KotlinType type3 = typeProjection.getType();
                        type3.getClass();
                        typeParameterDescriptor.getClass();
                        typeAliasExpansionReportStrategy.mo93585a(typeSubstitutorM93663g, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final DynamicType m93567c(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.mo90785M0(m93572h(dynamicType, typeAttributes));
    }

    /* JADX INFO: renamed from: d */
    public final SimpleType m93568d(SimpleType simpleType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.m93535a(simpleType) ? simpleType : TypeSubstitutionKt.m93656f(simpleType, null, m93572h(simpleType, typeAttributes), 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final SimpleType m93569e(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType simpleTypeM93698r = TypeUtils.m93698r(simpleType, kotlinType.mo90857H0());
        simpleTypeM93698r.getClass();
        return simpleTypeM93698r;
    }

    /* JADX INFO: renamed from: f */
    public final SimpleType m93570f(SimpleType simpleType, KotlinType kotlinType) {
        return m93568d(m93569e(simpleType, kotlinType), kotlinType.mo92780F0());
    }

    /* JADX INFO: renamed from: g */
    public final SimpleType m93571g(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z) {
        TypeConstructor typeConstructorMo89196l = typeAliasExpansion.m93581b().mo89196l();
        typeConstructorMo89196l.getClass();
        return KotlinTypeFactory.m93527m(typeAttributes, typeConstructorMo89196l, typeAliasExpansion.m93580a(), z, MemberScope.Empty.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public final TypeAttributes m93572h(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.m93535a(kotlinType) ? kotlinType.mo92780F0() : typeAttributes.m93592j(kotlinType.mo92780F0());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SimpleType m93573i(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes typeAttributes) {
        typeAliasExpansion.getClass();
        typeAttributes.getClass();
        return m93575k(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    /* JADX INFO: renamed from: j */
    public final TypeProjection m93574j(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        UnwrappedType unwrappedTypeMo93516J0 = typeProjection.getType().mo93516J0();
        if (!DynamicTypesKt.m93480a(unwrappedTypeMo93516J0)) {
            SimpleType simpleTypeM93651a = TypeSubstitutionKt.m93651a(unwrappedTypeMo93516J0);
            if (!KotlinTypeKt.m93535a(simpleTypeM93651a) && TypeUtilsKt.m93970E(simpleTypeM93651a)) {
                TypeConstructor typeConstructorMo92781G0 = simpleTypeM93651a.mo92781G0();
                ClassifierDescriptor classifierDescriptorMo89207e = typeConstructorMo92781G0.mo89207e();
                typeConstructorMo92781G0.getParameters().size();
                simpleTypeM93651a.mo92779E0().size();
                if (!(classifierDescriptorMo89207e instanceof TypeParameterDescriptor)) {
                    if (!(classifierDescriptorMo89207e instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeM93577m = m93577m(simpleTypeM93651a, typeAliasExpansion, i);
                        m93566b(simpleTypeM93651a, simpleTypeM93577m);
                        return new TypeProjectionImpl(typeProjection.mo93558c(), simpleTypeM93577m);
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo89207e;
                    if (typeAliasExpansion.m93583d(typeAliasDescriptor)) {
                        this.f66923a.mo93586b(typeAliasDescriptor);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String string = typeAliasDescriptor.getName().toString();
                        string.getClass();
                        return new TypeProjectionImpl(variance, ErrorUtils.m93893d(errorTypeKind, string));
                    }
                    List<TypeProjection> listMo92779E0 = simpleTypeM93651a.mo92779E0();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo92779E0, 10));
                    int i2 = 0;
                    for (Object obj : listMo92779E0) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(m93576l((TypeProjection) obj, typeAliasExpansion, typeConstructorMo92781G0.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    SimpleType simpleTypeM93575k = m93575k(TypeAliasExpansion.Companion.m93584a(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeM93651a.mo92780F0(), simpleTypeM93651a.mo90857H0(), i + 1, false);
                    SimpleType simpleTypeM93577m2 = m93577m(simpleTypeM93651a, typeAliasExpansion, i);
                    if (!DynamicTypesKt.m93480a(simpleTypeM93575k)) {
                        simpleTypeM93575k = SpecialTypesKt.m93554j(simpleTypeM93575k, simpleTypeM93577m2);
                    }
                    return new TypeProjectionImpl(typeProjection.mo93558c(), simpleTypeM93575k);
                }
            }
        }
        return typeProjection;
    }

    /* JADX INFO: renamed from: k */
    public final SimpleType m93575k(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection typeProjectionM93576l = m93576l(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.m93581b().mo89489v0()), typeAliasExpansion, null, i);
        KotlinType type = typeProjectionM93576l.getType();
        type.getClass();
        SimpleType simpleTypeM93651a = TypeSubstitutionKt.m93651a(type);
        if (KotlinTypeKt.m93535a(simpleTypeM93651a)) {
            return simpleTypeM93651a;
        }
        typeProjectionM93576l.mo93558c();
        m93565a(simpleTypeM93651a.getAnnotations(), AnnotationsTypeAttributeKt.m93457a(typeAttributes));
        SimpleType simpleTypeM93698r = TypeUtils.m93698r(m93568d(simpleTypeM93651a, typeAttributes), z);
        simpleTypeM93698r.getClass();
        return z2 ? SpecialTypesKt.m93554j(simpleTypeM93698r, m93571g(typeAliasExpansion, typeAttributes, z)) : simpleTypeM93698r;
    }

    /* JADX INFO: renamed from: l */
    public final TypeProjection m93576l(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance varianceMo89492h;
        Variance variance;
        Variance variance2;
        Companion.m93579b(i, typeAliasExpansion.m93581b());
        if (typeProjection.mo93557b()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionM93699s = TypeUtils.m93699s(typeParameterDescriptor);
            typeProjectionM93699s.getClass();
            return typeProjectionM93699s;
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        TypeProjection typeProjectionM93582c = typeAliasExpansion.m93582c(type.mo92781G0());
        if (typeProjectionM93582c == null) {
            return m93574j(typeProjection, typeAliasExpansion, i);
        }
        if (typeProjectionM93582c.mo93557b()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionM93699s2 = TypeUtils.m93699s(typeParameterDescriptor);
            typeProjectionM93699s2.getClass();
            return typeProjectionM93699s2;
        }
        UnwrappedType unwrappedTypeMo93516J0 = typeProjectionM93582c.getType().mo93516J0();
        Variance varianceMo93558c = typeProjectionM93582c.mo93558c();
        varianceMo93558c.getClass();
        Variance varianceMo93558c2 = typeProjection.mo93558c();
        varianceMo93558c2.getClass();
        if (varianceMo93558c2 != varianceMo93558c && varianceMo93558c2 != (variance2 = Variance.INVARIANT)) {
            if (varianceMo93558c == variance2) {
                varianceMo93558c = varianceMo93558c2;
            } else {
                this.f66923a.mo93588d(typeAliasExpansion.m93581b(), typeParameterDescriptor, unwrappedTypeMo93516J0);
            }
        }
        if (typeParameterDescriptor == null || (varianceMo89492h = typeParameterDescriptor.mo89492h()) == null) {
            varianceMo89492h = Variance.INVARIANT;
        }
        if (varianceMo89492h != varianceMo93558c && varianceMo89492h != (variance = Variance.INVARIANT)) {
            if (varianceMo93558c == variance) {
                varianceMo93558c = variance;
            } else {
                this.f66923a.mo93588d(typeAliasExpansion.m93581b(), typeParameterDescriptor, unwrappedTypeMo93516J0);
            }
        }
        m93565a(type.getAnnotations(), unwrappedTypeMo93516J0.getAnnotations());
        return new TypeProjectionImpl(varianceMo93558c, unwrappedTypeMo93516J0 instanceof DynamicType ? m93567c((DynamicType) unwrappedTypeMo93516J0, type.mo92780F0()) : m93570f(TypeSubstitutionKt.m93651a(unwrappedTypeMo93516J0), type));
    }

    /* JADX INFO: renamed from: m */
    public final SimpleType m93577m(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor typeConstructorMo92781G0 = simpleType.mo92781G0();
        List<TypeProjection> listMo92779E0 = simpleType.mo92779E0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo92779E0, 10));
        int i2 = 0;
        for (Object obj : listMo92779E0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionM93576l = m93576l(typeProjection, typeAliasExpansion, typeConstructorMo92781G0.getParameters().get(i2), i + 1);
            if (!typeProjectionM93576l.mo93557b()) {
                typeProjectionM93576l = new TypeProjectionImpl(typeProjectionM93576l.mo93558c(), TypeUtils.m93697q(typeProjectionM93576l.getType(), typeProjection.getType().mo90857H0()));
            }
            arrayList.add(typeProjectionM93576l);
            i2 = i3;
        }
        return TypeSubstitutionKt.m93656f(simpleType, arrayList, null, 2, null);
    }
}
