package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageViewDescriptorFactory {

    @NotNull
    public static final Companion Companion = Companion.f64920a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64920a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final ModuleCapability<PackageViewDescriptorFactory> f64921b = new ModuleCapability<>("PackageViewDescriptorFactory");

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleCapability<PackageViewDescriptorFactory> m89728a() {
            return f64921b;
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
        public PackageViewDescriptor mo89727a(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
            moduleDescriptorImpl.getClass();
            fqName.getClass();
            storageManager.getClass();
            return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, storageManager);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    PackageViewDescriptor mo89727a(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager);
}
