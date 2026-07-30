package com.p051p1.mobile.putong.core.p058ui.greet.hello;

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
import p151v.VText;
import p153l.bal0;
import p153l.jyb;
import p153l.l51;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalTextSwitcher extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f30345a;

    /* JADX INFO: renamed from: b */
    public VText f30346b;

    /* JADX INFO: renamed from: c */
    public TextView f30347c;

    /* JADX INFO: renamed from: d */
    public TextView f30348d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f30349e;

    /* JADX INFO: renamed from: f */
    public Animator.AnimatorListener f30350f;

    /* JADX INFO: renamed from: g */
    public final List<String> f30351g;

    /* JADX INFO: renamed from: h */
    public int f30352h;

    /* JADX INFO: renamed from: i */
    public boolean f30353i;

    /* JADX INFO: renamed from: j */
    public boolean f30354j;

    /* JADX INFO: renamed from: k */
    public Runnable f30355k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.hello.VerticalTextSwitcher$a */
    public class C8524a implements Animator.AnimatorListener {
        public C8524a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VerticalTextSwitcher.this.f30347c.setTranslationY(VerticalTextSwitcher.this.getHeight());
            VerticalTextSwitcher.this.f30347c.setAlpha(1.0f);
            TextView textView = VerticalTextSwitcher.this.f30348d;
            VerticalTextSwitcher verticalTextSwitcher = VerticalTextSwitcher.this;
            verticalTextSwitcher.f30348d = verticalTextSwitcher.f30347c;
            VerticalTextSwitcher.this.f30347c = textView;
            VerticalTextSwitcher.this.f30352h++;
            VerticalTextSwitcher.this.m47131n();
            l51.m152890J(VerticalTextSwitcher.this.f30355k);
            VerticalTextSwitcher verticalTextSwitcher2 = VerticalTextSwitcher.this;
            if (verticalTextSwitcher2.f30354j) {
                return;
            }
            if (verticalTextSwitcher2.f30353i || verticalTextSwitcher2.f30352h < VerticalTextSwitcher.this.f30351g.size()) {
                l51.m152888H(VerticalTextSwitcher.this.getContext(), VerticalTextSwitcher.this.f30355k, 3000L);
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
        this.f30351g = new ArrayList();
        this.f30353i = true;
        this.f30354j = false;
        this.f30355k = new Runnable() { // from class: l.aal0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69153a.m47130m();
            }
        };
    }

    public int getCurrentIndex() {
        return this.f30352h;
    }

    public List<String> getTextLists() {
        return this.f30351g;
    }

    /* JADX INFO: renamed from: j */
    public final void m47127j(View view) {
        bal0.m103214a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m47128k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30347c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f30347c, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f30348d, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m47129l() {
        return !jyb.m147479J(this.f30351g) && this.f30351g.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m47131n() {
        if (NullChecker.m82486a(this.f30348d) && m47129l()) {
            TextView textView = this.f30348d;
            List<String> list = this.f30351g;
            textView.setText(list.get((this.f30352h + 1) % list.size()));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m47132o() {
        if (NullChecker.m82486a(this.f30347c)) {
            this.f30347c.setText(this.f30351g.get(this.f30352h));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30354j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30354j = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47127j(this);
        this.f30348d = this.f30346b;
        this.f30347c = this.f30345a;
        this.f30350f = new C8524a();
    }

    /* JADX INFO: renamed from: p */
    public void m47133p() {
        if (m47129l()) {
            l51.m152888H(getContext(), this.f30355k, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m47130m() {
        l51.m152890J(this.f30355k);
        if (!(NullChecker.m82486a(this.f30349e) && this.f30349e.isRunning()) && m47129l()) {
            this.f30348d.setTranslationY(getHeight());
            this.f30348d.setVisibility(0);
            AnimatorSet animatorSetM47128k = m47128k();
            this.f30349e = animatorSetM47128k;
            animatorSetM47128k.addListener(this.f30350f);
            this.f30349e.start();
        }
    }

    public void setCurrentIndex(int i) {
        this.f30352h = i;
        m47131n();
        m47132o();
    }

    public void setText(String str) {
        this.f30351g.clear();
        this.f30351g.add(str);
        setCurrentIndex(0);
    }

    public void setTextColor(@ColorInt int i) {
        this.f30345a.setTextColor(i);
        this.f30346b.setTextColor(i);
    }

    public void setTextList(List<String> list) {
        this.f30351g.clear();
        this.f30351g.addAll(list);
        setCurrentIndex(0);
    }

    public void setTextSize(float f) {
        this.f30345a.setTextSize(f);
        this.f30346b.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.f30345a.setTypeface(typeface);
        this.f30346b.setTypeface(typeface);
    }

    public VerticalTextSwitcher(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalTextSwitcher(@NonNull Context context) {
        this(context, null);
    }
}
