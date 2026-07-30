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
    public final Class<?> f65038b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Collection<JavaAnnotation> f65039c;

    /* JADX INFO: renamed from: d */
    public final boolean f65040d;

    public ReflectJavaPrimitiveType(@NotNull Class<?> cls) {
        cls.getClass();
        this.f65038b = cls;
        this.f65039c = CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Class<?> mo89902I() {
        return this.f65038b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f65039c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        if (Intrinsics.m88377d(mo89902I(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(mo89902I().getName()).getPrimitiveType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return this.f65040d;
    }
}
