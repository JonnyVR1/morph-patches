package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinMetadataFinder {
    @Nullable
    /* JADX INFO: renamed from: b */
    InputStream mo88952b(@NotNull FqName fqName);
}
