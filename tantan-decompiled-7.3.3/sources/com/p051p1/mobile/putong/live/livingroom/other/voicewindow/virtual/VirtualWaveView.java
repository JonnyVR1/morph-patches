package com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualWaveView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gt0;
import p153l.it0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 J2\u00020\u0001:\u0001(B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u0016\u00108\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u0010:\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00101R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010.R\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u001b\u0010I\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010\"¨\u0006K"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/other/voicewindow/virtual/VirtualWaveView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", BaseSei.f14624X, "()V", BaseSei.f14625Y, "onDetachedFromWindow", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroid/animation/Animator;", "p", Constants.KEY_T, "Landroid/animation/AnimatorSet;", ResourceDirection.f39656v, "()Landroid/animation/AnimatorSet;", "", "alphaFloat", "w", "(F)I", "Landroid/graphics/RectF;", "a", "Landroid/graphics/RectF;", "ring1Rect", "b", "ring2Rect", "c", "I", "ring1Radius", Constants.INAPP_DATA_TAG, "F", "ring1Alpha", "e", "ring1StrokeWidth", "f", "ring2Radius", "g", "ring2Alpha", "h", "ring2StrokeWidth", "Landroid/graphics/Paint;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getRing1Paint", "()Landroid/graphics/Paint;", "ring1Paint", "j", "getRing2Paint", "ring2Paint", "k", "centerX", "centerY", "m", "getWaveAnim", "waveAnim", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VirtualWaveView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RectF ring1Rect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final RectF ring2Rect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int ring1Radius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float ring1Alpha;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float ring1StrokeWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int ring2Radius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float ring2Alpha;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float ring2StrokeWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy ring1Paint;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy ring2Paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int centerX;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int centerY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy waveAnim;

    @JvmOverloads
    public VirtualWaveView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ring1Rect = new RectF();
        this.ring2Rect = new RectF();
        this.ring1Radius = qa00.m175859d(15.0f);
        this.ring1Alpha = 0.2f;
        this.ring1StrokeWidth = qa00.m175859d(2.0f);
        this.ring2Radius = qa00.m175859d(15.0f);
        this.ring2Alpha = 0.2f;
        this.ring2StrokeWidth = qa00.m175859d(2.0f);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.ring1Paint = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.hem0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualWaveView.m76827f();
            }
        });
        this.ring2Paint = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.iem0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualWaveView.m76831j();
            }
        });
        this.waveAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.jem0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualWaveView.m76828g(this.f120513a);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static Paint m76827f() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: g */
    public static AnimatorSet m76828g(VirtualWaveView virtualWaveView) {
        return virtualWaveView.m76843v();
    }

    private final Paint getRing1Paint() {
        return (Paint) this.ring1Paint.getValue();
    }

    private final Paint getRing2Paint() {
        return (Paint) this.ring2Paint.getValue();
    }

    private final AnimatorSet getWaveAnim() {
        return (AnimatorSet) this.waveAnim.getValue();
    }

    /* JADX INFO: renamed from: j */
    public static Paint m76831j() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: k */
    public static void m76832k(VirtualWaveView virtualWaveView) {
        virtualWaveView.m76845x();
    }

    /* JADX INFO: renamed from: m */
    public static final void m76833m(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring1Radius = ((Integer) animatedValue).intValue();
    }

    /* JADX INFO: renamed from: n */
    public static final void m76834n(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring1Alpha = ((Float) animatedValue).floatValue();
    }

    /* JADX INFO: renamed from: o */
    public static final void m76835o(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring1StrokeWidth = ((Float) animatedValue).floatValue();
    }

    /* JADX INFO: renamed from: q */
    public static final void m76836q(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring2Radius = ((Integer) animatedValue).intValue();
    }

    /* JADX INFO: renamed from: r */
    public static final void m76837r(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring2Alpha = ((Float) animatedValue).floatValue();
    }

    /* JADX INFO: renamed from: s */
    public static final void m76838s(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        virtualWaveView.ring2StrokeWidth = ((Float) animatedValue).floatValue();
    }

    /* JADX INFO: renamed from: u */
    public static final void m76839u(VirtualWaveView virtualWaveView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        virtualWaveView.postInvalidate();
    }

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: l */
    public final Animator m76840l() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qa00.m175859d(15.0f), qa00.m175859d(27.0f));
        valueAnimatorOfInt.setDuration(1400L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76833m(this.f131767a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 0.0f);
        valueAnimatorOfFloat.setDuration(1400L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76834n(this.f136545a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(qa00.m175859d(3.0f), qa00.m175859d(1.0f));
        valueAnimatorOfFloat2.setDuration(1400L);
        valueAnimatorOfFloat2.setInterpolator(null);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76835o(this.f141669a, valueAnimator);
            }
        });
        Animator animatorM132164j = gt0.m132164j(600);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfFloat).with(valueAnimatorOfFloat2).before(animatorM132164j);
        return animatorSet;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76846y();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        RectF rectF = this.ring1Rect;
        int i = this.centerX;
        int i2 = this.ring1Radius;
        float f = this.ring1StrokeWidth;
        rectF.left = (i - i2) - (f / 2.0f);
        int i3 = this.centerY;
        rectF.top = (i3 - i2) - (f / 2.0f);
        rectF.right = i + i2 + (f / 2.0f);
        rectF.bottom = i3 + i2 + (f / 2.0f);
        getRing1Paint().setAlpha(m76844w(this.ring1Alpha));
        getRing1Paint().setStrokeWidth(this.ring1StrokeWidth);
        canvas.drawArc(this.ring1Rect, 0.0f, 360.0f, false, getRing1Paint());
        RectF rectF2 = this.ring2Rect;
        int i4 = this.centerX;
        int i5 = this.ring2Radius;
        float f2 = this.ring2StrokeWidth;
        rectF2.left = (i4 - i5) - (f2 / 2.0f);
        int i6 = this.centerY;
        rectF2.top = (i6 - i5) - (f2 / 2.0f);
        rectF2.right = i4 + i5 + (f2 / 2.0f);
        rectF2.bottom = i6 + i5 + (f2 / 2.0f);
        getRing2Paint().setAlpha(m76844w(this.ring2Alpha));
        getRing2Paint().setStrokeWidth(this.ring2StrokeWidth);
        canvas.drawArc(this.ring2Rect, 0.0f, 360.0f, false, getRing2Paint());
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.centerX = measuredWidth / 2;
        this.centerY = measuredHeight / 2;
    }

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: p */
    public final Animator m76841p() {
        Animator animatorM132164j = gt0.m132164j(733);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qa00.m175859d(15.0f), qa00.m175859d(27.0f));
        valueAnimatorOfInt.setDuration(1267L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76836q(this.f147004a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 0.0f);
        valueAnimatorOfFloat.setDuration(1267L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76837r(this.f152107a, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(qa00.m175859d(3.0f), qa00.m175859d(1.0f));
        valueAnimatorOfFloat2.setDuration(1267L);
        valueAnimatorOfFloat2.setInterpolator(null);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76838s(this.f103843a, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfFloat).with(valueAnimatorOfFloat2).after(animatorM132164j);
        return animatorSet;
    }

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: t */
    public final Animator m76842t() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 1);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kem0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VirtualWaveView.m76839u(this.f126201a, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: v */
    public final AnimatorSet m76843v() {
        Animator animatorM132164j = gt0.m132164j(5000);
        Animator animatorM76840l = m76840l();
        Animator animatorM76841p = m76841p();
        Animator animatorM76842t = m76842t();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM76840l, animatorM76841p, animatorM76842t);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorM76840l, animatorM76841p, animatorM76842t);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2, animatorM132164j);
        return animatorSet3;
    }

    /* JADX INFO: renamed from: w */
    public final int m76844w(float alphaFloat) {
        return (int) (255.0f * alphaFloat);
    }

    /* JADX INFO: renamed from: x */
    public final void m76845x() {
        getWaveAnim().removeAllListeners();
        gt0.m132160f(getWaveAnim(), new Runnable() { // from class: l.fem0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualWaveView.m76832k(this.f98692a);
            }
        });
        getWaveAnim().start();
    }

    /* JADX INFO: renamed from: y */
    public final void m76846y() {
        it0.m142007A(getWaveAnim());
    }

    @JvmOverloads
    public VirtualWaveView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public VirtualWaveView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ VirtualWaveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
