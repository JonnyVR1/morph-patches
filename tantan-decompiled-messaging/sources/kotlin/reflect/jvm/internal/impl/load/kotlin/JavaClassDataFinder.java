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
    public final KotlinClassFinder f65043a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeserializedDescriptorResolver f65044b;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        kotlinClassFinder.getClass();
        deserializedDescriptorResolver.getClass();
        this.f65043a = kotlinClassFinder;
        this.f65044b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public ClassData mo90319a(@NotNull ClassId classId) {
        classId.getClass();
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90367b = KotlinClassFinderKt.m90367b(this.f65043a, classId, this.f65044b.m90307f().m92155g().mo92176f());
        if (kotlinJvmBinaryClassM90367b == null) {
            return null;
        }
        Intrinsics.m87488d(kotlinJvmBinaryClassM90367b.mo88949e(), classId);
        return this.f65044b.m90313l(kotlinJvmBinaryClassM90367b);
    }
}
