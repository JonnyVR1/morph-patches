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
import p149l.v7r;
import p149l.w7r;
import p149l.x7r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f64858i = {Reflection.m87514i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyJavaAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64859a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaAnnotation f64860b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NullableLazyValue f64861c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f64862d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final JavaSourceElement f64863e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final NotNullLazyValue f64864f;

    /* JADX INFO: renamed from: g */
    public final boolean f64865g;

    /* JADX INFO: renamed from: h */
    public final boolean f64866h;

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotation javaAnnotation, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotation.getClass();
        this.f64859a = lazyJavaResolverContext;
        this.f64860b = javaAnnotation;
        this.f64861c = lazyJavaResolverContext.m89621e().mo92448g(new v7r(this));
        this.f64862d = lazyJavaResolverContext.m89621e().mo92446e(new w7r(this));
        this.f64863e = lazyJavaResolverContext.m89617a().m89601t().mo88964a(javaAnnotation);
        this.f64864f = lazyJavaResolverContext.m89621e().mo92446e(new x7r(this));
        this.f64865g = javaAnnotation.mo89003f();
        this.f64866h = javaAnnotation.mo89005t() || z;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m89649g(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        Collection<JavaAnnotationArgument> collectionMo89004j = lazyJavaAnnotationDescriptor.f64860b.mo89004j();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : collectionMo89004j) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.f64695c;
            }
            ConstantValue<?> constantValueM89656m = lazyJavaAnnotationDescriptor.m89656m(javaAnnotationArgument);
            Pair pairM87240a = constantValueM89656m != null ? TuplesKt.m87240a(name, constantValueM89656m) : null;
            if (pairM87240a != null) {
                arrayList.add(pairM87240a);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static final FqName m89650i(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        ClassId classIdMo89002e = lazyJavaAnnotationDescriptor.f64860b.mo89002e();
        if (classIdMo89002e != null) {
            return classIdMo89002e.m91034a();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final SimpleType m89651r(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        FqName fqNameMo88631d = lazyJavaAnnotationDescriptor.mo88631d();
        if (fqNameMo88631d == null) {
            return ErrorUtils.m93002d(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.f64860b.toString());
        }
        ClassDescriptor classDescriptorM88363f = JavaToKotlinClassMapper.m88363f(JavaToKotlinClassMapper.INSTANCE, fqNameMo88631d, lazyJavaAnnotationDescriptor.f64859a.m89620d().mo88546f(), null, 4, null);
        if (classDescriptorM88363f == null) {
            JavaClass javaClassMo88999C = lazyJavaAnnotationDescriptor.f64860b.mo88999C();
            classDescriptorM88363f = javaClassMo88999C != null ? lazyJavaAnnotationDescriptor.f64859a.m89617a().m89595n().mo89627a(javaClassMo88999C) : null;
            if (classDescriptorM88363f == null) {
                classDescriptorM88363f = lazyJavaAnnotationDescriptor.m89652h(fqNameMo88631d);
            }
        }
        return classDescriptorM88363f.mo88458o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        return (Map) StorageKt.m92484a(this.f64864f, this, f64858i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    /* JADX INFO: renamed from: d */
    public FqName mo88631d() {
        return (FqName) StorageKt.m92485b(this.f64861c, this, f64858i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    /* JADX INFO: renamed from: f */
    public boolean mo89519f() {
        return this.f64865g;
    }

    /* JADX INFO: renamed from: h */
    public final ClassDescriptor m89652h(FqName fqName) {
        return FindClassInModuleKt.m88509d(this.f64859a.m89620d(), ClassId.Companion.m91045c(fqName), this.f64859a.m89617a().m89583b().m90307f().m92166r());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JavaSourceElement getSource() {
        return this.f64863e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.m92484a(this.f64862d, this, f64858i[1]);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m89655l() {
        return this.f64866h;
    }

    /* JADX INFO: renamed from: m */
    public final ConstantValue<?> m89656m(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.m91921f(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return m89659p(javaEnumValueAnnotationArgument.mo89048c(), javaEnumValueAnnotationArgument.mo89049d());
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return m89657n(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return m89660q(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).mo89039b());
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.f64695c;
        }
        name.getClass();
        return m89658o(name, javaArrayAnnotationArgument.mo89010a());
    }

    /* JADX INFO: renamed from: n */
    public final ConstantValue<?> m89657n(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f64859a, javaAnnotation, false, 4, null));
    }

    /* JADX INFO: renamed from: o */
    public final ConstantValue<?> m89658o(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType kotlinTypeM88236m;
        if (KotlinTypeKt.m92644a(getType())) {
            return null;
        }
        ClassDescriptor classDescriptorM91979l = DescriptorUtilsKt.m91979l(this);
        classDescriptorM91979l.getClass();
        ValueParameterDescriptor valueParameterDescriptorM89507b = DescriptorResolverUtils.m89507b(name, classDescriptorM91979l);
        if (valueParameterDescriptorM89507b == null || (kotlinTypeM88236m = valueParameterDescriptorM89507b.getType()) == null) {
            kotlinTypeM88236m = this.f64859a.m89617a().m89594m().mo88546f().m88236m(Variance.INVARIANT, ErrorUtils.m93002d(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            kotlinTypeM88236m.getClass();
        }
        List<? extends JavaAnnotationArgument> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueM89656m = m89656m((JavaAnnotationArgument) it.next());
            if (constantValueM89656m == null) {
                constantValueM89656m = new NullValue();
            }
            arrayList.add(constantValueM89656m);
        }
        return ConstantValueFactory.INSTANCE.m91923c(arrayList, kotlinTypeM88236m);
    }

    /* JADX INFO: renamed from: p */
    public final ConstantValue<?> m89659p(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    /* JADX INFO: renamed from: q */
    public final ConstantValue<?> m89660q(JavaType javaType) {
        return KClassValue.Companion.m91949a(this.f64859a.m89623g().m89874p(javaType, JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.m91438Q(DescriptorRenderer.f65742g, this, null, 2, null);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i & 4) != 0 ? false : z);
    }
}
