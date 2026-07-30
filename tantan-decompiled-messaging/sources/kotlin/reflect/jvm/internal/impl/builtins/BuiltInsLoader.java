package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import p149l.lh3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public interface BuiltInsLoader {

    @NotNull
    public static final Companion Companion = Companion.f63768a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f63768a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Lazy<BuiltInsLoader> f63769b = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, lh3.INSTANCE);

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static final BuiltInsLoader m88134a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
            serviceLoaderLoad.getClass();
            BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.firstOrNull(serviceLoaderLoad);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            qkq0.m175383a("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final BuiltInsLoader m88136c() {
            return f63769b.getValue();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    PackageFragmentProvider mo88133a(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);
}
