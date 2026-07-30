package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.clevertap.android.sdk.Constants;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class LazyClassReceiverParameterDescriptor extends AbstractReceiverParameterDescriptor {

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor f64879c;

    /* JADX INFO: renamed from: d */
    public final ImplicitClassReceiver f64880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyClassReceiverParameterDescriptor(@NotNull ClassDescriptor classDescriptor) {
        super(Annotations.Companion.m89532b());
        if (classDescriptor == null) {
            m89682P(0);
        }
        this.f64879c = classDescriptor;
        this.f64880d = new ImplicitClassReceiver(classDescriptor, null);
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89682P(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = Constants.COPY_TYPE;
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        ClassDescriptor classDescriptor = this.f64879c;
        if (classDescriptor == null) {
            m89682P(2);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        ImplicitClassReceiver implicitClassReceiver = this.f64880d;
        if (implicitClassReceiver == null) {
            m89682P(1);
        }
        return implicitClassReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "class " + this.f64879c.getName() + "::this";
    }
}
