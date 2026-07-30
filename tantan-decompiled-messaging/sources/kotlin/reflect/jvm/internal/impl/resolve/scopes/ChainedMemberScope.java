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
    public final String f65878a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemberScope[] f65879b;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberScope m92026a(@NotNull String str, @NotNull Iterable<? extends MemberScope> iterable) {
            str.getClass();
            iterable.getClass();
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.addAll(smartList, ((ChainedMemberScope) memberScope).f65879b);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return m92027b(str, smartList);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final MemberScope m92027b(@NotNull String str, @NotNull List<? extends MemberScope> list) {
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
        this.f65878a = str;
        this.f65879b = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        MemberScope[] memberScopeArr = this.f65879b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo88719a());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.f65879b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo88720b(name, lookupLocation);
        }
        Collection<SimpleFunctionDescriptor> collectionM93176a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM93176a = ScopeUtilsKt.m93176a(collectionM93176a, memberScope.mo88720b(name, lookupLocation));
        }
        return collectionM93176a == null ? SetsKt.emptySet() : collectionM93176a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        MemberScope[] memberScopeArr = this.f65879b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo88721c(name, lookupLocation);
        }
        Collection<PropertyDescriptor> collectionM93176a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM93176a = ScopeUtilsKt.m93176a(collectionM93176a, memberScope.mo88721c(name, lookupLocation));
        }
        return collectionM93176a == null ? SetsKt.emptySet() : collectionM93176a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        MemberScope[] memberScopeArr = this.f65879b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.mo88722d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return MemberScopeKt.m92066a(ArraysKt.asIterable(this.f65879b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f65879b) {
            ClassifierDescriptor classifierDescriptorMo89642f = memberScope.mo89642f(name, lookupLocation);
            if (classifierDescriptorMo89642f != null) {
                if (!(classifierDescriptorMo89642f instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo89642f).mo88307n0()) {
                    return classifierDescriptorMo89642f;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo89642f;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        MemberScope[] memberScopeArr = this.f65879b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].mo88724g(descriptorKindFilter, function1);
        }
        Collection<DeclarationDescriptor> collectionM93176a = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionM93176a = ScopeUtilsKt.m93176a(collectionM93176a, memberScope.mo88724g(descriptorKindFilter, function1));
        }
        return collectionM93176a == null ? SetsKt.emptySet() : collectionM93176a;
    }

    @NotNull
    public String toString() {
        return this.f65878a;
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }
}
