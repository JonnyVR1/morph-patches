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
import p149l.htq;
import p149l.itq;
import p149l.jtq;
import p149l.l9r;
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f63993k = {Reflection.m87514i(new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Kind f63994h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Settings> f63995i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f63996j;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    }

    public static final class Settings {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ModuleDescriptor f63997a;

        /* JADX INFO: renamed from: b */
        public final boolean f63998b;

        public Settings(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
            moduleDescriptor.getClass();
            this.f63997a = moduleDescriptor;
            this.f63998b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ModuleDescriptor m88387a() {
            return this.f63997a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m88388b() {
            return this.f63998b;
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63999a;

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
            f63999a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@NotNull StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        storageManager.getClass();
        kind.getClass();
        this.f63994h = kind;
        this.f63996j = storageManager.mo92446e(new htq(this, storageManager));
        int i = WhenMappings.f63999a[kind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m88229f(false);
            } else if (i == 3) {
                m88229f(true);
            } else {
                l9r.m149037a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final JvmBuiltInsCustomizer m88380J0(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl moduleDescriptorImplM88242s = jvmBuiltIns.m88242s();
        moduleDescriptorImplM88242s.getClass();
        return new JvmBuiltInsCustomizer(moduleDescriptorImplM88242s, storageManager, new jtq(jvmBuiltIns));
    }

    /* JADX INFO: renamed from: K0 */
    public static final Settings m88381K0(JvmBuiltIns jvmBuiltIns) {
        Function0<Settings> function0 = jvmBuiltIns.f63995i;
        if (function0 == null) {
            y9g0.m213537a("JvmBuiltins instance has not been initialized properly");
            return null;
        }
        Settings settingsInvoke = function0.invoke();
        jvmBuiltIns.f63995i = null;
        return settingsInvoke;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Settings m88382O0(ModuleDescriptor moduleDescriptor, boolean z) {
        return new Settings(moduleDescriptor, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List<ClassDescriptorFactory> mo88246w() {
        Iterable<ClassDescriptorFactory> iterableMo88246w = super.mo88246w();
        iterableMo88246w.getClass();
        StorageManager storageManagerM88223V = m88223V();
        storageManagerM88223V.getClass();
        ModuleDescriptorImpl moduleDescriptorImplM88242s = m88242s();
        moduleDescriptorImplM88242s.getClass();
        return CollectionsKt.plus(iterableMo88246w, new JvmBuiltInClassDescriptorFactory(storageManagerM88223V, moduleDescriptorImplM88242s, null, 4, null));
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final JvmBuiltInsCustomizer m88384M0() {
        return (JvmBuiltInsCustomizer) StorageKt.m92484a(this.f63996j, this, f63993k[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: N */
    public PlatformDependentDeclarationFilter mo88218N() {
        return m88384M0();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m88385N0(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
        moduleDescriptor.getClass();
        m88386P0(new itq(moduleDescriptor, z));
    }

    /* JADX INFO: renamed from: P0 */
    public final void m88386P0(@NotNull Function0<Settings> function0) {
        function0.getClass();
        this.f63995i = function0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* JADX INFO: renamed from: g */
    public AdditionalClassPartsProvider mo88230g() {
        return m88384M0();
    }
}
