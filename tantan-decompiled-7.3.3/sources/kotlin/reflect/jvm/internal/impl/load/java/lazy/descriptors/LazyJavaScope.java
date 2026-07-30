package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.abr;
import p153l.bbr;
import p153l.cbr;
import p153l.dbr;
import p153l.ebr;
import p153l.fbr;
import p153l.gbr;
import p153l.var;
import p153l.war;
import p153l.xar;
import p153l.xvq;
import p153l.yar;
import p153l.zar;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f65585l = {Reflection.m88403i(new PropertyReference1Impl(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f65586a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final LazyJavaScope f65587b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> f65588c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> f65589d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f65590e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final MemoizedFunctionToNullable<Name, PropertyDescriptor> f65591f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f65592g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final NotNullLazyValue f65593h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final NotNullLazyValue f65594i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f65595j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f65596k;

    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KotlinType f65597a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final KotlinType f65598b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final List<ValueParameterDescriptor> f65599c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final List<TypeParameterDescriptor> f65600d;

        /* JADX INFO: renamed from: e */
        public final boolean f65601e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final List<String> f65602f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<? extends ValueParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, boolean z, @NotNull List<String> list3) {
            kotlinType.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f65597a = kotlinType;
            this.f65598b = kotlinType2;
            this.f65599c = list;
            this.f65600d = list2;
            this.f65601e = z;
            this.f65602f = list3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m90709a() {
            return this.f65602f;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m90710b() {
            return this.f65601e;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final KotlinType m90711c() {
            return this.f65598b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final KotlinType m90712d() {
            return this.f65597a;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<TypeParameterDescriptor> m90713e() {
            return this.f65600d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.m88377d(this.f65597a, methodSignatureData.f65597a) && Intrinsics.m88377d(this.f65598b, methodSignatureData.f65598b) && Intrinsics.m88377d(this.f65599c, methodSignatureData.f65599c) && Intrinsics.m88377d(this.f65600d, methodSignatureData.f65600d) && this.f65601e == methodSignatureData.f65601e && Intrinsics.m88377d(this.f65602f, methodSignatureData.f65602f);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<ValueParameterDescriptor> m90714f() {
            return this.f65599c;
        }

        public int hashCode() {
            int iHashCode = this.f65597a.hashCode() * 31;
            KotlinType kotlinType = this.f65598b;
            return ((((((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.f65599c.hashCode()) * 31) + this.f65600d.hashCode()) * 31) + Boolean.hashCode(this.f65601e)) * 31) + this.f65602f.hashCode();
        }

        @NotNull
        public String toString() {
            return "MethodSignatureData(returnType=" + this.f65597a + ", receiverType=" + this.f65598b + ", valueParameters=" + this.f65599c + ", typeParameters=" + this.f65600d + ", hasStableParameterNames=" + this.f65601e + ", errors=" + this.f65602f + ')';
        }
    }

    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<ValueParameterDescriptor> f65603a;

        /* JADX INFO: renamed from: b */
        public final boolean f65604b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> list, boolean z) {
            list.getClass();
            this.f65603a = list;
            this.f65604b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<ValueParameterDescriptor> m90715a() {
            return this.f65603a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m90716b() {
            return this.f65604b;
        }
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable LazyJavaScope lazyJavaScope) {
        lazyJavaResolverContext.getClass();
        this.f65586a = lazyJavaResolverContext;
        this.f65587b = lazyJavaScope;
        this.f65588c = lazyJavaResolverContext.m90512e().mo93333a(new var(this), CollectionsKt.emptyList());
        this.f65589d = lazyJavaResolverContext.m90512e().mo93337e(new yar(this));
        this.f65590e = lazyJavaResolverContext.m90512e().mo93341i(new zar(this));
        this.f65591f = lazyJavaResolverContext.m90512e().mo93335c(new abr(this));
        this.f65592g = lazyJavaResolverContext.m90512e().mo93341i(new bbr(this));
        this.f65593h = lazyJavaResolverContext.m90512e().mo93337e(new cbr(this));
        this.f65594i = lazyJavaResolverContext.m90512e().mo93337e(new dbr(this));
        this.f65595j = lazyJavaResolverContext.m90512e().mo93337e(new ebr(this));
        this.f65596k = lazyJavaResolverContext.m90512e().mo93341i(new fbr(this));
    }

    /* JADX INFO: renamed from: F */
    public static final PropertyDescriptor m90669F(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f65587b;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f65591f.invoke(name);
        }
        JavaField javaFieldMo90525c = lazyJavaScope.f65589d.invoke().mo90525c(name);
        if (javaFieldMo90525c == null || javaFieldMo90525c.mo89941F()) {
            return null;
        }
        return lazyJavaScope.m90705a0(javaFieldMo90525c);
    }

    /* JADX INFO: renamed from: G */
    public static final Collection m90670G(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f65587b;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f65590e.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : lazyJavaScope.f65589d.invoke().mo90527e(name)) {
            JavaMethodDescriptor javaMethodDescriptorM90704Z = lazyJavaScope.m90704Z(javaMethod);
            if (lazyJavaScope.mo90614V(javaMethodDescriptorM90704Z)) {
                lazyJavaScope.f65586a.m90508a().m90480h().mo90426b(javaMethod, javaMethodDescriptorM90704Z);
                arrayList.add(javaMethodDescriptorM90704Z);
            }
        }
        lazyJavaScope.mo90643y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static final DeclaredMemberIndex m90671H(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo90645z();
    }

    /* JADX INFO: renamed from: I */
    public static final Set m90672I(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo90641x(DescriptorKindFilter.f66573u, null);
    }

    /* JADX INFO: renamed from: J */
    public static final Collection m90673J(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(lazyJavaScope.f65590e.invoke(name));
        lazyJavaScope.m90707e0(linkedHashSet);
        lazyJavaScope.mo90593B(linkedHashSet, name);
        return CollectionsKt.toList(lazyJavaScope.f65586a.m90508a().m90490r().m90979p(lazyJavaScope.f65586a, linkedHashSet));
    }

    /* JADX INFO: renamed from: W */
    public static final List m90674W(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, lazyJavaScope.f65591f.invoke(name));
        lazyJavaScope.mo90594C(name, arrayList);
        return DescriptorUtils.m92670t(lazyJavaScope.mo90610R()) ? CollectionsKt.toList(arrayList) : CollectionsKt.toList(lazyJavaScope.f65586a.m90508a().m90490r().m90979p(lazyJavaScope.f65586a, arrayList));
    }

    /* JADX INFO: renamed from: X */
    public static final Set m90675X(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo90596D(DescriptorKindFilter.f66574v, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static final NullableLazyValue m90676b0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f65586a.m90512e().mo93339g(new xar(lazyJavaScope, javaField, objectRef));
    }

    /* JADX INFO: renamed from: c0 */
    public static final ConstantValue m90677c0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f65586a.m90508a().m90479g().mo90424a(javaField, (PropertyDescriptor) objectRef.element);
    }

    /* JADX INFO: renamed from: f0 */
    public static final CallableDescriptor m90678f0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: t */
    public static final Collection m90691t(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.m90708w(DescriptorKindFilter.f66566n, MemberScope.Companion.m92956c());
    }

    /* JADX INFO: renamed from: u */
    public static final Set m90692u(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo90638v(DescriptorKindFilter.f66571s, null);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final KotlinType m90693A(@NotNull JavaMethod javaMethod, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        javaMethod.getClass();
        lazyJavaResolverContext.getClass();
        return lazyJavaResolverContext.m90514g().m90765p(javaMethod.getReturnType(), JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, javaMethod.mo89947x().mo89925l(), false, null, 6, null));
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo90593B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    /* JADX INFO: renamed from: C */
    public abstract void mo90594C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    /* JADX INFO: renamed from: D */
    public abstract Set<Name> mo90596D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    /* JADX INFO: renamed from: E */
    public final PropertyDescriptorImpl m90694E(JavaField javaField) {
        JavaPropertyDescriptor javaPropertyDescriptorM90457Z0 = JavaPropertyDescriptor.m90457Z0(mo90610R(), LazyJavaAnnotationsKt.m90503a(this.f65586a, javaField), Modality.FINAL, UtilsKt.m90396d(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f65586a.m90508a().m90492t().mo89855a(javaField), m90703U(javaField));
        javaPropertyDescriptorM90457Z0.getClass();
        return javaPropertyDescriptorM90457Z0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> m90695K() {
        return this.f65588c;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LazyJavaResolverContext m90696L() {
        return this.f65586a;
    }

    /* JADX INFO: renamed from: M */
    public final Set<Name> m90697M() {
        return (Set) StorageKt.m93375a(this.f65595j, this, f65585l[2]);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final NotNullLazyValue<DeclaredMemberIndex> m90698N() {
        return this.f65589d;
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public abstract ReceiverParameterDescriptor mo90606O();

    /* JADX INFO: renamed from: P */
    public final Set<Name> m90699P() {
        return (Set) StorageKt.m93375a(this.f65593h, this, f65585l[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public final LazyJavaScope m90700Q() {
        return this.f65587b;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public abstract DeclarationDescriptor mo90610R();

    /* JADX INFO: renamed from: S */
    public final Set<Name> m90701S() {
        return (Set) StorageKt.m93375a(this.f65594i, this, f65585l[1]);
    }

    /* JADX INFO: renamed from: T */
    public final KotlinType m90702T(JavaField javaField) {
        KotlinType kotlinTypeM90765p = this.f65586a.m90514g().m90765p(javaField.getType(), JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!KotlinBuiltIns.m89089t0(kotlinTypeM90765p) && !KotlinBuiltIns.m89092w0(kotlinTypeM90765p)) || !m90703U(javaField) || !javaField.mo89944w()) {
            return kotlinTypeM90765p;
        }
        KotlinType kotlinTypeM93694n = TypeUtils.m93694n(kotlinTypeM90765p);
        kotlinTypeM93694n.getClass();
        return kotlinTypeM93694n;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m90703U(JavaField javaField) {
        return javaField.isFinal() && javaField.mo89914H();
    }

    /* JADX INFO: renamed from: V */
    public boolean mo90614V(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        javaMethodDescriptor.getClass();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public abstract MethodSignatureData mo90618Y(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final JavaMethodDescriptor m90704Z(@NotNull JavaMethod javaMethod) {
        javaMethod.getClass();
        JavaMethodDescriptor javaMethodDescriptorM90452i1 = JavaMethodDescriptor.m90452i1(mo90610R(), LazyJavaAnnotationsKt.m90503a(this.f65586a, javaMethod), javaMethod.getName(), this.f65586a.m90508a().m90492t().mo89855a(javaMethod), this.f65589d.invoke().mo90528f(javaMethod.getName()) != null && javaMethod.mo89951g().isEmpty());
        javaMethodDescriptorM90452i1.getClass();
        LazyJavaResolverContext lazyJavaResolverContextM90468i = ContextKt.m90468i(this.f65586a, javaMethodDescriptorM90452i1, javaMethod, 0, 4, null);
        List<JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorMo90517a = lazyJavaResolverContextM90468i.m90513f().mo90517a((JavaTypeParameter) it.next());
            typeParameterDescriptorMo90517a.getClass();
            arrayList.add(typeParameterDescriptorMo90517a);
        }
        ResolvedValueParameters resolvedValueParametersM90706d0 = m90706d0(lazyJavaResolverContextM90468i, javaMethodDescriptorM90452i1, javaMethod.mo89951g());
        MethodSignatureData methodSignatureDataMo90618Y = mo90618Y(javaMethod, arrayList, m90693A(javaMethod, lazyJavaResolverContextM90468i), resolvedValueParametersM90706d0.m90715a());
        KotlinType kotlinTypeM90711c = methodSignatureDataMo90618Y.m90711c();
        javaMethodDescriptorM90452i1.mo89793h1(kotlinTypeM90711c != null ? DescriptorFactory.m92628i(javaMethodDescriptorM90452i1, kotlinTypeM90711c, Annotations.Companion.m89532b()) : null, mo90606O(), CollectionsKt.emptyList(), methodSignatureDataMo90618Y.m90713e(), methodSignatureDataMo90618Y.m90714f(), methodSignatureDataMo90618Y.m90712d(), Modality.Companion.m89432a(false, javaMethod.isAbstract(), true ^ javaMethod.isFinal()), UtilsKt.m90396d(javaMethod.getVisibility()), methodSignatureDataMo90618Y.m90711c() != null ? MapsKt.mapOf(TuplesKt.m88129a(JavaMethodDescriptor.f65473G, CollectionsKt.first((List) resolvedValueParametersM90706d0.m90715a()))) : MapsKt.emptyMap());
        javaMethodDescriptorM90452i1.m90455l1(methodSignatureDataMo90618Y.m90710b(), resolvedValueParametersM90706d0.m90716b());
        if (!methodSignatureDataMo90618Y.m90709a().isEmpty()) {
            lazyJavaResolverContextM90468i.m90508a().m90491s().mo90436b(javaMethodDescriptorM90452i1, methodSignatureDataMo90618Y.m90709a());
        }
        return javaMethodDescriptorM90452i1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        return m90699P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX INFO: renamed from: a0 */
    public final PropertyDescriptor m90705a0(JavaField javaField) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M90694E = m90694E(javaField);
        objectRef.element = M90694E;
        M90694E.m89750P0(null, null, null, null);
        ((PropertyDescriptorImpl) objectRef.element).m89755V0(m90702T(javaField), CollectionsKt.emptyList(), mo90606O(), null, CollectionsKt.emptyList());
        DeclarationDescriptor declarationDescriptorMo90610R = mo90610R();
        ClassDescriptor classDescriptor = declarationDescriptorMo90610R instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo90610R : null;
        if (classDescriptor != null) {
            objectRef.element = this.f65586a.m90508a().m90495w().mo92890b(classDescriptor, (PropertyDescriptorImpl) objectRef.element, this.f65586a);
        }
        T t = objectRef.element;
        if (DescriptorUtils.m92648K((VariableDescriptor) t, ((PropertyDescriptorImpl) t).getType())) {
            ((PropertyDescriptorImpl) objectRef.element).m89829F0(new war(this, javaField, objectRef));
        }
        this.f65586a.m90508a().m90480h().mo90428d(javaField, (PropertyDescriptor) objectRef.element);
        return (PropertyDescriptor) objectRef.element;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !mo89610a().contains(name) ? CollectionsKt.emptyList() : this.f65592g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !mo89613d().contains(name) ? CollectionsKt.emptyList() : this.f65596k.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        return m90701S();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final ResolvedValueParameters m90706d0(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull FunctionDescriptor functionDescriptor, @NotNull List<? extends JavaValueParameter> list) {
        Pair pairM88129a;
        Name name;
        lazyJavaResolverContext.getClass();
        functionDescriptor.getClass();
        list.getClass();
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        boolean z = false;
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.component2();
            Annotations annotationsM90503a = LazyJavaAnnotationsKt.m90503a(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes javaTypeAttributesM90749b = JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.mo89961a()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    xvq.m213257a("Vararg parameter should be an array: ", javaValueParameter);
                    return null;
                }
                KotlinType kotlinTypeM90763l = lazyJavaResolverContext.m90514g().m90763l(javaArrayType, javaTypeAttributesM90749b, true);
                pairM88129a = TuplesKt.m88129a(kotlinTypeM90763l, lazyJavaResolverContext.m90511d().mo89437f().m89125k(kotlinTypeM90763l));
            } else {
                pairM88129a = TuplesKt.m88129a(lazyJavaResolverContext.m90514g().m90765p(javaValueParameter.getType(), javaTypeAttributesM90749b), null);
            }
            KotlinType kotlinType = (KotlinType) pairM88129a.component1();
            KotlinType kotlinType2 = (KotlinType) pairM88129a.component2();
            if (Intrinsics.m88377d(functionDescriptor.getName().m91973b(), "equals") && list.size() == 1 && Intrinsics.m88377d(lazyJavaResolverContext.m90511d().mo89437f().m89105J(), kotlinType)) {
                name = Name.m91970i("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    name = Name.m91970i("p" + index);
                    name.getClass();
                }
            }
            Name name2 = name;
            name2.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, null, index, annotationsM90503a, name2, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.m90508a().m90492t().mo89855a(javaValueParameter)));
        }
        return new ResolvedValueParameters(CollectionsKt.toList(arrayList), z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return m90697M();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m90707e0(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strM91269c = MethodSignatureMappingKt.m91269c((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strM91269c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strM91269c, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> collectionM92772b = OverridingUtilsKt.m92772b(list2, gbr.INSTANCE);
                set.removeAll(list2);
                set.addAll(collectionM92772b);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return this.f65588c.invoke();
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + mo90610R();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract Set<Name> mo90638v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<DeclarationDescriptor> m90708w(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92936c())) {
            for (Name name : mo90638v(descriptorKindFilter, function1)) {
                if (function1.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(linkedHashSet, mo90533f(name, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92937d()) && !descriptorKindFilter.m92931l().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : mo90641x(descriptorKindFilter, function1)) {
                if (function1.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(mo89611b(name2, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92942i()) && !descriptorKindFilter.m92931l().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : mo90596D(descriptorKindFilter, function1)) {
                if (function1.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(mo89612c(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract Set<Name> mo90641x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    /* JADX INFO: renamed from: y */
    public void mo90643y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public abstract DeclaredMemberIndex mo90645z();

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i & 2) != 0 ? null : lazyJavaScope);
    }
}
