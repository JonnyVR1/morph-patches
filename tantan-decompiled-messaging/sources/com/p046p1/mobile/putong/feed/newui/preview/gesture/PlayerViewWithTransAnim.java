package com.p046p1.mobile.putong.feed.newui.preview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import p147v.C22585a;

/* JADX INFO: loaded from: classes12.dex */
public class PlayerViewWithTransAnim extends PlayerView implements C22585a.b {

    /* JADX INFO: renamed from: A */
    public C22585a f42629A;

    /* JADX INFO: renamed from: z */
    public String f42630z;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m65342C();
    }

    /* JADX INFO: renamed from: C */
    private void m65342C() {
        this.f42629A = new C22585a(this);
    }

    public float getOriginalHeight() {
        return this.f42629A.m223333i();
    }

    public float getOriginalWidth() {
        return this.f42629A.m223334j();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f42630z;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f42629A.m223329G(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f42629A.m223330H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f42629A.m223349y(f);
    }

    public void setOriginalWidth(float f) {
        this.f42629A.m223350z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f42630z = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65342C();
    }
}
