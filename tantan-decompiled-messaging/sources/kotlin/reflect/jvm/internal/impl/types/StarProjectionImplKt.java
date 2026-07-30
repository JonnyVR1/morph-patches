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
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class StarProjectionImplKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinType m92671a(final List<? extends TypeConstructor> list, List<? extends KotlinType> list2, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType kotlinTypeM92782q = TypeSubstitutor.m92773h(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            /* JADX INFO: renamed from: k */
            public TypeProjection mo92673k(TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                if (!list.contains(typeConstructor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo88316e = typeConstructor.mo88316e();
                classifierDescriptorMo88316e.getClass();
                return TypeUtils.m92808s((TypeParameterDescriptor) classifierDescriptorMo88316e);
            }
        }).m92782q((KotlinType) CollectionsKt.first((List) list2), Variance.OUT_VARIANCE);
        if (kotlinTypeM92782q != null) {
            return kotlinTypeM92782q;
        }
        SimpleType simpleTypeM88249z = kotlinBuiltIns.m88249z();
        simpleTypeM88249z.getClass();
        return simpleTypeM88249z;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KotlinType m92672b(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        DeclarationDescriptor declarationDescriptorMo88299b = typeParameterDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        if (declarationDescriptorMo88299b instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) declarationDescriptorMo88299b).mo88305l().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructorMo88305l = ((TypeParameterDescriptor) it.next()).mo88305l();
                typeConstructorMo88305l.getClass();
                arrayList.add(typeConstructorMo88305l);
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            return m92671a(arrayList, upperBounds, DescriptorUtilsKt.m91980m(typeParameterDescriptor));
        }
        if (!(declarationDescriptorMo88299b instanceof FunctionDescriptor)) {
            ig3.m135964a("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) declarationDescriptorMo88299b).getTypeParameters();
        typeParameters.getClass();
        List<TypeParameterDescriptor> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructorMo88305l2 = ((TypeParameterDescriptor) it2.next()).mo88305l();
            typeConstructorMo88305l2.getClass();
            arrayList2.add(typeConstructorMo88305l2);
        }
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        return m92671a(arrayList2, upperBounds2, DescriptorUtilsKt.m91980m(typeParameterDescriptor));
    }
}
