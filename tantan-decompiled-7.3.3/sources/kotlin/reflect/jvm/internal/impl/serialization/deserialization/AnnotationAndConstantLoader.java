package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    @Nullable
    /* JADX INFO: renamed from: e */
    C mo91023e(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType);

    @Nullable
    /* JADX INFO: renamed from: k */
    C mo91024k(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType);
}
