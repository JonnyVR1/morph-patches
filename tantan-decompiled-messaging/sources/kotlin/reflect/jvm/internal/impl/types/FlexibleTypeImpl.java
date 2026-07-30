package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @JvmField
    public static boolean f66222e;

    /* JADX INFO: renamed from: d */
    public boolean f66223d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        super(simpleType, simpleType2);
        simpleType.getClass();
        simpleType2.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    /* JADX INFO: renamed from: B0 */
    public boolean mo89965B0() {
        return (m92597O0().mo91890G0().mo88316e() instanceof TypeParameterDescriptor) && Intrinsics.m87488d(m92597O0().mo91890G0(), m92598P0().mo91890G0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public UnwrappedType mo89967N0(boolean z) {
        return KotlinTypeFactory.m92629e(m92597O0().mo89967N0(z), m92598P0().mo89967N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: M0 */
    public UnwrappedType mo89894M0(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return KotlinTypeFactory.m92629e(m92597O0().mo89894M0(typeAttributes), m92598P0().mo89894M0(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: N0 */
    public SimpleType mo89895N0() {
        m92600S0();
        return m92597O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public String mo89896Q0(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        if (!descriptorRendererOptions.mo91561d()) {
            return descriptorRenderer.mo91449R(descriptorRenderer.mo91452U(m92597O0()), descriptorRenderer.mo91452U(m92598P0()), TypeUtilsKt.m93094n(this));
        }
        return "(" + descriptorRenderer.mo91452U(m92597O0()) + ".." + descriptorRenderer.mo91452U(m92598P0()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public FlexibleType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType kotlinTypeMo92559a = kotlinTypeRefiner.mo92559a(m92597O0());
        kotlinTypeMo92559a.getClass();
        KotlinType kotlinTypeMo92559a2 = kotlinTypeRefiner.mo92559a(m92598P0());
        kotlinTypeMo92559a2.getClass();
        return new FlexibleTypeImpl((SimpleType) kotlinTypeMo92559a, (SimpleType) kotlinTypeMo92559a2);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m92600S0() {
        if (!f66222e || this.f66223d) {
            return;
        }
        this.f66223d = true;
        FlexibleTypesKt.m92606b(m92597O0());
        FlexibleTypesKt.m92606b(m92598P0());
        Intrinsics.m87488d(m92597O0(), m92598P0());
        KotlinTypeChecker.f66298a.mo92904d(m92597O0(), m92598P0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KotlinType mo89974m0(@NotNull KotlinType kotlinType) {
        UnwrappedType unwrappedTypeM92629e;
        kotlinType.getClass();
        UnwrappedType unwrappedTypeMo92625J0 = kotlinType.mo92625J0();
        if (unwrappedTypeMo92625J0 instanceof FlexibleType) {
            unwrappedTypeM92629e = unwrappedTypeMo92625J0;
        } else {
            if (!(unwrappedTypeMo92625J0 instanceof SimpleType)) {
                l9r.m149037a();
                return null;
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeMo92625J0;
            unwrappedTypeM92629e = KotlinTypeFactory.m92629e(simpleType, simpleType.mo89967N0(true));
        }
        return TypeWithEnhancementKt.m92816b(unwrappedTypeM92629e, unwrappedTypeMo92625J0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "(" + m92597O0() + ".." + m92598P0() + ')';
    }
}
