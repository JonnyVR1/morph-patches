package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinTypeChecker {

    /* JADX INFO: renamed from: a */
    public static final KotlinTypeChecker f66972a = NewKotlinTypeChecker.Companion.m93831a();

    public interface TypeConstructorEquality {
        /* JADX INFO: renamed from: a */
        boolean mo92739a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo93794a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);

    /* JADX INFO: renamed from: d */
    boolean mo93795d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);
}
