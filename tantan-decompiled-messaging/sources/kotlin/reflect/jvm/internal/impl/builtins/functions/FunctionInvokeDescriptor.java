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
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final Factory f63954E = new Factory(null);

    @SourceDebugExtension
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final FunctionInvokeDescriptor m88325a(@NotNull FunctionClassDescriptor functionClassDescriptor, boolean z) {
            functionClassDescriptor.getClass();
            List<TypeParameterDescriptor> listMo88309p = functionClassDescriptor.mo88309p();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor receiverParameterDescriptorMo88456R = functionClassDescriptor.mo88456R();
            List<ReceiverParameterDescriptor> listEmptyList = CollectionsKt.emptyList();
            List<? extends TypeParameterDescriptor> listEmptyList2 = CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo88309p) {
                if (((TypeParameterDescriptor) obj).mo88601h() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
            for (IndexedValue indexedValue : iterableWithIndex) {
                arrayList2.add(FunctionInvokeDescriptor.f63954E.m88326b(functionInvokeDescriptor, indexedValue.getIndex(), (TypeParameterDescriptor) indexedValue.getValue()));
            }
            functionInvokeDescriptor.mo88743K0(null, receiverParameterDescriptorMo88456R, listEmptyList, listEmptyList2, arrayList2, ((TypeParameterDescriptor) CollectionsKt.last((List) listMo88309p)).mo88458o(), Modality.ABSTRACT, DescriptorVisibilities.f64026e);
            functionInvokeDescriptor.mo88751S0(true);
            return functionInvokeDescriptor;
        }

        /* JADX INFO: renamed from: b */
        public final ValueParameterDescriptor m88326b(FunctionInvokeDescriptor functionInvokeDescriptor, int i, TypeParameterDescriptor typeParameterDescriptor) {
            String lowerCase;
            String strM91082b = typeParameterDescriptor.getName().m91082b();
            strM91082b.getClass();
            if (Intrinsics.m87488d(strM91082b, j6f.GPS_DIRECTION_TRUE)) {
                lowerCase = "instance";
            } else if (Intrinsics.m87488d(strM91082b, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM91082b.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            Annotations annotationsM88641b = Annotations.Companion.m88641b();
            Name nameM91079i = Name.m91079i(lowerCase);
            nameM91079i.getClass();
            SimpleType simpleTypeMo88458o = typeParameterDescriptor.mo88458o();
            simpleTypeMo88458o.getClass();
            SourceElement sourceElement = SourceElement.f64063a;
            sourceElement.getClass();
            return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, annotationsM88641b, nameM91079i, simpleTypeMo88458o, false, false, false, null, sourceElement);
        }

        private Factory() {
        }
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.m88641b(), OperatorNameConventions.f66408h, kind, SourceElement.f64063a);
        m88756Y0(true);
        m88758a1(z);
        mo88750R0(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public FunctionDescriptorImpl mo88321E0(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        sourceElement.getClass();
        return new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    /* JADX INFO: renamed from: F0 */
    public FunctionDescriptor mo88322F0(@NotNull FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        copyConfiguration.getClass();
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.mo88322F0(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> listMo88448g = functionInvokeDescriptor.mo88448g();
        listMo88448g.getClass();
        List<ValueParameterDescriptor> list = listMo88448g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            type.getClass();
            if (FunctionTypesKt.m88147d(type) != null) {
                List<ValueParameterDescriptor> listMo88448g2 = functionInvokeDescriptor.mo88448g();
                listMo88448g2.getClass();
                List<ValueParameterDescriptor> list2 = listMo88448g2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(FunctionTypesKt.m88147d(type2));
                }
                return functionInvokeDescriptor.m88323i1(arrayList);
            }
        }
        return functionInvokeDescriptor;
    }

    /* JADX INFO: renamed from: i1 */
    public final FunctionDescriptor m88323i1(List<Name> list) {
        Name name;
        int size = mo88448g().size() - list.size();
        boolean z = true;
        if (size == 0) {
            List<ValueParameterDescriptor> listMo88448g = mo88448g();
            listMo88448g.getClass();
            List<Pair> listZip = CollectionsKt.zip(list, listMo88448g);
            if ((listZip instanceof Collection) && listZip.isEmpty()) {
                return this;
            }
            for (Pair pair : listZip) {
                if (!Intrinsics.m87488d((Name) pair.component1(), ((ValueParameterDescriptor) pair.component2()).getName())) {
                }
            }
            return this;
        }
        List<ValueParameterDescriptor> listMo88448g2 = mo88448g();
        listMo88448g2.getClass();
        List<ValueParameterDescriptor> list2 = listMo88448g2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : list2) {
            Name name2 = valueParameterDescriptor.getName();
            name2.getClass();
            int index = valueParameterDescriptor.getIndex();
            int i = index - size;
            if (i >= 0 && (name = list.get(i)) != null) {
                name2 = name;
            }
            arrayList.add(valueParameterDescriptor.mo88614E(this, name2, index));
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationM88744L0 = m88744L0(TypeSubstitutor.f66283b);
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
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationMo88524i = copyConfigurationM88744L0.m88773G(z).mo88529n(arrayList).mo88524i(mo88445a());
        copyConfigurationMo88524i.getClass();
        FunctionDescriptor functionDescriptorMo88322F0 = super.mo88322F0(copyConfigurationMo88524i);
        functionDescriptorMo88322F0.getClass();
        return functionDescriptorMo88322F0;
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
    public boolean mo88324u() {
        return false;
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }
}
