package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final Factory f64628E = new Factory(null);

    @SourceDebugExtension
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionInvokeDescriptor m89216a(@NotNull FunctionClassDescriptor functionClassDescriptor, boolean z) {
            functionClassDescriptor.getClass();
            List<TypeParameterDescriptor> listMo89200p = functionClassDescriptor.mo89200p();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor receiverParameterDescriptorMo89347R = functionClassDescriptor.mo89347R();
            List<ReceiverParameterDescriptor> listEmptyList = CollectionsKt.emptyList();
            List<? extends TypeParameterDescriptor> listEmptyList2 = CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo89200p) {
                if (((TypeParameterDescriptor) obj).mo89492h() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
            for (IndexedValue indexedValue : iterableWithIndex) {
                arrayList2.add(FunctionInvokeDescriptor.f64628E.m89217b(functionInvokeDescriptor, indexedValue.getIndex(), (TypeParameterDescriptor) indexedValue.getValue()));
            }
            functionInvokeDescriptor.mo89634K0(null, receiverParameterDescriptorMo89347R, listEmptyList, listEmptyList2, arrayList2, ((TypeParameterDescriptor) CollectionsKt.last((List) listMo89200p)).mo89349o(), Modality.ABSTRACT, DescriptorVisibilities.f64700e);
            functionInvokeDescriptor.mo89642S0(true);
            return functionInvokeDescriptor;
        }

        /* JADX INFO: renamed from: b */
        public final ValueParameterDescriptor m89217b(FunctionInvokeDescriptor functionInvokeDescriptor, int i, TypeParameterDescriptor typeParameterDescriptor) {
            String lowerCase;
            String strM91973b = typeParameterDescriptor.getName().m91973b();
            strM91973b.getClass();
            if (Intrinsics.m88377d(strM91973b, p7f.GPS_DIRECTION_TRUE)) {
                lowerCase = "instance";
            } else if (Intrinsics.m88377d(strM91973b, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM91973b.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            Annotations annotationsM89532b = Annotations.Companion.m89532b();
            Name nameM91970i = Name.m91970i(lowerCase);
            nameM91970i.getClass();
            SimpleType simpleTypeMo89349o = typeParameterDescriptor.mo89349o();
            simpleTypeMo89349o.getClass();
            SourceElement sourceElement = SourceElement.f64737a;
            sourceElement.getClass();
            return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, annotationsM89532b, nameM91970i, simpleTypeMo89349o, false, false, false, null, sourceElement);
        }

        private Factory() {
        }
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.m89532b(), OperatorNameConventions.f67082h, kind, SourceElement.f64737a);
        m89647Y0(true);
        m89649a1(z);
        mo89641R0(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public FunctionDescriptorImpl mo89212E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        return new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    /* JADX INFO: renamed from: F0 */
    public FunctionDescriptor mo89213F0(@NotNull FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        copyConfiguration.getClass();
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.mo89213F0(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> listMo89339g = functionInvokeDescriptor.mo89339g();
        listMo89339g.getClass();
        List<ValueParameterDescriptor> list = listMo89339g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            type.getClass();
            if (FunctionTypesKt.m89038d(type) != null) {
                List<ValueParameterDescriptor> listMo89339g2 = functionInvokeDescriptor.mo89339g();
                listMo89339g2.getClass();
                List<ValueParameterDescriptor> list2 = listMo89339g2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(FunctionTypesKt.m89038d(type2));
                }
                return functionInvokeDescriptor.m89214i1(arrayList);
            }
        }
        return functionInvokeDescriptor;
    }

    /* JADX INFO: renamed from: i1 */
    public final FunctionDescriptor m89214i1(List<Name> list) {
        Name name;
        int size = mo89339g().size() - list.size();
        boolean z = true;
        if (size == 0) {
            List<ValueParameterDescriptor> listMo89339g = mo89339g();
            listMo89339g.getClass();
            List<Pair> listZip = CollectionsKt.zip(list, listMo89339g);
            if ((listZip instanceof Collection) && listZip.isEmpty()) {
                return this;
            }
            for (Pair pair : listZip) {
                if (!Intrinsics.m88377d((Name) pair.component1(), ((ValueParameterDescriptor) pair.component2()).getName())) {
                }
            }
            return this;
        }
        List<ValueParameterDescriptor> listMo89339g2 = mo89339g();
        listMo89339g2.getClass();
        List<ValueParameterDescriptor> list2 = listMo89339g2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : list2) {
            Name name2 = valueParameterDescriptor.getName();
            name2.getClass();
            int index = valueParameterDescriptor.getIndex();
            int i = index - size;
            if (i >= 0 && (name = list.get(i)) != null) {
                name2 = name;
            }
            arrayList.add(valueParameterDescriptor.mo89505E(this, name2, index));
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationM89635L0 = m89635L0(TypeSubstitutor.f66957b);
        List<Name> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((Name) it.next()) == null) {
                }
            }
            z = false;
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationMo89415i = copyConfigurationM89635L0.m89664G(z).mo89420n(arrayList).mo89415i(mo89336a());
        copyConfigurationMo89415i.getClass();
        FunctionDescriptor functionDescriptorMo89213F0 = super.mo89213F0(copyConfigurationMo89415i);
        functionDescriptorMo89213F0.getClass();
        return functionDescriptorMo89213F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* JADX INFO: renamed from: u */
    public boolean mo89215u() {
        return false;
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }
}
