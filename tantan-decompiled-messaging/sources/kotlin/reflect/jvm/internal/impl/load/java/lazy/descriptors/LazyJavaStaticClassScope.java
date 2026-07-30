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
import p149l.f9r;
import p149l.g9r;
import p149l.h9r;
import p149l.i9r;
import p149l.j9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final JavaClass f64931m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final JavaClassDescriptor f64932n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaClass javaClass, @NotNull JavaClassDescriptor javaClassDescriptor) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaClass.getClass();
        javaClassDescriptor.getClass();
        this.f64931m = javaClass;
        this.f64932n = javaClassDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m89831m0(JavaMember javaMember) {
        javaMember.getClass();
        return javaMember.mo89023H();
    }

    /* JADX INFO: renamed from: n0 */
    public static final Collection m89832n0(Name name, MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo88721c(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Collection m89833o0(MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo88722d();
    }

    /* JADX INFO: renamed from: q0 */
    public static final Iterable m89834q0(ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionMo88678c = classDescriptor.mo88305l().mo88678c();
        collectionMo88678c.getClass();
        return SequencesKt___SequencesKt.m93307x(SequencesKt___SequencesKt.m93295O(CollectionsKt.asSequence(collectionMo88678c), j9r.INSTANCE));
    }

    /* JADX INFO: renamed from: r0 */
    public static final ClassDescriptor m89835r0(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo88316e;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo89702B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        Collection<? extends SimpleFunctionDescriptor> collectionM89510e = DescriptorResolverUtils.m89510e(name, m89840u0(name, mo89719R()), collection, mo89719R(), m89805L().m89617a().m89584c(), m89805L().m89617a().m89592k().mo92938b());
        collectionM89510e.getClass();
        collection.addAll(collectionM89510e);
        if (this.f64931m.isEnum()) {
            if (Intrinsics.m87488d(name, StandardNames.f63813e)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM91735g = DescriptorFactory.m91735g(mo89719R());
                simpleFunctionDescriptorM91735g.getClass();
                collection.add(simpleFunctionDescriptorM91735g);
            } else if (Intrinsics.m87488d(name, StandardNames.f63811c)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM91736h = DescriptorFactory.m91736h(mo89719R());
                simpleFunctionDescriptorM91736h.getClass();
                collection.add(simpleFunctionDescriptorM91736h);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: C */
    public void mo89703C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        Name name2;
        Collection<PropertyDescriptor> collection2;
        name.getClass();
        collection.getClass();
        Set setM89837p0 = m89837p0(mo89719R(), new LinkedHashSet(), new h9r(name));
        if (collection.isEmpty()) {
            name2 = name;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setM89837p0) {
                PropertyDescriptor propertyDescriptorM89839t0 = m89839t0((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(propertyDescriptorM89839t0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorM89839t0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection<PropertyDescriptor> collection3 = collection2;
                Name name3 = name2;
                Collection collectionM89510e = DescriptorResolverUtils.m89510e(name3, (Collection) ((Map.Entry) it.next()).getValue(), collection3, mo89719R(), m89805L().m89617a().m89584c(), m89805L().m89617a().m89592k().mo92938b());
                collection2 = collection3;
                name2 = name3;
                collectionM89510e.getClass();
                CollectionsKt.addAll(arrayList2, collectionM89510e);
            }
            collection2.addAll(arrayList2);
        } else {
            name2 = name;
            collection2 = collection;
            Collection<? extends PropertyDescriptor> collectionM89510e2 = DescriptorResolverUtils.m89510e(name2, setM89837p0, collection2, mo89719R(), m89805L().m89617a().m89584c(), m89805L().m89617a().m89592k().mo92938b());
            collectionM89510e2.getClass();
            collection2.addAll(collectionM89510e2);
        }
        if (this.f64931m.isEnum() && Intrinsics.m87488d(name2, StandardNames.f63812d)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection2, DescriptorFactory.m91734f(mo89719R()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo89705D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Set<Name> mutableSet = CollectionsKt.toMutableSet(m89807N().invoke().mo89635d());
        m89837p0(mo89719R(), mutableSet, g9r.INSTANCE);
        if (this.f64931m.isEnum()) {
            mutableSet.add(StandardNames.f63812d);
        }
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex mo89754z() {
        return new ClassDeclaredMemberIndex(this.f64931m, f9r.INSTANCE);
    }

    /* JADX INFO: renamed from: p0 */
    public final <R> Set<R> m89837p0(final ClassDescriptor classDescriptor, final Set<R> set, final Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.m93186b(CollectionsKt.listOf(classDescriptor), i9r.INSTANCE, new DFS.AbstractNodeHandler<ClassDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean mo87633a(ClassDescriptor classDescriptor2) {
                classDescriptor2.getClass();
                if (classDescriptor2 == classDescriptor) {
                    return true;
                }
                MemberScope memberScopeMo88308o0 = classDescriptor2.mo88308o0();
                memberScopeMo88308o0.getClass();
                if (!(memberScopeMo88308o0 instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection<? extends R>) ((Collection) function1.invoke(memberScopeMo88308o0)));
                return false;
            }

            /* JADX INFO: renamed from: d */
            public void m89842d() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object result() {
                m89842d();
                return Unit.INSTANCE;
            }
        });
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public JavaClassDescriptor mo89719R() {
        return this.f64932n;
    }

    /* JADX INFO: renamed from: t0 */
    public final PropertyDescriptor m89839t0(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> collectionMo88447e = propertyDescriptor.mo88447e();
        collectionMo88447e.getClass();
        Collection<? extends PropertyDescriptor> collection = collectionMo88447e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            propertyDescriptor2.getClass();
            arrayList.add(m89839t0(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.single(CollectionsKt.distinct(arrayList));
    }

    /* JADX INFO: renamed from: u0 */
    public final Set<SimpleFunctionDescriptor> m89840u0(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope lazyJavaStaticClassScopeM89568b = UtilKt.m89568b(classDescriptor);
        return lazyJavaStaticClassScopeM89568b == null ? SetsKt.emptySet() : CollectionsKt.toSet(lazyJavaStaticClassScopeM89568b.mo88720b(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo89747v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Name> mo89750x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Set<Name> mutableSet = CollectionsKt.toMutableSet(m89807N().invoke().mo89632a());
        LazyJavaStaticClassScope lazyJavaStaticClassScopeM89568b = UtilKt.m89568b(mo89719R());
        Set<Name> setMo88719a = lazyJavaStaticClassScopeM89568b != null ? lazyJavaStaticClassScopeM89568b.mo88719a() : null;
        if (setMo88719a == null) {
            setMo88719a = SetsKt.emptySet();
        }
        mutableSet.addAll(setMo88719a);
        if (this.f64931m.isEnum()) {
            mutableSet.addAll(CollectionsKt.listOf((Object[]) new Name[]{StandardNames.f63813e, StandardNames.f63811c}));
        }
        mutableSet.addAll(m89805L().m89617a().m89604w().mo92004g(mo89719R(), m89805L()));
        return mutableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: y */
    public void mo89752y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        m89805L().m89617a().m89604w().mo92002e(mo89719R(), name, collection, m89805L());
    }
}
