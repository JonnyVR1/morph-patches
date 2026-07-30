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
import com.p000p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p000p1.mobile.putong.core.profile.R$string;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.aal;
import l.d30;
import l.e30;
import l.e900;
import l.jo0;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.upa;
import l.ura;
import l.xdl0;
import v.VButton;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeThemeSlideErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideErrorNetView f2143a;

    /* JADX INFO: renamed from: b */
    public VImage f2144b;

    /* JADX INFO: renamed from: c */
    public VText f2145c;

    /* JADX INFO: renamed from: d */
    public VButton f2146d;

    /* JADX INFO: renamed from: e */
    public Runnable f2147e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$a */
    public class RunnableC0203a implements Runnable {
        public RunnableC0203a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeThemeSlideErrorNetView homeThemeSlideErrorNetView = HomeThemeSlideErrorNetView.this;
            homeThemeSlideErrorNetView.removeCallbacks(homeThemeSlideErrorNetView.f2147e);
            HomeThemeSlideErrorNetView.this.m2865k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$b */
    public class C0204b extends AnimatorListenerAdapter {
        public C0204b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideErrorNetView.this.f2143a.setAlpha(1.0f);
            ura.e().d().Fk();
        }
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context) {
        super(context);
        this.f2147e = new RunnableC0203a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2855a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2861g(View view) {
    }

    /* JADX INFO: renamed from: j */
    public final void m2864j(View view) {
        aal.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m2865k() {
        if ((!NullChecker.a(CoreModule.c.n0.V.e()) || ((PartialListOpt) CoreModule.c.n0.V.e()).loaded.isEmpty()) && this.f2143a.getVisibility() != 0) {
            o6j0.h("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.a[0]);
            this.f2143a.setVisibility(0);
            this.f2143a.setAlpha(0.0f);
            this.f2143a.animate().alpha(1.0f).setListener(new C0204b()).setDuration(400L).start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2866l() {
        this.f2143a.setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public void m2867m(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.c.n0.Y3()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.t9l
            public final void call(Object obj) {
                this.f20583a.m2868n((roj0) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.c.n0.a4(e900.b().f() ? e900.b().c() : upa.I0().tabId)).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.u9l
            public final void call(Object obj) {
                this.f21023a.m2869o((PartialListOpt) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.v9l
            public final void call(Object obj) {
                this.f21489a.m2870p((PartialListOpt) obj);
            }
        }, new e30() { // from class: l.w9l
            public final void call(Object obj) {
                HomeThemeSlideErrorNetView.m2855a((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.x9l
            public final void call(Object obj) {
                this.f22484a.m2871q((NetworkInfo) obj);
            }
        }));
        xdl0.E0(this.f2146d, new View.OnClickListener() { // from class: l.y9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22943a.m2872r(d30Var, view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.n0.Z3()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.z9l
            public final void call(Object obj) {
                this.f23529a.m2873s((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2868n(roj0 roj0Var) {
        if (this.f2143a.getVisibility() == 0) {
            m2866l();
        }
        removeCallbacks(this.f2147e);
        postDelayed(this.f2147e, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2869o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m2866l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2864j(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.s9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideErrorNetView.m2861g(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m2870p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f2147e);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2871q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.g()) {
            m2865k();
        } else if (this.f2143a.getVisibility() == 0) {
            m2866l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2872r(d30 d30Var, View view) {
        o6j0.c("e_reload_suggest_users_button", "p_activity_momentcard_view", new o6j0.a[0]);
        if (!Network.isConnected(getContext())) {
            lsi0.h(R$string.f6494G0);
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m2873s(roj0 roj0Var) {
        m2865k();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2147e = new RunnableC0203a();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2147e = new RunnableC0203a();
    }
}
