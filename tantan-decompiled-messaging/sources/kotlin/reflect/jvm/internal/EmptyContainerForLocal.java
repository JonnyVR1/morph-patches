package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.BloodType;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", BloodType.f38728O, "()Ljava/lang/Void;", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class EmptyContainerForLocal extends KDeclarationContainerImpl {

    @NotNull
    public static final EmptyContainerForLocal INSTANCE = new EmptyContainerForLocal();

    private EmptyContainerForLocal() {
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: D */
    public Collection<ConstructorDescriptor> mo87674D() {
        m87678O();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<FunctionDescriptor> mo87675E(@NotNull Name name) {
        name.getClass();
        m87678O();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* JADX INFO: renamed from: F */
    public PropertyDescriptor mo87676F(int index) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: I */
    public Collection<PropertyDescriptor> mo87677I(@NotNull Name name) {
        name.getClass();
        m87678O();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: O */
    public final Void m87678O() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<?> mo87465d() {
        m87678O();
        throw new KotlinNothingValueException();
    }
}
