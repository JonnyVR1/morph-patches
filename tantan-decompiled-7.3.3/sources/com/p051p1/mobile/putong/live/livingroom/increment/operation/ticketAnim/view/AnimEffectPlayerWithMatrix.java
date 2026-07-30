package com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.AnimEffectPlayerWithMatrix;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gt0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/R\u0014\u00109\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/operation/ticketAnim/view/AnimEffectPlayerWithMatrix;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSet", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "endCall", "w", "(Lkotlin/jvm/functions/Function0;)V", Constants.KEY_T, "()V", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/graphics/Matrix;", ResourceDirection.f39656v, "()Landroid/graphics/Matrix;", "", "start", "end", "", "progress", "u", "([F[FF)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "b", "Landroid/graphics/Matrix;", "mMatrix", "c", "F", "animProgress", Constants.INAPP_DATA_TAG, "mStartMatrix", "e", "tempMatrix", "Landroid/graphics/RectF;", "f", "Landroid/graphics/RectF;", "startSrcRectF", "g", "startDstRectF", "h", "mEndMatrix", RXScreenCaptureService.KEY_INDEX, "endDstRectF", "j", "[F", "tempStartValues", "k", "tempEndValues", BLiveStormDanmakuGiftResourceType.f45292l, "tempValues", "Landroid/animation/ValueAnimator;", "m", "Lkotlin/Lazy;", "getAnim", "()Landroid/animation/ValueAnimator;", "anim", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class AnimEffectPlayerWithMatrix extends AnimEffectPlayer {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Matrix mMatrix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float animProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Matrix mStartMatrix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Matrix tempMatrix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final RectF startSrcRectF;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final RectF startDstRectF;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Matrix mEndMatrix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final RectF endDstRectF;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final float[] tempStartValues;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final float[] tempEndValues;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final float[] tempValues;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimEffectPlayerWithMatrix(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.mMatrix = new Matrix();
        this.mStartMatrix = new Matrix();
        this.tempMatrix = new Matrix();
        this.startSrcRectF = new RectF();
        this.startDstRectF = new RectF();
        this.mEndMatrix = new Matrix();
        this.endDstRectF = new RectF();
        this.tempStartValues = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.tempEndValues = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.tempValues = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.anim = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.no0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimEffectPlayerWithMatrix.m76288p();
            }
        });
    }

    private final ValueAnimator getAnim() {
        Object value = this.anim.getValue();
        value.getClass();
        return (ValueAnimator) value;
    }

    /* JADX INFO: renamed from: p */
    public static ValueAnimator m76288p() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: x */
    public static final void m76291x(AnimEffectPlayerWithMatrix animEffectPlayerWithMatrix, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        animEffectPlayerWithMatrix.animProgress = fFloatValue;
        animEffectPlayerWithMatrix.setAlpha(1.0f - fFloatValue);
        animEffectPlayerWithMatrix.invalidate();
    }

    /* JADX INFO: renamed from: y */
    public static final void m76292y(Function0 function0) {
        function0.invoke();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        if (getDrawable() == null) {
            return;
        }
        canvas.concat(m76296v());
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: s */
    public final void m76293s() {
        if (this.mEndMatrix.isIdentity()) {
            float measuredWidth = ((getMeasuredWidth() * 5.0f) / 6.0f) * 0.3f;
            float measuredHeight = (getMeasuredHeight() * 90.0f) / 640.0f;
            float measuredWidth2 = (getMeasuredWidth() * 10.0f) / 360.0f;
            this.endDstRectF.set(measuredWidth2, measuredHeight, measuredWidth2 + measuredWidth, measuredWidth + measuredHeight);
            this.mEndMatrix.setRectToRect(this.startSrcRectF, this.endDstRectF, Matrix.ScaleToFit.CENTER);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m76294t() {
        if (this.mStartMatrix.isIdentity()) {
            float measuredWidth = (getMeasuredWidth() * 5.0f) / 6.0f;
            float measuredHeight = (getMeasuredHeight() * 76.0f) / 640.0f;
            float measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2.0f;
            this.startDstRectF.set(measuredWidth2, (getMeasuredHeight() - measuredWidth) - measuredHeight, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() - measuredHeight);
            this.mStartMatrix.setRectToRect(this.startSrcRectF, this.startDstRectF, Matrix.ScaleToFit.CENTER);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m76295u(@NotNull float[] start, @NotNull float[] end, float progress) {
        start.getClass();
        end.getClass();
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.tempValues;
            float f = start[i];
            fArr[i] = f + ((end[i] - f) * progress);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final Matrix m76296v() {
        this.mMatrix.reset();
        this.startSrcRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredWidth());
        m76294t();
        m76293s();
        if (this.animProgress == 0.0f) {
            this.mMatrix.set(this.mStartMatrix);
        } else {
            this.tempMatrix.reset();
            this.mStartMatrix.getValues(this.tempStartValues);
            this.mEndMatrix.getValues(this.tempEndValues);
            m76295u(this.tempStartValues, this.tempEndValues, this.animProgress);
            this.mMatrix.setValues(this.tempValues);
        }
        return this.mMatrix;
    }

    /* JADX INFO: renamed from: w */
    public final void m76297w(@NotNull final Function0<Unit> endCall) {
        endCall.getClass();
        ValueAnimator anim = getAnim();
        anim.setInterpolator(new LinearInterpolator());
        anim.setDuration(400L);
        anim.removeAllUpdateListeners();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimEffectPlayerWithMatrix.m76291x(this.f148249a, valueAnimator);
            }
        });
        anim.removeAllListeners();
        gt0.m132160f(anim, new Runnable() { // from class: l.po0
            @Override // java.lang.Runnable
            public final void run() {
                AnimEffectPlayerWithMatrix.m76292y(endCall);
            }
        });
        anim.setStartDelay(4700L);
        anim.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimEffectPlayerWithMatrix(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimEffectPlayerWithMatrix(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
