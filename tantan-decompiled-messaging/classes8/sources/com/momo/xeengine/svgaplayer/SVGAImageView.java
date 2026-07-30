package com.momo.xeengine.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.momo.xeengine.svgaplayer.listener.SVGACallback;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import l.ox50;
import l.qq3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001NB\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000203H\u0014J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u000203J\u0010\u0010>\u001a\u0002032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010?\u001a\u0002032\u0006\u00107\u001a\u000208H\u0004J\u0018\u0010?\u001a\u0002032\u0006\u00107\u001a\u0002082\u0006\u0010@\u001a\u00020AH\u0004J\u0006\u0010B\u001a\u000203J\u001c\u0010B\u001a\u0002032\b\u0010C\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010E\u001a\u00020\u0011H\u0004J\u0016\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u0011J\u0016\u0010I\u001a\u0002032\u0006\u0010J\u001a\u0002052\u0006\u0010H\u001a\u00020\u0011J\b\u0010K\u001a\u000203H\u0002J\u0006\u0010L\u001a\u000203J\u000e\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0011R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R$\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001a\u0010/\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+¨\u0006O"}, d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Lcom/momo/xeengine/svgaplayer/SVGAParser$ParseCompletion;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "animator", "Landroid/animation/ValueAnimator;", "antiAlias", "", "getAntiAlias", "()Z", "setAntiAlias", "(Z)V", "autoPlay", "getAutoPlay", "setAutoPlay", "callback", "Lcom/momo/xeengine/svgaplayer/listener/SVGACallback;", "clearsAfterStop", "getClearsAfterStop", "setClearsAfterStop", "fillMode", "Lcom/momo/xeengine/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/momo/xeengine/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/momo/xeengine/svgaplayer/SVGAImageView$FillMode;)V", "<set-?>", "isAnimating", "value", "loops", "getLoops", "()I", "setLoops", "(I)V", "mEndFrame", "getMEndFrame", "setMEndFrame", "mStartFrame", "getMStartFrame", "setMStartFrame", "fullRelease", "", "generateScale", "", "onComplete", "videoItem", "Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", "onDetachedFromWindow", "onError", "errorMsg", "", "pauseAnimation", "setCallback", "setVideoItem", "dynamicItem", "Lcom/momo/xeengine/svgaplayer/SVGADynamicEntity;", "startAnimation", "range", "Lcom/momo/xeengine/svgaplayer/SVGARange;", "reverse", "stepToFrame", "frame", "andPlay", "stepToPercentage", "percentage", "stopAnim", "stopAnimation", "clear", "FillMode", "gift_player_release"}, k = 1, mv = {1, 1, 15})
public class SVGAImageView extends ImageView implements SVGAParser.ParseCompletion {
    private ValueAnimator animator;
    private boolean antiAlias;
    private boolean autoPlay;
    private SVGACallback callback;
    private boolean clearsAfterStop;

    @NotNull
    private FillMode fillMode;
    private boolean isAnimating;
    private int loops;
    private int mEndFrame;
    private int mStartFrame;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAImageView$FillMode;", "", "(Ljava/lang/String;I)V", "Backward", "Forward", "gift_player_release"}, k = 1, mv = {1, 1, 15})
    public enum FillMode {
        Backward,
        Forward
    }

