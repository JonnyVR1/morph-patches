package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.p051p1.mobile.putong.data.Settings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import p153l.emc0;
import p153l.lvq;
import p153l.mvq;
import p153l.nbr;
import p153l.nvq;
import p153l.ovq;
import p153l.pvq;
import p153l.qvq;
import p153l.rvq;
import p153l.svq;
import p153l.tvq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f64674i = {Reflection.m88403i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, Settings.TYPE, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), Reflection.m88403i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.m88403i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f64675a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaToKotlinClassMapper f64676b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f64677c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KotlinType f64678d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NotNullLazyValue f64679e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final CacheWithNotNullValues<FqName, ClassDescriptor> f64680f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64681g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> f64682h;

    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64683a;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JDKMemberStatus.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JDKMemberStatus.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JDKMemberStatus.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f64683a = iArr;
        }
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> function0) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        function0.getClass();
        this.f64675a = moduleDescriptor;
        this.f64676b = JavaToKotlinClassMapper.INSTANCE;
        this.f64677c = storageManager.mo93337e(function0);
        this.f64678d = m89310q(storageManager);
        this.f64679e = storageManager.mo93337e(new lvq(this, storageManager));
        this.f64680f = storageManager.mo93336d();
        this.f64681g = storageManager.mo93337e(new mvq(this));
        this.f64682h = storageManager.mo93341i(new nvq(this));
    }

    /* JADX INFO: renamed from: B */
    public static final Iterable m89280B(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionMo89569c = classDescriptor.mo89196l().mo89569c();
        collectionMo89569c.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo89569c.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo89207e = ((KotlinType) it.next()).mo92781G0().mo89207e();
            ClassDescriptor classDescriptorM89314z = null;
            ClassifierDescriptor classifierDescriptorMo89336a = classifierDescriptorMo89207e != null ? classifierDescriptorMo89207e.mo89336a() : null;
            ClassDescriptor classDescriptor2 = classifierDescriptorMo89336a instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89336a : null;
            if (classDescriptor2 != null && (classDescriptorM89314z = jvmBuiltInsCustomizer.m89314z(classDescriptor2)) == null) {
                classDescriptorM89314z = classDescriptor2;
            }
            if (classDescriptorM89314z != null) {
                arrayList.add(classDescriptorM89314z);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static final Iterable m89281F(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.mo89336a().mo89338e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: G */
    public static final Boolean m89282G(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.f64676b;
            DeclarationDescriptor declarationDescriptorMo89190b = callableMemberDescriptor.mo89190b();
            declarationDescriptorMo89190b.getClass();
            if (javaToKotlinClassMapper.m89257c((ClassDescriptor) declarationDescriptorMo89190b)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: I */
    public static final Annotations m89283I(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        return Annotations.Companion.m89531a(CollectionsKt.listOf(AnnotationUtilKt.m89527c(jvmBuiltInsCustomizer.f64675a.mo89437f(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: renamed from: o */
    public static final SimpleType m89293o(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        return FindClassInModuleKt.m89400d(jvmBuiltInsCustomizer.m89301D().m89278a(), JvmBuiltInClassDescriptorFactory.Companion.m89267a(), new NotFoundClasses(storageManager, jvmBuiltInsCustomizer.m89301D().m89278a())).mo89349o();
    }

    /* JADX INFO: renamed from: r */
    public static final KotlinType m89294r(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        SimpleType simpleTypeM89123i = jvmBuiltInsCustomizer.f64675a.mo89437f().m89123i();
        simpleTypeM89123i.getClass();
        return simpleTypeM89123i;
    }

    /* JADX INFO: renamed from: s */
    public static final Annotations m89295s(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, Pair pair) {
        pair.getClass();
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return Annotations.Companion.m89531a(CollectionsKt.listOf(AnnotationUtilKt.m89526b(jvmBuiltInsCustomizer.f64675a.mo89437f(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    /* JADX INFO: renamed from: u */
    public static final ClassDescriptor m89296u(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        JavaResolverCache javaResolverCache = JavaResolverCache.f65456a;
        javaResolverCache.getClass();
        return lazyJavaClassDescriptor.m90560I0(javaResolverCache, classDescriptor);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m89297w(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        return OverridingUtil.m92724x(constructorDescriptor, constructorDescriptor2.mo89344c(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    /* JADX INFO: renamed from: x */
    public static final Collection m89298x(Name name, MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo89611b(name, NoLookupLocation.FROM_BUILTINS);
    }

    /* JADX INFO: renamed from: A */
    public final JDKMemberStatus m89299A(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor declarationDescriptorMo89190b = functionDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        final String strM91269c = MethodSignatureMappingKt.m91269c(functionDescriptor, false, false, 3, null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objM94077b = DFS.m94077b(CollectionsKt.listOf((ClassDescriptor) declarationDescriptorMo89190b), new tvq(this), new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
            /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean mo88524a(ClassDescriptor classDescriptor) {
                classDescriptor.getClass();
                String strM91266a = MethodSignatureBuildingUtilsKt.m91266a(SignatureBuildingComponents.INSTANCE, classDescriptor, strM91269c);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                if (jvmBuiltInsSignatures.m89327f().contains(strM91266a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
                } else if (jvmBuiltInsSignatures.m89330i().contains(strM91266a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
                } else if (jvmBuiltInsSignatures.m89324c().contains(strM91266a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.DEPRECATED_LIST_METHODS;
                } else if (jvmBuiltInsSignatures.m89325d().contains(strM91266a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
                }
                return objectRef.element == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public JvmBuiltInsCustomizer.JDKMemberStatus result() {
                JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = objectRef.element;
                return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
            }
        });
        objM94077b.getClass();
        return (JDKMemberStatus) objM94077b;
    }

    /* JADX INFO: renamed from: C */
    public final Annotations m89300C() {
        return (Annotations) StorageKt.m93375a(this.f64681g, this, f64674i[2]);
    }

    /* JADX INFO: renamed from: D */
    public final JvmBuiltIns.Settings m89301D() {
        return (JvmBuiltIns.Settings) StorageKt.m93375a(this.f64677c, this, f64674i[0]);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m89302E(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor declarationDescriptorMo89190b = simpleFunctionDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        String strM91269c = MethodSignatureMappingKt.m91269c(simpleFunctionDescriptor, false, false, 3, null);
        if (z ^ JvmBuiltInsSignatures.INSTANCE.m89328g().contains(MethodSignatureBuildingUtilsKt.m91266a(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) declarationDescriptorMo89190b, strM91269c))) {
            return true;
        }
        Boolean boolM94080e = DFS.m94080e(CollectionsKt.listOf(simpleFunctionDescriptor), rvq.INSTANCE, new svq(this));
        boolM94080e.getClass();
        return boolM94080e.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m89303H(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.mo89339g().size() != 1) {
            return false;
        }
        List<ValueParameterDescriptor> listMo89339g = constructorDescriptor.mo89339g();
        listMo89339g.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo89339g)).getType().mo92781G0().mo89207e();
        return Intrinsics.m88377d(classifierDescriptorMo89207e != null ? DescriptorUtilsKt.m92874p(classifierDescriptorMo89207e) : null, DescriptorUtilsKt.m92874p(classDescriptor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    /* JADX INFO: renamed from: a */
    public boolean mo89304a(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        LazyJavaClassDescriptor lazyJavaClassDescriptorM89314z = m89314z(classDescriptor);
        if (lazyJavaClassDescriptorM89314z == null || !simpleFunctionDescriptor.getAnnotations().mo89530d0(PlatformDependentDeclarationFilterKt.m89544a())) {
            return true;
        }
        if (!m89301D().m89279b()) {
            return false;
        }
        String strM91269c = MethodSignatureMappingKt.m91269c(simpleFunctionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM90564N0 = lazyJavaClassDescriptorM89314z.mo89346D();
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Collection<SimpleFunctionDescriptor> collectionMo89611b = lazyJavaClassMemberScopeM90564N0.mo89611b(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionMo89611b instanceof Collection) && collectionMo89611b.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionMo89611b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m88377d(MethodSignatureMappingKt.m91269c((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strM91269c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<ClassConstructorDescriptor> mo89305b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        if (classDescriptor.getKind() != ClassKind.CLASS || !m89301D().m89279b()) {
            return CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM89314z = m89314z(classDescriptor);
        if (lazyJavaClassDescriptorM89314z == null) {
            return CollectionsKt.emptyList();
        }
        ClassDescriptor classDescriptorM89254f = JavaToKotlinClassMapper.m89254f(this.f64676b, DescriptorUtilsKt.m92873o(lazyJavaClassDescriptorM89314z), FallbackBuiltIns.Companion.m89233a(), null, 4, null);
        if (classDescriptorM89254f == null) {
            return CollectionsKt.emptyList();
        }
        TypeSubstitutor typeSubstitutorM93648c = MappingUtilKt.m89333a(classDescriptorM89254f, lazyJavaClassDescriptorM89314z).m93648c();
        List<ClassConstructorDescriptor> listM90561K0 = lazyJavaClassDescriptorM89314z.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : listM90561K0) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().m89396d()) {
                Collection<ClassConstructorDescriptor> constructors = classDescriptorM89254f.getConstructors();
                constructors.getClass();
                Collection<ClassConstructorDescriptor> collection = constructors;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            classConstructorDescriptor2.getClass();
                            if (m89297w(classConstructorDescriptor2, typeSubstitutorM93648c, classConstructorDescriptor)) {
                            }
                        }
                    }
                }
                if (!m89303H(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.m89081l0(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.m89326e().contains(MethodSignatureBuildingUtilsKt.m91266a(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM89314z, MethodSignatureMappingKt.m91269c(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderMo89405k = classConstructorDescriptor3.mo89405k();
            copyBuilderMo89405k.mo89424r(classDescriptor);
            copyBuilderMo89405k.mo89414h(classDescriptor.mo89349o());
            copyBuilderMo89405k.mo89413g();
            copyBuilderMo89405k.mo89409c(typeSubstitutorM93648c.m93669k());
            if (!JvmBuiltInsSignatures.INSTANCE.m89329h().contains(MethodSignatureBuildingUtilsKt.m91266a(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM89314z, MethodSignatureMappingKt.m91269c(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderMo89405k.mo89418l(m89300C());
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderMo89405k.build();
            functionDescriptorBuild.getClass();
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89306c(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM92874p = DescriptorUtilsKt.m92874p(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (jvmBuiltInsSignatures.m89331j(fqNameUnsafeM92874p)) {
            return CollectionsKt.listOf((Object[]) new KotlinType[]{m89312v(), this.f64678d});
        }
        return jvmBuiltInsSignatures.m89332k(fqNameUnsafeM92874p) ? CollectionsKt.listOf(this.f64678d) : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: d */
    public Collection<SimpleFunctionDescriptor> mo89307d(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        Annotations annotationsInvoke;
        name.getClass();
        classDescriptor.getClass();
        if (Intrinsics.m88377d(name, CloneableClassScope.Companion.m89230a()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.m89074e0(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.m93207X0().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m88377d(NameResolverUtilKt.m93124b(deserializedClassDescriptor.m93206W0().m93075g(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.m89230a())) {
                        return CollectionsKt.emptyList();
                    }
                }
            }
            return CollectionsKt.listOf(m89309p(deserializedClassDescriptor, (SimpleFunctionDescriptor) CollectionsKt.single(m89312v().mo90791n().mo89611b(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!m89301D().m89279b()) {
            return CollectionsKt.emptyList();
        }
        Collection<SimpleFunctionDescriptor> collectionM89311t = m89311t(classDescriptor, new pvq(name));
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collectionM89311t) {
            DeclarationDescriptor declarationDescriptorMo89190b = simpleFunctionDescriptor.mo89190b();
            declarationDescriptorMo89190b.getClass();
            FunctionDescriptor functionDescriptorMo89344c = simpleFunctionDescriptor.mo89344c(MappingUtilKt.m89333a((ClassDescriptor) declarationDescriptorMo89190b, classDescriptor).m93648c());
            functionDescriptorMo89344c.getClass();
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo89405k = ((SimpleFunctionDescriptor) functionDescriptorMo89344c).mo89405k();
            copyBuilderMo89405k.mo89424r(classDescriptor);
            copyBuilderMo89405k.mo89407a(classDescriptor.mo89347R());
            copyBuilderMo89405k.mo89413g();
            int i = WhenMappings.f64683a[m89299A(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i != 1) {
                if (i == 2) {
                    Name name2 = simpleFunctionDescriptor.getName();
                    if (Intrinsics.m88377d(name2, JvmBuiltInsCustomizerKt.f64686a)) {
                        annotationsInvoke = this.f64682h.invoke(TuplesKt.m88129a(simpleFunctionDescriptor.getName().m91973b(), "first"));
                    } else {
                        if (!Intrinsics.m88377d(name2, JvmBuiltInsCustomizerKt.f64687b)) {
                            emc0.m121356a("Unexpected name: ", simpleFunctionDescriptor.getName());
                            return null;
                        }
                        annotationsInvoke = this.f64682h.invoke(TuplesKt.m88129a(simpleFunctionDescriptor.getName().m91973b(), "last"));
                    }
                    copyBuilderMo89405k.mo89418l(annotationsInvoke);
                } else if (i == 3) {
                    copyBuilderMo89405k.mo89418l(m89300C());
                } else if (i != 4) {
                    if (i != 5) {
                        nbr.m162172a();
                        return null;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                FunctionDescriptor functionDescriptorBuild = copyBuilderMo89405k.build();
                functionDescriptorBuild.getClass();
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            } else if (!ModalityUtilsKt.m89433a(classDescriptor)) {
                copyBuilderMo89405k.mo89421o();
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderMo89405k.build();
                functionDescriptorBuild2.getClass();
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            }
            if (simpleFunctionDescriptor2 != null) {
                arrayList.add(simpleFunctionDescriptor2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final SimpleFunctionDescriptor m89309p(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo89405k = simpleFunctionDescriptor.mo89405k();
        copyBuilderMo89405k.mo89424r(deserializedClassDescriptor);
        copyBuilderMo89405k.mo89422p(DescriptorVisibilities.f64700e);
        copyBuilderMo89405k.mo89414h(deserializedClassDescriptor.mo89349o());
        copyBuilderMo89405k.mo89407a(deserializedClassDescriptor.mo89347R());
        FunctionDescriptor functionDescriptorBuild = copyBuilderMo89405k.build();
        functionDescriptorBuild.getClass();
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    /* JADX INFO: renamed from: q */
    public final KotlinType m89310q(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.f64675a;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public MemberScope.Empty mo89316n() {
                return MemberScope.Empty.INSTANCE;
            }
        }, Name.m91970i("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(new LazyWrappedType(storageManager, new ovq(this))), SourceElement.f64737a, false, storageManager);
        classDescriptorImpl.m89596D0(MemberScope.Empty.INSTANCE, SetsKt.emptySet(), null);
        SimpleType simpleTypeMo89349o = classDescriptorImpl.mo89349o();
        simpleTypeMo89349o.getClass();
        return simpleTypeMo89349o;
    }

    /* JADX INFO: renamed from: t */
    public final Collection<SimpleFunctionDescriptor> m89311t(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorM89314z = m89314z(classDescriptor);
        if (lazyJavaClassDescriptorM89314z == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassDescriptor> collectionM89260g = this.f64676b.m89260g(DescriptorUtilsKt.m92873o(lazyJavaClassDescriptorM89314z), FallbackBuiltIns.Companion.m89233a());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.lastOrNull(collectionM89260g);
        if (classDescriptor2 == null) {
            return CollectionsKt.emptyList();
        }
        SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionM89260g, 10));
        Iterator<T> it = collectionM89260g.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.m92873o((ClassDescriptor) it.next()));
        }
        SmartSet smartSetM94113b = companion.m94113b(arrayList);
        boolean zM89257c = this.f64676b.m89257c(classDescriptor);
        MemberScope memberScopeMo89346D = this.f64680f.mo93326a(DescriptorUtilsKt.m92873o(lazyJavaClassDescriptorM89314z), new qvq(lazyJavaClassDescriptorM89314z, classDescriptor2)).mo89346D();
        memberScopeMo89346D.getClass();
        Collection<? extends SimpleFunctionDescriptor> collectionInvoke = function1.invoke(memberScopeMo89346D);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().m89396d() && !KotlinBuiltIns.m89081l0(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> collectionMo89338e = simpleFunctionDescriptor.mo89338e();
                collectionMo89338e.getClass();
                Collection<? extends FunctionDescriptor> collection = collectionMo89338e;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            DeclarationDescriptor declarationDescriptorMo89190b = ((FunctionDescriptor) it2.next()).mo89190b();
                            declarationDescriptorMo89190b.getClass();
                            if (smartSetM94113b.contains(DescriptorUtilsKt.m92873o(declarationDescriptorMo89190b))) {
                            }
                        }
                    }
                }
                if (!m89302E(simpleFunctionDescriptor, zM89257c)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: v */
    public final SimpleType m89312v() {
        return (SimpleType) StorageKt.m93375a(this.f64679e, this, f64674i[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<Name> mo89308e(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM90564N0;
        Set<Name> setMo89610a;
        classDescriptor.getClass();
        if (!m89301D().m89279b()) {
            return SetsKt.emptySet();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM89314z = m89314z(classDescriptor);
        return (lazyJavaClassDescriptorM89314z == null || (lazyJavaClassMemberScopeM90564N0 = lazyJavaClassDescriptorM89314z.mo89346D()) == null || (setMo89610a = lazyJavaClassMemberScopeM90564N0.mo89610a()) == null) ? SetsKt.emptySet() : setMo89610a;
    }

    /* JADX INFO: renamed from: z */
    public final LazyJavaClassDescriptor m89314z(ClassDescriptor classDescriptor) {
        ClassId classIdM89247n;
        FqName fqNameM91925a;
        if (KotlinBuiltIns.m89068b0(classDescriptor) || !KotlinBuiltIns.m89060C0(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafeM92874p = DescriptorUtilsKt.m92874p(classDescriptor);
        if (fqNameUnsafeM92874p.m91953f() && (classIdM89247n = JavaToKotlinClassMap.INSTANCE.m89247n(fqNameUnsafeM92874p)) != null && (fqNameM91925a = classIdM89247n.m91925a()) != null) {
            ClassDescriptor classDescriptorM89372d = DescriptorUtilKt.m89372d(m89301D().m89278a(), fqNameM91925a, NoLookupLocation.FROM_BUILTINS);
            if (classDescriptorM89372d instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorM89372d;
            }
        }
        return null;
    }
}
