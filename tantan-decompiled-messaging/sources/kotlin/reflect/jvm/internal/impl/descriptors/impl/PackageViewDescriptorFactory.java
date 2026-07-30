package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageViewDescriptorFactory {

    @NotNull
    public static final Companion Companion = Companion.f64246a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64246a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final ModuleCapability<PackageViewDescriptorFactory> f64247b = new ModuleCapability<>("PackageViewDescriptorFactory");

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleCapability<PackageViewDescriptorFactory> m88837a() {
            return f64247b;
        }
    }

    public static final class Default implements PackageViewDescriptorFactory {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        @NotNull
        /* JADX INFO: renamed from: a */
        public PackageViewDescriptor mo88836a(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
            moduleDescriptorImpl.getClass();
            fqName.getClass();
            storageManager.getClass();
            return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, storageManager);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    PackageViewDescriptor mo88836a(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager);
}
