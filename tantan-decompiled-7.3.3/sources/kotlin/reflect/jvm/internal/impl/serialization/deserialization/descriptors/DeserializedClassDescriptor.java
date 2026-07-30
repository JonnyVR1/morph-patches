package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.axd;
import p153l.bxd;
import p153l.cxd;
import p153l.dxd;
import p153l.exd;
import p153l.fxd;
import p153l.gxd;
import p153l.hxd;
import p153l.ixd;
import p153l.jxd;
import p153l.mpq;
import p153l.xwd;
import p153l.ywd;
import p153l.zwd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ProtoBuf.Class f66742e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final BinaryVersion f66743f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final SourceElement f66744g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ClassId f66745h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Modality f66746i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final DescriptorVisibility f66747j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ClassKind f66748k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final DeserializationContext f66749l;

    /* JADX INFO: renamed from: m */
    public final boolean f66750m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final MemberScopeImpl f66751n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final C15426a f66752o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ScopesHolderForClass<DeserializedClassMemberScope> f66753p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C15427b f66754q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final DeclarationDescriptor f66755r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final NullableLazyValue<ClassConstructorDescriptor> f66756s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final NotNullLazyValue<Collection<ClassConstructorDescriptor>> f66757t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final NullableLazyValue<ClassDescriptor> f66758u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final NotNullLazyValue<Collection<ClassDescriptor>> f66759v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final NullableLazyValue<ValueClassRepresentation<SimpleType>> f66760w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ProtoContainer.Class f66761x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Annotations f66762y;

    @SourceDebugExtension
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: f */
        @NotNull
        public final KotlinTypeRefiner f66763f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f66764g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue<Collection<KotlinType>> f66765h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DeserializedClassDescriptor f66766i;

        public DeserializedClassMemberScope(@NotNull DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.f66766i = deserializedClassDescriptor;
            DeserializationContext deserializationContextM93206W0 = deserializedClassDescriptor.m93206W0();
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.m93207X0().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.m93207X0().getPropertyList();
            propertyList.getClass();
            List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.m93207X0().getTypeAliasList();
            typeAliasList.getClass();
            List<Integer> nestedClassNameList = deserializedClassDescriptor.m93207X0().getNestedClassNameList();
            nestedClassNameList.getClass();
            List<Integer> list = nestedClassNameList;
            NameResolver nameResolverM93075g = deserializedClassDescriptor.m93206W0().m93075g();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.m93124b(nameResolverM93075g, ((Number) it.next()).intValue()));
            }
            super(deserializationContextM93206W0, functionList, propertyList, typeAliasList, new dxd(arrayList));
            this.f66763f = kotlinTypeRefiner;
            this.f66764g = m93250s().m93076h().mo93337e(new exd(this));
            this.f66765h = m93250s().m93076h().mo93337e(new fxd(this));
        }

        /* JADX INFO: renamed from: B */
        public static final List m93214B(List list) {
            return list;
        }

        /* JADX INFO: renamed from: F */
        public static final Collection m93218F(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.m93247m(DescriptorKindFilter.f66566n, MemberScope.Companion.m92956c(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        }

        /* JADX INFO: renamed from: J */
        public static final Collection m93219J(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.f66763f.mo93803g(deserializedClassMemberScope.m93222H());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: A */
        public boolean mo93220A(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            simpleFunctionDescriptor.getClass();
            return m93250s().m93071c().m93059t().mo89304a(this.f66766i, simpleFunctionDescriptor);
        }

        /* JADX INFO: renamed from: G */
        public final <D extends CallableMemberDescriptor> void m93221G(Name name, Collection<? extends D> collection, final List<D> list) {
            m93250s().m93071c().m93053n().mo93829b().m92732v(name, collection, new ArrayList(list), m93222H(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                /* JADX INFO: renamed from: a */
                public void mo89625a(CallableMemberDescriptor callableMemberDescriptor) {
                    callableMemberDescriptor.getClass();
                    OverridingUtil.m92702K(callableMemberDescriptor, null);
                    list.add((D) callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                /* JADX INFO: renamed from: e */
                public void mo89626e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    callableMemberDescriptor.getClass();
                    callableMemberDescriptor2.getClass();
                    if (callableMemberDescriptor2 instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) callableMemberDescriptor2).m89637N0(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, callableMemberDescriptor);
                    }
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public final DeserializedClassDescriptor m93222H() {
            return this.f66766i;
        }

        /* JADX INFO: renamed from: I */
        public void m93223I(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            UtilsKt.m89965a(m93250s().m93071c().m93055p(), lookupLocation, m93222H(), name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            m93223I(name, lookupLocation);
            return super.mo89611b(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            m93223I(name, lookupLocation);
            return super.mo89612c(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* JADX INFO: renamed from: f */
        public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            ClassDescriptor classDescriptorM93242i;
            name.getClass();
            lookupLocation.getClass();
            m93223I(name, lookupLocation);
            C15427b c15427b = m93222H().f66754q;
            return (c15427b == null || (classDescriptorM93242i = c15427b.m93242i(name)) == null) ? super.mo90533f(name, lookupLocation) : classDescriptorM93242i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* JADX INFO: renamed from: g */
        public Collection<DeclarationDescriptor> mo89615g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            descriptorKindFilter.getClass();
            function1.getClass();
            return this.f66764g.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: j */
        public void mo93224j(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
            collection.getClass();
            function1.getClass();
            C15427b c15427b = m93222H().f66754q;
            List listM93240d = c15427b != null ? c15427b.m93240d() : null;
            if (listM93240d == null) {
                listM93240d = CollectionsKt.emptyList();
            }
            collection.addAll(listM93240d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: n */
        public void mo93225n(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
            name.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f66765h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo90791n().mo89611b(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(m93250s().m93071c().m93042c().mo89307d(name, this.f66766i));
            m93221G(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: o */
        public void mo93226o(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
            name.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f66765h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo90791n().mo89612c(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            m93221G(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: p */
        public ClassId mo93227p(@NotNull Name name) {
            name.getClass();
            return this.f66766i.f66745h.m91927d(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @Nullable
        /* JADX INFO: renamed from: v */
        public Set<Name> mo93228v() {
            List<KotlinType> listMo89569c = m93222H().f66752o.mo89569c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo89569c.iterator();
            while (it.hasNext()) {
                Set<Name> setMo89614e = ((KotlinType) it.next()).mo90791n().mo89614e();
                if (setMo89614e == null) {
                    return null;
                }
                CollectionsKt.addAll(linkedHashSet, setMo89614e);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: w */
        public Set<Name> mo93229w() {
            List<KotlinType> listMo89569c = m93222H().f66752o.mo89569c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo89569c.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo90791n().mo89610a());
            }
            linkedHashSet.addAll(m93250s().m93071c().m93042c().mo89308e(this.f66766i));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: x */
        public Set<Name> mo93230x() {
            List<KotlinType> listMo89569c = m93222H().f66752o.mo89569c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo89569c.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo90791n().mo89613d());
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$a */
    @SourceDebugExtension
    public final class C15426a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f66768d;

        public C15426a() {
            super(DeserializedClassDescriptor.this.m93206W0().m93076h());
            this.f66768d = DeserializedClassDescriptor.this.m93206W0().m93076h().mo93337e(new gxd(DeserializedClassDescriptor.this));
        }

        /* JADX INFO: renamed from: M */
        public static final List m93232M(DeserializedClassDescriptor deserializedClassDescriptor) {
            return TypeParameterUtilsKt.m89500g(deserializedClassDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor mo89207e() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo89208g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f66768d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo89209s() {
            String strM91973b;
            FqName fqNameM91925a;
            List<ProtoBuf.Type> listM91803p = ProtoTypeTableUtilKt.m91803p(DeserializedClassDescriptor.this.m93207X0(), DeserializedClassDescriptor.this.m93206W0().m93078j());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM91803p, 10));
            Iterator<T> it = listM91803p.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.m93206W0().m93077i().m93165u((ProtoBuf.Type) it.next()));
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.m93206W0().m93071c().m93042c().mo89306c(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorMo89207e = ((KotlinType) it2.next()).mo92781G0().mo89207e();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo89207e instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo89207e : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterM93049j = DeserializedClassDescriptor.this.m93206W0().m93071c().m93049j();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classIdM92872n = DescriptorUtilsKt.m92872n(mockClassDescriptor2);
                    if (classIdM92872n == null || (fqNameM91925a = classIdM92872n.m91925a()) == null || (strM91973b = fqNameM91925a.m91937a()) == null) {
                        strM91973b = mockClassDescriptor2.getName().m91973b();
                        strM91973b.getClass();
                    }
                    arrayList3.add(strM91973b);
                }
                errorReporterM93049j.mo89850b(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt.toList(listPlus);
        }

        @NotNull
        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            string.getClass();
            return string;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo89210w() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$b */
    @SourceDebugExtension
    public final class C15427b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Map<Name, ProtoBuf.EnumEntry> f66770a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final MemoizedFunctionToNullable<Name, ClassDescriptor> f66771b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final NotNullLazyValue<Set<Name>> f66772c;

        public C15427b() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.m93207X0().getEnumEntryList();
            enumEntryList.getClass();
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.m93124b(DeserializedClassDescriptor.this.m93206W0().m93075g(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.f66770a = linkedHashMap;
            this.f66771b = DeserializedClassDescriptor.this.m93206W0().m93076h().mo93335c(new hxd(this, DeserializedClassDescriptor.this));
            this.f66772c = DeserializedClassDescriptor.this.m93206W0().m93076h().mo93337e(new ixd(this));
        }

        /* JADX INFO: renamed from: f */
        public static final ClassDescriptor m93237f(C15427b c15427b, DeserializedClassDescriptor deserializedClassDescriptor, Name name) {
            name.getClass();
            ProtoBuf.EnumEntry enumEntry = c15427b.f66770a.get(name);
            if (enumEntry != null) {
                return EnumEntrySyntheticClassDescriptor.m89604E0(deserializedClassDescriptor.m93206W0().m93076h(), deserializedClassDescriptor, name, c15427b.f66772c, new DeserializedAnnotations(deserializedClassDescriptor.m93206W0().m93076h(), new jxd(deserializedClassDescriptor, enumEntry)), SourceElement.f64737a);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static final List m93238g(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
            return CollectionsKt.toList(deserializedClassDescriptor.m93206W0().m93071c().m93043d().mo91038c(deserializedClassDescriptor.m93211b1(), enumEntry));
        }

        /* JADX INFO: renamed from: h */
        public static final Set m93239h(C15427b c15427b) {
            return c15427b.m93241e();
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Collection<ClassDescriptor> m93240d() {
            Set<Name> setKeySet = this.f66770a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor classDescriptorM93242i = m93242i((Name) it.next());
                if (classDescriptorM93242i != null) {
                    arrayList.add(classDescriptorM93242i);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        public final Set<Name> m93241e() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.mo89196l().mo89569c().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m92958a(it.next().mo90791n(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.m93207X0().getFunctionList();
            functionList.getClass();
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.m93124b(deserializedClassDescriptor.m93206W0().m93075g(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.m93207X0().getPropertyList();
            propertyList.getClass();
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.m93124b(deserializedClassDescriptor2.m93206W0().m93075g(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return SetsKt.plus((Set) hashSet, (Iterable) hashSet);
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final ClassDescriptor m93242i(@NotNull Name name) {
            name.getClass();
            return this.f66771b.invoke(name);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.Class r11, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(deserializationContext.m93076h(), NameResolverUtilKt.m93123a(nameResolver, r11.getFqName()).m91931h());
        deserializationContext.getClass();
        r11.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.f66742e = r11;
        this.f66743f = binaryVersion;
        this.f66744g = sourceElement;
        this.f66745h = NameResolverUtilKt.m93123a(nameResolver, r11.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.f66746i = protoEnumFlags.m93136b(Flags.f66037e.mo91766d(r11.getFlags()));
        this.f66747j = ProtoEnumFlagsUtilsKt.m93139a(protoEnumFlags, Flags.f66036d.mo91766d(r11.getFlags()));
        ClassKind classKindM93135a = protoEnumFlags.m93135a(Flags.f66038f.mo91766d(r11.getFlags()));
        this.f66748k = classKindM93135a;
        List<ProtoBuf.TypeParameter> typeParameterList = r11.getTypeParameterList();
        typeParameterList.getClass();
        ProtoBuf.TypeTable typeTable = r11.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r11.getVersionRequirementTable();
        versionRequirementTable.getClass();
        DeserializationContext deserializationContextM93070a = deserializationContext.m93070a(this, typeParameterList, nameResolver, typeTable2, companion.m91823a(versionRequirementTable), binaryVersion);
        this.f66749l = deserializationContextM93070a;
        Boolean boolMo91766d = Flags.f66045m.mo91766d(r11.getFlags());
        boolMo91766d.getClass();
        boolean zBooleanValue = boolMo91766d.booleanValue();
        this.f66750m = zBooleanValue;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        if (classKindM93135a == classKind) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextM93070a.m93076h(), this, zBooleanValue || Intrinsics.m88377d(deserializationContextM93070a.m93071c().m93048i().mo93088a(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.INSTANCE;
        }
        this.f66751n = staticScopeForKotlinEnum;
        this.f66752o = new C15426a();
        this.f66753p = ScopesHolderForClass.Companion.m89483a(this, deserializationContextM93070a.m93076h(), deserializationContextM93070a.m93071c().m93053n().mo93830c(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.f66754q = classKindM93135a == classKind ? new C15427b() : null;
        DeclarationDescriptor declarationDescriptorM93073e = deserializationContext.m93073e();
        this.f66755r = declarationDescriptorM93073e;
        this.f66756s = deserializationContextM93070a.m93076h().mo93339g(new xwd(this));
        this.f66757t = deserializationContextM93070a.m93076h().mo93337e(new ywd(this));
        this.f66758u = deserializationContextM93070a.m93076h().mo93339g(new zwd(this));
        this.f66759v = deserializationContextM93070a.m93076h().mo93337e(new axd(this));
        this.f66760w = deserializationContextM93070a.m93076h().mo93339g(new bxd(this));
        NameResolver nameResolverM93075g = deserializationContextM93070a.m93075g();
        TypeTable typeTableM93078j = deserializationContextM93070a.m93078j();
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptorM93073e instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptorM93073e : null;
        this.f66761x = new ProtoContainer.Class(r11, nameResolverM93075g, typeTableM93078j, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f66761x : null);
        this.f66762y = !Flags.f66035c.mo91766d(r11.getFlags()).booleanValue() ? Annotations.Companion.m89532b() : new NonEmptyDeserializedAnnotations(deserializationContextM93070a.m93076h(), new cxd(this));
    }

    /* JADX INFO: renamed from: N0 */
    public static final List m93194N0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return CollectionsKt.toList(deserializedClassDescriptor.f66749l.m93071c().m93043d().mo91037b(deserializedClassDescriptor.f66761x));
    }

    /* JADX INFO: renamed from: O0 */
    public static final ClassDescriptor m93195O0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m93200P0();
    }

    /* JADX INFO: renamed from: V0 */
    public static final Collection m93196V0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m93201Q0();
    }

    /* JADX INFO: renamed from: e1 */
    public static final ClassConstructorDescriptor m93197e1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m93202R0();
    }

    /* JADX INFO: renamed from: f1 */
    public static final Collection m93198f1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m93204T0();
    }

    /* JADX INFO: renamed from: g1 */
    public static final ValueClassRepresentation m93199g1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m93205U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo89181C0() {
        Boolean boolMo91766d = Flags.f66040h.mo91766d(this.f66742e.getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    /* JADX INFO: renamed from: P0 */
    public final ClassDescriptor m93200P0() {
        if (!this.f66742e.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo90533f = m93208Y0().mo90533f(NameResolverUtilKt.m93124b(this.f66749l.m93075g(), this.f66742e.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo90533f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo90533f;
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final Collection<ClassConstructorDescriptor> m93201Q0() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) m93203S0(), (Iterable) CollectionsKt.listOfNotNull(mo89204v())), (Iterable) this.f66749l.m93071c().m93042c().mo89305b(this));
    }

    /* JADX INFO: renamed from: R0 */
    public final ClassConstructorDescriptor m93202R0() {
        Object next;
        if (this.f66748k.isSingleton()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplM92631l = DescriptorFactory.m92631l(this, SourceElement.f64737a);
            classConstructorDescriptorImplM92631l.m89648Z0(mo89349o());
            return classConstructorDescriptorImplM92631l;
        }
        List<ProtoBuf.Constructor> constructorList = this.f66742e.getConstructorList();
        constructorList.getClass();
        Iterator<T> it = constructorList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (Flags.f66046n.mo91766d(((ProtoBuf.Constructor) next).getFlags()).booleanValue());
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.f66749l.m93074f().m93119u(constructor, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public final List<ClassConstructorDescriptor> m93203S0() {
        List<ProtoBuf.Constructor> constructorList = this.f66742e.getConstructorList();
        constructorList.getClass();
        ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean boolMo91766d = Flags.f66046n.mo91766d(((ProtoBuf.Constructor) obj).getFlags());
            boolMo91766d.getClass();
            if (boolMo91766d.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ProtoBuf.Constructor constructor : arrayList) {
            MemberDeserializer memberDeserializerM93074f = this.f66749l.m93074f();
            constructor.getClass();
            arrayList2.add(memberDeserializerM93074f.m93119u(constructor, false));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: T0 */
    public final Collection<ClassDescriptor> m93204T0() {
        if (this.f66746i != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.f66742e.getSealedSubclassFqNameList();
        sealedSubclassFqNameList.getClass();
        if (sealedSubclassFqNameList.isEmpty()) {
            return CliSealedClassInheritorsProvider.INSTANCE.m92601a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents deserializationComponentsM93071c = this.f66749l.m93071c();
            NameResolver nameResolverM93075g = this.f66749l.m93075g();
            num.getClass();
            ClassDescriptor classDescriptorM93041b = deserializationComponentsM93071c.m93041b(NameResolverUtilKt.m93123a(nameResolverM93075g, num.intValue()));
            if (classDescriptorM93041b != null) {
                arrayList.add(classDescriptorM93041b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U0 */
    public final ValueClassRepresentation<SimpleType> m93205U0() {
        if (!isInline() && !mo89202q()) {
            return null;
        }
        boolean zM91759c = this.f66743f.m91759c(1, 5, 1);
        ValueClassRepresentation<SimpleType> valueClassRepresentationM93169a = ValueClassUtilKt.m93169a(this.f66742e, zM91759c, this.f66749l.m93075g(), this.f66749l.m93078j(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(this.f66749l.m93077i()), new DeserializedClassDescriptor$computeValueClassRepresentation$2(this));
        if (valueClassRepresentationM93169a != null) {
            return valueClassRepresentationM93169a;
        }
        if (!zM91759c) {
            ClassConstructorDescriptor classConstructorDescriptorMo89204v = mo89204v();
            if (classConstructorDescriptorMo89204v != null) {
                List<ValueParameterDescriptor> listMo89339g = classConstructorDescriptorMo89204v.mo89339g();
                listMo89339g.getClass();
                Name name = ((ValueParameterDescriptor) CollectionsKt.first((List) listMo89339g)).getName();
                name.getClass();
                SimpleType simpleTypeM93212c1 = m93212c1(name);
                if (simpleTypeM93212c1 != null) {
                    return new InlineClassRepresentation(name, simpleTypeM93212c1);
                }
                mpq.m159379a("Value class has no underlying property: ", this);
                return null;
            }
            mpq.m159379a("Inline class has no primary constructor: ", this);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final DeserializationContext m93206W0() {
        return this.f66749l;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final ProtoBuf.Class m93207X0() {
        return this.f66742e;
    }

    /* JADX INFO: renamed from: Y0 */
    public final DeserializedClassMemberScope m93208Y0() {
        return (DeserializedClassMemberScope) this.f66753p.m89481c(this.f66749l.m93071c().m93053n().mo93830c());
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final BinaryVersion m93209Z0() {
        return this.f66743f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public MemberScopeImpl mo89199o0() {
        return this.f66751n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        return this.f66755r;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final ProtoContainer.Class m93211b1() {
        return this.f66761x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo89191c0() {
        return this.f66760w.invoke();
    }

    /* JADX INFO: renamed from: c1 */
    public final SimpleType m93212c1(Name name) {
        Iterator<T> it = m93208Y0().mo89612c(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((PropertyDescriptor) next).mo89337b0() == null) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m93213d1(@NotNull Name name) {
        name.getClass();
        return m93208Y0().m93251t().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo89348f0() {
        List<ProtoBuf.Type> listM91789b = ProtoTypeTableUtilKt.m91789b(this.f66742e, this.f66749l.m93078j());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM91789b, 10));
        Iterator<T> it = listM91789b.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(mo89347R(), new ContextClassReceiver(this, this.f66749l.m93077i().m93165u((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.m89532b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66762y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return this.f66757t.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.f66748k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f66744g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f66747j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo89193h0() {
        return Flags.f66038f.mo91766d(this.f66742e.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
        return this.f66746i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolMo91766d = Flags.f66041i.mo91766d(this.f66742e.getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.f66043k.mo91766d(this.f66742e.getFlags()).booleanValue() && this.f66743f.m91761e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo89195j0() {
        Boolean boolMo91766d = Flags.f66044l.mo91766d(this.f66742e.getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        return this.f66752o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.f66753p.m89481c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        Boolean boolMo91766d = Flags.f66042j.mo91766d(this.f66742e.getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo89200p() {
        return this.f66749l.m93077i().m93160m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo89201p0() {
        return this.f66758u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo89202q() {
        return Flags.f66043k.mo91766d(this.f66742e.getFlags()).booleanValue() && this.f66743f.m91759c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo89203t() {
        Boolean boolMo91766d = Flags.f66039g.mo91766d(this.f66742e.getFlags());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo89198n0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo89204v() {
        return this.f66756s.invoke();
    }
}
