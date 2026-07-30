package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnwrappedType extends KotlinType {
    private UnwrappedType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final UnwrappedType mo93516J0() {
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public abstract UnwrappedType mo90783K0(boolean z);

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public abstract UnwrappedType mo90784L0(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public abstract UnwrappedType mo90785M0(@NotNull TypeAttributes typeAttributes);

    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
