package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {

        @NotNull
        public static final ThrowException INSTANCE = new ThrowException();

        private ThrowException() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        @NotNull
        /* JADX INFO: renamed from: a */
        public KotlinType mo91211a(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
            type.getClass();
            str.getClass();
            simpleType.getClass();
            simpleType2.getClass();
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    KotlinType mo91211a(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);
}
