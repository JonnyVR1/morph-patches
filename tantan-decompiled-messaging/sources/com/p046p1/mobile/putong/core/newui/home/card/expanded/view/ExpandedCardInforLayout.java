package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

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
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7868b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardHeadLayoutV2;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.f6c0;
import p149l.rj4;
import p149l.t100;
import p149l.tlf;
import p149l.vwb;
import p149l.wl2;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardInforLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f22558a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f22559b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22560c;

    /* JADX INFO: renamed from: d */
    public VImage f22561d;

    /* JADX INFO: renamed from: e */
    public User f22562e;

    /* JADX INFO: renamed from: f */
    public CoreSuggested.UserInfo f22563f;

    /* JADX INFO: renamed from: g */
    public C7868b f22564g;

    /* JADX INFO: renamed from: h */
    public int f22565h;

    /* JADX INFO: renamed from: i */
    public ArrayList<View> f22566i;

    /* JADX INFO: renamed from: j */
    public boolean f22567j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f22568k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$a */
    public class C7962a implements C7868b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f22569a;

        public C7962a(View view) {
            this.f22569a = view;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7868b.a
        /* JADX INFO: renamed from: a */
        public void mo37451a(rj4 rj4Var) {
            ExpandedCardInforLayout.this.m38304q(rj4Var, this.f22569a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$b */
    public class C7963b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f22571a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f22572b;

        public C7963b(Runnable runnable, List list) {
            this.f22571a = runnable;
            this.f22572b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Runnable runnable = this.f22571a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f22572b) {
                if (view != null) {
                    view.setVisibility(0);
                    view.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f22571a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f22572b) {
                if (view != null) {
                    view.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardInforLayout$c */
    public class C7964c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f22574a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f22575b;

        public C7964c(Runnable runnable, List list) {
            this.f22574a = runnable;
            this.f22575b = list;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            Runnable runnable = this.f22574a;
            if (runnable != null) {
                runnable.run();
            }
            for (View view : this.f22575b) {
                if (view != null) {
                    view.setVisibility(4);
                    view.setAlpha(0.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f22574a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22565h = 0;
        m38297j(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38288a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38289b() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m38290c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m38291d(View view) {
        tlf.m189618a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m38292e(CardHeadLayoutV2 cardHeadLayoutV2) {
        FrameLayout frameLayout = get_bottom_userinfo_container();
        View shadowBottomAuxiliary = cardHeadLayoutV2.getShadowBottomAuxiliary();
        ArrayList<View> arrayList = new ArrayList<>();
        this.f22566i = arrayList;
        arrayList.add(frameLayout);
        this.f22566i.add(this.f22558a);
        if (shadowBottomAuxiliary != null) {
            this.f22566i.add(shadowBottomAuxiliary);
        }
        if (ExpandedCardStyleHelper.m38090o().m38103s()) {
            m38296i(this.f22566i, new Runnable() { // from class: l.qlf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m38289b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38293f() {
        boolean zM28126v = IntlCountryCodeController.m28126v();
        ConstraintLayout constraintLayout = this.f22559b;
        if (zM28126v) {
            xdl0.m208357U(constraintLayout, t100.m186890d(68.0f));
        } else {
            xdl0.m208357U(constraintLayout, t100.m186890d(50.0f));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38294g(boolean z) {
        ArrayList<View> arrayList = this.f22566i;
        if (z) {
            m38296i(arrayList, new Runnable() { // from class: l.rlf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m38290c();
                }
            });
        } else {
            m38303p(arrayList, new Runnable() { // from class: l.slf
                @Override // java.lang.Runnable
                public final void run() {
                    ExpandedCardInforLayout.m38288a();
                }
            });
        }
        if (z) {
            return;
        }
        m38302o(this.f22565h, false);
    }

    public FrameLayout get_bottom_userinfo_container() {
        return this.f22560c;
    }

    /* JADX INFO: renamed from: h */
    public void m38295h(int i) {
        xdl0.m208357U(this.f22559b, i);
    }

    /* JADX INFO: renamed from: i */
    public void m38296i(List<View> list, Runnable runnable) {
        if (vwb.m200296J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            }
        }
        AnimatorSet animatorSet = this.f22568k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f22568k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22568k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f22568k.setDuration(130L);
        this.f22568k.addListener(new C7963b(runnable, list));
        this.f22568k.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m38297j(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(f6c0.f95621W2, (ViewGroup) this, true);
        m38291d(getChildAt(0));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m38298k() {
        C7868b c7868b = this.f22564g;
        return c7868b != null && c7868b.m37445u() == CardBottomFrame.INTL_LIVE_CARD;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m38299l() {
        C7868b c7868b = this.f22564g;
        return c7868b != null && c7868b.m37445u() == CardBottomFrame.INTL_VOICE_CARD;
    }

    /* JADX INFO: renamed from: m */
    public void m38300m(User user, CoreSuggested.UserInfo userInfo, int i, CardHeadLayoutV2 cardHeadLayoutV2, View view) {
        this.f22562e = user;
        this.f22563f = userInfo;
        if (this.f22564g == null) {
            this.f22564g = new C7868b(false, getContext(), this.f22560c, new C7962a(view));
        }
        this.f22564g.mo37436e(null, user, userInfo, i == 0, userInfo.coreMomentInfo);
        if (this.f22564g.m37447w() != null) {
            this.f22564g.m37447w().m37486n(this.f22567j);
        }
        m38293f();
        m38302o(this.f22565h, false);
        m38292e(cardHeadLayoutV2);
    }

    /* JADX INFO: renamed from: n */
    public void m38301n() {
        this.f22565h = 0;
        if (vwb.m200296J(this.f22566i)) {
            return;
        }
        for (View view : this.f22566i) {
            if (view != null) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m38302o(int i, boolean z) {
        this.f22565h = i;
        C7868b c7868b = this.f22564g;
        if (c7868b != null) {
            c7868b.mo37432a(i, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f22564g)) {
            this.f22564g.mo37433b();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m38303p(List<View> list, Runnable runnable) {
        if (vwb.m200296J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            if (view != null) {
                view.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
            }
        }
        AnimatorSet animatorSet = this.f22568k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f22568k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22568k = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f22568k.setDuration(130L);
        this.f22568k.addListener(new C7964c(runnable, list));
        this.f22568k.start();
    }

    /* JADX INFO: renamed from: q */
    public void m38304q(rj4 rj4Var, View view) {
        if (rj4Var == null || rj4Var.m179547b() == null) {
            xdl0.m208357U(this.f22561d, 0);
            xdl0.m208357U(view, 0);
            return;
        }
        if (m38299l()) {
            xdl0.m208357U(this.f22561d, t100.f167243R);
            xdl0.m208357U(view, t100.m186890d(138.0f));
        } else if (m38298k()) {
            xdl0.m208357U(this.f22561d, t100.m186890d(133.0f));
            xdl0.m208357U(view, t100.m186890d(138.0f));
        } else {
            wl2 wl2VarM179547b = rj4Var.m179547b();
            xdl0.m208357U(this.f22561d, wl2VarM179547b.mo100264h());
            xdl0.m208357U(view, wl2VarM179547b.mo100263g());
        }
    }

    public void setHideCertIconForCardBtn(boolean z) {
        this.f22567j = z;
    }

    public void setIndex(int i) {
        this.f22565h = i;
    }

    public ExpandedCardInforLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandedCardInforLayout(@NonNull Context context) {
        this(context, null);
    }
}
