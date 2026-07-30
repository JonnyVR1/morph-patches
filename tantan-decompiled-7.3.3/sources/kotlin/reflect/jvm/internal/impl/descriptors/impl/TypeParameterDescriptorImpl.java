package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.qg50;

/* JADX INFO: loaded from: classes2.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Function1<KotlinType, Void> f64976k;

    /* JADX INFO: renamed from: l */
    public final List<KotlinType> f64977l;

    /* JADX INFO: renamed from: m */
    public boolean f64978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z, i, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            m89810P(19);
        }
        if (annotations == null) {
            m89810P(20);
        }
        if (variance == null) {
            m89810P(21);
        }
        if (name == null) {
            m89810P(22);
        }
        if (sourceElement == null) {
            m89810P(23);
        }
        if (supertypeLoopChecker == null) {
            m89810P(24);
        }
        if (storageManager == null) {
            m89810P(25);
        }
        this.f64977l = new ArrayList(1);
        this.f64978m = false;
        this.f64976k = function1;
    }

    /* JADX INFO: renamed from: I0 */
    public static TypeParameterDescriptorImpl m89807I0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m89810P(12);
        }
        if (annotations == null) {
            m89810P(13);
        }
        if (variance == null) {
            m89810P(14);
        }
        if (name == null) {
            m89810P(15);
        }
        if (sourceElement == null) {
            m89810P(16);
        }
        if (supertypeLoopChecker == null) {
            m89810P(17);
        }
        if (storageManager == null) {
            m89810P(18);
        }
        return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name, i, sourceElement, function1, supertypeLoopChecker, storageManager);
    }

    /* JADX INFO: renamed from: J0 */
    public static TypeParameterDescriptorImpl m89808J0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m89810P(6);
        }
        if (annotations == null) {
            m89810P(7);
        }
        if (variance == null) {
            m89810P(8);
        }
        if (name == null) {
            m89810P(9);
        }
        if (sourceElement == null) {
            m89810P(10);
        }
        if (storageManager == null) {
            m89810P(11);
        }
        return m89807I0(declarationDescriptor, annotations, z, variance, name, i, sourceElement, null, SupertypeLoopChecker.EMPTY.INSTANCE, storageManager);
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static TypeParameterDescriptor m89809K0(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull StorageManager storageManager) {
        if (declarationDescriptor == null) {
            m89810P(0);
        }
        if (annotations == null) {
            m89810P(1);
        }
        if (variance == null) {
            m89810P(2);
        }
        if (name == null) {
            m89810P(3);
        }
        if (storageManager == null) {
            m89810P(4);
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplM89808J0 = m89808J0(declarationDescriptor, annotations, z, variance, name, i, SourceElement.f64737a, storageManager);
        typeParameterDescriptorImplM89808J0.m89811F0(DescriptorUtilsKt.m92871m(declarationDescriptor).m89140z());
        typeParameterDescriptorImplM89808J0.m89817O0();
        return typeParameterDescriptorImplM89808J0;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89810P(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: D0 */
    public void mo89574D0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89810P(27);
        }
        Function1<KotlinType, Void> function1 = this.f64976k;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<KotlinType> mo89575E0() {
        m89812G0();
        List<KotlinType> list = this.f64977l;
        if (list == null) {
            m89810P(28);
        }
        return list;
    }

    /* JADX INFO: renamed from: F0 */
    public void m89811F0(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m89810P(26);
        }
        m89813H0();
        m89814L0(kotlinType);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m89812G0() {
        if (this.f64978m) {
            return;
        }
        qg50.m176437a("Type parameter descriptor is not initialized: ", m89816N0());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m89813H0() {
        if (this.f64978m) {
            qg50.m176437a("Type parameter descriptor is already initialized: ", m89816N0());
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m89814L0(KotlinType kotlinType) {
        if (KotlinTypeKt.m93535a(kotlinType)) {
            return;
        }
        this.f64977l.add(kotlinType);
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m89815M0() {
        return this.f64978m;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m89816N0() {
        return getName() + " declared in " + DescriptorUtils.m92663m(mo89190b());
    }

    /* JADX INFO: renamed from: O0 */
    public void m89817O0() {
        m89813H0();
        this.f64978m = true;
    }
}
