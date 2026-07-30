package com.p051p1.mobile.putong.live.external.square.search.history;

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
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.jyn0;
import p153l.olt;
import p153l.qa00;
import p153l.qlt;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSearchHistoryItemView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final int f47073d = qa00.f156338y;

    /* JADX INFO: renamed from: a */
    public VImage f47074a;

    /* JADX INFO: renamed from: b */
    public VText f47075b;

    /* JADX INFO: renamed from: c */
    public VImage f47076c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView$a */
    public class C12746a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ValueAnimator f47077a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f47078b;

        public C12746a(ValueAnimator valueAnimator, x20 x20Var) {
            this.f47077a = valueAnimator;
            this.f47078b = x20Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            this.f47077a.removeAllListeners();
            bnl0.m105505C0(LiveSearchHistoryItemView.this, LiveSearchHistoryItemView.f47073d);
            x20 x20Var = this.f47078b;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    public LiveSearchHistoryItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m72015b(View view) {
        qlt.m177013a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m72016c(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: d */
    public void m72017d(x20 x20Var) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getHeight(), 0);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.plt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f153091a.m72016c(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new C12746a(valueAnimatorOfInt, x20Var));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: e */
    public void m72018e(olt oltVar, String str) {
        this.f47075b.setText(oltVar.f147872a);
        this.f47075b.setTextColor(jyn0.m147608e(str).mo192550f());
        this.f47076c.setImageResource(jyn0.m147608e(str).mo192552h());
        this.f47074a.setImageResource(jyn0.m147608e(str).mo192548d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72015b(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, f47073d);
        }
        layoutParams.height = f47073d;
        setLayoutParams(layoutParams);
    }
}
