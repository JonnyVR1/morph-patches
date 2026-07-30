package p149l;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class yo40 extends DelegatingSimpleTypeImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo40(@NotNull SimpleType simpleType) {
        super(simpleType);
        simpleType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public yo40 mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new yo40(simpleType);
    }
}
