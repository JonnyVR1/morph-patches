package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractStubType extends SimpleType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NewTypeVariableConstructor f66189b;

    /* JADX INFO: renamed from: c */
    public final boolean f66190c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final MemberScope f66191d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AbstractStubType(@NotNull NewTypeVariableConstructor newTypeVariableConstructor, boolean z) {
        newTypeVariableConstructor.getClass();
        this.f66189b = newTypeVariableConstructor;
        this.f66190c = z;
        this.f66191d = ErrorUtils.m93001b(ErrorScopeKind.STUB_TYPE_SCOPE, newTypeVariableConstructor.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return TypeAttributes.Companion.m92709k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return this.f66190c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89967N0(boolean z) {
        return z == mo89966H0() ? this : mo92503Q0(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public SimpleType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final NewTypeVariableConstructor m92502P0() {
        return this.f66189b;
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public abstract AbstractStubType mo92503Q0(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public AbstractStubType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return this.f66191d;
    }
}
