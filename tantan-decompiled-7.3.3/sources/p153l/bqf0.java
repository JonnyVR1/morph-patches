package p153l;

import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class bqf0 extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeAttributes f77896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqf0(@NotNull SimpleType simpleType, @NotNull TypeAttributes typeAttributes) {
        super(simpleType);
        simpleType.getClass();
        typeAttributes.getClass();
        this.f77896c = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return this.f77896c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public bqf0 mo90861R0(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new bqf0(simpleType, mo92780F0());
    }
}
