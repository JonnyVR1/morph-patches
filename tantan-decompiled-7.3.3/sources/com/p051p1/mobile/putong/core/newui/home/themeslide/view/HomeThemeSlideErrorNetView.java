package com.p051p1.mobile.putong.core.newui.home.themeslide.view;

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
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fo0;
import p153l.gra;
import p153l.gta;
import p153l.ner;
import p153l.nh00;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcl;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideErrorNetView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideErrorNetView f24107a;

    /* JADX INFO: renamed from: b */
    public VImage f24108b;

    /* JADX INFO: renamed from: c */
    public VText f24109c;

    /* JADX INFO: renamed from: d */
    public VButton f24110d;

    /* JADX INFO: renamed from: e */
    public Runnable f24111e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$a */
    public class RunnableC8190a implements Runnable {
        public RunnableC8190a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeThemeSlideErrorNetView homeThemeSlideErrorNetView = HomeThemeSlideErrorNetView.this;
            homeThemeSlideErrorNetView.removeCallbacks(homeThemeSlideErrorNetView.f24111e);
            HomeThemeSlideErrorNetView.this.m39865k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView$b */
    public class C8191b extends AnimatorListenerAdapter {
        public C8191b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideErrorNetView.this.f24107a.setAlpha(1.0f);
            gta.m132210e().m132214d().mo34689Fk();
        }
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context) {
        super(context);
        this.f24111e = new RunnableC8190a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39855a(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m39861g(View view) {
    }

    /* JADX INFO: renamed from: j */
    public final void m39864j(View view) {
        qcl.m176124a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m39865k() {
        if ((!NullChecker.m82486a(CoreModule.f18264c.f20408n0.f20285V.m222761e()) || CoreModule.f18264c.f20408n0.f20285V.m222761e().loaded.isEmpty()) && this.f24107a.getVisibility() != 0) {
            sfj0.m185601h("e_reload_suggest_users_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
            this.f24107a.setVisibility(0);
            this.f24107a.setAlpha(0.0f);
            this.f24107a.animate().alpha(1.0f).setListener(new C8191b()).setDuration(400L).start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m39866l() {
        this.f24107a.setVisibility(8);
    }

    /* JADX INFO: renamed from: m */
    public void m39867m(ner nerVar, final x20 x20Var) {
        nerVar.duringCreated(CoreModule.f18264c.f20408n0.m32457Y3()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120076a.m39868n((uxj0) obj);
            }
        }));
        nerVar.duringCreated(CoreModule.f18264c.f20408n0.m32459a4(nh00.m163018b().m163022f() ? nh00.m163018b().m163019c() : gra.m131578I0().tabId)).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.kcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125073a.m39869o((PartialListOpt) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.lcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131366a.m39870p((PartialListOpt) obj);
            }
        }, new y20() { // from class: l.mcl
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeThemeSlideErrorNetView.m39855a((Throwable) obj);
            }
        }));
        nerVar.duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ncl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141375a.m39871q((NetworkInfo) obj);
            }
        }));
        bnl0.m105509E0(this.f24110d, new View.OnClickListener() { // from class: l.ocl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146717a.m39872r(x20Var, view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20408n0.m32458Z3()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.pcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151606a.m39873s((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m39868n(uxj0 uxj0Var) {
        if (this.f24107a.getVisibility() == 0) {
            m39866l();
        }
        removeCallbacks(this.f24111e);
        postDelayed(this.f24111e, 15000L);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m39869o(PartialListOpt partialListOpt) {
        if (partialListOpt.loaded.isEmpty()) {
            return;
        }
        m39866l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39864j(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.icl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideErrorNetView.m39861g(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m39870p(PartialListOpt partialListOpt) {
        removeCallbacks(this.f24111e);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m39871q(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m82467g()) {
            m39865k();
        } else if (this.f24107a.getVisibility() == 0) {
            m39866l();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m39872r(x20 x20Var, View view) {
        sfj0.m185596c("e_reload_suggest_users_button", "p_activity_momentcard_view", new sfj0.C20032a[0]);
        if (!Network.isConnected(getContext())) {
            o1j0.m165634h(R$string.f28564G0);
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m39873s(uxj0 uxj0Var) {
        m39865k();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24111e = new RunnableC8190a();
    }

    public HomeThemeSlideErrorNetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24111e = new RunnableC8190a();
    }
}
