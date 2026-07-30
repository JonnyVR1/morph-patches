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
import p149l.a9r;
import p149l.b9r;
import p149l.c9r;
import p149l.d9r;
import p149l.e9r;
import p149l.t8r;
import p149l.u8r;
import p149l.v8r;
import p149l.w8r;
import p149l.wtq;
import p149l.x8r;
import p149l.y8r;
import p149l.z8r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f64911l = {Reflection.m87514i(new PropertyReference1Impl(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LazyJavaResolverContext f64912a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final LazyJavaScope f64913b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> f64914c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> f64915d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f64916e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final MemoizedFunctionToNullable<Name, PropertyDescriptor> f64917f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f64918g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final NotNullLazyValue f64919h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final NotNullLazyValue f64920i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f64921j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f64922k;

    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KotlinType f64923a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final KotlinType f64924b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final List<ValueParameterDescriptor> f64925c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final List<TypeParameterDescriptor> f64926d;

        /* JADX INFO: renamed from: e */
        public final boolean f64927e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final List<String> f64928f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<? extends ValueParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, boolean z, @NotNull List<String> list3) {
            kotlinType.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f64923a = kotlinType;
            this.f64924b = kotlinType2;
            this.f64925c = list;
            this.f64926d = list2;
            this.f64927e = z;
            this.f64928f = list3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m89818a() {
            return this.f64928f;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m89819b() {
            return this.f64927e;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final KotlinType m89820c() {
            return this.f64924b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final KotlinType m89821d() {
            return this.f64923a;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<TypeParameterDescriptor> m89822e() {
            return this.f64926d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.m87488d(this.f64923a, methodSignatureData.f64923a) && Intrinsics.m87488d(this.f64924b, methodSignatureData.f64924b) && Intrinsics.m87488d(this.f64925c, methodSignatureData.f64925c) && Intrinsics.m87488d(this.f64926d, methodSignatureData.f64926d) && this.f64927e == methodSignatureData.f64927e && Intrinsics.m87488d(this.f64928f, methodSignatureData.f64928f);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<ValueParameterDescriptor> m89823f() {
            return this.f64925c;
        }

        public int hashCode() {
            int iHashCode = this.f64923a.hashCode() * 31;
            KotlinType kotlinType = this.f64924b;
            return ((((((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.f64925c.hashCode()) * 31) + this.f64926d.hashCode()) * 31) + Boolean.hashCode(this.f64927e)) * 31) + this.f64928f.hashCode();
        }

        @NotNull
        public String toString() {
            return "MethodSignatureData(returnType=" + this.f64923a + ", receiverType=" + this.f64924b + ", valueParameters=" + this.f64925c + ", typeParameters=" + this.f64926d + ", hasStableParameterNames=" + this.f64927e + ", errors=" + this.f64928f + ')';
        }
    }

    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<ValueParameterDescriptor> f64929a;

        /* JADX INFO: renamed from: b */
        public final boolean f64930b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> list, boolean z) {
            list.getClass();
            this.f64929a = list;
            this.f64930b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<ValueParameterDescriptor> m89824a() {
            return this.f64929a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m89825b() {
            return this.f64930b;
        }
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable LazyJavaScope lazyJavaScope) {
        lazyJavaResolverContext.getClass();
        this.f64912a = lazyJavaResolverContext;
        this.f64913b = lazyJavaScope;
        this.f64914c = lazyJavaResolverContext.m89621e().mo92442a(new t8r(this), CollectionsKt.emptyList());
        this.f64915d = lazyJavaResolverContext.m89621e().mo92446e(new w8r(this));
        this.f64916e = lazyJavaResolverContext.m89621e().mo92450i(new x8r(this));
        this.f64917f = lazyJavaResolverContext.m89621e().mo92444c(new y8r(this));
        this.f64918g = lazyJavaResolverContext.m89621e().mo92450i(new z8r(this));
        this.f64919h = lazyJavaResolverContext.m89621e().mo92446e(new a9r(this));
        this.f64920i = lazyJavaResolverContext.m89621e().mo92446e(new b9r(this));
        this.f64921j = lazyJavaResolverContext.m89621e().mo92446e(new c9r(this));
        this.f64922k = lazyJavaResolverContext.m89621e().mo92450i(new d9r(this));
    }

    /* JADX INFO: renamed from: F */
    public static final PropertyDescriptor m89778F(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f64913b;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f64917f.invoke(name);
        }
        JavaField javaFieldMo89634c = lazyJavaScope.f64915d.invoke().mo89634c(name);
        if (javaFieldMo89634c == null || javaFieldMo89634c.mo89050F()) {
            return null;
        }
        return lazyJavaScope.m89814a0(javaFieldMo89634c);
    }

    /* JADX INFO: renamed from: G */
    public static final Collection m89779G(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f64913b;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.f64916e.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : lazyJavaScope.f64915d.invoke().mo89636e(name)) {
            JavaMethodDescriptor javaMethodDescriptorM89813Z = lazyJavaScope.m89813Z(javaMethod);
            if (lazyJavaScope.mo89723V(javaMethodDescriptorM89813Z)) {
                lazyJavaScope.f64912a.m89617a().m89589h().mo89535b(javaMethod, javaMethodDescriptorM89813Z);
                arrayList.add(javaMethodDescriptorM89813Z);
            }
        }
        lazyJavaScope.mo89752y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static final DeclaredMemberIndex m89780H(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo89754z();
    }

    /* JADX INFO: renamed from: I */
    public static final Set m89781I(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo89750x(DescriptorKindFilter.f65899u, null);
    }

    /* JADX INFO: renamed from: J */
    public static final Collection m89782J(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(lazyJavaScope.f64916e.invoke(name));
        lazyJavaScope.m89816e0(linkedHashSet);
        lazyJavaScope.mo89702B(linkedHashSet, name);
        return CollectionsKt.toList(lazyJavaScope.f64912a.m89617a().m89599r().m90088p(lazyJavaScope.f64912a, linkedHashSet));
    }

    /* JADX INFO: renamed from: W */
    public static final List m89783W(LazyJavaScope lazyJavaScope, Name name) {
        name.getClass();
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, lazyJavaScope.f64917f.invoke(name));
        lazyJavaScope.mo89703C(name, arrayList);
        return DescriptorUtils.m91779t(lazyJavaScope.mo89719R()) ? CollectionsKt.toList(arrayList) : CollectionsKt.toList(lazyJavaScope.f64912a.m89617a().m89599r().m90088p(lazyJavaScope.f64912a, arrayList));
    }

    /* JADX INFO: renamed from: X */
    public static final Set m89784X(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo89705D(DescriptorKindFilter.f65900v, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static final NullableLazyValue m89785b0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f64912a.m89621e().mo92448g(new v8r(lazyJavaScope, javaField, objectRef));
    }

    /* JADX INFO: renamed from: c0 */
    public static final ConstantValue m89786c0(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        return lazyJavaScope.f64912a.m89617a().m89588g().mo89533a(javaField, (PropertyDescriptor) objectRef.element);
    }

    /* JADX INFO: renamed from: f0 */
    public static final CallableDescriptor m89787f0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: t */
    public static final Collection m89800t(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.m89817w(DescriptorKindFilter.f65892n, MemberScope.Companion.m92065c());
    }

    /* JADX INFO: renamed from: u */
    public static final Set m89801u(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.mo89747v(DescriptorKindFilter.f65897s, null);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final KotlinType m89802A(@NotNull JavaMethod javaMethod, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        javaMethod.getClass();
        lazyJavaResolverContext.getClass();
        return lazyJavaResolverContext.m89623g().m89874p(javaMethod.getReturnType(), JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, javaMethod.mo89056x().mo89034l(), false, null, 6, null));
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo89702B(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    /* JADX INFO: renamed from: C */
    public abstract void mo89703C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    /* JADX INFO: renamed from: D */
    public abstract Set<Name> mo89705D(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    /* JADX INFO: renamed from: E */
    public final PropertyDescriptorImpl m89803E(JavaField javaField) {
        JavaPropertyDescriptor javaPropertyDescriptorM89566Z0 = JavaPropertyDescriptor.m89566Z0(mo89719R(), LazyJavaAnnotationsKt.m89612a(this.f64912a, javaField), Modality.FINAL, UtilsKt.m89505d(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f64912a.m89617a().m89601t().mo88964a(javaField), m89812U(javaField));
        javaPropertyDescriptorM89566Z0.getClass();
        return javaPropertyDescriptorM89566Z0;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> m89804K() {
        return this.f64914c;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LazyJavaResolverContext m89805L() {
        return this.f64912a;
    }

    /* JADX INFO: renamed from: M */
    public final Set<Name> m89806M() {
        return (Set) StorageKt.m92484a(this.f64921j, this, f64911l[2]);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final NotNullLazyValue<DeclaredMemberIndex> m89807N() {
        return this.f64915d;
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public abstract ReceiverParameterDescriptor mo89715O();

    /* JADX INFO: renamed from: P */
    public final Set<Name> m89808P() {
        return (Set) StorageKt.m92484a(this.f64919h, this, f64911l[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public final LazyJavaScope m89809Q() {
        return this.f64913b;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public abstract DeclarationDescriptor mo89719R();

    /* JADX INFO: renamed from: S */
    public final Set<Name> m89810S() {
        return (Set) StorageKt.m92484a(this.f64920i, this, f64911l[1]);
    }

    /* JADX INFO: renamed from: T */
    public final KotlinType m89811T(JavaField javaField) {
        KotlinType kotlinTypeM89874p = this.f64912a.m89623g().m89874p(javaField.getType(), JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!KotlinBuiltIns.m88198t0(kotlinTypeM89874p) && !KotlinBuiltIns.m88201w0(kotlinTypeM89874p)) || !m89812U(javaField) || !javaField.mo89053w()) {
            return kotlinTypeM89874p;
        }
        KotlinType kotlinTypeM92803n = TypeUtils.m92803n(kotlinTypeM89874p);
        kotlinTypeM92803n.getClass();
        return kotlinTypeM92803n;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m89812U(JavaField javaField) {
        return javaField.isFinal() && javaField.mo89023H();
    }

    /* JADX INFO: renamed from: V */
    public boolean mo89723V(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        javaMethodDescriptor.getClass();
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public abstract MethodSignatureData mo89727Y(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final JavaMethodDescriptor m89813Z(@NotNull JavaMethod javaMethod) {
        javaMethod.getClass();
        JavaMethodDescriptor javaMethodDescriptorM89561i1 = JavaMethodDescriptor.m89561i1(mo89719R(), LazyJavaAnnotationsKt.m89612a(this.f64912a, javaMethod), javaMethod.getName(), this.f64912a.m89617a().m89601t().mo88964a(javaMethod), this.f64915d.invoke().mo89637f(javaMethod.getName()) != null && javaMethod.mo89060g().isEmpty());
        javaMethodDescriptorM89561i1.getClass();
        LazyJavaResolverContext lazyJavaResolverContextM89577i = ContextKt.m89577i(this.f64912a, javaMethodDescriptorM89561i1, javaMethod, 0, 4, null);
        List<JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorMo89626a = lazyJavaResolverContextM89577i.m89622f().mo89626a((JavaTypeParameter) it.next());
            typeParameterDescriptorMo89626a.getClass();
            arrayList.add(typeParameterDescriptorMo89626a);
        }
        ResolvedValueParameters resolvedValueParametersM89815d0 = m89815d0(lazyJavaResolverContextM89577i, javaMethodDescriptorM89561i1, javaMethod.mo89060g());
        MethodSignatureData methodSignatureDataMo89727Y = mo89727Y(javaMethod, arrayList, m89802A(javaMethod, lazyJavaResolverContextM89577i), resolvedValueParametersM89815d0.m89824a());
        KotlinType kotlinTypeM89820c = methodSignatureDataMo89727Y.m89820c();
        javaMethodDescriptorM89561i1.mo88902h1(kotlinTypeM89820c != null ? DescriptorFactory.m91737i(javaMethodDescriptorM89561i1, kotlinTypeM89820c, Annotations.Companion.m88641b()) : null, mo89715O(), CollectionsKt.emptyList(), methodSignatureDataMo89727Y.m89822e(), methodSignatureDataMo89727Y.m89823f(), methodSignatureDataMo89727Y.m89821d(), Modality.Companion.m88541a(false, javaMethod.isAbstract(), true ^ javaMethod.isFinal()), UtilsKt.m89505d(javaMethod.getVisibility()), methodSignatureDataMo89727Y.m89820c() != null ? MapsKt.mapOf(TuplesKt.m87240a(JavaMethodDescriptor.f64799G, CollectionsKt.first((List) resolvedValueParametersM89815d0.m89824a()))) : MapsKt.emptyMap());
        javaMethodDescriptorM89561i1.m89564l1(methodSignatureDataMo89727Y.m89819b(), resolvedValueParametersM89815d0.m89825b());
        if (!methodSignatureDataMo89727Y.m89818a().isEmpty()) {
            lazyJavaResolverContextM89577i.m89617a().m89600s().mo89545b(javaMethodDescriptorM89561i1, methodSignatureDataMo89727Y.m89818a());
        }
        return javaMethodDescriptorM89561i1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        return m89808P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX INFO: renamed from: a0 */
    public final PropertyDescriptor m89814a0(JavaField javaField) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M89803E = m89803E(javaField);
        objectRef.element = M89803E;
        M89803E.m88859P0(null, null, null, null);
        ((PropertyDescriptorImpl) objectRef.element).m88864V0(m89811T(javaField), CollectionsKt.emptyList(), mo89715O(), null, CollectionsKt.emptyList());
        DeclarationDescriptor declarationDescriptorMo89719R = mo89719R();
        ClassDescriptor classDescriptor = declarationDescriptorMo89719R instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorMo89719R : null;
        if (classDescriptor != null) {
            objectRef.element = this.f64912a.m89617a().m89604w().mo91999b(classDescriptor, (PropertyDescriptorImpl) objectRef.element, this.f64912a);
        }
        T t = objectRef.element;
        if (DescriptorUtils.m91757K((VariableDescriptor) t, ((PropertyDescriptorImpl) t).getType())) {
            ((PropertyDescriptorImpl) objectRef.element).m88938F0(new u8r(this, javaField, objectRef));
        }
        this.f64912a.m89617a().m89589h().mo89537d(javaField, (PropertyDescriptor) objectRef.element);
        return (PropertyDescriptor) objectRef.element;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !mo88719a().contains(name) ? CollectionsKt.emptyList() : this.f64918g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return !mo88722d().contains(name) ? CollectionsKt.emptyList() : this.f64922k.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        return m89810S();
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final ResolvedValueParameters m89815d0(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull FunctionDescriptor functionDescriptor, @NotNull List<? extends JavaValueParameter> list) {
        Pair pairM87240a;
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
            Annotations annotationsM89612a = LazyJavaAnnotationsKt.m89612a(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes javaTypeAttributesM89858b = JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.mo89070a()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    wtq.m205579a("Vararg parameter should be an array: ", javaValueParameter);
                    return null;
                }
                KotlinType kotlinTypeM89872l = lazyJavaResolverContext.m89623g().m89872l(javaArrayType, javaTypeAttributesM89858b, true);
                pairM87240a = TuplesKt.m87240a(kotlinTypeM89872l, lazyJavaResolverContext.m89620d().mo88546f().m88234k(kotlinTypeM89872l));
            } else {
                pairM87240a = TuplesKt.m87240a(lazyJavaResolverContext.m89623g().m89874p(javaValueParameter.getType(), javaTypeAttributesM89858b), null);
            }
            KotlinType kotlinType = (KotlinType) pairM87240a.component1();
            KotlinType kotlinType2 = (KotlinType) pairM87240a.component2();
            if (Intrinsics.m87488d(functionDescriptor.getName().m91082b(), "equals") && list.size() == 1 && Intrinsics.m87488d(lazyJavaResolverContext.m89620d().mo88546f().m88214J(), kotlinType)) {
                name = Name.m91079i("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    name = Name.m91079i("p" + index);
                    name.getClass();
                }
            }
            Name name2 = name;
            name2.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, null, index, annotationsM89612a, name2, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.m89617a().m89601t().mo88964a(javaValueParameter)));
        }
        return new ResolvedValueParameters(CollectionsKt.toList(arrayList), z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return m89806M();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m89816e0(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strM90378c = MethodSignatureMappingKt.m90378c((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strM90378c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strM90378c, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> collectionM91881b = OverridingUtilsKt.m91881b(list2, e9r.INSTANCE);
                set.removeAll(list2);
                set.addAll(collectionM91881b);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        return this.f64914c.invoke();
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + mo89719R();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public abstract Set<Name> mo89747v(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<DeclarationDescriptor> m89817w(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92045c())) {
            for (Name name : mo89747v(descriptorKindFilter, function1)) {
                if (function1.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(linkedHashSet, mo89642f(name, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92046d()) && !descriptorKindFilter.m92040l().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : mo89750x(descriptorKindFilter, function1)) {
                if (function1.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(mo88720b(name2, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92051i()) && !descriptorKindFilter.m92040l().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : mo89705D(descriptorKindFilter, function1)) {
                if (function1.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(mo88721c(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract Set<Name> mo89750x(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    /* JADX INFO: renamed from: y */
    public void mo89752y(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        collection.getClass();
        name.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public abstract DeclaredMemberIndex mo89754z();

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i & 2) != 0 ? null : lazyJavaScope);
    }
}
