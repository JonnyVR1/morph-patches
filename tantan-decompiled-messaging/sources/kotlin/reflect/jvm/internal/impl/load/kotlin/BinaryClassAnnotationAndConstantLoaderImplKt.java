package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImplKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BinaryClassAnnotationAndConstantLoaderImpl m90191a(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull MetadataVersion metadataVersion) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        storageManager.getClass();
        kotlinClassFinder.getClass();
        metadataVersion.getClass();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.m90177V(metadataVersion);
        return binaryClassAnnotationAndConstantLoaderImpl;
    }
}
