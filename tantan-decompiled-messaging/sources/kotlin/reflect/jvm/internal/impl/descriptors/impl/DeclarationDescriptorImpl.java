package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Name f64132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorImpl(@NotNull Annotations annotations, @NotNull Name name) {
        super(annotations);
        if (annotations == null) {
            m88706P(0);
        }
        if (name == null) {
            m88706P(1);
        }
        this.f64132b = name;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88706P(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public static String m88707l0(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m88706P(4);
        }
        try {
            return DescriptorRenderer.f65745j.mo91447O(declarationDescriptor) + "[" + declarationDescriptor.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(declarationDescriptor)) + Constants.AES_SUFFIX;
        } catch (Throwable unused) {
            return declarationDescriptor.getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + declarationDescriptor.getName();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public DeclarationDescriptor mo88445a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f64132b;
        if (name == null) {
            m88706P(2);
        }
        return name;
    }

    public String toString() {
        return m88707l0(this);
    }
}
