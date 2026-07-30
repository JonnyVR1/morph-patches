package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gig0;
import p153l.ivq;
import p153l.jvq;
import p153l.kvq;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f64667k = {Reflection.m88403i(new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Kind f64668h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Settings> f64669i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f64670j;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
    }

    public static final class Settings {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ModuleDescriptor f64671a;

        /* JADX INFO: renamed from: b */
        public final boolean f64672b;

        public Settings(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
            moduleDescriptor.getClass();
            this.f64671a = moduleDescriptor;
            this.f64672b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleDescriptor m89278a() {
            return this.f64671a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m89279b() {
            return this.f64672b;
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64673a;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64673a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@NotNull StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        storageManager.getClass();
        kind.getClass();
        this.f64668h = kind;
        this.f64670j = storageManager.mo93337e(new ivq(this, storageManager));
        int i = WhenMappings.f64673a[kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m89120f(false);
            } else if (i == 3) {
                m89120f(true);
            } else {
                nbr.m162172a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final JvmBuiltInsCustomizer m89271J0(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl moduleDescriptorImplM89133s = jvmBuiltIns.m89133s();
        moduleDescriptorImplM89133s.getClass();
        return new JvmBuiltInsCustomizer(moduleDescriptorImplM89133s, storageManager, new kvq(jvmBuiltIns));
    }

    /* JADX INFO: renamed from: K0 */
    public static final Settings m89272K0(JvmBuiltIns jvmBuiltIns) {
        Function0<Settings> function0 = jvmBuiltIns.f64669i;
        if (function0 == null) {
            gig0.m130323a("JvmBuiltins instance has not been initialized properly");
            return null;
        }
        Settings settingsInvoke = function0.invoke();
        jvmBuiltIns.f64669i = null;
        return settingsInvoke;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Settings m89273O0(ModuleDescriptor moduleDescriptor, boolean z) {
        return new Settings(moduleDescriptor, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List<ClassDescriptorFactory> mo89137w() {
        Iterable<ClassDescriptorFactory> iterableMo89137w = super.mo89137w();
        iterableMo89137w.getClass();
        StorageManager storageManagerM89114V = m89114V();
        storageManagerM89114V.getClass();
        ModuleDescriptorImpl moduleDescriptorImplM89133s = m89133s();
        moduleDescriptorImplM89133s.getClass();
        return CollectionsKt.plus(iterableMo89137w, new JvmBuiltInClassDescriptorFactory(storageManagerM89114V, moduleDescriptorImplM89133s, null, 4, null));
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final JvmBuiltInsCustomizer m89275M0() {
        return (JvmBuiltInsCustomizer) StorageKt.m93375a(this.f64670j, this, f64667k[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: N */
    public PlatformDependentDeclarationFilter mo89109N() {
        return m89275M0();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m89276N0(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
        moduleDescriptor.getClass();
        m89277P0(new jvq(moduleDescriptor, z));
    }

    /* JADX INFO: renamed from: P0 */
    public final void m89277P0(@NotNull Function0<Settings> function0) {
        function0.getClass();
        this.f64669i = function0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: g */
    public AdditionalClassPartsProvider mo89121g() {
        return m89275M0();
    }
}
