package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.p046p1.mobile.putong.data.Settings;
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
import p149l.ktq;
import p149l.l9r;
import p149l.ltq;
import p149l.mtq;
import p149l.ntq;
import p149l.otq;
import p149l.ptq;
import p149l.qtq;
import p149l.rtq;
import p149l.stq;
import p149l.xdc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f64000i = {Reflection.m87514i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, Settings.TYPE, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), Reflection.m87514i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.m87514i(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f64001a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JavaToKotlinClassMapper f64002b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f64003c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KotlinType f64004d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final NotNullLazyValue f64005e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final CacheWithNotNullValues<FqName, ClassDescriptor> f64006f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final NotNullLazyValue f64007g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> f64008h;

    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64009a;

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
            f64009a = iArr;
        }
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> function0) {
        moduleDescriptor.getClass();
        storageManager.getClass();
        function0.getClass();
        this.f64001a = moduleDescriptor;
        this.f64002b = JavaToKotlinClassMapper.INSTANCE;
        this.f64003c = storageManager.mo92446e(function0);
        this.f64004d = m88419q(storageManager);
        this.f64005e = storageManager.mo92446e(new ktq(this, storageManager));
        this.f64006f = storageManager.mo92445d();
        this.f64007g = storageManager.mo92446e(new ltq(this));
        this.f64008h = storageManager.mo92450i(new mtq(this));
    }

    /* JADX INFO: renamed from: B */
    public static final Iterable m88389B(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionMo88678c = classDescriptor.mo88305l().mo88678c();
        collectionMo88678c.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo88678c.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo88316e = ((KotlinType) it.next()).mo91890G0().mo88316e();
            ClassDescriptor classDescriptorM88423z = null;
            ClassifierDescriptor classifierDescriptorMo88445a = classifierDescriptorMo88316e != null ? classifierDescriptorMo88316e.mo88445a() : null;
            ClassDescriptor classDescriptor2 = classifierDescriptorMo88445a instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88445a : null;
            if (classDescriptor2 != null && (classDescriptorM88423z = jvmBuiltInsCustomizer.m88423z(classDescriptor2)) == null) {
                classDescriptorM88423z = classDescriptor2;
            }
            if (classDescriptorM88423z != null) {
                arrayList.add(classDescriptorM88423z);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static final Iterable m88390F(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.mo88445a().mo88447e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: G */
    public static final Boolean m88391G(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.f64002b;
            DeclarationDescriptor declarationDescriptorMo88299b = callableMemberDescriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (javaToKotlinClassMapper.m88366c((ClassDescriptor) declarationDescriptorMo88299b)) {
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
    public static final Annotations m88392I(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        return Annotations.Companion.m88640a(CollectionsKt.listOf(AnnotationUtilKt.m88636c(jvmBuiltInsCustomizer.f64001a.mo88546f(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: renamed from: o */
    public static final SimpleType m88402o(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        return FindClassInModuleKt.m88509d(jvmBuiltInsCustomizer.m88410D().m88387a(), JvmBuiltInClassDescriptorFactory.Companion.m88376a(), new NotFoundClasses(storageManager, jvmBuiltInsCustomizer.m88410D().m88387a())).mo88458o();
    }

    /* JADX INFO: renamed from: r */
    public static final KotlinType m88403r(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        SimpleType simpleTypeM88232i = jvmBuiltInsCustomizer.f64001a.mo88546f().m88232i();
        simpleTypeM88232i.getClass();
        return simpleTypeM88232i;
    }

    /* JADX INFO: renamed from: s */
    public static final Annotations m88404s(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, Pair pair) {
        pair.getClass();
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return Annotations.Companion.m88640a(CollectionsKt.listOf(AnnotationUtilKt.m88635b(jvmBuiltInsCustomizer.f64001a.mo88546f(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    /* JADX INFO: renamed from: u */
    public static final ClassDescriptor m88405u(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        JavaResolverCache javaResolverCache = JavaResolverCache.f64782a;
        javaResolverCache.getClass();
        return lazyJavaClassDescriptor.m89669I0(javaResolverCache, classDescriptor);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m88406w(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        return OverridingUtil.m91833x(constructorDescriptor, constructorDescriptor2.mo88453c(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    /* JADX INFO: renamed from: x */
    public static final Collection m88407x(Name name, MemberScope memberScope) {
        memberScope.getClass();
        return memberScope.mo88720b(name, NoLookupLocation.FROM_BUILTINS);
    }

    /* JADX INFO: renamed from: A */
    public final JDKMemberStatus m88408A(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor declarationDescriptorMo88299b = functionDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        final String strM90378c = MethodSignatureMappingKt.m90378c(functionDescriptor, false, false, 3, null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objM93186b = DFS.m93186b(CollectionsKt.listOf((ClassDescriptor) declarationDescriptorMo88299b), new stq(this), new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
            /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean mo87633a(ClassDescriptor classDescriptor) {
                classDescriptor.getClass();
                String strM90375a = MethodSignatureBuildingUtilsKt.m90375a(SignatureBuildingComponents.INSTANCE, classDescriptor, strM90378c);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                if (jvmBuiltInsSignatures.m88436f().contains(strM90375a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
                } else if (jvmBuiltInsSignatures.m88439i().contains(strM90375a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
                } else if (jvmBuiltInsSignatures.m88433c().contains(strM90375a)) {
                    objectRef.element = JvmBuiltInsCustomizer.JDKMemberStatus.DEPRECATED_LIST_METHODS;
                } else if (jvmBuiltInsSignatures.m88434d().contains(strM90375a)) {
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
        objM93186b.getClass();
        return (JDKMemberStatus) objM93186b;
    }

    /* JADX INFO: renamed from: C */
    public final Annotations m88409C() {
        return (Annotations) StorageKt.m92484a(this.f64007g, this, f64000i[2]);
    }

    /* JADX INFO: renamed from: D */
    public final JvmBuiltIns.Settings m88410D() {
        return (JvmBuiltIns.Settings) StorageKt.m92484a(this.f64003c, this, f64000i[0]);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m88411E(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor declarationDescriptorMo88299b = simpleFunctionDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        String strM90378c = MethodSignatureMappingKt.m90378c(simpleFunctionDescriptor, false, false, 3, null);
        if (z ^ JvmBuiltInsSignatures.INSTANCE.m88437g().contains(MethodSignatureBuildingUtilsKt.m90375a(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) declarationDescriptorMo88299b, strM90378c))) {
            return true;
        }
        Boolean boolM93189e = DFS.m93189e(CollectionsKt.listOf(simpleFunctionDescriptor), qtq.INSTANCE, new rtq(this));
        boolM93189e.getClass();
        return boolM93189e.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m88412H(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.mo88448g().size() != 1) {
            return false;
        }
        List<ValueParameterDescriptor> listMo88448g = constructorDescriptor.mo88448g();
        listMo88448g.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = ((ValueParameterDescriptor) CollectionsKt.single((List) listMo88448g)).getType().mo91890G0().mo88316e();
        return Intrinsics.m87488d(classifierDescriptorMo88316e != null ? DescriptorUtilsKt.m91983p(classifierDescriptorMo88316e) : null, DescriptorUtilsKt.m91983p(classDescriptor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    /* JADX INFO: renamed from: a */
    public boolean mo88413a(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        classDescriptor.getClass();
        simpleFunctionDescriptor.getClass();
        LazyJavaClassDescriptor lazyJavaClassDescriptorM88423z = m88423z(classDescriptor);
        if (lazyJavaClassDescriptorM88423z == null || !simpleFunctionDescriptor.getAnnotations().mo88639c0(PlatformDependentDeclarationFilterKt.m88653a())) {
            return true;
        }
        if (!m88410D().m88388b()) {
            return false;
        }
        String strM90378c = MethodSignatureMappingKt.m90378c(simpleFunctionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM89673N0 = lazyJavaClassDescriptorM88423z.mo88455D();
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        Collection<SimpleFunctionDescriptor> collectionMo88720b = lazyJavaClassMemberScopeM89673N0.mo88720b(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionMo88720b instanceof Collection) && collectionMo88720b.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionMo88720b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m87488d(MethodSignatureMappingKt.m90378c((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strM90378c)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<ClassConstructorDescriptor> mo88414b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        if (classDescriptor.getKind() != ClassKind.CLASS || !m88410D().m88388b()) {
            return CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM88423z = m88423z(classDescriptor);
        if (lazyJavaClassDescriptorM88423z == null) {
            return CollectionsKt.emptyList();
        }
        ClassDescriptor classDescriptorM88363f = JavaToKotlinClassMapper.m88363f(this.f64002b, DescriptorUtilsKt.m91982o(lazyJavaClassDescriptorM88423z), FallbackBuiltIns.Companion.m88342a(), null, 4, null);
        if (classDescriptorM88363f == null) {
            return CollectionsKt.emptyList();
        }
        TypeSubstitutor typeSubstitutorM92757c = MappingUtilKt.m88442a(classDescriptorM88363f, lazyJavaClassDescriptorM88423z).m92757c();
        List<ClassConstructorDescriptor> listM89670K0 = lazyJavaClassDescriptorM88423z.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : listM89670K0) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().m88505d()) {
                Collection<ClassConstructorDescriptor> constructors = classDescriptorM88363f.getConstructors();
                constructors.getClass();
                Collection<ClassConstructorDescriptor> collection = constructors;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            classConstructorDescriptor2.getClass();
                            if (m88406w(classConstructorDescriptor2, typeSubstitutorM92757c, classConstructorDescriptor)) {
                            }
                        }
                    }
                }
                if (!m88412H(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.m88190l0(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.m88435e().contains(MethodSignatureBuildingUtilsKt.m90375a(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM88423z, MethodSignatureMappingKt.m90378c(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderMo88514k = classConstructorDescriptor3.mo88514k();
            copyBuilderMo88514k.mo88533r(classDescriptor);
            copyBuilderMo88514k.mo88523h(classDescriptor.mo88458o());
            copyBuilderMo88514k.mo88522g();
            copyBuilderMo88514k.mo88518c(typeSubstitutorM92757c.m92778k());
            if (!JvmBuiltInsSignatures.INSTANCE.m88438h().contains(MethodSignatureBuildingUtilsKt.m90375a(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorM88423z, MethodSignatureMappingKt.m90378c(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderMo88514k.mo88527l(m88409C());
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderMo88514k.build();
            functionDescriptorBuild.getClass();
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo88415c(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM91983p = DescriptorUtilsKt.m91983p(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (jvmBuiltInsSignatures.m88440j(fqNameUnsafeM91983p)) {
            return CollectionsKt.listOf((Object[]) new KotlinType[]{m88421v(), this.f64004d});
        }
        return jvmBuiltInsSignatures.m88441k(fqNameUnsafeM91983p) ? CollectionsKt.listOf(this.f64004d) : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: d */
    public Collection<SimpleFunctionDescriptor> mo88416d(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        Annotations annotationsInvoke;
        name.getClass();
        classDescriptor.getClass();
        if (Intrinsics.m87488d(name, CloneableClassScope.Companion.m88339a()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.m88183e0(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.m92316X0().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m87488d(NameResolverUtilKt.m92233b(deserializedClassDescriptor.m92315W0().m92184g(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.m88339a())) {
                        return CollectionsKt.emptyList();
                    }
                }
            }
            return CollectionsKt.listOf(m88418p(deserializedClassDescriptor, (SimpleFunctionDescriptor) CollectionsKt.single(m88421v().mo89900n().mo88720b(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!m88410D().m88388b()) {
            return CollectionsKt.emptyList();
        }
        Collection<SimpleFunctionDescriptor> collectionM88420t = m88420t(classDescriptor, new otq(name));
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collectionM88420t) {
            DeclarationDescriptor declarationDescriptorMo88299b = simpleFunctionDescriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            FunctionDescriptor functionDescriptorMo88453c = simpleFunctionDescriptor.mo88453c(MappingUtilKt.m88442a((ClassDescriptor) declarationDescriptorMo88299b, classDescriptor).m92757c());
            functionDescriptorMo88453c.getClass();
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo88514k = ((SimpleFunctionDescriptor) functionDescriptorMo88453c).mo88514k();
            copyBuilderMo88514k.mo88533r(classDescriptor);
            copyBuilderMo88514k.mo88516a(classDescriptor.mo88456R());
            copyBuilderMo88514k.mo88522g();
            int i = WhenMappings.f64009a[m88408A(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i != 1) {
                if (i == 2) {
                    Name name2 = simpleFunctionDescriptor.getName();
                    if (Intrinsics.m87488d(name2, JvmBuiltInsCustomizerKt.f64012a)) {
                        annotationsInvoke = this.f64008h.invoke(TuplesKt.m87240a(simpleFunctionDescriptor.getName().m91082b(), "first"));
                    } else {
                        if (!Intrinsics.m87488d(name2, JvmBuiltInsCustomizerKt.f64013b)) {
                            xdc0.m208279a("Unexpected name: ", simpleFunctionDescriptor.getName());
                            return null;
                        }
                        annotationsInvoke = this.f64008h.invoke(TuplesKt.m87240a(simpleFunctionDescriptor.getName().m91082b(), "last"));
                    }
                    copyBuilderMo88514k.mo88527l(annotationsInvoke);
                } else if (i == 3) {
                    copyBuilderMo88514k.mo88527l(m88409C());
                } else if (i != 4) {
                    if (i != 5) {
                        l9r.m149037a();
                        return null;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                FunctionDescriptor functionDescriptorBuild = copyBuilderMo88514k.build();
                functionDescriptorBuild.getClass();
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            } else if (!ModalityUtilsKt.m88542a(classDescriptor)) {
                copyBuilderMo88514k.mo88530o();
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderMo88514k.build();
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
    public final SimpleFunctionDescriptor m88418p(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderMo88514k = simpleFunctionDescriptor.mo88514k();
        copyBuilderMo88514k.mo88533r(deserializedClassDescriptor);
        copyBuilderMo88514k.mo88531p(DescriptorVisibilities.f64026e);
        copyBuilderMo88514k.mo88523h(deserializedClassDescriptor.mo88458o());
        copyBuilderMo88514k.mo88516a(deserializedClassDescriptor.mo88456R());
        FunctionDescriptor functionDescriptorBuild = copyBuilderMo88514k.build();
        functionDescriptorBuild.getClass();
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    /* JADX INFO: renamed from: q */
    public final KotlinType m88419q(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.f64001a;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
            public MemberScope.Empty mo88425n() {
                return MemberScope.Empty.INSTANCE;
            }
        }, Name.m91079i("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(new LazyWrappedType(storageManager, new ntq(this))), SourceElement.f64063a, false, storageManager);
        classDescriptorImpl.m88705D0(MemberScope.Empty.INSTANCE, SetsKt.emptySet(), null);
        SimpleType simpleTypeMo88458o = classDescriptorImpl.mo88458o();
        simpleTypeMo88458o.getClass();
        return simpleTypeMo88458o;
    }

    /* JADX INFO: renamed from: t */
    public final Collection<SimpleFunctionDescriptor> m88420t(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorM88423z = m88423z(classDescriptor);
        if (lazyJavaClassDescriptorM88423z == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassDescriptor> collectionM88369g = this.f64002b.m88369g(DescriptorUtilsKt.m91982o(lazyJavaClassDescriptorM88423z), FallbackBuiltIns.Companion.m88342a());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.lastOrNull(collectionM88369g);
        if (classDescriptor2 == null) {
            return CollectionsKt.emptyList();
        }
        SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionM88369g, 10));
        Iterator<T> it = collectionM88369g.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.m91982o((ClassDescriptor) it.next()));
        }
        SmartSet smartSetM93222b = companion.m93222b(arrayList);
        boolean zM88366c = this.f64002b.m88366c(classDescriptor);
        MemberScope memberScopeMo88455D = this.f64006f.mo92435a(DescriptorUtilsKt.m91982o(lazyJavaClassDescriptorM88423z), new ptq(lazyJavaClassDescriptorM88423z, classDescriptor2)).mo88455D();
        memberScopeMo88455D.getClass();
        Collection<? extends SimpleFunctionDescriptor> collectionInvoke = function1.invoke(memberScopeMo88455D);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().m88505d() && !KotlinBuiltIns.m88190l0(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> collectionMo88447e = simpleFunctionDescriptor.mo88447e();
                collectionMo88447e.getClass();
                Collection<? extends FunctionDescriptor> collection = collectionMo88447e;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            DeclarationDescriptor declarationDescriptorMo88299b = ((FunctionDescriptor) it2.next()).mo88299b();
                            declarationDescriptorMo88299b.getClass();
                            if (smartSetM93222b.contains(DescriptorUtilsKt.m91982o(declarationDescriptorMo88299b))) {
                            }
                        }
                    }
                }
                if (!m88411E(simpleFunctionDescriptor, zM88366c)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: v */
    public final SimpleType m88421v() {
        return (SimpleType) StorageKt.m92484a(this.f64005e, this, f64000i[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<Name> mo88417e(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM89673N0;
        Set<Name> setMo88719a;
        classDescriptor.getClass();
        if (!m88410D().m88388b()) {
            return SetsKt.emptySet();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorM88423z = m88423z(classDescriptor);
        return (lazyJavaClassDescriptorM88423z == null || (lazyJavaClassMemberScopeM89673N0 = lazyJavaClassDescriptorM88423z.mo88455D()) == null || (setMo88719a = lazyJavaClassMemberScopeM89673N0.mo88719a()) == null) ? SetsKt.emptySet() : setMo88719a;
    }

    /* JADX INFO: renamed from: z */
    public final LazyJavaClassDescriptor m88423z(ClassDescriptor classDescriptor) {
        ClassId classIdM88356n;
        FqName fqNameM91034a;
        if (KotlinBuiltIns.m88177b0(classDescriptor) || !KotlinBuiltIns.m88169C0(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafeM91983p = DescriptorUtilsKt.m91983p(classDescriptor);
        if (fqNameUnsafeM91983p.m91062f() && (classIdM88356n = JavaToKotlinClassMap.INSTANCE.m88356n(fqNameUnsafeM91983p)) != null && (fqNameM91034a = classIdM88356n.m91034a()) != null) {
            ClassDescriptor classDescriptorM88481d = DescriptorUtilKt.m88481d(m88410D().m88387a(), fqNameM91034a, NoLookupLocation.FROM_BUILTINS);
            if (classDescriptorM88481d instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorM88481d;
            }
        }
        return null;
    }
}
