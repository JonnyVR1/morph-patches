package kotlin.reflect.jvm.internal.impl.p120km.internal.extensions;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmExtensionType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KClass<? extends KmExtension> f64608a;

    public KmExtensionType(@NotNull KClass<? extends KmExtension> kClass) {
        kClass.getClass();
        this.f64608a = kClass;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KmExtensionType) && Intrinsics.m87488d(this.f64608a, ((KmExtensionType) obj).f64608a);
    }

    public int hashCode() {
        return this.f64608a.hashCode();
    }

    @NotNull
    public String toString() {
        return JvmClassMappingKt.m87452b(this.f64608a).getName();
    }
}
