package com.p046p1.mobile.putong.core.newui.home;

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
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.e3c0;
import p149l.jo0;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.roj0;
import p149l.u6l;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeErrorNetView f21649a;

    /* JADX INFO: renamed from: b */
    public VImage f21650b;

    /* JADX INFO: renamed from: c */
    public VText f21651c;

    /* JADX INFO: renamed from: d */
    public VButton f21652d;

    /* JADX INFO: renamed from: e */
    public e30<Boolean> f21653e;

    /* JADX INFO: renamed from: f */
    public Runnable f21654f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$a */
    public class RunnableC7857a implements Runnable {
        public RunnableC7857a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeErrorNetView homeErrorNetView = HomeErrorNetView.this;
            homeErrorNetView.removeCallbacks(homeErrorNetView.f21654f);
            HomeErrorNetView.this.m36678k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$b */
    public class C7858b extends AnimatorListenerAdapter {
        public C7858b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeErrorNetView.this.f21649a.setAlpha(1.0f);
            ura.m195053e().m195057d().mo33686Fk();
        }
    }

    public HomeErrorNetView(@NonNull Context context) {
        super(context);
        this.f21654f = new RunnableC7857a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m36671d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m36672e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m36677j(View view) {
        u6l.m191982a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m36678k() {
        if ((!NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e()) || CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.isEmpty()) && this.f21649a.getVisibility() != 0) {
            o6j0.m162864h("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
            this.f21649a.setVisibility(0);
            this.f21649a.setAlpha(0.0f);
            this.f21649a.animate().alpha(1.0f).setListener(new C7858b()).setDuration(400L).start();
            e30<Boolean> e30Var = this.f21653e;
            if (e30Var != null) {
                e30Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m36679l() {
        this.f21649a.setVisibility(8);
        e30<Boolean> e30Var = this.f21653e;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m36680m(mcr mcrVar, final d30 d30Var) {
        mcrVar.duringCreated(CoreModule.f17545c.f19663m0.m31046R8()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.n6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137426a.m36681n((roj0) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.f17545c.f19663m0.m31066W8()).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.o6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142367a.m36682o((PartialListOpt) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.p6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147420a.m36683p((PartialListOpt) obj);
            }
        }, new e30() { // from class: l.q6l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeErrorNetView.m36672e((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.r6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157948a.m36684q((NetworkInfo) obj);
            }
        }));
        xdl0.m208329E0(this.f21652d, new View.OnClickListener() { // from class: l.s6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162834a.m36685r(d30Var, view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19663m0.m31054T8()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.t6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168627a.m36686s((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m36681n(roj0 roj0Var) {
        if (this.f21649a.getVisibility() == 0) {
            m36679l();
        }
        removeCallbacks(this.f21654f);
        postDelayed(this.f21654f, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m36682o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m36679l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36677j(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f21652d.setBackgroundResource(e3c0.f89114i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.m6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeErrorNetView.m36671d(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m36683p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f21654f);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m36684q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m81284g()) {
            m36678k();
        } else if (this.f21649a.getVisibility() == 0) {
            m36679l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m36685r(d30 d30Var, View view) {
        o6j0.m162859c("e_reload_suggest_users_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        if (!Network.isConnected(getContext())) {
            lsi0.m151578h(R$string.f27716G0);
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m36686s(roj0 roj0Var) {
        m36678k();
    }

    public void setShowCallback(e30<Boolean> e30Var) {
        this.f21653e = e30Var;
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21654f = new RunnableC7857a();
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21654f = new RunnableC7857a();
    }
}
