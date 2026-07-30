package kotlin.reflect.jvm.internal.impl.types;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorSubstitutor {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92581a(int i) {
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
    public static TypeSubstitutor m92582b(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2) {
        if (list == null) {
            m92581a(0);
        }
        if (typeSubstitution == null) {
            m92581a(1);
        }
        if (declarationDescriptor == null) {
            m92581a(2);
        }
        if (list2 == null) {
            m92581a(3);
        }
        TypeSubstitutor typeSubstitutorM92583c = m92583c(list, typeSubstitution, declarationDescriptor, list2, null);
        if (typeSubstitutorM92583c != null) {
            return typeSubstitutorM92583c;
        }
        y9g0.m213537a("Substitution failed");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static TypeSubstitutor m92583c(@NotNull List<TypeParameterDescriptor> list, @NotNull TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<TypeParameterDescriptor> list2, @Nullable boolean[] zArr) {
        if (list == null) {
            m92581a(5);
        }
        if (typeSubstitution == null) {
            m92581a(6);
        }
        if (declarationDescriptor == null) {
            m92581a(7);
        }
        if (list2 == null) {
            m92581a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i = 0;
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImplM88917J0 = TypeParameterDescriptorImpl.m88917J0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.mo88602s(), typeParameterDescriptor.mo88601h(), typeParameterDescriptor.getName(), i, SourceElement.f64063a, typeParameterDescriptor.mo88600Z());
            map.put(typeParameterDescriptor.mo88305l(), new TypeProjectionImpl(typeParameterDescriptorImplM88917J0.mo88458o()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplM88917J0);
            list2.add(typeParameterDescriptorImplM88917J0);
            i++;
        }
        TypeConstructorSubstitution typeConstructorSubstitutionM92736j = TypeConstructorSubstitution.m92736j(map);
        TypeSubstitutor typeSubstitutorM92774i = TypeSubstitutor.m92774i(typeSubstitution, typeConstructorSubstitutionM92736j);
        TypeSubstitutor typeSubstitutorM92774i2 = TypeSubstitutor.m92774i(typeSubstitution.m92758h(), typeConstructorSubstitutionM92736j);
        for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
                KotlinType kotlinTypeM92782q = (((classifierDescriptorMo88316e instanceof TypeParameterDescriptor) && TypeUtilsKt.m93096p((TypeParameterDescriptor) classifierDescriptorMo88316e)) ? typeSubstitutorM92774i : typeSubstitutorM92774i2).m92782q(kotlinType, Variance.OUT_VARIANCE);
                if (kotlinTypeM92782q == null) {
                    return null;
                }
                if (kotlinTypeM92782q != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.m88920F0(kotlinTypeM92782q);
            }
            typeParameterDescriptorImpl.m88926O0();
        }
        return typeSubstitutorM92774i;
    }
}
