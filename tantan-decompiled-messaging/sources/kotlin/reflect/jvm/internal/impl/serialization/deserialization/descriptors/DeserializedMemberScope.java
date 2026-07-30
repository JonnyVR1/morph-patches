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
import kotlin.ranges.C15167a;
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
import p149l.awd;
import p149l.bwd;
import p149l.cwd;
import p149l.dwd;
import p149l.ewd;
import p149l.fwd;
import p149l.gwd;
import p149l.hwd;
import p149l.iwd;
import p149l.jwd;
import p149l.kwd;
import p149l.lwd;
import p149l.mwd;
import p149l.nwd;
import p149l.xvd;
import p149l.yvd;
import p149l.zvd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f66100e = {Reflection.m87514i(new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), Reflection.m87514i(new PropertyReference1Impl(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66101a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC15322a f66102b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NotNullLazyValue f66103c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NullableLazyValue f66104d;

    @SourceDebugExtension
    public final class OptimizedImplementation implements InterfaceC15322a {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ KProperty<Object>[] f66105j = {Reflection.m87514i(new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.m87514i(new PropertyReference1Impl(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        @NotNull
        public final Map<Name, byte[]> f66106a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Map<Name, byte[]> f66107b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Map<Name, byte[]> f66108c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f66109d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f66110e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f66111f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue f66112g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue f66113h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DeserializedMemberScope f66114i;

        public OptimizedImplementation(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) throws IOException {
            Map<Name, byte[]> mapEmptyMap;
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f66114i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Name nameM92233b = NameResolverUtilKt.m92233b(deserializedMemberScope.m92359s().m92184g(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(nameM92233b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nameM92233b, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f66106a = m92384r(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f66114i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Name nameM92233b2 = NameResolverUtilKt.m92233b(deserializedMemberScope2.m92359s().m92184g(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(nameM92233b2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(nameM92233b2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f66107b = m92384r(linkedHashMap2);
            if (this.f66114i.m92359s().m92180c().m92155g().mo92175e()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f66114i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    Name nameM92233b3 = NameResolverUtilKt.m92233b(deserializedMemberScope3.m92359s().m92184g(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(nameM92233b3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(nameM92233b3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapEmptyMap = m92384r(linkedHashMap3);
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            this.f66108c = mapEmptyMap;
            this.f66109d = this.f66114i.m92359s().m92185h().mo92450i(new jwd(this));
            this.f66110e = this.f66114i.m92359s().m92185h().mo92450i(new kwd(this));
            this.f66111f = this.f66114i.m92359s().m92185h().mo92444c(new lwd(this));
            this.f66112g = this.f66114i.m92359s().m92185h().mo92446e(new mwd(this, this.f66114i));
            this.f66113h = this.f66114i.m92359s().m92185h().mo92446e(new nwd(this, this.f66114i));
        }

        /* JADX INFO: renamed from: p */
        public static final Set m92369p(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.f66106a.keySet(), (Iterable) deserializedMemberScope.mo92338w());
        }

        /* JADX INFO: renamed from: q */
        public static final Collection m92370q(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m92381m(name);
        }

        /* JADX INFO: renamed from: s */
        public static final Collection m92371s(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m92382n(name);
        }

        /* JADX INFO: renamed from: t */
        public static final TypeAliasDescriptor m92372t(OptimizedImplementation optimizedImplementation, Name name) {
            name.getClass();
            return optimizedImplementation.m92383o(name);
        }

        /* JADX INFO: renamed from: u */
        public static final Set m92373u(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.f66107b.keySet(), (Iterable) deserializedMemberScope.mo92339x());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo92374a() {
            return (Set) StorageKt.m92484a(this.f66112g, this, f66105j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo92375b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !mo92374a().contains(name) ? CollectionsKt.emptyList() : this.f66109d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo92376c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            return !mo92377d().contains(name) ? CollectionsKt.emptyList() : this.f66110e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo92377d() {
            return (Set) StorageKt.m92484a(this.f66113h, this, f66105j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        /* JADX INFO: renamed from: e */
        public void mo92378e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            collection.getClass();
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92051i())) {
                Set<Name> setMo92377d = mo92377d();
                ArrayList arrayList = new ArrayList();
                for (Name name : setMo92377d) {
                    if (function1.invoke(name).booleanValue()) {
                        arrayList.addAll(mo92376c(name, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator.getClass();
                CollectionsKt.sortWith(arrayList, nameAndTypeMemberComparator);
                collection.addAll(arrayList);
            }
            if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92046d())) {
                Set<Name> setMo92374a = mo92374a();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : setMo92374a) {
                    if (function1.invoke(name2).booleanValue()) {
                        arrayList2.addAll(mo92375b(name2, lookupLocation));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                nameAndTypeMemberComparator2.getClass();
                CollectionsKt.sortWith(arrayList2, nameAndTypeMemberComparator2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @Nullable
        /* JADX INFO: renamed from: f */
        public TypeAliasDescriptor mo92379f(@NotNull Name name) {
            name.getClass();
            return this.f66111f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: g */
        public Set<Name> mo92380g() {
            return this.f66108c.keySet();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        /* JADX INFO: renamed from: m */
        public final Collection<SimpleFunctionDescriptor> m92381m(Name name) {
            List<ProtoBuf.Function> listEmptyList;
            Map<Name, byte[]> map = this.f66106a;
            Parser<ProtoBuf.Function> parser = ProtoBuf.Function.PARSER;
            parser.getClass();
            DeserializedMemberScope deserializedMemberScope = this.f66114i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listM93302V = SequencesKt___SequencesKt.m93302V(SequencesKt__SequencesKt.m93275o(new C15321xb5e458c1(parser, new ByteArrayInputStream(bArr), this.f66114i)));
                if (listM93302V != null) {
                    listEmptyList = listM93302V;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Function function : listEmptyList) {
                MemberDeserializer memberDeserializerM92183f = deserializedMemberScope.m92359s().m92183f();
                function.getClass();
                SimpleFunctionDescriptor simpleFunctionDescriptorM92229v = memberDeserializerM92183f.m92229v(function);
                if (!deserializedMemberScope.mo92329A(simpleFunctionDescriptorM92229v)) {
                    simpleFunctionDescriptorM92229v = null;
                }
                if (simpleFunctionDescriptorM92229v != null) {
                    arrayList.add(simpleFunctionDescriptorM92229v);
                }
            }
            deserializedMemberScope.mo92334n(name, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        /* JADX INFO: renamed from: n */
        public final Collection<PropertyDescriptor> m92382n(Name name) {
            List<ProtoBuf.Property> listEmptyList;
            Map<Name, byte[]> map = this.f66107b;
            Parser<ProtoBuf.Property> parser = ProtoBuf.Property.PARSER;
            parser.getClass();
            DeserializedMemberScope deserializedMemberScope = this.f66114i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listM93302V = SequencesKt___SequencesKt.m93302V(SequencesKt__SequencesKt.m93275o(new C15321xb5e458c1(parser, new ByteArrayInputStream(bArr), this.f66114i)));
                if (listM93302V != null) {
                    listEmptyList = listM93302V;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Property property : listEmptyList) {
                MemberDeserializer memberDeserializerM92183f = deserializedMemberScope.m92359s().m92183f();
                property.getClass();
                PropertyDescriptor propertyDescriptorM92217y = MemberDeserializer.m92217y(memberDeserializerM92183f, property, false, 2, null);
                if (propertyDescriptorM92217y != null) {
                    arrayList.add(propertyDescriptorM92217y);
                }
            }
            deserializedMemberScope.mo92335o(name, arrayList);
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
        }

        /* JADX INFO: renamed from: o */
        public final TypeAliasDescriptor m92383o(Name name) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.f66108c.get(name);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f66114i.m92359s().m92180c().m92159k())) == null) {
                return null;
            }
            return this.f66114i.m92359s().m92183f().m92219D(delimitedFrom);
        }

        /* JADX INFO: renamed from: r */
        public final Map<Name, byte[]> m92384r(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
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
    public interface InterfaceC15322a {
        @NotNull
        /* JADX INFO: renamed from: a */
        Set<Name> mo92374a();

        @NotNull
        /* JADX INFO: renamed from: b */
        Collection<SimpleFunctionDescriptor> mo92375b(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        /* JADX INFO: renamed from: c */
        Collection<PropertyDescriptor> mo92376c(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        /* JADX INFO: renamed from: d */
        Set<Name> mo92377d();

        /* JADX INFO: renamed from: e */
        void mo92378e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation);

        @Nullable
        /* JADX INFO: renamed from: f */
        TypeAliasDescriptor mo92379f(@NotNull Name name);

        @NotNull
        /* JADX INFO: renamed from: g */
        Set<Name> mo92380g();
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$b */
    @SourceDebugExtension
    public final class C15323b implements InterfaceC15322a {

        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ KProperty<Object>[] f66118o = {Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.m87514i(new PropertyReference1Impl(C15323b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<ProtoBuf.Function> f66119a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final List<ProtoBuf.Property> f66120b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final List<ProtoBuf.TypeAlias> f66121c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final NotNullLazyValue f66122d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final NotNullLazyValue f66123e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final NotNullLazyValue f66124f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public final NotNullLazyValue f66125g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final NotNullLazyValue f66126h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final NotNullLazyValue f66127i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final NotNullLazyValue f66128j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final NotNullLazyValue f66129k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public final NotNullLazyValue f66130l;

        /* JADX INFO: renamed from: m */
        @NotNull
        public final NotNullLazyValue f66131m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ DeserializedMemberScope f66132n;

        public C15323b(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> list, @NotNull List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f66132n = deserializedMemberScope;
            this.f66119a = list;
            this.f66120b = list2;
            this.f66121c = deserializedMemberScope.m92359s().m92180c().m92155g().mo92175e() ? list3 : CollectionsKt.emptyList();
            this.f66122d = deserializedMemberScope.m92359s().m92185h().mo92446e(new zvd(this));
            this.f66123e = deserializedMemberScope.m92359s().m92185h().mo92446e(new awd(this));
            this.f66124f = deserializedMemberScope.m92359s().m92185h().mo92446e(new bwd(this));
            this.f66125g = deserializedMemberScope.m92359s().m92185h().mo92446e(new cwd(this));
            this.f66126h = deserializedMemberScope.m92359s().m92185h().mo92446e(new dwd(this));
            this.f66127i = deserializedMemberScope.m92359s().m92185h().mo92446e(new ewd(this));
            this.f66128j = deserializedMemberScope.m92359s().m92185h().mo92446e(new fwd(this));
            this.f66129k = deserializedMemberScope.m92359s().m92185h().mo92446e(new gwd(this));
            this.f66130l = deserializedMemberScope.m92359s().m92185h().mo92446e(new hwd(this, deserializedMemberScope));
            this.f66131m = deserializedMemberScope.m92359s().m92185h().mo92446e(new iwd(this, deserializedMemberScope));
        }

        /* JADX INFO: renamed from: B */
        public static final List m92386B(C15323b c15323b) {
            return c15323b.m92417w();
        }

        /* JADX INFO: renamed from: C */
        public static final List m92387C(C15323b c15323b) {
            return c15323b.m92420z();
        }

        /* JADX INFO: renamed from: D */
        public static final Set m92388D(C15323b c15323b, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Function> list = c15323b.f66119a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = c15323b.f66132n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m92233b(deserializedMemberScope2.m92359s().m92184g(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.mo92338w());
        }

        /* JADX INFO: renamed from: E */
        public static final Map m92389E(C15323b c15323b) {
            List<SimpleFunctionDescriptor> listM92407F = c15323b.m92407F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM92407F) {
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
        public static final Map m92390N(C15323b c15323b) {
            List<PropertyDescriptor> listM92408G = c15323b.m92408G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listM92408G) {
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
        public static final Map m92391O(C15323b c15323b) {
            List<TypeAliasDescriptor> listM92409H = c15323b.m92409H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM92409H, 10)), 16));
            for (Object obj : listM92409H) {
                Name name = ((TypeAliasDescriptor) obj).getName();
                name.getClass();
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: P */
        public static final Set m92392P(C15323b c15323b, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Property> list = c15323b.f66120b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = c15323b.f66132n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m92233b(deserializedMemberScope2.m92359s().m92184g(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.mo92339x());
        }

        /* JADX INFO: renamed from: r */
        public static final List m92403r(C15323b c15323b) {
            return CollectionsKt.plus((Collection) c15323b.m92410I(), (Iterable) c15323b.m92415u());
        }

        /* JADX INFO: renamed from: s */
        public static final List m92404s(C15323b c15323b) {
            return CollectionsKt.plus((Collection) c15323b.m92411J(), (Iterable) c15323b.m92416v());
        }

        /* JADX INFO: renamed from: t */
        public static final List m92405t(C15323b c15323b) {
            return c15323b.m92406A();
        }

        /* JADX INFO: renamed from: A */
        public final List<TypeAliasDescriptor> m92406A() {
            List<ProtoBuf.TypeAlias> list = this.f66121c;
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorM92219D = deserializedMemberScope.m92359s().m92183f().m92219D((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorM92219D != null) {
                    arrayList.add(typeAliasDescriptorM92219D);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: F */
        public final List<SimpleFunctionDescriptor> m92407F() {
            return (List) StorageKt.m92484a(this.f66125g, this, f66118o[3]);
        }

        /* JADX INFO: renamed from: G */
        public final List<PropertyDescriptor> m92408G() {
            return (List) StorageKt.m92484a(this.f66126h, this, f66118o[4]);
        }

        /* JADX INFO: renamed from: H */
        public final List<TypeAliasDescriptor> m92409H() {
            return (List) StorageKt.m92484a(this.f66124f, this, f66118o[2]);
        }

        /* JADX INFO: renamed from: I */
        public final List<SimpleFunctionDescriptor> m92410I() {
            return (List) StorageKt.m92484a(this.f66122d, this, f66118o[0]);
        }

        /* JADX INFO: renamed from: J */
        public final List<PropertyDescriptor> m92411J() {
            return (List) StorageKt.m92484a(this.f66123e, this, f66118o[1]);
        }

        /* JADX INFO: renamed from: K */
        public final Map<Name, Collection<SimpleFunctionDescriptor>> m92412K() {
            return (Map) StorageKt.m92484a(this.f66128j, this, f66118o[6]);
        }

        /* JADX INFO: renamed from: L */
        public final Map<Name, Collection<PropertyDescriptor>> m92413L() {
            return (Map) StorageKt.m92484a(this.f66129k, this, f66118o[7]);
        }

        /* JADX INFO: renamed from: M */
        public final Map<Name, TypeAliasDescriptor> m92414M() {
            return (Map) StorageKt.m92484a(this.f66127i, this, f66118o[5]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo92374a() {
            return (Set) StorageKt.m92484a(this.f66130l, this, f66118o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo92375b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!mo92374a().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<SimpleFunctionDescriptor> collection = m92412K().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<PropertyDescriptor> mo92376c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            name.getClass();
            lookupLocation.getClass();
            if (!mo92377d().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<PropertyDescriptor> collection = m92413L().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo92377d() {
            return (Set) StorageKt.m92484a(this.f66131m, this, f66118o[9]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        /* JADX INFO: renamed from: e */
        public void mo92378e(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
            collection.getClass();
            descriptorKindFilter.getClass();
            function1.getClass();
            lookupLocation.getClass();
            if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92051i())) {
                for (Object obj : m92408G()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    name.getClass();
                    if (function1.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92046d())) {
                for (Object obj2 : m92407F()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    name2.getClass();
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @Nullable
        /* JADX INFO: renamed from: f */
        public TypeAliasDescriptor mo92379f(@NotNull Name name) {
            name.getClass();
            return m92414M().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.InterfaceC15322a
        @NotNull
        /* JADX INFO: renamed from: g */
        public Set<Name> mo92380g() {
            List<ProtoBuf.TypeAlias> list = this.f66121c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.m92233b(deserializedMemberScope.m92359s().m92184g(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        /* JADX INFO: renamed from: u */
        public final List<SimpleFunctionDescriptor> m92415u() {
            Set<Name> setMo92338w = this.f66132n.mo92338w();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo92338w.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, m92418x((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: v */
        public final List<PropertyDescriptor> m92416v() {
            Set<Name> setMo92339x = this.f66132n.mo92339x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo92339x.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, m92419y((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: w */
        public final List<SimpleFunctionDescriptor> m92417w() {
            List<ProtoBuf.Function> list = this.f66119a;
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorM92229v = deserializedMemberScope.m92359s().m92183f().m92229v((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.mo92329A(simpleFunctionDescriptorM92229v)) {
                    simpleFunctionDescriptorM92229v = null;
                }
                if (simpleFunctionDescriptorM92229v != null) {
                    arrayList.add(simpleFunctionDescriptorM92229v);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: x */
        public final List<SimpleFunctionDescriptor> m92418x(Name name) {
            List<SimpleFunctionDescriptor> listM92410I = m92410I();
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM92410I) {
                if (Intrinsics.m87488d(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo92334n(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: y */
        public final List<PropertyDescriptor> m92419y(Name name) {
            List<PropertyDescriptor> listM92411J = m92411J();
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM92411J) {
                if (Intrinsics.m87488d(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.mo92335o(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: renamed from: z */
        public final List<PropertyDescriptor> m92420z() {
            List<ProtoBuf.Property> list = this.f66120b;
            DeserializedMemberScope deserializedMemberScope = this.f66132n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorM92217y = MemberDeserializer.m92217y(deserializedMemberScope.m92359s().m92183f(), (ProtoBuf.Property) ((MessageLite) it.next()), false, 2, null);
                if (propertyDescriptorM92217y != null) {
                    arrayList.add(propertyDescriptorM92217y);
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
        this.f66101a = deserializationContext;
        this.f66102b = m92357q(list, list2, list3);
        this.f66103c = deserializationContext.m92185h().mo92446e(new xvd(function0));
        this.f66104d = deserializationContext.m92185h().mo92448g(new yvd(this));
    }

    /* JADX INFO: renamed from: k */
    public static final Set m92354k(Function0 function0) {
        return CollectionsKt.toSet((Iterable) function0.invoke());
    }

    /* JADX INFO: renamed from: l */
    public static final Set m92355l(DeserializedMemberScope deserializedMemberScope) {
        Set<Name> setMo92337v = deserializedMemberScope.mo92337v();
        if (setMo92337v == null) {
            return null;
        }
        return SetsKt.plus(SetsKt.plus((Set) deserializedMemberScope.m92360t(), (Iterable) deserializedMemberScope.f66102b.mo92380g()), (Iterable) setMo92337v);
    }

    /* JADX INFO: renamed from: A */
    public boolean mo92329A(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor.getClass();
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Name> mo88719a() {
        return this.f66102b.mo92374a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: b */
    public Collection<SimpleFunctionDescriptor> mo88720b(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.f66102b.mo92375b(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<PropertyDescriptor> mo88721c(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        return this.f66102b.mo92376c(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* JADX INFO: renamed from: d */
    public Set<Name> mo88722d() {
        return this.f66102b.mo92377d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<Name> mo88723e() {
        return m92361u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: f */
    public ClassifierDescriptor mo89642f(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        if (mo92363z(name)) {
            return m92358r(name);
        }
        if (this.f66102b.mo92380g().contains(name)) {
            return m92362y(name);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo92333j(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Collection<DeclarationDescriptor> m92356m(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
        descriptorKindFilter.getClass();
        function1.getClass();
        lookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (descriptorKindFilter.m92039a(companion.m92049g())) {
            mo92333j(arrayList, function1);
        }
        this.f66102b.mo92378e(arrayList, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.m92039a(companion.m92045c())) {
            for (Name name : m92360t()) {
                if (function1.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, m92358r(name));
                }
            }
        }
        if (descriptorKindFilter.m92039a(DescriptorKindFilter.Companion.m92050h())) {
            for (Name name2 : this.f66102b.mo92380g()) {
                if (function1.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93178a(arrayList, this.f66102b.mo92379f(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public void mo92334n(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
        name.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: o */
    public void mo92335o(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
        name.getClass();
        list.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract ClassId mo92336p(@NotNull Name name);

    /* JADX INFO: renamed from: q */
    public final InterfaceC15322a m92357q(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f66101a.m92180c().m92155g().mo92173c() ? new C15323b(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    /* JADX INFO: renamed from: r */
    public final ClassDescriptor m92358r(Name name) {
        return this.f66101a.m92180c().m92150b(mo92336p(name));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final DeserializationContext m92359s() {
        return this.f66101a;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final Set<Name> m92360t() {
        return (Set) StorageKt.m92484a(this.f66103c, this, f66100e[0]);
    }

    /* JADX INFO: renamed from: u */
    public final Set<Name> m92361u() {
        return (Set) StorageKt.m92485b(this.f66104d, this, f66100e[1]);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public abstract Set<Name> mo92337v();

    @NotNull
    /* JADX INFO: renamed from: w */
    public abstract Set<Name> mo92338w();

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract Set<Name> mo92339x();

    /* JADX INFO: renamed from: y */
    public final TypeAliasDescriptor m92362y(Name name) {
        return this.f66102b.mo92379f(name);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo92363z(@NotNull Name name) {
        name.getClass();
        return m92360t().contains(name);
    }
}
