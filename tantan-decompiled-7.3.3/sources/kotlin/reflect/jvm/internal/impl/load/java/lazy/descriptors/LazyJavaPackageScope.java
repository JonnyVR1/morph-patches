package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;
import p153l.tar;
import p153l.uar;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final JavaPackage f65578m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LazyJavaPackageFragment f65579n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final NullableLazyValue<Set<String>> f65580o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final MemoizedFunctionToNullable<C15327a, ClassDescriptor> f65581p;

    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final ClassDescriptor f65582a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(@NotNull ClassDescriptor classDescriptor) {
                super(null);
                classDescriptor.getClass();
                this.f65582a = classDescriptor;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final ClassDescriptor m90666a() {
                return this.f65582a;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {

            @NotNull
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {

            @NotNull
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private KotlinClassLookupResult() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$a */
    public static final class C15327a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Name f65583a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final JavaClass f65584b;

        public C15327a(@NotNull Name name, @Nullable JavaClass javaClass) {
            name.getClass();
            this.f65583a = name;
            this.f65584b = javaClass;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JavaClass m90667a() {
            return this.f65584b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Name m90668b() {
            return this.f65583a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C15327a) && Intrinsics.m88377d(this.f65583a, ((C15327a) obj).f65583a);
        }

        public int hashCode() {
            return this.f65583a.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.f65578m = javaPackage;
        this.f65579n = lazyJavaPackageFragment;
        this.f65580o = lazyJavaResolverContext.m90512e().mo93339g(new tar(lazyJavaResolverContext, this));
        this.f65581p = lazyJavaResolverContext.m90512e().mo93335c(new uar(this, lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: i0 */
    public static final ClassDescriptor m90658i0(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext, C15327a c15327a) {
        c15327a.getClass();
        ClassId classId = new ClassId(lazyJavaPackageScope.mo90610R().mo89453d(), c15327a.m90668b());
        KotlinClassFinder.Result resultMo89844c = c15327a.m90667a() != null ? lazyJavaResolverContext.m90508a().m90482j().mo89844c(c15327a.m90667a(), lazyJavaPackageScope.m90663m0()) : lazyJavaResolverContext.m90508a().m90482j().mo89842a(classId, lazyJavaPackageScope.m90663m0());
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91254a = resultMo89844c != null ? resultMo89844c.m91254a() : null;
        ClassId classIdMo89840e = kotlinJvmBinaryClassM91254a != null ? kotlinJvmBinaryClassM91254a.mo89840e() : null;
        if (classIdMo89840e != null && (classIdMo89840e.m91933j() || classIdMo89840e.m91932i())) {
            return null;
        }
        KotlinClassLookupResult kotlinClassLookupResultM90665p0 = lazyJavaPackageScope.m90665p0(kotlinJvmBinaryClassM91254a);
        if (kotlinClassLookupResultM90665p0 instanceof KotlinClassLookupResult.Found) {
            return ((KotlinClassLookupResult.Found) kotlinClassLookupResultM90665p0).m90666a();
        }
        if (kotlinClassLookupResultM90665p0 instanceof KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(kotlinClassLookupResultM90665p0 instanceof KotlinClassLookupResult.NotFound)) {
            nbr.m162172a();
            return null;
        }
        JavaClass javaClassM90667a = c15327a.m90667a();
        if (javaClassM90667a == null) {
            JavaClassFinder javaClassFinderM90476d = lazyJavaResolverContext.m90508a().m90476d();
            KotlinClassFinder.Result.ClassFileContent classFileContent = resultMo89844c instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultMo89844c : null;
            javaClassM90667a = javaClassFinderM90476d.mo89833b(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.m91255b() : null, null, 4, null));
        }
        JavaClass javaClass = javaClassM90667a;
        if ((javaClass != null ? javaClass.mo89927v() : null) != LightClassOriginKind.BINARY) {
            FqName fqNameMo89923d = javaClass != null ? javaClass.mo89923d() : null;
            if (fqNameMo89923d == null || fqNameMo89923d.m91939c() || !Intrinsics.m88377d(fqNameMo89923d.m91940d(), lazyJavaPackageScope.mo90610R().mo89453d())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.mo90610R(), javaClass, null, 8, null);
            lazyJavaResolverContext.m90508a().m90477e().mo90274a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
        sb.append(javaClass);
        sb.append("\nClassId: ");
        sb.append(classId);
        sb.append("\nfindKotlinClass(JavaClass) = ");
        sb.append(KotlinClassFinderKt.m91257a(lazyJavaResolverContext.m90508a().m90482j(), javaClass, lazyJavaPackageScope.m90663m0()));
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91258b = KotlinClassFinderKt.m91258b(lazyJavaResolverContext.m90508a().m90482j(), classId, lazyJavaPackageScope.m90663m0());
        sb.append("\nfindKotlinClass(ClassId) = ");
        sb.append(kotlinJvmBinaryClassM91258b);
        sb.append('\n');
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: o0 */
    public static final Set m90659o0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        return lazyJavaResolverContext.m90508a().m90476d().mo89832a(lazyJavaPackageScope.mo90610R().mo89453d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo90593B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo90596D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!descriptorKindFilter.m92930a(companion.m92938e() | companion.m92936c())) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionInvoke = m90695K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                name.getClass();
                if (function1.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public final ClassDescriptor m90660j0(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.m91980a(name)) {
            return null;
        }
        Set<String> setInvoke = this.f65580o.invoke();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.m91973b())) {
            return this.f65581p.invoke(new C15327a(name, javaClass));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final ClassDescriptor m90661k0(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return m90660j0(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m90660j0(name, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final MetadataVersion m90663m0() {
        return m90696L().m90508a().m90474b().m91198f().m93046g().mo93067f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment mo90610R() {
        return this.f65579n;
    }

    /* JADX INFO: renamed from: p0 */
    public final KotlinClassLookupResult m90665p0(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.mo89837b().m91307c() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorM91206n = m90696L().m90508a().m90474b().m91206n(kotlinJvmBinaryClass);
        return classDescriptorM91206n != null ? new KotlinClassLookupResult.Found(classDescriptorM91206n) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo90638v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        if (!descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92938e())) {
            return SetsKt.emptySet();
        }
        Set<String> setInvoke = this.f65580o.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.m91970i((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.f65578m;
        if (function1 == null) {
            function1 = FunctionsKt.m94099k();
        }
        Collection<JavaClass> collectionMo89953E = javaPackage.mo89953E(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : collectionMo89953E) {
            Name name = javaClass.mo89927v() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Name> mo90641x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: z */
    public DeclaredMemberIndex mo90645z() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }
}
