package kotlin.reflect.jvm.internal.impl.types;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gig0;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorSubstitutor {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m93472a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = LovePlanetStage.result;
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static TypeSubstitutor m93473b(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            m93472a(0);
        }
        if (typeSubstitution == null) {
            m93472a(1);
        }
        if (declarationDescriptor == null) {
            m93472a(2);
        }
        if (list2 == null) {
            m93472a(3);
        }
        TypeSubstitutor typeSubstitutorM93474c = m93474c(list, typeSubstitution, declarationDescriptor, list2, null);
        if (typeSubstitutorM93474c != null) {
            return typeSubstitutorM93474c;
        }
        gig0.m130323a("Substitution failed");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static TypeSubstitutor m93474c(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2, @Nullable boolean[] zArr) {
        if (list == null) {
            m93472a(5);
        }
        if (typeSubstitution == null) {
            m93472a(6);
        }
        if (declarationDescriptor == null) {
            m93472a(7);
        }
        if (list2 == null) {
            m93472a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i = 0;
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImplM89808J0 = TypeParameterDescriptorImpl.m89808J0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.mo89493s(), typeParameterDescriptor.mo89492h(), typeParameterDescriptor.getName(), i, SourceElement.f64737a, typeParameterDescriptor.mo89491Z());
            map.put(typeParameterDescriptor.mo89196l(), new TypeProjectionImpl(typeParameterDescriptorImplM89808J0.mo89349o()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplM89808J0);
            list2.add(typeParameterDescriptorImplM89808J0);
            i++;
        }
        TypeConstructorSubstitution typeConstructorSubstitutionM93627j = TypeConstructorSubstitution.m93627j(map);
        TypeSubstitutor typeSubstitutorM93665i = TypeSubstitutor.m93665i(typeSubstitution, typeConstructorSubstitutionM93627j);
        TypeSubstitutor typeSubstitutorM93665i2 = TypeSubstitutor.m93665i(typeSubstitution.m93649h(), typeConstructorSubstitutionM93627j);
        for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
                KotlinType kotlinTypeM93673q = (((classifierDescriptorMo89207e instanceof TypeParameterDescriptor) && TypeUtilsKt.m93987p((TypeParameterDescriptor) classifierDescriptorMo89207e)) ? typeSubstitutorM93665i : typeSubstitutorM93665i2).m93673q(kotlinType, Variance.OUT_VARIANCE);
                if (kotlinTypeM93673q == null) {
                    return null;
                }
                if (kotlinTypeM93673q != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.m89811F0(kotlinTypeM93673q);
            }
            typeParameterDescriptorImpl.m89817O0();
        }
        return typeSubstitutorM93665i;
    }
}
