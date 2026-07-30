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
import p149l.xp4;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final TypeAliasExpander f66248c = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeAliasExpansionReportStrategy f66249a;

    /* JADX INFO: renamed from: b */
    public final boolean f66250b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final void m92688b(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            xp4.m210459a("Too deep recursion while expanding type alias ", typeAliasDescriptor.getName());
        }

        private Companion() {
        }
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        typeAliasExpansionReportStrategy.getClass();
        this.f66249a = typeAliasExpansionReportStrategy;
        this.f66250b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m92674a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo88631d());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.mo88631d())) {
                this.f66249a.mo92696c(annotationDescriptor);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m92675b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorM92772g = TypeSubstitutor.m92772g(kotlinType2);
        typeSubstitutorM92772g.getClass();
        int i = 0;
        for (Object obj : kotlinType2.mo91888E0()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.mo92666b()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                if (!TypeUtilsKt.m93087g(type)) {
                    TypeProjection typeProjection2 = kotlinType.mo91888E0().get(i);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.mo91890G0().getParameters().get(i);
                    if (this.f66250b) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f66249a;
                        KotlinType type2 = typeProjection2.getType();
                        type2.getClass();
                        KotlinType type3 = typeProjection.getType();
                        type3.getClass();
                        typeParameterDescriptor.getClass();
                        typeAliasExpansionReportStrategy.mo92694a(typeSubstitutorM92772g, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final DynamicType m92676c(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.mo89894M0(m92681h(dynamicType, typeAttributes));
    }

    /* JADX INFO: renamed from: d */
    public final SimpleType m92677d(SimpleType simpleType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.m92644a(simpleType) ? simpleType : TypeSubstitutionKt.m92765f(simpleType, null, m92681h(simpleType, typeAttributes), 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final SimpleType m92678e(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType simpleTypeM92807r = TypeUtils.m92807r(simpleType, kotlinType.mo89966H0());
        simpleTypeM92807r.getClass();
        return simpleTypeM92807r;
    }

    /* JADX INFO: renamed from: f */
    public final SimpleType m92679f(SimpleType simpleType, KotlinType kotlinType) {
        return m92677d(m92678e(simpleType, kotlinType), kotlinType.mo91889F0());
    }

    /* JADX INFO: renamed from: g */
    public final SimpleType m92680g(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z) {
        TypeConstructor typeConstructorMo88305l = typeAliasExpansion.m92690b().mo88305l();
        typeConstructorMo88305l.getClass();
        return KotlinTypeFactory.m92636m(typeAttributes, typeConstructorMo88305l, typeAliasExpansion.m92689a(), z, MemberScope.Empty.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public final TypeAttributes m92681h(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.m92644a(kotlinType) ? kotlinType.mo91889F0() : typeAttributes.m92701j(kotlinType.mo91889F0());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SimpleType m92682i(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes typeAttributes) {
        typeAliasExpansion.getClass();
        typeAttributes.getClass();
        return m92684k(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    /* JADX INFO: renamed from: j */
    public final TypeProjection m92683j(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        UnwrappedType unwrappedTypeMo92625J0 = typeProjection.getType().mo92625J0();
        if (!DynamicTypesKt.m92589a(unwrappedTypeMo92625J0)) {
            SimpleType simpleTypeM92760a = TypeSubstitutionKt.m92760a(unwrappedTypeMo92625J0);
            if (!KotlinTypeKt.m92644a(simpleTypeM92760a) && TypeUtilsKt.m93079E(simpleTypeM92760a)) {
                TypeConstructor typeConstructorMo91890G0 = simpleTypeM92760a.mo91890G0();
                ClassifierDescriptor classifierDescriptorMo88316e = typeConstructorMo91890G0.mo88316e();
                typeConstructorMo91890G0.getParameters().size();
                simpleTypeM92760a.mo91888E0().size();
                if (!(classifierDescriptorMo88316e instanceof TypeParameterDescriptor)) {
                    if (!(classifierDescriptorMo88316e instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeM92686m = m92686m(simpleTypeM92760a, typeAliasExpansion, i);
                        m92675b(simpleTypeM92760a, simpleTypeM92686m);
                        return new TypeProjectionImpl(typeProjection.mo92667c(), simpleTypeM92686m);
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo88316e;
                    if (typeAliasExpansion.m92692d(typeAliasDescriptor)) {
                        this.f66249a.mo92695b(typeAliasDescriptor);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String string = typeAliasDescriptor.getName().toString();
                        string.getClass();
                        return new TypeProjectionImpl(variance, ErrorUtils.m93002d(errorTypeKind, string));
                    }
                    List<TypeProjection> listMo91888E0 = simpleTypeM92760a.mo91888E0();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo91888E0, 10));
                    int i2 = 0;
                    for (Object obj : listMo91888E0) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(m92685l((TypeProjection) obj, typeAliasExpansion, typeConstructorMo91890G0.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    SimpleType simpleTypeM92684k = m92684k(TypeAliasExpansion.Companion.m92693a(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeM92760a.mo91889F0(), simpleTypeM92760a.mo89966H0(), i + 1, false);
                    SimpleType simpleTypeM92686m2 = m92686m(simpleTypeM92760a, typeAliasExpansion, i);
                    if (!DynamicTypesKt.m92589a(simpleTypeM92684k)) {
                        simpleTypeM92684k = SpecialTypesKt.m92663j(simpleTypeM92684k, simpleTypeM92686m2);
                    }
                    return new TypeProjectionImpl(typeProjection.mo92667c(), simpleTypeM92684k);
                }
            }
        }
        return typeProjection;
    }

    /* JADX INFO: renamed from: k */
    public final SimpleType m92684k(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection typeProjectionM92685l = m92685l(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.m92690b().mo88598v0()), typeAliasExpansion, null, i);
        KotlinType type = typeProjectionM92685l.getType();
        type.getClass();
        SimpleType simpleTypeM92760a = TypeSubstitutionKt.m92760a(type);
        if (KotlinTypeKt.m92644a(simpleTypeM92760a)) {
            return simpleTypeM92760a;
        }
        typeProjectionM92685l.mo92667c();
        m92674a(simpleTypeM92760a.getAnnotations(), AnnotationsTypeAttributeKt.m92566a(typeAttributes));
        SimpleType simpleTypeM92807r = TypeUtils.m92807r(m92677d(simpleTypeM92760a, typeAttributes), z);
        simpleTypeM92807r.getClass();
        return z2 ? SpecialTypesKt.m92663j(simpleTypeM92807r, m92680g(typeAliasExpansion, typeAttributes, z)) : simpleTypeM92807r;
    }

    /* JADX INFO: renamed from: l */
    public final TypeProjection m92685l(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance varianceMo88601h;
        Variance variance;
        Variance variance2;
        Companion.m92688b(i, typeAliasExpansion.m92690b());
        if (typeProjection.mo92666b()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionM92808s = TypeUtils.m92808s(typeParameterDescriptor);
            typeProjectionM92808s.getClass();
            return typeProjectionM92808s;
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        TypeProjection typeProjectionM92691c = typeAliasExpansion.m92691c(type.mo91890G0());
        if (typeProjectionM92691c == null) {
            return m92683j(typeProjection, typeAliasExpansion, i);
        }
        if (typeProjectionM92691c.mo92666b()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionM92808s2 = TypeUtils.m92808s(typeParameterDescriptor);
            typeProjectionM92808s2.getClass();
            return typeProjectionM92808s2;
        }
        UnwrappedType unwrappedTypeMo92625J0 = typeProjectionM92691c.getType().mo92625J0();
        Variance varianceMo92667c = typeProjectionM92691c.mo92667c();
        varianceMo92667c.getClass();
        Variance varianceMo92667c2 = typeProjection.mo92667c();
        varianceMo92667c2.getClass();
        if (varianceMo92667c2 != varianceMo92667c && varianceMo92667c2 != (variance2 = Variance.INVARIANT)) {
            if (varianceMo92667c == variance2) {
                varianceMo92667c = varianceMo92667c2;
            } else {
                this.f66249a.mo92697d(typeAliasExpansion.m92690b(), typeParameterDescriptor, unwrappedTypeMo92625J0);
            }
        }
        if (typeParameterDescriptor == null || (varianceMo88601h = typeParameterDescriptor.mo88601h()) == null) {
            varianceMo88601h = Variance.INVARIANT;
        }
        if (varianceMo88601h != varianceMo92667c && varianceMo88601h != (variance = Variance.INVARIANT)) {
            if (varianceMo92667c == variance) {
                varianceMo92667c = variance;
            } else {
                this.f66249a.mo92697d(typeAliasExpansion.m92690b(), typeParameterDescriptor, unwrappedTypeMo92625J0);
            }
        }
        m92674a(type.getAnnotations(), unwrappedTypeMo92625J0.getAnnotations());
        return new TypeProjectionImpl(varianceMo92667c, unwrappedTypeMo92625J0 instanceof DynamicType ? m92676c((DynamicType) unwrappedTypeMo92625J0, type.mo91889F0()) : m92679f(TypeSubstitutionKt.m92760a(unwrappedTypeMo92625J0), type));
    }

    /* JADX INFO: renamed from: m */
    public final SimpleType m92686m(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor typeConstructorMo91890G0 = simpleType.mo91890G0();
        List<TypeProjection> listMo91888E0 = simpleType.mo91888E0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo91888E0, 10));
        int i2 = 0;
        for (Object obj : listMo91888E0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionM92685l = m92685l(typeProjection, typeAliasExpansion, typeConstructorMo91890G0.getParameters().get(i2), i + 1);
            if (!typeProjectionM92685l.mo92666b()) {
                typeProjectionM92685l = new TypeProjectionImpl(typeProjectionM92685l.mo92667c(), TypeUtils.m92806q(typeProjectionM92685l.getType(), typeProjection.getType().mo89966H0()));
            }
            arrayList.add(typeProjectionM92685l);
            i2 = i3;
        }
        return TypeSubstitutionKt.m92765f(simpleType, arrayList, null, 2, null);
    }
}
