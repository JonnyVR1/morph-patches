package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gt0;
import p153l.it0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualSwitchButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f53597a;

    /* JADX INFO: renamed from: b */
    public View f53598b;

    /* JADX INFO: renamed from: c */
    public Animator f53599c;

    /* JADX INFO: renamed from: d */
    public boolean f53600d;

    public VirtualSwitchButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m78686b() {
        return this.f53600d;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m78687c(boolean z) {
        this.f53597a.setBackgroundResource(z ? obc0.f146405l7 : obc0.f146393k7);
        this.f53598b.setBackgroundResource(z ? obc0.f146381j7 : obc0.f146369i7);
    }

    /* JADX INFO: renamed from: d */
    public void m78688d(final boolean z, boolean z2) {
        this.f53600d = z;
        it0.m142008B(this.f53599c);
        if (!z2) {
            this.f53597a.setTranslationX(z ? qa00.f156326m : 0.0f);
            this.f53597a.setBackgroundResource(z ? obc0.f146405l7 : obc0.f146393k7);
            this.f53598b.setBackgroundResource(z ? obc0.f146381j7 : obc0.f146369i7);
            return;
        }
        View view = this.f53597a;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f53599c = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, qa00.m175859d(16.0f));
        } else {
            this.f53599c = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, qa00.m175859d(16.0f), 0.0f);
        }
        this.f53599c.setDuration(200L);
        gt0.m132160f(this.f53599c, new Runnable() { // from class: l.j4m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f118309a.m78687c(z);
            }
        });
        this.f53599c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        it0.m142008B(this.f53599c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53598b = new View(getContext());
        addView(this.f53598b, new FrameLayout.LayoutParams(qa00.m175859d(46.0f), qa00.f156333t));
        this.f53597a = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(22.0f), qa00.m175859d(22.0f));
        layoutParams.leftMargin = qa00.m175859d(4.0f);
        layoutParams.rightMargin = qa00.m175859d(4.0f);
        layoutParams.gravity = 16;
        addView(this.f53597a, layoutParams);
        m78688d(false, false);
    }

    public void setCheckedWithoutAnim(boolean z) {
        m78688d(z, false);
    }

    public VirtualSwitchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualSwitchButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
