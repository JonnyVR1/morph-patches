package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T m90895a(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.GeneratedExtension<M, T> generatedExtension) {
        extendableMessage.getClass();
        generatedExtension.getClass();
        if (extendableMessage.hasExtension(generatedExtension)) {
            return (T) extendableMessage.getExtension(generatedExtension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T m90896b(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.GeneratedExtension<M, List<T>> generatedExtension, int i) {
        extendableMessage.getClass();
        generatedExtension.getClass();
        if (i < extendableMessage.getExtensionCount(generatedExtension)) {
            return (T) extendableMessage.getExtension(generatedExtension, i);
        }
        return null;
    }
}
