package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.o9r;
import p149l.p9r;
import p149l.q9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f64207h = {Reflection.m87514i(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptorImpl f64208c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final FqName f64209d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NotNullLazyValue f64210e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final NotNullLazyValue f64211f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final MemberScope f64212g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
        super(Annotations.Companion.m88641b(), fqName.m91052g());
        moduleDescriptorImpl.getClass();
        fqName.getClass();
        storageManager.getClass();
        this.f64208c = moduleDescriptorImpl;
        this.f64209d = fqName;
        this.f64210e = storageManager.mo92446e(new o9r(this));
        this.f64211f = storageManager.mo92446e(new p9r(this));
        this.f64212g = new LazyScopeAdapter(storageManager, new q9r(this));
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m88794E0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.m88572b(lazyPackageViewDescriptorImpl.mo88577z0().m88822F0(), lazyPackageViewDescriptorImpl.mo88575d());
    }

    /* JADX INFO: renamed from: F0 */
    public static final List m88795F0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.m88573c(lazyPackageViewDescriptorImpl.mo88577z0().m88822F0(), lazyPackageViewDescriptorImpl.mo88575d());
    }

    /* JADX INFO: renamed from: J0 */
    public static final MemberScope m88796J0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.Empty.INSTANCE;
        }
        List<PackageFragmentDescriptor> listMo88574H = lazyPackageViewDescriptorImpl.mo88574H();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo88574H, 10));
        Iterator<T> it = listMo88574H.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).mo88425n());
        }
        List listPlus = CollectionsKt.plus((Collection<? extends SubpackagesScope>) arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.mo88577z0(), lazyPackageViewDescriptorImpl.mo88575d()));
        return ChainedMemberScope.Companion.m92026a("package view scope for " + lazyPackageViewDescriptorImpl.mo88575d() + " in " + lazyPackageViewDescriptorImpl.mo88577z0().getName(), listPlus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public PackageViewDescriptor mo88299b() {
        if (mo88575d().m91048c()) {
            return null;
        }
        return mo88577z0().mo88543I(mo88575d().m91049d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: H */
    public List<PackageFragmentDescriptor> mo88574H() {
        return (List) StorageKt.m92484a(this.f64210e, this, f64207h[0]);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m88799H0() {
        return ((Boolean) StorageKt.m92484a(this.f64211f, this, f64207h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ModuleDescriptorImpl mo88577z0() {
        return this.f64208c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo88466b(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo88575d() {
        return this.f64209d;
    }

    public boolean equals(@Nullable Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.m87488d(mo88575d(), packageViewDescriptor.mo88575d()) && Intrinsics.m87488d(mo88577z0(), packageViewDescriptor.mo88577z0());
    }

    public int hashCode() {
        return (mo88577z0().hashCode() * 31) + mo88575d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return m88799H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo88576n() {
        return this.f64212g;
    }
}
