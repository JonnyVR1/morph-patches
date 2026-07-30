package com.p000p1.mobile.putong.core.p001ui.greet.hello;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e51;
import l.vwb;
import p003l.w0l0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VerticalTextSwitcher extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f1891a;

    /* JADX INFO: renamed from: b */
    public VText f1892b;

    /* JADX INFO: renamed from: c */
    public TextView f1893c;

    /* JADX INFO: renamed from: d */
    public TextView f1894d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f1895e;

    /* JADX INFO: renamed from: f */
    public Animator.AnimatorListener f1896f;

    /* JADX INFO: renamed from: g */
    public final List<String> f1897g;

    /* JADX INFO: renamed from: h */
    public int f1898h;

    /* JADX INFO: renamed from: i */
    public boolean f1899i;

    /* JADX INFO: renamed from: j */
    public boolean f1900j;

    /* JADX INFO: renamed from: k */
    public Runnable f1901k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.hello.VerticalTextSwitcher$a */
    public class C3136a implements Animator.AnimatorListener {
        public C3136a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VerticalTextSwitcher.this.f1893c.setTranslationY(VerticalTextSwitcher.this.getHeight());
            VerticalTextSwitcher.this.f1893c.setAlpha(1.0f);
            TextView textView = VerticalTextSwitcher.this.f1894d;
            VerticalTextSwitcher verticalTextSwitcher = VerticalTextSwitcher.this;
            verticalTextSwitcher.f1894d = verticalTextSwitcher.f1893c;
            VerticalTextSwitcher.this.f1893c = textView;
            VerticalTextSwitcher.this.f1898h++;
            VerticalTextSwitcher.this.m3301n();
            e51.J(VerticalTextSwitcher.this.f1901k);
            VerticalTextSwitcher verticalTextSwitcher2 = VerticalTextSwitcher.this;
            if (verticalTextSwitcher2.f1900j) {
                return;
            }
            if (verticalTextSwitcher2.f1899i || verticalTextSwitcher2.f1898h < VerticalTextSwitcher.this.f1897g.size()) {
                e51.H(VerticalTextSwitcher.this.getContext(), VerticalTextSwitcher.this.f1901k, 3000L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VerticalTextSwitcher(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1897g = new ArrayList();
        this.f1899i = true;
        this.f1900j = false;
        this.f1901k = new Runnable() { // from class: l.v0l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7853a.m3300m();
            }
        };
    }

    public int getCurrentIndex() {
        return this.f1898h;
    }

    public List<String> getTextLists() {
        return this.f1897g;
    }

    /* JADX INFO: renamed from: j */
    public final void m3297j(View view) {
        w0l0.m10427a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m3298k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1893c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f1893c, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f1894d, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m3299l() {
        return !vwb.J(this.f1897g) && this.f1897g.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m3301n() {
        if (NullChecker.a(this.f1894d) && m3299l()) {
            TextView textView = this.f1894d;
            List<String> list = this.f1897g;
            textView.setText(list.get((this.f1898h + 1) % list.size()));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3302o() {
        if (NullChecker.a(this.f1893c)) {
            this.f1893c.setText(this.f1897g.get(this.f1898h));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1900j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1900j = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3297j(this);
        this.f1894d = this.f1892b;
        this.f1893c = this.f1891a;
        this.f1896f = new C3136a();
    }

    /* JADX INFO: renamed from: p */
    public void m3303p() {
        if (m3299l()) {
            e51.H(getContext(), this.f1901k, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m3300m() {
        e51.J(this.f1901k);
        if (!(NullChecker.a(this.f1895e) && this.f1895e.isRunning()) && m3299l()) {
            this.f1894d.setTranslationY(getHeight());
            this.f1894d.setVisibility(0);
            AnimatorSet animatorSetM3298k = m3298k();
            this.f1895e = animatorSetM3298k;
            animatorSetM3298k.addListener(this.f1896f);
            this.f1895e.start();
        }
    }

    public void setCurrentIndex(int i) {
        this.f1898h = i;
        m3301n();
        m3302o();
    }

    public void setText(String str) {
        this.f1897g.clear();
        this.f1897g.add(str);
        setCurrentIndex(0);
    }

    public void setTextColor(@ColorInt int i) {
        this.f1891a.setTextColor(i);
        this.f1892b.setTextColor(i);
    }

    public void setTextList(List<String> list) {
        this.f1897g.clear();
        this.f1897g.addAll(list);
        setCurrentIndex(0);
    }

    public void setTextSize(float f) {
        this.f1891a.setTextSize(f);
        this.f1892b.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.f1891a.setTypeface(typeface);
        this.f1892b.setTypeface(typeface);
    }

    public VerticalTextSwitcher(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalTextSwitcher(@NonNull Context context) {
        this(context, null);
    }
}
