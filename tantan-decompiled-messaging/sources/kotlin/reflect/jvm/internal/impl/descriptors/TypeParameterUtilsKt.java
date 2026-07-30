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
import p149l.hg4;
import p149l.nej0;
import p149l.oej0;
import p149l.pej0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeParameterUtilsKt {
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final PossiblyInnerType m88606d(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        return m88607e(kotlinType, classifierDescriptorMo88316e instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo88316e : null, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final PossiblyInnerType m88607e(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.m93003m(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.mo88309p().size() + i;
        if (classifierDescriptorWithTypeParameters.mo88312t()) {
            List<TypeProjection> listSubList = kotlinType.mo91888E0().subList(i, size);
            DeclarationDescriptor declarationDescriptorMo88299b = classifierDescriptorWithTypeParameters.mo88299b();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, m88607e(kotlinType, declarationDescriptorMo88299b instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptorMo88299b : null, size));
        }
        if (size != kotlinType.mo91888E0().size()) {
            DescriptorUtils.m91751E(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.mo91888E0().subList(i, kotlinType.mo91888E0().size()), null);
    }

    /* JADX INFO: renamed from: f */
    public static final hg4 m88608f(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new hg4(typeParameterDescriptor, declarationDescriptor, i);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<TypeParameterDescriptor> m88609g(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listEmptyList;
        DeclarationDescriptor next;
        TypeConstructor typeConstructorMo88305l;
        classifierDescriptorWithTypeParameters.getClass();
        List<TypeParameterDescriptor> listMo88309p = classifierDescriptorWithTypeParameters.mo88309p();
        listMo88309p.getClass();
        if (!classifierDescriptorWithTypeParameters.mo88312t() && !(classifierDescriptorWithTypeParameters.mo88299b() instanceof CallableDescriptor)) {
            return listMo88309p;
        }
        List listM93302V = SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93289I(SequencesKt___SequencesKt.m93281A(SequencesKt___SequencesKt.m93300T(DescriptorUtilsKt.m91988u(classifierDescriptorWithTypeParameters), nej0.INSTANCE), oej0.INSTANCE), pej0.INSTANCE));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.m91988u(classifierDescriptorWithTypeParameters).iterator();
        do {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructorMo88305l = classDescriptor.mo88305l()) != null) {
            listEmptyList = typeConstructorMo88305l.getParameters();
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listM93302V.isEmpty() && listEmptyList.isEmpty()) {
            List<TypeParameterDescriptor> listMo88309p2 = classifierDescriptorWithTypeParameters.mo88309p();
            listMo88309p2.getClass();
            return listMo88309p2;
        }
        List<TypeParameterDescriptor> listPlus = CollectionsKt.plus((Collection) listM93302V, (Iterable) listEmptyList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listPlus) {
            typeParameterDescriptor.getClass();
            arrayList.add(m88608f(typeParameterDescriptor, classifierDescriptorWithTypeParameters, listMo88309p.size()));
        }
        return CollectionsKt.plus((Collection) listMo88309p, (Iterable) arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m88610h(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor instanceof CallableDescriptor;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m88611i(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return !(declarationDescriptor instanceof ConstructorDescriptor);
    }

    /* JADX INFO: renamed from: j */
    public static final Sequence m88612j(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        typeParameters.getClass();
        return CollectionsKt.asSequence(typeParameters);
    }
}
