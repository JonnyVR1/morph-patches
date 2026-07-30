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
import p153l.c2r;
import p153l.pf00;
import p153l.qf00;
import p153l.ypg0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final StorageManager f64899c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KotlinBuiltIns f64900d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final TargetPlatform f64901e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Name f64902f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<ModuleCapability<?>, Object> f64903g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final PackageViewDescriptorFactory f64904h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ModuleDependencies f64905i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PackageFragmentProvider f64906j;

    /* JADX INFO: renamed from: k */
    public boolean f64907k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f64908l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f64909m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> map, @Nullable Name name2) {
        super(Annotations.Companion.m89532b(), name);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
        map.getClass();
        this.f64899c = storageManager;
        this.f64900d = kotlinBuiltIns;
        this.f64901e = targetPlatform;
        this.f64902f = name2;
        if (!name.m91976j()) {
            ypg0.m217021a("Module name must be special: ", name);
            throw null;
        }
        this.f64903g = map;
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) mo89436Q(PackageViewDescriptorFactory.Companion.m89728a());
        this.f64904h = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
        this.f64907k = true;
        this.f64908l = storageManager.mo93341i(new pf00(this));
        this.f64909m = LazyKt__LazyJVMKt.m88118b(new qf00(this));
    }

    /* JADX INFO: renamed from: I0 */
    private final boolean m89707I0() {
        return this.f64906j != null;
    }

    /* JADX INFO: renamed from: K0 */
    public static final CompositePackageFragmentProvider m89708K0(ModuleDescriptorImpl moduleDescriptorImpl) {
        ModuleDependencies moduleDependencies = moduleDescriptorImpl.f64905i;
        if (moduleDependencies == null) {
            c2r.m107723a("Dependencies of module ", moduleDescriptorImpl.m89712E0(), " were not set before querying module content");
            return null;
        }
        List<ModuleDescriptorImpl> listMo89705c = moduleDependencies.mo89705c();
        moduleDescriptorImpl.m89711D0();
        listMo89705c.contains(moduleDescriptorImpl);
        List<ModuleDescriptorImpl> list = listMo89705c;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ModuleDescriptorImpl) it.next()).m89707I0();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).f64906j;
            packageFragmentProvider.getClass();
            arrayList.add(packageFragmentProvider);
        }
        return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
    }

    /* JADX INFO: renamed from: L0 */
    public static final PackageViewDescriptor m89709L0(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName) {
        fqName.getClass();
        return moduleDescriptorImpl.f64904h.mo89727a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f64899c);
    }

    /* JADX INFO: renamed from: D0 */
    public void m89711D0() {
        if (m89716J0()) {
            return;
        }
        InvalidModuleExceptionKt.m89430a(this);
    }

    /* JADX INFO: renamed from: E0 */
    public final String m89712E0() {
        String string = getName().toString();
        string.getClass();
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: F0 */
    public final PackageFragmentProvider m89713F0() {
        m89711D0();
        return m89714G0();
    }

    /* JADX INFO: renamed from: G0 */
    public final CompositePackageFragmentProvider m89714G0() {
        return (CompositePackageFragmentProvider) this.f64909m.getValue();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m89715H0(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        m89707I0();
        this.f64906j = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: I */
    public PackageViewDescriptor mo89434I(@NotNull FqName fqName) {
        fqName.getClass();
        m89711D0();
        return this.f64908l.invoke(fqName);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m89716J0() {
        return this.f64907k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: L */
    public List<ModuleDescriptor> mo89435L() {
        ModuleDependencies moduleDependencies = this.f64905i;
        if (moduleDependencies != null) {
            return moduleDependencies.mo89703a();
        }
        c2r.m107723a("Dependencies of module ", m89712E0(), " were not set");
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m89717M0(@NotNull List<ModuleDescriptorImpl> list) {
        list.getClass();
        m89718N0(list, SetsKt.emptySet());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m89718N0(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        list.getClass();
        set.getClass();
        m89719O0(new ModuleDependenciesImpl(list, set, CollectionsKt.emptyList(), SetsKt.emptySet()));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m89719O0(@NotNull ModuleDependencies moduleDependencies) {
        moduleDependencies.getClass();
        this.f64905i = moduleDependencies;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m89720P0(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        moduleDescriptorImplArr.getClass();
        m89717M0(ArraysKt.toList(moduleDescriptorImplArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    /* JADX INFO: renamed from: Q */
    public <T> T mo89436Q(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        T t = (T) this.f64903g.get(moduleCapability);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: S */
    public /* bridge */ <R, D> R mo89355S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) ModuleDescriptor.DefaultImpls.m89440a(this, declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: b */
    public /* bridge */ DeclarationDescriptor mo89190b() {
        return ModuleDescriptor.DefaultImpls.m89441b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89437f() {
        return this.f64900d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo89438m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        m89711D0();
        return m89713F0().mo89455m(fqName, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!m89716J0()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f64906j;
        sb.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    /* JADX INFO: renamed from: x */
    public boolean mo89439x(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        if (Intrinsics.m88377d(this, moduleDescriptor)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.f64905i;
        moduleDependencies.getClass();
        return CollectionsKt.contains(moduleDependencies.mo89704b(), moduleDescriptor) || mo89435L().contains(moduleDescriptor) || moduleDescriptor.mo89435L().contains(this);
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
