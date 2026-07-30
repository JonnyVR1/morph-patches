package kotlin.reflect.jvm.internal.impl.p124km.jvm;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmMemberSignatureKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JvmFieldSignature m90177a(@NotNull JvmMemberSignature.Field field) {
        field.getClass();
        return new JvmFieldSignature(field.m91903e(), field.m91902d());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JvmMethodSignature m90178b(@NotNull JvmMemberSignature.Method method) {
        method.getClass();
        return new JvmMethodSignature(method.m91907e(), method.m91906d());
    }
}
