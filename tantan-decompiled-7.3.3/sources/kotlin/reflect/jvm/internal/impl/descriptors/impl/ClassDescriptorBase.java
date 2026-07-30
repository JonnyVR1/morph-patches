package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {

    /* JADX INFO: renamed from: e */
    public final DeclarationDescriptor f64795e;

    /* JADX INFO: renamed from: f */
    public final SourceElement f64796f;

    /* JADX INFO: renamed from: g */
    public final boolean f64797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z) {
        super(storageManager, name);
        if (storageManager == null) {
            m89594m0(0);
        }
        if (declarationDescriptor == null) {
            m89594m0(1);
        }
        if (name == null) {
            m89594m0(2);
        }
        if (sourceElement == null) {
            m89594m0(3);
        }
        this.f64795e = declarationDescriptor;
        this.f64796f = sourceElement;
        this.f64797g = z;
    }

    /* JADX INFO: renamed from: m0 */
    private static /* synthetic */ void m89594m0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptor = this.f64795e;
        if (declarationDescriptor == null) {
            m89594m0(4);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = this.f64796f;
        if (sourceElement == null) {
            m89594m0(5);
        }
        return sourceElement;
    }

    public boolean isExternal() {
        return this.f64797g;
    }
}
