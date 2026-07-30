package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface EnumEntriesDeserializationSupport {

    public static final class Default implements EnumEntriesDeserializationSupport {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
        @Nullable
        /* JADX INFO: renamed from: a */
        public Boolean mo93088a() {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Boolean mo93088a();
}
