package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Class<?> f64364b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Collection<JavaAnnotation> f64365c;

    /* JADX INFO: renamed from: d */
    public final boolean f64366d;

    public ReflectJavaPrimitiveType(@NotNull Class<?> cls) {
        cls.getClass();
        this.f64364b = cls;
        this.f64365c = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Class<?> mo89011I() {
        return this.f64364b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f64365c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        if (Intrinsics.m87488d(mo89011I(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(mo89011I().getName()).getPrimitiveType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89014r() {
        return this.f64366d;
    }
}
