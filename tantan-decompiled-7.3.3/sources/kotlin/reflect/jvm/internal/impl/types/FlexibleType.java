package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SimpleType f66894b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SimpleType f66895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        super(null);
        simpleType.getClass();
        simpleType2.getClass();
        this.f66894b = simpleType;
        this.f66895c = simpleType2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo92779E0() {
        return mo90786N0().mo92779E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo92780F0() {
        return mo90786N0().mo92780F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo92781G0() {
        return mo90786N0().mo92781G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo90857H0() {
        return mo90786N0().mo90857H0();
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public abstract SimpleType mo90786N0();

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final SimpleType m93488O0() {
        return this.f66894b;
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final SimpleType m93489P0() {
        return this.f66895c;
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public abstract String mo90787Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo90791n() {
        return mo90786N0().mo90791n();
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.f66419j.mo92343U(this);
    }
}
