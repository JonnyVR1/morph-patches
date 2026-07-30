package kotlin.reflect.jvm.internal.impl.platform;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class PlatformUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m92018a(@NotNull TargetPlatform targetPlatform) {
        targetPlatform.getClass();
        return CollectionsKt.joinToString$default(targetPlatform.m92022c(), "/", null, null, 0, null, null, 62, null);
    }
}
