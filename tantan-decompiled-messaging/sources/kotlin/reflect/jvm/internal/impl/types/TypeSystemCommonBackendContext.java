package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemCommonBackendContext extends TypeSystemContext {
    @Nullable
    /* JADX INFO: renamed from: D0 */
    PrimitiveType mo90204D0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: E0 */
    SimpleTypeMarker mo90206E0();

    @Nullable
    /* JADX INFO: renamed from: H0 */
    FqNameUnsafe mo90212H0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: J */
    KotlinTypeMarker mo90215J(@NotNull TypeParameterMarker typeParameterMarker);

    @Nullable
    /* JADX INFO: renamed from: L0 */
    KotlinTypeMarker mo90220L0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: Z */
    SimpleTypeMarker mo90242Z(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: c0 */
    boolean mo90248c0(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: g0 */
    KotlinTypeMarker mo90256g0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: j */
    boolean mo90261j(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: s */
    boolean mo90279s(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: s0 */
    boolean mo90280s0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: w0 */
    TypeSubstitutorMarker mo90288w0(@NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map);

    @Nullable
    /* JADX INFO: renamed from: x0 */
    PrimitiveType mo90290x0(@NotNull TypeConstructorMarker typeConstructorMarker);
}
