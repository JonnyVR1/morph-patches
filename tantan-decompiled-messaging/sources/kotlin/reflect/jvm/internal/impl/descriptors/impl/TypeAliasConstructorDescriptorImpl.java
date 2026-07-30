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
import p149l.vdj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {

    /* JADX INFO: renamed from: E */
    @NotNull
    public final StorageManager f64298E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final TypeAliasDescriptor f64299F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final NullableLazyValue f64300G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public ClassConstructorDescriptor f64301H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ KProperty<Object>[] f64297I = {Reflection.m87514i(new PropertyReference1Impl(TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final TypeAliasConstructorDescriptor m88914b(@NotNull StorageManager storageManager, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull ClassConstructorDescriptor classConstructorDescriptor) {
            ClassConstructorDescriptor classConstructorDescriptorMo88453c;
            List<ReceiverParameterDescriptor> listEmptyList;
            storageManager.getClass();
            typeAliasDescriptor.getClass();
            classConstructorDescriptor.getClass();
            TypeSubstitutor typeSubstitutorM88915c = m88915c(typeAliasDescriptor);
            if (typeSubstitutorM88915c == null || (classConstructorDescriptorMo88453c = classConstructorDescriptor.mo88453c(typeSubstitutorM88915c)) == null) {
                return null;
            }
            Annotations annotations = classConstructorDescriptor.getAnnotations();
            CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
            kind.getClass();
            SourceElement source = typeAliasDescriptor.getSource();
            source.getClass();
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptorMo88453c, null, annotations, kind, source, null);
            List<ValueParameterDescriptor> listM88737H0 = FunctionDescriptorImpl.m88737H0(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.mo88448g(), typeSubstitutorM88915c);
            if (listM88737H0 == null) {
                return null;
            }
            SimpleType simpleTypeM92607c = FlexibleTypesKt.m92607c(classConstructorDescriptorMo88453c.getReturnType().mo92625J0());
            SimpleType simpleTypeMo88458o = typeAliasDescriptor.mo88458o();
            simpleTypeMo88458o.getClass();
            SimpleType simpleTypeM92663j = SpecialTypesKt.m92663j(simpleTypeM92607c, simpleTypeMo88458o);
            ReceiverParameterDescriptor receiverParameterDescriptorMo88444Y = classConstructorDescriptor.mo88444Y();
            ReceiverParameterDescriptor receiverParameterDescriptorM91737i = receiverParameterDescriptorMo88444Y != null ? DescriptorFactory.m91737i(typeAliasConstructorDescriptorImpl, typeSubstitutorM88915c.m92781o(receiverParameterDescriptorMo88444Y.getType(), Variance.INVARIANT), Annotations.Companion.m88641b()) : null;
            ClassDescriptor classDescriptorMo88597j = typeAliasDescriptor.mo88597j();
            if (classDescriptorMo88597j != null) {
                List<ReceiverParameterDescriptor> listMo88450x0 = classConstructorDescriptor.mo88450x0();
                listMo88450x0.getClass();
                List<ReceiverParameterDescriptor> list = listMo88450x0;
                listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                    KotlinType kotlinTypeM92781o = typeSubstitutorM88915c.m92781o(receiverParameterDescriptor.getType(), Variance.INVARIANT);
                    ReceiverValue value = receiverParameterDescriptor.getValue();
                    value.getClass();
                    listEmptyList.add(DescriptorFactory.m91731c(classDescriptorMo88597j, kotlinTypeM92781o, ((ImplicitContextReceiver) value).mo92093a(), Annotations.Companion.m88641b(), i));
                    i = i2;
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            typeAliasConstructorDescriptorImpl.mo88743K0(receiverParameterDescriptorM91737i, null, listEmptyList, typeAliasDescriptor.mo88309p(), listM88737H0, simpleTypeM92663j, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        /* JADX INFO: renamed from: c */
        public final TypeSubstitutor m88915c(TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.mo88597j() == null) {
                return null;
            }
            return TypeSubstitutor.m92772g(typeAliasDescriptor.mo88596V());
        }

        private Companion() {
        }
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, SpecialNames.f65494i, kind, sourceElement);
        this.f64298E = storageManager;
        this.f64299F = typeAliasDescriptor;
        m88747O0(m88911i1().mo88301e0());
        this.f64300G = storageManager.mo92448g(new vdj0(this, classConstructorDescriptor));
        this.f64301H = classConstructorDescriptor;
    }

    /* JADX INFO: renamed from: k1 */
    public static final TypeAliasConstructorDescriptorImpl m88906k1(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        StorageManager storageManager = typeAliasConstructorDescriptorImpl.f64298E;
        TypeAliasDescriptor typeAliasDescriptorM88911i1 = typeAliasConstructorDescriptorImpl.m88911i1();
        Annotations annotations = classConstructorDescriptor.getAnnotations();
        CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
        kind.getClass();
        SourceElement source = typeAliasConstructorDescriptorImpl.m88911i1().getSource();
        source.getClass();
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptorM88911i1, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source);
        TypeSubstitutor typeSubstitutorM88915c = Companion.m88915c(typeAliasConstructorDescriptorImpl.m88911i1());
        if (typeSubstitutorM88915c == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptorMo88444Y = classConstructorDescriptor.mo88444Y();
        ReceiverParameterDescriptor receiverParameterDescriptorMo88453c = receiverParameterDescriptorMo88444Y != null ? receiverParameterDescriptorMo88444Y.mo88453c(typeSubstitutorM88915c) : null;
        List<ReceiverParameterDescriptor> listMo88450x0 = classConstructorDescriptor.mo88450x0();
        listMo88450x0.getClass();
        List<ReceiverParameterDescriptor> list = listMo88450x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReceiverParameterDescriptor) it.next()).mo88453c(typeSubstitutorM88915c));
        }
        typeAliasConstructorDescriptorImpl2.mo88743K0(null, receiverParameterDescriptorMo88453c, arrayList, typeAliasConstructorDescriptorImpl.m88911i1().mo88309p(), typeAliasConstructorDescriptorImpl.mo88448g(), typeAliasConstructorDescriptorImpl.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl.m88911i1().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    @NotNull
    /* JADX INFO: renamed from: B */
    public ClassConstructorDescriptor mo88904B() {
        return this.f64301H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    /* JADX INFO: renamed from: F */
    public ClassDescriptor mo88462F() {
        ClassDescriptor classDescriptorMo88462F = mo88904B().mo88462F();
        classDescriptorMo88462F.getClass();
        return classDescriptorMo88462F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo88452a0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @NotNull CallableMemberDescriptor.Kind kind, boolean z) {
        declarationDescriptor.getClass();
        modality.getClass();
        descriptorVisibility.getClass();
        kind.getClass();
        FunctionDescriptor functionDescriptorBuild = mo88514k().mo88533r(declarationDescriptor).mo88532q(modality).mo88531p(descriptorVisibility).mo88534s(kind).mo88525j(z).build();
        functionDescriptorBuild.getClass();
        return (TypeAliasConstructorDescriptor) functionDescriptorBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptorImpl mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f64298E, m88911i1(), mo88904B(), this, annotations, kind2, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor mo88299b() {
        return m88911i1();
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
    public TypeAliasConstructorDescriptor mo88445a() {
        FunctionDescriptor functionDescriptorMo88445a = super.mo88445a();
        functionDescriptorMo88445a.getClass();
        return (TypeAliasConstructorDescriptor) functionDescriptorMo88445a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    /* JADX INFO: renamed from: i0 */
    public boolean mo88463i0() {
        return mo88904B().mo88463i0();
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public TypeAliasDescriptor m88911i1() {
        return this.f64299F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        FunctionDescriptor functionDescriptorMo88453c = super.mo88453c(typeSubstitutor);
        functionDescriptorMo88453c.getClass();
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorMo88453c;
        TypeSubstitutor typeSubstitutorM92772g = TypeSubstitutor.m92772g(typeAliasConstructorDescriptorImpl.getReturnType());
        typeSubstitutorM92772g.getClass();
        ClassConstructorDescriptor classConstructorDescriptorMo88453c = mo88904B().mo88445a().mo88453c(typeSubstitutorM92772g);
        if (classConstructorDescriptorMo88453c == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f64301H = classConstructorDescriptorMo88453c;
        return typeAliasConstructorDescriptorImpl;
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }
}
