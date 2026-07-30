package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8019b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.em2;
import p153l.jyb;
import p153l.kec0;
import p153l.qa00;
import p153l.qk4;
import p153l.zmf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardInforLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f23300a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f23301b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f23302c;

    /* JADX INFO: renamed from: d */
    public VImage f23303d;

    /* JADX INFO: renamed from: e */
    public User f23304e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f23305f;

    /* JADX INFO: renamed from: g */
    public C8019b f23306g;

    /* JADX INFO: renamed from: h */
    public int f23307h;

    /* JADX INFO: renamed from: i */
    public ArrayList<View> f23308i;

    /* JADX INFO: renamed from: j */
    public boolean f23309j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f23310k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$a */
    public class C8113a implements C8019b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f23311a;

        public C8113a(View view) {
            this.f23311a = view;
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8019b.a
        /* JADX INFO: renamed from: a */
        public void mo38454a(qk4 qk4Var) {
            ExpandedCardInforLayout.this.m39307q(qk4Var, this.f23311a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$b */
    public class C8114b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f23313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f23314b;

        public C8114b(Runnable runnable, List list) {
            this.f23313a = runnable;
            this.f23314b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f23313a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f23314b) {
                if (view != null) {
                    view.setVisibility(0);
                    view.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f23313a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f23314b) {
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$c */
    public class C8115c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f23316a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f23317b;

        public C8115c(Runnable runnable, List list) {
            this.f23316a = runnable;
            this.f23317b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            Runnable runnable = this.f23316a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f23317b) {
                if (view != null) {
                    view.setVisibility(4);
                    view.setAlpha(0.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f23316a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23307h = 0;
        m39300j(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39291a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39292b() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m39293c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m39294d(View view) {
        zmf.m220381a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m39295e(CardHeadLayoutV2 cardHeadLayoutV2) {
        FrameLayout frameLayout = get_bottom_userinfo_container();
        View shadowBottomAuxiliary = cardHeadLayoutV2.getShadowBottomAuxiliary();
        ArrayList<View> arrayList = new ArrayList<>();
        this.f23308i = arrayList;
        arrayList.add(frameLayout);
        this.f23308i.add(this.f23300a);
        if (shadowBottomAuxiliary != null) {
            this.f23308i.add(shadowBottomAuxiliary);
        }
        if (ExpandedCardStyleHelper.m39093o().m39106s()) {
            m39299i(this.f23308i, new Runnable() { // from class: l.wmf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m39292b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m39296f() {
        boolean zM29125v = IntlCountryCodeController.m29125v();
        ConstraintLayout constraintLayout = this.f23301b;
        if (zM29125v) {
            bnl0.m105537U(constraintLayout, qa00.m175859d(68.0f));
        } else {
            bnl0.m105537U(constraintLayout, qa00.m175859d(50.0f));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39297g(boolean z) {
        ArrayList<View> arrayList = this.f23308i;
        if (z) {
            m39299i(arrayList, new Runnable() { // from class: l.xmf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m39293c();
                }
            });
        } else {
            m39306p(arrayList, new Runnable() { // from class: l.ymf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m39291a();
                }
            });
        }
        if (z) {
            return;
        }
        m39305o(this.f23307h, false);
    }

    public FrameLayout get_bottom_userinfo_container() {
        return this.f23302c;
    }

    /* JADX INFO: renamed from: h */
    public void m39298h(int i) {
        bnl0.m105537U(this.f23301b, i);
    }

    /* JADX INFO: renamed from: i */
    public void m39299i(List<View> list, Runnable runnable) {
        if (jyb.m147479J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            }
        }
        AnimatorSet animatorSet = this.f23310k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f23310k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23310k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f23310k.setDuration(130L);
        this.f23310k.addListener(new C8114b(runnable, list));
        this.f23310k.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m39300j(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(kec0.f125675W2, (ViewGroup) this, true);
        m39294d(getChildAt(0));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m39301k() {
        C8019b c8019b = this.f23306g;
        return c8019b != null && c8019b.m38448u() == CardBottomFrame.INTL_LIVE_CARD;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m39302l() {
        C8019b c8019b = this.f23306g;
        return c8019b != null && c8019b.m38448u() == CardBottomFrame.INTL_VOICE_CARD;
    }

    /* JADX INFO: renamed from: m */
    public void m39303m(User user, CoreSuggested.UserInfo userInfo, int i, CardHeadLayoutV2 cardHeadLayoutV2, View view) {
        this.f23304e = user;
        this.f23305f = userInfo;
        if (this.f23306g == null) {
            this.f23306g = new C8019b(false, getContext(), this.f23302c, new C8113a(view));
        }
        this.f23306g.mo38439e(null, user, userInfo, i == 0, userInfo.coreMomentInfo);
        if (this.f23306g.m38450w() != null) {
            this.f23306g.m38450w().m38489n(this.f23309j);
        }
        m39296f();
        m39305o(this.f23307h, false);
        m39295e(cardHeadLayoutV2);
    }

    /* JADX INFO: renamed from: n */
    public void m39304n() {
        this.f23307h = 0;
        if (jyb.m147479J(this.f23308i)) {
            return;
        }
        for (View view : this.f23308i) {
            if (view != null) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m39305o(int i, boolean z) {
        this.f23307h = i;
        C8019b c8019b = this.f23306g;
        if (c8019b != null) {
            c8019b.mo38435a(i, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f23306g)) {
            this.f23306g.mo38436b();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m39306p(List<View> list, Runnable runnable) {
        if (jyb.m147479J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                view.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
            }
        }
        AnimatorSet animatorSet = this.f23310k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f23310k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23310k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f23310k.setDuration(130L);
        this.f23310k.addListener(new C8115c(runnable, list));
        this.f23310k.start();
    }

    /* JADX INFO: renamed from: q */
    public void m39307q(qk4 qk4Var, View view) {
        if (qk4Var == null || qk4Var.m176920b() == null) {
            bnl0.m105537U(this.f23303d, 0);
            bnl0.m105537U(view, 0);
            return;
        }
        if (m39302l()) {
            bnl0.m105537U(this.f23303d, qa00.f156305R);
            bnl0.m105537U(view, qa00.m175859d(138.0f));
        } else if (m39301k()) {
            bnl0.m105537U(this.f23303d, qa00.m175859d(133.0f));
            bnl0.m105537U(view, qa00.m175859d(138.0f));
        } else {
            em2 em2VarM176920b = qk4Var.m176920b();
            bnl0.m105537U(this.f23303d, em2VarM176920b.mo121320h());
            bnl0.m105537U(view, em2VarM176920b.mo121319g());
        }
    }

    public void setHideCertIconForCardBtn(boolean z) {
        this.f23309j = z;
    }

    public void setIndex(int i) {
        this.f23307h = i;
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandedCardInforLayout(@NonNull Context context) {
        this(context, null);
    }
}
