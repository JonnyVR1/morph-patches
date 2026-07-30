package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtilKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m89352a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return ((KotlinBuiltIns.m89089t0(kotlinType) || UnsignedTypes.m89168d(kotlinType)) && !TypeUtils.m93692l(kotlinType)) || KotlinBuiltIns.m89092w0(kotlinType);
    }
}
