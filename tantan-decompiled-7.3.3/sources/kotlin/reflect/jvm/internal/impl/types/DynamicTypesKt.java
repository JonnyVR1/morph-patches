package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicTypesKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m93480a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.mo93516J0() instanceof DynamicType;
    }
}
