package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hbr;
import p153l.ibr;
import p153l.jbr;
import p153l.kbr;
import p153l.lbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final JavaClass f65605m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final JavaClassDescriptor f65606n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaClass javaClass, @NotNull JavaClassDescriptor javaClassDescriptor) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaClass.getClass();
        javaClassDescriptor.getClass();
        this.f65605m = javaClass;
        this.f65606n = javaClassDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m90722m0(JavaMember javaMember) {
        javaMember.getClass();
        return javaMember.mo89914H();
    }

    /* JADX INFO: renamed from: n0 */
    public static final Collection m90723n0(Name name, MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo89612c(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Collection m90724o0(MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo89613d();
    }

    /* JADX INFO: renamed from: q0 */
    public static final Iterable m90725q0(ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionMo89569c = classDescriptor.mo89196l().mo89569c();
        collectionMo89569c.getClass();
        return SequencesKt___SequencesKt.m94198x(SequencesKt___SequencesKt.m94186O(CollectionsKt.asSequence(collectionMo89569c), lbr.INSTANCE));
    }

    /* JADX INFO: renamed from: r0 */
    public static final ClassDescriptor m90726r0(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89207e;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo90593B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        Collection<? extends SimpleFunctionDescriptor> collectionM90401e = DescriptorResolverUtils.m90401e(name, m90731u0(name, mo90610R()), collection, mo90610R(), m90696L().m90508a().m90475c(), m90696L().m90508a().m90483k().mo93829b());
        collectionM90401e.getClass();
        collection.addAll(collectionM90401e);
        if (this.f65605m.isEnum()) {
            if (Intrinsics.m88377d(name, StandardNames.f64487e)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM92626g = DescriptorFactory.m92626g(mo90610R());
                simpleFunctionDescriptorM92626g.getClass();
                collection.add(simpleFunctionDescriptorM92626g);
            } else if (Intrinsics.m88377d(name, StandardNames.f64485c)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM92627h = DescriptorFactory.m92627h(mo90610R());
                simpleFunctionDescriptorM92627h.getClass();
                collection.add(simpleFunctionDescriptorM92627h);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: C */
    public void mo90594C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        Name name2;
        Collection<PropertyDescriptor> collection2;
        name.getClass();
        collection.getClass();
        Set setM90728p0 = m90728p0(mo90610R(), new LinkedHashSet(), new jbr(name));
        if (collection.isEmpty()) {
            name2 = name;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setM90728p0) {
                PropertyDescriptor propertyDescriptorM90730t0 = m90730t0((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(propertyDescriptorM90730t0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorM90730t0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection<PropertyDescriptor> collection3 = collection2;
                Name name3 = name2;
                Collection collectionM90401e = DescriptorResolverUtils.m90401e(name3, (Collection) ((Map.Entry) it.next()).getValue(), collection3, mo90610R(), m90696L().m90508a().m90475c(), m90696L().m90508a().m90483k().mo93829b());
                collection2 = collection3;
                name2 = name3;
                collectionM90401e.getClass();
                CollectionsKt.addAll(arrayList2, collectionM90401e);
            }
            collection2.addAll(arrayList2);
        } else {
            name2 = name;
            collection2 = collection;
            Collection<? extends PropertyDescriptor> collectionM90401e2 = DescriptorResolverUtils.m90401e(name2, setM90728p0, collection2, mo90610R(), m90696L().m90508a().m90475c(), m90696L().m90508a().m90483k().mo93829b());
            collectionM90401e2.getClass();
            collection2.addAll(collectionM90401e2);
        }
        if (this.f65605m.isEnum() && Intrinsics.m88377d(name2, StandardNames.f64486d)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection2, DescriptorFactory.m92625f(mo90610R()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo90596D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Set<Name> mutableSet = CollectionsKt.toMutableSet(m90698N().invoke().mo90526d());
        m90728p0(mo90610R(), mutableSet, ibr.INSTANCE);
        if (this.f65605m.isEnum()) {
            mutableSet.add(StandardNames.f64486d);
        }
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex mo90645z() {
        return new ClassDeclaredMemberIndex(this.f65605m, hbr.INSTANCE);
    }

    /* JADX INFO: renamed from: p0 */
    public final <R> Set<R> m90728p0(final ClassDescriptor classDescriptor, final Set<R> set, final Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.m94077b(CollectionsKt.listOf(classDescriptor), kbr.INSTANCE, new DFS.AbstractNodeHandler<ClassDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean mo88524a(ClassDescriptor classDescriptor2) {
                classDescriptor2.getClass();
                if (classDescriptor2 == classDescriptor) {
                    return true;
                }
                MemberScope memberScopeMo89199o0 = classDescriptor2.mo89199o0();
                memberScopeMo89199o0.getClass();
                if (!(memberScopeMo89199o0 instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection<? extends R>) ((Collection) function1.invoke(memberScopeMo89199o0)));
                return false;
            }

            /* JADX INFO: renamed from: d */
            public void m90733d() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object result() {
                m90733d();
                return Unit.INSTANCE;
            }
        });
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public JavaClassDescriptor mo90610R() {
        return this.f65606n;
    }

    /* JADX INFO: renamed from: t0 */
    public final PropertyDescriptor m90730t0(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> collectionMo89338e = propertyDescriptor.mo89338e();
        collectionMo89338e.getClass();
        Collection<? extends PropertyDescriptor> collection = collectionMo89338e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            propertyDescriptor2.getClass();
            arrayList.add(m90730t0(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.single(CollectionsKt.distinct(arrayList));
    }

    /* JADX INFO: renamed from: u0 */
    public final Set<SimpleFunctionDescriptor> m90731u0(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope lazyJavaStaticClassScopeM90459b = UtilKt.m90459b(classDescriptor);
        return lazyJavaStaticClassScopeM90459b == null ? SetsKt.emptySet() : CollectionsKt.toSet(lazyJavaStaticClassScopeM90459b.mo89611b(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo90638v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Name> mo90641x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Set<Name> mutableSet = CollectionsKt.toMutableSet(m90698N().invoke().mo90523a());
        LazyJavaStaticClassScope lazyJavaStaticClassScopeM90459b = UtilKt.m90459b(mo90610R());
        Set<Name> setMo89610a = lazyJavaStaticClassScopeM90459b != null ? lazyJavaStaticClassScopeM90459b.mo89610a() : null;
        if (setMo89610a == null) {
            setMo89610a = SetsKt.emptySet();
        }
        mutableSet.addAll(setMo89610a);
        if (this.f65605m.isEnum()) {
            mutableSet.addAll(CollectionsKt.listOf((Object[]) new Name[]{StandardNames.f64487e, StandardNames.f64485c}));
        }
        mutableSet.addAll(m90696L().m90508a().m90495w().mo92895g(mo90610R(), m90696L()));
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: y */
    public void mo90643y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        m90696L().m90508a().m90495w().mo92893e(mo90610R(), name, collection, m90696L());
    }
}
