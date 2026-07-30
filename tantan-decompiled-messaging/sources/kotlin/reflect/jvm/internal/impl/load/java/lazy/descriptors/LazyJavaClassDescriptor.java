package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a8r;
import p149l.b8r;
import p149l.c8r;
import p149l.z7r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Set<String> f64867x = SetsKt.setOf((Object[]) new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});

    /* JADX INFO: renamed from: h */
    @NotNull
    public final LazyJavaResolverContext f64868h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final JavaClass f64869i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ClassDescriptor f64870j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LazyJavaResolverContext f64871k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f64872l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ClassKind f64873m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Modality f64874n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Visibility f64875o;

    /* JADX INFO: renamed from: p */
    public final boolean f64876p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final C15219a f64877q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final LazyJavaClassMemberScope f64878r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f64879s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final InnerClassesScopeWrapper f64880t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final LazyJavaStaticClassScope f64881u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Annotations f64882v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final NotNullLazyValue<List<TypeParameterDescriptor>> f64883w;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$a */
    @SourceDebugExtension
    public final class C15219a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f64884d;

        public C15219a() {
            super(LazyJavaClassDescriptor.this.f64871k.m89621e());
            this.f64884d = LazyJavaClassDescriptor.this.f64871k.m89621e().mo92446e(new c8r(LazyJavaClassDescriptor.this));
        }

        /* JADX INFO: renamed from: N */
        public static final List m89676N(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            return TypeParameterUtilsKt.m88609g(lazyJavaClassDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: J */
        public ClassDescriptor mo88316e() {
            return LazyJavaClassDescriptor.this;
        }

        /* JADX INFO: renamed from: L */
        public final KotlinType m89677L() {
            FqName fqNameM89379b;
            ArrayList arrayList;
            FqName fqNameM89678M = m89678M();
            if (fqNameM89678M == null || fqNameM89678M.m91048c() || !fqNameM89678M.m91053h(StandardNames.f63834z)) {
                fqNameM89678M = null;
            }
            if (fqNameM89678M == null) {
                fqNameM89379b = FakePureImplementationsProvider.INSTANCE.m89379b(DescriptorUtilsKt.m91982o(LazyJavaClassDescriptor.this));
                if (fqNameM89379b == null) {
                    return null;
                }
            } else {
                fqNameM89379b = fqNameM89678M;
            }
            ClassDescriptor classDescriptorM91967B = DescriptorUtilsKt.m91967B(LazyJavaClassDescriptor.this.f64871k.m89620d(), fqNameM89379b, NoLookupLocation.FROM_JAVA_LOADER);
            if (classDescriptorM91967B == null) {
                return null;
            }
            int size = classDescriptorM91967B.mo88305l().getParameters().size();
            List<TypeParameterDescriptor> parameters = LazyJavaClassDescriptor.this.mo88305l().getParameters();
            parameters.getClass();
            int size2 = parameters.size();
            if (size2 == size) {
                List<TypeParameterDescriptor> list = parameters;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).mo88458o()));
                }
            } else {
                if (size2 != 1 || size <= 1 || fqNameM89678M != null) {
                    return null;
                }
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) CollectionsKt.single((List) parameters)).mo88458o());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(typeProjectionImpl);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.m92631h(TypeAttributes.Companion.m92709k(), classDescriptorM91967B, arrayList);
        }

        /* JADX INFO: renamed from: M */
        public final FqName m89678M() {
            String strMo91918b;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName fqName = JvmAnnotationNames.f64710r;
            fqName.getClass();
            AnnotationDescriptor annotationDescriptorMo88638b = annotations.mo88638b(fqName);
            if (annotationDescriptorMo88638b == null) {
                return null;
            }
            Object objSingleOrNull = CollectionsKt.singleOrNull(annotationDescriptorMo88638b.mo88630a().values());
            StringValue stringValue = objSingleOrNull instanceof StringValue ? (StringValue) objSingleOrNull : null;
            if (stringValue == null || (strMo91918b = stringValue.mo91918b()) == null || !FqNamesUtilKt.m91074e(strMo91918b)) {
                return null;
            }
            return new FqName(strMo91918b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo88317g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f64884d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo88318s() {
            Collection<JavaClassifierType> collectionMo89031c = LazyJavaClassDescriptor.this.m89671L0().mo89031c();
            ArrayList arrayList = new ArrayList(collectionMo89031c.size());
            ArrayList<JavaType> arrayList2 = new ArrayList(0);
            KotlinType kotlinTypeM89677L = m89677L();
            Iterator<JavaClassifierType> it = collectionMo89031c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType kotlinTypeM90089q = LazyJavaClassDescriptor.this.f64871k.m89617a().m89599r().m90089q(LazyJavaClassDescriptor.this.f64871k.m89623g().m89874p(next, JavaTypeAttributesKt.m89858b(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f64871k);
                if (kotlinTypeM90089q.mo91890G0().mo88316e() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.m87488d(kotlinTypeM90089q.mo91890G0(), kotlinTypeM89677L != null ? kotlinTypeM89677L.mo91890G0() : null) && !KotlinBuiltIns.m88179c0(kotlinTypeM90089q)) {
                    arrayList.add(kotlinTypeM90089q);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.f64870j;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, classDescriptor != null ? MappingUtilKt.m88442a(classDescriptor, LazyJavaClassDescriptor.this).m92757c().m92782q(classDescriptor.mo88458o(), Variance.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, kotlinTypeM89677L);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterM89584c = LazyJavaClassDescriptor.this.f64871k.m89617a().m89584c();
                ClassDescriptor classDescriptorMo88316e = mo88316e();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (JavaType javaType : arrayList2) {
                    javaType.getClass();
                    arrayList3.add(((JavaClassifierType) javaType).mo89043s());
                }
                errorReporterM89584c.mo88959b(classDescriptorMo88316e, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.toList(arrayList) : CollectionsKt.listOf(LazyJavaClassDescriptor.this.f64871k.m89620d().mo88546f().m88232i());
        }

        @NotNull
        public String toString() {
            String strM91082b = LazyJavaClassDescriptor.this.getName().m91082b();
            strM91082b.getClass();
            return strM91082b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo88319w() {
            return LazyJavaClassDescriptor.this.f64871k.m89617a().m89603v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaClass javaClass, @Nullable ClassDescriptor classDescriptor) {
        ClassKind classKind;
        Modality modalityM88541a;
        super(lazyJavaResolverContext.m89621e(), declarationDescriptor, javaClass.getName(), lazyJavaResolverContext.m89617a().m89601t().mo88964a(javaClass), false);
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaClass.getClass();
        this.f64868h = lazyJavaResolverContext;
        this.f64869i = javaClass;
        this.f64870j = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextM89574f = ContextKt.m89574f(lazyJavaResolverContext, this, javaClass, 0, 4, null);
        this.f64871k = lazyJavaResolverContextM89574f;
        lazyJavaResolverContextM89574f.m89617a().m89589h().mo89536c(javaClass, this);
        javaClass.mo89036v();
        this.f64872l = LazyKt__LazyJVMKt.m87229b(new z7r(this));
        if (javaClass.mo89034l()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (javaClass.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = javaClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.f64873m = classKind;
        if (javaClass.mo89034l() || javaClass.isEnum()) {
            modalityM88541a = Modality.FINAL;
        } else {
            modalityM88541a = Modality.Companion.m88541a(javaClass.mo89022D(), javaClass.mo89022D() || javaClass.isAbstract() || javaClass.isInterface(), !javaClass.isFinal());
        }
        this.f64874n = modalityM88541a;
        this.f64875o = javaClass.getVisibility();
        this.f64876p = (javaClass.mo89033h() == null || javaClass.mo89023H()) ? false : true;
        this.f64877q = new C15219a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextM89574f, this, javaClass, classDescriptor != null, null, 16, null);
        this.f64878r = lazyJavaClassMemberScope;
        this.f64879s = ScopesHolderForClass.Companion.m88592a(this, lazyJavaResolverContextM89574f.m89621e(), lazyJavaResolverContextM89574f.m89617a().m89592k().mo92939c(), new a8r(this));
        this.f64880t = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f64881u = new LazyJavaStaticClassScope(lazyJavaResolverContextM89574f, javaClass, this);
        this.f64882v = LazyJavaAnnotationsKt.m89612a(lazyJavaResolverContextM89574f, javaClass);
        this.f64883w = lazyJavaResolverContextM89574f.m89621e().mo92446e(new b8r(this));
    }

    /* JADX INFO: renamed from: J0 */
    public static final List m89666J0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f64869i.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor typeParameterDescriptorMo89626a = lazyJavaClassDescriptor.f64871k.m89622f().mo89626a(javaTypeParameter);
            if (typeParameterDescriptorMo89626a == null) {
                StringBuilder sb = new StringBuilder("Parameter ");
                sb.append(javaTypeParameter);
                JavaClass javaClass = lazyJavaClassDescriptor.f64869i;
                sb.append(" surely belongs to class ");
                sb.append(javaClass);
                sb.append(", so it must be resolved");
                throw new AssertionError(sb.toString());
            }
            arrayList.add(typeParameterDescriptorMo89626a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static final List m89667P0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(lazyJavaClassDescriptor);
        if (classIdM91981n != null) {
            return lazyJavaClassDescriptor.f64868h.m89617a().m89587f().mo89405a(classIdM91981n);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final LazyJavaClassMemberScope m89668Q0(LazyJavaClassDescriptor lazyJavaClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f64871k, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f64869i, lazyJavaClassDescriptor.f64870j != null, lazyJavaClassDescriptor.f64878r);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: C */
    public MemberScope mo88454C() {
        return this.f64880t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public final LazyJavaClassDescriptor m89669I0(@NotNull JavaResolverCache javaResolverCache, @Nullable ClassDescriptor classDescriptor) {
        javaResolverCache.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.f64871k;
        LazyJavaResolverContext lazyJavaResolverContextM89581m = ContextKt.m89581m(lazyJavaResolverContext, lazyJavaResolverContext.m89617a().m89605x(javaResolverCache));
        DeclarationDescriptor declarationDescriptorMo88299b = mo88299b();
        declarationDescriptorMo88299b.getClass();
        return new LazyJavaClassDescriptor(lazyJavaResolverContextM89581m, declarationDescriptorMo88299b, this.f64869i, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> getConstructors() {
        return this.f64878r.m89729a1().invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final JavaClass m89671L0() {
        return this.f64869i;
    }

    @Nullable
    /* JADX INFO: renamed from: M0 */
    public final List<JavaAnnotation> m89672M0() {
        return (List) this.f64872l.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope mo88455D() {
        MemberScope memberScopeMo88455D = super.mo88455D();
        memberScopeMo88455D.getClass();
        return (LazyJavaClassMemberScope) memberScopeMo88455D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return (LazyJavaClassMemberScope) this.f64879s.m88590c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo88300c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64882v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.f64873m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        if (!Intrinsics.m87488d(this.f64875o, DescriptorVisibilities.f64022a) || this.f64869i.mo89033h() != null) {
            return UtilsKt.m89505d(this.f64875o);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f64664a;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo88302h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        return this.f64874n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo88304j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        return this.f64877q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public MemberScope mo88308o0() {
        return this.f64881u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        return this.f64883w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo88310p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo88311q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        return this.f64876p;
    }

    @NotNull
    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.m91983p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return null;
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? null : classDescriptor);
    }
}
