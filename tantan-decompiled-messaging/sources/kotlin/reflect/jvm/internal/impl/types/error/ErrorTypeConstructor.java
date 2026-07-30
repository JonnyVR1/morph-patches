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
    public final ErrorTypeKind f66335a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String[] f66336b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f66337c;

    public ErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        this.f66335a = errorTypeKind;
        this.f66336b = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f66337c = String.format(debugText, Arrays.copyOf(new Object[]{String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeConstructor mo88677a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<KotlinType> mo88678c() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo88316e() {
        return ErrorUtils.INSTANCE.m93009h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88679f() {
        return DefaultBuiltIns.Companion.m88143a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: g */
    public boolean mo88317g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ErrorTypeKind m92998h() {
        return this.f66335a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m92999i(int i) {
        return this.f66336b[i];
    }

    @NotNull
    public String toString() {
        return this.f66337c;
    }
}
