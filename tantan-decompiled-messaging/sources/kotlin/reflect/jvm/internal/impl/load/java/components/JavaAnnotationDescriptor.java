package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.yjq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f64768f = {Reflection.m87514i(new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f64769a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SourceElement f64770b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f64771c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final JavaAnnotationArgument f64772d;

    /* JADX INFO: renamed from: e */
    public final boolean f64773e;

    public JavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        SourceElement sourceElementMo88964a;
        Collection<JavaAnnotationArgument> collectionMo89004j;
        lazyJavaResolverContext.getClass();
        fqName.getClass();
        this.f64769a = fqName;
        if (javaAnnotation == null || (sourceElementMo88964a = lazyJavaResolverContext.m89617a().m89601t().mo88964a(javaAnnotation)) == null) {
            sourceElementMo88964a = SourceElement.f64063a;
            sourceElementMo88964a.getClass();
        }
        this.f64770b = sourceElementMo88964a;
        this.f64771c = lazyJavaResolverContext.m89621e().mo92446e(new yjq(lazyJavaResolverContext, this));
        this.f64772d = (javaAnnotation == null || (collectionMo89004j = javaAnnotation.mo89004j()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.firstOrNull(collectionMo89004j);
        boolean z = false;
        if (javaAnnotation != null && javaAnnotation.mo89003f()) {
            z = true;
        }
        this.f64773e = z;
    }

    /* JADX INFO: renamed from: g */
    public static final SimpleType m89516g(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        SimpleType simpleTypeMo88458o = lazyJavaResolverContext.m89620d().mo88546f().m88239p(javaAnnotationDescriptor.mo88631d()).mo88458o();
        simpleTypeMo88458o.getClass();
        return simpleTypeMo88458o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        return MapsKt.emptyMap();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final JavaAnnotationArgument m89517c() {
        return this.f64772d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo88631d() {
        return this.f64769a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.m92484a(this.f64771c, this, f64768f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    /* JADX INFO: renamed from: f */
    public boolean mo89519f() {
        return this.f64773e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        return this.f64770b;
    }
}
