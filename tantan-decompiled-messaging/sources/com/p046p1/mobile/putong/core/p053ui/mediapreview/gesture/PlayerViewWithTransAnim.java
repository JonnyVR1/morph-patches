package com.p046p1.mobile.putong.core.p053ui.mediapreview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import p147v.C22585a;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerViewWithTransAnim extends PlayerView implements C22585a.b {

    /* JADX INFO: renamed from: B */
    public String f30680B;

    /* JADX INFO: renamed from: C */
    public C22585a f30681C;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m47858B();
    }

    /* JADX INFO: renamed from: B */
    private void m47858B() {
        this.f30681C = new C22585a(this);
    }

    public float getOriginalHeight() {
        return this.f30681C.m223333i();
    }

    public float getOriginalWidth() {
        return this.f30681C.m223334j();
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: k */
    public String mo43946k() {
        return this.f30680B;
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo43947l(ViewGroup viewGroup) {
        return this.f30681C.m223329G(viewGroup);
    }

    @Override // p147v.C22585a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo43948n(ViewGroup viewGroup) {
        return this.f30681C.m223330H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f30681C.m223349y(f);
    }

    public void setOriginalWidth(float f) {
        this.f30681C.m223350z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f30680B = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47858B();
    }
}
