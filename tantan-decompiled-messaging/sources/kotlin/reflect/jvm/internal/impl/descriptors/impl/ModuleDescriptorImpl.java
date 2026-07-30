package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b0r;
import p149l.g700;
import p149l.h700;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final StorageManager f64225c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KotlinBuiltIns f64226d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final TargetPlatform f64227e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Name f64228f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<ModuleCapability<?>, Object> f64229g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final PackageViewDescriptorFactory f64230h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ModuleDependencies f64231i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PackageFragmentProvider f64232j;

    /* JADX INFO: renamed from: k */
    public boolean f64233k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f64234l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f64235m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> map, @Nullable Name name2) {
        super(Annotations.Companion.m88641b(), name);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
        map.getClass();
        this.f64225c = storageManager;
        this.f64226d = kotlinBuiltIns;
        this.f64227e = targetPlatform;
        this.f64228f = name2;
        if (!name.m91085j()) {
            qhg0.m174539a("Module name must be special: ", name);
            throw null;
        }
        this.f64229g = map;
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) mo88545Q(PackageViewDescriptorFactory.Companion.m88837a());
        this.f64230h = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
        this.f64233k = true;
        this.f64234l = storageManager.mo92450i(new g700(this));
        this.f64235m = LazyKt__LazyJVMKt.m87229b(new h700(this));
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m88816I0() {
        return this.f64232j != null;
    }

    /* JADX INFO: renamed from: K0 */
    public static final CompositePackageFragmentProvider m88817K0(ModuleDescriptorImpl moduleDescriptorImpl) {
        ModuleDependencies moduleDependencies = moduleDescriptorImpl.f64231i;
        if (moduleDependencies == null) {
            b0r.m99785a("Dependencies of module ", moduleDescriptorImpl.m88821E0(), " were not set before querying module content");
            return null;
        }
        List<ModuleDescriptorImpl> listMo88814c = moduleDependencies.mo88814c();
        moduleDescriptorImpl.m88820D0();
        listMo88814c.contains(moduleDescriptorImpl);
        List<ModuleDescriptorImpl> list = listMo88814c;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ModuleDescriptorImpl) it.next()).m88816I0();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).f64232j;
            packageFragmentProvider.getClass();
            arrayList.add(packageFragmentProvider);
        }
        return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
    }

    /* JADX INFO: renamed from: L0 */
    public static final PackageViewDescriptor m88818L0(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName) {
        fqName.getClass();
        return moduleDescriptorImpl.f64230h.mo88836a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f64225c);
    }

    /* JADX INFO: renamed from: D0 */
    public void m88820D0() {
        if (m88825J0()) {
            return;
        }
        InvalidModuleExceptionKt.m88539a(this);
    }

    /* JADX INFO: renamed from: E0 */
    public final String m88821E0() {
        String string = getName().toString();
        string.getClass();
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public final PackageFragmentProvider m88822F0() {
        m88820D0();
        return m88823G0();
    }

    /* JADX INFO: renamed from: G0 */
    public final CompositePackageFragmentProvider m88823G0() {
        return (CompositePackageFragmentProvider) this.f64235m.getValue();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m88824H0(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        m88816I0();
        this.f64232j = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: I */
    public PackageViewDescriptor mo88543I(@NotNull FqName fqName) {
        fqName.getClass();
        m88820D0();
        return this.f64234l.invoke(fqName);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m88825J0() {
        return this.f64233k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: L */
    public List<ModuleDescriptor> mo88544L() {
        ModuleDependencies moduleDependencies = this.f64231i;
        if (moduleDependencies != null) {
            return moduleDependencies.mo88812a();
        }
        b0r.m99785a("Dependencies of module ", m88821E0(), " were not set");
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m88826M0(@NotNull List<ModuleDescriptorImpl> list) {
        list.getClass();
        m88827N0(list, SetsKt.emptySet());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m88827N0(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        list.getClass();
        set.getClass();
        m88828O0(new ModuleDependenciesImpl(list, set, CollectionsKt.emptyList(), SetsKt.emptySet()));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m88828O0(@NotNull ModuleDependencies moduleDependencies) {
        moduleDependencies.getClass();
        this.f64231i = moduleDependencies;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m88829P0(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        moduleDescriptorImplArr.getClass();
        m88826M0(ArraysKt.toList(moduleDescriptorImplArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    /* JADX INFO: renamed from: Q */
    public <T> T mo88545Q(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        T t = (T) this.f64229g.get(moduleCapability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: S */
    public /* bridge */ <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) ModuleDescriptor.DefaultImpls.m88549a(this, declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ DeclarationDescriptor mo88299b() {
        return ModuleDescriptor.DefaultImpls.m88550b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88546f() {
        return this.f64226d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo88547m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        m88820D0();
        return m88822F0().mo88564m(fqName, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!m88825J0()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f64232j;
        sb.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    /* JADX INFO: renamed from: x */
    public boolean mo88548x(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        if (Intrinsics.m87488d(this, moduleDescriptor)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.f64231i;
        moduleDependencies.getClass();
        return CollectionsKt.contains(moduleDependencies.mo88813b(), moduleDescriptor) || mo88544L().contains(moduleDescriptor) || moduleDescriptor.mo88544L().contains(this);
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i & 8) != 0 ? null : targetPlatform, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? null : name2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
    }
}
