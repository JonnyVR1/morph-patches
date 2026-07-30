package com.p051p1.mobile.putong.feed.newui.preview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import p151v.C22700a;

/* JADX INFO: loaded from: classes13.dex */
public class PlayerViewWithTransAnim extends PlayerView implements C22700a.b {

    /* JADX INFO: renamed from: A */
    public C22700a f43477A;

    /* JADX INFO: renamed from: z */
    public String f43478z;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m66525C();
    }

    /* JADX INFO: renamed from: C */
    private void m66525C() {
        this.f43477A = new C22700a(this);
    }

    public float getOriginalHeight() {
        return this.f43477A.m224579i();
    }

    public float getOriginalWidth() {
        return this.f43477A.m224580j();
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: k */
    public String mo45129k() {
        return this.f43478z;
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo45130l(ViewGroup viewGroup) {
        return this.f43477A.m224575G(viewGroup);
    }

    @Override // p151v.C22700a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo45131n(ViewGroup viewGroup) {
        return this.f43477A.m224576H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f43477A.m224595y(f);
    }

    public void setOriginalWidth(float f) {
        this.f43477A.m224596z(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f43478z = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66525C();
    }
}
