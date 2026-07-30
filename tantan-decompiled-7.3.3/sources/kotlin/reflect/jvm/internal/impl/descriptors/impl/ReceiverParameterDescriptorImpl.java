package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class ReceiverParameterDescriptorImpl extends AbstractReceiverParameterDescriptor {

    /* JADX INFO: renamed from: c */
    public final DeclarationDescriptor f64967c;

    /* JADX INFO: renamed from: d */
    public ReceiverValue f64968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ReceiverValue receiverValue, @NotNull Annotations annotations, @NotNull Name name) {
        super(annotations, name);
        if (declarationDescriptor == null) {
            m89787P(3);
        }
        if (receiverValue == null) {
            m89787P(4);
        }
        if (annotations == null) {
            m89787P(5);
        }
        if (name == null) {
            m89787P(6);
        }
        this.f64967c = declarationDescriptor;
        this.f64968d = receiverValue;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89787P(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = Constants.COPY_TYPE;
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptor = this.f64967c;
        if (declarationDescriptor == null) {
            m89787P(8);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        ReceiverValue receiverValue = this.f64968d;
        if (receiverValue == null) {
            m89787P(7);
        }
        return receiverValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReceiverParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ReceiverValue receiverValue, @NotNull Annotations annotations) {
        this(declarationDescriptor, receiverValue, annotations, SpecialNames.f66167h);
        if (declarationDescriptor == null) {
            m89787P(0);
        }
        if (receiverValue == null) {
            m89787P(1);
        }
        if (annotations == null) {
            m89787P(2);
        }
    }
}
