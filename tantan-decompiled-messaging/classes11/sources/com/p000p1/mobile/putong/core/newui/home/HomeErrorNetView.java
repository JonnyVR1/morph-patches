package com.p000p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p000p1.mobile.putong.core.profile.R$string;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.u6l;
import l.ura;
import l.xdl0;
import p009l.e3c0;
import v.VButton;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeErrorNetView f427a;

    /* JADX INFO: renamed from: b */
    public VImage f428b;

    /* JADX INFO: renamed from: c */
    public VText f429c;

    /* JADX INFO: renamed from: d */
    public VButton f430d;

    /* JADX INFO: renamed from: e */
    public e30<Boolean> f431e;

    /* JADX INFO: renamed from: f */
    public Runnable f432f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$a */
    public class RunnableC0021a implements Runnable {
        public RunnableC0021a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeErrorNetView homeErrorNetView = HomeErrorNetView.this;
            homeErrorNetView.removeCallbacks(homeErrorNetView.f432f);
            HomeErrorNetView.this.m627k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$b */
    public class C0022b extends AnimatorListenerAdapter {
        public C0022b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeErrorNetView.this.f427a.setAlpha(1.0f);
            ura.e().d().Fk();
        }
    }

    public HomeErrorNetView(@NonNull Context context) {
        super(context);
        this.f432f = new RunnableC0021a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m620d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m621e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m626j(View view) {
        u6l.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m627k() {
        if ((!NullChecker.a(CoreModule.c.m0.a0.e()) || ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.isEmpty()) && this.f427a.getVisibility() != 0) {
            o6j0.h("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.a[0]);
            this.f427a.setVisibility(0);
            this.f427a.setAlpha(0.0f);
            this.f427a.animate().alpha(1.0f).setListener(new C0022b()).setDuration(400L).start();
            e30<Boolean> e30Var = this.f431e;
            if (e30Var != null) {
                e30Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m628l() {
        this.f427a.setVisibility(8);
        e30<Boolean> e30Var = this.f431e;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m629m(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.c.m0.R8()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.n6l
            public final void call(Object obj) {
                this.f17344a.m630n((roj0) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.c.m0.W8()).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.o6l
            public final void call(Object obj) {
                this.f17856a.m631o((PartialListOpt) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.p6l
            public final void call(Object obj) {
                this.f18409a.m632p((PartialListOpt) obj);
            }
        }, new e30() { // from class: l.q6l
            public final void call(Object obj) {
                HomeErrorNetView.m621e((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.r6l
            public final void call(Object obj) {
                this.f19653a.m633q((NetworkInfo) obj);
            }
        }));
        xdl0.E0(this.f430d, new View.OnClickListener() { // from class: l.s6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20119a.m634r(d30Var, view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.m0.T8()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.t6l
            public final void call(Object obj) {
                this.f20571a.m635s((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m630n(roj0 roj0Var) {
        if (this.f427a.getVisibility() == 0) {
            m628l();
        }
        removeCallbacks(this.f432f);
        postDelayed(this.f432f, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m631o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m628l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m626j(this);
        if (ura.e().d().I4()) {
            this.f430d.setBackgroundResource(e3c0.f12301i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.m6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeErrorNetView.m620d(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m632p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f432f);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m633q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.g()) {
            m627k();
        } else if (this.f427a.getVisibility() == 0) {
            m628l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m634r(d30 d30Var, View view) {
        o6j0.c("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.a[0]);
        if (!Network.isConnected(getContext())) {
            lsi0.h(R$string.f6494G0);
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m635s(roj0 roj0Var) {
        m627k();
    }

    public void setShowCallback(e30<Boolean> e30Var) {
        this.f431e = e30Var;
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f432f = new RunnableC0021a();
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f432f = new RunnableC0021a();
    }
}
