package com.p000p1.mobile.putong.core.newui.profile.understandme;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.web.WebViewX;
import com.sunshine.engine.base.InterpolatorType;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PullFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f5550a;

    /* JADX INFO: renamed from: b */
    public float f5551b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f5552c;

    /* JADX INFO: renamed from: d */
    public Runnable f5553d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout$a */
    public class RunnableC0402a implements Runnable {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout$a$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullFrameLayout.this.f5550a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        public RunnableC0402a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator valueAnimator = PullFrameLayout.this.f5552c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                PullFrameLayout.this.f5552c.cancel();
            }
            PullFrameLayout pullFrameLayout = PullFrameLayout.this;
            pullFrameLayout.f5552c = ValueAnimator.ofFloat(pullFrameLayout.f5550a.getTranslationY(), 0.0f);
            PullFrameLayout.this.f5552c.setDuration(300L);
            PullFrameLayout.this.f5552c.setInterpolator(InterpolatorType.accelerateDecelerate.obtain());
            PullFrameLayout.this.f5552c.addUpdateListener(new a());
            PullFrameLayout.this.f5552c.start();
        }
    }

    public PullFrameLayout(@NonNull Context context) {
        super(context);
        this.f5551b = 0.0f;
        this.f5553d = new RunnableC0402a();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        WebViewX webViewX = this.f5550a;
        if (webViewX == null || webViewX.getScrollY() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5551b = motionEvent.getY();
        } else if (actionMasked == 1) {
            this.f5553d.run();
        } else {
            if (actionMasked == 2) {
                float y = (motionEvent.getY() - this.f5551b) * 0.6f;
                int i = t100.K;
                if (y > i) {
                    y = i;
                }
                WebViewX webViewX2 = this.f5550a;
                if (y <= 0.0f) {
                    webViewX2.setTranslationY(0.0f);
                    return super.dispatchTouchEvent(motionEvent);
                }
                webViewX2.setTranslationY(y);
                return true;
            }
            if (actionMasked == 3 || actionMasked == 4) {
                this.f5553d.run();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void set_webview(WebViewX webViewX) {
        this.f5550a = webViewX;
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5551b = 0.0f;
        this.f5553d = new RunnableC0402a();
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5551b = 0.0f;
        this.f5553d = new RunnableC0402a();
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5551b = 0.0f;
        this.f5553d = new RunnableC0402a();
    }
}
