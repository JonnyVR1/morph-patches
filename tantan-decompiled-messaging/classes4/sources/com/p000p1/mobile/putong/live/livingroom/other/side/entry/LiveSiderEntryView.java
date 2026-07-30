package com.p000p1.mobile.putong.live.livingroom.other.side.entry;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.bt0;
import l.hxs;
import l.s7m;
import l.t100;
import l.xdl0;
import p002l.tvt;
import p002l.wvt;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSiderEntryView extends RelativeLayout implements s7m<tvt> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7313a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7314b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7315c;

    /* JADX INFO: renamed from: d */
    public VImage f7316d;

    /* JADX INFO: renamed from: e */
    public TextView f7317e;

    /* JADX INFO: renamed from: f */
    public Animator f7318f;

    /* JADX INFO: renamed from: g */
    public List<VDraweeView> f7319g;

    /* JADX INFO: renamed from: h */
    public tvt f7320h;

    public LiveSiderEntryView(Context context) {
        super(context);
        this.f7319g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m9220f(View view) {
        tvt tvtVar = this.f7320h;
        if (tvtVar != null) {
            tvtVar.m23220i4();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m9221n() {
        xdl0.M0(this, false);
        Iterator<VDraweeView> it = this.f7319g.iterator();
        while (it.hasNext()) {
            xdl0.M0(it.next(), false);
        }
        this.f7316d.setAlpha(1.0f);
        xdl0.V(this.f7316d, t100.d(6.0f));
    }

    /* JADX INFO: renamed from: q */
    private void m9222q() {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorP = bt0.p(this.f7313a, "alpha", 0L, 500L, linearInterpolator, new float[]{1.0f, 0.0f});
        Animator animatorP2 = bt0.p(this.f7313a, "translationX", 0L, 500L, linearInterpolator, new float[]{0.0f, t100.d(12.0f)});
        Animator animatorP3 = bt0.p(this.f7314b, "alpha", 500L, 500L, linearInterpolator, new float[]{1.0f, 0.0f});
        Animator animatorP4 = bt0.p(this.f7314b, "translationX", 500L, 500L, linearInterpolator, new float[]{0.0f, t100.d(12.0f)});
        Animator animatorP5 = bt0.p(this.f7315c, "alpha", 1000L, 500L, linearInterpolator, new float[]{1.0f, 0.0f});
        Animator animatorP6 = bt0.p(this.f7316d, "alpha", 1300L, 200L, linearInterpolator, new float[]{0.0f, 1.0f});
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7316d.getLayoutParams();
        ValueAnimator duration = ValueAnimator.ofInt(layoutParams.leftMargin, t100.d(8.0f)).setDuration(1000L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vvt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21349a.m9227i(layoutParams, valueAnimator);
            }
        });
        duration.setStartDelay(100L);
        Animator animatorZ = bt0.z(new Animator[]{animatorP, animatorP3, animatorP2, animatorP5, animatorP4, duration, animatorP6});
        this.f7318f = animatorZ;
        animatorZ.start();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9223C0() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m9224c(View view) {
        wvt.m25518a(this, view);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m9228i1(tvt tvtVar) {
        this.f7320h = tvtVar;
    }

    public void destroy() {
        Animator animator = this.f7318f;
        if (animator != null) {
            animator.cancel();
        }
        m9221n();
    }

    /* JADX INFO: renamed from: e */
    public void m9226e(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance.showFollow) {
            this.f7317e.setText(bLiveEntrance.followTitle);
        } else if (bLiveEntrance.showDefaultTitle) {
            this.f7317e.setText(bLiveEntrance.defaultTitle);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m9227i(RelativeLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7316d.setLayoutParams(layoutParams);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m9229j() {
        m9222q();
    }

    /* JADX INFO: renamed from: k */
    public void m9230k() {
        this.f7313a.setAlpha(1.0f);
        this.f7314b.setAlpha(1.0f);
        this.f7315c.setAlpha(1.0f);
        this.f7313a.setTranslationX(0.0f);
        this.f7314b.setTranslationX(0.0f);
        this.f7315c.setTranslationX(0.0f);
        this.f7316d.setAlpha(0.0f);
        xdl0.V(this.f7316d, t100.d(30.0f));
    }

    /* JADX INFO: renamed from: l */
    public void m9231l() {
        Iterator<VDraweeView> it = this.f7319g.iterator();
        while (it.hasNext()) {
            xdl0.M0(it.next(), false);
        }
        this.f7316d.setAlpha(1.0f);
        xdl0.V(this.f7316d, t100.d(6.0f));
    }

    /* JADX INFO: renamed from: m */
    public void m9232m(List<String> list) {
        int i = 0;
        while (i < list.size() && i < this.f7319g.size()) {
            VDraweeView vDraweeView = this.f7319g.get(i);
            hxs.s("context_single_room", vDraweeView, list.get(i));
            xdl0.M0(vDraweeView, true);
            i++;
        }
        while (i < this.f7319g.size()) {
            xdl0.M0(this.f7319g.get(i), false);
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9224c(this);
        this.f7319g.clear();
        this.f7319g.add(this.f7313a);
        this.f7319g.add(this.f7314b);
        this.f7319g.add(this.f7315c);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.uvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20850a.m9220f(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m9233p(boolean z) {
        xdl0.M0(this, z);
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7319g = new ArrayList();
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7319g = new ArrayList();
    }
}
