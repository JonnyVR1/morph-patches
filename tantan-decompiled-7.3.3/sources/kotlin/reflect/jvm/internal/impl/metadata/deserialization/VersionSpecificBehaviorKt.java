package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionSpecificBehaviorKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m91825a(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return (binaryVersion.m91757a() == 1 && binaryVersion.m91758b() >= 4) || binaryVersion.m91757a() > 1;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m91826b(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return m91825a(binaryVersion);
    }
}
