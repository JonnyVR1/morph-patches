package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ErrorTypeKind f67009a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String[] f67010b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f67011c;

    public ErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        this.f67009a = errorTypeKind;
        this.f67010b = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f67011c = String.format(debugText, Arrays.copyOf(new Object[]{String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo89568a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo89569c() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo89207e() {
        return ErrorUtils.INSTANCE.m93900h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89570f() {
        return DefaultBuiltIns.Companion.m89034a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo89208g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ErrorTypeKind m93889h() {
        return this.f67009a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m93890i(int i) {
        return this.f67010b[i];
    }

    @NotNull
    public String toString() {
        return this.f67011c;
    }
}
