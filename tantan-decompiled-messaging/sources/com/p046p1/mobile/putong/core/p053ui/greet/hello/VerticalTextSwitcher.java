package com.p046p1.mobile.putong.core.p053ui.greet.hello;

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
import p147v.VText;
import p149l.e51;
import p149l.vwb;
import p149l.w0l0;

/* JADX INFO: loaded from: classes10.dex */
public class VerticalTextSwitcher extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f29497a;

    /* JADX INFO: renamed from: b */
    public VText f29498b;

    /* JADX INFO: renamed from: c */
    public TextView f29499c;

    /* JADX INFO: renamed from: d */
    public TextView f29500d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f29501e;

    /* JADX INFO: renamed from: f */
    public Animator.AnimatorListener f29502f;

    /* JADX INFO: renamed from: g */
    public final List<String> f29503g;

    /* JADX INFO: renamed from: h */
    public int f29504h;

    /* JADX INFO: renamed from: i */
    public boolean f29505i;

    /* JADX INFO: renamed from: j */
    public boolean f29506j;

    /* JADX INFO: renamed from: k */
    public Runnable f29507k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.hello.VerticalTextSwitcher$a */
    public class C8361a implements Animator.AnimatorListener {
        public C8361a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VerticalTextSwitcher.this.f29499c.setTranslationY(VerticalTextSwitcher.this.getHeight());
            VerticalTextSwitcher.this.f29499c.setAlpha(1.0f);
            TextView textView = VerticalTextSwitcher.this.f29500d;
            VerticalTextSwitcher verticalTextSwitcher = VerticalTextSwitcher.this;
            verticalTextSwitcher.f29500d = verticalTextSwitcher.f29499c;
            VerticalTextSwitcher.this.f29499c = textView;
            VerticalTextSwitcher.this.f29504h++;
            VerticalTextSwitcher.this.m45948n();
            e51.m114745J(VerticalTextSwitcher.this.f29507k);
            VerticalTextSwitcher verticalTextSwitcher2 = VerticalTextSwitcher.this;
            if (verticalTextSwitcher2.f29506j) {
                return;
            }
            if (verticalTextSwitcher2.f29505i || verticalTextSwitcher2.f29504h < VerticalTextSwitcher.this.f29503g.size()) {
                e51.m114743H(VerticalTextSwitcher.this.getContext(), VerticalTextSwitcher.this.f29507k, 3000L);
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
        this.f29503g = new ArrayList();
        this.f29505i = true;
        this.f29506j = false;
        this.f29507k = new Runnable() { // from class: l.v0l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179124a.m45947m();
            }
        };
    }

    public int getCurrentIndex() {
        return this.f29504h;
    }

    public List<String> getTextLists() {
        return this.f29503g;
    }

    /* JADX INFO: renamed from: j */
    public final void m45944j(View view) {
        w0l0.m200895a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m45945k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29499c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f29499c, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f29500d, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m45946l() {
        return !vwb.m200296J(this.f29503g) && this.f29503g.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m45948n() {
        if (NullChecker.m81303a(this.f29500d) && m45946l()) {
            TextView textView = this.f29500d;
            List<String> list = this.f29503g;
            textView.setText(list.get((this.f29504h + 1) % list.size()));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m45949o() {
        if (NullChecker.m81303a(this.f29499c)) {
            this.f29499c.setText(this.f29503g.get(this.f29504h));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29506j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29506j = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45944j(this);
        this.f29500d = this.f29498b;
        this.f29499c = this.f29497a;
        this.f29502f = new C8361a();
    }

    /* JADX INFO: renamed from: p */
    public void m45950p() {
        if (m45946l()) {
            e51.m114743H(getContext(), this.f29507k, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m45947m() {
        e51.m114745J(this.f29507k);
        if (!(NullChecker.m81303a(this.f29501e) && this.f29501e.isRunning()) && m45946l()) {
            this.f29500d.setTranslationY(getHeight());
            this.f29500d.setVisibility(0);
            AnimatorSet animatorSetM45945k = m45945k();
            this.f29501e = animatorSetM45945k;
            animatorSetM45945k.addListener(this.f29502f);
            this.f29501e.start();
        }
    }

    public void setCurrentIndex(int i) {
        this.f29504h = i;
        m45948n();
        m45949o();
    }

    public void setText(String str) {
        this.f29503g.clear();
        this.f29503g.add(str);
        setCurrentIndex(0);
    }

    public void setTextColor(@ColorInt int i) {
        this.f29497a.setTextColor(i);
        this.f29498b.setTextColor(i);
    }

    public void setTextList(List<String> list) {
        this.f29503g.clear();
        this.f29503g.addAll(list);
        setCurrentIndex(0);
    }

    public void setTextSize(float f) {
        this.f29497a.setTextSize(f);
        this.f29498b.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.f29497a.setTypeface(typeface);
        this.f29498b.setTypeface(typeface);
    }

    public VerticalTextSwitcher(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalTextSwitcher(@NonNull Context context) {
        this(context, null);
    }
}
