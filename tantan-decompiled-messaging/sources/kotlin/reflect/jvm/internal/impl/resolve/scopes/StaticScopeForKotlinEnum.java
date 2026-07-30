package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.tvf0;
import p149l.uvf0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f65917e = {Reflection.m87514i(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f65918a;

    /* JADX INFO: renamed from: b */
    public final boolean f65919b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f65920c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f65921d;

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, boolean z) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.f65918a = classDescriptor;
        this.f65919b = z;
        classDescriptor.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f65920c = storageManager.mo92446e(new tvf0(this));
        this.f65921d = storageManager.mo92446e(new uvf0(this));
    }

    /* JADX INFO: renamed from: j */
    public static final List m92070j(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.m91735g(staticScopeForKotlinEnum.f65918a), DescriptorFactory.m91736h(staticScopeForKotlinEnum.f65918a)});
    }

    /* JADX INFO: renamed from: p */
    public static final List m92071p(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return staticScopeForKotlinEnum.f65919b ? CollectionsKt.listOfNotNull(DescriptorFactory.m91734f(staticScopeForKotlinEnum.f65918a)) : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<PropertyDescriptor> listM92076o = m92076o();
        SmartList smartList = new SmartList();
        for (Object obj : listM92076o) {
            if (Intrinsics.m87488d(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo89642f(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) m92072k(name, lookupLocation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Void m92072k(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return CollectionsKt.plus((Collection) m92075n(), (Iterable) m92076o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public SmartList<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<SimpleFunctionDescriptor> listM92075n = m92075n();
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : listM92075n) {
            if (Intrinsics.m87488d(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    /* JADX INFO: renamed from: n */
    public final List<SimpleFunctionDescriptor> m92075n() {
        return (List) StorageKt.m92484a(this.f65920c, this, f65917e[0]);
    }

    /* JADX INFO: renamed from: o */
    public final List<PropertyDescriptor> m92076o() {
        return (List) StorageKt.m92484a(this.f65921d, this, f65917e[1]);
    }
}
