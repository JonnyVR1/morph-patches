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
import p153l.c4g0;
import p153l.d4g0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f66591e = {Reflection.m88403i(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f66592a;

    /* JADX INFO: renamed from: b */
    public final boolean f66593b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f66594c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f66595d;

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, boolean z) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.f66592a = classDescriptor;
        this.f66593b = z;
        classDescriptor.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f66594c = storageManager.mo93337e(new c4g0(this));
        this.f66595d = storageManager.mo93337e(new d4g0(this));
    }

    /* JADX INFO: renamed from: j */
    public static final List m92961j(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.m92626g(staticScopeForKotlinEnum.f66592a), DescriptorFactory.m92627h(staticScopeForKotlinEnum.f66592a)});
    }

    /* JADX INFO: renamed from: p */
    public static final List m92962p(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return staticScopeForKotlinEnum.f66593b ? CollectionsKt.listOfNotNull(DescriptorFactory.m92625f(staticScopeForKotlinEnum.f66592a)) : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<PropertyDescriptor> listM92967o = m92967o();
        SmartList smartList = new SmartList();
        for (Object obj : listM92967o) {
            if (Intrinsics.m88377d(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo90533f(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) m92963k(name, lookupLocation);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Void m92963k(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return CollectionsKt.plus((Collection) m92966n(), (Iterable) m92967o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public SmartList<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        List<SimpleFunctionDescriptor> listM92966n = m92966n();
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : listM92966n) {
            if (Intrinsics.m88377d(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    /* JADX INFO: renamed from: n */
    public final List<SimpleFunctionDescriptor> m92966n() {
        return (List) StorageKt.m93375a(this.f66594c, this, f66591e[0]);
    }

    /* JADX INFO: renamed from: o */
    public final List<PropertyDescriptor> m92967o() {
        return (List) StorageKt.m93375a(this.f66595d, this, f66591e[1]);
    }
}
