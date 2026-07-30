package com.p000p1.mobile.putong.core.p001ui.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DailyPaperGestureView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f226a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f227b;

    /* JADX INFO: renamed from: c */
    public final int f228c;

    /* JADX INFO: renamed from: d */
    public final int f229d;

    /* JADX INFO: renamed from: e */
    public final int f230e;

    /* JADX INFO: renamed from: f */
    public final int f231f;

    public DailyPaperGestureView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f228c = t100.d(15.0f);
        this.f229d = t100.d(67.0f);
        this.f230e = t100.d(48.0f);
        this.f231f = 1000;
    }

    /* JADX INFO: renamed from: a */
    public final void m365a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f226a, "translationX", 0.0f, ((xdl0.y0() - (this.f228c * 2)) - (this.f229d * 2)) - this.f230e);
        this.f227b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f227b.setRepeatCount(-1);
        this.f227b.setRepeatMode(1);
        this.f227b.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f227b)) {
            this.f227b.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f226a = (ImageView) findViewById(u4c0.K4);
        m365a();
    }
}
