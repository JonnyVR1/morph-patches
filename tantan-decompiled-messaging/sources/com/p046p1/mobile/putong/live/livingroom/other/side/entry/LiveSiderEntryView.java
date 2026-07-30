package com.p046p1.mobile.putong.live.livingroom.other.side.entry;

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
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.hxs;
import p149l.s7m;
import p149l.t100;
import p149l.tvt;
import p149l.wvt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSiderEntryView extends RelativeLayout implements s7m<tvt> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51271a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51272b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51273c;

    /* JADX INFO: renamed from: d */
    public VImage f51274d;

    /* JADX INFO: renamed from: e */
    public TextView f51275e;

    /* JADX INFO: renamed from: f */
    public Animator f51276f;

    /* JADX INFO: renamed from: g */
    public List<VDraweeView> f51277g;

    /* JADX INFO: renamed from: h */
    public tvt f51278h;

    public LiveSiderEntryView(Context context) {
        super(context);
        this.f51277g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m75581f(View view) {
        tvt tvtVar = this.f51278h;
        if (tvtVar != null) {
            tvtVar.m190811i4();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m75582n() {
        xdl0.m208345M0(this, false);
        Iterator<VDraweeView> it = this.f51277g.iterator();
        while (it.hasNext()) {
            xdl0.m208345M0(it.next(), false);
        }
        this.f51274d.setAlpha(1.0f);
        xdl0.m208358V(this.f51274d, t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: q */
    private void m75583q() {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103743p = bt0.m103743p(this.f51271a, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM103743p2 = bt0.m103743p(this.f51271a, "translationX", 0L, 500L, linearInterpolator, 0.0f, t100.m186890d(12.0f));
        Animator animatorM103743p3 = bt0.m103743p(this.f51272b, "alpha", 500L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(this.f51272b, "translationX", 500L, 500L, linearInterpolator, 0.0f, t100.m186890d(12.0f));
        Animator animatorM103743p5 = bt0.m103743p(this.f51273c, "alpha", 1000L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM103743p6 = bt0.m103743p(this.f51274d, "alpha", 1300L, 200L, linearInterpolator, 0.0f, 1.0f);
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f51274d.getLayoutParams();
        ValueAnimator duration = ValueAnimator.ofInt(layoutParams.leftMargin, t100.m186890d(8.0f)).setDuration(1000L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vvt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f183254a.m75587i(layoutParams, valueAnimator);
            }
        });
        duration.setStartDelay(100L);
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, animatorM103743p3, animatorM103743p2, animatorM103743p5, animatorM103743p4, duration, animatorM103743p6);
        this.f51276f = animatorM103753z;
        animatorM103753z.start();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m75584c(View view) {
        wvt.m205759a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tvt tvtVar) {
        this.f51278h = tvtVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        Animator animator = this.f51276f;
        if (animator != null) {
            animator.cancel();
        }
        m75582n();
    }

    /* JADX INFO: renamed from: e */
    public void m75586e(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance.showFollow) {
            this.f51275e.setText(bLiveEntrance.followTitle);
        } else if (bLiveEntrance.showDefaultTitle) {
            this.f51275e.setText(bLiveEntrance.defaultTitle);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m75587i(RelativeLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f51274d.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m75588j() {
        m75583q();
    }

    /* JADX INFO: renamed from: k */
    public void m75589k() {
        this.f51271a.setAlpha(1.0f);
        this.f51272b.setAlpha(1.0f);
        this.f51273c.setAlpha(1.0f);
        this.f51271a.setTranslationX(0.0f);
        this.f51272b.setTranslationX(0.0f);
        this.f51273c.setTranslationX(0.0f);
        this.f51274d.setAlpha(0.0f);
        xdl0.m208358V(this.f51274d, t100.m186890d(30.0f));
    }

    /* JADX INFO: renamed from: l */
    public void m75590l() {
        Iterator<VDraweeView> it = this.f51277g.iterator();
        while (it.hasNext()) {
            xdl0.m208345M0(it.next(), false);
        }
        this.f51274d.setAlpha(1.0f);
        xdl0.m208358V(this.f51274d, t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: m */
    public void m75591m(List<String> list) {
        int i = 0;
        while (i < list.size() && i < this.f51277g.size()) {
            VDraweeView vDraweeView = this.f51277g.get(i);
            hxs.m133406s("context_single_room", vDraweeView, list.get(i));
            xdl0.m208345M0(vDraweeView, true);
            i++;
        }
        while (i < this.f51277g.size()) {
            xdl0.m208345M0(this.f51277g.get(i), false);
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75584c(this);
        this.f51277g.clear();
        this.f51277g.add(this.f51271a);
        this.f51277g.add(this.f51272b);
        this.f51277g.add(this.f51273c);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.uvt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178559a.m75581f(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m75592p(boolean z) {
        xdl0.m208345M0(this, z);
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51277g = new ArrayList();
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51277g = new ArrayList();
    }
}
