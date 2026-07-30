package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gh4;
import p153l.rnj0;
import p153l.snj0;
import p153l.tnj0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeParameterUtilsKt {
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final PossiblyInnerType m89497d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        return m89498e(kotlinType, classifierDescriptorMo89207e instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo89207e : null, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final PossiblyInnerType m89498e(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.m93894m(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.mo89200p().size() + i;
        if (classifierDescriptorWithTypeParameters.mo89203t()) {
            List<TypeProjection> listSubList = kotlinType.mo92779E0().subList(i, size);
            DeclarationDescriptor declarationDescriptorMo89190b = classifierDescriptorWithTypeParameters.mo89190b();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, m89498e(kotlinType, declarationDescriptorMo89190b instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptorMo89190b : null, size));
        }
        if (size != kotlinType.mo92779E0().size()) {
            DescriptorUtils.m92642E(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.mo92779E0().subList(i, kotlinType.mo92779E0().size()), null);
    }

    /* JADX INFO: renamed from: f */
    public static final gh4 m89499f(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new gh4(typeParameterDescriptor, declarationDescriptor, i);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<TypeParameterDescriptor> m89500g(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listEmptyList;
        DeclarationDescriptor next;
        TypeConstructor typeConstructorMo89196l;
        classifierDescriptorWithTypeParameters.getClass();
        List<TypeParameterDescriptor> listMo89200p = classifierDescriptorWithTypeParameters.mo89200p();
        listMo89200p.getClass();
        if (!classifierDescriptorWithTypeParameters.mo89203t() && !(classifierDescriptorWithTypeParameters.mo89190b() instanceof CallableDescriptor)) {
            return listMo89200p;
        }
        List listM94193V = SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94180I(SequencesKt___SequencesKt.m94172A(SequencesKt___SequencesKt.m94191T(DescriptorUtilsKt.m92879u(classifierDescriptorWithTypeParameters), rnj0.INSTANCE), snj0.INSTANCE), tnj0.INSTANCE));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.m92879u(classifierDescriptorWithTypeParameters).iterator();
        do {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructorMo89196l = classDescriptor.mo89196l()) != null) {
            listEmptyList = typeConstructorMo89196l.getParameters();
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listM94193V.isEmpty() && listEmptyList.isEmpty()) {
            List<TypeParameterDescriptor> listMo89200p2 = classifierDescriptorWithTypeParameters.mo89200p();
            listMo89200p2.getClass();
            return listMo89200p2;
        }
        List<TypeParameterDescriptor> listPlus = CollectionsKt.plus((Collection) listM94193V, (Iterable) listEmptyList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listPlus) {
            typeParameterDescriptor.getClass();
            arrayList.add(m89499f(typeParameterDescriptor, classifierDescriptorWithTypeParameters, listMo89200p.size()));
        }
        return CollectionsKt.plus((Collection) listMo89200p, (Iterable) arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m89501h(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor instanceof CallableDescriptor;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m89502i(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return !(declarationDescriptor instanceof ConstructorDescriptor);
    }

    /* JADX INFO: renamed from: j */
    public static final Sequence m89503j(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        typeParameters.getClass();
        return CollectionsKt.asSequence(typeParameters);
    }
}
