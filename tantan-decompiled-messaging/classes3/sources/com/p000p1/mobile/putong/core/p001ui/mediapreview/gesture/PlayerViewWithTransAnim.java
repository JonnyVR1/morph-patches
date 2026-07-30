package com.p000p1.mobile.putong.core.p001ui.mediapreview.gesture;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.ui.PlayerView;
import p028v.C1378a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PlayerViewWithTransAnim extends PlayerView implements C1378a.b {

    /* JADX INFO: renamed from: B */
    public String f571B;

    /* JADX INFO: renamed from: C */
    public C1378a f572C;

    public PlayerViewWithTransAnim(@NonNull Context context) {
        super(context);
        m931B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private void m931B() {
        this.f572C = new C1378a(this);
    }

    public float getOriginalHeight() {
        return this.f572C.m11825i();
    }

    public float getOriginalWidth() {
        return this.f572C.m11826j();
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: k */
    public String mo879k() {
        return this.f571B;
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: l */
    public ValueAnimator mo880l(ViewGroup viewGroup) {
        return this.f572C.m11821G(viewGroup);
    }

    @Override // p028v.C1378a.b
    /* JADX INFO: renamed from: n */
    public ValueAnimator mo881n(ViewGroup viewGroup) {
        return this.f572C.m11822H(viewGroup);
    }

    public void setOriginalHeight(float f) {
        this.f572C.m11841y(f);
    }

    public void setOriginalWidth(float f) {
        this.f572C.m11842z(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTranslationX(float f) {
        super/*android.view.View*/.setTranslationX(f);
    }

    public void setZoomAnimationKey(String str) {
        this.f571B = str;
    }

    public PlayerViewWithTransAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m931B();
    }
}
