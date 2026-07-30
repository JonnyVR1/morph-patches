package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StarProjectionImplKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinType m93562a(final List<? extends TypeConstructor> list, List<? extends KotlinType> list2, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType kotlinTypeM93673q = TypeSubstitutor.m93664h(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            /* JADX INFO: renamed from: k */
            public TypeProjection mo93564k(TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                if (!list.contains(typeConstructor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo89207e = typeConstructor.mo89207e();
                classifierDescriptorMo89207e.getClass();
                return TypeUtils.m93699s((TypeParameterDescriptor) classifierDescriptorMo89207e);
            }
        }).m93673q((KotlinType) CollectionsKt.first((List) list2), Variance.OUT_VARIANCE);
        if (kotlinTypeM93673q != null) {
            return kotlinTypeM93673q;
        }
        SimpleType simpleTypeM89140z = kotlinBuiltIns.m89140z();
        simpleTypeM89140z.getClass();
        return simpleTypeM89140z;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KotlinType m93563b(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo89190b = typeParameterDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        if (declarationDescriptorMo89190b instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) declarationDescriptorMo89190b).mo89196l().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructorMo89196l = ((TypeParameterDescriptor) it.next()).mo89196l();
                typeConstructorMo89196l.getClass();
                arrayList.add(typeConstructorMo89196l);
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            return m93562a(arrayList, upperBounds, DescriptorUtilsKt.m92871m(typeParameterDescriptor));
        }
        if (!(declarationDescriptorMo89190b instanceof FunctionDescriptor)) {
            wg3.m206174a("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) declarationDescriptorMo89190b).getTypeParameters();
        typeParameters.getClass();
        List<TypeParameterDescriptor> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructorMo89196l2 = ((TypeParameterDescriptor) it2.next()).mo89196l();
            typeConstructorMo89196l2.getClass();
            arrayList2.add(typeConstructorMo89196l2);
        }
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        return m93562a(arrayList2, upperBounds2, DescriptorUtilsKt.m92871m(typeParameterDescriptor));
    }
}
