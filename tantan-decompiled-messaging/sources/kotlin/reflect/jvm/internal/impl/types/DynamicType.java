package kotlin.reflect.jvm.internal.impl.types;

import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TypeAttributes f66215d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull TypeAttributes typeAttributes) {
        kotlinBuiltIns.getClass();
        typeAttributes.getClass();
        SimpleType simpleTypeM88213I = kotlinBuiltIns.m88213I();
        simpleTypeM88213I.getClass();
        SimpleType simpleTypeM88214J = kotlinBuiltIns.m88214J();
        simpleTypeM88214J.getClass();
        super(simpleTypeM88213I, simpleTypeM88214J);
        this.f66215d = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public TypeAttributes mo91889F0() {
        return this.f66215d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public boolean mo89966H0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89895N0() {
        return m92598P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo89896Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        return LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public DynamicType mo89967N0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public DynamicType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public DynamicType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new DynamicType(TypeUtilsKt.m93094n(mo89895N0()), typeAttributes);
    }
}
