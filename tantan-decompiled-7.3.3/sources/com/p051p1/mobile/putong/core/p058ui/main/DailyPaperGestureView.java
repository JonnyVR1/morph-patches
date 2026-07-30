package com.p051p1.mobile.putong.core.p058ui.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.adc0;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class DailyPaperGestureView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f31183a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f31184b;

    /* JADX INFO: renamed from: c */
    public final int f31185c;

    /* JADX INFO: renamed from: d */
    public final int f31186d;

    /* JADX INFO: renamed from: e */
    public final int f31187e;

    /* JADX INFO: renamed from: f */
    public final int f31188f;

    public DailyPaperGestureView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31185c = qa00.m175859d(15.0f);
        this.f31186d = qa00.m175859d(67.0f);
        this.f31187e = qa00.m175859d(48.0f);
        this.f31188f = 1000;
    }

    /* JADX INFO: renamed from: a */
    public final void m48515a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31183a, "translationX", 0.0f, ((bnl0.m105592y0() - (this.f31185c * 2)) - (this.f31186d * 2)) - this.f31187e);
        this.f31184b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f31184b.setRepeatCount(-1);
        this.f31184b.setRepeatMode(1);
        this.f31184b.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f31184b)) {
            this.f31184b.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31183a = (ImageView) findViewById(adc0.f70013M4);
        m48515a();
    }
}
