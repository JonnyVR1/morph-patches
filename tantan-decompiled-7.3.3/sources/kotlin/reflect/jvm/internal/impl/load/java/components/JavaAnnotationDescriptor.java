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
import p153l.xlq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f65442f = {Reflection.m88403i(new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f65443a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SourceElement f65444b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f65445c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final JavaAnnotationArgument f65446d;

    /* JADX INFO: renamed from: e */
    public final boolean f65447e;

    public JavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        SourceElement sourceElementMo89855a;
        Collection<JavaAnnotationArgument> collectionMo89895j;
        lazyJavaResolverContext.getClass();
        fqName.getClass();
        this.f65443a = fqName;
        if (javaAnnotation == null || (sourceElementMo89855a = lazyJavaResolverContext.m90508a().m90492t().mo89855a(javaAnnotation)) == null) {
            sourceElementMo89855a = SourceElement.f64737a;
            sourceElementMo89855a.getClass();
        }
        this.f65444b = sourceElementMo89855a;
        this.f65445c = lazyJavaResolverContext.m90512e().mo93337e(new xlq(lazyJavaResolverContext, this));
        this.f65446d = (javaAnnotation == null || (collectionMo89895j = javaAnnotation.mo89895j()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.firstOrNull(collectionMo89895j);
        boolean z = false;
        if (javaAnnotation != null && javaAnnotation.mo89894f()) {
            z = true;
        }
        this.f65447e = z;
    }

    /* JADX INFO: renamed from: g */
    public static final SimpleType m90407g(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        SimpleType simpleTypeMo89349o = lazyJavaResolverContext.m90511d().mo89437f().m89130p(javaAnnotationDescriptor.mo89522d()).mo89349o();
        simpleTypeMo89349o.getClass();
        return simpleTypeMo89349o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo89521a() {
        return MapsKt.emptyMap();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final JavaAnnotationArgument m90408c() {
        return this.f65446d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo89522d() {
        return this.f65443a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.m93375a(this.f65445c, this, f65442f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    /* JADX INFO: renamed from: f */
    public boolean mo90410f() {
        return this.f65447e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        return this.f65444b;
    }
}
