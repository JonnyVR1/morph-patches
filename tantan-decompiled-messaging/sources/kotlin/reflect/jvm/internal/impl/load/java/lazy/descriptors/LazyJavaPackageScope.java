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
import p149l.l9r;
import p149l.r8r;
import p149l.s8r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final JavaPackage f64904m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LazyJavaPackageFragment f64905n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final NullableLazyValue<Set<String>> f64906o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final MemoizedFunctionToNullable<C15220a, ClassDescriptor> f64907p;

    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final ClassDescriptor f64908a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(@NotNull ClassDescriptor classDescriptor) {
                super(null);
                classDescriptor.getClass();
                this.f64908a = classDescriptor;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final ClassDescriptor m89775a() {
                return this.f64908a;
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
    public static final class C15220a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Name f64909a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final JavaClass f64910b;

        public C15220a(@NotNull Name name, @Nullable JavaClass javaClass) {
            name.getClass();
            this.f64909a = name;
            this.f64910b = javaClass;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final JavaClass m89776a() {
            return this.f64910b;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Name m89777b() {
            return this.f64909a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C15220a) && Intrinsics.m87488d(this.f64909a, ((C15220a) obj).f64909a);
        }

        public int hashCode() {
            return this.f64909a.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        lazyJavaPackageFragment.getClass();
        this.f64904m = javaPackage;
        this.f64905n = lazyJavaPackageFragment;
        this.f64906o = lazyJavaResolverContext.m89621e().mo92448g(new r8r(lazyJavaResolverContext, this));
        this.f64907p = lazyJavaResolverContext.m89621e().mo92444c(new s8r(this, lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: i0 */
    public static final ClassDescriptor m89767i0(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext, C15220a c15220a) {
        c15220a.getClass();
        ClassId classId = new ClassId(lazyJavaPackageScope.mo89719R().mo88562d(), c15220a.m89777b());
        KotlinClassFinder.Result resultMo88953c = c15220a.m89776a() != null ? lazyJavaResolverContext.m89617a().m89591j().mo88953c(c15220a.m89776a(), lazyJavaPackageScope.m89772m0()) : lazyJavaResolverContext.m89617a().m89591j().mo88951a(classId, lazyJavaPackageScope.m89772m0());
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90363a = resultMo88953c != null ? resultMo88953c.m90363a() : null;
        ClassId classIdMo88949e = kotlinJvmBinaryClassM90363a != null ? kotlinJvmBinaryClassM90363a.mo88949e() : null;
        if (classIdMo88949e != null && (classIdMo88949e.m91042j() || classIdMo88949e.m91041i())) {
            return null;
        }
        KotlinClassLookupResult kotlinClassLookupResultM89774p0 = lazyJavaPackageScope.m89774p0(kotlinJvmBinaryClassM90363a);
        if (kotlinClassLookupResultM89774p0 instanceof KotlinClassLookupResult.Found) {
            return ((KotlinClassLookupResult.Found) kotlinClassLookupResultM89774p0).m89775a();
        }
        if (kotlinClassLookupResultM89774p0 instanceof KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(kotlinClassLookupResultM89774p0 instanceof KotlinClassLookupResult.NotFound)) {
            l9r.m149037a();
            return null;
        }
        JavaClass javaClassM89776a = c15220a.m89776a();
        if (javaClassM89776a == null) {
            JavaClassFinder javaClassFinderM89585d = lazyJavaResolverContext.m89617a().m89585d();
            KotlinClassFinder.Result.ClassFileContent classFileContent = resultMo88953c instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultMo88953c : null;
            javaClassM89776a = javaClassFinderM89585d.mo88942b(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.m90364b() : null, null, 4, null));
        }
        JavaClass javaClass = javaClassM89776a;
        if ((javaClass != null ? javaClass.mo89036v() : null) != LightClassOriginKind.BINARY) {
            FqName fqNameMo89032d = javaClass != null ? javaClass.mo89032d() : null;
            if (fqNameMo89032d == null || fqNameMo89032d.m91048c() || !Intrinsics.m87488d(fqNameMo89032d.m91049d(), lazyJavaPackageScope.mo89719R().mo88562d())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.mo89719R(), javaClass, null, 8, null);
            lazyJavaResolverContext.m89617a().m89586e().mo89383a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
        sb.append(javaClass);
        sb.append("\nClassId: ");
        sb.append(classId);
        sb.append("\nfindKotlinClass(JavaClass) = ");
        sb.append(KotlinClassFinderKt.m90366a(lazyJavaResolverContext.m89617a().m89591j(), javaClass, lazyJavaPackageScope.m89772m0()));
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90367b = KotlinClassFinderKt.m90367b(lazyJavaResolverContext.m89617a().m89591j(), classId, lazyJavaPackageScope.m89772m0());
        sb.append("\nfindKotlinClass(ClassId) = ");
        sb.append(kotlinJvmBinaryClassM90367b);
        sb.append('\n');
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: o0 */
    public static final Set m89768o0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        return lazyJavaResolverContext.m89617a().m89585d().mo88941a(lazyJavaPackageScope.mo89719R().mo88562d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo89702B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo89705D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!descriptorKindFilter.m92039a(companion.m92047e() | companion.m92045c())) {
            return CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionInvoke = m89804K().invoke();
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
    public final ClassDescriptor m89769j0(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.m91089a(name)) {
            return null;
        }
        Set<String> setInvoke = this.f64906o.invoke();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.m91082b())) {
            return this.f64907p.invoke(new C15220a(name, javaClass));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final ClassDescriptor m89770k0(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return m89769j0(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return m89769j0(name, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final MetadataVersion m89772m0() {
        return m89805L().m89617a().m89583b().m90307f().m92155g().mo92176f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment mo89719R() {
        return this.f64905n;
    }

    /* JADX INFO: renamed from: p0 */
    public final KotlinClassLookupResult m89774p0(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.mo88946b().m90416c() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorM90315n = m89805L().m89617a().m89583b().m90315n(kotlinJvmBinaryClass);
        return classDescriptorM90315n != null ? new KotlinClassLookupResult.Found(classDescriptorM90315n) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo89747v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        if (!descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92047e())) {
            return SetsKt.emptySet();
        }
        Set<String> setInvoke = this.f64906o.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.m91079i((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.f64904m;
        if (function1 == null) {
            function1 = FunctionsKt.m93208k();
        }
        Collection<JavaClass> collectionMo89062E = javaPackage.mo89062E(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : collectionMo89062E) {
            Name name = javaClass.mo89036v() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Name> mo89750x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: z */
    public DeclaredMemberIndex mo89754z() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }
}
