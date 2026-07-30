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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;
import p149l.aal;
import p149l.d30;
import p149l.e30;
import p149l.e900;
import p149l.jo0;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.roj0;
import p149l.upa;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideErrorNetView f23365a;

    /* JADX INFO: renamed from: b */
    public VImage f23366b;

    /* JADX INFO: renamed from: c */
    public VText f23367c;

    /* JADX INFO: renamed from: d */
    public VButton f23368d;

    /* JADX INFO: renamed from: e */
    public Runnable f23369e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$a */
    public class RunnableC8039a implements Runnable {
        public RunnableC8039a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeThemeSlideErrorNetView homeThemeSlideErrorNetView = HomeThemeSlideErrorNetView.this;
            homeThemeSlideErrorNetView.removeCallbacks(homeThemeSlideErrorNetView.f23369e);
            HomeThemeSlideErrorNetView.this.m38862k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$b */
    public class C8040b extends AnimatorListenerAdapter {
        public C8040b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideErrorNetView.this.f23365a.setAlpha(1.0f);
            ura.m195053e().m195057d().mo33686Fk();
        }
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context) {
        super(context);
        this.f23369e = new RunnableC8039a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38852a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m38858g(View view) {
    }

    /* JADX INFO: renamed from: j */
    public final void m38861j(View view) {
        aal.m95548a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m38862k() {
        if ((!NullChecker.m81303a(CoreModule.f17545c.f19666n0.f19543V.m221515e()) || CoreModule.f17545c.f19666n0.f19543V.m221515e().loaded.isEmpty()) && this.f23365a.getVisibility() != 0) {
            o6j0.m162864h("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
            this.f23365a.setVisibility(0);
            this.f23365a.setAlpha(0.0f);
            this.f23365a.animate().alpha(1.0f).setListener(new C8040b()).setDuration(400L).start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m38863l() {
        this.f23365a.setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public void m38864m(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.f17545c.f19666n0.m31454Y3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.t9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169037a.m38865n((roj0) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.f17545c.f19666n0.m31456a4(e900.m115330b().m115334f() ? e900.m115330b().m115331c() : upa.m194647I0().tabId)).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.u9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175340a.m38866o((PartialListOpt) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.v9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180659a.m38867p((PartialListOpt) obj);
            }
        }, new e30() { // from class: l.w9l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeThemeSlideErrorNetView.m38852a((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.x9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191630a.m38868q((NetworkInfo) obj);
            }
        }));
        xdl0.m208329E0(this.f23368d, new View.OnClickListener() { // from class: l.y9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196978a.m38869r(d30Var, view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19666n0.m31455Z3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.z9l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202301a.m38870s((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m38865n(roj0 roj0Var) {
        if (this.f23365a.getVisibility() == 0) {
            m38863l();
        }
        removeCallbacks(this.f23369e);
        postDelayed(this.f23369e, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m38866o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m38863l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38861j(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.s9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideErrorNetView.m38858g(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m38867p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f23369e);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m38868q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m81284g()) {
            m38862k();
        } else if (this.f23365a.getVisibility() == 0) {
            m38863l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m38869r(d30 d30Var, View view) {
        o6j0.m162859c("e_reload_suggest_users_button", "p_activity_momentcard_view", new o6j0.C18854a[0]);
        if (!Network.isConnected(getContext())) {
            lsi0.m151578h(R$string.f27716G0);
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m38870s(roj0 roj0Var) {
        m38862k();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23369e = new RunnableC8039a();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23369e = new RunnableC8039a();
    }
}
