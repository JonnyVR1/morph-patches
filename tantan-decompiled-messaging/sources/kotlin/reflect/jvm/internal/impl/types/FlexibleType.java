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
    public final SimpleType f66220b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SimpleType f66221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        super(null);
        simpleType.getClass();
        simpleType2.getClass();
        this.f66220b = simpleType;
        this.f66221c = simpleType2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<TypeProjection> mo91888E0() {
        return mo89895N0().mo91888E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return mo89895N0().mo91889F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public TypeConstructor mo91890G0() {
        return mo89895N0().mo91890G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return mo89895N0().mo89966H0();
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public abstract SimpleType mo89895N0();

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final SimpleType m92597O0() {
        return this.f66220b;
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final SimpleType m92598P0() {
        return this.f66221c;
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public abstract String mo89896Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: n */
    public MemberScope mo89900n() {
        return mo89895N0().mo89900n();
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.f65745j.mo91452U(this);
    }
}
