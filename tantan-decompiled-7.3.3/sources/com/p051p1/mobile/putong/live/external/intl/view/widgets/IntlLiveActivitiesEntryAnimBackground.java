package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Objects;
import p153l.ftn;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntryAnimBackground extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f46574a;

    /* JADX INFO: renamed from: b */
    public C12714b f46575b;

    /* JADX INFO: renamed from: c */
    public C12714b f46576c;

    /* JADX INFO: renamed from: d */
    public final Paint f46577d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground$a */
    public class C12713a extends AnimatorListenerAdapter {
        public C12713a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryAnimBackground intlLiveActivitiesEntryAnimBackground = IntlLiveActivitiesEntryAnimBackground.this;
            intlLiveActivitiesEntryAnimBackground.m71438g(intlLiveActivitiesEntryAnimBackground.f46576c.f46579a, IntlLiveActivitiesEntryAnimBackground.this.f46576c.f46580b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground$b */
    public static class C12714b {

        /* JADX INFO: renamed from: a */
        public int f46579a;

        /* JADX INFO: renamed from: b */
        public int f46580b;

        /* JADX INFO: renamed from: c */
        public int f46581c;

        /* JADX INFO: renamed from: d */
        @ColorInt
        public int f46582d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f46583e;

        public C12714b(int i, int i2, int i3, @ColorInt int i4, @ColorInt int i5) {
            this.f46579a = i;
            this.f46580b = i2;
            this.f46581c = i3;
            this.f46582d = i4;
            this.f46583e = i5;
        }

        /* JADX INFO: renamed from: a */
        public Shader m71440a(int i, int i2) {
            return new LinearGradient(i, 0.0f, i + i2, 0.0f, this.f46582d, this.f46583e, Shader.TileMode.REPEAT);
        }

        public String toString() {
            return "Rectangle{width=" + this.f46579a + ", height=" + this.f46580b + '}';
        }
    }

    public IntlLiveActivitiesEntryAnimBackground(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46577d = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public Animator m71435d(ftn ftnVar, ftn ftnVar2) {
        m71439h();
        this.f46575b = m71436e(ftnVar);
        this.f46576c = m71436e(ftnVar2);
        Objects.toString(this.f46575b);
        Objects.toString(this.f46576c);
        m71438g(Math.max(this.f46575b.f46579a, this.f46576c.f46579a), Math.max(this.f46575b.f46580b, this.f46576c.f46580b));
        this.f46574a.setDuration(800L);
        this.f46574a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ktn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f128720a.m71437f(valueAnimator);
            }
        });
        this.f46574a.addListener(new C12713a());
        return this.f46574a;
    }

    /* JADX INFO: renamed from: e */
    public final C12714b m71436e(ftn ftnVar) {
        return new C12714b(ftnVar.mo71453e(), ftnVar.mo71454f(), ftnVar.mo71455i(), ftnVar.mo71451a(), ftnVar.mo71452d());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m71437f(ValueAnimator valueAnimator) {
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m71438g(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final void m71439h() {
        ValueAnimator valueAnimator = this.f46574a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46574a = null;
        }
        this.f46574a = ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator = this.f46574a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        float animatedFraction = this.f46574a.getAnimatedFraction();
        C12714b c12714b = this.f46575b;
        int i = c12714b.f46579a;
        C12714b c12714b2 = this.f46576c;
        int i2 = (int) (i + ((c12714b2.f46579a - i) * animatedFraction));
        int i3 = c12714b.f46580b;
        int i4 = (int) (i3 + ((c12714b2.f46580b - i3) * animatedFraction));
        int i5 = c12714b.f46581c;
        int i6 = (int) (i5 + (animatedFraction * (c12714b2.f46581c - i5)));
        this.f46577d.setShader(c12714b2.m71440a(getWidth() - i2, i2));
        float f = i6;
        canvas.drawRoundRect(getWidth() - i2, getBottom() - i4, getWidth(), getHeight(), f, f, this.f46577d);
    }
}
