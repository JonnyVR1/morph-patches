package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinTypeChecker {

    /* JADX INFO: renamed from: a */
    public static final KotlinTypeChecker f66298a = NewKotlinTypeChecker.Companion.m92940a();

    public interface TypeConstructorEquality {
        /* JADX INFO: renamed from: a */
        boolean mo91848a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo92903a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);

    /* JADX INFO: renamed from: d */
    boolean mo92904d(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);
}
