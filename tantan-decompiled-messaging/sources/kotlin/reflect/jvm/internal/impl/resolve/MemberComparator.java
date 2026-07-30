package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final MemberComparator INSTANCE = new MemberComparator();

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer f65813a = DescriptorRenderer.Companion.m91456b(new C15305a());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static Integer m91798c(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iM91799d = m91799d(declarationDescriptor2) - m91799d(declarationDescriptor);
            if (iM91799d != 0) {
                return Integer.valueOf(iM91799d);
            }
            if (DescriptorUtils.m91748B(declarationDescriptor) && DescriptorUtils.m91748B(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static int m91799d(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.m91748B(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).mo88446b0() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).mo88446b0() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numM91798c = m91798c(declarationDescriptor, declarationDescriptor2);
            if (numM91798c != null) {
                return numM91798c.intValue();
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator$a */
    public static class C15305a implements Function1<DescriptorRendererOptions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.mo91585l(false);
            descriptorRendererOptions.mo91573h(true);
            descriptorRendererOptions.mo91597p(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.mo91570g(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    }

    private MemberComparator() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer numM91798c = NameAndTypeMemberComparator.m91798c(declarationDescriptor, declarationDescriptor2);
        if (numM91798c != null) {
            return numM91798c.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = f65813a;
            int iCompareTo = descriptorRenderer.mo91452U(((TypeAliasDescriptor) declarationDescriptor).mo88598v0()).compareTo(descriptorRenderer.mo91452U(((TypeAliasDescriptor) declarationDescriptor2).mo88598v0()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor receiverParameterDescriptorMo88446b0 = callableDescriptor.mo88446b0();
            ReceiverParameterDescriptor receiverParameterDescriptorMo88446b1 = callableDescriptor2.mo88446b0();
            if (receiverParameterDescriptorMo88446b0 != null) {
                DescriptorRenderer descriptorRenderer2 = f65813a;
                int iCompareTo2 = descriptorRenderer2.mo91452U(receiverParameterDescriptorMo88446b0.getType()).compareTo(descriptorRenderer2.mo91452U(receiverParameterDescriptorMo88446b1.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<ValueParameterDescriptor> listMo88448g = callableDescriptor.mo88448g();
            List<ValueParameterDescriptor> listMo88448g2 = callableDescriptor2.mo88448g();
            for (int i = 0; i < Math.min(listMo88448g.size(), listMo88448g2.size()); i++) {
                DescriptorRenderer descriptorRenderer3 = f65813a;
                int iCompareTo3 = descriptorRenderer3.mo91452U(listMo88448g.get(i).getType()).compareTo(descriptorRenderer3.mo91452U(listMo88448g2.get(i).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listMo88448g.size() - listMo88448g2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i2 = 0; i2 < Math.min(typeParameters.size(), typeParameters2.size()); i2++) {
                List<KotlinType> upperBounds = typeParameters.get(i2).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i2).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i3 = 0; i3 < upperBounds.size(); i3++) {
                    DescriptorRenderer descriptorRenderer4 = f65813a;
                    int iCompareTo4 = descriptorRenderer4.mo91452U(upperBounds.get(i3)).compareTo(descriptorRenderer4.mo91452U(upperBounds2.get(i3)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                int iOrdinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else {
            if (!(declarationDescriptor instanceof ClassDescriptor) || !(declarationDescriptor2 instanceof ClassDescriptor)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.mo88302h0() != classDescriptor2.mo88302h0()) {
                return classDescriptor.mo88302h0() ? 1 : -1;
            }
        }
        DescriptorRenderer descriptorRenderer5 = f65813a;
        int iCompareTo5 = descriptorRenderer5.mo91447O(declarationDescriptor).compareTo(descriptorRenderer5.mo91447O(declarationDescriptor2));
        return iCompareTo5 != 0 ? iCompareTo5 : DescriptorUtils.m91766g(declarationDescriptor).getName().compareTo(DescriptorUtils.m91766g(declarationDescriptor2).getName());
    }
}
