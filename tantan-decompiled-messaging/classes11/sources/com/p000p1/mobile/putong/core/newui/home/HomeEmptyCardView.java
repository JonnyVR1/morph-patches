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
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jo0;
import l.l6l;
import l.lqa;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.t100;
import l.upa;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p009l.va40;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeEmptyCardView f417a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f418b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f419c;

    /* JADX INFO: renamed from: d */
    public VText f420d;

    /* JADX INFO: renamed from: e */
    public VButton f421e;

    /* JADX INFO: renamed from: f */
    public VButton f422f;

    /* JADX INFO: renamed from: g */
    public VText f423g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$a */
    public class C0019a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f424a;

        public C0019a(d30 d30Var) {
            this.f424a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f417a.setVisibility(8);
            if (NullChecker.a(this.f424a)) {
                this.f424a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$b */
    public class C0020b extends AnimatorListenerAdapter {
        public C0020b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f417a.setAlpha(1.0f);
            if (lqa.v() && va40.m23330a(NewTanFragTag.ALREADY_AUTH)) {
                xdl0.M(HomeEmptyCardView.this.f423g, true);
            }
        }
    }

    public HomeEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m595a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m598d(d30 d30Var, View view) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.b(userP9) && NullChecker.a(userP9.settings)) {
            o6j0.c("e_edit_suggest_user_filter", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.e().d("increase_distance_open").o(userP9.settings.autoAdjustSuggestRadius().booleanValue())});
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m602h(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m603i(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m606l(View view) {
        l6l.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m607m() {
        this.f417a.animate().cancel();
        this.f419c.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m608n() {
        m609o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m609o(d30 d30Var) {
        if (this.f417a.getVisibility() == 8) {
            return;
        }
        this.f417a.animate().alpha(0.0f).setDuration(400L).setListener(new C0019a(d30Var)).start();
        if (upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s()) {
            ExpandedCardStyleHelper.m2064o().m2081w("show radar reset");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m606l(this);
        if (upa.z()) {
            int i = t100.J;
            xdl0.D0(i, new View[]{this.f419c});
            xdl0.C0(this.f419c, i);
            RoundingParams roundingParamsA = RoundingParams.a();
            roundingParamsA.o(-1, 0.0f);
            this.f419c.getHierarchy().H(roundingParamsA);
            xdl0.M(this.f418b, false);
            this.f420d.setTextColor(getResources().getColor(w0c0.z));
            this.f421e.setBackgroundResource(x2c0.D);
            this.f422f.setBackgroundResource(x2c0.D);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m610p(final d30 d30Var, final d30 d30Var2, final d30 d30Var3, mcr mcrVar) {
        xdl0.E0(this.f421e, new View.OnClickListener() { // from class: l.a6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9312a.m611q(d30Var, view);
            }
        });
        xdl0.E0(this.f422f, new View.OnClickListener() { // from class: l.d6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m598d(d30Var2, view);
            }
        });
        xdl0.E0(this.f423g, new View.OnClickListener() { // from class: l.e6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m602h(d30Var3, view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.f6l
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.b(user) && NullChecker.a(user.settings));
            }
        }).map(new w9j() { // from class: l.g6l
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.h6l
            public final void call(Object obj) {
                this.f13890a.m613s((Boolean) obj);
            }
        }, new e30() { // from class: l.i6l
            public final void call(Object obj) {
                HomeEmptyCardView.m595a((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.c.m0.T8()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.j6l
            public final void call(Object obj) {
                this.f14957a.m614t((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.k6l
            public final void call(Object obj) {
                this.f15430a.m615u((NetworkInfo) obj);
            }
        }));
        this.f417a.setOnClickListener(new View.OnClickListener() { // from class: l.b6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m603i(view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.m0.R8()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.c6l
            public final void call(Object obj) {
                this.f10446a.m612r((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m611q(d30 d30Var, View view) {
        o6j0.c("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.a[0]);
        m607m();
        m609o(d30Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m612r(roj0 roj0Var) {
        m608n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m613s(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f420d;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R.string.Vo));
        } else {
            vText.setText(getContext().getString(R.string.Wo));
        }
        this.f421e.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m614t(roj0 roj0Var) {
        m608n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m615u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g() || this.f417a.getVisibility() == 8) {
            return;
        }
        this.f417a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m616v() {
        if (this.f417a.getVisibility() == 0) {
            return;
        }
        m607m();
        xdl0.M(this.f423g, false);
        if (!upa.z()) {
            this.f418b.setImageResource(x2c0.y2);
        }
        if (lqa.v() && va40.m23330a(NewTanFragTag.ALREADY_AUTH)) {
            xdl0.M(this.f421e, false);
        } else {
            xdl0.M(this.f421e, true);
        }
        this.f417a.setVisibility(0);
        this.f417a.setAlpha(0.0f);
        this.f417a.animate().alpha(1.0f).setDuration(400L).setListener(new C0020b()).start();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.b(userP9) && NullChecker.a(userP9.settings)) {
            o6j0.h("e_edit_suggest_user_filter", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.e().d("increase_distance_open").o(userP9.settings.autoAdjustSuggestRadius().booleanValue())});
        }
        if (this.f421e.getVisibility() == 0) {
            o6j0.h("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.a[0]);
        }
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
