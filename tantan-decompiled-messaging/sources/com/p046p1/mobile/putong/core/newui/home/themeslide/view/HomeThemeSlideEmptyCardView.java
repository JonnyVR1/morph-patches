package com.p046p1.mobile.putong.core.newui.home.themeslide.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.eli0;
import p149l.jo0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.r9l;
import p149l.roj0;
import p149l.upa;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideEmptyCardView f23357a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f23358b;

    /* JADX INFO: renamed from: c */
    public VText f23359c;

    /* JADX INFO: renamed from: d */
    public VButton f23360d;

    /* JADX INFO: renamed from: e */
    public VButton f23361e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$a */
    public class C8037a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f23362a;

        public C8037a(d30 d30Var) {
            this.f23362a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f23357a.setVisibility(8);
            if (NullChecker.m81303a(this.f23362a)) {
                this.f23362a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$b */
    public class C8038b extends AnimatorListenerAdapter {
        public C8038b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f23357a.setAlpha(1.0f);
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38830a(d30 d30Var, View view) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81304b(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
            o6j0.m162859c("e_edit_suggest_user_filter", "p_activity_momentcard_view", o6j0.C18854a.m162875e().m162880d("increase_distance_open").m162886o(userM169527p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38834e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m38835f(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m38837h(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m38841l(View view) {
        r9l.m178378a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m38842m() {
        this.f23357a.animate().cancel();
        this.f23358b.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m38843n() {
        m38844o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m38844o(d30 d30Var) {
        if (this.f23357a.getVisibility() == 8) {
            return;
        }
        this.f23357a.animate().alpha(0.0f).setDuration(400L).setListener(new C8037a(d30Var)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38841l(this);
    }

    /* JADX INFO: renamed from: p */
    public void m38845p(final d30 d30Var, final d30 d30Var2, mcr mcrVar) {
        boolean z = upa.m194647I0().enabled;
        VButton vButton = this.f23360d;
        if (z) {
            xdl0.m208344M(vButton, false);
            this.f23361e.setText("回到首页");
            xdl0.m208329E0(this.f23361e, new View.OnClickListener() { // from class: l.g9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m38835f(d30Var2, view);
                }
            });
        } else {
            xdl0.m208344M(vButton, true);
            xdl0.m208329E0(this.f23360d, new View.OnClickListener() { // from class: l.j9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116934a.m38846q(d30Var, view);
                }
            });
            xdl0.m208329E0(this.f23361e, new View.OnClickListener() { // from class: l.k9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m38830a(d30Var2, view);
                }
            });
        }
        mcrVar.duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.l9l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81304b(user) && NullChecker.m81303a(user.settings));
            }
        }).map(new w9j() { // from class: l.m9l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.n9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137812a.m38848s((Boolean) obj);
            }
        }, new e30() { // from class: l.o9l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeThemeSlideEmptyCardView.m38834e((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.f17545c.f19666n0.m31455Z3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.p9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147773a.m38849t((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.q9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153446a.m38850u((NetworkInfo) obj);
            }
        }));
        this.f23357a.setOnClickListener(new View.OnClickListener() { // from class: l.h9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideEmptyCardView.m38837h(view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19666n0.m31454Y3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.i9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112230a.m38847r((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m38846q(d30 d30Var, View view) {
        o6j0.m162859c("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        m38842m();
        m38844o(d30Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m38847r(roj0 roj0Var) {
        m38843n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m38848s(Boolean bool) {
        if (upa.m194647I0().enabled) {
            this.f23359c.setText("附近没有其他人了，回首页看看吧");
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f23359c;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R$string.f18221Vo));
        } else {
            vText.setText(getContext().getString(R$string.f18251Wo));
        }
        this.f23360d.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m38849t(roj0 roj0Var) {
        m38843n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m38850u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g() || this.f23357a.getVisibility() == 8) {
            return;
        }
        this.f23357a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m38851v() {
        if (this.f23357a.getVisibility() == 0) {
            return;
        }
        m38842m();
        this.f23357a.setVisibility(0);
        this.f23357a.setAlpha(0.0f);
        this.f23357a.animate().alpha(1.0f).setDuration(400L).setListener(new C8038b()).start();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81304b(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
            o6j0.m162864h("e_edit_suggest_user_filter", "p_suggest_users_home_view", o6j0.C18854a.m162875e().m162880d("increase_distance_open").m162886o(userM169527p9.settings.autoAdjustSuggestRadius().booleanValue()), eli0.m117122b());
        }
        if (this.f23360d.getVisibility() == 0) {
            o6j0.m162864h("e_increase_distance_button", "p_suggest_users_home_view", eli0.m117122b());
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
