package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.zmj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {

    /* JADX INFO: renamed from: E */
    @NotNull
    public final StorageManager f64972E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final TypeAliasDescriptor f64973F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final NullableLazyValue f64974G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public ClassConstructorDescriptor f64975H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ KProperty<Object>[] f64971I = {Reflection.m88403i(new PropertyReference1Impl(TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final TypeAliasConstructorDescriptor m89805b(@NotNull StorageManager storageManager, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull ClassConstructorDescriptor classConstructorDescriptor) {
            ClassConstructorDescriptor classConstructorDescriptorMo89344c;
            List<ReceiverParameterDescriptor> listEmptyList;
            storageManager.getClass();
            typeAliasDescriptor.getClass();
            classConstructorDescriptor.getClass();
            TypeSubstitutor typeSubstitutorM89806c = m89806c(typeAliasDescriptor);
            if (typeSubstitutorM89806c == null || (classConstructorDescriptorMo89344c = classConstructorDescriptor.mo89344c(typeSubstitutorM89806c)) == null) {
                return null;
            }
            Annotations annotations = classConstructorDescriptor.getAnnotations();
            CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
            kind.getClass();
            SourceElement source = typeAliasDescriptor.getSource();
            source.getClass();
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptorMo89344c, null, annotations, kind, source, null);
            List<ValueParameterDescriptor> listM89628H0 = FunctionDescriptorImpl.m89628H0(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.mo89339g(), typeSubstitutorM89806c);
            if (listM89628H0 == null) {
                return null;
            }
            SimpleType simpleTypeM93498c = FlexibleTypesKt.m93498c(classConstructorDescriptorMo89344c.getReturnType().mo93516J0());
            SimpleType simpleTypeMo89349o = typeAliasDescriptor.mo89349o();
            simpleTypeMo89349o.getClass();
            SimpleType simpleTypeM93554j = SpecialTypesKt.m93554j(simpleTypeM93498c, simpleTypeMo89349o);
            ReceiverParameterDescriptor receiverParameterDescriptorMo89335Y = classConstructorDescriptor.mo89335Y();
            ReceiverParameterDescriptor receiverParameterDescriptorM92628i = receiverParameterDescriptorMo89335Y != null ? DescriptorFactory.m92628i(typeAliasConstructorDescriptorImpl, typeSubstitutorM89806c.m93672o(receiverParameterDescriptorMo89335Y.getType(), Variance.INVARIANT), Annotations.Companion.m89532b()) : null;
            ClassDescriptor classDescriptorMo89488j = typeAliasDescriptor.mo89488j();
            if (classDescriptorMo89488j != null) {
                List<ReceiverParameterDescriptor> listMo89341x0 = classConstructorDescriptor.mo89341x0();
                listMo89341x0.getClass();
                List<ReceiverParameterDescriptor> list = listMo89341x0;
                listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                    KotlinType kotlinTypeM93672o = typeSubstitutorM89806c.m93672o(receiverParameterDescriptor.getType(), Variance.INVARIANT);
                    ReceiverValue value = receiverParameterDescriptor.getValue();
                    value.getClass();
                    listEmptyList.add(DescriptorFactory.m92622c(classDescriptorMo89488j, kotlinTypeM93672o, ((ImplicitContextReceiver) value).mo92984a(), Annotations.Companion.m89532b(), i));
                    i = i2;
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            typeAliasConstructorDescriptorImpl.mo89634K0(receiverParameterDescriptorM92628i, null, listEmptyList, typeAliasDescriptor.mo89200p(), listM89628H0, simpleTypeM93554j, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        /* JADX INFO: renamed from: c */
        public final TypeSubstitutor m89806c(TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.mo89488j() == null) {
                return null;
            }
            return TypeSubstitutor.m93663g(typeAliasDescriptor.mo89487V());
        }

        private Companion() {
        }
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, SpecialNames.f66168i, kind, sourceElement);
        this.f64972E = storageManager;
        this.f64973F = typeAliasDescriptor;
        m89638O0(m89802i1().mo89192e0());
        this.f64974G = storageManager.mo93339g(new zmj0(this, classConstructorDescriptor));
        this.f64975H = classConstructorDescriptor;
    }

    /* JADX INFO: renamed from: k1 */
    public static final TypeAliasConstructorDescriptorImpl m89797k1(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        StorageManager storageManager = typeAliasConstructorDescriptorImpl.f64972E;
        TypeAliasDescriptor typeAliasDescriptorM89802i1 = typeAliasConstructorDescriptorImpl.m89802i1();
        Annotations annotations = classConstructorDescriptor.getAnnotations();
        CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
        kind.getClass();
        SourceElement source = typeAliasConstructorDescriptorImpl.m89802i1().getSource();
        source.getClass();
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptorM89802i1, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source);
        TypeSubstitutor typeSubstitutorM89806c = Companion.m89806c(typeAliasConstructorDescriptorImpl.m89802i1());
        if (typeSubstitutorM89806c == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptorMo89335Y = classConstructorDescriptor.mo89335Y();
        ReceiverParameterDescriptor receiverParameterDescriptorMo89344c = receiverParameterDescriptorMo89335Y != null ? receiverParameterDescriptorMo89335Y.mo89344c(typeSubstitutorM89806c) : null;
        List<ReceiverParameterDescriptor> listMo89341x0 = classConstructorDescriptor.mo89341x0();
        listMo89341x0.getClass();
        List<ReceiverParameterDescriptor> list = listMo89341x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReceiverParameterDescriptor) it.next()).mo89344c(typeSubstitutorM89806c));
        }
        typeAliasConstructorDescriptorImpl2.mo89634K0(null, receiverParameterDescriptorMo89344c, arrayList, typeAliasConstructorDescriptorImpl.m89802i1().mo89200p(), typeAliasConstructorDescriptorImpl.mo89339g(), typeAliasConstructorDescriptorImpl.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl.m89802i1().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    @NotNull
    /* JADX INFO: renamed from: B */
    public ClassConstructorDescriptor mo89795B() {
        return this.f64975H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    /* JADX INFO: renamed from: F */
    public ClassDescriptor mo89353F() {
        ClassDescriptor classDescriptorMo89353F = mo89795B().mo89353F();
        classDescriptorMo89353F.getClass();
        return classDescriptorMo89353F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo89343a0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull CallableMemberDescriptor.Kind kind, boolean z) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        FunctionDescriptor functionDescriptorBuild = mo89405k().mo89424r(declarationDescriptor).mo89423q(modality).mo89422p(descriptorVisibility).mo89425s(kind).mo89416j(z).build();
        functionDescriptorBuild.getClass();
        return (TypeAliasConstructorDescriptor) functionDescriptorBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptorImpl mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f64972E, m89802i1(), mo89795B(), this, annotations, kind2, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo89190b() {
        return m89802i1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        returnType.getClass();
        return returnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo89336a() {
        FunctionDescriptor functionDescriptorMo89336a = super.mo89336a();
        functionDescriptorMo89336a.getClass();
        return (TypeAliasConstructorDescriptor) functionDescriptorMo89336a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    /* JADX INFO: renamed from: i0 */
    public boolean mo89354i0() {
        return mo89795B().mo89354i0();
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public TypeAliasDescriptor m89802i1() {
        return this.f64973F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        FunctionDescriptor functionDescriptorMo89344c = super.mo89344c(typeSubstitutor);
        functionDescriptorMo89344c.getClass();
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorMo89344c;
        TypeSubstitutor typeSubstitutorM93663g = TypeSubstitutor.m93663g(typeAliasConstructorDescriptorImpl.getReturnType());
        typeSubstitutorM93663g.getClass();
        ClassConstructorDescriptor classConstructorDescriptorMo89344c = mo89795B().mo89336a().mo89344c(typeSubstitutorM93663g);
        if (classConstructorDescriptorMo89344c == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f64975H = classConstructorDescriptorMo89344c;
        return typeAliasConstructorDescriptorImpl;
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }
}
