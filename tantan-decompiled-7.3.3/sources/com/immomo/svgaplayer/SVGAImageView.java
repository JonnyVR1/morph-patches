package com.immomo.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.android.gms.common.api.Api;
import com.immomo.svgaplayer.adapter.SVGAThreadAdapter;
import com.immomo.svgaplayer.listener.SVGACallback;
import com.immomo.svgaplayer.setting.SVGAAdapterContainer;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.net.URL;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p153l.pr3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001XB\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\b\u00109\u001a\u0004\u0018\u00010:J\b\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020>H\u0014J\u0010\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020\u000fH\u0016J\u0006\u0010E\u001a\u00020>J\u0012\u0010F\u001a\u00020>2\b\u0010G\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010F\u001a\u00020>2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010H\u001a\u00020>H\u0002J\u0010\u0010I\u001a\u00020>2\u0006\u0010@\u001a\u00020AH\u0004J\u0018\u0010I\u001a\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010J\u001a\u00020KH\u0004J\u0006\u0010L\u001a\u00020>J\u001c\u0010L\u001a\u00020>2\b\u0010M\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010O\u001a\u00020\u0011H\u0004J\u0016\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u0011J\u0016\u0010S\u001a\u00020>2\u0006\u0010T\u001a\u00020U2\u0006\u0010R\u001a\u00020\u0011J\u0006\u0010V\u001a\u00020>J\u000e\u0010V\u001a\u00020>2\u0006\u0010W\u001a\u00020\u0011R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001a\u00106\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102¨\u0006Y"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Lcom/immomo/svgaplayer/SVGAParser$ParseCompletion;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "TAG", "", "addCache", "", "getAddCache", "()Z", "setAddCache", "(Z)V", "animator", "Landroid/animation/ValueAnimator;", "antiAlias", "getAntiAlias", "setAntiAlias", "autoPlay", "getAutoPlay", "setAutoPlay", "callback", "Lcom/immomo/svgaplayer/listener/SVGACallback;", "clearsAfterStop", "getClearsAfterStop", "setClearsAfterStop", "fillMode", "Lcom/immomo/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/immomo/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/immomo/svgaplayer/SVGAImageView$FillMode;)V", "<set-?>", "isAnimating", "setAnimating", "isPause", "value", "loops", "getLoops", "()I", "setLoops", "(I)V", "mEndFrame", "getMEndFrame", "setMEndFrame", "mStartFrame", "getMStartFrame", "setMStartFrame", "getCallBack", "Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "getTaskTag", "", "loadAttrs", "", "onComplete", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "onDetachedFromWindow", "onError", "errorMsg", "pauseAnimation", "setCallback", "listAdapter", "setSoftwareLayerType", "setVideoItem", "dynamicItem", "Lcom/immomo/svgaplayer/SVGADynamicEntity;", "startAnimation", "range", "Lcom/immomo/svgaplayer/SVGARange;", "reverse", "stepToFrame", Frame.TYPE, "andPlay", "stepToPercentage", "percentage", "", "stopAnimation", BLiveResOperation.clear, "FillMode", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public class SVGAImageView extends ImageView implements SVGAParser.ParseCompletion {
    private final String TAG;
    private boolean addCache;
    private ValueAnimator animator;
    private boolean antiAlias;
    private boolean autoPlay;
    private SVGACallback callback;
    private boolean clearsAfterStop;

    @NotNull
    private FillMode fillMode;
    private boolean isAnimating;
    private boolean isPause;
    private int loops;
    private int mEndFrame;
    private int mStartFrame;

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAImageView$FillMode;", "", "(Ljava/lang/String;I)V", "Backward", "Forward", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public enum FillMode {
        Backward,
        Forward
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "SVGAImageView";
        this.clearsAfterStop = true;
        this.addCache = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
        setSoftwareLayerType();
        if (attributeSet != null) {
            loadAttrs(attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTaskTag() {
        return this.TAG + hashCode();
    }

    private final void loadAttrs(AttributeSet attrs) {
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C4117R.styleable.SVGAImageView, 0, 0);
        setLoops(typedArrayObtainStyledAttributes.getInt(C4117R.styleable.SVGAImageView_loopCount, 0));
        this.addCache = typedArrayObtainStyledAttributes.getBoolean(C4117R.styleable.SVGAImageView_addCache, true);
        this.clearsAfterStop = typedArrayObtainStyledAttributes.getBoolean(C4117R.styleable.SVGAImageView_clearsAfterStop, true);
        this.mStartFrame = typedArrayObtainStyledAttributes.getInt(C4117R.styleable.SVGAImageView_startFrame, 0);
        this.mEndFrame = typedArrayObtainStyledAttributes.getInt(C4117R.styleable.SVGAImageView_endFrame, 0);
        this.antiAlias = typedArrayObtainStyledAttributes.getBoolean(C4117R.styleable.SVGAImageView_antiAlias, true);
        this.autoPlay = typedArrayObtainStyledAttributes.getBoolean(C4117R.styleable.SVGAImageView_autoPlay, true);
        String string = typedArrayObtainStyledAttributes.getString(C4117R.styleable.SVGAImageView_fillMode);
        if (string != null) {
            if (Intrinsics.m88377d(string, "0")) {
                this.fillMode = FillMode.Backward;
            } else if (Intrinsics.m88377d(string, "1")) {
                this.fillMode = FillMode.Forward;
            }
        }
        String string2 = typedArrayObtainStyledAttributes.getString(C4117R.styleable.SVGAImageView_source);
        if (string2 != null) {
            Context context2 = getContext();
            context2.getClass();
            SVGAParser sVGAParser = new SVGAParser(context2);
            if (C15493d.m94374J(string2, "http://", false, 2, null) || C15493d.m94374J(string2, "https://", false, 2, null)) {
                sVGAParser.parse(new URL(string2), this);
            } else {
                sVGAParser.parse(string2, this);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setAnimating(boolean z) {
        this.isAnimating = z;
    }

    private final void setSoftwareLayerType() {
    }

    public static /* bridge */ /* synthetic */ void startAnimation$default(SVGAImageView sVGAImageView, SVGARange sVGARange, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: startAnimation");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sVGAImageView.startAnimation(sVGARange, z);
    }

    public final boolean getAddCache() {
        return this.addCache;
    }

    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    @Nullable
    public final SVGAAnimListenerAdapter getCallBack() {
        SVGACallback sVGACallback = this.callback;
        if (sVGACallback instanceof SVGAAnimListenerAdapter) {
            if (sVGACallback != null) {
                return (SVGAAnimListenerAdapter) sVGACallback;
            }
            C0799b.m4641a("null cannot be cast to non-null type com.immomo.svgaplayer.SVGAAnimListenerAdapter");
        }
        return null;
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

    @Override // com.immomo.svgaplayer.SVGAParser.ParseCompletion
    public void onComplete(@NotNull final SVGAVideoEntity videoItem) {
        videoItem.getClass();
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.immomo.svgaplayer.SVGAImageView.onComplete.1
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
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.cancelTaskByTag(getTaskTag());
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        this.callback = null;
    }

    @Override // com.immomo.svgaplayer.SVGAParser.ParseCompletion
    public void onError(@NotNull String errorMsg) {
        errorMsg.getClass();
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void pauseAnimation() {
        this.isPause = true;
        stopAnimation(false);
        SVGACallback sVGACallback = this.callback;
        if (sVGACallback != null) {
            sVGACallback.onPause();
        }
    }

    public final void setAddCache(boolean z) {
        this.addCache = z;
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
        sVGADrawable.setCleared$svgalibrary_release(this.clearsAfterStop);
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
            sVGADrawable.setCleared$svgalibrary_release(false);
            ImageView.ScaleType scaleType = getScaleType();
            scaleType.getClass();
            sVGADrawable.setScaleType(scaleType);
            SVGAVideoEntity videoItem = sVGADrawable.getVideoItem();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Math.max(0, range != null ? range.getLocation() : 0);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            int iMin = Math.min(videoItem.getFrames() - 1, ((range != null ? range.getLocation() : 0) + (range != null ? range.getLength() : Api.BaseClientBuilder.API_PRIORITY_OTHER)) - 1);
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
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(intRef.element, intRef2.element);
            this.animator = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            }
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.setDuration((long) (((double) (((intRef2.element - intRef.element) + 1) * (1000 / videoItem.getFPS()))) / 1.0d));
            }
            ValueAnimator valueAnimator2 = this.animator;
            if (valueAnimator2 != null) {
                int i5 = this.loops;
                valueAnimator2.setRepeatCount(i5 <= 0 ? 99999 : i5 - 1);
            }
            ValueAnimator valueAnimator3 = this.animator;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.immomo.svgaplayer.SVGAImageView$startAnimation$$inlined$let$lambda$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        SVGADrawable sVGADrawable2 = sVGADrawable;
                        ValueAnimator valueAnimator5 = this.this$0.animator;
                        Object animatedValue = valueAnimator5 != null ? valueAnimator5.getAnimatedValue() : null;
                        if (animatedValue == null) {
                            C0799b.m4641a("null cannot be cast to non-null type kotlin.Int");
                            return;
                        }
                        sVGADrawable2.setCurrentFrame$svgalibrary_release(((Integer) animatedValue).intValue());
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
                valueAnimator4.addListener(new Animator.AnimatorListener() { // from class: com.immomo.svgaplayer.SVGAImageView$startAnimation$$inlined$let$lambda$2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@Nullable Animator animator) {
                        sVGAImageView.isAnimating = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@Nullable Animator animator) {
                        sVGAImageView.setMStartFrame(0);
                        sVGAImageView.setMEndFrame(0);
                        sVGAImageView.isAnimating = false;
                        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
                        if (mSVGAThreadAdapter != null) {
                            mSVGAThreadAdapter.cancelTaskByTag(sVGAImageView.getTaskTag());
                        }
                        ValueAnimator valueAnimator5 = sVGAImageView.animator;
                        if (valueAnimator5 != null) {
                            valueAnimator5.removeAllListeners();
                        }
                        ValueAnimator valueAnimator6 = sVGAImageView.animator;
                        if (valueAnimator6 != null) {
                            valueAnimator6.removeAllUpdateListeners();
                        }
                        SVGADrawable sVGADrawable2 = sVGADrawable;
                        if (sVGADrawable2 == null) {
                            sVGADrawable2 = null;
                        }
                        if (sVGADrawable2 != null) {
                            sVGADrawable2.setCleared$svgalibrary_release(false);
                        }
                        SVGACallback sVGACallback = sVGAImageView.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onFinished();
                        }
                        if (sVGAImageView.isPause || sVGAImageView.getClearsAfterStop()) {
                            return;
                        }
                        if (sVGAImageView.getFillMode() == SVGAImageView.FillMode.Backward) {
                            sVGADrawable.setCurrentFrame$svgalibrary_release(intRef.element);
                        } else if (sVGAImageView.getFillMode() == SVGAImageView.FillMode.Forward) {
                            sVGADrawable.setCurrentFrame$svgalibrary_release(intRef2.element);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@Nullable Animator animator) {
                        SVGACallback sVGACallback = sVGAImageView.callback;
                        if (sVGACallback != null) {
                            sVGACallback.onRepeat();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@Nullable Animator animator) {
                        sVGAImageView.isPause = false;
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
            sVGADrawable.setCurrentFrame$svgalibrary_release(frame);
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
        SVGAThreadAdapter mSVGAThreadAdapter = SVGAAdapterContainer.INSTANCE.getMSVGAThreadAdapter();
        if (mSVGAThreadAdapter != null) {
            mSVGAThreadAdapter.cancelTaskByTag(getTaskTag());
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof SVGADrawable)) {
            drawable = null;
        }
        SVGADrawable sVGADrawable = (SVGADrawable) drawable;
        if (sVGADrawable != null) {
            sVGADrawable.setCleared$svgalibrary_release(clear);
        }
    }

    public void setCallback(@Nullable SVGAAnimListenerAdapter listAdapter) {
        this.callback = listAdapter;
    }

    public final void setVideoItem(@NotNull SVGAVideoEntity videoItem) {
        videoItem.getClass();
        setVideoItem(videoItem, new SVGADynamicEntity());
    }

    public SVGAImageView(@Nullable Context context) {
        super(context);
        this.TAG = "SVGAImageView";
        this.clearsAfterStop = true;
        this.addCache = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
        setSoftwareLayerType();
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "SVGAImageView";
        this.clearsAfterStop = true;
        this.addCache = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
        setSoftwareLayerType();
        if (attributeSet != null) {
            loadAttrs(attributeSet);
        }
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.TAG = "SVGAImageView";
        this.clearsAfterStop = true;
        this.addCache = true;
        this.antiAlias = true;
        this.autoPlay = true;
        this.fillMode = FillMode.Forward;
        setSoftwareLayerType();
        if (attributeSet != null) {
            loadAttrs(attributeSet);
        }
    }

    public final void stopAnimation() {
        stopAnimation(this.clearsAfterStop);
    }

    public final void startAnimation() {
        startAnimation(null, false);
    }
}
