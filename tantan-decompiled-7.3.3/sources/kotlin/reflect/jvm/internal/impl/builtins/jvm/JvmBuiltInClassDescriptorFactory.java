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
import p153l.gvq;
import p153l.hvq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Name f64662f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final ClassId f64663g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f64664a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<ModuleDescriptor, DeclarationDescriptor> f64665b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f64666c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f64660d = {Reflection.m88403i(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final FqName f64661e = StandardNames.f64473A;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m89267a() {
            return JvmBuiltInClassDescriptorFactory.f64663g;
        }

        private Companion() {
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f64560c;
        f64662f = fqNameUnsafe.m91956j();
        f64663g = ClassId.Companion.m91936c(fqNameUnsafe.m91959m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        function1.getClass();
        this.f64664a = moduleDescriptor;
        this.f64665b = function1;
        this.f64666c = storageManager.mo93337e(new gvq(this, storageManager));
    }

    /* JADX INFO: renamed from: d */
    public static final BuiltInsPackageFragment m89261d(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        List<PackageFragmentDescriptor> listMo89465H = moduleDescriptor.mo89434I(f64661e).mo89465H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo89465H) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final ClassDescriptorImpl m89265h(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f64665b.invoke(jvmBuiltInClassDescriptorFactory.f64664a), f64662f, Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(jvmBuiltInClassDescriptorFactory.f64664a.mo89437f().m89123i()), SourceElement.f64737a, false, storageManager);
        classDescriptorImpl.m89596D0(new CloneableClassScope(storageManager, classDescriptorImpl), SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* JADX INFO: renamed from: a */
    public boolean mo89172a(@NotNull FqName fqName, @NotNull Name name) {
        fqName.getClass();
        name.getClass();
        return Intrinsics.m88377d(name, f64662f) && Intrinsics.m88377d(fqName, f64661e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* JADX INFO: renamed from: b */
    public ClassDescriptor mo89173b(@NotNull ClassId classId) {
        classId.getClass();
        if (Intrinsics.m88377d(classId, f64663g)) {
            return m89266i();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<ClassDescriptor> mo89174c(@NotNull FqName fqName) {
        fqName.getClass();
        return Intrinsics.m88377d(fqName, f64661e) ? SetsKt.setOf(m89266i()) : SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: i */
    public final ClassDescriptorImpl m89266i() {
        return (ClassDescriptorImpl) StorageKt.m93375a(this.f64666c, this, f64660d[0]);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? hvq.INSTANCE : function1);
    }
}
