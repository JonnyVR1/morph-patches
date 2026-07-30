package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.bt0;
import p149l.dt0;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualSwitchButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f52749a;

    /* JADX INFO: renamed from: b */
    public View f52750b;

    /* JADX INFO: renamed from: c */
    public Animator f52751c;

    /* JADX INFO: renamed from: d */
    public boolean f52752d;

    public VirtualSwitchButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m77503b() {
        return this.f52752d;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m77504c(boolean z) {
        this.f52749a.setBackgroundResource(z ? i3c0.f111077l7 : i3c0.f111065k7);
        this.f52750b.setBackgroundResource(z ? i3c0.f111053j7 : i3c0.f111041i7);
    }

    /* JADX INFO: renamed from: d */
    public void m77505d(final boolean z, boolean z2) {
        this.f52752d = z;
        dt0.m113502B(this.f52751c);
        if (!z2) {
            this.f52749a.setTranslationX(z ? t100.f167264m : 0.0f);
            this.f52749a.setBackgroundResource(z ? i3c0.f111077l7 : i3c0.f111065k7);
            this.f52750b.setBackgroundResource(z ? i3c0.f111053j7 : i3c0.f111041i7);
            return;
        }
        View view = this.f52749a;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f52751c = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, t100.m186890d(16.0f));
        } else {
            this.f52751c = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, t100.m186890d(16.0f), 0.0f);
        }
        this.f52751c.setDuration(200L);
        bt0.m103733f(this.f52751c, new Runnable() { // from class: l.fvl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99461a.m77504c(z);
            }
        });
        this.f52751c.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dt0.m113502B(this.f52751c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52750b = new View(getContext());
        addView(this.f52750b, new FrameLayout.LayoutParams(t100.m186890d(46.0f), t100.f167271t));
        this.f52749a = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(22.0f), t100.m186890d(22.0f));
        layoutParams.leftMargin = t100.m186890d(4.0f);
        layoutParams.rightMargin = t100.m186890d(4.0f);
        layoutParams.gravity = 16;
        addView(this.f52749a, layoutParams);
        m77505d(false, false);
    }

    public void setCheckedWithoutAnim(boolean z) {
        m77505d(z, false);
    }

    public VirtualSwitchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualSwitchButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
