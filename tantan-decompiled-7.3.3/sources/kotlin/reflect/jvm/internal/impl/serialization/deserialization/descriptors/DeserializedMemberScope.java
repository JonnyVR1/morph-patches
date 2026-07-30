package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ayd;
import p153l.byd;
import p153l.lxd;
import p153l.mxd;
import p153l.nxd;
import p153l.oxd;
import p153l.pxd;
import p153l.qxd;
import p153l.rxd;
import p153l.sxd;
import p153l.txd;
import p153l.uxd;
import p153l.vxd;
import p153l.wxd;
import p153l.xxd;
import p153l.yxd;
import p153l.zxd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f66774e = {Reflection.m88403i(new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), Reflection.m88403i(new PropertyReference1Impl(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66775a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC15429a f66776b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f66777c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NullableLazyValue f66778d;

    @SourceDebugExtension
    public final class OptimizedImplementation implements InterfaceC15429a {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f66779j = {Reflection.m88403i(new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.m88403i(new PropertyReference1Impl(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Map<Name, byte[]> f66780a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Map<Name, byte[]> f66781b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Map<Name, byte[]> f66782c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f66783d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f66784e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f66785f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue f66786g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue f66787h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DeserializedMemberScope f66788i;

        public OptimizedImplementation(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) throws IOException {
            Map<Name, byte[]> mapEmptyMap;
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f66788i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Name nameM93124b = NameResolverUtilKt.m93124b(deserializedMemberScope.m93250s().m93075g(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(nameM93124b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nameM93124b, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f66780a = m93275r(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f66788i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Name nameM93124b2 = NameResolverUtilKt.m93124b(deserializedMemberScope2.m93250s().m93075g(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(nameM93124b2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(nameM93124b2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f66781b = m93275r(linkedHashMap2);
            if (this.f66788i.m93250s().m93071c().m93046g().mo93066e()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f66788i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    Name nameM93124b3 = NameResolverUtilKt.m93124b(deserializedMemberScope3.m93250s().m93075g(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(nameM93124b3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(nameM93124b3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapEmptyMap = m93275r(linkedHashMap3);
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            this.f66782c = mapEmptyMap;
            this.f66783d = this.f66788i.m93250s().m93076h().mo93341i(new xxd(this));
            this.f66784e = this.f66788i.m93250s().m93076h().mo93341i(new yxd(this));
            this.f66785f = this.f66788i.m93250s().m93076h().mo93335c(new zxd(this));
            this.f66786g = this.f66788i.m93250s().m93076h().mo93337e(new ayd(this, this.f66788i));
            this.f66787h = this.f66788i.m93250s().m93076h().mo93337e(new byd(this, this.f66788i));
        }

        /* JADX INFO: renamed from: p */
        public static final Set m93260p(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.f66780a.keySet(), (Iterable) deserializedMemberScope.mo93229w());
        }

        /* JADX INFO: renamed from: q */
        public static final Collection m93261q(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m93272m(name);
        }

        /* JADX INFO: renamed from: s */
        public static final Collection m93262s(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m93273n(name);
        }

        /* JADX INFO: renamed from: t */
        public static final TypeAliasDescriptor m93263t(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m93274o(name);
        }

        /* JADX INFO: renamed from: u */
        public static final Set m93264u(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.f66781b.keySet(), (Iterable) deserializedMemberScope.mo93230x());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo93265a() {
            return (Set) StorageKt.m93375a(this.f66786g, this, f66779j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo93266b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !mo93265a().contains(name) ? CollectionsKt.emptyList() : this.f66783d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo93267c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !mo93268d().contains(name) ? CollectionsKt.emptyList() : this.f66784e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo93268d() {
            return (Set) StorageKt.m93375a(this.f66787h, this, f66779j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        /* JADX INFO: renamed from: e */
        public void mo93269e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            collection.getClass();
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92942i())) {
                Set<Name> setMo93268d = mo93268d();
                ArrayList arrayList = new ArrayList();
                for (Name name : setMo93268d) {
                    if (function1.invoke(name).booleanValue()) {
                        arrayList.addAll(mo93267c(name, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator.getClass();
                CollectionsKt.sortWith(arrayList, nameAndTypeMemberComparator);
                collection.addAll(arrayList);
            }
            if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92937d())) {
                Set<Name> setMo93265a = mo93265a();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : setMo93265a) {
                    if (function1.invoke(name2).booleanValue()) {
                        arrayList2.addAll(mo93266b(name2, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator2.getClass();
                CollectionsKt.sortWith(arrayList2, nameAndTypeMemberComparator2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @Nullable
        /* JADX INFO: renamed from: f */
        public TypeAliasDescriptor mo93270f(@NotNull Name name) {
            name.getClass();
            return this.f66785f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: g */
        public Set<Name> mo93271g() {
            return this.f66782c.keySet();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        /* JADX INFO: renamed from: m */
        public final Collection<SimpleFunctionDescriptor> m93272m(Name name) {
            List<ProtoBuf.Function> listEmptyList;
            Map<Name, byte[]> map = this.f66780a;
            Parser<ProtoBuf.Function> parser = ProtoBuf.Function.PARSER;
            parser.getClass();
            DeserializedMemberScope deserializedMemberScope = this.f66788i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listM94193V = SequencesKt___SequencesKt.m94193V(SequencesKt__SequencesKt.m94166o(new C15428xb5e458c1(parser, new ByteArrayInputStream(bArr), this.f66788i)));
                if (listM94193V != null) {
                    listEmptyList = listM94193V;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Function function : listEmptyList) {
                MemberDeserializer memberDeserializerM93074f = deserializedMemberScope.m93250s().m93074f();
                function.getClass();
                SimpleFunctionDescriptor simpleFunctionDescriptorM93120v = memberDeserializerM93074f.m93120v(function);
                if (!deserializedMemberScope.mo93220A(simpleFunctionDescriptorM93120v)) {
                    simpleFunctionDescriptorM93120v = null;
                }
                if (simpleFunctionDescriptorM93120v != null) {
                    arrayList.add(simpleFunctionDescriptorM93120v);
                }
            }
            deserializedMemberScope.mo93225n(name, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94071c(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        /* JADX INFO: renamed from: n */
        public final Collection<PropertyDescriptor> m93273n(Name name) {
            List<ProtoBuf.Property> listEmptyList;
            Map<Name, byte[]> map = this.f66781b;
            Parser<ProtoBuf.Property> parser = ProtoBuf.Property.PARSER;
            parser.getClass();
            DeserializedMemberScope deserializedMemberScope = this.f66788i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listM94193V = SequencesKt___SequencesKt.m94193V(SequencesKt__SequencesKt.m94166o(new C15428xb5e458c1(parser, new ByteArrayInputStream(bArr), this.f66788i)));
                if (listM94193V != null) {
                    listEmptyList = listM94193V;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Property property : listEmptyList) {
                MemberDeserializer memberDeserializerM93074f = deserializedMemberScope.m93250s().m93074f();
                property.getClass();
                PropertyDescriptor propertyDescriptorM93108y = MemberDeserializer.m93108y(memberDeserializerM93074f, property, false, 2, null);
                if (propertyDescriptorM93108y != null) {
                    arrayList.add(propertyDescriptorM93108y);
                }
            }
            deserializedMemberScope.mo93226o(name, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94071c(arrayList);
        }

        /* JADX INFO: renamed from: o */
        public final TypeAliasDescriptor m93274o(Name name) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.f66782c.get(name);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f66788i.m93250s().m93071c().m93050k())) == null) {
                return null;
            }
            return this.f66788i.m93250s().m93074f().m93110D(delimitedFrom);
        }

        /* JADX INFO: renamed from: r */
        public final Map<Name, byte[]> m93275r(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$a */
    public interface InterfaceC15429a {
        @NotNull
        /* JADX INFO: renamed from: a */
        Set<Name> mo93265a();

        @NotNull
        /* JADX INFO: renamed from: b */
        Collection<SimpleFunctionDescriptor> mo93266b(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        /* JADX INFO: renamed from: c */
        Collection<PropertyDescriptor> mo93267c(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        /* JADX INFO: renamed from: d */
        Set<Name> mo93268d();

        /* JADX INFO: renamed from: e */
        void mo93269e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation);

        @Nullable
        /* JADX INFO: renamed from: f */
        TypeAliasDescriptor mo93270f(@NotNull Name name);

        @NotNull
        /* JADX INFO: renamed from: g */
        Set<Name> mo93271g();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$b */
    @SourceDebugExtension
    public final class C15430b implements InterfaceC15429a {

        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ KProperty<Object>[] f66792o = {Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.m88403i(new PropertyReference1Impl(C15430b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<ProtoBuf.Function> f66793a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final List<ProtoBuf.Property> f66794b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final List<ProtoBuf.TypeAlias> f66795c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue f66796d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final NotNullLazyValue f66797e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final NotNullLazyValue f66798f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue f66799g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue f66800h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final NotNullLazyValue f66801i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final NotNullLazyValue f66802j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final NotNullLazyValue f66803k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final NotNullLazyValue f66804l;

        /* JADX INFO: renamed from: m */
        @NotNull
        public final NotNullLazyValue f66805m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ DeserializedMemberScope f66806n;

        public C15430b(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f66806n = deserializedMemberScope;
            this.f66793a = list;
            this.f66794b = list2;
            this.f66795c = deserializedMemberScope.m93250s().m93071c().m93046g().mo93066e() ? list3 : CollectionsKt.emptyList();
            this.f66796d = deserializedMemberScope.m93250s().m93076h().mo93337e(new nxd(this));
            this.f66797e = deserializedMemberScope.m93250s().m93076h().mo93337e(new oxd(this));
            this.f66798f = deserializedMemberScope.m93250s().m93076h().mo93337e(new pxd(this));
            this.f66799g = deserializedMemberScope.m93250s().m93076h().mo93337e(new qxd(this));
            this.f66800h = deserializedMemberScope.m93250s().m93076h().mo93337e(new rxd(this));
            this.f66801i = deserializedMemberScope.m93250s().m93076h().mo93337e(new sxd(this));
            this.f66802j = deserializedMemberScope.m93250s().m93076h().mo93337e(new txd(this));
            this.f66803k = deserializedMemberScope.m93250s().m93076h().mo93337e(new uxd(this));
            this.f66804l = deserializedMemberScope.m93250s().m93076h().mo93337e(new vxd(this, deserializedMemberScope));
            this.f66805m = deserializedMemberScope.m93250s().m93076h().mo93337e(new wxd(this, deserializedMemberScope));
        }

        /* JADX INFO: renamed from: B */
        public static final List m93277B(C15430b c15430b) {
            return c15430b.m93308w();
        }

        /* JADX INFO: renamed from: C */
        public static final List m93278C(C15430b c15430b) {
            return c15430b.m93311z();
        }

        /* JADX INFO: renamed from: D */
        public static final Set m93279D(C15430b c15430b, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Function> list = c15430b.f66793a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = c15430b.f66806n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m93124b(deserializedMemberScope2.m93250s().m93075g(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.mo93229w());
        }

        /* JADX INFO: renamed from: E */
        public static final Map m93280E(C15430b c15430b) {
            List<SimpleFunctionDescriptor> listM93298F = c15430b.m93298F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM93298F) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                name.getClass();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: N */
        public static final Map m93281N(C15430b c15430b) {
            List<PropertyDescriptor> listM93299G = c15430b.m93299G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM93299G) {
                Name name = ((PropertyDescriptor) obj).getName();
                name.getClass();
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: O */
        public static final Map m93282O(C15430b c15430b) {
            List<TypeAliasDescriptor> listM93300H = c15430b.m93300H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM93300H, 10)), 16));
            for (Object obj : listM93300H) {
                Name name = ((TypeAliasDescriptor) obj).getName();
                name.getClass();
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: P */
        public static final Set m93283P(C15430b c15430b, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Property> list = c15430b.f66794b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = c15430b.f66806n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m93124b(deserializedMemberScope2.m93250s().m93075g(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.mo93230x());
        }

        /* JADX INFO: renamed from: r */
        public static final List m93294r(C15430b c15430b) {
            return CollectionsKt.plus((Collection) c15430b.m93301I(), (Iterable) c15430b.m93306u());
        }

        /* JADX INFO: renamed from: s */
        public static final List m93295s(C15430b c15430b) {
            return CollectionsKt.plus((Collection) c15430b.m93302J(), (Iterable) c15430b.m93307v());
        }

        /* JADX INFO: renamed from: t */
        public static final List m93296t(C15430b c15430b) {
            return c15430b.m93297A();
        }

        /* JADX INFO: renamed from: A */
        public final List<TypeAliasDescriptor> m93297A() {
            List<ProtoBuf.TypeAlias> list = this.f66795c;
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorM93110D = deserializedMemberScope.m93250s().m93074f().m93110D((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorM93110D != null) {
                    arrayList.add(typeAliasDescriptorM93110D);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: F */
        public final List<SimpleFunctionDescriptor> m93298F() {
            return (List) StorageKt.m93375a(this.f66799g, this, f66792o[3]);
        }

        /* JADX INFO: renamed from: G */
        public final List<PropertyDescriptor> m93299G() {
            return (List) StorageKt.m93375a(this.f66800h, this, f66792o[4]);
        }

        /* JADX INFO: renamed from: H */
        public final List<TypeAliasDescriptor> m93300H() {
            return (List) StorageKt.m93375a(this.f66798f, this, f66792o[2]);
        }

        /* JADX INFO: renamed from: I */
        public final List<SimpleFunctionDescriptor> m93301I() {
            return (List) StorageKt.m93375a(this.f66796d, this, f66792o[0]);
        }

        /* JADX INFO: renamed from: J */
        public final List<PropertyDescriptor> m93302J() {
            return (List) StorageKt.m93375a(this.f66797e, this, f66792o[1]);
        }

        /* JADX INFO: renamed from: K */
        public final Map<Name, Collection<SimpleFunctionDescriptor>> m93303K() {
            return (Map) StorageKt.m93375a(this.f66802j, this, f66792o[6]);
        }

        /* JADX INFO: renamed from: L */
        public final Map<Name, Collection<PropertyDescriptor>> m93304L() {
            return (Map) StorageKt.m93375a(this.f66803k, this, f66792o[7]);
        }

        /* JADX INFO: renamed from: M */
        public final Map<Name, TypeAliasDescriptor> m93305M() {
            return (Map) StorageKt.m93375a(this.f66801i, this, f66792o[5]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo93265a() {
            return (Set) StorageKt.m93375a(this.f66804l, this, f66792o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo93266b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!mo93265a().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<SimpleFunctionDescriptor> collection = m93303K().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo93267c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!mo93268d().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<PropertyDescriptor> collection = m93304L().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo93268d() {
            return (Set) StorageKt.m93375a(this.f66805m, this, f66792o[9]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        /* JADX INFO: renamed from: e */
        public void mo93269e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            collection.getClass();
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92942i())) {
                for (Object obj : m93299G()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    name.getClass();
                    if (function1.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92937d())) {
                for (Object obj2 : m93298F()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    name2.getClass();
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @Nullable
        /* JADX INFO: renamed from: f */
        public TypeAliasDescriptor mo93270f(@NotNull Name name) {
            name.getClass();
            return m93305M().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15429a
        @NotNull
        /* JADX INFO: renamed from: g */
        public Set<Name> mo93271g() {
            List<ProtoBuf.TypeAlias> list = this.f66795c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m93124b(deserializedMemberScope.m93250s().m93075g(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        /* JADX INFO: renamed from: u */
        public final List<SimpleFunctionDescriptor> m93306u() {
            Set<Name> setMo93229w = this.f66806n.mo93229w();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo93229w.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, m93309x((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: v */
        public final List<PropertyDescriptor> m93307v() {
            Set<Name> setMo93230x = this.f66806n.mo93230x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo93230x.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, m93310y((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: w */
        public final List<SimpleFunctionDescriptor> m93308w() {
            List<ProtoBuf.Function> list = this.f66793a;
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM93120v = deserializedMemberScope.m93250s().m93074f().m93120v((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.mo93220A(simpleFunctionDescriptorM93120v)) {
                    simpleFunctionDescriptorM93120v = null;
                }
                if (simpleFunctionDescriptorM93120v != null) {
                    arrayList.add(simpleFunctionDescriptorM93120v);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: x */
        public final List<SimpleFunctionDescriptor> m93309x(Name name) {
            List<SimpleFunctionDescriptor> listM93301I = m93301I();
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM93301I) {
                if (Intrinsics.m88377d(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo93225n(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: y */
        public final List<PropertyDescriptor> m93310y(Name name) {
            List<PropertyDescriptor> listM93302J = m93302J();
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM93302J) {
                if (Intrinsics.m88377d(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo93226o(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: z */
        public final List<PropertyDescriptor> m93311z() {
            List<ProtoBuf.Property> list = this.f66794b;
            DeserializedMemberScope deserializedMemberScope = this.f66806n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorM93108y = MemberDeserializer.m93108y(deserializedMemberScope.m93250s().m93074f(), (ProtoBuf.Property) ((MessageLite) it.next()), false, 2, null);
                if (propertyDescriptorM93108y != null) {
                    arrayList.add(propertyDescriptorM93108y);
                }
            }
            return arrayList;
        }
    }

    public DeserializedMemberScope(@NotNull DeserializationContext deserializationContext, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, @NotNull List<ProtoBuf.TypeAlias> list3, @NotNull Function0<? extends Collection<Name>> function0) {
        deserializationContext.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        function0.getClass();
        this.f66775a = deserializationContext;
        this.f66776b = m93248q(list, list2, list3);
        this.f66777c = deserializationContext.m93076h().mo93337e(new lxd(function0));
        this.f66778d = deserializationContext.m93076h().mo93339g(new mxd(this));
    }

    /* JADX INFO: renamed from: k */
    public static final Set m93245k(Function0 function0) {
        return CollectionsKt.toSet((Iterable) function0.invoke());
    }

    /* JADX INFO: renamed from: l */
    public static final Set m93246l(DeserializedMemberScope deserializedMemberScope) {
        Set<Name> setMo93228v = deserializedMemberScope.mo93228v();
        if (setMo93228v == null) {
            return null;
        }
        return SetsKt.plus(SetsKt.plus((Set) deserializedMemberScope.m93251t(), (Iterable) deserializedMemberScope.f66776b.mo93271g()), (Iterable) setMo93228v);
    }

    /* JADX INFO: renamed from: A */
    public boolean mo93220A(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo89610a() {
        return this.f66776b.mo93265a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo89611b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.f66776b.mo93266b(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo89612c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.f66776b.mo93267c(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo89613d() {
        return this.f66776b.mo93268d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo89614e() {
        return m93252u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo90533f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        if (mo93254z(name)) {
            return m93249r(name);
        }
        if (this.f66776b.mo93271g().contains(name)) {
            return m93253y(name);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo93224j(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Collection<DeclarationDescriptor> m93247m(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
        descriptorKindFilter.getClass();
        function1.getClass();
        lookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (descriptorKindFilter.m92930a(companion.m92940g())) {
            mo93224j(arrayList, function1);
        }
        this.f66776b.mo93269e(arrayList, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.m92930a(companion.m92936c())) {
            for (Name name : m93251t()) {
                if (function1.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, m93249r(name));
                }
            }
        }
        if (descriptorKindFilter.m92930a(DescriptorKindFilter.Companion.m92941h())) {
            for (Name name2 : this.f66776b.mo93271g()) {
                if (function1.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94069a(arrayList, this.f66776b.mo93270f(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94071c(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public void mo93225n(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
        name.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: o */
    public void mo93226o(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
        name.getClass();
        list.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract ClassId mo93227p(@NotNull Name name);

    /* JADX INFO: renamed from: q */
    public final InterfaceC15429a m93248q(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f66775a.m93071c().m93046g().mo93064c() ? new C15430b(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    /* JADX INFO: renamed from: r */
    public final ClassDescriptor m93249r(Name name) {
        return this.f66775a.m93071c().m93041b(mo93227p(name));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final DeserializationContext m93250s() {
        return this.f66775a;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final Set<Name> m93251t() {
        return (Set) StorageKt.m93375a(this.f66777c, this, f66774e[0]);
    }

    /* JADX INFO: renamed from: u */
    public final Set<Name> m93252u() {
        return (Set) StorageKt.m93376b(this.f66778d, this, f66774e[1]);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public abstract Set<Name> mo93228v();

    @NotNull
    /* JADX INFO: renamed from: w */
    public abstract Set<Name> mo93229w();

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract Set<Name> mo93230x();

    /* JADX INFO: renamed from: y */
    public final TypeAliasDescriptor m93253y(Name name) {
        return this.f66776b.mo93270f(name);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo93254z(@NotNull Name name) {
        name.getClass();
        return m93251t().contains(name);
    }
}
