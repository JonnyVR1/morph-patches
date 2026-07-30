package com.p051p1.mobile.putong.live.livingroom.other.side.entry;

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
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.iam;
import p153l.izs;
import p153l.qa00;
import p153l.uxt;
import p153l.xxt;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSiderEntryView extends RelativeLayout implements iam<uxt> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52119a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52120b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52121c;

    /* JADX INFO: renamed from: d */
    public VImage f52122d;

    /* JADX INFO: renamed from: e */
    public TextView f52123e;

    /* JADX INFO: renamed from: f */
    public Animator f52124f;

    /* JADX INFO: renamed from: g */
    public List<VDraweeView> f52125g;

    /* JADX INFO: renamed from: h */
    public uxt f52126h;

    public LiveSiderEntryView(Context context) {
        super(context);
        this.f52125g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m76764f(View view) {
        uxt uxtVar = this.f52126h;
        if (uxtVar != null) {
            uxtVar.m198538i4();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m76765n() {
        bnl0.m105525M0(this, false);
        Iterator<VDraweeView> it = this.f52125g.iterator();
        while (it.hasNext()) {
            bnl0.m105525M0(it.next(), false);
        }
        this.f52122d.setAlpha(1.0f);
        bnl0.m105538V(this.f52122d, qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: q */
    private void m76766q() {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132170p = gt0.m132170p(this.f52119a, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM132170p2 = gt0.m132170p(this.f52119a, "translationX", 0L, 500L, linearInterpolator, 0.0f, qa00.m175859d(12.0f));
        Animator animatorM132170p3 = gt0.m132170p(this.f52120b, "alpha", 500L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(this.f52120b, "translationX", 500L, 500L, linearInterpolator, 0.0f, qa00.m175859d(12.0f));
        Animator animatorM132170p5 = gt0.m132170p(this.f52121c, "alpha", 1000L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM132170p6 = gt0.m132170p(this.f52122d, "alpha", 1300L, 200L, linearInterpolator, 0.0f, 1.0f);
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f52122d.getLayoutParams();
        ValueAnimator duration = ValueAnimator.ofInt(layoutParams.leftMargin, qa00.m175859d(8.0f)).setDuration(1000L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wxt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f191525a.m76770i(layoutParams, valueAnimator);
            }
        });
        duration.setStartDelay(100L);
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, animatorM132170p3, animatorM132170p2, animatorM132170p5, animatorM132170p4, duration, animatorM132170p6);
        this.f52124f = animatorM132180z;
        animatorM132180z.start();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m76767c(View view) {
        xxt.m213557a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uxt uxtVar) {
        this.f52126h = uxtVar;
    }

    @Override // p153l.iam
    public void destroy() {
        Animator animator = this.f52124f;
        if (animator != null) {
            animator.cancel();
        }
        m76765n();
    }

    /* JADX INFO: renamed from: e */
    public void m76769e(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance.showFollow) {
            this.f52123e.setText(bLiveEntrance.followTitle);
        } else if (bLiveEntrance.showDefaultTitle) {
            this.f52123e.setText(bLiveEntrance.defaultTitle);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76770i(RelativeLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f52122d.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m76771j() {
        m76766q();
    }

    /* JADX INFO: renamed from: k */
    public void m76772k() {
        this.f52119a.setAlpha(1.0f);
        this.f52120b.setAlpha(1.0f);
        this.f52121c.setAlpha(1.0f);
        this.f52119a.setTranslationX(0.0f);
        this.f52120b.setTranslationX(0.0f);
        this.f52121c.setTranslationX(0.0f);
        this.f52122d.setAlpha(0.0f);
        bnl0.m105538V(this.f52122d, qa00.m175859d(30.0f));
    }

    /* JADX INFO: renamed from: l */
    public void m76773l() {
        Iterator<VDraweeView> it = this.f52125g.iterator();
        while (it.hasNext()) {
            bnl0.m105525M0(it.next(), false);
        }
        this.f52122d.setAlpha(1.0f);
        bnl0.m105538V(this.f52122d, qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: m */
    public void m76774m(List<String> list) {
        int i = 0;
        while (i < list.size() && i < this.f52125g.size()) {
            VDraweeView vDraweeView = this.f52125g.get(i);
            izs.m142868s("context_single_room", vDraweeView, list.get(i));
            bnl0.m105525M0(vDraweeView, true);
            i++;
        }
        while (i < this.f52125g.size()) {
            bnl0.m105525M0(this.f52125g.get(i), false);
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76767c(this);
        this.f52125g.clear();
        this.f52125g.add(this.f52119a);
        this.f52125g.add(this.f52120b);
        this.f52125g.add(this.f52121c);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vxt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186301a.m76764f(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m76775p(boolean z) {
        bnl0.m105525M0(this, z);
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52125g = new ArrayList();
    }

    public LiveSiderEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52125g = new ArrayList();
    }
}
