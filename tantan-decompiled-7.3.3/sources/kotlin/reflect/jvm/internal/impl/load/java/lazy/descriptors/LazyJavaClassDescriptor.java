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
import p153l.bar;
import p153l.car;
import p153l.dar;
import p153l.ear;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Set<String> f65541x = SetsKt.setOf((Object[]) new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});

    /* JADX INFO: renamed from: h */
    @NotNull
    public final LazyJavaResolverContext f65542h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final JavaClass f65543i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final ClassDescriptor f65544j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LazyJavaResolverContext f65545k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f65546l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ClassKind f65547m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Modality f65548n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Visibility f65549o;

    /* JADX INFO: renamed from: p */
    public final boolean f65550p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final C15326a f65551q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final LazyJavaClassMemberScope f65552r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f65553s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final InnerClassesScopeWrapper f65554t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final LazyJavaStaticClassScope f65555u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Annotations f65556v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final NotNullLazyValue<List<TypeParameterDescriptor>> f65557w;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$a */
    @SourceDebugExtension
    public final class C15326a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f65558d;

        public C15326a() {
            super(LazyJavaClassDescriptor.this.f65545k.m90512e());
            this.f65558d = LazyJavaClassDescriptor.this.f65545k.m90512e().mo93337e(new ear(LazyJavaClassDescriptor.this));
        }

        /* JADX INFO: renamed from: N */
        public static final List m90567N(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            return TypeParameterUtilsKt.m89500g(lazyJavaClassDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: J */
        public ClassDescriptor mo89207e() {
            return LazyJavaClassDescriptor.this;
        }

        /* JADX INFO: renamed from: L */
        public final KotlinType m90568L() {
            FqName fqNameM90270b;
            ArrayList arrayList;
            FqName fqNameM90569M = m90569M();
            if (fqNameM90569M == null || fqNameM90569M.m91939c() || !fqNameM90569M.m91944h(StandardNames.f64508z)) {
                fqNameM90569M = null;
            }
            if (fqNameM90569M == null) {
                fqNameM90270b = FakePureImplementationsProvider.INSTANCE.m90270b(DescriptorUtilsKt.m92873o(LazyJavaClassDescriptor.this));
                if (fqNameM90270b == null) {
                    return null;
                }
            } else {
                fqNameM90270b = fqNameM90569M;
            }
            ClassDescriptor classDescriptorM92858B = DescriptorUtilsKt.m92858B(LazyJavaClassDescriptor.this.f65545k.m90511d(), fqNameM90270b, NoLookupLocation.FROM_JAVA_LOADER);
            if (classDescriptorM92858B == null) {
                return null;
            }
            int size = classDescriptorM92858B.mo89196l().getParameters().size();
            List<TypeParameterDescriptor> parameters = LazyJavaClassDescriptor.this.mo89196l().getParameters();
            parameters.getClass();
            int size2 = parameters.size();
            if (size2 == size) {
                List<TypeParameterDescriptor> list = parameters;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).mo89349o()));
                }
            } else {
                if (size2 != 1 || size <= 1 || fqNameM90569M != null) {
                    return null;
                }
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) CollectionsKt.single((List) parameters)).mo89349o());
                IntRange intRange = new IntRange(1, size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it2 = intRange.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(typeProjectionImpl);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.m93522h(TypeAttributes.Companion.m93600k(), classDescriptorM92858B, arrayList);
        }

        /* JADX INFO: renamed from: M */
        public final FqName m90569M() {
            String strMo92809b;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName fqName = JvmAnnotationNames.f65384r;
            fqName.getClass();
            AnnotationDescriptor annotationDescriptorMo89529b = annotations.mo89529b(fqName);
            if (annotationDescriptorMo89529b == null) {
                return null;
            }
            Object objSingleOrNull = CollectionsKt.singleOrNull(annotationDescriptorMo89529b.mo89521a().values());
            StringValue stringValue = objSingleOrNull instanceof StringValue ? (StringValue) objSingleOrNull : null;
            if (stringValue == null || (strMo92809b = stringValue.mo92809b()) == null || !FqNamesUtilKt.m91965e(strMo92809b)) {
                return null;
            }
            return new FqName(strMo92809b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo89208g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f65558d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo89209s() {
            Collection<JavaClassifierType> collectionMo89922c = LazyJavaClassDescriptor.this.m90562L0().mo89922c();
            ArrayList arrayList = new ArrayList(collectionMo89922c.size());
            ArrayList<JavaType> arrayList2 = new ArrayList(0);
            KotlinType kotlinTypeM90568L = m90568L();
            Iterator<JavaClassifierType> it = collectionMo89922c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType kotlinTypeM90980q = LazyJavaClassDescriptor.this.f65545k.m90508a().m90490r().m90980q(LazyJavaClassDescriptor.this.f65545k.m90514g().m90765p(next, JavaTypeAttributesKt.m90749b(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f65545k);
                if (kotlinTypeM90980q.mo92781G0().mo89207e() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!Intrinsics.m88377d(kotlinTypeM90980q.mo92781G0(), kotlinTypeM90568L != null ? kotlinTypeM90568L.mo92781G0() : null) && !KotlinBuiltIns.m89070c0(kotlinTypeM90980q)) {
                    arrayList.add(kotlinTypeM90980q);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.f65544j;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, classDescriptor != null ? MappingUtilKt.m89333a(classDescriptor, LazyJavaClassDescriptor.this).m93648c().m93673q(classDescriptor.mo89349o(), Variance.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, kotlinTypeM90568L);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterM90475c = LazyJavaClassDescriptor.this.f65545k.m90508a().m90475c();
                ClassDescriptor classDescriptorMo89207e = mo89207e();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (JavaType javaType : arrayList2) {
                    javaType.getClass();
                    arrayList3.add(((JavaClassifierType) javaType).mo89934s());
                }
                errorReporterM90475c.mo89850b(classDescriptorMo89207e, arrayList3);
            }
            return !arrayList.isEmpty() ? CollectionsKt.toList(arrayList) : CollectionsKt.listOf(LazyJavaClassDescriptor.this.f65545k.m90511d().mo89437f().m89123i());
        }

        @NotNull
        public String toString() {
            String strM91973b = LazyJavaClassDescriptor.this.getName().m91973b();
            strM91973b.getClass();
            return strM91973b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo89210w() {
            return LazyJavaClassDescriptor.this.f65545k.m90508a().m90494v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaClass javaClass, @Nullable ClassDescriptor classDescriptor) {
        ClassKind classKind;
        Modality modalityM89432a;
        super(lazyJavaResolverContext.m90512e(), declarationDescriptor, javaClass.getName(), lazyJavaResolverContext.m90508a().m90492t().mo89855a(javaClass), false);
        lazyJavaResolverContext.getClass();
        declarationDescriptor.getClass();
        javaClass.getClass();
        this.f65542h = lazyJavaResolverContext;
        this.f65543i = javaClass;
        this.f65544j = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextM90465f = ContextKt.m90465f(lazyJavaResolverContext, this, javaClass, 0, 4, null);
        this.f65545k = lazyJavaResolverContextM90465f;
        lazyJavaResolverContextM90465f.m90508a().m90480h().mo90427c(javaClass, this);
        javaClass.mo89927v();
        this.f65546l = LazyKt__LazyJVMKt.m88118b(new bar(this));
        if (javaClass.mo89925l()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (javaClass.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = javaClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.f65547m = classKind;
        if (javaClass.mo89925l() || javaClass.isEnum()) {
            modalityM89432a = Modality.FINAL;
        } else {
            modalityM89432a = Modality.Companion.m89432a(javaClass.mo89913D(), javaClass.mo89913D() || javaClass.isAbstract() || javaClass.isInterface(), !javaClass.isFinal());
        }
        this.f65548n = modalityM89432a;
        this.f65549o = javaClass.getVisibility();
        this.f65550p = (javaClass.mo89924h() == null || javaClass.mo89914H()) ? false : true;
        this.f65551q = new C15326a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextM90465f, this, javaClass, classDescriptor != null, null, 16, null);
        this.f65552r = lazyJavaClassMemberScope;
        this.f65553s = ScopesHolderForClass.Companion.m89483a(this, lazyJavaResolverContextM90465f.m90512e(), lazyJavaResolverContextM90465f.m90508a().m90483k().mo93830c(), new car(this));
        this.f65554t = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f65555u = new LazyJavaStaticClassScope(lazyJavaResolverContextM90465f, javaClass, this);
        this.f65556v = LazyJavaAnnotationsKt.m90503a(lazyJavaResolverContextM90465f, javaClass);
        this.f65557w = lazyJavaResolverContextM90465f.m90512e().mo93337e(new dar(this));
    }

    /* JADX INFO: renamed from: J0 */
    public static final List m90557J0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f65543i.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor typeParameterDescriptorMo90517a = lazyJavaClassDescriptor.f65545k.m90513f().mo90517a(javaTypeParameter);
            if (typeParameterDescriptorMo90517a == null) {
                StringBuilder sb = new StringBuilder("Parameter ");
                sb.append(javaTypeParameter);
                JavaClass javaClass = lazyJavaClassDescriptor.f65543i;
                sb.append(" surely belongs to class ");
                sb.append(javaClass);
                sb.append(", so it must be resolved");
                throw new AssertionError(sb.toString());
            }
            arrayList.add(typeParameterDescriptorMo90517a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static final List m90558P0(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(lazyJavaClassDescriptor);
        if (classIdM92872n != null) {
            return lazyJavaClassDescriptor.f65542h.m90508a().m90478f().mo90296a(classIdM92872n);
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final LazyJavaClassMemberScope m90559Q0(LazyJavaClassDescriptor lazyJavaClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f65545k, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f65543i, lazyJavaClassDescriptor.f65544j != null, lazyJavaClassDescriptor.f65552r);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: C */
    public MemberScope mo89345C() {
        return this.f65554t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo89181C0() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public final LazyJavaClassDescriptor m90560I0(@NotNull JavaResolverCache javaResolverCache, @Nullable ClassDescriptor classDescriptor) {
        javaResolverCache.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.f65545k;
        LazyJavaResolverContext lazyJavaResolverContextM90472m = ContextKt.m90472m(lazyJavaResolverContext, lazyJavaResolverContext.m90508a().m90496x(javaResolverCache));
        DeclarationDescriptor declarationDescriptorMo89190b = mo89190b();
        declarationDescriptorMo89190b.getClass();
        return new LazyJavaClassDescriptor(lazyJavaResolverContextM90472m, declarationDescriptorMo89190b, this.f65543i, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> getConstructors() {
        return this.f65552r.m90620a1().invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final JavaClass m90562L0() {
        return this.f65543i;
    }

    @Nullable
    /* JADX INFO: renamed from: M0 */
    public final List<JavaAnnotation> m90563M0() {
        return (List) this.f65546l.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope mo89346D() {
        MemberScope memberScopeMo89346D = super.mo89346D();
        memberScopeMo89346D.getClass();
        return (LazyJavaClassMemberScope) memberScopeMo89346D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return (LazyJavaClassMemberScope) this.f65553s.m89481c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo89191c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f65556v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.f65547m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        if (!Intrinsics.m88377d(this.f65549o, DescriptorVisibilities.f64696a) || this.f65543i.mo89924h() != null) {
            return UtilsKt.m90396d(this.f65549o);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f65338a;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo89193h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        return this.f65548n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo89195j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        return this.f65551q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public MemberScope mo89199o0() {
        return this.f65555u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo89200p() {
        return this.f65557w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo89201p0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo89202q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo89203t() {
        return this.f65550p;
    }

    @NotNull
    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.m92874p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo89204v() {
        return null;
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? null : classDescriptor);
    }
}
