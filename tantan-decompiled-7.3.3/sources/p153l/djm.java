package p153l;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.common.Priority;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 t2\u00020\u0001:\u0002u\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00106\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\rR\u0019\u00109\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R\u0019\u0010<\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u001c\u0010?\u001a\u0004\u0018\u00010\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0017R\u001a\u0010B\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u001a\u001a\u0004\bA\u0010\rR\u0019\u0010E\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u0019\u0010H\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u0019\u0010K\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bI\u0010\u001f\u001a\u0004\bJ\u0010!R\u0017\u0010N\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u00100\u001a\u0004\bM\u00102R\u0019\u0010T\u001a\u0004\u0018\u00010O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u001a\u001a\u0004\bV\u0010\rR\u0019\u0010Z\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010\u001f\u001a\u0004\bY\u0010!R\u0019\u0010]\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010!R\u0014\u0010^\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0017\u0010a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b_\u0010\u001a\u001a\u0004\b`\u0010\rR\u0014\u0010c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u00100R\u0014\u0010e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u00100R\u0017\u0010g\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bf\u00100\u001a\u0004\bg\u00102R\u0019\u0010m\u001a\u0004\u0018\u00010h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010p\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bn\u00100\u001a\u0004\bo\u00102R\u0017\u0010s\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bq\u00100\u001a\u0004\br\u00102¨\u0006v"}, m88121d2 = {"Ll/djm;", "Ll/yhd;", "Ll/djm$a;", "builder", "<init>", "(Ll/djm$a;)V", "", "otherObject", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ll/i950$a;", "b", "()Ll/i950$a;", "p", "Ljava/lang/Integer;", "getPlaceholderColor", "()Ljava/lang/Integer;", "placeholderColor", "q", "I", "getPlaceholderRes", "placeholderRes", "Landroid/graphics/drawable/Drawable;", "r", "Landroid/graphics/drawable/Drawable;", "getPlaceholderDrawable", "()Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "Ll/h1e0;", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/h1e0;", "getPlaceholderScaleType", "()Ll/h1e0;", "placeholderScaleType", "Landroid/graphics/PointF;", Constants.KEY_T, "Landroid/graphics/PointF;", "getPlaceholderFocusPoint", "()Landroid/graphics/PointF;", "placeholderFocusPoint", "u", "Z", "getPlaceholderApplyRoundingOptions", "()Z", "placeholderApplyRoundingOptions", ResourceDirection.f39656v, "getProgressRes", "progressRes", "w", "getProgressDrawable", "progressDrawable", BaseSei.f14624X, "getProgressScaleType", "progressScaleType", BaseSei.f14625Y, "getErrorColor", "errorColor", BaseSei.f14626Z, "getErrorRes", "errorRes", "A", "getErrorScaleType", "errorScaleType", "B", "getErrorFocusPoint", "errorFocusPoint", c4s.C_ZONE, "getErrorDrawable", "errorDrawable", "D", "getErrorApplyRoundingOptions", "errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "E", "Landroid/graphics/ColorFilter;", "getActualImageColorFilter", "()Landroid/graphics/ColorFilter;", "actualImageColorFilter", "F", "getOverlayRes", "overlayRes", "G", "getOverlayDrawable", "overlayDrawable", "H", "getBackgroundDrawable", "backgroundDrawable", "_resizeToViewport", "J", "getFadeDurationMs", "fadeDurationMs", "K", "_autoPlay", "L", "_autoStop", "M", "isPerfMediaRemountInstrumentationFix", "Ll/ejm;", "N", "Ll/ejm;", "getCustomDrawableFactory", "()Ll/ejm;", "customDrawableFactory", BloodType.f39576O, "getExperimentalDynamicSize", "experimentalDynamicSize", "P", "getExperimentalDynamicSizeWithCacheFallback", "experimentalDynamicSizeWithCacheFallback", "Companion", "a", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class djm extends yhd {

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static djm f88871Q;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final h1e0 errorScaleType;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final PointF errorFocusPoint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final Drawable errorDrawable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final boolean errorApplyRoundingOptions;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final ColorFilter actualImageColorFilter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @DrawableRes
    public final int overlayRes;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public final Drawable overlayDrawable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final Drawable backgroundDrawable;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final boolean _resizeToViewport;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final int fadeDurationMs;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final boolean _autoPlay;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final boolean _autoStop;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final boolean isPerfMediaRemountInstrumentationFix;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @Nullable
    public final ejm customDrawableFactory;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final boolean experimentalDynamicSize;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final boolean experimentalDynamicSizeWithCacheFallback;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    public final Integer placeholderColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @DrawableRes
    public final int placeholderRes;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final Drawable placeholderDrawable;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final h1e0 placeholderScaleType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final PointF placeholderFocusPoint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean placeholderApplyRoundingOptions;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @DrawableRes
    public final int progressRes;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final Drawable progressDrawable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public final h1e0 progressScaleType;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    public final Integer errorColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @DrawableRes
    public final int errorRes;

    /* JADX INFO: renamed from: l.djm$a */
    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR$\u0010B\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R$\u0010F\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R$\u0010J\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0011\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u0010\u0015R\"\u0010N\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0018\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010\u001cR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R$\u0010U\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010-\u001a\u0004\bS\u0010/\"\u0004\bT\u00101R$\u0010W\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010 \u001a\u0004\bR\u0010\"\"\u0004\bV\u0010$R\"\u0010Y\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u00105\u001a\u0004\bK\u00107\"\u0004\bX\u00109R$\u0010_\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010[\u001a\u0004\b4\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0018\u001a\u0004\ba\u0010\u001a\"\u0004\bb\u0010\u001cR$\u0010f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010 \u001a\u0004\b\u0018\u0010\"\"\u0004\be\u0010$R$\u0010i\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010 \u001a\u0004\bC\u0010\"\"\u0004\bh\u0010$R\"\u0010l\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u00105\u001a\u0004\bj\u00107\"\u0004\bk\u00109R\"\u0010n\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u00105\u001a\u0004\b;\u00107\"\u0004\bm\u00109R\"\u0010q\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u00105\u001a\u0004\b?\u00107\"\u0004\bp\u00109R\"\u0010s\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00105\u001a\u0004\bo\u00107\"\u0004\br\u00109R\"\u0010u\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\bg\u0010\u001a\"\u0004\bt\u0010\u001cR$\u0010{\u001a\u0004\u0018\u00010v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010w\u001a\u0004\bG\u0010x\"\u0004\by\u0010zR\"\u0010}\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00105\u001a\u0004\b`\u00107\"\u0004\b|\u00109R\"\u0010\u007f\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\bd\u00107\"\u0004\b~\u00109¨\u0006\u0080\u0001"}, m88121d2 = {"Ll/djm$a;", "Ll/yhd$a;", "<init>", "()V", "Ll/h1e0;", "placeholderScaleType", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/h1e0;)Ll/djm$a;", "errorScaleType", Constants.KEY_T, "progressScaleType", "W", "Ll/djm;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/djm;", "", "p", "Ljava/lang/Integer;", "M", "()Ljava/lang/Integer;", "set_placeholderColor$options_release", "(Ljava/lang/Integer;)V", "_placeholderColor", "q", "I", "P", "()I", "set_placeholderRes$options_release", "(I)V", "_placeholderRes", "Landroid/graphics/drawable/Drawable;", "r", "Landroid/graphics/drawable/Drawable;", "N", "()Landroid/graphics/drawable/Drawable;", "set_placeholderDrawable$options_release", "(Landroid/graphics/drawable/Drawable;)V", "_placeholderDrawable", "Ll/h1e0;", "Q", "()Ll/h1e0;", "set_placeholderScaleType$options_release", "(Ll/h1e0;)V", "_placeholderScaleType", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", BloodType.f39576O, "()Landroid/graphics/PointF;", "set_placeholderFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "_placeholderFocusPoint", "", "u", "Z", "L", "()Z", "set_placeholderApplyRoundingOptions$options_release", "(Z)V", "_placeholderApplyRoundingOptions", ResourceDirection.f39656v, p7f.LATITUDE_SOUTH, "set_progressRes$options_release", "_progressRes", "w", "R", "set_progressDrawable$options_release", "_progressDrawable", BaseSei.f14624X, p7f.GPS_DIRECTION_TRUE, "set_progressScaleType$options_release", "_progressScaleType", BaseSei.f14625Y, "A", "set_errorColor$options_release", "_errorColor", BaseSei.f14626Z, "D", "set_errorRes$options_release", "_errorRes", "E", "set_errorScaleType$options_release", "_errorScaleType", "B", c4s.C_ZONE, "set_errorFocusPoint$options_release", "_errorFocusPoint", "set_errorDrawable$options_release", "_errorDrawable", "set_errorApplyRoundingOptions$options_release", "_errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "set_actualImageColorFilter$options_release", "(Landroid/graphics/ColorFilter;)V", "_actualImageColorFilter", "F", "J", "set_overlayRes$options_release", "_overlayRes", "G", "set_overlayDrawable$options_release", "_overlayDrawable", "H", "set_backgroundDrawable$options_release", "_backgroundDrawable", "U", "set_resizeToViewport$options_release", "_resizeToViewport", "set_autoPlay$options_release", "_autoPlay", "K", "set_autoStop$options_release", "_autoStop", "set_perfMediaRemountInstrumentationFix$options_release", "_perfMediaRemountInstrumentationFix", "set_fadeDurationMs$options_release", "_fadeDurationMs", "Ll/ejm;", "Ll/ejm;", "()Ll/ejm;", "set_customDrawableFactory$options_release", "(Ll/ejm;)V", "_customDrawableFactory", "set_experimentalDynamicSize$options_release", "_experimentalDynamicSize", "set_experimentalDynamicSizeWithCacheFallback$options_release", "_experimentalDynamicSizeWithCacheFallback", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C16551a extends yhd.C21600a<C16551a> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @Nullable
        public h1e0 _errorScaleType;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public PointF _errorFocusPoint;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public Drawable _errorDrawable;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public boolean _errorApplyRoundingOptions;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public ColorFilter _actualImageColorFilter;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @DrawableRes
        public int _overlayRes;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public Drawable _overlayDrawable;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @Nullable
        public Drawable _backgroundDrawable;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        public boolean _resizeToViewport;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        public boolean _autoPlay;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        public boolean _autoStop = true;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        public boolean _perfMediaRemountInstrumentationFix;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        public int _fadeDurationMs;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @Nullable
        public ejm _customDrawableFactory;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        public boolean _experimentalDynamicSize;

        /* JADX INFO: renamed from: P, reason: from kotlin metadata */
        public boolean _experimentalDynamicSizeWithCacheFallback;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @ColorInt
        @Nullable
        public Integer _placeholderColor;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @DrawableRes
        public int _placeholderRes;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public Drawable _placeholderDrawable;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public h1e0 _placeholderScaleType;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public PointF _placeholderFocusPoint;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        public boolean _placeholderApplyRoundingOptions;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @DrawableRes
        public int _progressRes;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public Drawable _progressDrawable;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public h1e0 _progressScaleType;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @ColorInt
        @Nullable
        public Integer _errorColor;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @DrawableRes
        public int _errorRes;

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final Integer get_errorColor() {
            return this._errorColor;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final Drawable get_errorDrawable() {
            return this._errorDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final PointF get_errorFocusPoint() {
            return this._errorFocusPoint;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final int get_errorRes() {
            return this._errorRes;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final h1e0 get_errorScaleType() {
            return this._errorScaleType;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean get_experimentalDynamicSize() {
            return this._experimentalDynamicSize;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean get_experimentalDynamicSizeWithCacheFallback() {
            return this._experimentalDynamicSizeWithCacheFallback;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final int get_fadeDurationMs() {
            return this._fadeDurationMs;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final Drawable get_overlayDrawable() {
            return this._overlayDrawable;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final int get_overlayRes() {
            return this._overlayRes;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean get_perfMediaRemountInstrumentationFix() {
            return this._perfMediaRemountInstrumentationFix;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean get_placeholderApplyRoundingOptions() {
            return this._placeholderApplyRoundingOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final Integer get_placeholderColor() {
            return this._placeholderColor;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final Drawable get_placeholderDrawable() {
            return this._placeholderDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final PointF get_placeholderFocusPoint() {
            return this._placeholderFocusPoint;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final int get_placeholderRes() {
            return this._placeholderRes;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final h1e0 get_placeholderScaleType() {
            return this._placeholderScaleType;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final Drawable get_progressDrawable() {
            return this._progressDrawable;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final int get_progressRes() {
            return this._progressRes;
        }

        @Nullable
        /* JADX INFO: renamed from: T, reason: from getter */
        public final h1e0 get_progressScaleType() {
            return this._progressScaleType;
        }

        /* JADX INFO: renamed from: U, reason: from getter */
        public final boolean get_resizeToViewport() {
            return this._resizeToViewport;
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final C16551a m116134V(@Nullable h1e0 placeholderScaleType) {
            this._placeholderScaleType = placeholderScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final C16551a m116135W(@Nullable h1e0 progressScaleType) {
            this._progressScaleType = progressScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public djm m116136s() {
            return new djm(this);
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C16551a m116137t(@Nullable h1e0 errorScaleType) {
            this._errorScaleType = errorScaleType;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final ColorFilter get_actualImageColorFilter() {
            return this._actualImageColorFilter;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean get_autoPlay() {
            return this._autoPlay;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean get_autoStop() {
            return this._autoStop;
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final Drawable get_backgroundDrawable() {
            return this._backgroundDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final ejm get_customDrawableFactory() {
            return this._customDrawableFactory;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean get_errorApplyRoundingOptions() {
            return this._errorApplyRoundingOptions;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C16551a c16551a = new C16551a();
        h1e0 h1e0Var = h1e0.f107451h;
        f88871Q = ((C16551a) c16551a.m116134V(h1e0Var).m116135W(h1e0Var).m116137t(h1e0Var).m165481e(Priority.HIGH)).m116136s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djm(@NotNull C16551a c16551a) {
        super(c16551a);
        c16551a.getClass();
        this.placeholderColor = c16551a.get_placeholderColor();
        this.placeholderRes = c16551a.get_placeholderRes();
        this.placeholderDrawable = c16551a.get_placeholderDrawable();
        this.placeholderScaleType = c16551a.get_placeholderScaleType();
        this.placeholderFocusPoint = c16551a.get_placeholderFocusPoint();
        this.placeholderApplyRoundingOptions = c16551a.get_placeholderApplyRoundingOptions();
        this.progressRes = c16551a.get_progressRes();
        this.progressDrawable = c16551a.get_progressDrawable();
        this.progressScaleType = c16551a.get_progressScaleType();
        this.errorColor = c16551a.get_errorColor();
        this.errorRes = c16551a.get_errorRes();
        this.errorScaleType = c16551a.get_errorScaleType();
        this.errorFocusPoint = c16551a.get_errorFocusPoint();
        this.errorDrawable = c16551a.get_errorDrawable();
        this.errorApplyRoundingOptions = c16551a.get_errorApplyRoundingOptions();
        this.actualImageColorFilter = c16551a.get_actualImageColorFilter();
        this.overlayRes = c16551a.get_overlayRes();
        this.overlayDrawable = c16551a.get_overlayDrawable();
        this.backgroundDrawable = c16551a.get_backgroundDrawable();
        this._resizeToViewport = c16551a.get_resizeToViewport();
        this.fadeDurationMs = c16551a.get_fadeDurationMs();
        this._autoPlay = c16551a.get_autoPlay();
        this._autoStop = c16551a.get_autoStop();
        this.isPerfMediaRemountInstrumentationFix = c16551a.get_perfMediaRemountInstrumentationFix();
        this.customDrawableFactory = c16551a.get_customDrawableFactory();
        this.experimentalDynamicSize = c16551a.get_experimentalDynamicSize();
        this.experimentalDynamicSizeWithCacheFallback = c16551a.get_experimentalDynamicSizeWithCacheFallback();
    }

    @Override // p153l.yhd, p153l.o0f
    @NotNull
    /* JADX INFO: renamed from: b */
    public i950.C17670a mo116112b() {
        i950.C17670a c17670aM139077b = super.mo116112b().m139077b("placeholderColor", this.placeholderColor).m139076a("placeholderRes", this.placeholderRes).m139077b("placeholderDrawable", this.placeholderDrawable).m139077b("placeholderScaleType", this.placeholderScaleType).m139077b("placeholderFocusPoint", this.placeholderFocusPoint).m139078c("placeholderApplyRoundingOptions", this.placeholderApplyRoundingOptions).m139076a("progressRes", this.progressRes).m139077b("progressDrawable", this.progressDrawable).m139077b("progressScaleType", this.progressScaleType).m139077b("errorColor", this.errorColor).m139076a("errorRes", this.errorRes).m139077b("errorScaleType", this.errorScaleType).m139077b("errorFocusPoint", this.errorFocusPoint).m139077b("errorDrawable", this.errorDrawable).m139078c("errorApplyRoundingOptions", this.errorApplyRoundingOptions).m139077b("actualImageColorFilter", this.actualImageColorFilter).m139076a("overlayRes", this.overlayRes).m139077b("overlayDrawable", this.overlayDrawable).m139077b("backgroundDrawable", this.backgroundDrawable).m139078c("resizeToViewport", this._resizeToViewport).m139078c("autoPlay", this._autoPlay).m139078c("autoStop", this._autoStop).m139078c("mPerfMediaRemountInstrumentationFix", this.isPerfMediaRemountInstrumentationFix).m139076a("fadeDurationMs", this.fadeDurationMs).m139077b("customDrawableFactory", this.customDrawableFactory);
        c17670aM139077b.getClass();
        return c17670aM139077b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a2, code lost:
    
        if (r3.errorDrawable == r4.errorDrawable) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject != null && Intrinsics.m88377d(djm.class, otherObject.getClass())) {
            djm djmVar = (djm) otherObject;
            boolean z = this.isPerfMediaRemountInstrumentationFix;
            Integer num = this.placeholderColor;
            if (z) {
                if (!Intrinsics.m88377d(num, djmVar.placeholderColor) || this.placeholderRes != djmVar.placeholderRes || !i950.m139074a(this.placeholderDrawable, djmVar.placeholderDrawable) || !i950.m139074a(this.placeholderScaleType, djmVar.placeholderScaleType) || !i950.m139074a(this.placeholderFocusPoint, djmVar.placeholderFocusPoint) || this.placeholderApplyRoundingOptions != djmVar.placeholderApplyRoundingOptions || !Intrinsics.m88377d(this.errorColor, djmVar.errorColor) || this.errorRes != djmVar.errorRes || !i950.m139074a(this.errorScaleType, djmVar.errorScaleType) || !i950.m139074a(this.errorFocusPoint, djmVar.errorFocusPoint) || this.errorApplyRoundingOptions != djmVar.errorApplyRoundingOptions || this.overlayRes != djmVar.overlayRes || !i950.m139074a(this.overlayDrawable, djmVar.overlayDrawable) || !i950.m139074a(this.errorDrawable, djmVar.errorDrawable) || this.progressRes != djmVar.progressRes || !i950.m139074a(this.progressDrawable, djmVar.progressDrawable) || !i950.m139074a(this.progressScaleType, djmVar.progressScaleType) || !i950.m139074a(this.actualImageColorFilter, djmVar.actualImageColorFilter) || this._resizeToViewport != djmVar._resizeToViewport || this.fadeDurationMs != djmVar.fadeDurationMs || this._autoPlay != djmVar._autoPlay || this._autoStop != djmVar._autoStop || !i950.m139074a(this.customDrawableFactory, djmVar.customDrawableFactory) || !i950.m139074a(this.errorDrawable, djmVar.errorDrawable) || this.isPerfMediaRemountInstrumentationFix != djmVar.isPerfMediaRemountInstrumentationFix) {
                    return false;
                }
            } else if (Intrinsics.m88377d(num, djmVar.placeholderColor)) {
                if (this.placeholderRes == djmVar.placeholderRes) {
                    if (i950.m139074a(this.placeholderDrawable, djmVar.placeholderDrawable)) {
                        if (i950.m139074a(this.placeholderScaleType, djmVar.placeholderScaleType)) {
                            if (i950.m139074a(this.placeholderFocusPoint, djmVar.placeholderFocusPoint)) {
                                if (this.placeholderApplyRoundingOptions == djmVar.placeholderApplyRoundingOptions) {
                                    if (Intrinsics.m88377d(this.errorColor, djmVar.errorColor)) {
                                        if (this.errorRes == djmVar.errorRes) {
                                            if (i950.m139074a(this.errorScaleType, djmVar.errorScaleType)) {
                                                if (i950.m139074a(this.errorFocusPoint, djmVar.errorFocusPoint)) {
                                                    if (this.errorApplyRoundingOptions == djmVar.errorApplyRoundingOptions) {
                                                        if (this.overlayRes == djmVar.overlayRes) {
                                                            if (i950.m139074a(this.overlayDrawable, djmVar.overlayDrawable)) {
                                                                if (i950.m139074a(this.errorDrawable, djmVar.errorDrawable)) {
                                                                    if (this.progressRes == djmVar.progressRes) {
                                                                        if (this.progressDrawable == djmVar.progressDrawable) {
                                                                            if (this.progressScaleType == djmVar.progressScaleType) {
                                                                                if (i950.m139074a(this.actualImageColorFilter, djmVar.actualImageColorFilter)) {
                                                                                    if (this._resizeToViewport == djmVar._resizeToViewport) {
                                                                                        if (this.fadeDurationMs == djmVar.fadeDurationMs) {
                                                                                            if (this._autoPlay == djmVar._autoPlay) {
                                                                                                if (this._autoStop == djmVar._autoStop) {
                                                                                                    if (i950.m139074a(this.customDrawableFactory, djmVar.customDrawableFactory)) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return m215944c(djmVar);
        }
        return false;
    }

    @Override // p153l.yhd, p153l.o0f
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.placeholderColor;
        int iIntValue = (((iHashCode + (num != null ? num.intValue() : 0)) * 31) + this.placeholderRes) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode2 = (iIntValue + (drawable != null ? drawable.hashCode() : 0)) * 31;
        h1e0 h1e0Var = this.placeholderScaleType;
        int iHashCode3 = (iHashCode2 + (h1e0Var != null ? h1e0Var.hashCode() : 0)) * 31;
        PointF pointF = this.placeholderFocusPoint;
        int iHashCode4 = (((iHashCode3 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.placeholderApplyRoundingOptions ? 1 : 0)) * 31;
        Integer num2 = this.errorColor;
        int iIntValue2 = (((iHashCode4 + (num2 != null ? num2.intValue() : 0)) * 31) + this.errorRes) * 31;
        h1e0 h1e0Var2 = this.errorScaleType;
        int iHashCode5 = (iIntValue2 + (h1e0Var2 != null ? h1e0Var2.hashCode() : 0)) * 31;
        PointF pointF2 = this.errorFocusPoint;
        int iHashCode6 = (iHashCode5 + (pointF2 != null ? pointF2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode7 = (((((iHashCode6 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + (this.errorApplyRoundingOptions ? 1 : 0)) * 31) + this.overlayRes) * 31;
        Drawable drawable3 = this.overlayDrawable;
        int iHashCode8 = (iHashCode7 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31;
        Drawable drawable4 = this.backgroundDrawable;
        int iHashCode9 = (iHashCode8 + (drawable4 != null ? drawable4.hashCode() : 0)) * 31;
        Drawable drawable5 = this.progressDrawable;
        int iHashCode10 = (iHashCode9 + (drawable5 != null ? drawable5.hashCode() : 0)) * 31;
        h1e0 h1e0Var3 = this.progressScaleType;
        int iHashCode11 = (iHashCode10 + (h1e0Var3 != null ? h1e0Var3.hashCode() : 0)) * 31;
        ColorFilter colorFilter = this.actualImageColorFilter;
        int iHashCode12 = (((((((((((((iHashCode11 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + (this._resizeToViewport ? 1 : 0)) * 31) + this.fadeDurationMs) * 31) + (this._autoPlay ? 1 : 0)) * 31) + (this._autoStop ? 1 : 0)) * 31) + (this.isPerfMediaRemountInstrumentationFix ? 1 : 0)) * 31) + this.progressRes) * 31;
        ejm ejmVar = this.customDrawableFactory;
        return iHashCode12 + (ejmVar != null ? ejmVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImageOptions{" + mo116112b() + "}";
    }
}
