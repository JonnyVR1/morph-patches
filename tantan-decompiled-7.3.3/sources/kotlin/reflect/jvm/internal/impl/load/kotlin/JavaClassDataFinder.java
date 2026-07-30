package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinClassFinder f65717a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeserializedDescriptorResolver f65718b;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        this.f65717a = kotlinClassFinder;
        this.f65718b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassData mo91210a(@NotNull ClassId classId) {
        classId.getClass();
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91258b = KotlinClassFinderKt.m91258b(this.f65717a, classId, this.f65718b.m91198f().m93046g().mo93067f());
        if (kotlinJvmBinaryClassM91258b == null) {
            return null;
        }
        Intrinsics.m88377d(kotlinJvmBinaryClassM91258b.mo89840e(), classId);
        return this.f65718b.m91204l(kotlinJvmBinaryClassM91258b);
    }
}
