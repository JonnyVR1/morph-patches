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
    public static final KotlinJvmBinaryClass m91257a(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        javaClass.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result resultMo89844c = kotlinClassFinder.mo89844c(javaClass, metadataVersion);
        if (resultMo89844c != null) {
            return resultMo89844c.m91254a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final KotlinJvmBinaryClass m91258b(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull ClassId classId, @NotNull MetadataVersion metadataVersion) {
        kotlinClassFinder.getClass();
        classId.getClass();
        metadataVersion.getClass();
        KotlinClassFinder.Result resultMo89842a = kotlinClassFinder.mo89842a(classId, metadataVersion);
        if (resultMo89842a != null) {
            return resultMo89842a.m91254a();
        }
        return null;
    }
}
