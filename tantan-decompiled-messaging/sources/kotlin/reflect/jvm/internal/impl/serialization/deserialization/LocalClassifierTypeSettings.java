package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface LocalClassifierTypeSettings {

    public static final class Default implements LocalClassifierTypeSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        @Nullable
        /* JADX INFO: renamed from: a */
        public SimpleType mo92199a() {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    SimpleType mo92199a();
}
