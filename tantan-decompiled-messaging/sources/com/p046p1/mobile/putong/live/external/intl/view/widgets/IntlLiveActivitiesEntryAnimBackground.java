package com.p046p1.mobile.putong.live.external.intl.view.widgets;

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
import p149l.frn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntryAnimBackground extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f45726a;

    /* JADX INFO: renamed from: b */
    public C12551b f45727b;

    /* JADX INFO: renamed from: c */
    public C12551b f45728c;

    /* JADX INFO: renamed from: d */
    public final Paint f45729d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground$a */
    public class C12550a extends AnimatorListenerAdapter {
        public C12550a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryAnimBackground intlLiveActivitiesEntryAnimBackground = IntlLiveActivitiesEntryAnimBackground.this;
            intlLiveActivitiesEntryAnimBackground.m70255g(intlLiveActivitiesEntryAnimBackground.f45728c.f45731a, IntlLiveActivitiesEntryAnimBackground.this.f45728c.f45732b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryAnimBackground$b */
    public static class C12551b {

        /* JADX INFO: renamed from: a */
        public int f45731a;

        /* JADX INFO: renamed from: b */
        public int f45732b;

        /* JADX INFO: renamed from: c */
        public int f45733c;

        /* JADX INFO: renamed from: d */
        @ColorInt
        public int f45734d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f45735e;

        public C12551b(int i, int i2, int i3, @ColorInt int i4, @ColorInt int i5) {
            this.f45731a = i;
            this.f45732b = i2;
            this.f45733c = i3;
            this.f45734d = i4;
            this.f45735e = i5;
        }

        /* JADX INFO: renamed from: a */
        public Shader m70257a(int i, int i2) {
            return new LinearGradient(i, 0.0f, i + i2, 0.0f, this.f45734d, this.f45735e, Shader.TileMode.REPEAT);
        }

        public String toString() {
            return "Rectangle{width=" + this.f45731a + ", height=" + this.f45732b + '}';
        }
    }

    public IntlLiveActivitiesEntryAnimBackground(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45729d = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public Animator m70252d(frn frnVar, frn frnVar2) {
        m70256h();
        this.f45727b = m70253e(frnVar);
        this.f45728c = m70253e(frnVar2);
        Objects.toString(this.f45727b);
        Objects.toString(this.f45728c);
        m70255g(Math.max(this.f45727b.f45731a, this.f45728c.f45731a), Math.max(this.f45727b.f45732b, this.f45728c.f45732b));
        this.f45726a.setDuration(800L);
        this.f45726a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.krn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124375a.m70254f(valueAnimator);
            }
        });
        this.f45726a.addListener(new C12550a());
        return this.f45726a;
    }

    /* JADX INFO: renamed from: e */
    public final C12551b m70253e(frn frnVar) {
        return new C12551b(frnVar.mo70270e(), frnVar.mo70271f(), frnVar.mo70272i(), frnVar.mo70268a(), frnVar.mo70269d());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m70254f(ValueAnimator valueAnimator) {
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m70255g(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: h */
    public final void m70256h() {
        ValueAnimator valueAnimator = this.f45726a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45726a = null;
        }
        this.f45726a = ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator = this.f45726a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        float animatedFraction = this.f45726a.getAnimatedFraction();
        C12551b c12551b = this.f45727b;
        int i = c12551b.f45731a;
        C12551b c12551b2 = this.f45728c;
        int i2 = (int) (i + ((c12551b2.f45731a - i) * animatedFraction));
        int i3 = c12551b.f45732b;
        int i4 = (int) (i3 + ((c12551b2.f45732b - i3) * animatedFraction));
        int i5 = c12551b.f45733c;
        int i6 = (int) (i5 + (animatedFraction * (c12551b2.f45733c - i5)));
        this.f45729d.setShader(c12551b2.m70257a(getWidth() - i2, i2));
        float f = i6;
        canvas.drawRoundRect(getWidth() - i2, getBottom() - i4, getWidth(), getHeight(), f, f, this.f45729d);
    }
}
