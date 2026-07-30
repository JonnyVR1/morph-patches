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
    public static final DescriptorRenderer f66487a = DescriptorRenderer.Companion.m92347b(new C15412a());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static Integer m92689c(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iM92690d = m92690d(declarationDescriptor2) - m92690d(declarationDescriptor);
            if (iM92690d != 0) {
                return Integer.valueOf(iM92690d);
            }
            if (DescriptorUtils.m92639B(declarationDescriptor) && DescriptorUtils.m92639B(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static int m92690d(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.m92639B(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).mo89337b0() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).mo89337b0() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numM92689c = m92689c(declarationDescriptor, declarationDescriptor2);
            if (numM92689c != null) {
                return numM92689c.intValue();
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator$a */
    public static class C15412a implements Function1<DescriptorRendererOptions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.mo92476l(false);
            descriptorRendererOptions.mo92464h(true);
            descriptorRendererOptions.mo92488p(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.mo92461g(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    }

    private MemberComparator() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer numM92689c = NameAndTypeMemberComparator.m92689c(declarationDescriptor, declarationDescriptor2);
        if (numM92689c != null) {
            return numM92689c.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = f66487a;
            int iCompareTo = descriptorRenderer.mo92343U(((TypeAliasDescriptor) declarationDescriptor).mo89489v0()).compareTo(descriptorRenderer.mo92343U(((TypeAliasDescriptor) declarationDescriptor2).mo89489v0()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor receiverParameterDescriptorMo89337b0 = callableDescriptor.mo89337b0();
            ReceiverParameterDescriptor receiverParameterDescriptorMo89337b1 = callableDescriptor2.mo89337b0();
            if (receiverParameterDescriptorMo89337b0 != null) {
                DescriptorRenderer descriptorRenderer2 = f66487a;
                int iCompareTo2 = descriptorRenderer2.mo92343U(receiverParameterDescriptorMo89337b0.getType()).compareTo(descriptorRenderer2.mo92343U(receiverParameterDescriptorMo89337b1.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<ValueParameterDescriptor> listMo89339g = callableDescriptor.mo89339g();
            List<ValueParameterDescriptor> listMo89339g2 = callableDescriptor2.mo89339g();
            for (int i = 0; i < Math.min(listMo89339g.size(), listMo89339g2.size()); i++) {
                DescriptorRenderer descriptorRenderer3 = f66487a;
                int iCompareTo3 = descriptorRenderer3.mo92343U(listMo89339g.get(i).getType()).compareTo(descriptorRenderer3.mo92343U(listMo89339g2.get(i).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listMo89339g.size() - listMo89339g2.size();
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
                    DescriptorRenderer descriptorRenderer4 = f66487a;
                    int iCompareTo4 = descriptorRenderer4.mo92343U(upperBounds.get(i3)).compareTo(descriptorRenderer4.mo92343U(upperBounds2.get(i3)));
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
            if (classDescriptor.mo89193h0() != classDescriptor2.mo89193h0()) {
                return classDescriptor.mo89193h0() ? 1 : -1;
            }
        }
        DescriptorRenderer descriptorRenderer5 = f66487a;
        int iCompareTo5 = descriptorRenderer5.mo92338O(declarationDescriptor).compareTo(descriptorRenderer5.mo92338O(declarationDescriptor2));
        return iCompareTo5 != 0 ? iCompareTo5 : DescriptorUtils.m92657g(declarationDescriptor).getName().compareTo(DescriptorUtils.m92657g(declarationDescriptor2).getName());
    }
}
