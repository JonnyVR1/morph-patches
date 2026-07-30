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
    public static final ModuleDescriptor f66338a = ErrorModuleDescriptor.INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ErrorClassDescriptor f66339b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final KotlinType f66340c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final KotlinType f66341d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final PropertyDescriptor f66342e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Set<PropertyDescriptor> f66343f;

    static {
        Name nameM91081n = Name.m91081n(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        nameM91081n.getClass();
        f66339b = new ErrorClassDescriptor(nameM91081n);
        f66340c = m93002d(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f66341d = m93002d(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        f66342e = errorPropertyDescriptor;
        f66343f = SetsKt.setOf(errorPropertyDescriptor);
    }

    private ErrorUtils() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ErrorScope m93000a(@NotNull ErrorScopeKind errorScopeKind, boolean z, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return z ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ErrorScope m93001b(@NotNull ErrorScopeKind errorScopeKind, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return m93000a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ErrorType m93002d(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return INSTANCE.m93008g(errorTypeKind, CollectionsKt.emptyList(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m93003m(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = INSTANCE;
        return errorUtils.m93014n(declarationDescriptor) || errorUtils.m93014n(declarationDescriptor.mo88299b()) || declarationDescriptor == f66338a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m93004o(@Nullable KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        return (typeConstructorMo91890G0 instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) typeConstructorMo91890G0).m92998h() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ErrorType m93005c(@NotNull ErrorTypeKind errorTypeKind, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return m93007f(errorTypeKind, CollectionsKt.emptyList(), typeConstructor, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ErrorTypeConstructor m93006e(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return new ErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ErrorType m93007f(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return new ErrorType(typeConstructor, m93001b(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ErrorType m93008g(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        return m93007f(errorTypeKind, list, m93006e(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ErrorClassDescriptor m93009h() {
        return f66339b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ModuleDescriptor m93010i() {
        return f66338a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Set<PropertyDescriptor> m93011j() {
        return f66343f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final KotlinType m93012k() {
        return f66341d;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final KotlinType m93013l() {
        return f66340c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m93014n(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final String m93015p(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeUtilsKt.m93106z(kotlinType);
        TypeConstructor typeConstructorMo91890G0 = kotlinType.mo91890G0();
        typeConstructorMo91890G0.getClass();
        return ((ErrorTypeConstructor) typeConstructorMo91890G0).m92999i(0);
    }
}
