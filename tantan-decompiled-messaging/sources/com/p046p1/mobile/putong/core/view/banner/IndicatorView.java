package com.p046p1.mobile.putong.core.view.banner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.yrm;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB-\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\u00182\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00182\u0006\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00106J\u001f\u00109\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b9\u0010,J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0016¢\u0006\u0004\b@\u0010>J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0016¢\u0006\u0004\bB\u0010>J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\n¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00002\b\b\u0001\u0010F\u001a\u00020\n¢\u0006\u0004\bG\u0010EJ\u0017\u0010I\u001a\u00020\u00002\b\b\u0001\u0010H\u001a\u00020\n¢\u0006\u0004\bI\u0010ER\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010OR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010QR\u0016\u0010T\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010SR\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010SR\u0016\u0010U\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010SR\u0016\u0010V\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010SR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010[R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0016\u0010^\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010]R\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010QR\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010QR\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010QR\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010QR\u0016\u0010A\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010QR\u0014\u0010b\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010$R\u0014\u0010e\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "Landroid/view/View;", "Ll/yrm;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", BLiveStormDanmakuGiftResourceType.f44444l, "(I)I", "heightMeasureSpec", "k", "Landroid/graphics/Canvas;", "canvas", "", "midY", "", "e", "(Landroid/graphics/Canvas;F)V", "f", "c", "g", Constants.INAPP_DATA_TAG, "h", FirebaseAnalytics.Param.INDEX, RXScreenCaptureService.KEY_INDEX, "(I)F", "getRatioSelectedRadius", "()F", "j", "dp", "b", "(F)I", "pagerCount", "currentPage", "a", "(II)V", "Landroid/widget/RelativeLayout$LayoutParams;", "getIndicatorParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "position", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "onMeasure", "onDraw", "(Landroid/graphics/Canvas;)V", "indicatorRadius", "n", "(F)Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "indicatorSelectedRatio", "o", "indicatorSpacing", "q", "indicatorStyle", "r", "(I)Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "indicatorColor", "m", "indicatorSelectorColor", "p", "Landroid/view/animation/Interpolator;", "Landroid/view/animation/Interpolator;", "interpolator", "accelerateInterpolator", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "F", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "I", "selectedPage", "unColor", "selectedColor", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "indicatorPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "Landroid/widget/RelativeLayout$LayoutParams;", CommandMessage.PARAMS, "indicatorRatio", "indicatorSelectedRadius", "getRatioRadius", "ratioRadius", "getView", "()Landroid/view/View;", OMSTemplateModeType.view, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IndicatorView extends View implements yrm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Interpolator interpolator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Interpolator accelerateInterpolator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Path path;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float offset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int selectedPage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int pagerCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int unColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int selectedColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint indicatorPaint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final RectF rectF;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int indicatorStyle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public RelativeLayout.LayoutParams params;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float indicatorRadius;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float indicatorRatio;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float indicatorSelectedRadius;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float indicatorSelectedRatio;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float indicatorSpacing;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.IndicatorView$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/IndicatorView$a;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface InterfaceC9170a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f38664a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.IndicatorView$a$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/IndicatorView$a$a;", "", "<init>", "()V", "", "b", "I", "c", "()I", "setINDICATOR_CIRCLE", "(I)V", "INDICATOR_CIRCLE", Constants.INAPP_DATA_TAG, "setINDICATOR_CIRCLE_RECT", "INDICATOR_CIRCLE_RECT", "a", "setINDICATOR_BEZIER", "INDICATOR_BEZIER", "e", "setINDICATOR_DASH", "INDICATOR_DASH", "f", "setINDICATOR_BIG_CIRCLE", "INDICATOR_BIG_CIRCLE", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public static int INDICATOR_CIRCLE;

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f38664a = new Companion();

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            public static int INDICATOR_CIRCLE_RECT = 1;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public static int INDICATOR_BEZIER = 2;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public static int INDICATOR_DASH = 3;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            public static int INDICATOR_BIG_CIRCLE = 4;

            /* JADX INFO: renamed from: a */
            public final int m59628a() {
                return INDICATOR_BEZIER;
            }

            /* JADX INFO: renamed from: b */
            public final int m59629b() {
                return INDICATOR_BIG_CIRCLE;
            }

            /* JADX INFO: renamed from: c */
            public final int m59630c() {
                return INDICATOR_CIRCLE;
            }

            /* JADX INFO: renamed from: d */
            public final int m59631d() {
                return INDICATOR_CIRCLE_RECT;
            }

            /* JADX INFO: renamed from: e */
            public final int m59632e() {
                return INDICATOR_DASH;
            }
        }
    }

    public IndicatorView(@Nullable Context context) {
        super(context);
        this.interpolator = new DecelerateInterpolator();
        this.unColor = -7829368;
        this.selectedColor = -1;
        this.indicatorRadius = m59611b(3.5f);
        this.indicatorRatio = 1.0f;
        this.indicatorSelectedRadius = m59611b(3.5f);
        this.indicatorSelectedRatio = 1.0f;
        this.indicatorSpacing = m59611b(10.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(12);
        this.params.addRule(14);
        this.params.bottomMargin = m59611b(10.0f);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.indicatorPaint = paint;
        paint.setAntiAlias(true);
    }

    private final float getRatioRadius() {
        return this.indicatorRadius * this.indicatorRatio;
    }

    private final float getRatioSelectedRadius() {
        return this.indicatorSelectedRadius * this.indicatorSelectedRatio;
    }

    @Override // p149l.yrm
    /* JADX INFO: renamed from: a */
    public void mo59610a(int pagerCount, int currentPage) {
        this.pagerCount = pagerCount;
        setVisibility(pagerCount > 1 ? 0 : 8);
        requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public final int m59611b(float dp) {
        return (int) (dp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: c */
    public final void m59612c(Canvas canvas, float midY) {
        m59617h(canvas, midY);
        if (this.path == null) {
            this.path = new Path();
        }
        if (this.accelerateInterpolator == null) {
            this.accelerateInterpolator = new AccelerateInterpolator();
        }
        float fM59618i = m59618i(this.selectedPage);
        float fM59618i2 = m59618i((this.selectedPage + 1) % this.pagerCount) - fM59618i;
        Interpolator interpolator = this.accelerateInterpolator;
        interpolator.getClass();
        float interpolation = (interpolator.getInterpolation(this.offset) * fM59618i2) + fM59618i;
        float fM59619j = fM59618i + (fM59618i2 * m59619j());
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = this.indicatorSelectedRadius * 0.57f;
        float f2 = this.indicatorSelectedRatio * f;
        float fM59619j2 = ((f2 - ratioSelectedRadius) * m59619j()) + ratioSelectedRadius;
        Interpolator interpolator2 = this.accelerateInterpolator;
        interpolator2.getClass();
        float interpolation2 = f2 + ((ratioSelectedRadius - f2) * interpolator2.getInterpolation(this.offset));
        float fM59619j3 = (this.indicatorSelectedRadius - f) * m59619j();
        float f3 = this.indicatorSelectedRadius - f;
        Interpolator interpolator3 = this.accelerateInterpolator;
        interpolator3.getClass();
        float interpolation3 = f3 * interpolator3.getInterpolation(this.offset);
        this.indicatorPaint.setColor(this.selectedColor);
        float f4 = this.indicatorSelectedRadius;
        this.rectF.set(interpolation - fM59619j2, (midY - f4) + fM59619j3, interpolation + fM59619j2, (f4 + midY) - fM59619j3);
        canvas.drawRoundRect(this.rectF, fM59619j2, fM59619j2, this.indicatorPaint);
        float f5 = (midY - f) - interpolation3;
        float f6 = f + midY + interpolation3;
        this.rectF.set(fM59619j - interpolation2, f5, fM59619j + interpolation2, f6);
        canvas.drawRoundRect(this.rectF, interpolation2, interpolation2, this.indicatorPaint);
        Path path = this.path;
        path.getClass();
        path.reset();
        Path path2 = this.path;
        path2.getClass();
        path2.moveTo(fM59619j, midY);
        Path path3 = this.path;
        path3.getClass();
        path3.lineTo(fM59619j, f5);
        Path path4 = this.path;
        path4.getClass();
        float f7 = ((interpolation - fM59619j) / 2.0f) + fM59619j;
        path4.quadTo(f7, midY, interpolation, (midY - this.indicatorSelectedRadius) + fM59619j3);
        Path path5 = this.path;
        path5.getClass();
        path5.lineTo(interpolation, (this.indicatorSelectedRadius + midY) - fM59619j3);
        Path path6 = this.path;
        path6.getClass();
        path6.quadTo(f7, midY, fM59619j, f6);
        Path path7 = this.path;
        path7.getClass();
        path7.close();
        Path path8 = this.path;
        path8.getClass();
        canvas.drawPath(path8, this.indicatorPaint);
    }

    /* JADX INFO: renamed from: d */
    public final void m59613d(Canvas canvas, float midY) {
        m59617h(canvas, midY);
        float fM59619j = m59619j();
        float fM59618i = m59618i(this.selectedPage);
        float fM59618i2 = m59618i((this.selectedPage + 1) % this.pagerCount);
        float ratioRadius = getRatioRadius();
        float f = this.indicatorSelectedRadius;
        float f2 = this.indicatorSelectedRatio * f;
        float f3 = (f2 - ratioRadius) * fM59619j;
        float f4 = f2 - f3;
        float f5 = ratioRadius + f3;
        float f6 = (f - this.indicatorRadius) * fM59619j;
        this.indicatorPaint.setColor(this.selectedColor);
        if (fM59619j < 0.99f) {
            RectF rectF = this.rectF;
            rectF.set(fM59618i - f4, (midY - f) + f6, fM59618i + f4, (f + midY) - f6);
            canvas.drawRoundRect(this.rectF, f4, f4, this.indicatorPaint);
        }
        if (fM59619j > 0.1f) {
            float f7 = this.indicatorRadius;
            float f8 = midY + f7 + f6;
            RectF rectF2 = this.rectF;
            rectF2.set(fM59618i2 - f5, (midY - f7) - f6, fM59618i2 + f5, f8);
            canvas.drawRoundRect(this.rectF, f5, f5, this.indicatorPaint);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m59614e(Canvas canvas, float midY) {
        m59617h(canvas, midY);
        float fM59618i = m59618i(this.selectedPage);
        float fM59618i2 = m59618i((this.selectedPage + 1) % this.pagerCount);
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = fM59618i - ratioSelectedRadius;
        float f2 = fM59618i + ratioSelectedRadius;
        float f3 = fM59618i2 - ratioSelectedRadius;
        float fM59619j = f + ((f3 - f) * m59619j());
        float fM59619j2 = f2 + (((fM59618i2 + ratioSelectedRadius) - f2) * m59619j());
        RectF rectF = this.rectF;
        float f4 = this.indicatorSelectedRadius;
        rectF.set(fM59619j, midY - f4, fM59619j2, midY + f4);
        this.indicatorPaint.setColor(this.selectedColor);
        RectF rectF2 = this.rectF;
        float f5 = this.indicatorSelectedRadius;
        canvas.drawRoundRect(rectF2, f5, f5, this.indicatorPaint);
    }

    /* JADX INFO: renamed from: f */
    public final void m59615f(Canvas canvas, float midY) {
        float fMax;
        float fMin;
        m59617h(canvas, midY);
        float fM59618i = m59618i(this.selectedPage);
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = fM59618i - ratioSelectedRadius;
        float f2 = fM59618i + ratioSelectedRadius;
        float fM59619j = m59619j();
        float fMax2 = this.indicatorSpacing + (Math.max(ratioSelectedRadius, ratioSelectedRadius) * 2.0f);
        int i = this.selectedPage;
        if ((i + 1) % this.pagerCount == 0) {
            float f3 = fMax2 * (-i);
            fMax = f + Math.max(f3 * fM59619j * 2.0f, f3);
            fMin = Math.min(f3 * (fM59619j - 0.5f) * 2.0f, 0.0f);
        } else {
            fMax = f + Math.max((fM59619j - 0.5f) * fMax2 * 2.0f, 0.0f);
            fMin = Math.min(fM59619j * fMax2 * 2.0f, fMax2);
        }
        float f4 = f2 + fMin;
        RectF rectF = this.rectF;
        float f5 = this.indicatorSelectedRadius;
        rectF.set(fMax, midY - f5, f4, midY + f5);
        this.indicatorPaint.setColor(this.selectedColor);
        RectF rectF2 = this.rectF;
        float f6 = this.indicatorSelectedRadius;
        canvas.drawRoundRect(rectF2, f6, f6, this.indicatorPaint);
    }

    /* JADX INFO: renamed from: g */
    public final void m59616g(Canvas canvas, float midY) {
        float fM59619j = m59619j();
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float f = ratioSelectedRadius - ratioRadius;
        float f2 = f * fM59619j;
        boolean z = true;
        int i = (this.selectedPage + 1) % this.pagerCount;
        int i2 = 0;
        boolean z2 = i == 0;
        this.indicatorPaint.setColor(this.unColor);
        int i3 = this.pagerCount;
        while (i2 < i3) {
            float fM59618i = m59618i(i2);
            if (z2) {
                fM59618i += f2;
            }
            float f3 = fM59618i - ratioRadius;
            float f4 = this.indicatorRadius;
            float f5 = midY - f4;
            float f6 = fM59618i + ratioRadius;
            float f7 = midY + f4;
            boolean z3 = z;
            int i4 = this.selectedPage + 1;
            float f8 = fM59619j;
            RectF rectF = this.rectF;
            if (i4 <= i2) {
                rectF.set(f3 + f, f5, f6 + f, f7);
            } else {
                rectF.set(f3, f5, f6, f7);
            }
            RectF rectF2 = this.rectF;
            float f9 = this.indicatorRadius;
            canvas.drawRoundRect(rectF2, f9, f9, this.indicatorPaint);
            i2++;
            z = z3;
            fM59619j = f8;
        }
        float f10 = fM59619j;
        this.indicatorPaint.setColor(this.selectedColor);
        if (f10 < 0.99f) {
            float fM59618i2 = m59618i(this.selectedPage) - ratioSelectedRadius;
            if (z2) {
                fM59618i2 += f2;
            }
            RectF rectF3 = this.rectF;
            float f11 = this.indicatorSelectedRadius;
            rectF3.set(fM59618i2, midY - f11, (((ratioSelectedRadius * 2.0f) + fM59618i2) + f) - f2, midY + f11);
            RectF rectF4 = this.rectF;
            float f12 = this.indicatorSelectedRadius;
            canvas.drawRoundRect(rectF4, f12, f12, this.indicatorPaint);
        }
        if (f10 > 0.1f) {
            float fM59618i3 = m59618i(i) + ratioSelectedRadius;
            if (z2) {
                f = f2;
            }
            float f13 = fM59618i3 + f;
            RectF rectF5 = this.rectF;
            float f14 = this.indicatorSelectedRadius;
            rectF5.set((f13 - (ratioSelectedRadius * 2.0f)) - f2, midY - f14, f13, midY + f14);
            RectF rectF6 = this.rectF;
            float f15 = this.indicatorSelectedRadius;
            canvas.drawRoundRect(rectF6, f15, f15, this.indicatorPaint);
        }
    }

    @Override // p149l.yrm
    @NotNull
    /* JADX INFO: renamed from: getIndicatorParams, reason: from getter */
    public RelativeLayout.LayoutParams getParams() {
        return this.params;
    }

    @Override // p149l.yrm
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m59617h(Canvas canvas, float midY) {
        this.indicatorPaint.setColor(this.unColor);
        int i = this.pagerCount;
        for (int i2 = 0; i2 < i; i2++) {
            float fM59618i = m59618i(i2);
            float ratioRadius = getRatioRadius();
            float f = this.indicatorRadius;
            this.rectF.set(fM59618i - ratioRadius, midY - f, fM59618i + ratioRadius, f + midY);
            RectF rectF = this.rectF;
            float f2 = this.indicatorRadius;
            canvas.drawRoundRect(rectF, f2, f2, this.indicatorPaint);
        }
    }

    /* JADX INFO: renamed from: i */
    public final float m59618i(int index) {
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioRadius, getRatioSelectedRadius());
        return getPaddingLeft() + fMax + (((fMax * 2.0f) + this.indicatorSpacing) * index) + (this.indicatorStyle == InterfaceC9170a.INSTANCE.m59632e() ? 0.0f : (fMax - ratioRadius) / 2.0f);
    }

    /* JADX INFO: renamed from: j */
    public final float m59619j() {
        return this.interpolator.getInterpolation(this.offset);
    }

    /* JADX INFO: renamed from: k */
    public final int m59620k(int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (int) ((Math.max(getRatioSelectedRadius(), getRatioRadius()) * 2.0f) + getPaddingTop() + getPaddingBottom());
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: l */
    public final int m59621l(int widthMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioSelectedRadius, ratioRadius) * 2.0f;
        int i = this.pagerCount;
        return (int) ((fMax * i) + ((i - 1) * this.indicatorSpacing) + (ratioSelectedRadius - ratioRadius) + getPaddingLeft() + getPaddingRight());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final IndicatorView m59622m(@ColorInt int indicatorColor) {
        this.unColor = indicatorColor;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final IndicatorView m59623n(float indicatorRadius) {
        int iM59611b = m59611b(indicatorRadius);
        if (this.indicatorRadius == this.indicatorSelectedRadius) {
            this.indicatorSelectedRadius = iM59611b;
        }
        this.indicatorRadius = iM59611b;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final IndicatorView m59624o(float indicatorSelectedRatio) {
        this.indicatorSelectedRatio = indicatorSelectedRatio;
        return this;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.pagerCount == 0) {
            return;
        }
        float height = (getHeight() / 2.0f) + 0.5f;
        int i = this.indicatorStyle;
        InterfaceC9170a.Companion companion = InterfaceC9170a.INSTANCE;
        if (i == companion.m59630c()) {
            m59614e(canvas, height);
            return;
        }
        if (i == companion.m59631d()) {
            m59615f(canvas, height);
            return;
        }
        if (i == companion.m59628a()) {
            m59612c(canvas, height);
        } else if (i == companion.m59632e()) {
            m59616g(canvas, height);
        } else if (i == companion.m59629b()) {
            m59613d(canvas, height);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(m59621l(widthMeasureSpec), m59620k(heightMeasureSpec));
    }

    @Override // p149l.yrm
    public void onPageScrollStateChanged(int state) {
    }

    @Override // p149l.yrm
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.selectedPage = position;
        this.offset = positionOffset;
        invalidate();
    }

    @Override // p149l.yrm
    public void onPageSelected(int position) {
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final IndicatorView m59625p(@ColorInt int indicatorSelectorColor) {
        this.selectedColor = indicatorSelectorColor;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final IndicatorView m59626q(float indicatorSpacing) {
        this.indicatorSpacing = m59611b(indicatorSpacing);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final IndicatorView m59627r(int indicatorStyle) {
        this.indicatorStyle = indicatorStyle;
        return this;
    }

    public IndicatorView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interpolator = new DecelerateInterpolator();
        this.unColor = -7829368;
        this.selectedColor = -1;
        this.indicatorRadius = m59611b(3.5f);
        this.indicatorRatio = 1.0f;
        this.indicatorSelectedRadius = m59611b(3.5f);
        this.indicatorSelectedRatio = 1.0f;
        this.indicatorSpacing = m59611b(10.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(12);
        this.params.addRule(14);
        this.params.bottomMargin = m59611b(10.0f);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.indicatorPaint = paint;
        paint.setAntiAlias(true);
    }

    public IndicatorView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.interpolator = new DecelerateInterpolator();
        this.unColor = -7829368;
        this.selectedColor = -1;
        this.indicatorRadius = m59611b(3.5f);
        this.indicatorRatio = 1.0f;
        this.indicatorSelectedRadius = m59611b(3.5f);
        this.indicatorSelectedRatio = 1.0f;
        this.indicatorSpacing = m59611b(10.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(12);
        this.params.addRule(14);
        this.params.bottomMargin = m59611b(10.0f);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.indicatorPaint = paint;
        paint.setAntiAlias(true);
    }

    public IndicatorView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.interpolator = new DecelerateInterpolator();
        this.unColor = -7829368;
        this.selectedColor = -1;
        this.indicatorRadius = m59611b(3.5f);
        this.indicatorRatio = 1.0f;
        this.indicatorSelectedRadius = m59611b(3.5f);
        this.indicatorSelectedRatio = 1.0f;
        this.indicatorSpacing = m59611b(10.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(12);
        this.params.addRule(14);
        this.params.bottomMargin = m59611b(10.0f);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.indicatorPaint = paint;
        paint.setAntiAlias(true);
    }
}
