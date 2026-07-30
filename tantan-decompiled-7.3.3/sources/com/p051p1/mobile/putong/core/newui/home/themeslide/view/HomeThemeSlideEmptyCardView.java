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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.eui0;
import p153l.fo0;
import p153l.gra;
import p153l.hcl;
import p153l.ner;
import p153l.psd0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeThemeSlideEmptyCardView f24099a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24100b;

    /* JADX INFO: renamed from: c */
    public VText f24101c;

    /* JADX INFO: renamed from: d */
    public VButton f24102d;

    /* JADX INFO: renamed from: e */
    public VButton f24103e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$a */
    public class C8188a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f24104a;

        public C8188a(x20 x20Var) {
            this.f24104a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f24099a.setVisibility(8);
            if (NullChecker.m82486a(this.f24104a)) {
                this.f24104a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView$b */
    public class C8189b extends AnimatorListenerAdapter {
        public C8189b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeThemeSlideEmptyCardView.this.f24099a.setAlpha(1.0f);
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39833a(x20 x20Var, View view) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82487b(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
            sfj0.m185596c("e_edit_suggest_user_filter", "p_activity_momentcard_view", sfj0.C20032a.m185612e().m185617d("increase_distance_open").m185623o(userM116600p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39837e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m39838f(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m39840h(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m39844l(View view) {
        hcl.m134455a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m39845m() {
        this.f24099a.animate().cancel();
        this.f24100b.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m39846n() {
        m39847o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m39847o(x20 x20Var) {
        if (this.f24099a.getVisibility() == 8) {
            return;
        }
        this.f24099a.animate().alpha(0.0f).setDuration(400L).setListener(new C8188a(x20Var)).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39844l(this);
    }

    /* JADX INFO: renamed from: p */
    public void m39848p(final x20 x20Var, final x20 x20Var2, ner nerVar) {
        boolean z = gra.m131578I0().enabled;
        VButton vButton = this.f24102d;
        if (z) {
            bnl0.m105524M(vButton, false);
            this.f24103e.setText("回到首页");
            bnl0.m105509E0(this.f24103e, new View.OnClickListener() { // from class: l.wbl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m39838f(x20Var2, view);
                }
            });
        } else {
            bnl0.m105524M(vButton, true);
            bnl0.m105509E0(this.f24102d, new View.OnClickListener() { // from class: l.zbl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203681a.m39849q(x20Var, view);
                }
            });
            bnl0.m105509E0(this.f24103e, new View.OnClickListener() { // from class: l.acl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeThemeSlideEmptyCardView.m39833a(x20Var2, view);
                }
            });
        }
        nerVar.duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.bcl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82487b(user) && NullChecker.m82486a(user.settings));
            }
        }).map(new qcj() { // from class: l.ccl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.dcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87790a.m39851s((Boolean) obj);
            }
        }, new y20() { // from class: l.ecl
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeThemeSlideEmptyCardView.m39837e((Throwable) obj);
            }
        }));
        nerVar.duringCreated(CoreModule.f18264c.f20408n0.m32458Z3()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.fcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98224a.m39852t((uxj0) obj);
            }
        }));
        nerVar.duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gcl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103588a.m39853u((NetworkInfo) obj);
            }
        }));
        this.f24099a.setOnClickListener(new View.OnClickListener() { // from class: l.xbl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeThemeSlideEmptyCardView.m39840h(view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20408n0.m32457Y3()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ybl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198344a.m39850r((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m39849q(x20 x20Var, View view) {
        sfj0.m185596c("e_increase_distance_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        m39845m();
        m39847o(x20Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m39850r(uxj0 uxj0Var) {
        m39846n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m39851s(Boolean bool) {
        if (gra.m131578I0().enabled) {
            this.f24101c.setText("附近没有其他人了，回首页看看吧");
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f24101c;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R$string.f19626rp));
        } else {
            vText.setText(getContext().getString(R$string.f19657sp));
        }
        this.f24102d.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m39852t(uxj0 uxj0Var) {
        m39846n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m39853u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g() || this.f24099a.getVisibility() == 8) {
            return;
        }
        this.f24099a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m39854v() {
        if (this.f24099a.getVisibility() == 0) {
            return;
        }
        m39845m();
        this.f24099a.setVisibility(0);
        this.f24099a.setAlpha(0.0f);
        this.f24099a.animate().alpha(1.0f).setDuration(400L).setListener(new C8189b()).start();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82487b(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
            sfj0.m185601h("e_edit_suggest_user_filter", "p_suggest_users_home_view", sfj0.C20032a.m185612e().m185617d("increase_distance_open").m185623o(userM116600p9.settings.autoAdjustSuggestRadius().booleanValue()), eui0.m122572b());
        }
        if (this.f24102d.getVisibility() == 0) {
            sfj0.m185601h("e_increase_distance_button", "p_suggest_users_home_view", eui0.m122572b());
        }
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeThemeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
