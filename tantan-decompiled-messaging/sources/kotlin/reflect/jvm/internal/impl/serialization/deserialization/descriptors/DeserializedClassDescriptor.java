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
import kotlin.ranges.C15167a;
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
import p149l.jvd;
import p149l.kvd;
import p149l.lvd;
import p149l.mvd;
import p149l.nnq;
import p149l.nvd;
import p149l.ovd;
import p149l.pvd;
import p149l.qvd;
import p149l.rvd;
import p149l.svd;
import p149l.tvd;
import p149l.uvd;
import p149l.vvd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ProtoBuf.Class f66068e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final BinaryVersion f66069f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final SourceElement f66070g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ClassId f66071h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Modality f66072i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final DescriptorVisibility f66073j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ClassKind f66074k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final DeserializationContext f66075l;

    /* JADX INFO: renamed from: m */
    public final boolean f66076m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final MemberScopeImpl f66077n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final C15319a f66078o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final ScopesHolderForClass<DeserializedClassMemberScope> f66079p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C15320b f66080q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final DeclarationDescriptor f66081r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final NullableLazyValue<ClassConstructorDescriptor> f66082s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final NotNullLazyValue<Collection<ClassConstructorDescriptor>> f66083t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final NullableLazyValue<ClassDescriptor> f66084u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final NotNullLazyValue<Collection<ClassDescriptor>> f66085v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final NullableLazyValue<ValueClassRepresentation<SimpleType>> f66086w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ProtoContainer.Class f66087x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Annotations f66088y;

    @SourceDebugExtension
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: f */
        @NotNull
        public final KotlinTypeRefiner f66089f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f66090g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue<Collection<KotlinType>> f66091h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DeserializedClassDescriptor f66092i;

        public DeserializedClassMemberScope(@NotNull DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.f66092i = deserializedClassDescriptor;
            DeserializationContext deserializationContextM92315W0 = deserializedClassDescriptor.m92315W0();
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.m92316X0().getFunctionList();
            functionList.getClass();
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.m92316X0().getPropertyList();
            propertyList.getClass();
            List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.m92316X0().getTypeAliasList();
            typeAliasList.getClass();
            List<Integer> nestedClassNameList = deserializedClassDescriptor.m92316X0().getNestedClassNameList();
            nestedClassNameList.getClass();
            List<Integer> list = nestedClassNameList;
            NameResolver nameResolverM92184g = deserializedClassDescriptor.m92315W0().m92184g();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.m92233b(nameResolverM92184g, ((Number) it.next()).intValue()));
            }
            super(deserializationContextM92315W0, functionList, propertyList, typeAliasList, new pvd(arrayList));
            this.f66089f = kotlinTypeRefiner;
            this.f66090g = m92359s().m92185h().mo92446e(new qvd(this));
            this.f66091h = m92359s().m92185h().mo92446e(new rvd(this));
        }

        /* JADX INFO: renamed from: B */
        public static final List m92323B(List list) {
            return list;
        }

        /* JADX INFO: renamed from: F */
        public static final Collection m92327F(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.m92356m(DescriptorKindFilter.f65892n, MemberScope.Companion.m92065c(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        }

        /* JADX INFO: renamed from: J */
        public static final Collection m92328J(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.f66089f.mo92912g(deserializedClassMemberScope.m92331H());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: A */
        public boolean mo92329A(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            simpleFunctionDescriptor.getClass();
            return m92359s().m92180c().m92168t().mo88413a(this.f66092i, simpleFunctionDescriptor);
        }

        /* JADX INFO: renamed from: G */
        public final <D extends CallableMemberDescriptor> void m92330G(Name name, Collection<? extends D> collection, final List<D> list) {
            m92359s().m92180c().m92162n().mo92938b().m91841v(name, collection, new ArrayList(list), m92331H(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                /* JADX INFO: renamed from: a */
                public void mo88734a(CallableMemberDescriptor callableMemberDescriptor) {
                    callableMemberDescriptor.getClass();
                    OverridingUtil.m91811K(callableMemberDescriptor, null);
                    list.add((D) callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                /* JADX INFO: renamed from: e */
                public void mo88735e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    callableMemberDescriptor.getClass();
                    callableMemberDescriptor2.getClass();
                    if (callableMemberDescriptor2 instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) callableMemberDescriptor2).m88746N0(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, callableMemberDescriptor);
                    }
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public final DeserializedClassDescriptor m92331H() {
            return this.f66092i;
        }

        /* JADX INFO: renamed from: I */
        public void m92332I(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            UtilsKt.m89074a(m92359s().m92180c().m92164p(), lookupLocation, m92331H(), name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            m92332I(name, lookupLocation);
            return super.mo88720b(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            m92332I(name, lookupLocation);
            return super.mo88721c(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* JADX INFO: renamed from: f */
        public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            ClassDescriptor classDescriptorM92351i;
            name.getClass();
            lookupLocation.getClass();
            m92332I(name, lookupLocation);
            C15320b c15320b = m92331H().f66080q;
            return (c15320b == null || (classDescriptorM92351i = c15320b.m92351i(name)) == null) ? super.mo89642f(name, lookupLocation) : classDescriptorM92351i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        /* JADX INFO: renamed from: g */
        public Collection<DeclarationDescriptor> mo88724g(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            descriptorKindFilter.getClass();
            function1.getClass();
            return this.f66090g.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: j */
        public void mo92333j(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
            collection.getClass();
            function1.getClass();
            C15320b c15320b = m92331H().f66080q;
            List listM92349d = c15320b != null ? c15320b.m92349d() : null;
            if (listM92349d == null) {
                listM92349d = CollectionsKt.emptyList();
            }
            collection.addAll(listM92349d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: n */
        public void mo92334n(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
            name.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f66091h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo89900n().mo88720b(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(m92359s().m92180c().m92151c().mo88416d(name, this.f66092i));
            m92330G(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        /* JADX INFO: renamed from: o */
        public void mo92335o(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
            name.getClass();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f66091h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().mo89900n().mo88721c(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            m92330G(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: p */
        public ClassId mo92336p(@NotNull Name name) {
            name.getClass();
            return this.f66092i.f66071h.m91036d(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @Nullable
        /* JADX INFO: renamed from: v */
        public Set<Name> mo92337v() {
            List<KotlinType> listMo88678c = m92331H().f66078o.mo88678c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo88678c.iterator();
            while (it.hasNext()) {
                Set<Name> setMo88723e = ((KotlinType) it.next()).mo89900n().mo88723e();
                if (setMo88723e == null) {
                    return null;
                }
                CollectionsKt.addAll(linkedHashSet, setMo88723e);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: w */
        public Set<Name> mo92338w() {
            List<KotlinType> listMo88678c = m92331H().f66078o.mo88678c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo88678c.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo89900n().mo88719a());
            }
            linkedHashSet.addAll(m92359s().m92180c().m92151c().mo88417e(this.f66092i));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        /* JADX INFO: renamed from: x */
        public Set<Name> mo92339x() {
            List<KotlinType> listMo88678c = m92331H().f66078o.mo88678c();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listMo88678c.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).mo89900n().mo88722d());
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$a */
    @SourceDebugExtension
    public final class C15319a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f66094d;

        public C15319a() {
            super(DeserializedClassDescriptor.this.m92315W0().m92185h());
            this.f66094d = DeserializedClassDescriptor.this.m92315W0().m92185h().mo92446e(new svd(DeserializedClassDescriptor.this));
        }

        /* JADX INFO: renamed from: M */
        public static final List m92341M(DeserializedClassDescriptor deserializedClassDescriptor) {
            return TypeParameterUtilsKt.m88609g(deserializedClassDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor mo88316e() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo88317g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f66094d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo88318s() {
            String strM91082b;
            FqName fqNameM91034a;
            List<ProtoBuf.Type> listM90912p = ProtoTypeTableUtilKt.m90912p(DeserializedClassDescriptor.this.m92316X0(), DeserializedClassDescriptor.this.m92315W0().m92187j());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90912p, 10));
            Iterator<T> it = listM90912p.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.m92315W0().m92186i().m92274u((ProtoBuf.Type) it.next()));
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.m92315W0().m92180c().m92151c().mo88415c(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorMo88316e = ((KotlinType) it2.next()).mo91890G0().mo88316e();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo88316e instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo88316e : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterM92158j = DeserializedClassDescriptor.this.m92315W0().m92180c().m92158j();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classIdM91981n = DescriptorUtilsKt.m91981n(mockClassDescriptor2);
                    if (classIdM91981n == null || (fqNameM91034a = classIdM91981n.m91034a()) == null || (strM91082b = fqNameM91034a.m91046a()) == null) {
                        strM91082b = mockClassDescriptor2.getName().m91082b();
                        strM91082b.getClass();
                    }
                    arrayList3.add(strM91082b);
                }
                errorReporterM92158j.mo88959b(deserializedClassDescriptor2, arrayList3);
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
        public SupertypeLoopChecker mo88319w() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$b */
    @SourceDebugExtension
    public final class C15320b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Map<Name, ProtoBuf.EnumEntry> f66096a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final MemoizedFunctionToNullable<Name, ClassDescriptor> f66097b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final NotNullLazyValue<Set<Name>> f66098c;

        public C15320b() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.m92316X0().getEnumEntryList();
            enumEntryList.getClass();
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.m92233b(DeserializedClassDescriptor.this.m92315W0().m92184g(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.f66096a = linkedHashMap;
            this.f66097b = DeserializedClassDescriptor.this.m92315W0().m92185h().mo92444c(new tvd(this, DeserializedClassDescriptor.this));
            this.f66098c = DeserializedClassDescriptor.this.m92315W0().m92185h().mo92446e(new uvd(this));
        }

        /* JADX INFO: renamed from: f */
        public static final ClassDescriptor m92346f(C15320b c15320b, DeserializedClassDescriptor deserializedClassDescriptor, Name name) {
            name.getClass();
            ProtoBuf.EnumEntry enumEntry = c15320b.f66096a.get(name);
            if (enumEntry != null) {
                return EnumEntrySyntheticClassDescriptor.m88713E0(deserializedClassDescriptor.m92315W0().m92185h(), deserializedClassDescriptor, name, c15320b.f66098c, new DeserializedAnnotations(deserializedClassDescriptor.m92315W0().m92185h(), new vvd(deserializedClassDescriptor, enumEntry)), SourceElement.f64063a);
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static final List m92347g(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
            return CollectionsKt.toList(deserializedClassDescriptor.m92315W0().m92180c().m92152d().mo90147c(deserializedClassDescriptor.m92320b1(), enumEntry));
        }

        /* JADX INFO: renamed from: h */
        public static final Set m92348h(C15320b c15320b) {
            return c15320b.m92350e();
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Collection<ClassDescriptor> m92349d() {
            Set<Name> setKeySet = this.f66096a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor classDescriptorM92351i = m92351i((Name) it.next());
                if (classDescriptorM92351i != null) {
                    arrayList.add(classDescriptorM92351i);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        public final Set<Name> m92350e() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.mo88305l().mo88678c().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m92067a(it.next().mo89900n(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.m92316X0().getFunctionList();
            functionList.getClass();
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.m92233b(deserializedClassDescriptor.m92315W0().m92184g(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.m92316X0().getPropertyList();
            propertyList.getClass();
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.m92233b(deserializedClassDescriptor2.m92315W0().m92184g(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return SetsKt.plus((Set) hashSet, (Iterable) hashSet);
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final ClassDescriptor m92351i(@NotNull Name name) {
            name.getClass();
            return this.f66097b.invoke(name);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.Class r11, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(deserializationContext.m92185h(), NameResolverUtilKt.m92232a(nameResolver, r11.getFqName()).m91040h());
        deserializationContext.getClass();
        r11.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.f66068e = r11;
        this.f66069f = binaryVersion;
        this.f66070g = sourceElement;
        this.f66071h = NameResolverUtilKt.m92232a(nameResolver, r11.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.f66072i = protoEnumFlags.m92245b(Flags.f65363e.mo90875d(r11.getFlags()));
        this.f66073j = ProtoEnumFlagsUtilsKt.m92248a(protoEnumFlags, Flags.f65362d.mo90875d(r11.getFlags()));
        ClassKind classKindM92244a = protoEnumFlags.m92244a(Flags.f65364f.mo90875d(r11.getFlags()));
        this.f66074k = classKindM92244a;
        List<ProtoBuf.TypeParameter> typeParameterList = r11.getTypeParameterList();
        typeParameterList.getClass();
        ProtoBuf.TypeTable typeTable = r11.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r11.getVersionRequirementTable();
        versionRequirementTable.getClass();
        DeserializationContext deserializationContextM92179a = deserializationContext.m92179a(this, typeParameterList, nameResolver, typeTable2, companion.m90932a(versionRequirementTable), binaryVersion);
        this.f66075l = deserializationContextM92179a;
        Boolean boolMo90875d = Flags.f65371m.mo90875d(r11.getFlags());
        boolMo90875d.getClass();
        boolean zBooleanValue = boolMo90875d.booleanValue();
        this.f66076m = zBooleanValue;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        if (classKindM92244a == classKind) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextM92179a.m92185h(), this, zBooleanValue || Intrinsics.m87488d(deserializationContextM92179a.m92180c().m92157i().mo92197a(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.INSTANCE;
        }
        this.f66077n = staticScopeForKotlinEnum;
        this.f66078o = new C15319a();
        this.f66079p = ScopesHolderForClass.Companion.m88592a(this, deserializationContextM92179a.m92185h(), deserializationContextM92179a.m92180c().m92162n().mo92939c(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.f66080q = classKindM92244a == classKind ? new C15320b() : null;
        DeclarationDescriptor declarationDescriptorM92182e = deserializationContext.m92182e();
        this.f66081r = declarationDescriptorM92182e;
        this.f66082s = deserializationContextM92179a.m92185h().mo92448g(new jvd(this));
        this.f66083t = deserializationContextM92179a.m92185h().mo92446e(new kvd(this));
        this.f66084u = deserializationContextM92179a.m92185h().mo92448g(new lvd(this));
        this.f66085v = deserializationContextM92179a.m92185h().mo92446e(new mvd(this));
        this.f66086w = deserializationContextM92179a.m92185h().mo92448g(new nvd(this));
        NameResolver nameResolverM92184g = deserializationContextM92179a.m92184g();
        TypeTable typeTableM92187j = deserializationContextM92179a.m92187j();
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptorM92182e instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptorM92182e : null;
        this.f66087x = new ProtoContainer.Class(r11, nameResolverM92184g, typeTableM92187j, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f66087x : null);
        this.f66088y = !Flags.f65361c.mo90875d(r11.getFlags()).booleanValue() ? Annotations.Companion.m88641b() : new NonEmptyDeserializedAnnotations(deserializationContextM92179a.m92185h(), new ovd(this));
    }

    /* JADX INFO: renamed from: N0 */
    public static final List m92303N0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return CollectionsKt.toList(deserializedClassDescriptor.f66075l.m92180c().m92152d().mo90146b(deserializedClassDescriptor.f66087x));
    }

    /* JADX INFO: renamed from: O0 */
    public static final ClassDescriptor m92304O0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m92309P0();
    }

    /* JADX INFO: renamed from: V0 */
    public static final Collection m92305V0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m92310Q0();
    }

    /* JADX INFO: renamed from: e1 */
    public static final ClassConstructorDescriptor m92306e1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m92311R0();
    }

    /* JADX INFO: renamed from: f1 */
    public static final Collection m92307f1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m92313T0();
    }

    /* JADX INFO: renamed from: g1 */
    public static final ValueClassRepresentation m92308g1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.m92314U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        Boolean boolMo90875d = Flags.f65366h.mo90875d(this.f66068e.getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    /* JADX INFO: renamed from: P0 */
    public final ClassDescriptor m92309P0() {
        if (!this.f66068e.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89642f = m92317Y0().mo89642f(NameResolverUtilKt.m92233b(this.f66075l.m92184g(), this.f66068e.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo89642f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89642f;
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final Collection<ClassConstructorDescriptor> m92310Q0() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) m92312S0(), (Iterable) CollectionsKt.listOfNotNull(mo88313v())), (Iterable) this.f66075l.m92180c().m92151c().mo88414b(this));
    }

    /* JADX INFO: renamed from: R0 */
    public final ClassConstructorDescriptor m92311R0() {
        Object next;
        if (this.f66074k.isSingleton()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplM91740l = DescriptorFactory.m91740l(this, SourceElement.f64063a);
            classConstructorDescriptorImplM91740l.m88757Z0(mo88458o());
            return classConstructorDescriptorImplM91740l;
        }
        List<ProtoBuf.Constructor> constructorList = this.f66068e.getConstructorList();
        constructorList.getClass();
        Iterator<T> it = constructorList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (Flags.f65372n.mo90875d(((ProtoBuf.Constructor) next).getFlags()).booleanValue());
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.f66075l.m92183f().m92228u(constructor, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public final List<ClassConstructorDescriptor> m92312S0() {
        List<ProtoBuf.Constructor> constructorList = this.f66068e.getConstructorList();
        constructorList.getClass();
        ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean boolMo90875d = Flags.f65372n.mo90875d(((ProtoBuf.Constructor) obj).getFlags());
            boolMo90875d.getClass();
            if (boolMo90875d.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ProtoBuf.Constructor constructor : arrayList) {
            MemberDeserializer memberDeserializerM92183f = this.f66075l.m92183f();
            constructor.getClass();
            arrayList2.add(memberDeserializerM92183f.m92228u(constructor, false));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: T0 */
    public final Collection<ClassDescriptor> m92313T0() {
        if (this.f66072i != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.f66068e.getSealedSubclassFqNameList();
        sealedSubclassFqNameList.getClass();
        if (sealedSubclassFqNameList.isEmpty()) {
            return CliSealedClassInheritorsProvider.INSTANCE.m91710a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents deserializationComponentsM92180c = this.f66075l.m92180c();
            NameResolver nameResolverM92184g = this.f66075l.m92184g();
            num.getClass();
            ClassDescriptor classDescriptorM92150b = deserializationComponentsM92180c.m92150b(NameResolverUtilKt.m92232a(nameResolverM92184g, num.intValue()));
            if (classDescriptorM92150b != null) {
                arrayList.add(classDescriptorM92150b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U0 */
    public final ValueClassRepresentation<SimpleType> m92314U0() {
        if (!isInline() && !mo88311q()) {
            return null;
        }
        boolean zM90868c = this.f66069f.m90868c(1, 5, 1);
        ValueClassRepresentation<SimpleType> valueClassRepresentationM92278a = ValueClassUtilKt.m92278a(this.f66068e, zM90868c, this.f66075l.m92184g(), this.f66075l.m92187j(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(this.f66075l.m92186i()), new DeserializedClassDescriptor$computeValueClassRepresentation$2(this));
        if (valueClassRepresentationM92278a != null) {
            return valueClassRepresentationM92278a;
        }
        if (!zM90868c) {
            ClassConstructorDescriptor classConstructorDescriptorMo88313v = mo88313v();
            if (classConstructorDescriptorMo88313v != null) {
                List<ValueParameterDescriptor> listMo88448g = classConstructorDescriptorMo88313v.mo88448g();
                listMo88448g.getClass();
                Name name = ((ValueParameterDescriptor) CollectionsKt.first((List) listMo88448g)).getName();
                name.getClass();
                SimpleType simpleTypeM92321c1 = m92321c1(name);
                if (simpleTypeM92321c1 != null) {
                    return new InlineClassRepresentation(name, simpleTypeM92321c1);
                }
                nnq.m160357a("Value class has no underlying property: ", this);
                return null;
            }
            nnq.m160357a("Inline class has no primary constructor: ", this);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final DeserializationContext m92315W0() {
        return this.f66075l;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final ProtoBuf.Class m92316X0() {
        return this.f66068e;
    }

    /* JADX INFO: renamed from: Y0 */
    public final DeserializedClassMemberScope m92317Y0() {
        return (DeserializedClassMemberScope) this.f66079p.m88590c(this.f66075l.m92180c().m92162n().mo92939c());
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final BinaryVersion m92318Z0() {
        return this.f66069f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public MemberScopeImpl mo88308o0() {
        return this.f66077n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo88299b() {
        return this.f66081r;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final ProtoContainer.Class m92320b1() {
        return this.f66087x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo88300c0() {
        return this.f66086w.invoke();
    }

    /* JADX INFO: renamed from: c1 */
    public final SimpleType m92321c1(Name name) {
        Iterator<T> it = m92317Y0().mo88721c(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
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
            if (((PropertyDescriptor) next).mo88446b0() == null) {
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
    public final boolean m92322d1(@NotNull Name name) {
        name.getClass();
        return m92317Y0().m92360t().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public List<ReceiverParameterDescriptor> mo88457f0() {
        List<ProtoBuf.Type> listM90898b = ProtoTypeTableUtilKt.m90898b(this.f66068e, this.f66075l.m92187j());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90898b, 10));
        Iterator<T> it = listM90898b.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(mo88456R(), new ContextClassReceiver(this, this.f66075l.m92186i().m92274u((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.m88641b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f66088y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return this.f66083t.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.f66074k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f66070g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f66073j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo88302h0() {
        return Flags.f65364f.mo90875d(this.f66068e.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        return this.f66072i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolMo90875d = Flags.f65367i.mo90875d(this.f66068e.getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.f65369k.mo90875d(this.f66068e.getFlags()).booleanValue() && this.f66069f.m90870e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo88304j0() {
        Boolean boolMo90875d = Flags.f65370l.mo90875d(this.f66068e.getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        return this.f66078o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public MemberScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.f66079p.m88590c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        Boolean boolMo90875d = Flags.f65368j.mo90875d(this.f66068e.getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        return this.f66075l.m92186i().m92269m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: p0 */
    public ClassDescriptor mo88310p0() {
        return this.f66084u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo88311q() {
        return Flags.f65369k.mo90875d(this.f66068e.getFlags()).booleanValue() && this.f66069f.m90868c(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        Boolean boolMo90875d = Flags.f65365g.mo90875d(this.f66068e.getFlags());
        boolMo90875d.getClass();
        return boolMo90875d.booleanValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(mo88307n0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: v */
    public ClassConstructorDescriptor mo88313v() {
        return this.f66082s.invoke();
    }
}
