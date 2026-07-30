package p153l;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class mx40 extends DelegatingSimpleTypeImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx40(@NotNull SimpleType simpleType) {
        super(simpleType);
        simpleType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public mx40 mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new mx40(simpleType);
    }
}
