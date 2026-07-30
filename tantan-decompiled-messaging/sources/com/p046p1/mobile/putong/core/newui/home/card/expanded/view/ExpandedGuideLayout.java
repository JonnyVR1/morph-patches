package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.nah0;
import p149l.rmf;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedGuideLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f22592a;

    /* JADX INFO: renamed from: b */
    public VText f22593b;

    /* JADX INFO: renamed from: c */
    public VImage f22594c;

    /* JADX INFO: renamed from: d */
    public VText f22595d;

    /* JADX INFO: renamed from: e */
    public VLinear f22596e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f22597f;

    /* JADX INFO: renamed from: g */
    public VText f22598g;

    /* JADX INFO: renamed from: h */
    public VLinear f22599h;

    /* JADX INFO: renamed from: i */
    public VText f22600i;

    /* JADX INFO: renamed from: j */
    public VText f22601j;

    /* JADX INFO: renamed from: k */
    public VText f22602k;

    /* JADX INFO: renamed from: l */
    public Animator f22603l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedGuideLayout$a */
    public class C7965a implements Animator.AnimatorListener {
        public C7965a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            xdl0.m208344M(ExpandedGuideLayout.this, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            xdl0.m208344M(ExpandedGuideLayout.this, false);
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
    public final void m38316a(View view) {
        rmf.m179980a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m38317b() {
        Animator duration = bt0.m103741n(this, View.ALPHA, getAlpha(), 0.0f).setDuration(200L);
        this.f22603l = duration;
        duration.addListener(new C7965a());
        this.f22603l.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38316a(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22592a.getVisibility() == 0) {
            zvf0.m220399u("e_profile_update_guidance", "p_suggest_users_home_view", vwb.m200311Y("profile_update_guidance_type", xdl0.m208349O0(this.f22602k) ? "swipe_left" : "swipe_right_left"));
        } else if (this.f22596e.getVisibility() == 0) {
            zvf0.m220399u("e_profile_update_guidance", "p_suggest_users_home_view", vwb.m200311Y("profile_update_guidance_type", "swipe_up"));
        }
        if (getAlpha() == 1.0f) {
            nah0.m158680e("fakeView", "滑动删除蒙层" + motionEvent.getAction());
            nah0.m158679c().m158686h();
            m38317b();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        nah0.m158679c().m158686h();
        m38317b();
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
