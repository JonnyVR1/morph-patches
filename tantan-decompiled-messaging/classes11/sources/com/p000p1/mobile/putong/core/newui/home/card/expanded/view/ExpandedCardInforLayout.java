package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0032b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.t100;
import l.tlf;
import l.vwb;
import l.xdl0;
import p009l.rj4;
import p009l.wl2;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardInforLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f1336a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f1337b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1338c;

    /* JADX INFO: renamed from: d */
    public VImage f1339d;

    /* JADX INFO: renamed from: e */
    public User f1340e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f1341f;

    /* JADX INFO: renamed from: g */
    public C0032b f1342g;

    /* JADX INFO: renamed from: h */
    public int f1343h;

    /* JADX INFO: renamed from: i */
    public ArrayList<View> f1344i;

    /* JADX INFO: renamed from: j */
    public boolean f1345j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f1346k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$a */
    public class C0126a implements C0032b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1347a;

        public C0126a(View view) {
            this.f1347a = view;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0032b.a
        /* JADX INFO: renamed from: a */
        public void mo1422a(rj4 rj4Var) {
            ExpandedCardInforLayout.this.m2282q(rj4Var, this.f1347a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$b */
    public class C0127b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f1349a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f1350b;

        public C0127b(Runnable runnable, List list) {
            this.f1349a = runnable;
            this.f1350b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f1349a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f1350b) {
                if (view != null) {
                    view.setVisibility(0);
                    view.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f1349a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f1350b) {
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$c */
    public class C0128c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f1352a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f1353b;

        public C0128c(Runnable runnable, List list) {
            this.f1352a = runnable;
            this.f1353b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            Runnable runnable = this.f1352a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f1353b) {
                if (view != null) {
                    view.setVisibility(4);
                    view.setAlpha(0.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f1352a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1343h = 0;
        m2275j(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2266a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2267b() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2268c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m2269d(View view) {
        tlf.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m2270e(CardHeadLayoutV2 cardHeadLayoutV2) {
        FrameLayout frameLayout = get_bottom_userinfo_container();
        View shadowBottomAuxiliary = cardHeadLayoutV2.getShadowBottomAuxiliary();
        ArrayList<View> arrayList = new ArrayList<>();
        this.f1344i = arrayList;
        arrayList.add(frameLayout);
        this.f1344i.add(this.f1336a);
        if (shadowBottomAuxiliary != null) {
            this.f1344i.add(shadowBottomAuxiliary);
        }
        if (ExpandedCardStyleHelper.m2064o().m2077s()) {
            m2274i(this.f1344i, new Runnable() { // from class: l.qlf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m2267b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2271f() {
        boolean zV = IntlCountryCodeController.v();
        ConstraintLayout constraintLayout = this.f1337b;
        if (zV) {
            xdl0.U(constraintLayout, t100.d(68.0f));
        } else {
            xdl0.U(constraintLayout, t100.d(50.0f));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2272g(boolean z) {
        ArrayList<View> arrayList = this.f1344i;
        if (z) {
            m2274i(arrayList, new Runnable() { // from class: l.rlf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m2268c();
                }
            });
        } else {
            m2281p(arrayList, new Runnable() { // from class: l.slf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m2266a();
                }
            });
        }
        if (z) {
            return;
        }
        m2280o(this.f1343h, false);
    }

    public FrameLayout get_bottom_userinfo_container() {
        return this.f1338c;
    }

    /* JADX INFO: renamed from: h */
    public void m2273h(int i) {
        xdl0.U(this.f1337b, i);
    }

    /* JADX INFO: renamed from: i */
    public void m2274i(List<View> list, Runnable runnable) {
        if (vwb.J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            }
        }
        AnimatorSet animatorSet = this.f1346k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f1346k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f1346k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f1346k.setDuration(130L);
        this.f1346k.addListener(new C0127b(runnable, list));
        this.f1346k.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m2275j(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(f6c0.W2, (ViewGroup) this, true);
        m2269d(getChildAt(0));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2276k() {
        C0032b c0032b = this.f1342g;
        return c0032b != null && c0032b.m1416u() == CardBottomFrame.INTL_LIVE_CARD;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2277l() {
        C0032b c0032b = this.f1342g;
        return c0032b != null && c0032b.m1416u() == CardBottomFrame.INTL_VOICE_CARD;
    }

    /* JADX INFO: renamed from: m */
    public void m2278m(User user, CoreSuggested.UserInfo userInfo, int i, CardHeadLayoutV2 cardHeadLayoutV2, View view) {
        this.f1340e = user;
        this.f1341f = userInfo;
        if (this.f1342g == null) {
            this.f1342g = new C0032b(false, getContext(), this.f1338c, new C0126a(view));
        }
        this.f1342g.mo1407e(null, user, userInfo, i == 0, userInfo.coreMomentInfo);
        if (this.f1342g.m1418w() != null) {
            this.f1342g.m1418w().m1457n(this.f1345j);
        }
        m2271f();
        m2280o(this.f1343h, false);
        m2270e(cardHeadLayoutV2);
    }

    /* JADX INFO: renamed from: n */
    public void m2279n() {
        this.f1343h = 0;
        if (vwb.J(this.f1344i)) {
            return;
        }
        for (View view : this.f1344i) {
            if (view != null) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m2280o(int i, boolean z) {
        this.f1343h = i;
        C0032b c0032b = this.f1342g;
        if (c0032b != null) {
            c0032b.mo1403a(i, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f1342g)) {
            this.f1342g.mo1404b();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2281p(List<View> list, Runnable runnable) {
        if (vwb.J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                view.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
            }
        }
        AnimatorSet animatorSet = this.f1346k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f1346k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f1346k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f1346k.setDuration(130L);
        this.f1346k.addListener(new C0128c(runnable, list));
        this.f1346k.start();
    }

    /* JADX INFO: renamed from: q */
    public void m2282q(rj4 rj4Var, View view) {
        if (rj4Var == null || rj4Var.m21679b() == null) {
            xdl0.U(this.f1339d, 0);
            xdl0.U(view, 0);
            return;
        }
        if (m2277l()) {
            xdl0.U(this.f1339d, t100.R);
            xdl0.U(view, t100.d(138.0f));
        } else if (m2276k()) {
            xdl0.U(this.f1339d, t100.d(133.0f));
            xdl0.U(view, t100.d(138.0f));
        } else {
            wl2 wl2VarM21679b = rj4Var.m21679b();
            xdl0.U(this.f1339d, wl2VarM21679b.mo11841h());
            xdl0.U(view, wl2VarM21679b.mo11840g());
        }
    }

    public void setHideCertIconForCardBtn(boolean z) {
        this.f1345j = z;
    }

    public void setIndex(int i) {
        this.f1343h = i;
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandedCardInforLayout(@NonNull Context context) {
        this(context, null);
    }
}
