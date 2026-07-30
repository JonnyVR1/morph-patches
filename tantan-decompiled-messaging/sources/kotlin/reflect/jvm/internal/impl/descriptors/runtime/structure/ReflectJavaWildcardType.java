package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final WildcardType f64374b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Collection<JavaAnnotation> f64375c;

    /* JADX INFO: renamed from: d */
    public final boolean f64376d;

    public ReflectJavaWildcardType(@NotNull WildcardType wildcardType) {
        wildcardType.getClass();
        this.f64374b = wildcardType;
        this.f64375c = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType mo89073o() {
        Type[] upperBounds = mo89011I().getUpperBounds();
        Type[] lowerBounds = mo89011I().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo89011I());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.f64368a;
            Object objSingle = ArraysKt.single(lowerBounds);
            objSingle.getClass();
            return factory.m89067a((Type) objSingle);
        }
        if (upperBounds.length == 1) {
            Type type = (Type) ArraysKt.single(upperBounds);
            if (!Intrinsics.m87488d(type, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.f64368a;
                type.getClass();
                return factory2.m89067a(type);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public WildcardType mo89011I() {
        return this.f64374b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f64375c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = mo89011I().getUpperBounds();
        upperBounds.getClass();
        return !Intrinsics.m87488d(ArraysKt.firstOrNull(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89014r() {
        return this.f64376d;
    }
}
