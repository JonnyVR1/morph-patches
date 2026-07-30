package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import p149l.f8y;
import p149l.g8y;
import p149l.h8y;
import p149l.i8y;
import p149l.j8y;
import p149l.k8y;
import p149l.l8y;
import p149l.m8y;
import p149l.n8y;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66022a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AnnotationDeserializer f66023b;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        deserializationContext.getClass();
        this.f66022a = deserializationContext;
        this.f66023b = new AnnotationDeserializer(deserializationContext.m92180c().m92165q(), deserializationContext.m92180c().m92166r());
    }

    /* JADX INFO: renamed from: A */
    public static final ConstantValue m92200A(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerM92221j = memberDeserializer.m92221j(memberDeserializer.f66022a.m92182e());
        protoContainerM92221j.getClass();
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderM92152d = memberDeserializer.f66022a.m92180c().m92152d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoaderM92152d.mo90132e(protoContainerM92221j, property, returnType);
    }

    /* JADX INFO: renamed from: B */
    public static final NullableLazyValue m92201B(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f66022a.m92185h().mo92448g(new n8y(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: renamed from: C */
    public static final ConstantValue m92202C(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerM92221j = memberDeserializer.m92221j(memberDeserializer.f66022a.m92182e());
        protoContainerM92221j.getClass();
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderM92152d = memberDeserializer.f66022a.m92180c().m92152d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoaderM92152d.mo90133k(protoContainerM92221j, property, returnType);
    }

    /* JADX INFO: renamed from: F */
    public static final List m92203F(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f66022a.m92180c().m92152d().mo90145a(protoContainer, messageLite, annotatedCallableKind, i, valueParameter));
    }

    /* JADX INFO: renamed from: l */
    public static final List m92213l(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f66022a.m92180c().m92152d().mo90151h(protoContainer, messageLite, annotatedCallableKind, i, valueParameter));
    }

    /* JADX INFO: renamed from: n */
    public static final List m92214n(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerM92221j = memberDeserializer.m92221j(memberDeserializer.f66022a.m92182e());
        List list = protoContainerM92221j != null ? CollectionsKt.toList(memberDeserializer.f66022a.m92180c().m92152d().mo90153j(protoContainerM92221j, messageLite, annotatedCallableKind)) : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: q */
    public static final List m92215q(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        List list;
        ProtoContainer protoContainerM92221j = memberDeserializer.m92221j(memberDeserializer.f66022a.m92182e());
        if (protoContainerM92221j != null) {
            DeserializationContext deserializationContext = memberDeserializer.f66022a;
            list = z ? CollectionsKt.toList(deserializationContext.m92180c().m92152d().mo90155m(protoContainerM92221j, property)) : CollectionsKt.toList(deserializationContext.m92180c().m92152d().mo90149f(protoContainerM92221j, property));
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: s */
    public static final List m92216s(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerM92221j = memberDeserializer.m92221j(memberDeserializer.f66022a.m92182e());
        List<AnnotationDescriptor> listMo90150g = protoContainerM92221j != null ? memberDeserializer.f66022a.m92180c().m92152d().mo90150g(protoContainerM92221j, messageLite, annotatedCallableKind) : null;
        return listMo90150g == null ? CollectionsKt.emptyList() : listMo90150g;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ PropertyDescriptor m92217y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memberDeserializer.m92231x(property, z);
    }

    /* JADX INFO: renamed from: z */
    public static final NullableLazyValue m92218z(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f66022a.m92185h().mo92448g(new m8y(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TypeAliasDescriptor m92219D(@NotNull ProtoBuf.TypeAlias typeAlias) {
        typeAlias.getClass();
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.f66023b;
            annotation.getClass();
            arrayList.add(annotationDeserializer.m92127a(annotation, this.f66022a.m92184g()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f66022a.m92185h(), this.f66022a.m92182e(), companion.m88640a(arrayList), NameResolverUtilKt.m92233b(this.f66022a.m92184g(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.m92248a(ProtoEnumFlags.INSTANCE, Flags.f65362d.mo90875d(typeAlias.getFlags())), typeAlias, this.f66022a.m92184g(), this.f66022a.m92187j(), this.f66022a.m92188k(), this.f66022a.m92181d());
        DeserializationContext deserializationContext = this.f66022a;
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM92178b = DeserializationContext.m92178b(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.m92429P0(deserializationContextM92178b.m92186i().m92269m(), deserializationContextM92178b.m92186i().m92271o(ProtoTypeTableUtilKt.m90915s(typeAlias, this.f66022a.m92187j()), false), deserializationContextM92178b.m92186i().m92271o(ProtoTypeTableUtilKt.m90901e(typeAlias, this.f66022a.m92187j()), false));
        return deserializedTypeAliasDescriptor;
    }

    /* JADX INFO: renamed from: E */
    public final List<ValueParameterDescriptor> m92220E(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer;
        Annotations annotationsM88641b;
        MemberDeserializer memberDeserializer2 = this;
        DeclarationDescriptor declarationDescriptorM92182e = memberDeserializer2.f66022a.m92182e();
        declarationDescriptorM92182e.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptorM92182e;
        DeclarationDescriptor declarationDescriptorMo88299b = callableDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        ProtoContainer protoContainerM92221j = memberDeserializer2.m92221j(declarationDescriptorMo88299b);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (protoContainerM92221j == null || !Flags.f65361c.mo90875d(flags).booleanValue()) {
                memberDeserializer = memberDeserializer2;
                annotationsM88641b = Annotations.Companion.m88641b();
            } else {
                int i3 = i;
                memberDeserializer = memberDeserializer2;
                i = i3;
                annotationsM88641b = new NonEmptyDeserializedAnnotations(memberDeserializer2.f66022a.m92185h(), new k8y(memberDeserializer2, protoContainerM92221j, messageLite, annotatedCallableKind, i3, valueParameter));
            }
            Annotations annotations = annotationsM88641b;
            Name nameM92233b = NameResolverUtilKt.m92233b(memberDeserializer.f66022a.m92184g(), valueParameter.getName());
            KotlinType kotlinTypeM92274u = memberDeserializer.f66022a.m92186i().m92274u(ProtoTypeTableUtilKt.m90914r(valueParameter, memberDeserializer.f66022a.m92187j()));
            Boolean boolMo90875d = Flags.f65350K.mo90875d(flags);
            boolMo90875d.getClass();
            boolean zBooleanValue = boolMo90875d.booleanValue();
            Boolean boolMo90875d2 = Flags.f65351L.mo90875d(flags);
            boolMo90875d2.getClass();
            boolean zBooleanValue2 = boolMo90875d2.booleanValue();
            Boolean boolMo90875d3 = Flags.f65352M.mo90875d(flags);
            boolMo90875d3.getClass();
            boolean zBooleanValue3 = boolMo90875d3.booleanValue();
            ProtoBuf.Type typeM90917u = ProtoTypeTableUtilKt.m90917u(valueParameter, memberDeserializer.f66022a.m92187j());
            KotlinType kotlinTypeM92274u2 = typeM90917u != null ? memberDeserializer.f66022a.m92186i().m92274u(typeM90917u) : null;
            SourceElement sourceElement = SourceElement.f64063a;
            sourceElement.getClass();
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i, annotations, nameM92233b, kotlinTypeM92274u, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeM92274u2, sourceElement));
            memberDeserializer2 = memberDeserializer;
            callableDescriptor = callableDescriptor2;
            i = i2;
            protoContainerM92221j = protoContainerM92221j;
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final ProtoContainer m92221j(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).mo88562d(), this.f66022a.m92184g(), this.f66022a.m92187j(), this.f66022a.m92181d());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).m92320b1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final List<ReceiverParameterDescriptor> m92222k(List<ProtoBuf.Type> list, List<ProtoBuf.ValueParameter> list2, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor declarationDescriptorM92182e = this.f66022a.m92182e();
        declarationDescriptorM92182e.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptorM92182e;
        DeclarationDescriptor declarationDescriptorMo88299b = callableDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        ProtoContainer protoContainerM92221j = m92221j(declarationDescriptorMo88299b);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProtoBuf.Type type = (ProtoBuf.Type) obj;
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) CollectionsKt.getOrNull(list2, i);
            ReceiverParameterDescriptor receiverParameterDescriptorM91730b = DescriptorFactory.m91730b(callableDescriptor, this.f66022a.m92186i().m92274u(type), null, (protoContainerM92221j == null || !Flags.f65361c.mo90875d((valueParameter == null || !valueParameter.hasFlags()) ? 0 : valueParameter.getFlags()).booleanValue()) ? Annotations.Companion.m88641b() : new NonEmptyDeserializedAnnotations(this.f66022a.m92185h(), new l8y(this, protoContainerM92221j, messageLite, annotatedCallableKind, i, valueParameter)), i);
            if (receiverParameterDescriptorM91730b != null) {
                arrayList.add(receiverParameterDescriptorM91730b);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final Annotations m92223m(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f65361c.mo90875d(i).booleanValue() ? Annotations.Companion.m88641b() : new NonEmptyDeserializedAnnotations(this.f66022a.m92185h(), new h8y(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: renamed from: o */
    public final ReceiverParameterDescriptor m92224o() {
        DeclarationDescriptor declarationDescriptorM92182e = this.f66022a.m92182e();
        ClassDescriptor classDescriptor = declarationDescriptorM92182e instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorM92182e : null;
        if (classDescriptor != null) {
            return classDescriptor.mo88456R();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Annotations m92225p(ProtoBuf.Property property, boolean z) {
        return !Flags.f65361c.mo90875d(property.getFlags()).booleanValue() ? Annotations.Companion.m88641b() : new NonEmptyDeserializedAnnotations(this.f66022a.m92185h(), new i8y(this, z, property));
    }

    /* JADX INFO: renamed from: r */
    public final Annotations m92226r(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f66022a.m92185h(), new j8y(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: renamed from: t */
    public final void m92227t(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.mo88902h1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ClassConstructorDescriptor m92228u(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        constructor.getClass();
        DeclarationDescriptor declarationDescriptorM92182e = this.f66022a.m92182e();
        declarationDescriptorM92182e.getClass();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorM92182e;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, m92223m(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.f66022a.m92184g(), this.f66022a.m92187j(), this.f66022a.m92188k(), this.f66022a.m92181d(), null, 1024, null);
        MemberDeserializer memberDeserializerM92183f = DeserializationContext.m92178b(this.f66022a, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).m92183f();
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        deserializedClassConstructorDescriptor.m88701j1(memberDeserializerM92183f.m92220E(valueParameterList, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.m92248a(ProtoEnumFlags.INSTANCE, Flags.f65362d.mo90875d(constructor.getFlags())));
        deserializedClassConstructorDescriptor.m88757Z0(classDescriptor.mo88458o());
        deserializedClassConstructorDescriptor.m88748P0(classDescriptor.mo88307n0());
        deserializedClassConstructorDescriptor.mo88750R0(!Flags.f65373o.mo90875d(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SimpleFunctionDescriptor m92229v(@NotNull ProtoBuf.Function function) {
        KotlinType kotlinTypeM92274u;
        function.getClass();
        int flags = function.hasFlags() ? function.getFlags() : m92230w(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsM92223m = m92223m(function, flags, annotatedCallableKind);
        Annotations annotationsM92226r = ProtoTypeTableUtilKt.m90903g(function) ? m92226r(function, annotatedCallableKind) : Annotations.Companion.m88641b();
        VersionRequirementTable versionRequirementTableM90933b = Intrinsics.m87488d(DescriptorUtilsKt.m91982o(this.f66022a.m92182e()).m91047b(NameResolverUtilKt.m92233b(this.f66022a.m92184g(), function.getName())), SuspendFunctionTypeUtilKt.f66049a) ? VersionRequirementTable.Companion.m90933b() : this.f66022a.m92188k();
        DeclarationDescriptor declarationDescriptorM92182e = this.f66022a.m92182e();
        Name nameM92233b = NameResolverUtilKt.m92233b(this.f66022a.m92184g(), function.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Annotations annotations = annotationsM92226r;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(declarationDescriptorM92182e, null, annotationsM92223m, nameM92233b, ProtoEnumFlagsUtilsKt.m92249b(protoEnumFlags, Flags.f65375q.mo90875d(flags)), function, this.f66022a.m92184g(), this.f66022a.m92187j(), versionRequirementTableM90933b, this.f66022a.m92181d(), null, 1024, null);
        DeserializationContext deserializationContext = this.f66022a;
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM92178b = DeserializationContext.m92178b(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeM90908l = ProtoTypeTableUtilKt.m90908l(function, this.f66022a.m92187j());
        ReceiverParameterDescriptor receiverParameterDescriptorM91737i = (typeM90908l == null || (kotlinTypeM92274u = deserializationContextM92178b.m92186i().m92274u(typeM90908l)) == null) ? null : DescriptorFactory.m91737i(deserializedSimpleFunctionDescriptor, kotlinTypeM92274u, annotations);
        ReceiverParameterDescriptor receiverParameterDescriptorM92224o = m92224o();
        MemberDeserializer memberDeserializerM92183f = deserializationContextM92178b.m92183f();
        List<ProtoBuf.Type> listM90899c = ProtoTypeTableUtilKt.m90899c(function, this.f66022a.m92187j());
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        List<ReceiverParameterDescriptor> listM92222k = memberDeserializerM92183f.m92222k(listM90899c, contextParameterList, function, annotatedCallableKind);
        List<TypeParameterDescriptor> listM92269m = deserializationContextM92178b.m92186i().m92269m();
        MemberDeserializer memberDeserializerM92183f2 = deserializationContextM92178b.m92183f();
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        m92227t(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorM91737i, receiverParameterDescriptorM92224o, listM92222k, listM92269m, memberDeserializerM92183f2.m92220E(valueParameterList, function, annotatedCallableKind), deserializationContextM92178b.m92186i().m92274u(ProtoTypeTableUtilKt.m90910n(function, this.f66022a.m92187j())), protoEnumFlags.m92245b(Flags.f65363e.mo90875d(flags)), ProtoEnumFlagsUtilsKt.m92248a(protoEnumFlags, Flags.f65362d.mo90875d(flags)), MapsKt.emptyMap());
        Boolean boolMo90875d = Flags.f65376r.mo90875d(flags);
        boolMo90875d.getClass();
        deserializedSimpleFunctionDescriptor.m88756Y0(boolMo90875d.booleanValue());
        Boolean boolMo90875d2 = Flags.f65377s.mo90875d(flags);
        boolMo90875d2.getClass();
        deserializedSimpleFunctionDescriptor.m88754V0(boolMo90875d2.booleanValue());
        Boolean boolMo90875d3 = Flags.f65380v.mo90875d(flags);
        boolMo90875d3.getClass();
        deserializedSimpleFunctionDescriptor.m88749Q0(boolMo90875d3.booleanValue());
        Boolean boolMo90875d4 = Flags.f65378t.mo90875d(flags);
        boolMo90875d4.getClass();
        deserializedSimpleFunctionDescriptor.m88755X0(boolMo90875d4.booleanValue());
        Boolean boolMo90875d5 = Flags.f65379u.mo90875d(flags);
        boolMo90875d5.getClass();
        deserializedSimpleFunctionDescriptor.m88759b1(boolMo90875d5.booleanValue());
        Boolean boolMo90875d6 = Flags.f65381w.mo90875d(flags);
        boolMo90875d6.getClass();
        deserializedSimpleFunctionDescriptor.m88758a1(boolMo90875d6.booleanValue());
        Boolean boolMo90875d7 = Flags.f65382x.mo90875d(flags);
        boolMo90875d7.getClass();
        deserializedSimpleFunctionDescriptor.m88748P0(boolMo90875d7.booleanValue());
        deserializedSimpleFunctionDescriptor.mo88750R0(!Flags.f65383y.mo90875d(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairMo92147a = this.f66022a.m92180c().m92156h().mo92147a(function, deserializedSimpleFunctionDescriptor, this.f66022a.m92187j(), deserializationContextM92178b.m92186i());
        if (pairMo92147a != null) {
            deserializedSimpleFunctionDescriptor.m88746N0(pairMo92147a.getFirst(), pairMo92147a.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: w */
    public final int m92230w(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final PropertyDescriptor m92231x(@NotNull ProtoBuf.Property property, boolean z) {
        Annotations annotationsM92223m;
        Flags.FlagField<ProtoBuf.Modality> flagField;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM91732d;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeM92274u;
        property.getClass();
        int flags = property.hasFlags() ? property.getFlags() : m92230w(property.getOldFlags());
        if (z) {
            Annotations.Companion companion = Annotations.Companion;
            List<ProtoBuf.Annotation> annotationList = property.getAnnotationList();
            annotationList.getClass();
            List<ProtoBuf.Annotation> list = annotationList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.Annotation annotation : list) {
                AnnotationDeserializer annotationDeserializer = this.f66023b;
                annotation.getClass();
                arrayList.add(annotationDeserializer.m92127a(annotation, this.f66022a.m92184g()));
            }
            annotationsM92223m = companion.m88640a(arrayList);
        } else {
            annotationsM92223m = null;
        }
        DeclarationDescriptor declarationDescriptorM92182e = this.f66022a.m92182e();
        if (annotationsM92223m == null) {
            annotationsM92223m = m92223m(property, flags, AnnotatedCallableKind.PROPERTY);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField2 = Flags.f65363e;
        Modality modalityM92245b = protoEnumFlags.m92245b(flagField2.mo90875d(flags));
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.f65362d;
        DescriptorVisibility descriptorVisibilityM92248a = ProtoEnumFlagsUtilsKt.m92248a(protoEnumFlags, flagField3.mo90875d(flags));
        Boolean boolMo90875d = Flags.f65340A.mo90875d(flags);
        boolMo90875d.getClass();
        boolean zBooleanValue = boolMo90875d.booleanValue();
        Name nameM92233b = NameResolverUtilKt.m92233b(this.f66022a.m92184g(), property.getName());
        CallableMemberDescriptor.Kind kindM92249b = ProtoEnumFlagsUtilsKt.m92249b(protoEnumFlags, Flags.f65375q.mo90875d(flags));
        Boolean boolMo90875d2 = Flags.f65344E.mo90875d(flags);
        boolMo90875d2.getClass();
        boolean zBooleanValue2 = boolMo90875d2.booleanValue();
        Boolean boolMo90875d3 = Flags.f65343D.mo90875d(flags);
        boolMo90875d3.getClass();
        boolean zBooleanValue3 = boolMo90875d3.booleanValue();
        Annotations annotations = annotationsM92223m;
        Boolean boolMo90875d4 = Flags.f65346G.mo90875d(flags);
        boolMo90875d4.getClass();
        boolean zBooleanValue4 = boolMo90875d4.booleanValue();
        Boolean boolMo90875d5 = Flags.f65347H.mo90875d(flags);
        boolMo90875d5.getClass();
        boolean zBooleanValue5 = boolMo90875d5.booleanValue();
        Boolean boolMo90875d6 = Flags.f65348I.mo90875d(flags);
        boolMo90875d6.getClass();
        int i = flags;
        ProtoEnumFlags protoEnumFlags2 = protoEnumFlags;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptorM92182e, null, annotations, modalityM92245b, descriptorVisibilityM92248a, zBooleanValue, nameM92233b, kindM92249b, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolMo90875d6.booleanValue(), property, this.f66022a.m92184g(), this.f66022a.m92187j(), this.f66022a.m92188k(), this.f66022a.m92181d());
        DeserializationContext deserializationContext = this.f66022a;
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM92178b = DeserializationContext.m92178b(deserializationContext, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean boolMo90875d7 = Flags.f65341B.mo90875d(i);
        boolMo90875d7.getClass();
        boolean zBooleanValue6 = boolMo90875d7.booleanValue();
        Annotations annotationsM92226r = (zBooleanValue6 && ProtoTypeTableUtilKt.m90904h(property)) ? m92226r(property, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.m88641b();
        KotlinType kotlinTypeM92274u2 = deserializationContextM92178b.m92186i().m92274u(ProtoTypeTableUtilKt.m90911o(property, this.f66022a.m92187j()));
        List<TypeParameterDescriptor> listM92269m = deserializationContextM92178b.m92186i().m92269m();
        ReceiverParameterDescriptor receiverParameterDescriptorM92224o = m92224o();
        ProtoBuf.Type typeM90909m = ProtoTypeTableUtilKt.m90909m(property, this.f66022a.m92187j());
        ReceiverParameterDescriptor receiverParameterDescriptorM91737i = (typeM90909m == null || (kotlinTypeM92274u = deserializationContextM92178b.m92186i().m92274u(typeM90909m)) == null) ? null : DescriptorFactory.m91737i(deserializedPropertyDescriptor, kotlinTypeM92274u, annotationsM92226r);
        MemberDeserializer memberDeserializerM92183f = deserializationContextM92178b.m92183f();
        List<ProtoBuf.Type> listM90900d = ProtoTypeTableUtilKt.m90900d(property, this.f66022a.m92187j());
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        deserializedPropertyDescriptor.m88864V0(kotlinTypeM92274u2, listM92269m, receiverParameterDescriptorM92224o, receiverParameterDescriptorM91737i, memberDeserializerM92183f.m92222k(listM90900d, contextParameterList, property, annotatedCallableKind));
        Boolean boolMo90875d8 = Flags.f65361c.mo90875d(i);
        boolMo90875d8.getClass();
        Flags.FlagField<ProtoBuf.Visibility> flagField4 = flagField3;
        int iM90874b = Flags.m90874b(boolMo90875d8.booleanValue(), flagField4.mo90875d(i), flagField2.mo90875d(i), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : iM90874b;
            Boolean boolMo90875d9 = Flags.f65353N.mo90875d(getterFlags);
            boolMo90875d9.getClass();
            boolean zBooleanValue7 = boolMo90875d9.booleanValue();
            Boolean boolMo90875d10 = Flags.f65354O.mo90875d(getterFlags);
            boolMo90875d10.getClass();
            boolean zBooleanValue8 = boolMo90875d10.booleanValue();
            Boolean boolMo90875d11 = Flags.f65355P.mo90875d(getterFlags);
            boolMo90875d11.getClass();
            boolean zBooleanValue9 = boolMo90875d11.booleanValue();
            Annotations annotationsM92223m2 = m92223m(property, getterFlags, annotatedCallableKind);
            if (zBooleanValue7) {
                flagField = flagField2;
                propertyGetterDescriptorImplM91732d = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsM92223m2, protoEnumFlags2.m92245b(flagField2.mo90875d(getterFlags)), ProtoEnumFlagsUtilsKt.m92248a(protoEnumFlags2, flagField4.mo90875d(getterFlags)), !zBooleanValue7, zBooleanValue8, zBooleanValue9, deserializedPropertyDescriptor.getKind(), null, SourceElement.f64063a);
            } else {
                flagField = flagField2;
                propertyGetterDescriptorImplM91732d = DescriptorFactory.m91732d(deserializedPropertyDescriptor, annotationsM92223m2);
                propertyGetterDescriptorImplM91732d.getClass();
            }
            propertyGetterDescriptorImplM91732d.m88891J0(deserializedPropertyDescriptor.getReturnType());
        } else {
            flagField4 = flagField4;
            protoEnumFlags2 = protoEnumFlags2;
            flagField = flagField2;
            propertyGetterDescriptorImplM91732d = null;
        }
        if (Flags.f65342C.mo90875d(i).booleanValue()) {
            if (property.hasSetterFlags()) {
                iM90874b = property.getSetterFlags();
            }
            int i2 = iM90874b;
            Boolean boolMo90875d12 = Flags.f65353N.mo90875d(i2);
            boolMo90875d12.getClass();
            boolean zBooleanValue10 = boolMo90875d12.booleanValue();
            Boolean boolMo90875d13 = Flags.f65354O.mo90875d(i2);
            boolMo90875d13.getClass();
            boolean zBooleanValue11 = boolMo90875d13.booleanValue();
            Boolean boolMo90875d14 = Flags.f65355P.mo90875d(i2);
            boolMo90875d14.getClass();
            boolean zBooleanValue12 = boolMo90875d14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsM92223m3 = m92223m(property, i2, annotatedCallableKind2);
            if (zBooleanValue10) {
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsM92223m3, protoEnumFlags2.m92245b(flagField.mo90875d(i2)), ProtoEnumFlagsUtilsKt.m92248a(protoEnumFlags2, flagField4.mo90875d(i2)), !zBooleanValue10, zBooleanValue11, zBooleanValue12, deserializedPropertyDescriptor.getKind(), null, SourceElement.f64063a);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.m88895K0((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.m92178b(deserializationContextM92178b, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).m92183f().m92220E(CollectionsKt.listOf(property.getSetterValueParameter()), property, annotatedCallableKind2)));
            } else {
                PropertySetterDescriptorImpl propertySetterDescriptorImplM91733e = DescriptorFactory.m91733e(deserializedPropertyDescriptor, annotationsM92223m3, Annotations.Companion.m88641b());
                propertySetterDescriptorImplM91733e.getClass();
                propertySetterDescriptorImpl = propertySetterDescriptorImplM91733e;
            }
        } else {
            propertySetterDescriptorImpl = null;
        }
        if (Flags.f65345F.mo90875d(i).booleanValue()) {
            deserializedPropertyDescriptor.m88938F0(new f8y(this, property, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor declarationDescriptorM92182e2 = this.f66022a.m92182e();
        ClassDescriptor classDescriptor = declarationDescriptorM92182e2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorM92182e2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.m88938F0(new g8y(this, property, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.m88859P0(propertyGetterDescriptorImplM91732d, propertySetterDescriptorImpl, new FieldDescriptorImpl(m92225p(property, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(m92225p(property, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }
}
