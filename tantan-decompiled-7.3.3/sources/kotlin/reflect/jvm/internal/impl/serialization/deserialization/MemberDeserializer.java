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
import p153l.chy;
import p153l.dhy;
import p153l.ehy;
import p153l.fhy;
import p153l.ghy;
import p153l.hhy;
import p153l.ihy;
import p153l.jhy;
import p153l.khy;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationContext f66696a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AnnotationDeserializer f66697b;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        deserializationContext.getClass();
        this.f66696a = deserializationContext;
        this.f66697b = new AnnotationDeserializer(deserializationContext.m93071c().m93056q(), deserializationContext.m93071c().m93057r());
    }

    /* JADX INFO: renamed from: A */
    public static final ConstantValue m93091A(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerM93112j = memberDeserializer.m93112j(memberDeserializer.f66696a.m93073e());
        protoContainerM93112j.getClass();
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderM93043d = memberDeserializer.f66696a.m93071c().m93043d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoaderM93043d.mo91023e(protoContainerM93112j, property, returnType);
    }

    /* JADX INFO: renamed from: B */
    public static final NullableLazyValue m93092B(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f66696a.m93076h().mo93339g(new khy(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: renamed from: C */
    public static final ConstantValue m93093C(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerM93112j = memberDeserializer.m93112j(memberDeserializer.f66696a.m93073e());
        protoContainerM93112j.getClass();
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderM93043d = memberDeserializer.f66696a.m93071c().m93043d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        returnType.getClass();
        return annotationAndConstantLoaderM93043d.mo91024k(protoContainerM93112j, property, returnType);
    }

    /* JADX INFO: renamed from: F */
    public static final List m93094F(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f66696a.m93071c().m93043d().mo91036a(protoContainer, messageLite, annotatedCallableKind, i, valueParameter));
    }

    /* JADX INFO: renamed from: l */
    public static final List m93104l(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f66696a.m93071c().m93043d().mo91042h(protoContainer, messageLite, annotatedCallableKind, i, valueParameter));
    }

    /* JADX INFO: renamed from: n */
    public static final List m93105n(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerM93112j = memberDeserializer.m93112j(memberDeserializer.f66696a.m93073e());
        List list = protoContainerM93112j != null ? CollectionsKt.toList(memberDeserializer.f66696a.m93071c().m93043d().mo91044j(protoContainerM93112j, messageLite, annotatedCallableKind)) : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: q */
    public static final List m93106q(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        List list;
        ProtoContainer protoContainerM93112j = memberDeserializer.m93112j(memberDeserializer.f66696a.m93073e());
        if (protoContainerM93112j != null) {
            DeserializationContext deserializationContext = memberDeserializer.f66696a;
            list = z ? CollectionsKt.toList(deserializationContext.m93071c().m93043d().mo91046m(protoContainerM93112j, property)) : CollectionsKt.toList(deserializationContext.m93071c().m93043d().mo91040f(protoContainerM93112j, property));
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: s */
    public static final List m93107s(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerM93112j = memberDeserializer.m93112j(memberDeserializer.f66696a.m93073e());
        List<AnnotationDescriptor> listMo91041g = protoContainerM93112j != null ? memberDeserializer.f66696a.m93071c().m93043d().mo91041g(protoContainerM93112j, messageLite, annotatedCallableKind) : null;
        return listMo91041g == null ? CollectionsKt.emptyList() : listMo91041g;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ PropertyDescriptor m93108y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return memberDeserializer.m93122x(property, z);
    }

    /* JADX INFO: renamed from: z */
    public static final NullableLazyValue m93109z(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f66696a.m93076h().mo93339g(new jhy(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final TypeAliasDescriptor m93110D(@NotNull ProtoBuf.TypeAlias typeAlias) {
        typeAlias.getClass();
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.f66697b;
            annotation.getClass();
            arrayList.add(annotationDeserializer.m93018a(annotation, this.f66696a.m93075g()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f66696a.m93076h(), this.f66696a.m93073e(), companion.m89531a(arrayList), NameResolverUtilKt.m93124b(this.f66696a.m93075g(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.m93139a(ProtoEnumFlags.INSTANCE, Flags.f66036d.mo91766d(typeAlias.getFlags())), typeAlias, this.f66696a.m93075g(), this.f66696a.m93078j(), this.f66696a.m93079k(), this.f66696a.m93072d());
        DeserializationContext deserializationContext = this.f66696a;
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM93069b = DeserializationContext.m93069b(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.m93320P0(deserializationContextM93069b.m93077i().m93160m(), deserializationContextM93069b.m93077i().m93162o(ProtoTypeTableUtilKt.m91806s(typeAlias, this.f66696a.m93078j()), false), deserializationContextM93069b.m93077i().m93162o(ProtoTypeTableUtilKt.m91792e(typeAlias, this.f66696a.m93078j()), false));
        return deserializedTypeAliasDescriptor;
    }

    /* JADX INFO: renamed from: E */
    public final List<ValueParameterDescriptor> m93111E(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer;
        Annotations annotationsM89532b;
        MemberDeserializer memberDeserializer2 = this;
        DeclarationDescriptor declarationDescriptorM93073e = memberDeserializer2.f66696a.m93073e();
        declarationDescriptorM93073e.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptorM93073e;
        DeclarationDescriptor declarationDescriptorMo89190b = callableDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        ProtoContainer protoContainerM93112j = memberDeserializer2.m93112j(declarationDescriptorMo89190b);
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
            if (protoContainerM93112j == null || !Flags.f66035c.mo91766d(flags).booleanValue()) {
                memberDeserializer = memberDeserializer2;
                annotationsM89532b = Annotations.Companion.m89532b();
            } else {
                int i3 = i;
                memberDeserializer = memberDeserializer2;
                i = i3;
                annotationsM89532b = new NonEmptyDeserializedAnnotations(memberDeserializer2.f66696a.m93076h(), new hhy(memberDeserializer2, protoContainerM93112j, messageLite, annotatedCallableKind, i3, valueParameter));
            }
            Annotations annotations = annotationsM89532b;
            Name nameM93124b = NameResolverUtilKt.m93124b(memberDeserializer.f66696a.m93075g(), valueParameter.getName());
            KotlinType kotlinTypeM93165u = memberDeserializer.f66696a.m93077i().m93165u(ProtoTypeTableUtilKt.m91805r(valueParameter, memberDeserializer.f66696a.m93078j()));
            Boolean boolMo91766d = Flags.f66024K.mo91766d(flags);
            boolMo91766d.getClass();
            boolean zBooleanValue = boolMo91766d.booleanValue();
            Boolean boolMo91766d2 = Flags.f66025L.mo91766d(flags);
            boolMo91766d2.getClass();
            boolean zBooleanValue2 = boolMo91766d2.booleanValue();
            Boolean boolMo91766d3 = Flags.f66026M.mo91766d(flags);
            boolMo91766d3.getClass();
            boolean zBooleanValue3 = boolMo91766d3.booleanValue();
            ProtoBuf.Type typeM91808u = ProtoTypeTableUtilKt.m91808u(valueParameter, memberDeserializer.f66696a.m93078j());
            KotlinType kotlinTypeM93165u2 = typeM91808u != null ? memberDeserializer.f66696a.m93077i().m93165u(typeM91808u) : null;
            SourceElement sourceElement = SourceElement.f64737a;
            sourceElement.getClass();
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i, annotations, nameM93124b, kotlinTypeM93165u, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeM93165u2, sourceElement));
            memberDeserializer2 = memberDeserializer;
            callableDescriptor = callableDescriptor2;
            i = i2;
            protoContainerM93112j = protoContainerM93112j;
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public final ProtoContainer m93112j(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).mo89453d(), this.f66696a.m93075g(), this.f66696a.m93078j(), this.f66696a.m93072d());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).m93211b1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final List<ReceiverParameterDescriptor> m93113k(List<ProtoBuf.Type> list, List<ProtoBuf.ValueParameter> list2, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor declarationDescriptorM93073e = this.f66696a.m93073e();
        declarationDescriptorM93073e.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptorM93073e;
        DeclarationDescriptor declarationDescriptorMo89190b = callableDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        ProtoContainer protoContainerM93112j = m93112j(declarationDescriptorMo89190b);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProtoBuf.Type type = (ProtoBuf.Type) obj;
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) CollectionsKt.getOrNull(list2, i);
            ReceiverParameterDescriptor receiverParameterDescriptorM92621b = DescriptorFactory.m92621b(callableDescriptor, this.f66696a.m93077i().m93165u(type), null, (protoContainerM93112j == null || !Flags.f66035c.mo91766d((valueParameter == null || !valueParameter.hasFlags()) ? 0 : valueParameter.getFlags()).booleanValue()) ? Annotations.Companion.m89532b() : new NonEmptyDeserializedAnnotations(this.f66696a.m93076h(), new ihy(this, protoContainerM93112j, messageLite, annotatedCallableKind, i, valueParameter)), i);
            if (receiverParameterDescriptorM92621b != null) {
                arrayList.add(receiverParameterDescriptorM92621b);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final Annotations m93114m(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f66035c.mo91766d(i).booleanValue() ? Annotations.Companion.m89532b() : new NonEmptyDeserializedAnnotations(this.f66696a.m93076h(), new ehy(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: renamed from: o */
    public final ReceiverParameterDescriptor m93115o() {
        DeclarationDescriptor declarationDescriptorM93073e = this.f66696a.m93073e();
        ClassDescriptor classDescriptor = declarationDescriptorM93073e instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorM93073e : null;
        if (classDescriptor != null) {
            return classDescriptor.mo89347R();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Annotations m93116p(ProtoBuf.Property property, boolean z) {
        return !Flags.f66035c.mo91766d(property.getFlags()).booleanValue() ? Annotations.Companion.m89532b() : new NonEmptyDeserializedAnnotations(this.f66696a.m93076h(), new fhy(this, z, property));
    }

    /* JADX INFO: renamed from: r */
    public final Annotations m93117r(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f66696a.m93076h(), new ghy(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: renamed from: t */
    public final void m93118t(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.mo89793h1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ClassConstructorDescriptor m93119u(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        constructor.getClass();
        DeclarationDescriptor declarationDescriptorM93073e = this.f66696a.m93073e();
        declarationDescriptorM93073e.getClass();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorM93073e;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, m93114m(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.f66696a.m93075g(), this.f66696a.m93078j(), this.f66696a.m93079k(), this.f66696a.m93072d(), null, 1024, null);
        MemberDeserializer memberDeserializerM93074f = DeserializationContext.m93069b(this.f66696a, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).m93074f();
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        deserializedClassConstructorDescriptor.m89592j1(memberDeserializerM93074f.m93111E(valueParameterList, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.m93139a(ProtoEnumFlags.INSTANCE, Flags.f66036d.mo91766d(constructor.getFlags())));
        deserializedClassConstructorDescriptor.m89648Z0(classDescriptor.mo89349o());
        deserializedClassConstructorDescriptor.m89639P0(classDescriptor.mo89198n0());
        deserializedClassConstructorDescriptor.mo89641R0(!Flags.f66047o.mo91766d(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final SimpleFunctionDescriptor m93120v(@NotNull ProtoBuf.Function function) {
        KotlinType kotlinTypeM93165u;
        function.getClass();
        int flags = function.hasFlags() ? function.getFlags() : m93121w(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsM93114m = m93114m(function, flags, annotatedCallableKind);
        Annotations annotationsM93117r = ProtoTypeTableUtilKt.m91794g(function) ? m93117r(function, annotatedCallableKind) : Annotations.Companion.m89532b();
        VersionRequirementTable versionRequirementTableM91824b = Intrinsics.m88377d(DescriptorUtilsKt.m92873o(this.f66696a.m93073e()).m91938b(NameResolverUtilKt.m93124b(this.f66696a.m93075g(), function.getName())), SuspendFunctionTypeUtilKt.f66723a) ? VersionRequirementTable.Companion.m91824b() : this.f66696a.m93079k();
        DeclarationDescriptor declarationDescriptorM93073e = this.f66696a.m93073e();
        Name nameM93124b = NameResolverUtilKt.m93124b(this.f66696a.m93075g(), function.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Annotations annotations = annotationsM93117r;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(declarationDescriptorM93073e, null, annotationsM93114m, nameM93124b, ProtoEnumFlagsUtilsKt.m93140b(protoEnumFlags, Flags.f66049q.mo91766d(flags)), function, this.f66696a.m93075g(), this.f66696a.m93078j(), versionRequirementTableM91824b, this.f66696a.m93072d(), null, 1024, null);
        DeserializationContext deserializationContext = this.f66696a;
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM93069b = DeserializationContext.m93069b(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeM91799l = ProtoTypeTableUtilKt.m91799l(function, this.f66696a.m93078j());
        ReceiverParameterDescriptor receiverParameterDescriptorM92628i = (typeM91799l == null || (kotlinTypeM93165u = deserializationContextM93069b.m93077i().m93165u(typeM91799l)) == null) ? null : DescriptorFactory.m92628i(deserializedSimpleFunctionDescriptor, kotlinTypeM93165u, annotations);
        ReceiverParameterDescriptor receiverParameterDescriptorM93115o = m93115o();
        MemberDeserializer memberDeserializerM93074f = deserializationContextM93069b.m93074f();
        List<ProtoBuf.Type> listM91790c = ProtoTypeTableUtilKt.m91790c(function, this.f66696a.m93078j());
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        List<ReceiverParameterDescriptor> listM93113k = memberDeserializerM93074f.m93113k(listM91790c, contextParameterList, function, annotatedCallableKind);
        List<TypeParameterDescriptor> listM93160m = deserializationContextM93069b.m93077i().m93160m();
        MemberDeserializer memberDeserializerM93074f2 = deserializationContextM93069b.m93074f();
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        m93118t(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorM92628i, receiverParameterDescriptorM93115o, listM93113k, listM93160m, memberDeserializerM93074f2.m93111E(valueParameterList, function, annotatedCallableKind), deserializationContextM93069b.m93077i().m93165u(ProtoTypeTableUtilKt.m91801n(function, this.f66696a.m93078j())), protoEnumFlags.m93136b(Flags.f66037e.mo91766d(flags)), ProtoEnumFlagsUtilsKt.m93139a(protoEnumFlags, Flags.f66036d.mo91766d(flags)), MapsKt.emptyMap());
        Boolean boolMo91766d = Flags.f66050r.mo91766d(flags);
        boolMo91766d.getClass();
        deserializedSimpleFunctionDescriptor.m89647Y0(boolMo91766d.booleanValue());
        Boolean boolMo91766d2 = Flags.f66051s.mo91766d(flags);
        boolMo91766d2.getClass();
        deserializedSimpleFunctionDescriptor.m89645V0(boolMo91766d2.booleanValue());
        Boolean boolMo91766d3 = Flags.f66054v.mo91766d(flags);
        boolMo91766d3.getClass();
        deserializedSimpleFunctionDescriptor.m89640Q0(boolMo91766d3.booleanValue());
        Boolean boolMo91766d4 = Flags.f66052t.mo91766d(flags);
        boolMo91766d4.getClass();
        deserializedSimpleFunctionDescriptor.m89646X0(boolMo91766d4.booleanValue());
        Boolean boolMo91766d5 = Flags.f66053u.mo91766d(flags);
        boolMo91766d5.getClass();
        deserializedSimpleFunctionDescriptor.m89650b1(boolMo91766d5.booleanValue());
        Boolean boolMo91766d6 = Flags.f66055w.mo91766d(flags);
        boolMo91766d6.getClass();
        deserializedSimpleFunctionDescriptor.m89649a1(boolMo91766d6.booleanValue());
        Boolean boolMo91766d7 = Flags.f66056x.mo91766d(flags);
        boolMo91766d7.getClass();
        deserializedSimpleFunctionDescriptor.m89639P0(boolMo91766d7.booleanValue());
        deserializedSimpleFunctionDescriptor.mo89641R0(!Flags.f66057y.mo91766d(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairMo93038a = this.f66696a.m93071c().m93047h().mo93038a(function, deserializedSimpleFunctionDescriptor, this.f66696a.m93078j(), deserializationContextM93069b.m93077i());
        if (pairMo93038a != null) {
            deserializedSimpleFunctionDescriptor.m89637N0(pairMo93038a.getFirst(), pairMo93038a.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX INFO: renamed from: w */
    public final int m93121w(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final PropertyDescriptor m93122x(@NotNull ProtoBuf.Property property, boolean z) {
        Annotations annotationsM93114m;
        Flags.FlagField<ProtoBuf.Modality> flagField;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplM92623d;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeM93165u;
        property.getClass();
        int flags = property.hasFlags() ? property.getFlags() : m93121w(property.getOldFlags());
        if (z) {
            Annotations.Companion companion = Annotations.Companion;
            List<ProtoBuf.Annotation> annotationList = property.getAnnotationList();
            annotationList.getClass();
            List<ProtoBuf.Annotation> list = annotationList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.Annotation annotation : list) {
                AnnotationDeserializer annotationDeserializer = this.f66697b;
                annotation.getClass();
                arrayList.add(annotationDeserializer.m93018a(annotation, this.f66696a.m93075g()));
            }
            annotationsM93114m = companion.m89531a(arrayList);
        } else {
            annotationsM93114m = null;
        }
        DeclarationDescriptor declarationDescriptorM93073e = this.f66696a.m93073e();
        if (annotationsM93114m == null) {
            annotationsM93114m = m93114m(property, flags, AnnotatedCallableKind.PROPERTY);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField2 = Flags.f66037e;
        Modality modalityM93136b = protoEnumFlags.m93136b(flagField2.mo91766d(flags));
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.f66036d;
        DescriptorVisibility descriptorVisibilityM93139a = ProtoEnumFlagsUtilsKt.m93139a(protoEnumFlags, flagField3.mo91766d(flags));
        Boolean boolMo91766d = Flags.f66014A.mo91766d(flags);
        boolMo91766d.getClass();
        boolean zBooleanValue = boolMo91766d.booleanValue();
        Name nameM93124b = NameResolverUtilKt.m93124b(this.f66696a.m93075g(), property.getName());
        CallableMemberDescriptor.Kind kindM93140b = ProtoEnumFlagsUtilsKt.m93140b(protoEnumFlags, Flags.f66049q.mo91766d(flags));
        Boolean boolMo91766d2 = Flags.f66018E.mo91766d(flags);
        boolMo91766d2.getClass();
        boolean zBooleanValue2 = boolMo91766d2.booleanValue();
        Boolean boolMo91766d3 = Flags.f66017D.mo91766d(flags);
        boolMo91766d3.getClass();
        boolean zBooleanValue3 = boolMo91766d3.booleanValue();
        Annotations annotations = annotationsM93114m;
        Boolean boolMo91766d4 = Flags.f66020G.mo91766d(flags);
        boolMo91766d4.getClass();
        boolean zBooleanValue4 = boolMo91766d4.booleanValue();
        Boolean boolMo91766d5 = Flags.f66021H.mo91766d(flags);
        boolMo91766d5.getClass();
        boolean zBooleanValue5 = boolMo91766d5.booleanValue();
        Boolean boolMo91766d6 = Flags.f66022I.mo91766d(flags);
        boolMo91766d6.getClass();
        int i = flags;
        ProtoEnumFlags protoEnumFlags2 = protoEnumFlags;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptorM93073e, null, annotations, modalityM93136b, descriptorVisibilityM93139a, zBooleanValue, nameM93124b, kindM93140b, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolMo91766d6.booleanValue(), property, this.f66696a.m93075g(), this.f66696a.m93078j(), this.f66696a.m93079k(), this.f66696a.m93072d());
        DeserializationContext deserializationContext = this.f66696a;
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextM93069b = DeserializationContext.m93069b(deserializationContext, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean boolMo91766d7 = Flags.f66015B.mo91766d(i);
        boolMo91766d7.getClass();
        boolean zBooleanValue6 = boolMo91766d7.booleanValue();
        Annotations annotationsM93117r = (zBooleanValue6 && ProtoTypeTableUtilKt.m91795h(property)) ? m93117r(property, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.m89532b();
        KotlinType kotlinTypeM93165u2 = deserializationContextM93069b.m93077i().m93165u(ProtoTypeTableUtilKt.m91802o(property, this.f66696a.m93078j()));
        List<TypeParameterDescriptor> listM93160m = deserializationContextM93069b.m93077i().m93160m();
        ReceiverParameterDescriptor receiverParameterDescriptorM93115o = m93115o();
        ProtoBuf.Type typeM91800m = ProtoTypeTableUtilKt.m91800m(property, this.f66696a.m93078j());
        ReceiverParameterDescriptor receiverParameterDescriptorM92628i = (typeM91800m == null || (kotlinTypeM93165u = deserializationContextM93069b.m93077i().m93165u(typeM91800m)) == null) ? null : DescriptorFactory.m92628i(deserializedPropertyDescriptor, kotlinTypeM93165u, annotationsM93117r);
        MemberDeserializer memberDeserializerM93074f = deserializationContextM93069b.m93074f();
        List<ProtoBuf.Type> listM91791d = ProtoTypeTableUtilKt.m91791d(property, this.f66696a.m93078j());
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        deserializedPropertyDescriptor.m89755V0(kotlinTypeM93165u2, listM93160m, receiverParameterDescriptorM93115o, receiverParameterDescriptorM92628i, memberDeserializerM93074f.m93113k(listM91791d, contextParameterList, property, annotatedCallableKind));
        Boolean boolMo91766d8 = Flags.f66035c.mo91766d(i);
        boolMo91766d8.getClass();
        Flags.FlagField<ProtoBuf.Visibility> flagField4 = flagField3;
        int iM91765b = Flags.m91765b(boolMo91766d8.booleanValue(), flagField4.mo91766d(i), flagField2.mo91766d(i), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : iM91765b;
            Boolean boolMo91766d9 = Flags.f66027N.mo91766d(getterFlags);
            boolMo91766d9.getClass();
            boolean zBooleanValue7 = boolMo91766d9.booleanValue();
            Boolean boolMo91766d10 = Flags.f66028O.mo91766d(getterFlags);
            boolMo91766d10.getClass();
            boolean zBooleanValue8 = boolMo91766d10.booleanValue();
            Boolean boolMo91766d11 = Flags.f66029P.mo91766d(getterFlags);
            boolMo91766d11.getClass();
            boolean zBooleanValue9 = boolMo91766d11.booleanValue();
            Annotations annotationsM93114m2 = m93114m(property, getterFlags, annotatedCallableKind);
            if (zBooleanValue7) {
                flagField = flagField2;
                propertyGetterDescriptorImplM92623d = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsM93114m2, protoEnumFlags2.m93136b(flagField2.mo91766d(getterFlags)), ProtoEnumFlagsUtilsKt.m93139a(protoEnumFlags2, flagField4.mo91766d(getterFlags)), !zBooleanValue7, zBooleanValue8, zBooleanValue9, deserializedPropertyDescriptor.getKind(), null, SourceElement.f64737a);
            } else {
                flagField = flagField2;
                propertyGetterDescriptorImplM92623d = DescriptorFactory.m92623d(deserializedPropertyDescriptor, annotationsM93114m2);
                propertyGetterDescriptorImplM92623d.getClass();
            }
            propertyGetterDescriptorImplM92623d.m89782J0(deserializedPropertyDescriptor.getReturnType());
        } else {
            flagField4 = flagField4;
            protoEnumFlags2 = protoEnumFlags2;
            flagField = flagField2;
            propertyGetterDescriptorImplM92623d = null;
        }
        if (Flags.f66016C.mo91766d(i).booleanValue()) {
            if (property.hasSetterFlags()) {
                iM91765b = property.getSetterFlags();
            }
            int i2 = iM91765b;
            Boolean boolMo91766d12 = Flags.f66027N.mo91766d(i2);
            boolMo91766d12.getClass();
            boolean zBooleanValue10 = boolMo91766d12.booleanValue();
            Boolean boolMo91766d13 = Flags.f66028O.mo91766d(i2);
            boolMo91766d13.getClass();
            boolean zBooleanValue11 = boolMo91766d13.booleanValue();
            Boolean boolMo91766d14 = Flags.f66029P.mo91766d(i2);
            boolMo91766d14.getClass();
            boolean zBooleanValue12 = boolMo91766d14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsM93114m3 = m93114m(property, i2, annotatedCallableKind2);
            if (zBooleanValue10) {
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsM93114m3, protoEnumFlags2.m93136b(flagField.mo91766d(i2)), ProtoEnumFlagsUtilsKt.m93139a(protoEnumFlags2, flagField4.mo91766d(i2)), !zBooleanValue10, zBooleanValue11, zBooleanValue12, deserializedPropertyDescriptor.getKind(), null, SourceElement.f64737a);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.m89786K0((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.m93069b(deserializationContextM93069b, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).m93074f().m93111E(CollectionsKt.listOf(property.getSetterValueParameter()), property, annotatedCallableKind2)));
            } else {
                PropertySetterDescriptorImpl propertySetterDescriptorImplM92624e = DescriptorFactory.m92624e(deserializedPropertyDescriptor, annotationsM93114m3, Annotations.Companion.m89532b());
                propertySetterDescriptorImplM92624e.getClass();
                propertySetterDescriptorImpl = propertySetterDescriptorImplM92624e;
            }
        } else {
            propertySetterDescriptorImpl = null;
        }
        if (Flags.f66019F.mo91766d(i).booleanValue()) {
            deserializedPropertyDescriptor.m89829F0(new chy(this, property, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor declarationDescriptorM93073e2 = this.f66696a.m93073e();
        ClassDescriptor classDescriptor = declarationDescriptorM93073e2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorM93073e2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.m89829F0(new dhy(this, property, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.m89750P0(propertyGetterDescriptorImplM92623d, propertySetterDescriptorImpl, new FieldDescriptorImpl(m93116p(property, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(m93116p(property, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }
}
