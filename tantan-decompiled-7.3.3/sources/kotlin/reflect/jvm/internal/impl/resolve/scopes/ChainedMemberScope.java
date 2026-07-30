package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ChainedMemberScope implements MemberScope {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66552a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemberScope[] f66553b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberScope m92917a(@NotNull String str, @NotNull Iterable<? extends MemberScope> iterable) {
            str.getClass();
            iterable.getClass();
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.addAll(smartList, ((ChainedMemberScope) memberScope).f66553b);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return m92918b(str, smartList);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberScope m92918b(@NotNull String str, @NotNull List<? extends MemberScope> list) {
            str.getClass();
            list.getClass();
            int size = list.size();
            if (size != 0) {
                return size != 1 ? new ChainedMemberScope(str, (MemberScope[]) list.toArray(new MemberScope[0]), null) : list.get(0);
            }
            return MemberScope.Empty.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.f66552a = str;
        this.f66553b = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        MemberScope[] memberScopeArr = this.f66553b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo89610a());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.f66553b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo89611b(name, lookupLocation);
        }
        Collection<SimpleFunctionDescriptor> collectionM94067a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM94067a = ScopeUtilsKt.m94067a(collectionM94067a, memberScope.mo89611b(name, lookupLocation));
        }
        return collectionM94067a == null ? SetsKt.emptySet() : collectionM94067a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.f66553b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo89612c(name, lookupLocation);
        }
        Collection<PropertyDescriptor> collectionM94067a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM94067a = ScopeUtilsKt.m94067a(collectionM94067a, memberScope.mo89612c(name, lookupLocation));
        }
        return collectionM94067a == null ? SetsKt.emptySet() : collectionM94067a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        MemberScope[] memberScopeArr = this.f66553b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo89613d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return MemberScopeKt.m92957a(ArraysKt.asIterable(this.f66553b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f66553b) {
            ClassifierDescriptor classifierDescriptorMo90533f = memberScope.mo90533f(name, lookupLocation);
            if (classifierDescriptorMo90533f != null) {
                if (!(classifierDescriptorMo90533f instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo90533f).mo89198n0()) {
                    return classifierDescriptorMo90533f;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo90533f;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        MemberScope[] memberScopeArr = this.f66553b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo89615g(descriptorKindFilter, function1);
        }
        Collection<DeclarationDescriptor> collectionM94067a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM94067a = ScopeUtilsKt.m94067a(collectionM94067a, memberScope.mo89615g(descriptorKindFilter, function1));
        }
        return collectionM94067a == null ? SetsKt.emptySet() : collectionM94067a;
    }

    @NotNull
    public String toString() {
        return this.f66552a;
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }
}
