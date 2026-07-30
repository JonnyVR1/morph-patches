package com.p051p1.mobile.putong.core.p058ui.mediapreview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import p151v.C22700a;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerViewWithTransAnim extends PlayerView implements C22700a.b {

    /* JADX INFO: renamed from: B */
    public String f31528B;

    /* JADX INFO: renamed from: C */
    public C22700a f31529C;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m49041B();
    }

    /* JADX INFO: renamed from: B */
    private void m49041B() {
        this.f31529C = new C22700a(this);
    }

    public float getOriginalHeight() {
        return this.f31529C.m224579i();
    }

    public float getOriginalWidth() {
        return this.f31529C.m224580j();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f31528B;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f31529C.m224575G(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f31529C.m224576H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f31529C.m224595y(f);
    }

    public void setOriginalWidth(float f) {
        this.f31529C.m224596z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f31528B = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49041B();
    }
}
