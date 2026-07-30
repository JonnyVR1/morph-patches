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
import kotlin.ranges.C15274a;
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
import p153l.far;
import p153l.gar;
import p153l.har;
import p153l.iar;
import p153l.jar;
import p153l.jmk0;
import p153l.kar;
import p153l.lar;
import p153l.mar;
import p153l.nar;
import p153l.oar;
import p153l.xvq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final ClassDescriptor f65560m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final JavaClass f65561n;

    /* JADX INFO: renamed from: o */
    public final boolean f65562o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> f65563p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f65564q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f65565r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final NotNullLazyValue<Map<Name, JavaField>> f65566s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final MemoizedFunctionToNullable<Name, ClassDescriptor> f65567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull JavaClass javaClass, boolean z, @Nullable LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        javaClass.getClass();
        this.f65560m = classDescriptor;
        this.f65561n = javaClass;
        this.f65562o = z;
        this.f65563p = lazyJavaResolverContext.m90512e().mo93337e(new far(this, lazyJavaResolverContext));
        this.f65564q = lazyJavaResolverContext.m90512e().mo93337e(new gar(this));
        this.f65565r = lazyJavaResolverContext.m90512e().mo93337e(new har(lazyJavaResolverContext, this));
        this.f65566s = lazyJavaResolverContext.m90512e().mo93337e(new iar(this));
        this.f65567t = lazyJavaResolverContext.m90512e().mo93335c(new jar(this, lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: A0 */
    public static final Collection m90570A0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return lazyJavaClassMemberScope.m90632q1(name);
    }

    /* JADX INFO: renamed from: B0 */
    public static final Collection m90571B0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return lazyJavaClassMemberScope.m90633r1(name);
    }

    /* JADX INFO: renamed from: D0 */
    public static final List m90572D0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        Collection<JavaConstructor> constructors = lazyJavaClassMemberScope.f65561n.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<JavaConstructor> it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.m90630o1(it.next()));
        }
        if (lazyJavaClassMemberScope.f65561n.mo89929z()) {
            ClassConstructorDescriptor classConstructorDescriptorM90599G0 = lazyJavaClassMemberScope.m90599G0();
            String strM91269c = MethodSignatureMappingKt.m91269c(classConstructorDescriptorM90599G0, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(classConstructorDescriptorM90599G0);
                        lazyJavaResolverContext.m90508a().m90480h().mo90425a(lazyJavaClassMemberScope.f65561n, classConstructorDescriptorM90599G0);
                        break;
                    }
                } while (!Intrinsics.m88377d(MethodSignatureMappingKt.m91269c((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strM91269c));
            } else {
                arrayList.add(classConstructorDescriptorM90599G0);
                lazyJavaResolverContext.m90508a().m90480h().mo90425a(lazyJavaClassMemberScope.f65561n, classConstructorDescriptorM90599G0);
                break;
            }
        }
        lazyJavaResolverContext.m90508a().m90495w().mo92889a(lazyJavaClassMemberScope.mo90610R(), arrayList, lazyJavaResolverContext);
        SignatureEnhancement signatureEnhancementM90490r = lazyJavaResolverContext.m90508a().m90490r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listListOfNotNull = arrayList;
        if (zIsEmpty) {
            listListOfNotNull = CollectionsKt.listOfNotNull(lazyJavaClassMemberScope.m90598F0());
        }
        return CollectionsKt.toList(signatureEnhancementM90490r.m90979p(lazyJavaResolverContext, listListOfNotNull));
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ JavaPropertyDescriptor m90573L0(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.m90603K0(javaMethod, kotlinType, modality);
    }

    /* JADX INFO: renamed from: U0 */
    public static final Map m90574U0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Collection<JavaField> fields = lazyJavaClassMemberScope.f65561n.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((JavaField) obj).mo89941F()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Set m90575Y0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.toSet(lazyJavaResolverContext.m90508a().m90495w().mo92891c(lazyJavaClassMemberScope.mo90610R(), lazyJavaResolverContext));
    }

    /* JADX INFO: renamed from: g1 */
    public static final Collection m90577g1(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        name.getClass();
        return Intrinsics.m88377d(simpleFunctionDescriptor.getName(), name) ? CollectionsKt.listOf(simpleFunctionDescriptor) : CollectionsKt.plus((Collection) lazyJavaClassMemberScope.m90632q1(name), (Iterable) lazyJavaClassMemberScope.m90633r1(name));
    }

    /* JADX INFO: renamed from: h1 */
    public static final Set m90579h1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return CollectionsKt.toSet(lazyJavaClassMemberScope.f65561n.mo89926q());
    }

    /* JADX INFO: renamed from: i1 */
    public static final ClassDescriptor m90581i1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext, Name name) {
        name.getClass();
        if (lazyJavaClassMemberScope.f65564q.invoke().contains(name)) {
            JavaClassFinder javaClassFinderM90476d = lazyJavaResolverContext.m90508a().m90476d();
            ClassId classIdM92872n = DescriptorUtilsKt.m92872n(lazyJavaClassMemberScope.mo90610R());
            classIdM92872n.getClass();
            JavaClass javaClassMo89833b = javaClassFinderM90476d.mo89833b(new JavaClassFinder.Request(classIdM92872n.m91927d(name), null, lazyJavaClassMemberScope.f65561n, 2, null));
            if (javaClassMo89833b == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.mo90610R(), javaClassMo89833b, null, 8, null);
            lazyJavaResolverContext.m90508a().m90477e().mo90274a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!lazyJavaClassMemberScope.f65565r.invoke().contains(name)) {
            JavaField javaField = lazyJavaClassMemberScope.f65566s.invoke().get(name);
            if (javaField == null) {
                return null;
            }
            return EnumEntrySyntheticClassDescriptor.m89604E0(lazyJavaResolverContext.m90512e(), lazyJavaClassMemberScope.mo90610R(), name, lazyJavaResolverContext.m90512e().mo93337e(new oar(lazyJavaClassMemberScope)), LazyJavaAnnotationsKt.m90503a(lazyJavaResolverContext, javaField), lazyJavaResolverContext.m90508a().m90492t().mo89855a(javaField));
        }
        List<ClassDescriptor> listCreateListBuilder = CollectionsKt.createListBuilder();
        lazyJavaResolverContext.m90508a().m90495w().mo92896h(lazyJavaClassMemberScope.mo90610R(), name, listCreateListBuilder, lazyJavaResolverContext);
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        int size = listBuild.size();
        if (size != 0) {
            if (size == 1) {
                return (ClassDescriptor) CollectionsKt.single(listBuild);
            }
            jmk0.m146166a("Multiple classes with same name are generated: ", listBuild);
        }
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Set m90583j1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return SetsKt.plus((Set) lazyJavaClassMemberScope.mo89610a(), (Iterable) lazyJavaClassMemberScope.mo89613d());
    }

    /* JADX INFO: renamed from: z0 */
    public static final boolean m90592z0(JavaMember javaMember) {
        javaMember.getClass();
        return !javaMember.mo89914H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: B */
    public void mo90593B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        Set<SimpleFunctionDescriptor> setM90621b1 = m90621b1(name);
        if (!SpecialGenericSignatures.Companion.m90386k(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.m90245n(name)) {
            Set<SimpleFunctionDescriptor> set = setM90621b1;
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
                if (m90625f1((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            m90636t0(collection, name, arrayList, false);
            return;
        }
        SmartSet smartSetM94112a = SmartSet.Companion.m94112a();
        Collection<? extends SimpleFunctionDescriptor> collectionM90400d = DescriptorResolverUtils.m90400d(name, setM90621b1, CollectionsKt.emptyList(), mo90610R(), ErrorReporter.f66690a, m90696L().m90508a().m90483k().mo93829b());
        collectionM90400d.getClass();
        m90637u0(name, collection, collectionM90400d, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        m90637u0(name, collection, collectionM90400d, smartSetM94112a, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setM90621b1) {
            if (m90625f1((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        m90636t0(collection, name, CollectionsKt.plus((Collection) arrayList2, (Iterable) smartSetM94112a), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: C */
    public void mo90594C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        name.getClass();
        collection.getClass();
        if (this.f65561n.mo89925l()) {
            m90640w0(name, collection);
        }
        Set<PropertyDescriptor> setM90623d1 = m90623d1(name);
        if (setM90623d1.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetM94112a = companion.m94112a();
        SmartSet smartSetM94112a2 = companion.m94112a();
        m90639v0(setM90623d1, collection, smartSetM94112a, new mar(this));
        m90639v0(SetsKt.minus((Set) setM90623d1, (Iterable) smartSetM94112a), smartSetM94112a2, null, new nar(this));
        Collection<? extends PropertyDescriptor> collectionM90400d = DescriptorResolverUtils.m90400d(name, SetsKt.plus((Set) setM90623d1, (Iterable) smartSetM94112a2), collection, mo90610R(), m90696L().m90508a().m90475c(), m90696L().m90508a().m90483k().mo93829b());
        collectionM90400d.getClass();
        collection.addAll(collectionM90400d);
    }

    /* JADX INFO: renamed from: C0 */
    public final Collection<KotlinType> m90595C0() {
        if (!this.f65562o) {
            return m90696L().m90508a().m90483k().mo93830c().mo93803g(mo90610R());
        }
        Collection<KotlinType> collectionMo89569c = mo90610R().mo89196l().mo89569c();
        collectionMo89569c.getClass();
        return collectionMo89569c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: D */
    public Set<Name> mo90596D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        if (this.f65561n.mo89925l()) {
            return mo89610a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m90698N().invoke().mo90526d());
        Collection<KotlinType> collectionMo89569c = mo90610R().mo89196l().mo89569c();
        collectionMo89569c.getClass();
        Iterator<T> it = collectionMo89569c.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo90791n().mo89613d());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: E0 */
    public final List<ValueParameterDescriptor> m90597E0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl2;
        Pair pair;
        Collection<JavaMethod> methods = this.f65561n.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes javaTypeAttributesM90749b = JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (Intrinsics.m88377d(((JavaMethod) obj).getName(), JvmAnnotationNames.f65369c)) {
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
                pair = new Pair(m90696L().m90514g().m90763l(javaArrayType, javaTypeAttributesM90749b, true), m90696L().m90514g().m90765p(javaArrayType.mo89904k(), javaTypeAttributesM90749b));
            } else {
                pair = new Pair(m90696L().m90514g().m90765p(returnType, javaTypeAttributesM90749b), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            lazyJavaClassMemberScope = this;
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
            lazyJavaClassMemberScope.m90634s0(arrayList, classConstructorDescriptorImpl2, 0, javaMethod, kotlinType, kotlinType2);
        } else {
            lazyJavaClassMemberScope = this;
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
        }
        int i = 0;
        int i2 = javaMethod == null ? 0 : 1;
        for (JavaMethod javaMethod2 : list2) {
            lazyJavaClassMemberScope.m90634s0(arrayList, classConstructorDescriptorImpl2, i + i2, javaMethod2, lazyJavaClassMemberScope.m90696L().m90514g().m90765p(javaMethod2.getReturnType(), javaTypeAttributesM90749b), null);
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public final ClassConstructorDescriptor m90598F0() {
        boolean zMo89925l = this.f65561n.mo89925l();
        if ((this.f65561n.isInterface() || !this.f65561n.mo89912A()) && !zMo89925l) {
            return null;
        }
        ClassDescriptor classDescriptorMo90610R = mo90610R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM90447m1 = JavaClassConstructorDescriptor.m90447m1(classDescriptorMo90610R, Annotations.Companion.m89532b(), true, m90696L().m90508a().m90492t().mo89855a(this.f65561n));
        javaClassConstructorDescriptorM90447m1.getClass();
        List<ValueParameterDescriptor> listM90597E0 = zMo89925l ? m90597E0(javaClassConstructorDescriptorM90447m1) : Collections.EMPTY_LIST;
        javaClassConstructorDescriptorM90447m1.mo89642S0(false);
        javaClassConstructorDescriptorM90447m1.m89592j1(listM90597E0, m90619Z0(classDescriptorMo90610R));
        javaClassConstructorDescriptorM90447m1.mo89641R0(true);
        javaClassConstructorDescriptorM90447m1.m89648Z0(classDescriptorMo90610R.mo89349o());
        m90696L().m90508a().m90480h().mo90425a(this.f65561n, javaClassConstructorDescriptorM90447m1);
        return javaClassConstructorDescriptorM90447m1;
    }

    /* JADX INFO: renamed from: G0 */
    public final ClassConstructorDescriptor m90599G0() {
        ClassDescriptor classDescriptorMo90610R = mo90610R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM90447m1 = JavaClassConstructorDescriptor.m90447m1(classDescriptorMo90610R, Annotations.Companion.m89532b(), true, m90696L().m90508a().m90492t().mo89855a(this.f65561n));
        javaClassConstructorDescriptorM90447m1.getClass();
        List<ValueParameterDescriptor> listM90604M0 = m90604M0(javaClassConstructorDescriptorM90447m1);
        javaClassConstructorDescriptorM90447m1.mo89642S0(false);
        javaClassConstructorDescriptorM90447m1.m89592j1(listM90604M0, m90619Z0(classDescriptorMo90610R));
        javaClassConstructorDescriptorM90447m1.mo89641R0(false);
        javaClassConstructorDescriptorM90447m1.m89648Z0(classDescriptorMo90610R.mo89349o());
        return javaClassConstructorDescriptorM90447m1;
    }

    /* JADX INFO: renamed from: H0 */
    public final SimpleFunctionDescriptor m90600H0(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!Intrinsics.m88377d(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.mo89406u0() == null && m90609Q0(simpleFunctionDescriptor2, callableDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.mo89405k().mo89411e().build();
                functionDescriptorBuild.getClass();
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: I0 */
    public final SimpleFunctionDescriptor m90601I0(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
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
        } while (!m90624e1((SimpleFunctionDescriptor) next, functionDescriptor));
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo89405k = simpleFunctionDescriptor.mo89405k();
        List<ValueParameterDescriptor> listMo89339g = functionDescriptor.mo89339g();
        listMo89339g.getClass();
        List<ValueParameterDescriptor> list = listMo89339g;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
        }
        List<ValueParameterDescriptor> listMo89339g2 = simpleFunctionDescriptor.mo89339g();
        listMo89339g2.getClass();
        copyBuilderMo89405k.mo89420n(UtilKt.m90458a(arrayList, listMo89339g2, functionDescriptor));
        copyBuilderMo89405k.mo89426t();
        copyBuilderMo89405k.mo89413g();
        copyBuilderMo89405k.mo89410d(JavaMethodDescriptor.f65474H, Boolean.TRUE);
        return (SimpleFunctionDescriptor) copyBuilderMo89405k.build();
    }

    /* JADX INFO: renamed from: J0 */
    public final JavaPropertyDescriptor m90602J0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM90617X0;
        PropertySetterDescriptorImpl propertySetterDescriptorImplM92632m = null;
        if (!m90608P0(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM90616W0 = m90616W0(propertyDescriptor, function1);
        simpleFunctionDescriptorM90616W0.getClass();
        if (propertyDescriptor.mo89511y()) {
            simpleFunctionDescriptorM90617X0 = m90617X0(propertyDescriptor, function1);
            simpleFunctionDescriptorM90617X0.getClass();
        } else {
            simpleFunctionDescriptorM90617X0 = null;
        }
        if (simpleFunctionDescriptorM90617X0 != null) {
            simpleFunctionDescriptorM90617X0.mo89194i();
            simpleFunctionDescriptorM90616W0.mo89194i();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(mo90610R(), simpleFunctionDescriptorM90616W0, simpleFunctionDescriptorM90617X0, propertyDescriptor);
        KotlinType returnType = simpleFunctionDescriptorM90616W0.getReturnType();
        returnType.getClass();
        javaForKotlinOverridePropertyDescriptor.m89755V0(returnType, CollectionsKt.emptyList(), mo90606O(), null, CollectionsKt.emptyList());
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM92630k = DescriptorFactory.m92630k(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorM90616W0.getAnnotations(), false, false, false, simpleFunctionDescriptorM90616W0.getSource());
        propertyGetterDescriptorImplM92630k.m89734G0(simpleFunctionDescriptorM90616W0);
        propertyGetterDescriptorImplM92630k.m89782J0(javaForKotlinOverridePropertyDescriptor.getType());
        if (simpleFunctionDescriptorM90617X0 != null) {
            List<ValueParameterDescriptor> listMo89339g = simpleFunctionDescriptorM90617X0.mo89339g();
            listMo89339g.getClass();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) listMo89339g);
            if (valueParameterDescriptor == null) {
                xvq.m213257a("No parameter found for ", simpleFunctionDescriptorM90617X0);
                return null;
            }
            propertySetterDescriptorImplM92632m = DescriptorFactory.m92632m(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorM90617X0.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorM90617X0.getVisibility(), simpleFunctionDescriptorM90617X0.getSource());
            propertySetterDescriptorImplM92632m.m89734G0(simpleFunctionDescriptorM90617X0);
        }
        javaForKotlinOverridePropertyDescriptor.m89749O0(propertyGetterDescriptorImplM92630k, propertySetterDescriptorImplM92632m);
        return javaForKotlinOverridePropertyDescriptor;
    }

    /* JADX INFO: renamed from: K0 */
    public final JavaPropertyDescriptor m90603K0(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        KotlinType kotlinTypeM90693A;
        JavaPropertyDescriptor javaPropertyDescriptorM90457Z0 = JavaPropertyDescriptor.m90457Z0(mo90610R(), LazyJavaAnnotationsKt.m90503a(m90696L(), javaMethod), modality, UtilsKt.m90396d(javaMethod.getVisibility()), false, javaMethod.getName(), m90696L().m90508a().m90492t().mo89855a(javaMethod), false);
        javaPropertyDescriptorM90457Z0.getClass();
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM92623d = DescriptorFactory.m92623d(javaPropertyDescriptorM90457Z0, Annotations.Companion.m89532b());
        propertyGetterDescriptorImplM92623d.getClass();
        javaPropertyDescriptorM90457Z0.m89749O0(propertyGetterDescriptorImplM92623d, null);
        if (kotlinType == null) {
            LazyJavaResolverContext lazyJavaResolverContextM90468i = ContextKt.m90468i(m90696L(), javaPropertyDescriptorM90457Z0, javaMethod, 0, 4, null);
            lazyJavaClassMemberScope = this;
            kotlinTypeM90693A = lazyJavaClassMemberScope.m90693A(javaMethod, lazyJavaResolverContextM90468i);
        } else {
            lazyJavaClassMemberScope = this;
            kotlinTypeM90693A = kotlinType;
        }
        javaPropertyDescriptorM90457Z0.m89755V0(kotlinTypeM90693A, CollectionsKt.emptyList(), lazyJavaClassMemberScope.mo90606O(), null, CollectionsKt.emptyList());
        propertyGetterDescriptorImplM92623d.m89782J0(kotlinTypeM90693A);
        return javaPropertyDescriptorM90457Z0;
    }

    /* JADX INFO: renamed from: M0 */
    public final List<ValueParameterDescriptor> m90604M0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection<JavaRecordComponent> collectionMo89928y = this.f65561n.mo89928y();
        ArrayList arrayList = new ArrayList(collectionMo89928y.size());
        JavaTypeAttributes javaTypeAttributesM90749b = JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<T> it = collectionMo89928y.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            i = i2 + 1;
            JavaRecordComponent javaRecordComponent = (JavaRecordComponent) it.next();
            KotlinType kotlinTypeM90765p = m90696L().m90514g().m90765p(javaRecordComponent.getType(), javaTypeAttributesM90749b);
            arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i2, Annotations.Companion.m89532b(), javaRecordComponent.getName(), kotlinTypeM90765p, false, false, false, javaRecordComponent.mo89957a() ? m90696L().m90508a().m90485m().mo89437f().m89125k(kotlinTypeM90765p) : null, m90696L().m90508a().m90492t().mo89855a(javaRecordComponent)));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final SimpleFunctionDescriptor m90605N0(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo89405k = simpleFunctionDescriptor.mo89405k();
        copyBuilderMo89405k.mo89412f(name);
        copyBuilderMo89405k.mo89426t();
        copyBuilderMo89405k.mo89413g();
        FunctionDescriptor functionDescriptorBuild = copyBuilderMo89405k.build();
        functionDescriptorBuild.getClass();
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    /* JADX INFO: renamed from: O */
    public ReceiverParameterDescriptor mo90606O() {
        return DescriptorUtils.m92662l(mo90610R());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX INFO: renamed from: O0 */
    public final SimpleFunctionDescriptor m90607O0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName fqNameM91959m;
        FqNameUnsafe fqNameUnsafeM92874p;
        List<ValueParameterDescriptor> listMo89339g = simpleFunctionDescriptor.mo89339g();
        listMo89339g.getClass();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) listMo89339g);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo89207e = valueParameterDescriptor.getType().mo92781G0().mo89207e();
            if (classifierDescriptorMo89207e == null || (fqNameUnsafeM92874p = DescriptorUtilsKt.m92874p(classifierDescriptorMo89207e)) == null) {
                fqNameM91959m = null;
            } else {
                if (!fqNameUnsafeM92874p.m91953f()) {
                    fqNameUnsafeM92874p = null;
                }
                if (fqNameUnsafeM92874p != null) {
                    fqNameM91959m = fqNameUnsafeM92874p.m91959m();
                } else {
                    fqNameM91959m = null;
                }
            }
            if (!Intrinsics.m88377d(fqNameM91959m, StandardNames.f64504v)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo89405k = simpleFunctionDescriptor.mo89405k();
                List<ValueParameterDescriptor> listMo89339g2 = simpleFunctionDescriptor.mo89339g();
                listMo89339g2.getClass();
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderMo89405k.mo89420n(CollectionsKt.dropLast(listMo89339g2, 1)).mo89414h(valueParameterDescriptor.getType().mo92779E0().get(0).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.m89649a1(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m90608P0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.m90530a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM90616W0 = m90616W0(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorM90617X0 = m90617X0(propertyDescriptor, function1);
        if (simpleFunctionDescriptorM90616W0 == null) {
            return false;
        }
        if (propertyDescriptor.mo89511y()) {
            return simpleFunctionDescriptorM90617X0 != null && simpleFunctionDescriptorM90617X0.mo89194i() == simpleFunctionDescriptorM90616W0.mo89194i();
        }
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m90609Q0(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultM92737c = OverridingUtil.f66489f.m92729F(callableDescriptor2, callableDescriptor, true).m92737c();
        resultM92737c.getClass();
        return resultM92737c == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.m90293a(callableDescriptor2, callableDescriptor);
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m90611R0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Name nameM90377b = companion.m90377b(name);
        if (nameM90377b == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setM90621b1 = m90621b1(nameM90377b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM90621b1) {
            if (SpecialBuiltinMembers.m90357d((SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorM90605N0 = m90605N0(simpleFunctionDescriptor, nameM90377b);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m90612S0((SimpleFunctionDescriptor) it.next(), simpleFunctionDescriptorM90605N0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m90612S0(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.m90237m(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.mo89336a();
        }
        functionDescriptor.getClass();
        return m90609Q0(functionDescriptor, simpleFunctionDescriptor);
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m90613T0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM90607O0 = m90607O0(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorM90607O0 == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Set<SimpleFunctionDescriptor> setM90621b1 = m90621b1(name);
        if ((setM90621b1 instanceof Collection) && setM90621b1.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : setM90621b1) {
            if (simpleFunctionDescriptor2.isSuspend() && m90609Q0(simpleFunctionDescriptorM90607O0, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: V */
    public boolean mo90614V(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        javaMethodDescriptor.getClass();
        if (this.f65561n.mo89925l()) {
            return false;
        }
        return m90625f1(javaMethodDescriptor);
    }

    /* JADX INFO: renamed from: V0 */
    public final SimpleFunctionDescriptor m90615V0(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        Iterator<T> it = function1.invoke(nameM91970i).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo89339g().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f66972a;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.mo93795d(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: W0 */
    public final SimpleFunctionDescriptor m90616W0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.m90360g(getter) : null;
        String strM90256b = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.m90256b(propertyGetterDescriptor) : null;
        if (strM90256b != null && !SpecialBuiltinMembers.m90365l(mo90610R(), propertyGetterDescriptor)) {
            return m90615V0(propertyDescriptor, strM90256b, function1);
        }
        String strM91973b = propertyDescriptor.getName().m91973b();
        strM91973b.getClass();
        return m90615V0(propertyDescriptor, JvmAbi.m90322b(strM91973b), function1);
    }

    /* JADX INFO: renamed from: X0 */
    public final SimpleFunctionDescriptor m90617X0(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strM91973b = propertyDescriptor.getName().m91973b();
        strM91973b.getClass();
        Name nameM91970i = Name.m91970i(JvmAbi.m90325e(strM91973b));
        nameM91970i.getClass();
        Iterator<T> it = function1.invoke(nameM91970i).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.mo89339g().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.m89061D0(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f66972a;
                List<ValueParameterDescriptor> listMo89339g = simpleFunctionDescriptor2.mo89339g();
                listMo89339g.getClass();
                if (kotlinTypeChecker.mo93794a(((ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: Y */
    public LazyJavaScope.MethodSignatureData mo90618Y(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        javaMethod.getClass();
        list.getClass();
        kotlinType.getClass();
        list2.getClass();
        SignaturePropagator.PropagatedSignature propagatedSignatureMo90435a = m90696L().m90508a().m90491s().mo90435a(javaMethod, mo90610R(), kotlinType, null, list2, list);
        propagatedSignatureMo90435a.getClass();
        KotlinType kotlinTypeM90440d = propagatedSignatureMo90435a.m90440d();
        kotlinTypeM90440d.getClass();
        KotlinType kotlinTypeM90439c = propagatedSignatureMo90435a.m90439c();
        List<ValueParameterDescriptor> listM90442f = propagatedSignatureMo90435a.m90442f();
        listM90442f.getClass();
        List<TypeParameterDescriptor> listM90441e = propagatedSignatureMo90435a.m90441e();
        listM90441e.getClass();
        boolean zM90443g = propagatedSignatureMo90435a.m90443g();
        List<String> listM90438b = propagatedSignatureMo90435a.m90438b();
        listM90438b.getClass();
        return new LazyJavaScope.MethodSignatureData(kotlinTypeM90440d, kotlinTypeM90439c, listM90442f, listM90441e, zM90443g, listM90438b);
    }

    /* JADX INFO: renamed from: Z0 */
    public final DescriptorVisibility m90619Z0(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        visibility.getClass();
        if (!Intrinsics.m88377d(visibility, JavaDescriptorVisibilities.f65339b)) {
            return visibility;
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.f65340c;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> m90620a1() {
        return this.f65563p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m90629n1(name, lookupLocation);
        return super.mo89611b(name, lookupLocation);
    }

    /* JADX INFO: renamed from: b1 */
    public final Set<SimpleFunctionDescriptor> m90621b1(Name name) {
        Collection<KotlinType> collectionM90595C0 = m90595C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionM90595C0.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo90791n().mo89611b(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        m90629n1(name, lookupLocation);
        return super.mo89612c(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor mo90610R() {
        return this.f65560m;
    }

    /* JADX INFO: renamed from: d1 */
    public final Set<PropertyDescriptor> m90623d1(Name name) {
        Collection<KotlinType> collectionM90595C0 = m90595C0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionM90595C0.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> collectionMo89612c = ((KotlinType) it.next()).mo90791n().mo89612c(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89612c, 10));
            Iterator<T> it2 = collectionMo89612c.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m90624e1(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strM91269c = MethodSignatureMappingKt.m91269c(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor functionDescriptorMo89336a = functionDescriptor.mo89336a();
        functionDescriptorMo89336a.getClass();
        return Intrinsics.m88377d(strM91269c, MethodSignatureMappingKt.m91269c(functionDescriptorMo89336a, false, false, 2, null)) && !m90609Q0(simpleFunctionDescriptor, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor classDescriptorInvoke;
        name.getClass();
        lookupLocation.getClass();
        m90629n1(name, lookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) m90700Q();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f65567t) == null || (classDescriptorInvoke = memoizedFunctionToNullable.invoke(name)) == null) ? this.f65567t.invoke(name) : classDescriptorInvoke;
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m90625f1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        List<Name> listM90348a = PropertiesConventionUtilKt.m90348a(name);
        if (!(listM90348a instanceof Collection) || !listM90348a.isEmpty()) {
            Iterator<T> it = listM90348a.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setM90623d1 = m90623d1((Name) it.next());
                if (!(setM90623d1 instanceof Collection) || !setM90623d1.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setM90623d1) {
                        if (m90608P0(propertyDescriptor, new lar(simpleFunctionDescriptor, this))) {
                            if (!propertyDescriptor.mo89511y()) {
                                String strM91973b = simpleFunctionDescriptor.getName().m91973b();
                                strM91973b.getClass();
                                if (!JvmAbi.m90324d(strM91973b)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (m90611R0(simpleFunctionDescriptor) || m90635s1(simpleFunctionDescriptor) || m90613T0(simpleFunctionDescriptor)) ? false : true;
    }

    /* JADX INFO: renamed from: k1 */
    public final SimpleFunctionDescriptor m90626k1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptorM90601I0;
        FunctionDescriptor functionDescriptorM90240l = BuiltinMethodsWithSpecialGenericSignature.m90240l(simpleFunctionDescriptor);
        if (functionDescriptorM90240l != null && (simpleFunctionDescriptorM90601I0 = m90601I0(functionDescriptorM90240l, function1)) != null) {
            if (!m90625f1(simpleFunctionDescriptorM90601I0)) {
                simpleFunctionDescriptorM90601I0 = null;
            }
            if (simpleFunctionDescriptorM90601I0 != null) {
                return m90600H0(simpleFunctionDescriptorM90601I0, functionDescriptorM90240l, collection);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final SimpleFunctionDescriptor m90627l1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.m90360g(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String strM90358e = SpecialBuiltinMembers.m90358e(simpleFunctionDescriptor2);
        strM90358e.getClass();
        Name nameM91970i = Name.m91970i(strM90358e);
        nameM91970i.getClass();
        Iterator<? extends SimpleFunctionDescriptor> it = function1.invoke(nameM91970i).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorM90605N0 = m90605N0(it.next(), name);
            if (m90612S0(simpleFunctionDescriptor2, simpleFunctionDescriptorM90605N0)) {
                return m90600H0(simpleFunctionDescriptorM90605N0, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public final SimpleFunctionDescriptor m90628m1(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Iterator<T> it = function1.invoke(name).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorM90607O0 = m90607O0((SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptorM90607O0 == null || !m90609Q0(simpleFunctionDescriptorM90607O0, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorM90607O0 = null;
            }
            if (simpleFunctionDescriptorM90607O0 != null) {
                return simpleFunctionDescriptorM90607O0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public void m90629n1(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.m89965a(m90696L().m90508a().m90484l(), lookupLocation, mo90610R(), name);
    }

    /* JADX INFO: renamed from: o1 */
    public final JavaClassConstructorDescriptor m90630o1(JavaConstructor javaConstructor) {
        ClassDescriptor classDescriptorMo90610R = mo90610R();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM90447m1 = JavaClassConstructorDescriptor.m90447m1(classDescriptorMo90610R, LazyJavaAnnotationsKt.m90503a(m90696L(), javaConstructor), false, m90696L().m90508a().m90492t().mo89855a(javaConstructor));
        javaClassConstructorDescriptorM90447m1.getClass();
        LazyJavaResolverContext lazyJavaResolverContextM90467h = ContextKt.m90467h(m90696L(), javaClassConstructorDescriptorM90447m1, javaConstructor, classDescriptorMo90610R.mo89200p().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersM90706d0 = m90706d0(lazyJavaResolverContextM90467h, javaClassConstructorDescriptorM90447m1, javaConstructor.mo89938g());
        List<TypeParameterDescriptor> listMo89200p = classDescriptorMo90610R.mo89200p();
        listMo89200p.getClass();
        List<TypeParameterDescriptor> list = listMo89200p;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorMo90517a = lazyJavaResolverContextM90467h.m90513f().mo90517a((JavaTypeParameter) it.next());
            typeParameterDescriptorMo90517a.getClass();
            arrayList.add(typeParameterDescriptorMo90517a);
        }
        javaClassConstructorDescriptorM90447m1.m89593k1(resolvedValueParametersM90706d0.m90715a(), UtilsKt.m90396d(javaConstructor.getVisibility()), CollectionsKt.plus((Collection) list, (Iterable) arrayList));
        javaClassConstructorDescriptorM90447m1.mo89641R0(false);
        javaClassConstructorDescriptorM90447m1.mo89642S0(resolvedValueParametersM90706d0.m90716b());
        javaClassConstructorDescriptorM90447m1.m89648Z0(classDescriptorMo90610R.mo89349o());
        lazyJavaResolverContextM90467h.m90508a().m90480h().mo90425a(javaConstructor, javaClassConstructorDescriptorM90447m1);
        return javaClassConstructorDescriptorM90447m1;
    }

    /* JADX INFO: renamed from: p1 */
    public final JavaMethodDescriptor m90631p1(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor javaMethodDescriptorM90452i1 = JavaMethodDescriptor.m90452i1(mo90610R(), LazyJavaAnnotationsKt.m90503a(m90696L(), javaRecordComponent), javaRecordComponent.getName(), m90696L().m90508a().m90492t().mo89855a(javaRecordComponent), true);
        javaMethodDescriptorM90452i1.getClass();
        javaMethodDescriptorM90452i1.mo89793h1(null, mo90606O(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), m90696L().m90514g().m90765p(javaRecordComponent.getType(), JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.m89432a(false, false, true), DescriptorVisibilities.f64700e, null);
        javaMethodDescriptorM90452i1.m90455l1(false, false);
        m90696L().m90508a().m90480h().mo90426b(javaRecordComponent, javaMethodDescriptorM90452i1);
        return javaMethodDescriptorM90452i1;
    }

    /* JADX INFO: renamed from: q1 */
    public final Collection<SimpleFunctionDescriptor> m90632q1(Name name) {
        Collection<JavaMethod> collectionMo90527e = m90698N().invoke().mo90527e(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo90527e, 10));
        Iterator<T> it = collectionMo90527e.iterator();
        while (it.hasNext()) {
            arrayList.add(m90704Z((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r1 */
    public final Collection<SimpleFunctionDescriptor> m90633r1(Name name) {
        Set<SimpleFunctionDescriptor> setM90621b1 = m90621b1(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM90621b1) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.m90357d(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.m90240l(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m90634s0(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations annotationsM89532b = Annotations.Companion.m89532b();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeM93694n = TypeUtils.m93694n(kotlinType);
        kotlinTypeM93694n.getClass();
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i, annotationsM89532b, name, kotlinTypeM93694n, javaMethod.mo89948G(), false, false, kotlinType2 != null ? TypeUtils.m93694n(kotlinType2) : null, m90696L().m90508a().m90492t().mo89855a(javaMethod)));
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m90635s1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        if (!builtinMethodsWithSpecialGenericSignature.m90245n(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        name2.getClass();
        Set<SimpleFunctionDescriptor> setM90621b1 = m90621b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setM90621b1.iterator();
        while (it.hasNext()) {
            FunctionDescriptor functionDescriptorM90240l = BuiltinMethodsWithSpecialGenericSignature.m90240l((SimpleFunctionDescriptor) it.next());
            if (functionDescriptorM90240l != null) {
                arrayList.add(functionDescriptorM90240l);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (m90624e1(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m90636t0(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<? extends SimpleFunctionDescriptor> collectionM90400d = DescriptorResolverUtils.m90400d(name, collection2, collection, mo90610R(), m90696L().m90508a().m90475c(), m90696L().m90508a().m90483k().mo93829b());
        collectionM90400d.getClass();
        if (!z) {
            collection.addAll(collectionM90400d);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = collectionM90400d;
        List listPlus = CollectionsKt.plus((Collection) collection, (Iterable) collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorM90600H0 : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.m90363j(simpleFunctionDescriptorM90600H0);
            if (simpleFunctionDescriptor == null) {
                simpleFunctionDescriptorM90600H0.getClass();
            } else {
                simpleFunctionDescriptorM90600H0.getClass();
                simpleFunctionDescriptorM90600H0 = m90600H0(simpleFunctionDescriptorM90600H0, simpleFunctionDescriptor, listPlus);
            }
            arrayList.add(simpleFunctionDescriptorM90600H0);
        }
        collection.addAll(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return "Lazy Java member scope for " + this.f65561n.mo89923d();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m90637u0(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection3, m90627l1(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection3, m90626k1(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(collection3, m90628m1(simpleFunctionDescriptor, function1));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: v */
    public Set<Name> mo90638v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        return SetsKt.plus((Set) this.f65564q.invoke(), (Iterable) this.f65566s.invoke().keySet());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m90639v0(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptorM90602J0 = m90602J0(propertyDescriptor, function1);
            if (javaPropertyDescriptorM90602J0 != null) {
                collection.add(javaPropertyDescriptorM90602J0);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m90640w0(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(m90698N().invoke().mo90527e(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(m90573L0(this, javaMethod, null, Modality.FINAL, 2, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<Name> mo90641x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        Collection<KotlinType> collectionMo89569c = mo90610R().mo89196l().mo89569c();
        collectionMo89569c.getClass();
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionMo89569c.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo90791n().mo89610a());
        }
        linkedHashSet.addAll(m90698N().invoke().mo90523a());
        linkedHashSet.addAll(m90698N().invoke().mo90524b());
        linkedHashSet.addAll(mo90638v(descriptorKindFilter, function1));
        linkedHashSet.addAll(m90696L().m90508a().m90495w().mo92892d(mo90610R(), m90696L()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: y */
    public void mo90643y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
        if (this.f65561n.mo89929z() && m90698N().invoke().mo90528f(name) != null) {
            Collection<SimpleFunctionDescriptor> collection2 = collection;
            if (collection2.isEmpty()) {
                JavaRecordComponent javaRecordComponentMo90528f = m90698N().invoke().mo90528f(name);
                javaRecordComponentMo90528f.getClass();
                collection.add(m90631p1(javaRecordComponentMo90528f));
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((SimpleFunctionDescriptor) it.next()).mo89339g().isEmpty()) {
                    }
                }
                JavaRecordComponent javaRecordComponentMo90528f2 = m90698N().invoke().mo90528f(name);
                javaRecordComponentMo90528f2.getClass();
                collection.add(m90631p1(javaRecordComponentMo90528f2));
            }
        }
        m90696L().m90508a().m90495w().mo92894f(mo90610R(), name, collection, m90696L());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex mo90645z() {
        return new ClassDeclaredMemberIndex(this.f65561n, kar.INSTANCE);
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }
}
