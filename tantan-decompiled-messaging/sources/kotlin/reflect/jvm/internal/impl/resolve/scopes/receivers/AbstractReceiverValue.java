package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* JADX INFO: renamed from: a */
    public final KotlinType f65929a;

    /* JADX INFO: renamed from: b */
    public final ReceiverValue f65930b;

    public AbstractReceiverValue(@NotNull KotlinType kotlinType, @Nullable ReceiverValue receiverValue) {
        if (kotlinType == null) {
            m92092c(0);
        }
        this.f65929a = kotlinType;
        this.f65930b = receiverValue == null ? this : receiverValue;
    }

    /* JADX INFO: renamed from: c */
    private static /* synthetic */ void m92092c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f65929a;
        if (kotlinType == null) {
            m92092c(1);
        }
        return kotlinType;
    }
}
