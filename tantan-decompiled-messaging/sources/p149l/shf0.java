package p149l;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class shf0 extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeAttributes f164561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shf0(@NotNull SimpleType simpleType, @NotNull TypeAttributes typeAttributes) {
        super(simpleType);
        simpleType.getClass();
        typeAttributes.getClass();
        this.f164561c = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return this.f164561c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public shf0 mo89970R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new shf0(simpleType, mo91889F0());
    }
}
