package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassFinderKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final KotlinJvmBinaryClass m90366a(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        javaClass.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result resultMo88953c = kotlinClassFinder.mo88953c(javaClass, metadataVersion);
        if (resultMo88953c != null) {
            return resultMo88953c.m90363a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final KotlinJvmBinaryClass m90367b(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull ClassId classId, @NotNull MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        classId.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result resultMo88951a = kotlinClassFinder.mo88951a(classId, metadataVersion);
        if (resultMo88951a != null) {
            return resultMo88951a.m90363a();
        }
        return null;
    }
}
