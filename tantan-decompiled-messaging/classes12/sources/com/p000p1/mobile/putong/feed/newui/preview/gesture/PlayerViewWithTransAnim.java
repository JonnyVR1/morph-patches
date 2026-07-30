package com.p000p1.mobile.putong.feed.newui.preview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import v.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PlayerViewWithTransAnim extends PlayerView implements a.b {

    /* JADX INFO: renamed from: A */
    public a f4090A;

    /* JADX INFO: renamed from: z */
    public String f4091z;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m6447C();
    }

    /* JADX INFO: renamed from: C */
    private void m6447C() {
        this.f4090A = new a(this);
    }

    public float getOriginalHeight() {
        return this.f4090A.i();
    }

    public float getOriginalWidth() {
        return this.f4090A.j();
    }

    /* JADX INFO: renamed from: k */
    public String m6448k() {
        return this.f4091z;
    }

    /* JADX INFO: renamed from: l */
    public ValueAnimator m6449l(ViewGroup viewGroup) {
        return this.f4090A.G(viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public ValueAnimator m6450n(ViewGroup viewGroup) {
        return this.f4090A.H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f4090A.y(f);
    }

    public void setOriginalWidth(float f) {
        this.f4090A.z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f4091z = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6447C();
    }
}
