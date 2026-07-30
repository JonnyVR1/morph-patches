package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.JvmStatic;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtil {

    @NotNull
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m88460a(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return ConstUtilKt.m88461a(kotlinType);
    }
}
