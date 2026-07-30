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
    public final WildcardType f65048b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Collection<JavaAnnotation> f65049c;

    /* JADX INFO: renamed from: d */
    public final boolean f65050d;

    public ReflectJavaWildcardType(@NotNull WildcardType wildcardType) {
        wildcardType.getClass();
        this.f65048b = wildcardType;
        this.f65049c = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType mo89964o() {
        Type[] upperBounds = mo89902I().getUpperBounds();
        Type[] lowerBounds = mo89902I().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo89902I());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.f65042a;
            Object objSingle = ArraysKt.single(lowerBounds);
            objSingle.getClass();
            return factory.m89958a((Type) objSingle);
        }
        if (upperBounds.length == 1) {
            Type type = (Type) ArraysKt.single(upperBounds);
            if (!Intrinsics.m88377d(type, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.f65042a;
                type.getClass();
                return factory2.m89958a(type);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public WildcardType mo89902I() {
        return this.f65048b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f65049c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = mo89902I().getUpperBounds();
        upperBounds.getClass();
        return !Intrinsics.m88377d(ArraysKt.firstOrNull(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return this.f65050d;
    }
}
