package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLazyTypeParameterDescriptor extends AbstractTypeParameterDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractLazyTypeParameterDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Variance variance, boolean z, int i, @NotNull SourceElement sourceElement, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z, i, sourceElement, supertypeLoopChecker);
        if (storageManager == null) {
            m89552P(0);
        }
        if (declarationDescriptor == null) {
            m89552P(1);
        }
        if (annotations == null) {
            m89552P(2);
        }
        if (name == null) {
            m89552P(3);
        }
        if (variance == null) {
            m89552P(4);
        }
        if (sourceElement == null) {
            m89552P(5);
        }
        if (supertypeLoopChecker == null) {
            m89552P(6);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m89552P(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        String str = "";
        String str2 = mo89493s() ? "reified " : "";
        if (mo89492h() != Variance.INVARIANT) {
            str = mo89492h() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
