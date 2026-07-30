package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionSpecificBehaviorKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m90934a(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return (binaryVersion.m90866a() == 1 && binaryVersion.m90867b() >= 4) || binaryVersion.m90866a() > 1;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m90935b(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return m90934a(binaryVersion);
    }
}
