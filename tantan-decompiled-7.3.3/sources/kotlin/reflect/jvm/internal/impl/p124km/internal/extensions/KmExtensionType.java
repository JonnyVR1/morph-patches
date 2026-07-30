package kotlin.reflect.jvm.internal.impl.p124km.internal.extensions;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmExtensionType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KClass<? extends KmExtension> f65282a;

    public KmExtensionType(@NotNull KClass<? extends KmExtension> kClass) {
        kClass.getClass();
        this.f65282a = kClass;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KmExtensionType) && Intrinsics.m88377d(this.f65282a, ((KmExtensionType) obj).f65282a);
    }

    public int hashCode() {
        return this.f65282a.hashCode();
    }

    @NotNull
    public String toString() {
        return JvmClassMappingKt.m88341b(this.f65282a).getName();
    }
}
