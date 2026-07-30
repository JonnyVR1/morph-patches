package p149l;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.common.Priority;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 t2\u00020\u0001:\u0002u\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00106\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\rR\u0019\u00109\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R\u0019\u0010<\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u001c\u0010?\u001a\u0004\u0018\u00010\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0017R\u001a\u0010B\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u001a\u001a\u0004\bA\u0010\rR\u0019\u0010E\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u0019\u0010H\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u0019\u0010K\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bI\u0010\u001f\u001a\u0004\bJ\u0010!R\u0017\u0010N\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u00100\u001a\u0004\bM\u00102R\u0019\u0010T\u001a\u0004\u0018\u00010O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u001a\u001a\u0004\bV\u0010\rR\u0019\u0010Z\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010\u001f\u001a\u0004\bY\u0010!R\u0019\u0010]\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010!R\u0014\u0010^\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0017\u0010a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b_\u0010\u001a\u001a\u0004\b`\u0010\rR\u0014\u0010c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u00100R\u0014\u0010e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u00100R\u0017\u0010g\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bf\u00100\u001a\u0004\bg\u00102R\u0019\u0010m\u001a\u0004\u0018\u00010h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010p\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bn\u00100\u001a\u0004\bo\u00102R\u0017\u0010s\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bq\u00100\u001a\u0004\br\u00102¨\u0006v"}, m87232d2 = {"Ll/ahm;", "Ll/sgd;", "Ll/ahm$a;", "builder", "<init>", "(Ll/ahm$a;)V", "", "otherObject", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ll/t050$a;", "b", "()Ll/t050$a;", "p", "Ljava/lang/Integer;", "getPlaceholderColor", "()Ljava/lang/Integer;", "placeholderColor", "q", "I", "getPlaceholderRes", "placeholderRes", "Landroid/graphics/drawable/Drawable;", "r", "Landroid/graphics/drawable/Drawable;", "getPlaceholderDrawable", "()Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "Ll/ftd0;", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/ftd0;", "getPlaceholderScaleType", "()Ll/ftd0;", "placeholderScaleType", "Landroid/graphics/PointF;", Constants.KEY_T, "Landroid/graphics/PointF;", "getPlaceholderFocusPoint", "()Landroid/graphics/PointF;", "placeholderFocusPoint", "u", "Z", "getPlaceholderApplyRoundingOptions", "()Z", "placeholderApplyRoundingOptions", ResourceDirection.f38808v, "getProgressRes", "progressRes", "w", "getProgressDrawable", "progressDrawable", BaseSei.f13930X, "getProgressScaleType", "progressScaleType", BaseSei.f13931Y, "getErrorColor", "errorColor", BaseSei.f13932Z, "getErrorRes", "errorRes", "A", "getErrorScaleType", "errorScaleType", "B", "getErrorFocusPoint", "errorFocusPoint", b2s.C_ZONE, "getErrorDrawable", "errorDrawable", "D", "getErrorApplyRoundingOptions", "errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "E", "Landroid/graphics/ColorFilter;", "getActualImageColorFilter", "()Landroid/graphics/ColorFilter;", "actualImageColorFilter", "F", "getOverlayRes", "overlayRes", "G", "getOverlayDrawable", "overlayDrawable", "H", "getBackgroundDrawable", "backgroundDrawable", "_resizeToViewport", "J", "getFadeDurationMs", "fadeDurationMs", "K", "_autoPlay", "L", "_autoStop", "M", "isPerfMediaRemountInstrumentationFix", "Ll/bhm;", "N", "Ll/bhm;", "getCustomDrawableFactory", "()Ll/bhm;", "customDrawableFactory", BloodType.f38728O, "getExperimentalDynamicSize", "experimentalDynamicSize", "P", "getExperimentalDynamicSizeWithCacheFallback", "experimentalDynamicSizeWithCacheFallback", "Companion", "a", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ahm extends sgd {

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static ahm f69616Q;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final ftd0 errorScaleType;

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
    public final bhm customDrawableFactory;

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
    public final ftd0 placeholderScaleType;

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
    public final ftd0 progressScaleType;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    public final Integer errorColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @DrawableRes
    public final int errorRes;

    /* JADX INFO: renamed from: l.ahm$a */
    @Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR$\u0010B\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$R$\u0010F\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(\"\u0004\bE\u0010*R$\u0010J\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0011\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u0010\u0015R\"\u0010N\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0018\u001a\u0004\bL\u0010\u001a\"\u0004\bM\u0010\u001cR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010&\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R$\u0010U\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010-\u001a\u0004\bS\u0010/\"\u0004\bT\u00101R$\u0010W\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010 \u001a\u0004\bR\u0010\"\"\u0004\bV\u0010$R\"\u0010Y\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u00105\u001a\u0004\bK\u00107\"\u0004\bX\u00109R$\u0010_\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010[\u001a\u0004\b4\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0018\u001a\u0004\ba\u0010\u001a\"\u0004\bb\u0010\u001cR$\u0010f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010 \u001a\u0004\b\u0018\u0010\"\"\u0004\be\u0010$R$\u0010i\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010 \u001a\u0004\bC\u0010\"\"\u0004\bh\u0010$R\"\u0010l\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u00105\u001a\u0004\bj\u00107\"\u0004\bk\u00109R\"\u0010n\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u00105\u001a\u0004\b;\u00107\"\u0004\bm\u00109R\"\u0010q\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u00105\u001a\u0004\b?\u00107\"\u0004\bp\u00109R\"\u0010s\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00105\u001a\u0004\bo\u00107\"\u0004\br\u00109R\"\u0010u\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\bg\u0010\u001a\"\u0004\bt\u0010\u001cR$\u0010{\u001a\u0004\u0018\u00010v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010w\u001a\u0004\bG\u0010x\"\u0004\by\u0010zR\"\u0010}\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00105\u001a\u0004\b`\u00107\"\u0004\b|\u00109R\"\u0010\u007f\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\bd\u00107\"\u0004\b~\u00109¨\u0006\u0080\u0001"}, m87232d2 = {"Ll/ahm$a;", "Ll/sgd$a;", "<init>", "()V", "Ll/ftd0;", "placeholderScaleType", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/ftd0;)Ll/ahm$a;", "errorScaleType", Constants.KEY_T, "progressScaleType", "W", "Ll/ahm;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/ahm;", "", "p", "Ljava/lang/Integer;", "M", "()Ljava/lang/Integer;", "set_placeholderColor$options_release", "(Ljava/lang/Integer;)V", "_placeholderColor", "q", "I", "P", "()I", "set_placeholderRes$options_release", "(I)V", "_placeholderRes", "Landroid/graphics/drawable/Drawable;", "r", "Landroid/graphics/drawable/Drawable;", "N", "()Landroid/graphics/drawable/Drawable;", "set_placeholderDrawable$options_release", "(Landroid/graphics/drawable/Drawable;)V", "_placeholderDrawable", "Ll/ftd0;", "Q", "()Ll/ftd0;", "set_placeholderScaleType$options_release", "(Ll/ftd0;)V", "_placeholderScaleType", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", BloodType.f38728O, "()Landroid/graphics/PointF;", "set_placeholderFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "_placeholderFocusPoint", "", "u", "Z", "L", "()Z", "set_placeholderApplyRoundingOptions$options_release", "(Z)V", "_placeholderApplyRoundingOptions", ResourceDirection.f38808v, j6f.LATITUDE_SOUTH, "set_progressRes$options_release", "_progressRes", "w", "R", "set_progressDrawable$options_release", "_progressDrawable", BaseSei.f13930X, j6f.GPS_DIRECTION_TRUE, "set_progressScaleType$options_release", "_progressScaleType", BaseSei.f13931Y, "A", "set_errorColor$options_release", "_errorColor", BaseSei.f13932Z, "D", "set_errorRes$options_release", "_errorRes", "E", "set_errorScaleType$options_release", "_errorScaleType", "B", b2s.C_ZONE, "set_errorFocusPoint$options_release", "_errorFocusPoint", "set_errorDrawable$options_release", "_errorDrawable", "set_errorApplyRoundingOptions$options_release", "_errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "set_actualImageColorFilter$options_release", "(Landroid/graphics/ColorFilter;)V", "_actualImageColorFilter", "F", "J", "set_overlayRes$options_release", "_overlayRes", "G", "set_overlayDrawable$options_release", "_overlayDrawable", "H", "set_backgroundDrawable$options_release", "_backgroundDrawable", "U", "set_resizeToViewport$options_release", "_resizeToViewport", "set_autoPlay$options_release", "_autoPlay", "K", "set_autoStop$options_release", "_autoStop", "set_perfMediaRemountInstrumentationFix$options_release", "_perfMediaRemountInstrumentationFix", "set_fadeDurationMs$options_release", "_fadeDurationMs", "Ll/bhm;", "Ll/bhm;", "()Ll/bhm;", "set_customDrawableFactory$options_release", "(Ll/bhm;)V", "_customDrawableFactory", "set_experimentalDynamicSize$options_release", "_experimentalDynamicSize", "set_experimentalDynamicSizeWithCacheFallback$options_release", "_experimentalDynamicSizeWithCacheFallback", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15623a extends sgd.C19940a<C15623a> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @Nullable
        public ftd0 _errorScaleType;

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
        public bhm _customDrawableFactory;

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
        public ftd0 _placeholderScaleType;

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
        public ftd0 _progressScaleType;

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
        public final ftd0 get_errorScaleType() {
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
        public final ftd0 get_placeholderScaleType() {
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
        public final ftd0 get_progressScaleType() {
            return this._progressScaleType;
        }

        /* JADX INFO: renamed from: U, reason: from getter */
        public final boolean get_resizeToViewport() {
            return this._resizeToViewport;
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final C15623a m96534V(@Nullable ftd0 placeholderScaleType) {
            this._placeholderScaleType = placeholderScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final C15623a m96535W(@Nullable ftd0 progressScaleType) {
            this._progressScaleType = progressScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public ahm m96536s() {
            return new ahm(this);
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C15623a m96537t(@Nullable ftd0 errorScaleType) {
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
        public final bhm get_customDrawableFactory() {
            return this._customDrawableFactory;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean get_errorApplyRoundingOptions() {
            return this._errorApplyRoundingOptions;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C15623a c15623a = new C15623a();
        ftd0 ftd0Var = ftd0.f99184h;
        f69616Q = ((C15623a) c15623a.m96534V(ftd0Var).m96535W(ftd0Var).m96537t(ftd0Var).m147942e(Priority.HIGH)).m96536s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahm(@NotNull C15623a c15623a) {
        super(c15623a);
        c15623a.getClass();
        this.placeholderColor = c15623a.get_placeholderColor();
        this.placeholderRes = c15623a.get_placeholderRes();
        this.placeholderDrawable = c15623a.get_placeholderDrawable();
        this.placeholderScaleType = c15623a.get_placeholderScaleType();
        this.placeholderFocusPoint = c15623a.get_placeholderFocusPoint();
        this.placeholderApplyRoundingOptions = c15623a.get_placeholderApplyRoundingOptions();
        this.progressRes = c15623a.get_progressRes();
        this.progressDrawable = c15623a.get_progressDrawable();
        this.progressScaleType = c15623a.get_progressScaleType();
        this.errorColor = c15623a.get_errorColor();
        this.errorRes = c15623a.get_errorRes();
        this.errorScaleType = c15623a.get_errorScaleType();
        this.errorFocusPoint = c15623a.get_errorFocusPoint();
        this.errorDrawable = c15623a.get_errorDrawable();
        this.errorApplyRoundingOptions = c15623a.get_errorApplyRoundingOptions();
        this.actualImageColorFilter = c15623a.get_actualImageColorFilter();
        this.overlayRes = c15623a.get_overlayRes();
        this.overlayDrawable = c15623a.get_overlayDrawable();
        this.backgroundDrawable = c15623a.get_backgroundDrawable();
        this._resizeToViewport = c15623a.get_resizeToViewport();
        this.fadeDurationMs = c15623a.get_fadeDurationMs();
        this._autoPlay = c15623a.get_autoPlay();
        this._autoStop = c15623a.get_autoStop();
        this.isPerfMediaRemountInstrumentationFix = c15623a.get_perfMediaRemountInstrumentationFix();
        this.customDrawableFactory = c15623a.get_customDrawableFactory();
        this.experimentalDynamicSize = c15623a.get_experimentalDynamicSize();
        this.experimentalDynamicSizeWithCacheFallback = c15623a.get_experimentalDynamicSizeWithCacheFallback();
    }

    @Override // p149l.sgd, p149l.kze
    @NotNull
    /* JADX INFO: renamed from: b */
    public t050.C20089a mo96512b() {
        t050.C20089a c20089aM186817b = super.mo96512b().m186817b("placeholderColor", this.placeholderColor).m186816a("placeholderRes", this.placeholderRes).m186817b("placeholderDrawable", this.placeholderDrawable).m186817b("placeholderScaleType", this.placeholderScaleType).m186817b("placeholderFocusPoint", this.placeholderFocusPoint).m186818c("placeholderApplyRoundingOptions", this.placeholderApplyRoundingOptions).m186816a("progressRes", this.progressRes).m186817b("progressDrawable", this.progressDrawable).m186817b("progressScaleType", this.progressScaleType).m186817b("errorColor", this.errorColor).m186816a("errorRes", this.errorRes).m186817b("errorScaleType", this.errorScaleType).m186817b("errorFocusPoint", this.errorFocusPoint).m186817b("errorDrawable", this.errorDrawable).m186818c("errorApplyRoundingOptions", this.errorApplyRoundingOptions).m186817b("actualImageColorFilter", this.actualImageColorFilter).m186816a("overlayRes", this.overlayRes).m186817b("overlayDrawable", this.overlayDrawable).m186817b("backgroundDrawable", this.backgroundDrawable).m186818c("resizeToViewport", this._resizeToViewport).m186818c("autoPlay", this._autoPlay).m186818c("autoStop", this._autoStop).m186818c("mPerfMediaRemountInstrumentationFix", this.isPerfMediaRemountInstrumentationFix).m186816a("fadeDurationMs", this.fadeDurationMs).m186817b("customDrawableFactory", this.customDrawableFactory);
        c20089aM186817b.getClass();
        return c20089aM186817b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a2, code lost:
    
        if (r3.errorDrawable == r4.errorDrawable) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ahm.equals(java.lang.Object):boolean");
    }

    @Override // p149l.sgd, p149l.kze
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.placeholderColor;
        int iIntValue = (((iHashCode + (num != null ? num.intValue() : 0)) * 31) + this.placeholderRes) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode2 = (iIntValue + (drawable != null ? drawable.hashCode() : 0)) * 31;
        ftd0 ftd0Var = this.placeholderScaleType;
        int iHashCode3 = (iHashCode2 + (ftd0Var != null ? ftd0Var.hashCode() : 0)) * 31;
        PointF pointF = this.placeholderFocusPoint;
        int iHashCode4 = (((iHashCode3 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.placeholderApplyRoundingOptions ? 1 : 0)) * 31;
        Integer num2 = this.errorColor;
        int iIntValue2 = (((iHashCode4 + (num2 != null ? num2.intValue() : 0)) * 31) + this.errorRes) * 31;
        ftd0 ftd0Var2 = this.errorScaleType;
        int iHashCode5 = (iIntValue2 + (ftd0Var2 != null ? ftd0Var2.hashCode() : 0)) * 31;
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
        ftd0 ftd0Var3 = this.progressScaleType;
        int iHashCode11 = (iHashCode10 + (ftd0Var3 != null ? ftd0Var3.hashCode() : 0)) * 31;
        ColorFilter colorFilter = this.actualImageColorFilter;
        int iHashCode12 = (((((((((((((iHashCode11 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + (this._resizeToViewport ? 1 : 0)) * 31) + this.fadeDurationMs) * 31) + (this._autoPlay ? 1 : 0)) * 31) + (this._autoStop ? 1 : 0)) * 31) + (this.isPerfMediaRemountInstrumentationFix ? 1 : 0)) * 31) + this.progressRes) * 31;
        bhm bhmVar = this.customDrawableFactory;
        return iHashCode12 + (bhmVar != null ? bhmVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImageOptions{" + mo96512b() + "}";
    }
}
