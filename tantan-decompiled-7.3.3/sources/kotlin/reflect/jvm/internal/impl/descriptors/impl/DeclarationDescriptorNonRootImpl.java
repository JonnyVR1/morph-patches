package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DeclarationDescriptorNonRootImpl extends DeclarationDescriptorImpl implements DeclarationDescriptorNonRoot {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeclarationDescriptor f64807c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SourceElement f64808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorNonRootImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement) {
        super(annotations, name);
        if (declarationDescriptor == null) {
            m89599P(0);
        }
        if (annotations == null) {
            m89599P(1);
        }
        if (name == null) {
            m89599P(2);
        }
        if (sourceElement == null) {
            m89599P(3);
        }
        this.f64807c = declarationDescriptor;
        this.f64808d = sourceElement;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m89599P(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptor = this.f64807c;
        if (declarationDescriptor == null) {
            m89599P(5);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = this.f64808d;
        if (sourceElement == null) {
            m89599P(6);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public DeclarationDescriptorWithSource mo89336a() {
        DeclarationDescriptorWithSource declarationDescriptorWithSource = (DeclarationDescriptorWithSource) super.mo89336a();
        if (declarationDescriptorWithSource == null) {
            m89599P(4);
        }
        return declarationDescriptorWithSource;
    }
}
