package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.geh0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class SvipDlgSeeAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: m */
    public static long f36026m = 550;

    /* JADX INFO: renamed from: d */
    public SvipDlgSeeAnimLayout f36027d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f36028e;

    /* JADX INFO: renamed from: f */
    public VText f36029f;

    /* JADX INFO: renamed from: g */
    public VText f36030g;

    /* JADX INFO: renamed from: h */
    public VText f36031h;

    /* JADX INFO: renamed from: i */
    public VText f36032i;

    /* JADX INFO: renamed from: j */
    public boolean f36033j;

    /* JADX INFO: renamed from: k */
    public boolean f36034k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f36035l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.SvipDlgSeeAnimLayout$a */
    public class C8967a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36036a;

        public C8967a(View view) {
            this.f36036a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f36036a.setRotation(0.0f);
            this.f36036a.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105525M0(this.f36036a, true);
        }
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context) {
        super(context);
        this.f36033j = false;
        this.f36034k = false;
    }

    /* JADX INFO: renamed from: j0 */
    private ObjectAnimator m55502j0(View view, long j, boolean z) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(BLiveGiftItem.TYPE_ROTATION, z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
        objectAnimatorOfPropertyValuesHolder.addListener(new C8967a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: d */
    public void m55503d(User user) {
        uqb0.f180374G.m127120O(this.f36028e, user.m61308fp().profileMiddle().formatted(), 2, 100);
        this.f36030g.setText(String.format("%s %s", user.isFemale() ? getContext().getString(R$string.f28412p7) : getContext().getString(R$string.f28388n7), getContext().getString(R$string.f28364l7, user.age.intValue() > 30 ? "30+" : user.age)));
        this.f36031h.setText(getContext().getString(R$string.f28400o7, CoreModule.m30933P().m143405a().mo34403Rl(user.location.distance)));
        if (!NullChecker.m82486a(user.profile.work) || TextUtils.isEmpty(user.profile.work.industry)) {
            this.f36033j = false;
        } else {
            this.f36033j = true;
            this.f36032i.setText(user.profile.work.industry);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55504i0(View view) {
        geh0.m130012a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m55505k0(int[] iArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f36035l = animatorSet;
        boolean z = this.f36033j;
        VText vText = this.f36029f;
        if (z) {
            animatorSet.playTogether(m55502j0(vText, 0L, true), m55502j0(this.f36031h, f36026m, false), m55502j0(this.f36030g, f36026m * 2, true), m55502j0(this.f36032i, f36026m * 3, false));
        } else {
            animatorSet.playTogether(m55502j0(vText, 0L, true), m55502j0(this.f36031h, f36026m, false), m55502j0(this.f36030g, f36026m * 2, true));
        }
        this.f36035l.start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m55506l0() {
        if (this.f36034k) {
            return;
        }
        this.f36034k = true;
        bnl0.m105533Q0(this, new y20() { // from class: l.feh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98676a.m55505k0((int[]) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f36035l) && this.f36035l.isRunning()) {
            this.f36035l.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55504i0(this);
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36033j = false;
        this.f36034k = false;
    }

    public SvipDlgSeeAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36033j = false;
        this.f36034k = false;
    }
}
