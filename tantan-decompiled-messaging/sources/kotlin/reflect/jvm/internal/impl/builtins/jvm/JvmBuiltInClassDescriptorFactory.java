package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ftq;
import p149l.gtq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Name f63988f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final ClassId f63989g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f63990a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<ModuleDescriptor, DeclarationDescriptor> f63991b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f63992c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f63986d = {Reflection.m87514i(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final FqName f63987e = StandardNames.f63799A;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m88376a() {
            return JvmBuiltInClassDescriptorFactory.f63989g;
        }

        private Companion() {
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f63886c;
        f63988f = fqNameUnsafe.m91065j();
        f63989g = ClassId.Companion.m91045c(fqNameUnsafe.m91068m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        function1.getClass();
        this.f63990a = moduleDescriptor;
        this.f63991b = function1;
        this.f63992c = storageManager.mo92446e(new ftq(this, storageManager));
    }

    /* JADX INFO: renamed from: d */
    public static final BuiltInsPackageFragment m88370d(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        List<PackageFragmentDescriptor> listMo88574H = moduleDescriptor.mo88543I(f63987e).mo88574H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo88574H) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final ClassDescriptorImpl m88374h(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f63991b.invoke(jvmBuiltInClassDescriptorFactory.f63990a), f63988f, Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(jvmBuiltInClassDescriptorFactory.f63990a.mo88546f().m88232i()), SourceElement.f64063a, false, storageManager);
        classDescriptorImpl.m88705D0(new CloneableClassScope(storageManager, classDescriptorImpl), SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* JADX INFO: renamed from: a */
    public boolean mo88281a(@NotNull FqName fqName, @NotNull Name name) {
        fqName.getClass();
        name.getClass();
        return Intrinsics.m87488d(name, f63988f) && Intrinsics.m87488d(fqName, f63987e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* JADX INFO: renamed from: b */
    public ClassDescriptor mo88282b(@NotNull ClassId classId) {
        classId.getClass();
        if (Intrinsics.m87488d(classId, f63989g)) {
            return m88375i();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<ClassDescriptor> mo88283c(@NotNull FqName fqName) {
        fqName.getClass();
        return Intrinsics.m87488d(fqName, f63987e) ? SetsKt.setOf(m88375i()) : SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: i */
    public final ClassDescriptorImpl m88375i() {
        return (ClassDescriptorImpl) StorageKt.m92484a(this.f63992c, this, f63986d[0]);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? gtq.INSTANCE : function1);
    }
}
