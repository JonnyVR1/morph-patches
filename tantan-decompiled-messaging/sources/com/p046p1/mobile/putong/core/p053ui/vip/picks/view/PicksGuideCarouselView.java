package com.p046p1.mobile.putong.core.p053ui.vip.picks.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksGuideCarouselView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e51;
import p149l.k6c0;
import p149l.o7r;
import p149l.t100;
import p149l.x4c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\fJ#\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\fJ\u001f\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010\fR\u001a\u0010.\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001a\u00104\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001a\u00107\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b8\u0010-R\u001a\u0010;\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b:\u0010-R\u001a\u0010=\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b<\u0010-R\u001a\u0010B\u001a\u00020>8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\u00020>8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\bC\u0010AR\u001a\u0010F\u001a\u00020>8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bE\u0010AR\u001a\u0010H\u001a\u00020>8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bG\u0010AR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010IR\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010IR\u0016\u0010L\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010IR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010V\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006a"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j", "()V", "g", "Lkotlin/Pair;", "Lcom/p1/mobile/putong/data/User;", "k", "()Lkotlin/Pair;", "current", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselItemView;", OMSTemplateModeType.view, "Landroid/animation/Animator;", "h", "(ILcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselItemView;)Landroid/animation/Animator;", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselItemView;)Landroid/animation/Animator;", "e", "f", "onFinishInflate", "", "showFemaleStyle", "", "carouselUsers", BLiveStormDanmakuGiftResourceType.f44444l, "(ZLjava/util/List;)V", "m", "n", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDetachedFromWindow", "a", "I", "getSTATE_FADE_OUT", "()I", "STATE_FADE_OUT", "b", "getSTATE_NORMAL", "STATE_NORMAL", "c", "getSTATE_FADE_IN", "STATE_FADE_IN", Constants.INAPP_DATA_TAG, "getPadding", "padding", "getImageSize", "imageSize", "getImageOffset", "imageOffset", "getImageBorder", "imageBorder", "", "J", "getDuration", "()J", BLiveOperationTitleShowType.duration, "getFadeInDuration", "fadeInDuration", "getCarouselInternal", "carouselInternal", "getStartDelay", "startDelay", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksGuideCarouselItemView;", "carouselItemView1", "carouselItemView2", "carouselItemView3", "Landroid/animation/AnimatorSet;", "o", "Landroid/animation/AnimatorSet;", "carouselAnimatorSet", "Ljava/lang/Runnable;", "p", "Ljava/lang/Runnable;", "getCarouselAnimRunnable", "()Ljava/lang/Runnable;", "carouselAnimRunnable", "q", "Ljava/util/List;", "r", "Z", "Landroid/view/animation/DecelerateInterpolator;", BLiveStormDanmakuGiftResourceType.f44446s, "Landroid/view/animation/DecelerateInterpolator;", "getInterpolator", "()Landroid/view/animation/DecelerateInterpolator;", "interpolator", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PicksGuideCarouselView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int STATE_FADE_OUT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int STATE_NORMAL;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int STATE_FADE_IN;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int padding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int imageSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int imageOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int imageBorder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long duration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long fadeInDuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long carouselInternal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long startDelay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public PicksGuideCarouselItemView carouselItemView1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public PicksGuideCarouselItemView carouselItemView2;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public PicksGuideCarouselItemView carouselItemView3;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet carouselAnimatorSet;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Runnable carouselAnimRunnable;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public List<? extends User> carouselUsers;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean showFemaleStyle;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final DecelerateInterpolator interpolator;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.view.PicksGuideCarouselView$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, m87232d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, m87233k = 1, m87234mv = {2, 2, 0})
    @SourceDebugExtension
    public static final class C8971a implements Animator.AnimatorListener {
        public C8971a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            animator.getClass();
            e51.m114743H(PicksGuideCarouselView.this.getContext(), PicksGuideCarouselView.this.getCarouselAnimRunnable(), PicksGuideCarouselView.this.getCarouselInternal());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            animator.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.STATE_FADE_OUT = -1;
        this.STATE_FADE_IN = 1;
        this.padding = t100.f167262k;
        this.imageSize = t100.m186890d(44.0f);
        this.imageOffset = t100.f167260i;
        this.imageBorder = t100.f167254c;
        this.duration = 600L;
        this.fadeInDuration = 400L;
        this.carouselInternal = 400L;
        this.startDelay = 1200L;
        this.carouselAnimRunnable = new Runnable() { // from class: l.ce70
            @Override // java.lang.Runnable
            public final void run() {
                PicksGuideCarouselView.m56797a(this.f80439a);
            }
        };
        this.showFemaleStyle = true;
        this.interpolator = new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static void m56797a(PicksGuideCarouselView picksGuideCarouselView) {
        picksGuideCarouselView.m56806j();
    }

    /* JADX INFO: renamed from: b */
    public static void m56798b(FrameLayout.LayoutParams layoutParams, PicksGuideCarouselView picksGuideCarouselView, PicksGuideCarouselItemView picksGuideCarouselItemView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        layoutParams.leftMargin = (int) (picksGuideCarouselView.padding + ((picksGuideCarouselView.imageSize - picksGuideCarouselView.imageOffset) * (1.0f - valueAnimator.getAnimatedFraction())));
        picksGuideCarouselItemView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static void m56799c(FrameLayout.LayoutParams layoutParams, int i, int i2, PicksGuideCarouselItemView picksGuideCarouselItemView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        layoutParams.leftMargin = (int) (i + ((i2 - i) * (1.0f - animatedFraction)));
        picksGuideCarouselItemView.setLayoutParams(layoutParams);
        picksGuideCarouselItemView.setAlpha(animatedFraction);
        float f = (animatedFraction / 2.0f) + 0.5f;
        picksGuideCarouselItemView.setScaleX(f);
        picksGuideCarouselItemView.setScaleY(f);
    }

    /* JADX INFO: renamed from: d */
    public static void m56800d(PicksGuideCarouselView picksGuideCarouselView, FrameLayout.LayoutParams layoutParams, PicksGuideCarouselItemView picksGuideCarouselItemView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        int i = picksGuideCarouselView.imageSize;
        layoutParams.leftMargin = (int) (((-i) / 2) + ((picksGuideCarouselView.padding + (i / 2)) * animatedFraction));
        picksGuideCarouselItemView.setLayoutParams(layoutParams);
        picksGuideCarouselItemView.setAlpha(animatedFraction);
        picksGuideCarouselItemView.setScaleX(animatedFraction);
        picksGuideCarouselItemView.setScaleY(animatedFraction);
    }

    /* JADX INFO: renamed from: e */
    public final Animator m56801e(final PicksGuideCarouselItemView view) {
        view.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_NORMAL));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fe70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PicksGuideCarouselView.m56798b(layoutParams2, this, view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(this.interpolator);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final Animator m56802f(final PicksGuideCarouselItemView view) {
        Pair<Integer, User> pairM56807k = m56807k();
        int iIntValue = pairM56807k.component1().intValue();
        User userComponent2 = pairM56807k.component2();
        view.setTag(x4c0.f191014y, Integer.valueOf(iIntValue));
        view.m56796b(this.showFemaleStyle, userComponent2);
        view.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_FADE_IN));
        view.bringToFront();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        final int i = (this.padding + this.imageSize) - this.imageOffset;
        final int width = getWidth() - this.imageSize;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ee70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PicksGuideCarouselView.m56799c(layoutParams2, i, width, view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.fadeInDuration);
        valueAnimatorOfFloat.setStartDelay(this.duration - this.fadeInDuration);
        valueAnimatorOfFloat.setInterpolator(this.interpolator);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: g */
    public final void m56803g() {
        View viewInflate = o7r.m163037a(getContext()).inflate(k6c0.f121363b1, (ViewGroup) this, false);
        viewInflate.getClass();
        this.carouselItemView1 = (PicksGuideCarouselItemView) viewInflate;
        int i = this.imageSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.leftMargin = this.padding;
        PicksGuideCarouselItemView picksGuideCarouselItemView = this.carouselItemView1;
        View view = null;
        if (picksGuideCarouselItemView == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView = null;
        }
        picksGuideCarouselItemView.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_NORMAL));
        View view2 = this.carouselItemView1;
        if (view2 == null) {
            Intrinsics.m87502r("carouselItemView1");
            view2 = null;
        }
        addView(view2, layoutParams);
        View viewInflate2 = o7r.m163037a(getContext()).inflate(k6c0.f121363b1, (ViewGroup) this, false);
        viewInflate2.getClass();
        this.carouselItemView2 = (PicksGuideCarouselItemView) viewInflate2;
        int i2 = this.imageSize;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.leftMargin = (this.padding + this.imageSize) - this.imageOffset;
        PicksGuideCarouselItemView picksGuideCarouselItemView2 = this.carouselItemView2;
        if (picksGuideCarouselItemView2 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView2 = null;
        }
        picksGuideCarouselItemView2.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_FADE_IN));
        View view3 = this.carouselItemView2;
        if (view3 == null) {
            Intrinsics.m87502r("carouselItemView2");
            view3 = null;
        }
        addView(view3, layoutParams2);
        View viewInflate3 = o7r.m163037a(getContext()).inflate(k6c0.f121363b1, (ViewGroup) this, false);
        viewInflate3.getClass();
        this.carouselItemView3 = (PicksGuideCarouselItemView) viewInflate3;
        int i3 = this.imageSize;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams3.leftMargin = getWidth() - this.imageSize;
        PicksGuideCarouselItemView picksGuideCarouselItemView3 = this.carouselItemView3;
        if (picksGuideCarouselItemView3 == null) {
            Intrinsics.m87502r("carouselItemView3");
            picksGuideCarouselItemView3 = null;
        }
        picksGuideCarouselItemView3.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_FADE_OUT));
        View view4 = this.carouselItemView3;
        if (view4 == null) {
            Intrinsics.m87502r("carouselItemView3");
        } else {
            view = view4;
        }
        addView(view, layoutParams3);
    }

    @NotNull
    public final Runnable getCarouselAnimRunnable() {
        return this.carouselAnimRunnable;
    }

    public final long getCarouselInternal() {
        return this.carouselInternal;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getFadeInDuration() {
        return this.fadeInDuration;
    }

    public final int getImageBorder() {
        return this.imageBorder;
    }

    public final int getImageOffset() {
        return this.imageOffset;
    }

    public final int getImageSize() {
        return this.imageSize;
    }

    @NotNull
    public final DecelerateInterpolator getInterpolator() {
        return this.interpolator;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final int getSTATE_FADE_IN() {
        return this.STATE_FADE_IN;
    }

    public final int getSTATE_FADE_OUT() {
        return this.STATE_FADE_OUT;
    }

    public final int getSTATE_NORMAL() {
        return this.STATE_NORMAL;
    }

    public final long getStartDelay() {
        return this.startDelay;
    }

    /* JADX INFO: renamed from: h */
    public final Animator m56804h(int current, PicksGuideCarouselItemView view) {
        int i = this.STATE_NORMAL;
        int i2 = this.STATE_FADE_OUT;
        if (current != i) {
            i2 = current == i2 ? this.STATE_FADE_IN : i;
        }
        if (i2 == i) {
            return m56801e(view);
        }
        return i2 == this.STATE_FADE_OUT ? m56805i(view) : m56802f(view);
    }

    /* JADX INFO: renamed from: i */
    public final Animator m56805i(final PicksGuideCarouselItemView view) {
        view.setTag(x4c0.f191013x, Integer.valueOf(this.STATE_FADE_OUT));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.de70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PicksGuideCarouselView.m56800d(this.f85762a, layoutParams2, view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(this.duration);
        valueAnimatorOfFloat.setInterpolator(this.interpolator);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: j */
    public final void m56806j() {
        PicksGuideCarouselItemView picksGuideCarouselItemView = this.carouselItemView1;
        PicksGuideCarouselItemView picksGuideCarouselItemView2 = null;
        if (picksGuideCarouselItemView == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView = null;
        }
        Object tag = picksGuideCarouselItemView.getTag(x4c0.f191013x);
        tag.getClass();
        int iIntValue = ((Integer) tag).intValue();
        PicksGuideCarouselItemView picksGuideCarouselItemView3 = this.carouselItemView1;
        if (picksGuideCarouselItemView3 == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView3 = null;
        }
        Animator animatorM56804h = m56804h(iIntValue, picksGuideCarouselItemView3);
        PicksGuideCarouselItemView picksGuideCarouselItemView4 = this.carouselItemView2;
        if (picksGuideCarouselItemView4 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView4 = null;
        }
        Object tag2 = picksGuideCarouselItemView4.getTag(x4c0.f191013x);
        tag2.getClass();
        int iIntValue2 = ((Integer) tag2).intValue();
        PicksGuideCarouselItemView picksGuideCarouselItemView5 = this.carouselItemView2;
        if (picksGuideCarouselItemView5 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView5 = null;
        }
        Animator animatorM56804h2 = m56804h(iIntValue2, picksGuideCarouselItemView5);
        PicksGuideCarouselItemView picksGuideCarouselItemView6 = this.carouselItemView3;
        if (picksGuideCarouselItemView6 == null) {
            Intrinsics.m87502r("carouselItemView3");
            picksGuideCarouselItemView6 = null;
        }
        Object tag3 = picksGuideCarouselItemView6.getTag(x4c0.f191013x);
        tag3.getClass();
        int iIntValue3 = ((Integer) tag3).intValue();
        PicksGuideCarouselItemView picksGuideCarouselItemView7 = this.carouselItemView3;
        if (picksGuideCarouselItemView7 == null) {
            Intrinsics.m87502r("carouselItemView3");
        } else {
            picksGuideCarouselItemView2 = picksGuideCarouselItemView7;
        }
        Animator animatorM56804h3 = m56804h(iIntValue3, picksGuideCarouselItemView2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.carouselAnimatorSet = animatorSet;
        animatorSet.playTogether(animatorM56804h, animatorM56804h2, animatorM56804h3);
        animatorSet.addListener(new C8971a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: k */
    public final Pair<Integer, User> m56807k() {
        int iNextInt;
        PicksGuideCarouselItemView picksGuideCarouselItemView = this.carouselItemView1;
        List<? extends User> list = null;
        if (picksGuideCarouselItemView == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView = null;
        }
        Integer num = (Integer) picksGuideCarouselItemView.getTag(x4c0.f191014y);
        PicksGuideCarouselItemView picksGuideCarouselItemView2 = this.carouselItemView2;
        if (picksGuideCarouselItemView2 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView2 = null;
        }
        Integer num2 = (Integer) picksGuideCarouselItemView2.getTag(x4c0.f191014y);
        PicksGuideCarouselItemView picksGuideCarouselItemView3 = this.carouselItemView3;
        if (picksGuideCarouselItemView3 == null) {
            Intrinsics.m87502r("carouselItemView3");
            picksGuideCarouselItemView3 = null;
        }
        Integer num3 = (Integer) picksGuideCarouselItemView3.getTag(x4c0.f191014y);
        while (true) {
            Random.Companion companion = Random.INSTANCE;
            List<? extends User> list2 = this.carouselUsers;
            if (list2 == null) {
                Intrinsics.m87502r("carouselUsers");
                list2 = null;
            }
            iNextInt = companion.nextInt(list2.size());
            if (num == null || iNextInt != num.intValue()) {
                if (num2 == null || iNextInt != num2.intValue()) {
                    if (num3 == null || iNextInt != num3.intValue()) {
                        break;
                    }
                }
            }
        }
        List<? extends User> list3 = this.carouselUsers;
        if (list3 == null) {
            Intrinsics.m87502r("carouselUsers");
        } else {
            list = list3;
        }
        return new Pair<>(Integer.valueOf(iNextInt), list.get(iNextInt));
    }

    /* JADX INFO: renamed from: l */
    public final void m56808l(boolean showFemaleStyle, @NotNull List<? extends User> carouselUsers) {
        carouselUsers.getClass();
        this.showFemaleStyle = showFemaleStyle;
        this.carouselUsers = carouselUsers;
        Pair<Integer, User> pairM56807k = m56807k();
        int iIntValue = pairM56807k.component1().intValue();
        User userComponent2 = pairM56807k.component2();
        PicksGuideCarouselItemView picksGuideCarouselItemView = this.carouselItemView1;
        PicksGuideCarouselItemView picksGuideCarouselItemView2 = null;
        if (picksGuideCarouselItemView == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView = null;
        }
        picksGuideCarouselItemView.setTag(x4c0.f191014y, Integer.valueOf(iIntValue));
        PicksGuideCarouselItemView picksGuideCarouselItemView3 = this.carouselItemView1;
        if (picksGuideCarouselItemView3 == null) {
            Intrinsics.m87502r("carouselItemView1");
            picksGuideCarouselItemView3 = null;
        }
        picksGuideCarouselItemView3.m56796b(showFemaleStyle, userComponent2);
        Pair<Integer, User> pairM56807k2 = m56807k();
        int iIntValue2 = pairM56807k2.component1().intValue();
        User userComponent3 = pairM56807k2.component2();
        PicksGuideCarouselItemView picksGuideCarouselItemView4 = this.carouselItemView2;
        if (picksGuideCarouselItemView4 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView4 = null;
        }
        picksGuideCarouselItemView4.setTag(x4c0.f191014y, Integer.valueOf(iIntValue2));
        PicksGuideCarouselItemView picksGuideCarouselItemView5 = this.carouselItemView2;
        if (picksGuideCarouselItemView5 == null) {
            Intrinsics.m87502r("carouselItemView2");
            picksGuideCarouselItemView5 = null;
        }
        picksGuideCarouselItemView5.m56796b(showFemaleStyle, userComponent3);
        Pair<Integer, User> pairM56807k3 = m56807k();
        int iIntValue3 = pairM56807k3.component1().intValue();
        User userComponent4 = pairM56807k3.component2();
        PicksGuideCarouselItemView picksGuideCarouselItemView6 = this.carouselItemView3;
        if (picksGuideCarouselItemView6 == null) {
            Intrinsics.m87502r("carouselItemView3");
            picksGuideCarouselItemView6 = null;
        }
        picksGuideCarouselItemView6.setTag(x4c0.f191014y, Integer.valueOf(iIntValue3));
        PicksGuideCarouselItemView picksGuideCarouselItemView7 = this.carouselItemView3;
        if (picksGuideCarouselItemView7 == null) {
            Intrinsics.m87502r("carouselItemView3");
        } else {
            picksGuideCarouselItemView2 = picksGuideCarouselItemView7;
        }
        picksGuideCarouselItemView2.m56796b(showFemaleStyle, userComponent4);
    }

    /* JADX INFO: renamed from: m */
    public final void m56809m() {
        m56810n();
        e51.m114743H(getContext(), this.carouselAnimRunnable, this.startDelay);
    }

    /* JADX INFO: renamed from: n */
    public final void m56810n() {
        AnimatorSet animatorSet = this.carouselAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.carouselAnimatorSet = null;
        e51.m114745J(this.carouselAnimRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m56810n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56803g();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(((this.imageSize * 2) - this.imageOffset) + (this.padding * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.imageSize, Integer.MIN_VALUE));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksGuideCarouselView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PicksGuideCarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
