package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.x9r;
import p153l.y9r;
import p153l.z9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f65532i = {Reflection.m88403i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65533a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaAnnotation f65534b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NullableLazyValue f65535c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f65536d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final JavaSourceElement f65537e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final NotNullLazyValue f65538f;

    /* JADX INFO: renamed from: g */
    public final boolean f65539g;

    /* JADX INFO: renamed from: h */
    public final boolean f65540h;

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotation javaAnnotation, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotation.getClass();
        this.f65533a = lazyJavaResolverContext;
        this.f65534b = javaAnnotation;
        this.f65535c = lazyJavaResolverContext.m90512e().mo93339g(new x9r(this));
        this.f65536d = lazyJavaResolverContext.m90512e().mo93337e(new y9r(this));
        this.f65537e = lazyJavaResolverContext.m90508a().m90492t().mo89855a(javaAnnotation);
        this.f65538f = lazyJavaResolverContext.m90512e().mo93337e(new z9r(this));
        this.f65539g = javaAnnotation.mo89894f();
        this.f65540h = javaAnnotation.mo89896t() || z;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m90540g(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        Collection<JavaAnnotationArgument> collectionMo89895j = lazyJavaAnnotationDescriptor.f65534b.mo89895j();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : collectionMo89895j) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.f65369c;
            }
            ConstantValue<?> constantValueM90547m = lazyJavaAnnotationDescriptor.m90547m(javaAnnotationArgument);
            Pair pairM88129a = constantValueM90547m != null ? TuplesKt.m88129a(name, constantValueM90547m) : null;
            if (pairM88129a != null) {
                arrayList.add(pairM88129a);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static final FqName m90541i(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        ClassId classIdMo89893e = lazyJavaAnnotationDescriptor.f65534b.mo89893e();
        if (classIdMo89893e != null) {
            return classIdMo89893e.m91925a();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final SimpleType m90542r(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        FqName fqNameMo89522d = lazyJavaAnnotationDescriptor.mo89522d();
        if (fqNameMo89522d == null) {
            return ErrorUtils.m93893d(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.f65534b.toString());
        }
        ClassDescriptor classDescriptorM89254f = JavaToKotlinClassMapper.m89254f(JavaToKotlinClassMapper.INSTANCE, fqNameMo89522d, lazyJavaAnnotationDescriptor.f65533a.m90511d().mo89437f(), null, 4, null);
        if (classDescriptorM89254f == null) {
            JavaClass javaClassMo89890C = lazyJavaAnnotationDescriptor.f65534b.mo89890C();
            classDescriptorM89254f = javaClassMo89890C != null ? lazyJavaAnnotationDescriptor.f65533a.m90508a().m90486n().mo90518a(javaClassMo89890C) : null;
            if (classDescriptorM89254f == null) {
                classDescriptorM89254f = lazyJavaAnnotationDescriptor.m90543h(fqNameMo89522d);
            }
        }
        return classDescriptorM89254f.mo89349o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo89521a() {
        return (Map) StorageKt.m93375a(this.f65538f, this, f65532i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* JADX INFO: renamed from: d */
    public FqName mo89522d() {
        return (FqName) StorageKt.m93376b(this.f65535c, this, f65532i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    /* JADX INFO: renamed from: f */
    public boolean mo90410f() {
        return this.f65539g;
    }

    /* JADX INFO: renamed from: h */
    public final ClassDescriptor m90543h(FqName fqName) {
        return FindClassInModuleKt.m89400d(this.f65533a.m90511d(), ClassId.Companion.m91936c(fqName), this.f65533a.m90508a().m90474b().m91198f().m93057r());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JavaSourceElement getSource() {
        return this.f65537e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.m93375a(this.f65536d, this, f65532i[1]);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m90546l() {
        return this.f65540h;
    }

    /* JADX INFO: renamed from: m */
    public final ConstantValue<?> m90547m(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.m92812f(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return m90550p(javaEnumValueAnnotationArgument.mo89939c(), javaEnumValueAnnotationArgument.mo89940d());
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return m90548n(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return m90551q(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).mo89930b());
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.f65369c;
        }
        name.getClass();
        return m90549o(name, javaArrayAnnotationArgument.mo89901a());
    }

    /* JADX INFO: renamed from: n */
    public final ConstantValue<?> m90548n(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f65533a, javaAnnotation, false, 4, null));
    }

    /* JADX INFO: renamed from: o */
    public final ConstantValue<?> m90549o(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType kotlinTypeM89127m;
        if (KotlinTypeKt.m93535a(getType())) {
            return null;
        }
        ClassDescriptor classDescriptorM92870l = DescriptorUtilsKt.m92870l(this);
        classDescriptorM92870l.getClass();
        ValueParameterDescriptor valueParameterDescriptorM90398b = DescriptorResolverUtils.m90398b(name, classDescriptorM92870l);
        if (valueParameterDescriptorM90398b == null || (kotlinTypeM89127m = valueParameterDescriptorM90398b.getType()) == null) {
            kotlinTypeM89127m = this.f65533a.m90508a().m90485m().mo89437f().m89127m(Variance.INVARIANT, ErrorUtils.m93893d(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            kotlinTypeM89127m.getClass();
        }
        List<? extends JavaAnnotationArgument> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueM90547m = m90547m((JavaAnnotationArgument) it.next());
            if (constantValueM90547m == null) {
                constantValueM90547m = new NullValue();
            }
            arrayList.add(constantValueM90547m);
        }
        return ConstantValueFactory.INSTANCE.m92814c(arrayList, kotlinTypeM89127m);
    }

    /* JADX INFO: renamed from: p */
    public final ConstantValue<?> m90550p(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    /* JADX INFO: renamed from: q */
    public final ConstantValue<?> m90551q(JavaType javaType) {
        return KClassValue.Companion.m92840a(this.f65533a.m90514g().m90765p(javaType, JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.m92329Q(DescriptorRenderer.f66416g, this, null, 2, null);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i & 4) != 0 ? false : z);
    }
}
