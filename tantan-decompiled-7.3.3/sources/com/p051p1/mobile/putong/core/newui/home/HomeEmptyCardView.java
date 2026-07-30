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
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.b9l;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.jj40;
import p153l.ner;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.xra;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeEmptyCardView f22381a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f22382b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f22383c;

    /* JADX INFO: renamed from: d */
    public VText f22384d;

    /* JADX INFO: renamed from: e */
    public VButton f22385e;

    /* JADX INFO: renamed from: f */
    public VButton f22386f;

    /* JADX INFO: renamed from: g */
    public VText f22387g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$a */
    public class C8006a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f22388a;

        public C8006a(x20 x20Var) {
            this.f22388a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f22381a.setVisibility(8);
            if (NullChecker.m82486a(this.f22388a)) {
                this.f22388a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$b */
    public class C8007b extends AnimatorListenerAdapter {
        public C8007b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f22381a.setAlpha(1.0f);
            if (xra.m212803v() && jj40.m144998a(NewTanFragTag.ALREADY_AUTH)) {
                bnl0.m105524M(HomeEmptyCardView.this.f22387g, true);
            }
        }
    }

    public HomeEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37649a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m37652d(x20 x20Var, View view) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82487b(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
            sfj0.m185596c("e_edit_suggest_user_filter", "p_suggest_users_home_view", sfj0.C20032a.m185612e().m185617d("increase_distance_open").m185623o(userM116600p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m37656h(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m37657i(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m37660l(View view) {
        b9l.m103108a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m37661m() {
        this.f22381a.animate().cancel();
        this.f22383c.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m37662n() {
        m37663o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m37663o(x20 x20Var) {
        if (this.f22381a.getVisibility() == 8) {
            return;
        }
        this.f22381a.animate().alpha(0.0f).setDuration(400L).setListener(new C8006a(x20Var)).start();
        if (gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s()) {
            ExpandedCardStyleHelper.m39093o().m39110w("show radar reset");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37660l(this);
        if (gra.m131778z()) {
            int i = qa00.f156297J;
            bnl0.m105507D0(i, this.f22383c);
            bnl0.m105505C0(this.f22383c, i);
            RoundingParams roundingParamsM8301a = RoundingParams.m8301a();
            roundingParamsM8301a.m8315o(-1, 0.0f);
            this.f22383c.getHierarchy().m207045H(roundingParamsM8301a);
            bnl0.m105524M(this.f22382b, false);
            this.f22384d.setTextColor(getResources().getColor(c9c0.f80475z));
            this.f22385e.setBackgroundResource(dbc0.f86104E);
            this.f22386f.setBackgroundResource(dbc0.f86104E);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m37664p(final x20 x20Var, final x20 x20Var2, final x20 x20Var3, ner nerVar) {
        bnl0.m105509E0(this.f22385e, new View.OnClickListener() { // from class: l.q8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156140a.m37665q(x20Var, view);
            }
        });
        bnl0.m105509E0(this.f22386f, new View.OnClickListener() { // from class: l.t8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m37652d(x20Var2, view);
            }
        });
        bnl0.m105509E0(this.f22387g, new View.OnClickListener() { // from class: l.u8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m37656h(x20Var3, view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.v8l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m82487b(user) && NullChecker.m82486a(user.settings));
            }
        }).map(new qcj() { // from class: l.w8l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.x8l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192854a.m37667s((Boolean) obj);
            }
        }, new y20() { // from class: l.y8l
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeEmptyCardView.m37649a((Throwable) obj);
            }
        }));
        nerVar.duringCreated(CoreModule.f18264c.f20405m0.m32057T8()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.z8l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203397a.m37668t((uxj0) obj);
            }
        }));
        nerVar.duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.a9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69054a.m37669u((NetworkInfo) obj);
            }
        }));
        this.f22381a.setOnClickListener(new View.OnClickListener() { // from class: l.r8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m37657i(view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20405m0.m32049R8()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.s8l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166831a.m37666r((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m37665q(x20 x20Var, View view) {
        sfj0.m185596c("e_increase_distance_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        m37661m();
        m37663o(x20Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m37666r(uxj0 uxj0Var) {
        m37662n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m37667s(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f22384d;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R$string.f19626rp));
        } else {
            vText.setText(getContext().getString(R$string.f19657sp));
        }
        this.f22385e.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m37668t(uxj0 uxj0Var) {
        m37662n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m37669u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g() || this.f22381a.getVisibility() == 8) {
            return;
        }
        this.f22381a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m37670v() {
        if (this.f22381a.getVisibility() == 0) {
            return;
        }
        m37661m();
        bnl0.m105524M(this.f22387g, false);
        if (!gra.m131778z()) {
            this.f22382b.setImageResource(dbc0.f87628z2);
        }
        if (xra.m212803v() && jj40.m144998a(NewTanFragTag.ALREADY_AUTH)) {
            bnl0.m105524M(this.f22385e, false);
        } else {
            bnl0.m105524M(this.f22385e, true);
        }
        this.f22381a.setVisibility(0);
        this.f22381a.setAlpha(0.0f);
        this.f22381a.animate().alpha(1.0f).setDuration(400L).setListener(new C8007b()).start();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82487b(userM116600p9) && NullChecker.m82486a(userM116600p9.settings)) {
            sfj0.m185601h("e_edit_suggest_user_filter", "p_suggest_users_home_view", sfj0.C20032a.m185612e().m185617d("increase_distance_open").m185623o(userM116600p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (this.f22385e.getVisibility() == 0) {
            sfj0.m185601h("e_increase_distance_button", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
