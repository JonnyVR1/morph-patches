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
import p153l.wtq0;
import p153l.zh3;

/* JADX INFO: loaded from: classes2.dex */
public interface BuiltInsLoader {

    @NotNull
    public static final Companion Companion = Companion.f64442a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f64442a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Lazy<BuiltInsLoader> f64443b = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, zh3.INSTANCE);

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public static final BuiltInsLoader m89025a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
            serviceLoaderLoad.getClass();
            BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.firstOrNull(serviceLoaderLoad);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            wtq0.m207906a("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final BuiltInsLoader m89027c() {
            return f64443b.getValue();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    PackageFragmentProvider mo89024a(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);
}
