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
import p149l.aej0;
import p149l.bej0;
import p149l.cej0;
import p149l.dej0;
import p149l.zdj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66051a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final TypeDeserializer f66052b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f66053c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f66054d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<Integer, ClassifierDescriptor> f66055e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Function1<Integer, ClassifierDescriptor> f66056f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<Integer, TypeParameterDescriptor> f66057g;

    public TypeDeserializer(@NotNull DeserializationContext deserializationContext, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull String str, @NotNull String str2) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        deserializationContext.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f66051a = deserializationContext;
        this.f66052b = typeDeserializer;
        this.f66053c = str;
        this.f66054d = str2;
        this.f66055e = deserializationContext.m92185h().mo92444c(new zdj0(this));
        this.f66056f = deserializationContext.m92185h().mo92444c(new aej0(this));
        if (list.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f66051a, typeParameter, i));
                i++;
            }
        }
        this.f66057g = linkedHashMap;
    }

    /* JADX INFO: renamed from: A */
    public static final int m92250A(ProtoBuf.Type type) {
        type.getClass();
        return type.getArgumentCount();
    }

    /* JADX INFO: renamed from: f */
    public static final ClassifierDescriptor m92256f(TypeDeserializer typeDeserializer, int i) {
        return typeDeserializer.m92263g(i);
    }

    /* JADX INFO: renamed from: p */
    public static final List<ProtoBuf.Type.Argument> m92257p(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        argumentList.getClass();
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeM90907k = ProtoTypeTableUtilKt.m90907k(type, typeDeserializer.f66051a.m92187j());
        List<ProtoBuf.Type.Argument> listM92257p = typeM90907k != null ? m92257p(typeM90907k, typeDeserializer) : null;
        if (listM92257p == null) {
            listM92257p = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list, (Iterable) listM92257p);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ SimpleType m92258q(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.m92271o(type, z);
    }

    /* JADX INFO: renamed from: r */
    public static final List m92259r(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f66051a.m92180c().m92152d().mo90152i(type, typeDeserializer.f66051a.m92184g());
    }

    /* JADX INFO: renamed from: v */
    public static final ClassifierDescriptor m92260v(TypeDeserializer typeDeserializer, int i) {
        return typeDeserializer.m92265i(i);
    }

    /* JADX INFO: renamed from: y */
    public static final ClassDescriptor m92261y(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classIdM92232a = NameResolverUtilKt.m92232a(typeDeserializer.f66051a.m92184g(), i);
        List<Integer> listM93303W = SequencesKt___SequencesKt.m93303W(SequencesKt___SequencesKt.m93294N(SequencesKt__SequencesKt.m93274n(type, new cej0(typeDeserializer)), dej0.INSTANCE));
        int iM93308y = SequencesKt___SequencesKt.m93308y(SequencesKt__SequencesKt.m93274n(classIdM92232a, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).m91037e();
            }
        }));
        while (listM93303W.size() < iM93308y) {
            listM93303W.add(0);
        }
        return typeDeserializer.f66051a.m92180c().m92166r().m88556d(classIdM92232a, listM93303W);
    }

    /* JADX INFO: renamed from: z */
    public static final ProtoBuf.Type m92262z(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        type.getClass();
        return ProtoTypeTableUtilKt.m90907k(type, typeDeserializer.f66051a.m92187j());
    }

    /* JADX INFO: renamed from: g */
    public final ClassifierDescriptor m92263g(int i) {
        ClassId classIdM92232a = NameResolverUtilKt.m92232a(this.f66051a.m92184g(), i);
        boolean zM91041i = classIdM92232a.m91041i();
        DeserializationContext deserializationContext = this.f66051a;
        return zM91041i ? deserializationContext.m92180c().m92150b(classIdM92232a) : FindClassInModuleKt.m88508c(deserializationContext.m92180c().m92165q(), classIdM92232a);
    }

    /* JADX INFO: renamed from: h */
    public final SimpleType m92264h(int i) {
        if (NameResolverUtilKt.m92232a(this.f66051a.m92184g(), i).m91041i()) {
            return this.f66051a.m92180c().m92163o().mo92199a();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final ClassifierDescriptor m92265i(int i) {
        ClassId classIdM92232a = NameResolverUtilKt.m92232a(this.f66051a.m92184g(), i);
        if (classIdM92232a.m91041i()) {
            return null;
        }
        return FindClassInModuleKt.m88511f(this.f66051a.m92180c().m92165q(), classIdM92232a);
    }

    /* JADX INFO: renamed from: j */
    public final SimpleType m92266j(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns kotlinBuiltInsM93094n = TypeUtilsKt.m93094n(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType kotlinTypeM88154k = FunctionTypesKt.m88154k(kotlinType);
        List<KotlinType> listM88148e = FunctionTypesKt.m88148e(kotlinType);
        List listDropLast = CollectionsKt.dropLast(FunctionTypesKt.m88156m(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.m88145b(kotlinBuiltInsM93094n, annotations, kotlinTypeM88154k, listM88148e, arrayList, null, kotlinType2, true).mo89967N0(kotlinType.mo89966H0());
    }

    /* JADX INFO: renamed from: k */
    public final SimpleType m92267k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeM92268l;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeM92268l = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructorMo88305l = typeConstructor.mo88679f().m88226Y(size).mo88305l();
                typeConstructorMo88305l.getClass();
                list2 = list;
                simpleTypeM92268l = KotlinTypeFactory.m92634k(typeAttributes, typeConstructorMo88305l, list2, z, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            simpleTypeM92268l = m92268l(typeAttributes, typeConstructor, list2, z);
        }
        return simpleTypeM92268l == null ? ErrorUtils.INSTANCE.m93007f(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]) : simpleTypeM92268l;
    }

    /* JADX INFO: renamed from: l */
    public final SimpleType m92268l(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleTypeM92634k = KotlinTypeFactory.m92634k(typeAttributes, typeConstructor, list, z, null, 16, null);
        if (FunctionTypesKt.m88160q(simpleTypeM92634k)) {
            return m92273t(simpleTypeM92634k);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<TypeParameterDescriptor> m92269m() {
        return CollectionsKt.toList(this.f66057g.values());
    }

    /* JADX INFO: renamed from: n */
    public final TypeParameterDescriptor m92270n(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.f66057g.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f66052b;
        if (typeDeserializer != null) {
            return typeDeserializer.m92270n(i);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final SimpleType m92271o(@NotNull ProtoBuf.Type type, boolean z) {
        SimpleType simpleTypeM92574c;
        SimpleType simpleTypeM92663j;
        type.getClass();
        SimpleType simpleTypeM92264h = type.hasClassName() ? m92264h(type.getClassName()) : type.hasTypeAliasName() ? m92264h(type.getTypeAliasName()) : null;
        if (simpleTypeM92264h != null) {
            return simpleTypeM92264h;
        }
        TypeConstructor typeConstructorM92276x = m92276x(type);
        if (ErrorUtils.m93003m(typeConstructorM92276x.mo88316e())) {
            return ErrorUtils.INSTANCE.m93005c(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructorM92276x, typeConstructorM92276x.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f66051a.m92185h(), new bej0(this, type));
        TypeAttributes typeAttributesM92272s = m92272s(this.f66051a.m92180c().m92170v(), deserializedAnnotations, typeConstructorM92276x, this.f66051a.m92182e());
        List<ProtoBuf.Type.Argument> listM92257p = m92257p(type, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM92257p, 10));
        int i = 0;
        for (Object obj : listM92257p) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructorM92276x.getParameters();
            parameters.getClass();
            arrayList.add(m92275w((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i), (ProtoBuf.Type.Argument) obj));
            i = i2;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo88316e = typeConstructorM92276x.mo88316e();
        if (z && (classifierDescriptorMo88316e instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeM92628c = KotlinTypeFactory.m92628c((TypeAliasDescriptor) classifierDescriptorMo88316e, list);
            simpleTypeM92574c = simpleTypeM92628c.mo89967N0(KotlinTypeKt.m92645b(simpleTypeM92628c) || type.getNullable()).mo89894M0(m92272s(this.f66051a.m92180c().m92170v(), Annotations.Companion.m88640a(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeM92628c.getAnnotations())), typeConstructorM92276x, this.f66051a.m92182e()));
        } else if (Flags.f65359a.mo90875d(type.getFlags()).booleanValue()) {
            simpleTypeM92574c = m92267k(typeAttributesM92272s, typeConstructorM92276x, list, type.getNullable());
        } else {
            SimpleType simpleTypeM92634k = KotlinTypeFactory.m92634k(typeAttributesM92272s, typeConstructorM92276x, list, type.getNullable(), null, 16, null);
            if (Flags.f65360b.mo90875d(type.getFlags()).booleanValue()) {
                simpleTypeM92574c = DefinitelyNotNullType.Companion.m92574c(DefinitelyNotNullType.Companion, simpleTypeM92634k, true, false, 4, null);
                if (simpleTypeM92574c == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeM92634k + '\'').toString());
                }
            } else {
                simpleTypeM92574c = simpleTypeM92634k;
            }
        }
        ProtoBuf.Type typeM90897a = ProtoTypeTableUtilKt.m90897a(type, this.f66051a.m92187j());
        return (typeM90897a == null || (simpleTypeM92663j = SpecialTypesKt.m92663j(simpleTypeM92574c, m92271o(typeM90897a, false))) == null) ? simpleTypeM92574c : simpleTypeM92663j;
    }

    /* JADX INFO: renamed from: s */
    public final TypeAttributes m92272s(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).mo92571a(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.m92708j(CollectionsKt.flatten(arrayList));
    }

    /* JADX INFO: renamed from: t */
    public final SimpleType m92273t(KotlinType kotlinType) {
        KotlinType type;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.m88156m(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = type.mo91890G0().mo88316e();
        FqName fqNameM91982o = classifierDescriptorMo88316e != null ? DescriptorUtilsKt.m91982o(classifierDescriptorMo88316e) : null;
        if (type.mo91888E0().size() != 1 || (!Intrinsics.m87488d(fqNameM91982o, StandardNames.f63830v) && !Intrinsics.m87488d(fqNameM91982o, TypeDeserializerKt.f66058a))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.mo91888E0())).getType();
        type2.getClass();
        DeclarationDescriptor declarationDescriptorM92182e = this.f66051a.m92182e();
        CallableDescriptor callableDescriptor = declarationDescriptorM92182e instanceof CallableDescriptor ? (CallableDescriptor) declarationDescriptorM92182e : null;
        return Intrinsics.m87488d(callableDescriptor != null ? DescriptorUtilsKt.m91978k(callableDescriptor) : null, SuspendFunctionTypeUtilKt.f66049a) ? m92266j(kotlinType, type2) : m92266j(kotlinType, type2);
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66053c);
        if (this.f66052b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f66052b.f66053c;
        }
        sb.append(str);
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final KotlinType m92274u(@NotNull ProtoBuf.Type type) {
        type.getClass();
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return m92271o(type, true);
        }
        String string = this.f66051a.m92184g().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeM92258q = m92258q(this, type, false, 2, null);
        ProtoBuf.Type typeM90902f = ProtoTypeTableUtilKt.m90902f(type, this.f66051a.m92187j());
        typeM90902f.getClass();
        return this.f66051a.m92180c().m92161m().mo90320a(type, string, simpleTypeM92258q, m92258q(this, typeM90902f, false, 2, null));
    }

    /* JADX INFO: renamed from: w */
    public final TypeProjection m92275w(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.f66051a.m92180c().m92165q().mo88546f()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        projection.getClass();
        Variance varianceM92246c = protoEnumFlags.m92246c(projection);
        ProtoBuf.Type typeM90913q = ProtoTypeTableUtilKt.m90913q(argument, this.f66051a.m92187j());
        return typeM90913q == null ? new TypeProjectionImpl(ErrorUtils.m93002d(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(varianceM92246c, m92274u(typeM90913q));
    }

    /* JADX INFO: renamed from: x */
    public final TypeConstructor m92276x(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.f66055e.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = m92261y(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = m92270n(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.m93006e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.f66054d);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f66051a.m92184g().getString(type.getTypeParameterName());
            Iterator<T> it = m92269m().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m87488d(((TypeParameterDescriptor) next).getName().m91082b(), string));
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.m93006e(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f66051a.m92182e().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.m93006e(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            classifierDescriptorInvoke = this.f66056f.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = m92261y(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructorMo88305l = classifierDescriptorInvoke.mo88305l();
        typeConstructorMo88305l.getClass();
        return typeConstructorMo88305l;
    }
}
