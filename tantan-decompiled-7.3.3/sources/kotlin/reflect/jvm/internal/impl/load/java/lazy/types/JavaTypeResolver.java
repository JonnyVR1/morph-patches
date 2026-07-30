package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.omq;
import p153l.poj0;
import p153l.wq4;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65618a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterResolver f65619b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final RawProjectionComputer f65620c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TypeParameterUpperBoundEraser f65621d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        this.f65618a = lazyJavaResolverContext;
        this.f65619b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f65620c = rawProjectionComputer;
        this.f65621d = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final KotlinType m90751e(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = javaTypeResolver.f65621d;
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
        return typeParameterUpperBoundEraser.m93640e(typeParameterDescriptor, javaTypeAttributes.m90745k(classifierDescriptorMo89207e != null ? classifierDescriptorMo89207e.mo89349o() : null).m90744j(javaClassifierType.mo89931B()));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ KotlinType m90752m(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.m90763l(javaArrayType, javaTypeAttributes, z);
    }

    /* JADX INFO: renamed from: o */
    public static final ErrorType m90753o(JavaClassifierType javaClassifierType) {
        return ErrorUtils.m93893d(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.mo89934s());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m90754b(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        Variance varianceMo89492h;
        if (!JavaTypesKt.m90795a((JavaType) CollectionsKt.lastOrNull((List) javaClassifierType.mo89933p()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.INSTANCE.m89256b(classDescriptor).mo89196l().getParameters();
        parameters.getClass();
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
        return (typeParameterDescriptor == null || (varianceMo89492h = typeParameterDescriptor.mo89492h()) == null || varianceMo89492h == Variance.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX INFO: renamed from: c */
    public final List<TypeProjection> m90755c(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        boolean z;
        if (!javaClassifierType.mo89931B()) {
            if (javaClassifierType.mo89933p().isEmpty()) {
                List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                parameters.getClass();
                z = parameters.isEmpty() ? false : true;
            }
        }
        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        parameters2.getClass();
        if (z) {
            return m90756d(javaClassifierType, parameters2, typeConstructor, javaTypeAttributes);
        }
        if (parameters2.size() != javaClassifierType.mo89933p().size()) {
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                String strM91973b = typeParameterDescriptor.getName().m91973b();
                strM91973b.getClass();
                arrayList.add(new TypeProjectionImpl(ErrorUtils.m93893d(errorTypeKind, strM91973b)));
            }
            return CollectionsKt.toList(arrayList);
        }
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(javaClassifierType.mo89933p());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            JavaType javaType = (JavaType) indexedValue.component2();
            parameters2.size();
            TypeParameterDescriptor typeParameterDescriptor2 = parameters2.get(index);
            JavaTypeAttributes javaTypeAttributesM90749b = JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 7, null);
            typeParameterDescriptor2.getClass();
            arrayList2.add(m90766q(javaType, javaTypeAttributesM90749b, typeParameterDescriptor2));
        }
        return CollectionsKt.toList(arrayList2);
    }

    /* JADX INFO: renamed from: d */
    public final List<TypeProjection> m90756d(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        JavaTypeResolver javaTypeResolver;
        JavaClassifierType javaClassifierType2;
        TypeConstructor typeConstructor2;
        JavaTypeAttributes javaTypeAttributes2;
        TypeProjection typeProjectionMo90768a;
        List<? extends TypeParameterDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list2) {
            if (TypeUtilsKt.m93988q(typeParameterDescriptor, null, javaTypeAttributes.mo90738c())) {
                typeProjectionMo90768a = TypeUtils.m93700t(typeParameterDescriptor, javaTypeAttributes);
                javaTypeResolver = this;
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
            } else {
                javaTypeResolver = this;
                javaClassifierType2 = javaClassifierType;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
                typeProjectionMo90768a = javaTypeResolver.f65620c.mo90768a(typeParameterDescriptor, javaTypeAttributes2.m90744j(javaClassifierType2.mo89931B()), javaTypeResolver.f65621d, new LazyWrappedType(this.f65618a.m90512e(), new omq(javaTypeResolver, typeParameterDescriptor, javaTypeAttributes2, typeConstructor2, javaClassifierType2)));
            }
            arrayList.add(typeProjectionMo90768a);
            this = javaTypeResolver;
            javaTypeAttributes = javaTypeAttributes2;
            typeConstructor = typeConstructor2;
            javaClassifierType = javaClassifierType2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final SimpleType m90757f(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        JavaClassifierType javaClassifierType2;
        TypeAttributes typeAttributesM93602b;
        if (simpleType == null || (typeAttributesM93602b = simpleType.mo92780F0()) == null) {
            javaClassifierType2 = javaClassifierType;
            typeAttributesM93602b = TypeAttributesKt.m93602b(new LazyJavaAnnotations(this.f65618a, javaClassifierType2, false, 4, null));
        } else {
            javaClassifierType2 = javaClassifierType;
        }
        TypeAttributes typeAttributes = typeAttributesM93602b;
        TypeConstructor typeConstructorM90758g = m90758g(javaClassifierType2, javaTypeAttributes);
        if (typeConstructorM90758g == null) {
            return null;
        }
        boolean zM90761j = m90761j(javaTypeAttributes);
        return (Intrinsics.m88377d(simpleType != null ? simpleType.mo92781G0() : null, typeConstructorM90758g) && !javaClassifierType2.mo89931B() && zM90761j) ? simpleType.mo90858N0(true) : KotlinTypeFactory.m93525k(typeAttributes, typeConstructorM90758g, m90755c(javaClassifierType2, javaTypeAttributes, typeConstructorM90758g), zM90761j, null, 16, null);
    }

    /* JADX INFO: renamed from: g */
    public final TypeConstructor m90758g(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructorMo89196l;
        JavaClassifier javaClassifierMo89932i = javaClassifierType.mo89932i();
        if (javaClassifierMo89932i == null) {
            return m90759h(javaClassifierType);
        }
        if (!(javaClassifierMo89932i instanceof JavaClass)) {
            if (!(javaClassifierMo89932i instanceof JavaTypeParameter)) {
                xtq0.m213103a("Unknown classifier kind: ", javaClassifierMo89932i);
                return null;
            }
            TypeParameterDescriptor typeParameterDescriptorMo90517a = this.f65619b.mo90517a((JavaTypeParameter) javaClassifierMo89932i);
            if (typeParameterDescriptorMo90517a != null) {
                return typeParameterDescriptorMo90517a.mo89196l();
            }
            return null;
        }
        JavaClass javaClass = (JavaClass) javaClassifierMo89932i;
        FqName fqNameMo89923d = javaClass.mo89923d();
        if (fqNameMo89923d == null) {
            wq4.m207499a("Class type should have a FQ name: ", javaClassifierMo89932i);
            return null;
        }
        ClassDescriptor classDescriptorM90762k = m90762k(javaClassifierType, javaTypeAttributes, fqNameMo89923d);
        if (classDescriptorM90762k == null) {
            classDescriptorM90762k = this.f65618a.m90508a().m90486n().mo90518a(javaClass);
        }
        return (classDescriptorM90762k == null || (typeConstructorMo89196l = classDescriptorM90762k.mo89196l()) == null) ? m90759h(javaClassifierType) : typeConstructorMo89196l;
    }

    /* JADX INFO: renamed from: h */
    public final TypeConstructor m90759h(JavaClassifierType javaClassifierType) {
        TypeConstructor typeConstructorMo89196l = this.f65618a.m90508a().m90474b().m91198f().m93057r().m89447d(ClassId.Companion.m91936c(new FqName(javaClassifierType.mo89935u())), CollectionsKt.listOf(0)).mo89196l();
        typeConstructorMo89196l.getClass();
        return typeConstructorMo89196l;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m90760i(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.mo89492h() == Variance.INVARIANT || variance == typeParameterDescriptor.mo89492h()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m90761j(JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.m90741g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.m90742h() || javaTypeAttributes.mo90737b() == TypeUsage.SUPERTYPE) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final ClassDescriptor m90762k(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.m90742h() && Intrinsics.m88377d(fqName, JavaTypeResolverKt.f65622a)) {
            return this.f65618a.m90508a().m90488p().m89150d();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor classDescriptorM89254f = JavaToKotlinClassMapper.m89254f(javaToKotlinClassMapper, fqName, this.f65618a.m90511d().mo89437f(), null, 4, null);
        if (classDescriptorM89254f == null) {
            return null;
        }
        return (javaToKotlinClassMapper.m89258d(classDescriptorM89254f) && (javaTypeAttributes.m90741g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.mo90737b() == TypeUsage.SUPERTYPE || m90754b(javaClassifierType, classDescriptorM89254f))) ? javaToKotlinClassMapper.m89256b(classDescriptorM89254f) : classDescriptorM89254f;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final KotlinType m90763l(@NotNull JavaArrayType javaArrayType, @NotNull JavaTypeAttributes javaTypeAttributes, boolean z) {
        javaArrayType.getClass();
        javaTypeAttributes.getClass();
        JavaType javaTypeMo89904k = javaArrayType.mo89904k();
        JavaPrimitiveType javaPrimitiveType = javaTypeMo89904k instanceof JavaPrimitiveType ? (JavaPrimitiveType) javaTypeMo89904k : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f65618a, javaArrayType, true);
        if (type != null) {
            SimpleType simpleTypeM89110P = this.f65618a.m90511d().mo89437f().m89110P(type);
            simpleTypeM89110P.getClass();
            KotlinType kotlinTypeM93968C = TypeUtilsKt.m93968C(simpleTypeM89110P, new CompositeAnnotations(simpleTypeM89110P.getAnnotations(), lazyJavaAnnotations));
            kotlinTypeM93968C.getClass();
            SimpleType simpleType = (SimpleType) kotlinTypeM93968C;
            return javaTypeAttributes.m90742h() ? simpleType : KotlinTypeFactory.m93520e(simpleType, simpleType.mo90858N0(true));
        }
        KotlinType kotlinTypeM90765p = m90765p(javaTypeMo89904k, JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, javaTypeAttributes.m90742h(), false, null, 6, null));
        if (javaTypeAttributes.m90742h()) {
            SimpleType simpleTypeM89128n = this.f65618a.m90511d().mo89437f().m89128n(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeM90765p, lazyJavaAnnotations);
            simpleTypeM89128n.getClass();
            return simpleTypeM89128n;
        }
        SimpleType simpleTypeM89128n2 = this.f65618a.m90511d().mo89437f().m89128n(Variance.INVARIANT, kotlinTypeM90765p, lazyJavaAnnotations);
        simpleTypeM89128n2.getClass();
        return KotlinTypeFactory.m93520e(simpleTypeM89128n2, this.f65618a.m90511d().mo89437f().m89128n(Variance.OUT_VARIANCE, kotlinTypeM90765p, lazyJavaAnnotations).mo90858N0(true));
    }

    /* JADX INFO: renamed from: n */
    public final KotlinType m90764n(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z = (javaTypeAttributes.m90742h() || javaTypeAttributes.mo90737b() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zMo89931B = javaClassifierType.mo89931B();
        if (!zMo89931B && !z) {
            SimpleType simpleTypeM90757f = m90757f(javaClassifierType, javaTypeAttributes, null);
            return simpleTypeM90757f != null ? simpleTypeM90757f : m90753o(javaClassifierType);
        }
        SimpleType simpleTypeM90757f2 = m90757f(javaClassifierType, javaTypeAttributes.m90746l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (simpleTypeM90757f2 == null) {
            return m90753o(javaClassifierType);
        }
        SimpleType simpleTypeM90757f3 = m90757f(javaClassifierType, javaTypeAttributes.m90746l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeM90757f2);
        if (simpleTypeM90757f3 == null) {
            return m90753o(javaClassifierType);
        }
        return zMo89931B ? new RawTypeImpl(simpleTypeM90757f2, simpleTypeM90757f3) : KotlinTypeFactory.m93520e(simpleTypeM90757f2, simpleTypeM90757f3);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final KotlinType m90765p(@Nullable JavaType javaType, @NotNull JavaTypeAttributes javaTypeAttributes) {
        KotlinType kotlinTypeM90765p;
        javaTypeAttributes.getClass();
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            LazyJavaResolverContext lazyJavaResolverContext = this.f65618a;
            SimpleType simpleTypeM89112S = type != null ? lazyJavaResolverContext.m90511d().mo89437f().m89112S(type) : lazyJavaResolverContext.m90511d().mo89437f().m89119a0();
            simpleTypeM89112S.getClass();
            return simpleTypeM89112S;
        }
        if (javaType instanceof JavaClassifierType) {
            return m90764n((JavaClassifierType) javaType, javaTypeAttributes);
        }
        if (javaType instanceof JavaArrayType) {
            return m90752m(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
        }
        if (!(javaType instanceof JavaWildcardType)) {
            if (javaType != null) {
                poj0.m173108a("Unsupported type: ", javaType);
                return null;
            }
            SimpleType simpleTypeM89140z = this.f65618a.m90511d().mo89437f().m89140z();
            simpleTypeM89140z.getClass();
            return simpleTypeM89140z;
        }
        JavaType javaTypeMo89964o = ((JavaWildcardType) javaType).mo89964o();
        if (javaTypeMo89964o != null && (kotlinTypeM90765p = m90765p(javaTypeMo89964o, javaTypeAttributes)) != null) {
            return kotlinTypeM90765p;
        }
        SimpleType simpleTypeM89140z2 = this.f65618a.m90511d().mo89437f().m89140z();
        simpleTypeM89140z2.getClass();
        return simpleTypeM89140z2;
    }

    /* JADX INFO: renamed from: q */
    public final TypeProjection m90766q(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, m90765p(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType javaTypeMo89964o = javaWildcardType.mo89964o();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (javaTypeMo89964o == null || m90760i(variance, typeParameterDescriptor)) {
            TypeProjection typeProjectionM93700t = TypeUtils.m93700t(typeParameterDescriptor, javaTypeAttributes);
            typeProjectionM93700t.getClass();
            return typeProjectionM93700t;
        }
        AnnotationDescriptor annotationDescriptorM90393a = UtilsKt.m90393a(this.f65618a, javaWildcardType);
        KotlinType kotlinTypeM90765p = m90765p(javaTypeMo89964o, JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 7, null));
        if (annotationDescriptorM90393a != null) {
            kotlinTypeM90765p = TypeUtilsKt.m93968C(kotlinTypeM90765p, Annotations.Companion.m89531a(CollectionsKt.plus(kotlinTypeM90765p.getAnnotations(), annotationDescriptorM90393a)));
        }
        return TypeUtilsKt.m93982k(kotlinTypeM90765p, variance, typeParameterDescriptor);
    }
}
