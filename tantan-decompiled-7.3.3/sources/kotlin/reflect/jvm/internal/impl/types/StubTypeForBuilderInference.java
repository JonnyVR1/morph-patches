package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeConstructor f66920e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final MemberScope f66921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor newTypeVariableConstructor, boolean z, @NotNull TypeConstructor typeConstructor) {
        super(newTypeVariableConstructor, z);
        newTypeVariableConstructor.getClass();
        typeConstructor.getClass();
        this.f66920e = typeConstructor;
        this.f66921f = newTypeVariableConstructor.mo89570f().m89123i().mo90791n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo92781G0() {
        return this.f66920e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public AbstractStubType mo93394Q0(boolean z) {
        return new StubTypeForBuilderInference(m93393P0(), z, mo92781G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return this.f66921f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(m93393P0());
        sb.append(mo90857H0() ? "?" : "");
        return sb.toString();
    }
}
