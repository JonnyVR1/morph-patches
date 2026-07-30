package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TypeConstructor f66246e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final MemberScope f66247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor newTypeVariableConstructor, boolean z, @NotNull TypeConstructor typeConstructor) {
        super(newTypeVariableConstructor, z);
        newTypeVariableConstructor.getClass();
        typeConstructor.getClass();
        this.f66246e = typeConstructor;
        this.f66247f = newTypeVariableConstructor.mo88679f().m88232i().mo89900n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return this.f66246e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public AbstractStubType mo92503Q0(boolean z) {
        return new StubTypeForBuilderInference(m92502P0(), z, mo91890G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return this.f66247f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(m92502P0());
        sb.append(mo89966H0() ? "?" : "");
        return sb.toString();
    }
}
