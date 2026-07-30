package com.p000p1.mobile.putong.core.newui.home.themeslide.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jo0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.r9l;
import l.roj0;
import l.upa;
import l.w9j;
import l.xdl0;
import p009l.eli0;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeThemeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideEmptyCardView f2135a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f2136b;

    /* JADX INFO: renamed from: c */
    public VText f2137c;

    /* JADX INFO: renamed from: d */
    public VButton f2138d;

    /* JADX INFO: renamed from: e */
    public VButton f2139e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$a */
    public class C0201a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f2140a;

        public C0201a(d30 d30Var) {
            this.f2140a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f2135a.setVisibility(8);
            if (NullChecker.a(this.f2140a)) {
                this.f2140a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$b */
    public class C0202b extends AnimatorListenerAdapter {
        public C0202b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f2135a.setAlpha(1.0f);
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2833a(d30 d30Var, View view) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.b(userP9) && NullChecker.a(userP9.settings)) {
            o6j0.c("e_edit_suggest_user_filter", "p_activity_momentcard_view", new o6j0.a[]{o6j0.a.e().d("increase_distance_open").o(userP9.settings.autoAdjustSuggestRadius().booleanValue())});
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2837e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2838f(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2840h(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m2844l(View view) {
        r9l.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m2845m() {
        this.f2135a.animate().cancel();
        this.f2136b.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m2846n() {
        m2847o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m2847o(d30 d30Var) {
        if (this.f2135a.getVisibility() == 8) {
            return;
        }
        this.f2135a.animate().alpha(0.0f).setDuration(400L).setListener(new C0201a(d30Var)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2844l(this);
    }

    /* JADX INFO: renamed from: p */
    public void m2848p(final d30 d30Var, final d30 d30Var2, mcr mcrVar) {
        boolean z = upa.I0().enabled;
        VButton vButton = this.f2138d;
        if (z) {
            xdl0.M(vButton, false);
            this.f2139e.setText("回到首页");
            xdl0.E0(this.f2139e, new View.OnClickListener() { // from class: l.g9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m2838f(d30Var2, view);
                }
            });
        } else {
            xdl0.M(vButton, true);
            xdl0.E0(this.f2138d, new View.OnClickListener() { // from class: l.j9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15019a.m2849q(d30Var, view);
                }
            });
            xdl0.E0(this.f2139e, new View.OnClickListener() { // from class: l.k9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m2833a(d30Var2, view);
                }
            });
        }
        mcrVar.duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.l9l
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.b(user) && NullChecker.a(user.settings));
            }
        }).map(new w9j() { // from class: l.m9l
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.n9l
            public final void call(Object obj) {
                this.f17364a.m2851s((Boolean) obj);
            }
        }, new e30() { // from class: l.o9l
            public final void call(Object obj) {
                HomeThemeSlideEmptyCardView.m2837e((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.c.n0.Z3()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.p9l
            public final void call(Object obj) {
                this.f18435a.m2852t((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.q9l
            public final void call(Object obj) {
                this.f19108a.m2853u((NetworkInfo) obj);
            }
        }));
        this.f2135a.setOnClickListener(new View.OnClickListener() { // from class: l.h9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideEmptyCardView.m2840h(view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.n0.Y3()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.i9l
            public final void call(Object obj) {
                this.f14448a.m2850r((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2849q(d30 d30Var, View view) {
        o6j0.c("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.a[0]);
        m2845m();
        m2847o(d30Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2850r(roj0 roj0Var) {
        m2846n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m2851s(Boolean bool) {
        if (upa.I0().enabled) {
            this.f2137c.setText("附近没有其他人了，回首页看看吧");
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f2137c;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R.string.Vo));
        } else {
            vText.setText(getContext().getString(R.string.Wo));
        }
        this.f2138d.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m2852t(roj0 roj0Var) {
        m2846n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2853u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g() || this.f2135a.getVisibility() == 8) {
            return;
        }
        this.f2135a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m2854v() {
        if (this.f2135a.getVisibility() == 0) {
            return;
        }
        m2845m();
        this.f2135a.setVisibility(0);
        this.f2135a.setAlpha(0.0f);
        this.f2135a.animate().alpha(1.0f).setDuration(400L).setListener(new C0202b()).start();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.b(userP9) && NullChecker.a(userP9.settings)) {
            o6j0.h("e_edit_suggest_user_filter", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.e().d("increase_distance_open").o(userP9.settings.autoAdjustSuggestRadius().booleanValue()), eli0.m13975b()});
        }
        if (this.f2138d.getVisibility() == 0) {
            o6j0.h("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.a[]{eli0.m13975b()});
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
