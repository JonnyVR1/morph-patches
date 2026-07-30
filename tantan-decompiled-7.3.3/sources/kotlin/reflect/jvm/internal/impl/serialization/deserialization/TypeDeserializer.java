package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dnj0;
import p153l.enj0;
import p153l.fnj0;
import p153l.gnj0;
import p153l.hnj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66725a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final TypeDeserializer f66726b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f66727c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f66728d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<Integer, ClassifierDescriptor> f66729e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Function1<Integer, ClassifierDescriptor> f66730f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<Integer, TypeParameterDescriptor> f66731g;

    public TypeDeserializer(@NotNull DeserializationContext deserializationContext, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull String str, @NotNull String str2) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        deserializationContext.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f66725a = deserializationContext;
        this.f66726b = typeDeserializer;
        this.f66727c = str;
        this.f66728d = str2;
        this.f66729e = deserializationContext.m93076h().mo93335c(new dnj0(this));
        this.f66730f = deserializationContext.m93076h().mo93335c(new enj0(this));
        if (list.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f66725a, typeParameter, i));
                i++;
            }
        }
        this.f66731g = linkedHashMap;
    }

    /* JADX INFO: renamed from: A */
    public static final int m93141A(ProtoBuf.Type type) {
        type.getClass();
        return type.getArgumentCount();
    }

    /* JADX INFO: renamed from: f */
    public static final ClassifierDescriptor m93147f(TypeDeserializer typeDeserializer, int i) {
        return typeDeserializer.m93154g(i);
    }

    /* JADX INFO: renamed from: p */
    public static final List<ProtoBuf.Type.Argument> m93148p(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        argumentList.getClass();
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeM91798k = ProtoTypeTableUtilKt.m91798k(type, typeDeserializer.f66725a.m93078j());
        List<ProtoBuf.Type.Argument> listM93148p = typeM91798k != null ? m93148p(typeM91798k, typeDeserializer) : null;
        if (listM93148p == null) {
            listM93148p = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list, (Iterable) listM93148p);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ SimpleType m93149q(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.m93162o(type, z);
    }

    /* JADX INFO: renamed from: r */
    public static final List m93150r(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f66725a.m93071c().m93043d().mo91043i(type, typeDeserializer.f66725a.m93075g());
    }

    /* JADX INFO: renamed from: v */
    public static final ClassifierDescriptor m93151v(TypeDeserializer typeDeserializer, int i) {
        return typeDeserializer.m93156i(i);
    }

    /* JADX INFO: renamed from: y */
    public static final ClassDescriptor m93152y(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classIdM93123a = NameResolverUtilKt.m93123a(typeDeserializer.f66725a.m93075g(), i);
        List<Integer> listM94194W = SequencesKt___SequencesKt.m94194W(SequencesKt___SequencesKt.m94185N(SequencesKt__SequencesKt.m94165n(type, new gnj0(typeDeserializer)), hnj0.INSTANCE));
        int iM94199y = SequencesKt___SequencesKt.m94199y(SequencesKt__SequencesKt.m94165n(classIdM93123a, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).m91928e();
            }
        }));
        while (listM94194W.size() < iM94199y) {
            listM94194W.add(0);
        }
        return typeDeserializer.f66725a.m93071c().m93057r().m89447d(classIdM93123a, listM94194W);
    }

    /* JADX INFO: renamed from: z */
    public static final ProtoBuf.Type m93153z(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        type.getClass();
        return ProtoTypeTableUtilKt.m91798k(type, typeDeserializer.f66725a.m93078j());
    }

    /* JADX INFO: renamed from: g */
    public final ClassifierDescriptor m93154g(int i) {
        ClassId classIdM93123a = NameResolverUtilKt.m93123a(this.f66725a.m93075g(), i);
        boolean zM91932i = classIdM93123a.m91932i();
        DeserializationContext deserializationContext = this.f66725a;
        return zM91932i ? deserializationContext.m93071c().m93041b(classIdM93123a) : FindClassInModuleKt.m89399c(deserializationContext.m93071c().m93056q(), classIdM93123a);
    }

    /* JADX INFO: renamed from: h */
    public final SimpleType m93155h(int i) {
        if (NameResolverUtilKt.m93123a(this.f66725a.m93075g(), i).m91932i()) {
            return this.f66725a.m93071c().m93054o().mo93090a();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final ClassifierDescriptor m93156i(int i) {
        ClassId classIdM93123a = NameResolverUtilKt.m93123a(this.f66725a.m93075g(), i);
        if (classIdM93123a.m91932i()) {
            return null;
        }
        return FindClassInModuleKt.m89402f(this.f66725a.m93071c().m93056q(), classIdM93123a);
    }

    /* JADX INFO: renamed from: j */
    public final SimpleType m93157j(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns kotlinBuiltInsM93985n = TypeUtilsKt.m93985n(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType kotlinTypeM89045k = FunctionTypesKt.m89045k(kotlinType);
        List<KotlinType> listM89039e = FunctionTypesKt.m89039e(kotlinType);
        List listDropLast = CollectionsKt.dropLast(FunctionTypesKt.m89047m(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.m89036b(kotlinBuiltInsM93985n, annotations, kotlinTypeM89045k, listM89039e, arrayList, null, kotlinType2, true).mo90858N0(kotlinType.mo90857H0());
    }

    /* JADX INFO: renamed from: k */
    public final SimpleType m93158k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeM93159l;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeM93159l = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructorMo89196l = typeConstructor.mo89570f().m89117Y(size).mo89196l();
                typeConstructorMo89196l.getClass();
                list2 = list;
                simpleTypeM93159l = KotlinTypeFactory.m93525k(typeAttributes, typeConstructorMo89196l, list2, z, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            simpleTypeM93159l = m93159l(typeAttributes, typeConstructor, list2, z);
        }
        return simpleTypeM93159l == null ? ErrorUtils.INSTANCE.m93898f(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]) : simpleTypeM93159l;
    }

    /* JADX INFO: renamed from: l */
    public final SimpleType m93159l(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleTypeM93525k = KotlinTypeFactory.m93525k(typeAttributes, typeConstructor, list, z, null, 16, null);
        if (FunctionTypesKt.m89051q(simpleTypeM93525k)) {
            return m93164t(simpleTypeM93525k);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<TypeParameterDescriptor> m93160m() {
        return CollectionsKt.toList(this.f66731g.values());
    }

    /* JADX INFO: renamed from: n */
    public final TypeParameterDescriptor m93161n(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.f66731g.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f66726b;
        if (typeDeserializer != null) {
            return typeDeserializer.m93161n(i);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final SimpleType m93162o(@NotNull ProtoBuf.Type type, boolean z) {
        SimpleType simpleTypeM93465c;
        SimpleType simpleTypeM93554j;
        type.getClass();
        SimpleType simpleTypeM93155h = type.hasClassName() ? m93155h(type.getClassName()) : type.hasTypeAliasName() ? m93155h(type.getTypeAliasName()) : null;
        if (simpleTypeM93155h != null) {
            return simpleTypeM93155h;
        }
        TypeConstructor typeConstructorM93167x = m93167x(type);
        if (ErrorUtils.m93894m(typeConstructorM93167x.mo89207e())) {
            return ErrorUtils.INSTANCE.m93896c(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorM93167x, typeConstructorM93167x.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f66725a.m93076h(), new fnj0(this, type));
        TypeAttributes typeAttributesM93163s = m93163s(this.f66725a.m93071c().m93061v(), deserializedAnnotations, typeConstructorM93167x, this.f66725a.m93073e());
        List<ProtoBuf.Type.Argument> listM93148p = m93148p(type, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM93148p, 10));
        int i = 0;
        for (Object obj : listM93148p) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructorM93167x.getParameters();
            parameters.getClass();
            arrayList.add(m93166w((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i), (ProtoBuf.Type.Argument) obj));
            i = i2;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo89207e = typeConstructorM93167x.mo89207e();
        if (z && (classifierDescriptorMo89207e instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeM93519c = KotlinTypeFactory.m93519c((TypeAliasDescriptor) classifierDescriptorMo89207e, list);
            simpleTypeM93465c = simpleTypeM93519c.mo90858N0(KotlinTypeKt.m93536b(simpleTypeM93519c) || type.getNullable()).mo90785M0(m93163s(this.f66725a.m93071c().m93061v(), Annotations.Companion.m89531a(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeM93519c.getAnnotations())), typeConstructorM93167x, this.f66725a.m93073e()));
        } else if (Flags.f66033a.mo91766d(type.getFlags()).booleanValue()) {
            simpleTypeM93465c = m93158k(typeAttributesM93163s, typeConstructorM93167x, list, type.getNullable());
        } else {
            SimpleType simpleTypeM93525k = KotlinTypeFactory.m93525k(typeAttributesM93163s, typeConstructorM93167x, list, type.getNullable(), null, 16, null);
            if (Flags.f66034b.mo91766d(type.getFlags()).booleanValue()) {
                simpleTypeM93465c = DefinitelyNotNullType.Companion.m93465c(DefinitelyNotNullType.Companion, simpleTypeM93525k, true, false, 4, null);
                if (simpleTypeM93465c == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeM93525k + '\'').toString());
                }
            } else {
                simpleTypeM93465c = simpleTypeM93525k;
            }
        }
        ProtoBuf.Type typeM91788a = ProtoTypeTableUtilKt.m91788a(type, this.f66725a.m93078j());
        return (typeM91788a == null || (simpleTypeM93554j = SpecialTypesKt.m93554j(simpleTypeM93465c, m93162o(typeM91788a, false))) == null) ? simpleTypeM93465c : simpleTypeM93554j;
    }

    /* JADX INFO: renamed from: s */
    public final TypeAttributes m93163s(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).mo93462a(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.m93599j(CollectionsKt.flatten(arrayList));
    }

    /* JADX INFO: renamed from: t */
    public final SimpleType m93164t(KotlinType kotlinType) {
        KotlinType type;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.m89047m(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = type.mo92781G0().mo89207e();
        FqName fqNameM92873o = classifierDescriptorMo89207e != null ? DescriptorUtilsKt.m92873o(classifierDescriptorMo89207e) : null;
        if (type.mo92779E0().size() != 1 || (!Intrinsics.m88377d(fqNameM92873o, StandardNames.f64504v) && !Intrinsics.m88377d(fqNameM92873o, TypeDeserializerKt.f66732a))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.mo92779E0())).getType();
        type2.getClass();
        DeclarationDescriptor declarationDescriptorM93073e = this.f66725a.m93073e();
        CallableDescriptor callableDescriptor = declarationDescriptorM93073e instanceof CallableDescriptor ? (CallableDescriptor) declarationDescriptorM93073e : null;
        return Intrinsics.m88377d(callableDescriptor != null ? DescriptorUtilsKt.m92869k(callableDescriptor) : null, SuspendFunctionTypeUtilKt.f66723a) ? m93157j(kotlinType, type2) : m93157j(kotlinType, type2);
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66727c);
        if (this.f66726b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f66726b.f66727c;
        }
        sb.append(str);
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final KotlinType m93165u(@NotNull ProtoBuf.Type type) {
        type.getClass();
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return m93162o(type, true);
        }
        String string = this.f66725a.m93075g().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeM93149q = m93149q(this, type, false, 2, null);
        ProtoBuf.Type typeM91793f = ProtoTypeTableUtilKt.m91793f(type, this.f66725a.m93078j());
        typeM91793f.getClass();
        return this.f66725a.m93071c().m93052m().mo91211a(type, string, simpleTypeM93149q, m93149q(this, typeM91793f, false, 2, null));
    }

    /* JADX INFO: renamed from: w */
    public final TypeProjection m93166w(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.f66725a.m93071c().m93056q().mo89437f()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        projection.getClass();
        Variance varianceM93137c = protoEnumFlags.m93137c(projection);
        ProtoBuf.Type typeM91804q = ProtoTypeTableUtilKt.m91804q(argument, this.f66725a.m93078j());
        return typeM91804q == null ? new TypeProjectionImpl(ErrorUtils.m93893d(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(varianceM93137c, m93165u(typeM91804q));
    }

    /* JADX INFO: renamed from: x */
    public final TypeConstructor m93167x(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.f66729e.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = m93152y(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = m93161n(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.m93897e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.f66728d);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f66725a.m93075g().getString(type.getTypeParameterName());
            Iterator<T> it = m93160m().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m88377d(((TypeParameterDescriptor) next).getName().m91973b(), string));
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.m93897e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f66725a.m93073e().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.m93897e(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            classifierDescriptorInvoke = this.f66730f.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = m93152y(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructorMo89196l = classifierDescriptorInvoke.mo89196l();
        typeConstructorMo89196l.getClass();
        return typeConstructorMo89196l;
    }
}
