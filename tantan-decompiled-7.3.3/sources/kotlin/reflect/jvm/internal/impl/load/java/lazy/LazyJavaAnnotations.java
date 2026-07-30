package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aar;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65505a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaAnnotationOwner f65506b;

    /* JADX INFO: renamed from: c */
    public final boolean f65507c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f65508d;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner javaAnnotationOwner, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotationOwner.getClass();
        this.f65505a = lazyJavaResolverContext;
        this.f65506b = javaAnnotationOwner;
        this.f65507c = z;
        this.f65508d = lazyJavaResolverContext.m90508a().m90493u().mo93335c(new aar(this));
    }

    /* JADX INFO: renamed from: c */
    public static final AnnotationDescriptor m90502c(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation javaAnnotation) {
        javaAnnotation.getClass();
        return JavaAnnotationMapper.INSTANCE.m90416e(javaAnnotation, lazyJavaAnnotations.f65505a, lazyJavaAnnotations.f65507c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public AnnotationDescriptor mo89529b(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        fqName.getClass();
        JavaAnnotation javaAnnotationMo89898b = this.f65506b.mo89898b(fqName);
        return (javaAnnotationMo89898b == null || (annotationDescriptorInvoke = this.f65508d.invoke(javaAnnotationMo89898b)) == null) ? JavaAnnotationMapper.INSTANCE.m90412a(fqName, this.f65506b, this.f65505a) : annotationDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ boolean mo89530d0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m89535b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f65506b.getAnnotations().isEmpty() && !this.f65506b.mo89905r();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.m94177F(SequencesKt___SequencesKt.m94188Q(SequencesKt___SequencesKt.m94185N(CollectionsKt.asSequence(this.f65506b.getAnnotations()), this.f65508d), JavaAnnotationMapper.INSTANCE.m90412a(StandardNames.FqNames.f64602x, this.f65506b, this.f65505a))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }
}
