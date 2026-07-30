package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import p149l.f1k;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f65908c = {Reflection.m87514i(new PropertyReference1Impl(GivenFunctionsMemberScope.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f65909a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NotNullLazyValue f65910b;

    public GivenFunctionsMemberScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        storageManager.getClass();
        classDescriptor.getClass();
        this.f65909a = classDescriptor;
        this.f65910b = storageManager.mo92446e(new f1k(this));
    }

    /* JADX INFO: renamed from: i */
    public static final List m92056i(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        List<FunctionDescriptor> listMo87813j = givenFunctionsMemberScope.mo87813j();
        return CollectionsKt.plus((Collection) listMo87813j, (Iterable) givenFunctionsMemberScope.m92057k(listMo87813j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        List listEmptyList;
        name.getClass();
        lookupLocation.getClass();
        List<DeclarationDescriptor> listM92058l = m92058l();
        if (listM92058l.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : listM92058l) {
                if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.m87488d(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            listEmptyList = smartList;
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        List listEmptyList;
        name.getClass();
        lookupLocation.getClass();
        List<DeclarationDescriptor> listM92058l = m92058l();
        if (listM92058l.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : listM92058l) {
                if ((obj instanceof PropertyDescriptor) && Intrinsics.m87488d(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            listEmptyList = smartList;
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return !descriptorKindFilter.m92039a(DescriptorKindFilter.f65893o.m92041m()) ? CollectionsKt.emptyList() : m92058l();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract List<FunctionDescriptor> mo87813j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final List<DeclarationDescriptor> m92057k(List<? extends FunctionDescriptor> list) {
        Collection<? extends CallableMemberDescriptor> collectionEmptyList;
        final ArrayList arrayList = new ArrayList(3);
        Collection<KotlinType> collectionMo88678c = this.f65909a.mo88305l().mo88678c();
        collectionMo88678c.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionMo88678c.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ResolutionScope.DefaultImpls.m92067a(((KotlinType) it.next()).mo89900n(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            Name name = ((CallableMemberDescriptor) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Name name2 = (Name) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof FunctionDescriptor);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f65815f;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionEmptyList = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (Intrinsics.m87488d(((FunctionDescriptor) obj4).getName(), name2)) {
                            collectionEmptyList.add(obj4);
                        }
                    }
                } else {
                    collectionEmptyList = CollectionsKt.emptyList();
                }
                overridingUtil.m91841v(name2, list4, collectionEmptyList, this.f65909a, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    /* JADX INFO: renamed from: a */
                    public void mo88734a(CallableMemberDescriptor callableMemberDescriptor) {
                        callableMemberDescriptor.getClass();
                        OverridingUtil.m91811K(callableMemberDescriptor, null);
                        arrayList.add(callableMemberDescriptor);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    /* JADX INFO: renamed from: e */
                    public void mo88735e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                        callableMemberDescriptor.getClass();
                        callableMemberDescriptor2.getClass();
                        throw new IllegalStateException(("Conflict in scope of " + this.m92059m() + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
                    }
                });
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final List<DeclarationDescriptor> m92058l() {
        return (List) StorageKt.m92484a(this.f65910b, this, f65908c[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ClassDescriptor m92059m() {
        return this.f65909a;
    }
}
