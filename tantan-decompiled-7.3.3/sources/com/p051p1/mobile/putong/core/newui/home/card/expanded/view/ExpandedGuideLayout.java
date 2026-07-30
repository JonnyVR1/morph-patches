package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.i4g0;
import p153l.jyb;
import p153l.vih0;
import p153l.xnf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedGuideLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f23334a;

    /* JADX INFO: renamed from: b */
    public VText f23335b;

    /* JADX INFO: renamed from: c */
    public VImage f23336c;

    /* JADX INFO: renamed from: d */
    public VText f23337d;

    /* JADX INFO: renamed from: e */
    public VLinear f23338e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f23339f;

    /* JADX INFO: renamed from: g */
    public VText f23340g;

    /* JADX INFO: renamed from: h */
    public VLinear f23341h;

    /* JADX INFO: renamed from: i */
    public VText f23342i;

    /* JADX INFO: renamed from: j */
    public VText f23343j;

    /* JADX INFO: renamed from: k */
    public VText f23344k;

    /* JADX INFO: renamed from: l */
    public Animator f23345l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedGuideLayout$a */
    public class C8116a implements Animator.AnimatorListener {
        public C8116a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            bnl0.m105524M(ExpandedGuideLayout.this, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            bnl0.m105524M(ExpandedGuideLayout.this, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    public ExpandedGuideLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39319a(View view) {
        xnf.m212182a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m39320b() {
        Animator duration = gt0.m132168n(this, View.ALPHA, getAlpha(), 0.0f).setDuration(200L);
        this.f23345l = duration;
        duration.addListener(new C8116a());
        this.f23345l.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39319a(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23334a.getVisibility() == 0) {
            i4g0.m138523u("e_profile_update_guidance", "p_suggest_users_home_view", jyb.m147494Y("profile_update_guidance_type", bnl0.m105529O0(this.f23344k) ? "swipe_left" : "swipe_right_left"));
        } else if (this.f23338e.getVisibility() == 0) {
            i4g0.m138523u("e_profile_update_guidance", "p_suggest_users_home_view", jyb.m147494Y("profile_update_guidance_type", "swipe_up"));
        }
        if (getAlpha() == 1.0f) {
            vih0.m201339e("fakeView", "滑动删除蒙层" + motionEvent.getAction());
            vih0.m201338c().m201345h();
            m39320b();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        vih0.m201338c().m201345h();
        m39320b();
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ExpandedGuideLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedGuideLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
