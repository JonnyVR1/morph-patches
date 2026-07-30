package com.p051p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fo0;
import p153l.gta;
import p153l.k9l;
import p153l.kbc0;
import p153l.ner;
import p153l.o1j0;
import p153l.psd0;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeErrorNetView f22391a;

    /* JADX INFO: renamed from: b */
    public VImage f22392b;

    /* JADX INFO: renamed from: c */
    public VText f22393c;

    /* JADX INFO: renamed from: d */
    public VButton f22394d;

    /* JADX INFO: renamed from: e */
    public y20<Boolean> f22395e;

    /* JADX INFO: renamed from: f */
    public Runnable f22396f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$a */
    public class RunnableC8008a implements Runnable {
        public RunnableC8008a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeErrorNetView homeErrorNetView = HomeErrorNetView.this;
            homeErrorNetView.removeCallbacks(homeErrorNetView.f22396f);
            HomeErrorNetView.this.m37681k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeErrorNetView$b */
    public class C8009b extends AnimatorListenerAdapter {
        public C8009b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeErrorNetView.this.f22391a.setAlpha(1.0f);
            gta.m132210e().m132214d().mo34689Fk();
        }
    }

    public HomeErrorNetView(@NonNull Context context) {
        super(context);
        this.f22396f = new RunnableC8008a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m37674d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37675e(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m37680j(View view) {
        k9l.m148869a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m37681k() {
        if ((!NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e()) || CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.isEmpty()) && this.f22391a.getVisibility() != 0) {
            sfj0.m185601h("e_reload_suggest_users_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
            this.f22391a.setVisibility(0);
            this.f22391a.setAlpha(0.0f);
            this.f22391a.animate().alpha(1.0f).setListener(new C8009b()).setDuration(400L).start();
            y20<Boolean> y20Var = this.f22395e;
            if (y20Var != null) {
                y20Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m37682l() {
        this.f22391a.setVisibility(8);
        y20<Boolean> y20Var = this.f22395e;
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m37683m(ner nerVar, final x20 x20Var) {
        nerVar.duringCreated(CoreModule.f18264c.f20405m0.m32049R8()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.d9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85792a.m37684n((uxj0) obj);
            }
        }));
        nerVar.duringCreated(CoreModule.f18264c.f20405m0.m32069W8()).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.e9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92651a.m37685o((PartialListOpt) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.f9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97898a.m37686p((PartialListOpt) obj);
            }
        }, new y20() { // from class: l.g9l
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeErrorNetView.m37675e((Throwable) obj);
            }
        }));
        nerVar.duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.h9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108415a.m37687q((NetworkInfo) obj);
            }
        }));
        bnl0.m105509E0(this.f22394d, new View.OnClickListener() { // from class: l.i9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113483a.m37688r(x20Var, view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20405m0.m32057T8()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.j9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118888a.m37689s((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m37684n(uxj0 uxj0Var) {
        if (this.f22391a.getVisibility() == 0) {
            m37682l();
        }
        removeCallbacks(this.f22396f);
        postDelayed(this.f22396f, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m37685o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m37682l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37680j(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f22394d.setBackgroundResource(kbc0.f124877i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.c9l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeErrorNetView.m37674d(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m37686p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f22396f);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m37687q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m82467g()) {
            m37681k();
        } else if (this.f22391a.getVisibility() == 0) {
            m37682l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m37688r(x20 x20Var, View view) {
        sfj0.m185596c("e_reload_suggest_users_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        if (!Network.isConnected(getContext())) {
            o1j0.m165634h(R$string.f28564G0);
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m37689s(uxj0 uxj0Var) {
        m37681k();
    }

    public void setShowCallback(y20<Boolean> y20Var) {
        this.f22395e = y20Var;
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22396f = new RunnableC8008a();
    }

    public HomeErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22396f = new RunnableC8008a();
    }
}
