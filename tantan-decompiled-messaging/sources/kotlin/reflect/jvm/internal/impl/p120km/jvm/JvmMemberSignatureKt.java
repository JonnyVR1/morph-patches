package kotlin.reflect.jvm.internal.impl.p120km.jvm;

import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmMemberSignatureKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JvmFieldSignature m89286a(@NotNull JvmMemberSignature.Field field) {
        field.getClass();
        return new JvmFieldSignature(field.m91012e(), field.m91011d());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JvmMethodSignature m89287b(@NotNull JvmMemberSignature.Method method) {
        method.getClass();
        return new JvmMethodSignature(method.m91016e(), method.m91015d());
    }
}
