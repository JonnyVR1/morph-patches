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
import p153l.qbr;
import p153l.rbr;
import p153l.sbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f64881h = {Reflection.m88403i(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptorImpl f64882c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final FqName f64883d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NotNullLazyValue f64884e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final NotNullLazyValue f64885f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final MemberScope f64886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
        super(Annotations.Companion.m89532b(), fqName.m91943g());
        moduleDescriptorImpl.getClass();
        fqName.getClass();
        storageManager.getClass();
        this.f64882c = moduleDescriptorImpl;
        this.f64883d = fqName;
        this.f64884e = storageManager.mo93337e(new qbr(this));
        this.f64885f = storageManager.mo93337e(new rbr(this));
        this.f64886g = new LazyScopeAdapter(storageManager, new sbr(this));
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m89685E0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.m89463b(lazyPackageViewDescriptorImpl.mo89468z0().m89713F0(), lazyPackageViewDescriptorImpl.mo89466d());
    }

    /* JADX INFO: renamed from: F0 */
    public static final List m89686F0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.m89464c(lazyPackageViewDescriptorImpl.mo89468z0().m89713F0(), lazyPackageViewDescriptorImpl.mo89466d());
    }

    /* JADX INFO: renamed from: J0 */
    public static final MemberScope m89687J0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.Empty.INSTANCE;
        }
        List<PackageFragmentDescriptor> listMo89465H = lazyPackageViewDescriptorImpl.mo89465H();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo89465H, 10));
        Iterator<T> it = listMo89465H.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).mo89316n());
        }
        List listPlus = CollectionsKt.plus((Collection<? extends SubpackagesScope>) arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.mo89468z0(), lazyPackageViewDescriptorImpl.mo89466d()));
        return ChainedMemberScope.Companion.m92917a("package view scope for " + lazyPackageViewDescriptorImpl.mo89466d() + " in " + lazyPackageViewDescriptorImpl.mo89468z0().getName(), listPlus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public PackageViewDescriptor mo89190b() {
        if (mo89466d().m91939c()) {
            return null;
        }
        return mo89468z0().mo89434I(mo89466d().m91940d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: H */
    public List<PackageFragmentDescriptor> mo89465H() {
        return (List) StorageKt.m93375a(this.f64884e, this, f64881h[0]);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m89690H0() {
        return ((Boolean) StorageKt.m93375a(this.f64885f, this, f64881h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ModuleDescriptorImpl mo89468z0() {
        return this.f64882c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo89357b(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo89466d() {
        return this.f64883d;
    }

    public boolean equals(@Nullable Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.m88377d(mo89466d(), packageViewDescriptor.mo89466d()) && Intrinsics.m88377d(mo89468z0(), packageViewDescriptor.mo89468z0());
    }

    public int hashCode() {
        return (mo89468z0().hashCode() * 31) + mo89466d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return m89690H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89467n() {
        return this.f64886g;
    }
}
