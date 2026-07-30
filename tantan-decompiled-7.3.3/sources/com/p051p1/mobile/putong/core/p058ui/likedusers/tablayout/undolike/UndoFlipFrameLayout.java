package com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UndoFlipFrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0001%B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001aJ\u0011\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\u001aR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010-R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010-R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010BR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "degrees", "", "setRotateY", "(F)V", "fromLocationX", "fromLocationY", "q", "(FF)V", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroid/animation/Animator;", "k", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "Landroid/animation/AnimatorListenerAdapter;", "enterAnimatorListenerAdapter", "setAnimatorListener", "(Landroid/animation/AnimatorListenerAdapter;)V", "h", "m", RXScreenCaptureService.KEY_INDEX, "o", "j", "Landroid/graphics/Camera;", "a", "Landroid/graphics/Camera;", "camera", "Landroid/graphics/Matrix;", "b", "Landroid/graphics/Matrix;", "matrix", "c", "F", "currentDensity", Constants.INAPP_DATA_TAG, "fromX", "e", "fromY", "f", "toX", "g", "toY", "fromScaleX", "fromScaleY", "toScaleX", "toScaleY", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "rotateYAnimator", "currentRotateY", "n", "propertyAnimator", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "flipAnimatorSet", "p", "Landroid/animation/AnimatorListenerAdapter;", "Companion", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class UndoFlipFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Camera camera;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Matrix matrix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float currentDensity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float fromX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float fromY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float toX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float toY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float fromScaleX;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float fromScaleY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public float toScaleX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float toScaleY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator rotateYAnimator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float currentRotateY;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator propertyAnimator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet flipAnimatorSet;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public AnimatorListenerAdapter enterAnimatorListenerAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.likedusers.tablayout.undolike.UndoFlipFrameLayout$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/likedusers/tablayout/undolike/UndoFlipFrameLayout$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8572b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<View> f30911b;

        public C8572b(List<View> list) {
            this.f30911b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            UndoFlipFrameLayout undoFlipFrameLayout = UndoFlipFrameLayout.this;
            undoFlipFrameLayout.setX(undoFlipFrameLayout.toX);
            UndoFlipFrameLayout undoFlipFrameLayout2 = UndoFlipFrameLayout.this;
            undoFlipFrameLayout2.setY(undoFlipFrameLayout2.toY);
            UndoFlipFrameLayout undoFlipFrameLayout3 = UndoFlipFrameLayout.this;
            undoFlipFrameLayout3.setScaleX(undoFlipFrameLayout3.toScaleX);
            UndoFlipFrameLayout undoFlipFrameLayout4 = UndoFlipFrameLayout.this;
            undoFlipFrameLayout4.setScaleY(undoFlipFrameLayout4.toScaleY);
            Iterator<View> it = this.f30911b.iterator();
            while (it.hasNext()) {
                it.next().setAlpha(0.0f);
            }
            AnimatorListenerAdapter animatorListenerAdapter = UndoFlipFrameLayout.this.enterAnimatorListenerAdapter;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(animation);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            animation.getClass();
            super.onAnimationStart(animation);
            AnimatorListenerAdapter animatorListenerAdapter = UndoFlipFrameLayout.this.enterAnimatorListenerAdapter;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(animation);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UndoFlipFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.camera = new Camera();
        this.matrix = new Matrix();
        this.toScaleX = 1.0f;
        this.toScaleY = 1.0f;
        setWillNotDraw(false);
        this.currentDensity = context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: n */
    public static final void m48045n(UndoFlipFrameLayout undoFlipFrameLayout, List list, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue(View.X.getName());
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        Object animatedValue2 = valueAnimator.getAnimatedValue(View.Y.getName());
        Float f2 = animatedValue2 instanceof Float ? (Float) animatedValue2 : null;
        float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
        Object animatedValue3 = valueAnimator.getAnimatedValue(View.SCALE_X.getName());
        Float f3 = animatedValue3 instanceof Float ? (Float) animatedValue3 : null;
        float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
        Object animatedValue4 = valueAnimator.getAnimatedValue(View.SCALE_Y.getName());
        Float f4 = animatedValue4 instanceof Float ? (Float) animatedValue4 : null;
        float fFloatValue4 = f4 != null ? f4.floatValue() : 0.0f;
        Object animatedValue5 = valueAnimator.getAnimatedValue(View.ALPHA.getName());
        Float f5 = animatedValue5 instanceof Float ? (Float) animatedValue5 : null;
        float fFloatValue5 = f5 != null ? f5.floatValue() : 0.0f;
        undoFlipFrameLayout.setX(fFloatValue);
        undoFlipFrameLayout.setY(fFloatValue2);
        undoFlipFrameLayout.setScaleX(fFloatValue3);
        undoFlipFrameLayout.setScaleY(fFloatValue4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(fFloatValue5);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m48046p(UndoFlipFrameLayout undoFlipFrameLayout, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        undoFlipFrameLayout.setRotateY(fFloatValue > 0.0f ? fFloatValue - 90.0f : fFloatValue + 90.0f);
    }

    private final void setRotateY(float degrees) {
        this.currentRotateY = degrees;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        canvas.save();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.camera.save();
        this.camera.rotateY(this.currentRotateY);
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        float f = fArr[6];
        float f2 = this.currentDensity;
        fArr[6] = f / f2;
        fArr[7] = fArr[7] / f2;
        this.matrix.setValues(fArr);
        this.matrix.preTranslate(-width, -height);
        this.matrix.postTranslate(width, height);
        canvas.concat(this.matrix);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: h */
    public final void m48047h() {
        AnimatorSet animatorSet = this.flipAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.flipAnimatorSet = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m48048i() {
        ValueAnimator valueAnimator = this.propertyAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.propertyAnimator = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m48049j() {
        ValueAnimator valueAnimator = this.rotateYAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.rotateYAnimator = null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Animator m48050k() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, (qa00.f156305R + bnl0.m105592y0()) - this.toX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION, 0.0f, 14.0f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(883L);
        objectAnimatorOfPropertyValuesHolder.setStartDelay(117L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Animator m48051l() {
        Animator animatorM48052m = m48052m();
        Animator animatorM48053o = m48053o();
        m48047h();
        AnimatorSet animatorSet = new AnimatorSet();
        this.flipAnimatorSet = animatorSet;
        animatorSet.playTogether(animatorM48052m, animatorM48053o);
        animatorSet.setInterpolator(new PathInterpolator(0.3f, 0.6f, 0.0f, 1.0f));
        animatorSet.setDuration(600L);
        animatorSet.setStartDelay(33L);
        return this.flipAnimatorSet;
    }

    /* JADX INFO: renamed from: m */
    public final Animator m48052m() {
        m48048i();
        final ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Object tag = childAt.getTag();
            if (!(tag instanceof String) || !TextUtils.equals("ignoreAlpha", (CharSequence) tag)) {
                arrayList.add(childAt);
            }
        }
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, this.fromX, this.toX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, this.fromY, this.toY), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.fromScaleX, this.toScaleX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.fromScaleY, this.toScaleY), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f, 0.0f));
        this.propertyAnimator = valueAnimatorOfPropertyValuesHolder;
        if (valueAnimatorOfPropertyValuesHolder != null) {
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zwj0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    UndoFlipFrameLayout.m48045n(this.f206353a, arrayList, valueAnimator);
                }
            });
            valueAnimatorOfPropertyValuesHolder.addListener(new C8572b(arrayList));
            valueAnimatorOfPropertyValuesHolder.setDuration(600L);
        }
        return this.propertyAnimator;
    }

    /* JADX INFO: renamed from: o */
    public final Animator m48053o() {
        m48049j();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(90.0f, -90.0f);
        this.rotateYAnimator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat == null) {
            return null;
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ywj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UndoFlipFrameLayout.m48046p(this.f201843a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(600L);
        return valueAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m48048i();
        m48049j();
        m48047h();
    }

    /* JADX INFO: renamed from: q */
    public final void m48054q(float fromLocationX, float fromLocationY) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int x = (int) (getX() - iArr[0]);
        int y = (int) (getY() - iArr[1]);
        this.fromScaleX = 1.0f;
        this.fromScaleY = 1.0f;
        this.toScaleX = 1.7f;
        this.toScaleY = 1.7f;
        this.fromX = fromLocationX + x;
        this.fromY = fromLocationY + y;
        this.toX = getX();
        this.toY = getY();
        setX(this.fromX);
        setY(this.fromY);
        setScaleX(this.fromScaleX);
        setScaleY(this.fromScaleY);
        setVisibility(0);
    }

    public final void setAnimatorListener(@Nullable AnimatorListenerAdapter enterAnimatorListenerAdapter) {
        this.enterAnimatorListenerAdapter = enterAnimatorListenerAdapter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public UndoFlipFrameLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ UndoFlipFrameLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
