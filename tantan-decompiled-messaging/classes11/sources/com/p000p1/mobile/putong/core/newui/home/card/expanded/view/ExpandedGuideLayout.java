package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import l.bt0;
import l.j760;
import l.rmf;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.nah0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedGuideLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f1370a;

    /* JADX INFO: renamed from: b */
    public VText f1371b;

    /* JADX INFO: renamed from: c */
    public VImage f1372c;

    /* JADX INFO: renamed from: d */
    public VText f1373d;

    /* JADX INFO: renamed from: e */
    public VLinear f1374e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f1375f;

    /* JADX INFO: renamed from: g */
    public VText f1376g;

    /* JADX INFO: renamed from: h */
    public VLinear f1377h;

    /* JADX INFO: renamed from: i */
    public VText f1378i;

    /* JADX INFO: renamed from: j */
    public VText f1379j;

    /* JADX INFO: renamed from: k */
    public VText f1380k;

    /* JADX INFO: renamed from: l */
    public Animator f1381l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedGuideLayout$a */
    public class C0129a implements Animator.AnimatorListener {
        public C0129a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            xdl0.M(ExpandedGuideLayout.this, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            xdl0.M(ExpandedGuideLayout.this, false);
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
    public final void m2294a(View view) {
        rmf.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m2295b() {
        Animator duration = bt0.n(this, View.ALPHA, new float[]{getAlpha(), 0.0f}).setDuration(200L);
        this.f1381l = duration;
        duration.addListener(new C0129a());
        this.f1381l.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2294a(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1370a.getVisibility() == 0) {
            zvf0.u("e_profile_update_guidance", "p_suggest_users_home_view", new j760[]{vwb.Y("profile_update_guidance_type", xdl0.O0(this.f1380k) ? "swipe_left" : "swipe_right_left")});
        } else if (this.f1374e.getVisibility() == 0) {
            zvf0.u("e_profile_update_guidance", "p_suggest_users_home_view", new j760[]{vwb.Y("profile_update_guidance_type", "swipe_up")});
        }
        if (getAlpha() == 1.0f) {
            nah0.m18813e("fakeView", "滑动删除蒙层" + motionEvent.getAction());
            nah0.m18812c().m18819h();
            m2295b();
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        nah0.m18812c().m18819h();
        m2295b();
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
