package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.xdl0;
import l.y5h0;
import p006l.qib0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SvipDlgSeeAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: m */
    public static long f4959m = 550;

    /* JADX INFO: renamed from: d */
    public SvipDlgSeeAnimLayout f4960d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4961e;

    /* JADX INFO: renamed from: f */
    public VText f4962f;

    /* JADX INFO: renamed from: g */
    public VText f4963g;

    /* JADX INFO: renamed from: h */
    public VText f4964h;

    /* JADX INFO: renamed from: i */
    public VText f4965i;

    /* JADX INFO: renamed from: j */
    public boolean f4966j;

    /* JADX INFO: renamed from: k */
    public boolean f4967k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f4968l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.SvipDlgSeeAnimLayout$a */
    public class C0240a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4969a;

        public C0240a(View view) {
            this.f4969a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f4969a.setRotation(0.0f);
            this.f4969a.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M0(this.f4969a, true);
        }
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context) {
        super(context);
        this.f4966j = false;
        this.f4967k = false;
    }

    /* JADX INFO: renamed from: j0 */
    private ObjectAnimator m7654j0(View view, long j, boolean z) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("rotation", z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
        objectAnimatorOfPropertyValuesHolder.addListener(new C0240a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m7655d(User user) {
        qib0.f19782G.m12749O(this.f4961e, user.fp().profileMiddle().formatted(), 2, 100);
        this.f4963g.setText(String.format("%s %s", user.isFemale() ? getContext().getString(R.string.p7) : getContext().getString(R.string.n7), getContext().getString(R.string.l7, user.age.intValue() > 30 ? "30+" : user.age)));
        this.f4964h.setText(getContext().getString(R.string.o7, CoreModule.m1854P().m11706a().m5337Rl(user.location.distance)));
        if (!NullChecker.a(user.profile.work) || TextUtils.isEmpty(user.profile.work.industry)) {
            this.f4966j = false;
        } else {
            this.f4966j = true;
            this.f4965i.setText(user.profile.work.industry);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7656i0(View view) {
        y5h0.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m7657k0(int[] iArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4968l = animatorSet;
        boolean z = this.f4966j;
        VText vText = this.f4962f;
        if (z) {
            animatorSet.playTogether(m7654j0(vText, 0L, true), m7654j0(this.f4964h, f4959m, false), m7654j0(this.f4963g, f4959m * 2, true), m7654j0(this.f4965i, f4959m * 3, false));
        } else {
            animatorSet.playTogether(m7654j0(vText, 0L, true), m7654j0(this.f4964h, f4959m, false), m7654j0(this.f4963g, f4959m * 2, true));
        }
        this.f4968l.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m7658l0() {
        if (this.f4967k) {
            return;
        }
        this.f4967k = true;
        xdl0.Q0(this, new e30() { // from class: l.x5h0
            public final void call(Object obj) {
                this.f27363a.m7657k0((int[]) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (NullChecker.a(this.f4968l) && this.f4968l.isRunning()) {
            this.f4968l.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7656i0(this);
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4966j = false;
        this.f4967k = false;
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4966j = false;
        this.f4967k = false;
    }
}
