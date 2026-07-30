package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicTypesKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m92589a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo92625J0() instanceof DynamicType;
    }
}
