package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.qib0;
import p149l.xdl0;
import p149l.y5h0;

/* JADX INFO: loaded from: classes9.dex */
public class SvipDlgSeeAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: m */
    public static long f35178m = 550;

    /* JADX INFO: renamed from: d */
    public SvipDlgSeeAnimLayout f35179d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f35180e;

    /* JADX INFO: renamed from: f */
    public VText f35181f;

    /* JADX INFO: renamed from: g */
    public VText f35182g;

    /* JADX INFO: renamed from: h */
    public VText f35183h;

    /* JADX INFO: renamed from: i */
    public VText f35184i;

    /* JADX INFO: renamed from: j */
    public boolean f35185j;

    /* JADX INFO: renamed from: k */
    public boolean f35186k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f35187l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.SvipDlgSeeAnimLayout$a */
    public class C8804a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f35188a;

        public C8804a(View view) {
            this.f35188a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f35188a.setRotation(0.0f);
            this.f35188a.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208345M0(this.f35188a, true);
        }
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context) {
        super(context);
        this.f35185j = false;
        this.f35186k = false;
    }

    /* JADX INFO: renamed from: j0 */
    private ObjectAnimator m54319j0(View view, long j, boolean z) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(BLiveGiftItem.TYPE_ROTATION, z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
        objectAnimatorOfPropertyValuesHolder.addListener(new C8804a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: d */
    public void m54320d(User user) {
        qib0.f154691G.m102336O(this.f35180e, user.m60124fp().profileMiddle().formatted(), 2, 100);
        this.f35182g.setText(String.format("%s %s", user.isFemale() ? getContext().getString(R$string.f27564p7) : getContext().getString(R$string.f27540n7), getContext().getString(R$string.f27516l7, user.age.intValue() > 30 ? "30+" : user.age)));
        this.f35183h.setText(getContext().getString(R$string.f27552o7, CoreModule.m29935P().m94651a().mo33400Rl(user.location.distance)));
        if (!NullChecker.m81303a(user.profile.work) || TextUtils.isEmpty(user.profile.work.industry)) {
            this.f35185j = false;
        } else {
            this.f35185j = true;
            this.f35184i.setText(user.profile.work.industry);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m54321i0(View view) {
        y5h0.m212999a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m54322k0(int[] iArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35187l = animatorSet;
        boolean z = this.f35185j;
        VText vText = this.f35181f;
        if (z) {
            animatorSet.playTogether(m54319j0(vText, 0L, true), m54319j0(this.f35183h, f35178m, false), m54319j0(this.f35182g, f35178m * 2, true), m54319j0(this.f35184i, f35178m * 3, false));
        } else {
            animatorSet.playTogether(m54319j0(vText, 0L, true), m54319j0(this.f35183h, f35178m, false), m54319j0(this.f35182g, f35178m * 2, true));
        }
        this.f35187l.start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m54323l0() {
        if (this.f35186k) {
            return;
        }
        this.f35186k = true;
        xdl0.m208353Q0(this, new e30() { // from class: l.x5h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191146a.m54322k0((int[]) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f35187l) && this.f35187l.isRunning()) {
            this.f35187l.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54321i0(this);
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35185j = false;
        this.f35186k = false;
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35185j = false;
        this.f35186k = false;
    }
}
