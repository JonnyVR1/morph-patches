package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d8r;
import p149l.ddk0;
import p149l.e8r;
import p149l.f8r;
import p149l.g8r;
import p149l.h8r;
import p149l.i8r;
import p149l.j8r;
import p149l.k8r;
import p149l.l8r;
import p149l.m8r;
import p149l.wtq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ClassDescriptor f64886m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final JavaClass f64887n;

    /* JADX INFO: renamed from: o */
    public final boolean f64888o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> f64889p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f64890q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f64891r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final NotNullLazyValue<Map<Name, JavaField>> f64892s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final MemoizedFunctionToNullable<Name, ClassDescriptor> f64893t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull JavaClass javaClass, boolean z, @Nullable LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        javaClass.getClass();
        this.f64886m = classDescriptor;
        this.f64887n = javaClass;
        this.f64888o = z;
        this.f64889p = lazyJavaResolverContext.m89621e().mo92446e(new d8r(this, lazyJavaResolverContext));
        this.f64890q = lazyJavaResolverContext.m89621e().mo92446e(new e8r(this));
        this.f64891r = lazyJavaResolverContext.m89621e().mo92446e(new f8r(lazyJavaResolverContext, this));
        this.f64892s = lazyJavaResolverContext.m89621e().mo92446e(new g8r(this));
        this.f64893t = lazyJavaResolverContext.m89621e().mo92444c(new h8r(this, lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: A0 */
    public static final Collection m89679A0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return lazyJavaClassMemberScope.m89741q1(name);
    }

    /* JADX INFO: renamed from: B0 */
    public static final Collection m89680B0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return lazyJavaClassMemberScope.m89742r1(name);
    }

    /* JADX INFO: renamed from: D0 */
    public static final List m89681D0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        Collection<JavaConstructor> constructors = lazyJavaClassMemberScope.f64887n.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<JavaConstructor> it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.m89739o1(it.next()));
        }
        if (lazyJavaClassMemberScope.f64887n.mo89038z()) {
            ClassConstructorDescriptor classConstructorDescriptorM89708G0 = lazyJavaClassMemberScope.m89708G0();
            String strM90378c = MethodSignatureMappingKt.m90378c(classConstructorDescriptorM89708G0, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(classConstructorDescriptorM89708G0);
                        lazyJavaResolverContext.m89617a().m89589h().mo89534a(lazyJavaClassMemberScope.f64887n, classConstructorDescriptorM89708G0);
                        break;
                    }
                } while (!Intrinsics.m87488d(MethodSignatureMappingKt.m90378c((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strM90378c));
            } else {
                arrayList.add(classConstructorDescriptorM89708G0);
                lazyJavaResolverContext.m89617a().m89589h().mo89534a(lazyJavaClassMemberScope.f64887n, classConstructorDescriptorM89708G0);
                break;
            }
        }
        lazyJavaResolverContext.m89617a().m89604w().mo91998a(lazyJavaClassMemberScope.mo89719R(), arrayList, lazyJavaResolverContext);
        SignatureEnhancement signatureEnhancementM89599r = lazyJavaResolverContext.m89617a().m89599r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listListOfNotNull = arrayList;
        if (zIsEmpty) {
            listListOfNotNull = CollectionsKt.listOfNotNull(lazyJavaClassMemberScope.m89707F0());
        }
        return CollectionsKt.toList(signatureEnhancementM89599r.m90088p(lazyJavaResolverContext, listListOfNotNull));
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ JavaPropertyDescriptor m89682L0(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.m89712K0(javaMethod, kotlinType, modality);
    }

    /* JADX INFO: renamed from: U0 */
    public static final Map m89683U0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Collection<JavaField> fields = lazyJavaClassMemberScope.f64887n.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((JavaField) obj).mo89050F()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Set m89684Y0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.toSet(lazyJavaResolverContext.m89617a().m89604w().mo92000c(lazyJavaClassMemberScope.mo89719R(), lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: g1 */
    public static final Collection m89686g1(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return Intrinsics.m87488d(simpleFunctionDescriptor.getName(), name) ? CollectionsKt.listOf(simpleFunctionDescriptor) : CollectionsKt.plus((Collection) lazyJavaClassMemberScope.m89741q1(name), (Iterable) lazyJavaClassMemberScope.m89742r1(name));
    }

    /* JADX INFO: renamed from: h1 */
    public static final Set m89688h1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.toSet(lazyJavaClassMemberScope.f64887n.mo89035q());
    }

    /* JADX INFO: renamed from: i1 */
    public static final ClassDescriptor m89690i1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext, Name name) {
        name.getClass();
        if (lazyJavaClassMemberScope.f64890q.invoke().contains(name)) {
            JavaClassFinder javaClassFinderM89585d = lazyJavaResolverContext.m89617a().m89585d();
            ClassId classIdM91981n = DescriptorUtilsKt.m91981n(lazyJavaClassMemberScope.mo89719R());
            classIdM91981n.getClass();
            JavaClass javaClassMo88942b = javaClassFinderM89585d.mo88942b(new JavaClassFinder.Request(classIdM91981n.m91036d(name), null, lazyJavaClassMemberScope.f64887n, 2, null));
            if (javaClassMo88942b == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.mo89719R(), javaClassMo88942b, null, 8, null);
            lazyJavaResolverContext.m89617a().m89586e().mo89383a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!lazyJavaClassMemberScope.f64891r.invoke().contains(name)) {
            JavaField javaField = lazyJavaClassMemberScope.f64892s.invoke().get(name);
            if (javaField == null) {
                return null;
            }
            return EnumEntrySyntheticClassDescriptor.m88713E0(lazyJavaResolverContext.m89621e(), lazyJavaClassMemberScope.mo89719R(), name, lazyJavaResolverContext.m89621e().mo92446e(new m8r(lazyJavaClassMemberScope)), LazyJavaAnnotationsKt.m89612a(lazyJavaResolverContext, javaField), lazyJavaResolverContext.m89617a().m89601t().mo88964a(javaField));
        }
        List<ClassDescriptor> listCreateListBuilder = CollectionsKt.createListBuilder();
        lazyJavaResolverContext.m89617a().m89604w().mo92005h(lazyJavaClassMemberScope.mo89719R(), name, listCreateListBuilder, lazyJavaResolverContext);
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        int size = listBuild.size();
        if (size != 0) {
            if (size == 1) {
                return (ClassDescriptor) CollectionsKt.single(listBuild);
            }
            ddk0.m111027a("Multiple classes with same name are generated: ", listBuild);
        }
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Set m89692j1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return SetsKt.plus((Set) lazyJavaClassMemberScope.mo88719a(), (Iterable) lazyJavaClassMemberScope.mo88722d());
    }

    /* JADX INFO: renamed from: z0 */
    public static final boolean m89701z0(JavaMember javaMember) {
        javaMember.getClass();
        return !javaMember.mo89023H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo89702B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        Set<SimpleFunctionDescriptor> setM89730b1 = m89730b1(name);
        if (!SpecialGenericSignatures.Companion.m89495k(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.m89354n(name)) {
            Set<SimpleFunctionDescriptor> set = setM89730b1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (m89734f1((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            m89745t0(collection, name, arrayList, false);
            return;
        }
        SmartSet smartSetM93221a = SmartSet.Companion.m93221a();
        Collection<? extends SimpleFunctionDescriptor> collectionM89509d = DescriptorResolverUtils.m89509d(name, setM89730b1, CollectionsKt.emptyList(), mo89719R(), ErrorReporter.f66016a, m89805L().m89617a().m89592k().mo92938b());
        collectionM89509d.getClass();
        m89746u0(name, collection, collectionM89509d, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        m89746u0(name, collection, collectionM89509d, smartSetM93221a, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setM89730b1) {
            if (m89734f1((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m89745t0(collection, name, CollectionsKt.plus((Collection) arrayList2, (Iterable) smartSetM93221a), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: C */
    public void mo89703C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        name.getClass();
        collection.getClass();
        if (this.f64887n.mo89034l()) {
            m89749w0(name, collection);
        }
        Set<PropertyDescriptor> setM89732d1 = m89732d1(name);
        if (setM89732d1.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetM93221a = companion.m93221a();
        SmartSet smartSetM93221a2 = companion.m93221a();
        m89748v0(setM89732d1, collection, smartSetM93221a, new k8r(this));
        m89748v0(SetsKt.minus((Set) setM89732d1, (Iterable) smartSetM93221a), smartSetM93221a2, null, new l8r(this));
        Collection<? extends PropertyDescriptor> collectionM89509d = DescriptorResolverUtils.m89509d(name, SetsKt.plus((Set) setM89732d1, (Iterable) smartSetM93221a2), collection, mo89719R(), m89805L().m89617a().m89584c(), m89805L().m89617a().m89592k().mo92938b());
        collectionM89509d.getClass();
        collection.addAll(collectionM89509d);
    }

    /* JADX INFO: renamed from: C0 */
    public final Collection<KotlinType> m89704C0() {
        if (!this.f64888o) {
            return m89805L().m89617a().m89592k().mo92939c().mo92912g(mo89719R());
        }
        Collection<KotlinType> collectionMo88678c = mo89719R().mo88305l().mo88678c();
        collectionMo88678c.getClass();
        return collectionMo88678c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo89705D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        if (this.f64887n.mo89034l()) {
            return mo88719a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m89807N().invoke().mo89635d());
        Collection<KotlinType> collectionMo88678c = mo89719R().mo88305l().mo88678c();
        collectionMo88678c.getClass();
        Iterator<T> it = collectionMo88678c.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo89900n().mo88722d());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: E0 */
    public final List<ValueParameterDescriptor> m89706E0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl2;
        Pair pair;
        Collection<JavaMethod> methods = this.f64887n.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes javaTypeAttributesM89858b = JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (Intrinsics.m87488d(((JavaMethod) obj).getName(), JvmAnnotationNames.f64695c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<JavaMethod> list2 = (List) pair2.component2();
        list.size();
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.firstOrNull(list);
        if (javaMethod != null) {
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair = new Pair(m89805L().m89623g().m89872l(javaArrayType, javaTypeAttributesM89858b, true), m89805L().m89623g().m89874p(javaArrayType.mo89013k(), javaTypeAttributesM89858b));
            } else {
                pair = new Pair(m89805L().m89623g().m89874p(returnType, javaTypeAttributesM89858b), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            lazyJavaClassMemberScope = this;
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
            lazyJavaClassMemberScope.m89743s0(arrayList, classConstructorDescriptorImpl2, 0, javaMethod, kotlinType, kotlinType2);
        } else {
            lazyJavaClassMemberScope = this;
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
        }
        int i = 0;
        int i2 = javaMethod == null ? 0 : 1;
        for (JavaMethod javaMethod2 : list2) {
            lazyJavaClassMemberScope.m89743s0(arrayList, classConstructorDescriptorImpl2, i + i2, javaMethod2, lazyJavaClassMemberScope.m89805L().m89623g().m89874p(javaMethod2.getReturnType(), javaTypeAttributesM89858b), null);
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public final ClassConstructorDescriptor m89707F0() {
        boolean zMo89034l = this.f64887n.mo89034l();
        if ((this.f64887n.isInterface() || !this.f64887n.mo89021A()) && !zMo89034l) {
            return null;
        }
        ClassDescriptor classDescriptorMo89719R = mo89719R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM89556m1 = JavaClassConstructorDescriptor.m89556m1(classDescriptorMo89719R, Annotations.Companion.m88641b(), true, m89805L().m89617a().m89601t().mo88964a(this.f64887n));
        javaClassConstructorDescriptorM89556m1.getClass();
        List<ValueParameterDescriptor> listM89706E0 = zMo89034l ? m89706E0(javaClassConstructorDescriptorM89556m1) : Collections.EMPTY_LIST;
        javaClassConstructorDescriptorM89556m1.mo88751S0(false);
        javaClassConstructorDescriptorM89556m1.m88701j1(listM89706E0, m89728Z0(classDescriptorMo89719R));
        javaClassConstructorDescriptorM89556m1.mo88750R0(true);
        javaClassConstructorDescriptorM89556m1.m88757Z0(classDescriptorMo89719R.mo88458o());
        m89805L().m89617a().m89589h().mo89534a(this.f64887n, javaClassConstructorDescriptorM89556m1);
        return javaClassConstructorDescriptorM89556m1;
    }

    /* JADX INFO: renamed from: G0 */
    public final ClassConstructorDescriptor m89708G0() {
        ClassDescriptor classDescriptorMo89719R = mo89719R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM89556m1 = JavaClassConstructorDescriptor.m89556m1(classDescriptorMo89719R, Annotations.Companion.m88641b(), true, m89805L().m89617a().m89601t().mo88964a(this.f64887n));
        javaClassConstructorDescriptorM89556m1.getClass();
        List<ValueParameterDescriptor> listM89713M0 = m89713M0(javaClassConstructorDescriptorM89556m1);
        javaClassConstructorDescriptorM89556m1.mo88751S0(false);
        javaClassConstructorDescriptorM89556m1.m88701j1(listM89713M0, m89728Z0(classDescriptorMo89719R));
        javaClassConstructorDescriptorM89556m1.mo88750R0(false);
        javaClassConstructorDescriptorM89556m1.m88757Z0(classDescriptorMo89719R.mo88458o());
        return javaClassConstructorDescriptorM89556m1;
    }

    /* JADX INFO: renamed from: H0 */
    public final SimpleFunctionDescriptor m89709H0(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!Intrinsics.m87488d(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.mo88515u0() == null && m89718Q0(simpleFunctionDescriptor2, callableDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.mo88514k().mo88520e().build();
                functionDescriptorBuild.getClass();
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: I0 */
    public final SimpleFunctionDescriptor m89710I0(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object next;
        Name name = functionDescriptor.getName();
        name.getClass();
        Iterator<T> it = function1.invoke(name).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m89733e1((SimpleFunctionDescriptor) next, functionDescriptor));
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo88514k = simpleFunctionDescriptor.mo88514k();
        List<ValueParameterDescriptor> listMo88448g = functionDescriptor.mo88448g();
        listMo88448g.getClass();
        List<ValueParameterDescriptor> list = listMo88448g;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
        }
        List<ValueParameterDescriptor> listMo88448g2 = simpleFunctionDescriptor.mo88448g();
        listMo88448g2.getClass();
        copyBuilderMo88514k.mo88529n(UtilKt.m89567a(arrayList, listMo88448g2, functionDescriptor));
        copyBuilderMo88514k.mo88535t();
        copyBuilderMo88514k.mo88522g();
        copyBuilderMo88514k.mo88519d(JavaMethodDescriptor.f64800H, Boolean.TRUE);
        return (SimpleFunctionDescriptor) copyBuilderMo88514k.build();
    }

    /* JADX INFO: renamed from: J0 */
    public final JavaPropertyDescriptor m89711J0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM89726X0;
        PropertySetterDescriptorImpl propertySetterDescriptorImplM91741m = null;
        if (!m89717P0(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM89725W0 = m89725W0(propertyDescriptor, function1);
        simpleFunctionDescriptorM89725W0.getClass();
        if (propertyDescriptor.mo88620y()) {
            simpleFunctionDescriptorM89726X0 = m89726X0(propertyDescriptor, function1);
            simpleFunctionDescriptorM89726X0.getClass();
        } else {
            simpleFunctionDescriptorM89726X0 = null;
        }
        if (simpleFunctionDescriptorM89726X0 != null) {
            simpleFunctionDescriptorM89726X0.mo88303i();
            simpleFunctionDescriptorM89725W0.mo88303i();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(mo89719R(), simpleFunctionDescriptorM89725W0, simpleFunctionDescriptorM89726X0, propertyDescriptor);
        KotlinType returnType = simpleFunctionDescriptorM89725W0.getReturnType();
        returnType.getClass();
        javaForKotlinOverridePropertyDescriptor.m88864V0(returnType, CollectionsKt.emptyList(), mo89715O(), null, CollectionsKt.emptyList());
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM91739k = DescriptorFactory.m91739k(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorM89725W0.getAnnotations(), false, false, false, simpleFunctionDescriptorM89725W0.getSource());
        propertyGetterDescriptorImplM91739k.m88843G0(simpleFunctionDescriptorM89725W0);
        propertyGetterDescriptorImplM91739k.m88891J0(javaForKotlinOverridePropertyDescriptor.getType());
        if (simpleFunctionDescriptorM89726X0 != null) {
            List<ValueParameterDescriptor> listMo88448g = simpleFunctionDescriptorM89726X0.mo88448g();
            listMo88448g.getClass();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) listMo88448g);
            if (valueParameterDescriptor == null) {
                wtq.m205579a("No parameter found for ", simpleFunctionDescriptorM89726X0);
                return null;
            }
            propertySetterDescriptorImplM91741m = DescriptorFactory.m91741m(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorM89726X0.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorM89726X0.getVisibility(), simpleFunctionDescriptorM89726X0.getSource());
            propertySetterDescriptorImplM91741m.m88843G0(simpleFunctionDescriptorM89726X0);
        }
        javaForKotlinOverridePropertyDescriptor.m88858O0(propertyGetterDescriptorImplM91739k, propertySetterDescriptorImplM91741m);
        return javaForKotlinOverridePropertyDescriptor;
    }

    /* JADX INFO: renamed from: K0 */
    public final JavaPropertyDescriptor m89712K0(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        KotlinType kotlinTypeM89802A;
        JavaPropertyDescriptor javaPropertyDescriptorM89566Z0 = JavaPropertyDescriptor.m89566Z0(mo89719R(), LazyJavaAnnotationsKt.m89612a(m89805L(), javaMethod), modality, UtilsKt.m89505d(javaMethod.getVisibility()), false, javaMethod.getName(), m89805L().m89617a().m89601t().mo88964a(javaMethod), false);
        javaPropertyDescriptorM89566Z0.getClass();
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM91732d = DescriptorFactory.m91732d(javaPropertyDescriptorM89566Z0, Annotations.Companion.m88641b());
        propertyGetterDescriptorImplM91732d.getClass();
        javaPropertyDescriptorM89566Z0.m88858O0(propertyGetterDescriptorImplM91732d, null);
        if (kotlinType == null) {
            LazyJavaResolverContext lazyJavaResolverContextM89577i = ContextKt.m89577i(m89805L(), javaPropertyDescriptorM89566Z0, javaMethod, 0, 4, null);
            lazyJavaClassMemberScope = this;
            kotlinTypeM89802A = lazyJavaClassMemberScope.m89802A(javaMethod, lazyJavaResolverContextM89577i);
        } else {
            lazyJavaClassMemberScope = this;
            kotlinTypeM89802A = kotlinType;
        }
        javaPropertyDescriptorM89566Z0.m88864V0(kotlinTypeM89802A, CollectionsKt.emptyList(), lazyJavaClassMemberScope.mo89715O(), null, CollectionsKt.emptyList());
        propertyGetterDescriptorImplM91732d.m88891J0(kotlinTypeM89802A);
        return javaPropertyDescriptorM89566Z0;
    }

    /* JADX INFO: renamed from: M0 */
    public final List<ValueParameterDescriptor> m89713M0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection<JavaRecordComponent> collectionMo89037y = this.f64887n.mo89037y();
        ArrayList arrayList = new ArrayList(collectionMo89037y.size());
        JavaTypeAttributes javaTypeAttributesM89858b = JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<T> it = collectionMo89037y.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            i = i2 + 1;
            JavaRecordComponent javaRecordComponent = (JavaRecordComponent) it.next();
            KotlinType kotlinTypeM89874p = m89805L().m89623g().m89874p(javaRecordComponent.getType(), javaTypeAttributesM89858b);
            arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i2, Annotations.Companion.m88641b(), javaRecordComponent.getName(), kotlinTypeM89874p, false, false, false, javaRecordComponent.mo89066a() ? m89805L().m89617a().m89594m().mo88546f().m88234k(kotlinTypeM89874p) : null, m89805L().m89617a().m89601t().mo88964a(javaRecordComponent)));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final SimpleFunctionDescriptor m89714N0(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo88514k = simpleFunctionDescriptor.mo88514k();
        copyBuilderMo88514k.mo88521f(name);
        copyBuilderMo88514k.mo88535t();
        copyBuilderMo88514k.mo88522g();
        FunctionDescriptor functionDescriptorBuild = copyBuilderMo88514k.build();
        functionDescriptorBuild.getClass();
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    /* JADX INFO: renamed from: O */
    public ReceiverParameterDescriptor mo89715O() {
        return DescriptorUtils.m91771l(mo89719R());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX INFO: renamed from: O0 */
    public final SimpleFunctionDescriptor m89716O0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName fqNameM91068m;
        FqNameUnsafe fqNameUnsafeM91983p;
        List<ValueParameterDescriptor> listMo88448g = simpleFunctionDescriptor.mo88448g();
        listMo88448g.getClass();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) listMo88448g);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo88316e = valueParameterDescriptor.getType().mo91890G0().mo88316e();
            if (classifierDescriptorMo88316e == null || (fqNameUnsafeM91983p = DescriptorUtilsKt.m91983p(classifierDescriptorMo88316e)) == null) {
                fqNameM91068m = null;
            } else {
                if (!fqNameUnsafeM91983p.m91062f()) {
                    fqNameUnsafeM91983p = null;
                }
                if (fqNameUnsafeM91983p != null) {
                    fqNameM91068m = fqNameUnsafeM91983p.m91068m();
                } else {
                    fqNameM91068m = null;
                }
            }
            if (!Intrinsics.m87488d(fqNameM91068m, StandardNames.f63830v)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo88514k = simpleFunctionDescriptor.mo88514k();
                List<ValueParameterDescriptor> listMo88448g2 = simpleFunctionDescriptor.mo88448g();
                listMo88448g2.getClass();
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderMo88514k.mo88529n(CollectionsKt.dropLast(listMo88448g2, 1)).mo88523h(valueParameterDescriptor.getType().mo91888E0().get(0).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.m88758a1(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m89717P0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.m89639a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM89725W0 = m89725W0(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorM89726X0 = m89726X0(propertyDescriptor, function1);
        if (simpleFunctionDescriptorM89725W0 == null) {
            return false;
        }
        if (propertyDescriptor.mo88620y()) {
            return simpleFunctionDescriptorM89726X0 != null && simpleFunctionDescriptorM89726X0.mo88303i() == simpleFunctionDescriptorM89725W0.mo88303i();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m89718Q0(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultM91846c = OverridingUtil.f65815f.m91838F(callableDescriptor2, callableDescriptor, true).m91846c();
        resultM91846c.getClass();
        return resultM91846c == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.m89402a(callableDescriptor2, callableDescriptor);
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m89720R0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Name nameM89486b = companion.m89486b(name);
        if (nameM89486b == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setM89730b1 = m89730b1(nameM89486b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM89730b1) {
            if (SpecialBuiltinMembers.m89466d((SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM89714N0 = m89714N0(simpleFunctionDescriptor, nameM89486b);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m89721S0((SimpleFunctionDescriptor) it.next(), simpleFunctionDescriptorM89714N0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m89721S0(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.m89346m(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.mo88445a();
        }
        functionDescriptor.getClass();
        return m89718Q0(functionDescriptor, simpleFunctionDescriptor);
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m89722T0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM89716O0 = m89716O0(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorM89716O0 == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Set<SimpleFunctionDescriptor> setM89730b1 = m89730b1(name);
        if ((setM89730b1 instanceof Collection) && setM89730b1.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : setM89730b1) {
            if (simpleFunctionDescriptor2.isSuspend() && m89718Q0(simpleFunctionDescriptorM89716O0, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: V */
    public boolean mo89723V(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        javaMethodDescriptor.getClass();
        if (this.f64887n.mo89034l()) {
            return false;
        }
        return m89734f1(javaMethodDescriptor);
    }

    /* JADX INFO: renamed from: V0 */
    public final SimpleFunctionDescriptor m89724V0(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        Iterator<T> it = function1.invoke(nameM91079i).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo88448g().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f66298a;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.mo92904d(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: W0 */
    public final SimpleFunctionDescriptor m89725W0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.m89469g(getter) : null;
        String strM89365b = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.m89365b(propertyGetterDescriptor) : null;
        if (strM89365b != null && !SpecialBuiltinMembers.m89474l(mo89719R(), propertyGetterDescriptor)) {
            return m89724V0(propertyDescriptor, strM89365b, function1);
        }
        String strM91082b = propertyDescriptor.getName().m91082b();
        strM91082b.getClass();
        return m89724V0(propertyDescriptor, JvmAbi.m89431b(strM91082b), function1);
    }

    /* JADX INFO: renamed from: X0 */
    public final SimpleFunctionDescriptor m89726X0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strM91082b = propertyDescriptor.getName().m91082b();
        strM91082b.getClass();
        Name nameM91079i = Name.m91079i(JvmAbi.m89434e(strM91082b));
        nameM91079i.getClass();
        Iterator<T> it = function1.invoke(nameM91079i).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo88448g().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.m88170D0(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f66298a;
                List<ValueParameterDescriptor> listMo88448g = simpleFunctionDescriptor2.mo88448g();
                listMo88448g.getClass();
                if (kotlinTypeChecker.mo92903a(((ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: Y */
    public LazyJavaScope.MethodSignatureData mo89727Y(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        javaMethod.getClass();
        list.getClass();
        kotlinType.getClass();
        list2.getClass();
        SignaturePropagator.PropagatedSignature propagatedSignatureMo89544a = m89805L().m89617a().m89600s().mo89544a(javaMethod, mo89719R(), kotlinType, null, list2, list);
        propagatedSignatureMo89544a.getClass();
        KotlinType kotlinTypeM89549d = propagatedSignatureMo89544a.m89549d();
        kotlinTypeM89549d.getClass();
        KotlinType kotlinTypeM89548c = propagatedSignatureMo89544a.m89548c();
        List<ValueParameterDescriptor> listM89551f = propagatedSignatureMo89544a.m89551f();
        listM89551f.getClass();
        List<TypeParameterDescriptor> listM89550e = propagatedSignatureMo89544a.m89550e();
        listM89550e.getClass();
        boolean zM89552g = propagatedSignatureMo89544a.m89552g();
        List<String> listM89547b = propagatedSignatureMo89544a.m89547b();
        listM89547b.getClass();
        return new LazyJavaScope.MethodSignatureData(kotlinTypeM89549d, kotlinTypeM89548c, listM89551f, listM89550e, zM89552g, listM89547b);
    }

    /* JADX INFO: renamed from: Z0 */
    public final DescriptorVisibility m89728Z0(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        visibility.getClass();
        if (!Intrinsics.m87488d(visibility, JavaDescriptorVisibilities.f64665b)) {
            return visibility;
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f64666c;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> m89729a1() {
        return this.f64889p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m89738n1(name, lookupLocation);
        return super.mo88720b(name, lookupLocation);
    }

    /* JADX INFO: renamed from: b1 */
    public final Set<SimpleFunctionDescriptor> m89730b1(Name name) {
        Collection<KotlinType> collectionM89704C0 = m89704C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionM89704C0.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo89900n().mo88720b(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m89738n1(name, lookupLocation);
        return super.mo88721c(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo89719R() {
        return this.f64886m;
    }

    /* JADX INFO: renamed from: d1 */
    public final Set<PropertyDescriptor> m89732d1(Name name) {
        Collection<KotlinType> collectionM89704C0 = m89704C0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionM89704C0.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> collectionMo88721c = ((KotlinType) it.next()).mo89900n().mo88721c(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88721c, 10));
            Iterator<T> it2 = collectionMo88721c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m89733e1(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strM90378c = MethodSignatureMappingKt.m90378c(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor functionDescriptorMo88445a = functionDescriptor.mo88445a();
        functionDescriptorMo88445a.getClass();
        return Intrinsics.m87488d(strM90378c, MethodSignatureMappingKt.m90378c(functionDescriptorMo88445a, false, false, 2, null)) && !m89718Q0(simpleFunctionDescriptor, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor classDescriptorInvoke;
        name.getClass();
        lookupLocation.getClass();
        m89738n1(name, lookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) m89809Q();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f64893t) == null || (classDescriptorInvoke = memoizedFunctionToNullable.invoke(name)) == null) ? this.f64893t.invoke(name) : classDescriptorInvoke;
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m89734f1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        List<Name> listM89457a = PropertiesConventionUtilKt.m89457a(name);
        if (!(listM89457a instanceof Collection) || !listM89457a.isEmpty()) {
            Iterator<T> it = listM89457a.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setM89732d1 = m89732d1((Name) it.next());
                if (!(setM89732d1 instanceof Collection) || !setM89732d1.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setM89732d1) {
                        if (m89717P0(propertyDescriptor, new j8r(simpleFunctionDescriptor, this))) {
                            if (!propertyDescriptor.mo88620y()) {
                                String strM91082b = simpleFunctionDescriptor.getName().m91082b();
                                strM91082b.getClass();
                                if (!JvmAbi.m89433d(strM91082b)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (m89720R0(simpleFunctionDescriptor) || m89744s1(simpleFunctionDescriptor) || m89722T0(simpleFunctionDescriptor)) ? false : true;
    }

    /* JADX INFO: renamed from: k1 */
    public final SimpleFunctionDescriptor m89735k1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM89710I0;
        FunctionDescriptor functionDescriptorM89349l = BuiltinMethodsWithSpecialGenericSignature.m89349l(simpleFunctionDescriptor);
        if (functionDescriptorM89349l != null && (simpleFunctionDescriptorM89710I0 = m89710I0(functionDescriptorM89349l, function1)) != null) {
            if (!m89734f1(simpleFunctionDescriptorM89710I0)) {
                simpleFunctionDescriptorM89710I0 = null;
            }
            if (simpleFunctionDescriptorM89710I0 != null) {
                return m89709H0(simpleFunctionDescriptorM89710I0, functionDescriptorM89349l, collection);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final SimpleFunctionDescriptor m89736l1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.m89469g(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String strM89467e = SpecialBuiltinMembers.m89467e(simpleFunctionDescriptor2);
        strM89467e.getClass();
        Name nameM91079i = Name.m91079i(strM89467e);
        nameM91079i.getClass();
        Iterator<? extends SimpleFunctionDescriptor> it = function1.invoke(nameM91079i).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorM89714N0 = m89714N0(it.next(), name);
            if (m89721S0(simpleFunctionDescriptor2, simpleFunctionDescriptorM89714N0)) {
                return m89709H0(simpleFunctionDescriptorM89714N0, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final SimpleFunctionDescriptor m89737m1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorM89716O0 = m89716O0((SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptorM89716O0 == null || !m89718Q0(simpleFunctionDescriptorM89716O0, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorM89716O0 = null;
            }
            if (simpleFunctionDescriptorM89716O0 != null) {
                return simpleFunctionDescriptorM89716O0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public void m89738n1(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.m89074a(m89805L().m89617a().m89593l(), lookupLocation, mo89719R(), name);
    }

    /* JADX INFO: renamed from: o1 */
    public final JavaClassConstructorDescriptor m89739o1(JavaConstructor javaConstructor) {
        ClassDescriptor classDescriptorMo89719R = mo89719R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM89556m1 = JavaClassConstructorDescriptor.m89556m1(classDescriptorMo89719R, LazyJavaAnnotationsKt.m89612a(m89805L(), javaConstructor), false, m89805L().m89617a().m89601t().mo88964a(javaConstructor));
        javaClassConstructorDescriptorM89556m1.getClass();
        LazyJavaResolverContext lazyJavaResolverContextM89576h = ContextKt.m89576h(m89805L(), javaClassConstructorDescriptorM89556m1, javaConstructor, classDescriptorMo89719R.mo88309p().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersM89815d0 = m89815d0(lazyJavaResolverContextM89576h, javaClassConstructorDescriptorM89556m1, javaConstructor.mo89047g());
        List<TypeParameterDescriptor> listMo88309p = classDescriptorMo89719R.mo88309p();
        listMo88309p.getClass();
        List<TypeParameterDescriptor> list = listMo88309p;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorMo89626a = lazyJavaResolverContextM89576h.m89622f().mo89626a((JavaTypeParameter) it.next());
            typeParameterDescriptorMo89626a.getClass();
            arrayList.add(typeParameterDescriptorMo89626a);
        }
        javaClassConstructorDescriptorM89556m1.m88702k1(resolvedValueParametersM89815d0.m89824a(), UtilsKt.m89505d(javaConstructor.getVisibility()), CollectionsKt.plus((Collection) list, (Iterable) arrayList));
        javaClassConstructorDescriptorM89556m1.mo88750R0(false);
        javaClassConstructorDescriptorM89556m1.mo88751S0(resolvedValueParametersM89815d0.m89825b());
        javaClassConstructorDescriptorM89556m1.m88757Z0(classDescriptorMo89719R.mo88458o());
        lazyJavaResolverContextM89576h.m89617a().m89589h().mo89534a(javaConstructor, javaClassConstructorDescriptorM89556m1);
        return javaClassConstructorDescriptorM89556m1;
    }

    /* JADX INFO: renamed from: p1 */
    public final JavaMethodDescriptor m89740p1(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor javaMethodDescriptorM89561i1 = JavaMethodDescriptor.m89561i1(mo89719R(), LazyJavaAnnotationsKt.m89612a(m89805L(), javaRecordComponent), javaRecordComponent.getName(), m89805L().m89617a().m89601t().mo88964a(javaRecordComponent), true);
        javaMethodDescriptorM89561i1.getClass();
        javaMethodDescriptorM89561i1.mo88902h1(null, mo89715O(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), m89805L().m89623g().m89874p(javaRecordComponent.getType(), JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.m88541a(false, false, true), DescriptorVisibilities.f64026e, null);
        javaMethodDescriptorM89561i1.m89564l1(false, false);
        m89805L().m89617a().m89589h().mo89535b(javaRecordComponent, javaMethodDescriptorM89561i1);
        return javaMethodDescriptorM89561i1;
    }

    /* JADX INFO: renamed from: q1 */
    public final Collection<SimpleFunctionDescriptor> m89741q1(Name name) {
        Collection<JavaMethod> collectionMo89636e = m89807N().invoke().mo89636e(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89636e, 10));
        Iterator<T> it = collectionMo89636e.iterator();
        while (it.hasNext()) {
            arrayList.add(m89813Z((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r1 */
    public final Collection<SimpleFunctionDescriptor> m89742r1(Name name) {
        Set<SimpleFunctionDescriptor> setM89730b1 = m89730b1(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM89730b1) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.m89466d(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.m89349l(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m89743s0(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations annotationsM88641b = Annotations.Companion.m88641b();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeM92803n = TypeUtils.m92803n(kotlinType);
        kotlinTypeM92803n.getClass();
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i, annotationsM88641b, name, kotlinTypeM92803n, javaMethod.mo89057G(), false, false, kotlinType2 != null ? TypeUtils.m92803n(kotlinType2) : null, m89805L().m89617a().m89601t().mo88964a(javaMethod)));
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m89744s1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        if (!builtinMethodsWithSpecialGenericSignature.m89354n(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        name2.getClass();
        Set<SimpleFunctionDescriptor> setM89730b1 = m89730b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setM89730b1.iterator();
        while (it.hasNext()) {
            FunctionDescriptor functionDescriptorM89349l = BuiltinMethodsWithSpecialGenericSignature.m89349l((SimpleFunctionDescriptor) it.next());
            if (functionDescriptorM89349l != null) {
                arrayList.add(functionDescriptorM89349l);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (m89733e1(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m89745t0(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<? extends SimpleFunctionDescriptor> collectionM89509d = DescriptorResolverUtils.m89509d(name, collection2, collection, mo89719R(), m89805L().m89617a().m89584c(), m89805L().m89617a().m89592k().mo92938b());
        collectionM89509d.getClass();
        if (!z) {
            collection.addAll(collectionM89509d);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = collectionM89509d;
        List listPlus = CollectionsKt.plus((Collection) collection, (Iterable) collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorM89709H0 : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.m89472j(simpleFunctionDescriptorM89709H0);
            if (simpleFunctionDescriptor == null) {
                simpleFunctionDescriptorM89709H0.getClass();
            } else {
                simpleFunctionDescriptorM89709H0.getClass();
                simpleFunctionDescriptorM89709H0 = m89709H0(simpleFunctionDescriptorM89709H0, simpleFunctionDescriptor, listPlus);
            }
            arrayList.add(simpleFunctionDescriptorM89709H0);
        }
        collection.addAll(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return "Lazy Java member scope for " + this.f64887n.mo89032d();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m89746u0(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection3, m89736l1(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection3, m89735k1(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(collection3, m89737m1(simpleFunctionDescriptor, function1));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo89747v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.plus((Set) this.f64890q.invoke(), (Iterable) this.f64892s.invoke().keySet());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m89748v0(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptorM89711J0 = m89711J0(propertyDescriptor, function1);
            if (javaPropertyDescriptorM89711J0 != null) {
                collection.add(javaPropertyDescriptorM89711J0);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m89749w0(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(m89807N().invoke().mo89636e(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(m89682L0(this, javaMethod, null, Modality.FINAL, 2, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<Name> mo89750x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Collection<KotlinType> collectionMo88678c = mo89719R().mo88305l().mo88678c();
        collectionMo88678c.getClass();
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionMo88678c.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo89900n().mo88719a());
        }
        linkedHashSet.addAll(m89807N().invoke().mo89632a());
        linkedHashSet.addAll(m89807N().invoke().mo89633b());
        linkedHashSet.addAll(mo89747v(descriptorKindFilter, function1));
        linkedHashSet.addAll(m89805L().m89617a().m89604w().mo92001d(mo89719R(), m89805L()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: y */
    public void mo89752y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        if (this.f64887n.mo89038z() && m89807N().invoke().mo89637f(name) != null) {
            Collection<SimpleFunctionDescriptor> collection2 = collection;
            if (collection2.isEmpty()) {
                JavaRecordComponent javaRecordComponentMo89637f = m89807N().invoke().mo89637f(name);
                javaRecordComponentMo89637f.getClass();
                collection.add(m89740p1(javaRecordComponentMo89637f));
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((SimpleFunctionDescriptor) it.next()).mo88448g().isEmpty()) {
                    }
                }
                JavaRecordComponent javaRecordComponentMo89637f2 = m89807N().invoke().mo89637f(name);
                javaRecordComponentMo89637f2.getClass();
                collection.add(m89740p1(javaRecordComponentMo89637f2));
            }
        }
        m89805L().m89617a().m89604w().mo92003f(mo89719R(), name, collection, m89805L());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex mo89754z() {
        return new ClassDeclaredMemberIndex(this.f64887n, i8r.INSTANCE);
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }
}
