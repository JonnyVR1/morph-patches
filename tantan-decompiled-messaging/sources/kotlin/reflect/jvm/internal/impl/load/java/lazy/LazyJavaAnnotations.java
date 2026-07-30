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
import p149l.y7r;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64831a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaAnnotationOwner f64832b;

    /* JADX INFO: renamed from: c */
    public final boolean f64833c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f64834d;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner javaAnnotationOwner, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotationOwner.getClass();
        this.f64831a = lazyJavaResolverContext;
        this.f64832b = javaAnnotationOwner;
        this.f64833c = z;
        this.f64834d = lazyJavaResolverContext.m89617a().m89602u().mo92444c(new y7r(this));
    }

    /* JADX INFO: renamed from: c */
    public static final AnnotationDescriptor m89611c(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation javaAnnotation) {
        javaAnnotation.getClass();
        return JavaAnnotationMapper.INSTANCE.m89525e(javaAnnotation, lazyJavaAnnotations.f64831a, lazyJavaAnnotations.f64833c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: b */
    public AnnotationDescriptor mo88638b(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        fqName.getClass();
        JavaAnnotation javaAnnotationMo89007b = this.f64832b.mo89007b(fqName);
        return (javaAnnotationMo89007b == null || (annotationDescriptorInvoke = this.f64834d.invoke(javaAnnotationMo89007b)) == null) ? JavaAnnotationMapper.INSTANCE.m89521a(fqName, this.f64832b, this.f64831a) : annotationDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ boolean mo88639c0(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.m88644b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f64832b.getAnnotations().isEmpty() && !this.f64832b.mo89014r();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.m93286F(SequencesKt___SequencesKt.m93297Q(SequencesKt___SequencesKt.m93294N(CollectionsKt.asSequence(this.f64832b.getAnnotations()), this.f64834d), JavaAnnotationMapper.INSTANCE.m89521a(StandardNames.FqNames.f63928x, this.f64832b, this.f64831a))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }
}
