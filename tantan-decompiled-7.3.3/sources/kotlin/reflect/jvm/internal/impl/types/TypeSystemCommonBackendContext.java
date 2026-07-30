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
    PrimitiveType mo91095D0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: E0 */
    SimpleTypeMarker mo91097E0();

    @Nullable
    /* JADX INFO: renamed from: H0 */
    FqNameUnsafe mo91103H0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: J */
    KotlinTypeMarker mo91106J(@NotNull TypeParameterMarker typeParameterMarker);

    @Nullable
    /* JADX INFO: renamed from: L0 */
    KotlinTypeMarker mo91111L0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    /* JADX INFO: renamed from: Z */
    SimpleTypeMarker mo91133Z(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: c0 */
    boolean mo91139c0(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: g0 */
    KotlinTypeMarker mo91147g0(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: j */
    boolean mo91152j(@NotNull TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: s */
    boolean mo91170s(@NotNull KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: s0 */
    boolean mo91171s0(@NotNull TypeConstructorMarker typeConstructorMarker);

    @NotNull
    /* JADX INFO: renamed from: w0 */
    TypeSubstitutorMarker mo91179w0(@NotNull Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map);

    @Nullable
    /* JADX INFO: renamed from: x0 */
    PrimitiveType mo91181x0(@NotNull TypeConstructorMarker typeConstructorMarker);
}
