package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {

    /* JADX INFO: renamed from: f */
    public final boolean f64313f;

    /* JADX INFO: renamed from: g */
    public NullableLazyValue<ConstantValue<?>> f64314g;

    /* JADX INFO: renamed from: h */
    public Function0<NullableLazyValue<ConstantValue<?>>> f64315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @Nullable KotlinType kotlinType, boolean z, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            m88936P(0);
        }
        if (annotations == null) {
            m88936P(1);
        }
        if (name == null) {
            m88936P(2);
        }
        if (sourceElement == null) {
            m88936P(3);
        }
        this.f64313f = z;
    }

    /* JADX INFO: renamed from: P */
    private static /* synthetic */ void m88936P(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: E0 */
    public void m88937E0(@Nullable NullableLazyValue<ConstantValue<?>> nullableLazyValue, @NotNull Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            m88936P(5);
        }
        this.f64315h = function0;
        if (nullableLazyValue == null) {
            nullableLazyValue = function0.invoke();
        }
        this.f64314g = nullableLazyValue;
    }

    /* JADX INFO: renamed from: F0 */
    public void m88938F0(@NotNull Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            m88936P(4);
        }
        m88937E0(null, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public ConstantValue<?> mo88619q0() {
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.f64314g;
        if (nullableLazyValue != null) {
            return nullableLazyValue.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y */
    public boolean mo88620y() {
        return this.f64313f;
    }
}
