package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtilKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m88461a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return ((KotlinBuiltIns.m88198t0(kotlinType) || UnsignedTypes.m88277d(kotlinType)) && !TypeUtils.m92801l(kotlinType)) || KotlinBuiltIns.m88201w0(kotlinType);
    }
}
