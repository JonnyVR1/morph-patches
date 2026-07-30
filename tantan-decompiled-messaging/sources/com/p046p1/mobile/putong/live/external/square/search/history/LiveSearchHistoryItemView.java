package com.p046p1.mobile.putong.live.external.square.search.history;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.fpn0;
import p149l.njt;
import p149l.pjt;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSearchHistoryItemView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final int f46225d = t100.f167276y;

    /* JADX INFO: renamed from: a */
    public VImage f46226a;

    /* JADX INFO: renamed from: b */
    public VText f46227b;

    /* JADX INFO: renamed from: c */
    public VImage f46228c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView$a */
    public class C12583a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f46229a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f46230b;

        public C12583a(ValueAnimator valueAnimator, d30 d30Var) {
            this.f46229a = valueAnimator;
            this.f46230b = d30Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            this.f46229a.removeAllListeners();
            xdl0.m208325C0(LiveSearchHistoryItemView.this, LiveSearchHistoryItemView.f46225d);
            d30 d30Var = this.f46230b;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public LiveSearchHistoryItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m70832b(View view) {
        pjt.m169934a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m70833c(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: d */
    public void m70834d(d30 d30Var) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getHeight(), 0);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ojt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f144372a.m70833c(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C12583a(valueAnimatorOfInt, d30Var));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: e */
    public void m70835e(njt njtVar, String str) {
        this.f46227b.setText(njtVar.f139331a);
        this.f46227b.setTextColor(fpn0.m122615e(str).mo113372f());
        this.f46228c.setImageResource(fpn0.m122615e(str).mo113374h());
        this.f46226a.setImageResource(fpn0.m122615e(str).mo113370d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70832b(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, f46225d);
        }
        layoutParams.height = f46225d;
        setLayoutParams(layoutParams);
    }
}
