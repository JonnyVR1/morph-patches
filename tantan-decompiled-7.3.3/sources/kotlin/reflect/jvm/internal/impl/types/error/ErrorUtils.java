package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorUtils {

    @NotNull
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModuleDescriptor f67012a = ErrorModuleDescriptor.INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ErrorClassDescriptor f67013b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final KotlinType f67014c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final KotlinType f67015d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final PropertyDescriptor f67016e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<PropertyDescriptor> f67017f;

    static {
        Name nameM91972n = Name.m91972n(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        nameM91972n.getClass();
        f67013b = new ErrorClassDescriptor(nameM91972n);
        f67014c = m93893d(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f67015d = m93893d(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        f67016e = errorPropertyDescriptor;
        f67017f = SetsKt.setOf(errorPropertyDescriptor);
    }

    private ErrorUtils() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ErrorScope m93891a(@NotNull ErrorScopeKind errorScopeKind, boolean z, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return z ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ErrorScope m93892b(@NotNull ErrorScopeKind errorScopeKind, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return m93891a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ErrorType m93893d(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return INSTANCE.m93899g(errorTypeKind, CollectionsKt.emptyList(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m93894m(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = INSTANCE;
        return errorUtils.m93905n(declarationDescriptor) || errorUtils.m93905n(declarationDescriptor.mo89190b()) || declarationDescriptor == f67012a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m93895o(@Nullable KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        return (typeConstructorMo92781G0 instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) typeConstructorMo92781G0).m93889h() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ErrorType m93896c(@NotNull ErrorTypeKind errorTypeKind, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return m93898f(errorTypeKind, CollectionsKt.emptyList(), typeConstructor, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ErrorTypeConstructor m93897e(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return new ErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ErrorType m93898f(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return new ErrorType(typeConstructor, m93892b(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ErrorType m93899g(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        return m93898f(errorTypeKind, list, m93897e(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ErrorClassDescriptor m93900h() {
        return f67013b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ModuleDescriptor m93901i() {
        return f67012a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Set<PropertyDescriptor> m93902j() {
        return f67017f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final KotlinType m93903k() {
        return f67015d;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final KotlinType m93904l() {
        return f67014c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m93905n(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final String m93906p(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeUtilsKt.m93997z(kotlinType);
        TypeConstructor typeConstructorMo92781G0 = kotlinType.mo92781G0();
        typeConstructorMo92781G0.getClass();
        return ((ErrorTypeConstructor) typeConstructorMo92781G0).m93890i(0);
    }
}