    public SVGAImageView(@Nullable Context context) {
        super(context);
        this.clearsAfterStop = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.TypeCastException */
    private final double generateScale() throws TypeCastException {
        double d = 1.0d;
        try {
            Class<?> cls = Class.forName("android.animation.ValueAnimator");
            Method declaredMethod = cls.getDeclaredMethod("getDurationScale", null);
            if (declaredMethod == null) {
                return 1.0d;
            }
            Object objInvoke = declaredMethod.invoke(cls, null);
            if (objInvoke == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            double dFloatValue = ((Float) objInvoke).floatValue();
            if (dFloatValue == 0.0d) {
                try {
                    Method declaredMethod2 = cls.getDeclaredMethod("setDurationScale", Float.TYPE);
                    if (declaredMethod2 != null) {
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(cls, Float.valueOf(1.0f));
                        return 1.0d;
                    }
                } catch (Exception e) {
                    e = e;
                    d = dFloatValue;
                    e.printStackTrace();
                    return d;
                }
            }
            return dFloatValue;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static /* synthetic */ void startAnimation$default(SVGAImageView sVGAImageView, SVGARange sVGARange, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: startAnimation");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sVGAImageView.startAnimation(sVGARange, z);
    }

    private final void stopAnim() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
        }
    }

    public final void fullRelease() {
        stopAnim();
        this.callback = null;
    }

    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final boolean getClearsAfterStop() {
        return this.clearsAfterStop;
    }

    @NotNull
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    public final int getLoops() {
        return this.loops;
    }

    public final int getMEndFrame() {
        return this.mEndFrame;
    }

    public final int getMStartFrame() {
        return this.mStartFrame;
    }

    /* JADX INFO: renamed from: isAnimating, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    @Override // com.momo.xeengine.svgaplayer.SVGAParser.ParseCompletion
    public void onComplete(@NotNull final SVGAVideoEntity videoItem) {
        videoItem.getClass();
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.momo.xeengine.svgaplayer.SVGAImageView.onComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    videoItem.setAntiAlias(SVGAImageView.this.getAntiAlias());
                    SVGAImageView.this.setVideoItem(videoItem);
                    if (SVGAImageView.this.getAutoPlay()) {
                        SVGAImageView.this.startAnimation();
                    }
                }
            });
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fullRelease();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Override // com.momo.xeengine.svgaplayer.SVGAParser.ParseCompletion
    public void onError(@NotNull String errorMsg) throws NotImplementedError {
        errorMsg.getClass();
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void pauseAnimation() {
        stopAnimation(false);
        SVGACallback sVGACallback = this.callback;
        if (sVGACallback != null) {
            sVGACallback.onPause();
        }
    }

    public final void setAntiAlias(boolean z) {
        this.antiAlias = z;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setCallback(@Nullable SVGACallback callback) {
        this.callback = callback;
    }

    public final void setClearsAfterStop(boolean z) {
        this.clearsAfterStop = z;
    }

    public final void setFillMode(@NotNull FillMode fillMode) {
        fillMode.getClass();
        this.fillMode = fillMode;
    }

    public final void setLoops(int i) {
        this.loops = i;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(i);
        }
    }

    public final void setMEndFrame(int i) {
        this.mEndFrame = i;
    }

    public final void setMStartFrame(int i) {
        this.mStartFrame = i;
    }

    public final void setVideoItem(@NotNull SVGAVideoEntity videoItem, @NotNull SVGADynamicEntity dynamicItem) {
        videoItem.getClass();
        dynamicItem.getClass();
        SVGADrawable sVGADrawable = new SVGADrawable(videoItem, dynamicItem);
        sVGADrawable.setCleared$gift_player_release(this.clearsAfterStop);
        setImageDrawable(sVGADrawable);
    }

    public final void startAnimation(@Nullable final SVGARange range, final boolean reverse) {
        final SVGAImageView sVGAImageView;
        final boolean z;
        stopAnimation(false);
        Drawable drawable = getDrawable();
        if (!(drawable instanceof SVGADrawable)) {
            drawable = null;
        }
        final SVGADrawable sVGADrawable = (SVGADrawable) drawable;
        if (sVGADrawable != null) {
            sVGADrawable.setCleared$gift_player_release(false);
            ImageView.ScaleType scaleType = getScaleType();
            scaleType.getClass();
            sVGADrawable.setScaleType(scaleType);
            SVGAVideoEntity videoItem = sVGADrawable.getVideoItem();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Math.max(0, range != null ? range.getLocation() : 0);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            int iMin = Math.min(videoItem.getFrames() - 1, ((range != null ? range.getLocation() : 0) + (range != null ? range.getLength() : Integer.MAX_VALUE)) - 1);
            intRef2.element = iMin;
            int i = this.mStartFrame;
            if (i >= 0 && iMin > i) {
                intRef.element = i;
            }
            int i2 = intRef2.element;
            int i3 = i + 1;
            int i4 = this.mEndFrame;
            if (i3 <= i4 && i2 >= i4) {
                intRef2.element = i4;
            }
            stopAnim();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(intRef.element, intRef2.element);
            this.animator = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            }
            long fps = (long) (((double) ((((intRef2.element - intRef.element) + 1) / videoItem.getFPS()) * 1000.0f)) / generateScale());
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.setDuration(fps);
            }
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                int i5 = this.loops;
                valueAnimator2.setRepeatCount(i5 <= 0 ? 99999 : i5 - 1);
            }
            ValueAnimator valueAnimator3 = this.animator;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.xeengine.svgaplayer.SVGAImageView$startAnimation$$inlined$let$lambda$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator4) {
                        valueAnimator4.getClass();
                        SVGADrawable sVGADrawable2 = sVGADrawable;
                        ValueAnimator valueAnimator5 = this.this$0.animator;
                        Object animatedValue = valueAnimator5 != null ? valueAnimator5.getAnimatedValue() : null;
                        if (animatedValue == null) {
                            ox50.a("null cannot be cast to non-null type kotlin.Int");
                            return;
                        }
                        sVGADrawable2.setCurrentFrame$gift_player_release(((Integer) animatedValue).intValue());
                        SVGACallback sVGACallback = this.this$0.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onStep(sVGADrawable.getCurrentFrame(), ((double) (sVGADrawable.getCurrentFrame() + 1)) / ((double) sVGADrawable.getVideoItem().getFrames()));
                        }
                    }
                });
            }
            ValueAnimator valueAnimator4 = this.animator;
            if (valueAnimator4 != null) {
                sVGAImageView = this;
                z = reverse;
                valueAnimator4.addListener(new Animator.AnimatorListener() { // from class: com.momo.xeengine.svgaplayer.SVGAImageView$startAnimation$$inlined$let$lambda$2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NotNull Animator animation) {
                        animation.getClass();
                        sVGAImageView.isAnimating = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        animation.getClass();
                        sVGAImageView.setMStartFrame(0);
                        sVGAImageView.setMEndFrame(0);
                        sVGAImageView.isAnimating = false;
                        sVGAImageView.stopAnimation();
                        SVGACallback sVGACallback = sVGAImageView.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onFinished();
                        }
                        if (sVGAImageView.getClearsAfterStop()) {
                            return;
                        }
                        if (sVGAImageView.getFillMode() == SVGAImageView.FillMode.Backward) {
                            sVGADrawable.setCurrentFrame$gift_player_release(intRef.element);
                        } else if (sVGAImageView.getFillMode() == SVGAImageView.FillMode.Forward) {
                            sVGADrawable.setCurrentFrame$gift_player_release(intRef2.element);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NotNull Animator animation) {
                        animation.getClass();
                        SVGACallback sVGACallback = sVGAImageView.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onRepeat();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NotNull Animator animation) {
                        animation.getClass();
                        SVGACallback sVGACallback = sVGAImageView.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onStart();
                        }
                        sVGAImageView.isAnimating = true;
                    }
                });
            } else {
                sVGAImageView = this;
                z = reverse;
            }
            ValueAnimator valueAnimator5 = sVGAImageView.animator;
            if (z) {
                if (valueAnimator5 != null) {
                    valueAnimator5.reverse();
                }
            } else if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        }
    }

    public final void stepToFrame(int frame, boolean andPlay) {
        pauseAnimation();
        Drawable drawable = getDrawable();
        if (!(drawable instanceof SVGADrawable)) {
            drawable = null;
        }
        SVGADrawable sVGADrawable = (SVGADrawable) drawable;
        if (sVGADrawable != null) {
            sVGADrawable.setCurrentFrame$gift_player_release(frame);
            if (andPlay) {
                startAnimation();
                ValueAnimator valueAnimator = this.animator;
                if (valueAnimator != null) {
                    valueAnimator.setCurrentPlayTime((long) (Math.max(0.0f, Math.min(1.0f, frame / sVGADrawable.getVideoItem().getFrames())) * valueAnimator.getDuration()));
                }
            }
        }
    }

    public final void stepToPercentage(double percentage, boolean andPlay) {
        Drawable drawable = getDrawable();
        if (!(drawable instanceof SVGADrawable)) {
            drawable = null;
        }
        SVGADrawable sVGADrawable = (SVGADrawable) drawable;
        if (sVGADrawable != null) {
            int frames = (int) (((double) sVGADrawable.getVideoItem().getFrames()) * percentage);
            if (frames >= sVGADrawable.getVideoItem().getFrames() && frames > 0) {
                frames = sVGADrawable.getVideoItem().getFrames() - 1;
            }
            stepToFrame(frames, andPlay);
        }
    }

    public final void stopAnimation(boolean clear) {
        stopAnim();
        Drawable drawable = getDrawable();
        if (!(drawable instanceof SVGADrawable)) {
            drawable = null;
        }
        SVGADrawable sVGADrawable = (SVGADrawable) drawable;
        if (sVGADrawable != null) {
            sVGADrawable.setCleared$gift_player_release(clear);
        }
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clearsAfterStop = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clearsAfterStop = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
    }

    public final void setVideoItem(@NotNull SVGAVideoEntity videoItem) {
        videoItem.getClass();
        setVideoItem(videoItem, new SVGADynamicEntity());
    }

    public final void stopAnimation() {
        stopAnimation(this.clearsAfterStop);
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.clearsAfterStop = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
    }

    public final void startAnimation() {
        startAnimation(null, false);
    }
}
