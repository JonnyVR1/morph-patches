package com.p051p1.mobile.putong.core.newui.profile.understandme;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.sunshine.engine.base.InterpolatorType;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class PullFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f27620a;

    /* JADX INFO: renamed from: b */
    public float f27621b;

    /* JADX INFO: renamed from: c */
    public ValueAnimator f27622c;

    /* JADX INFO: renamed from: d */
    public Runnable f27623d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout$a */
    public class RunnableC8401a implements Runnable {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.understandme.PullFrameLayout$a$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PullFrameLayout.this.f27620a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        public RunnableC8401a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator valueAnimator = PullFrameLayout.this.f27622c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                PullFrameLayout.this.f27622c.cancel();
            }
            PullFrameLayout pullFrameLayout = PullFrameLayout.this;
            pullFrameLayout.f27622c = ValueAnimator.ofFloat(pullFrameLayout.f27620a.getTranslationY(), 0.0f);
            PullFrameLayout.this.f27622c.setDuration(300L);
            PullFrameLayout.this.f27622c.setInterpolator(InterpolatorType.accelerateDecelerate.obtain());
            PullFrameLayout.this.f27622c.addUpdateListener(new a());
            PullFrameLayout.this.f27622c.start();
        }
    }

    public PullFrameLayout(@NonNull Context context) {
        super(context);
        this.f27621b = 0.0f;
        this.f27623d = new RunnableC8401a();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        WebViewX webViewX = this.f27620a;
        if (webViewX == null || webViewX.getScrollY() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27621b = motionEvent.getY();
        } else if (actionMasked == 1) {
            this.f27623d.run();
        } else {
            if (actionMasked == 2) {
                float y = (motionEvent.getY() - this.f27621b) * 0.6f;
                int i = qa00.f156298K;
                if (y > i) {
                    y = i;
                }
                WebViewX webViewX2 = this.f27620a;
                if (y <= 0.0f) {
                    webViewX2.setTranslationY(0.0f);
                    return super.dispatchTouchEvent(motionEvent);
                }
                webViewX2.setTranslationY(y);
                return true;
            }
            if (actionMasked == 3 || actionMasked == 4) {
                this.f27623d.run();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void set_webview(WebViewX webViewX) {
        this.f27620a = webViewX;
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27621b = 0.0f;
        this.f27623d = new RunnableC8401a();
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27621b = 0.0f;
        this.f27623d = new RunnableC8401a();
    }

    public PullFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f27621b = 0.0f;
        this.f27623d = new RunnableC8401a();
    }
}
