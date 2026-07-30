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
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.HomeEmptyCardView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.jo0;
import p149l.l6l;
import p149l.lqa;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.va40;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HomeEmptyCardView f21639a;

    /* JADX INFO: renamed from: b */
    public AppCompatImageView f21640b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f21641c;

    /* JADX INFO: renamed from: d */
    public VText f21642d;

    /* JADX INFO: renamed from: e */
    public VButton f21643e;

    /* JADX INFO: renamed from: f */
    public VButton f21644f;

    /* JADX INFO: renamed from: g */
    public VText f21645g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$a */
    public class C7855a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f21646a;

        public C7855a(d30 d30Var) {
            this.f21646a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f21639a.setVisibility(8);
            if (NullChecker.m81303a(this.f21646a)) {
                this.f21646a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeEmptyCardView$b */
    public class C7856b extends AnimatorListenerAdapter {
        public C7856b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HomeEmptyCardView.this.f21639a.setAlpha(1.0f);
            if (lqa.m150984v() && va40.m197619a(NewTanFragTag.ALREADY_AUTH)) {
                xdl0.m208344M(HomeEmptyCardView.this.f21645g, true);
            }
        }
    }

    public HomeEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36646a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m36649d(d30 d30Var, View view) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81304b(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
            o6j0.m162859c("e_edit_suggest_user_filter", "p_suggest_users_home_view", o6j0.C18854a.m162875e().m162880d("increase_distance_open").m162886o(userM169527p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m36653h(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m36654i(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m36657l(View view) {
        l6l.m148752a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m36658m() {
        this.f21639a.animate().cancel();
        this.f21641c.animate().cancel();
    }

    /* JADX INFO: renamed from: n */
    public void m36659n() {
        m36660o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m36660o(d30 d30Var) {
        if (this.f21639a.getVisibility() == 8) {
            return;
        }
        this.f21639a.animate().alpha(0.0f).setDuration(400L).setListener(new C7855a(d30Var)).start();
        if (upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s()) {
            ExpandedCardStyleHelper.m38090o().m38107w("show radar reset");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36657l(this);
        if (upa.m194847z()) {
            int i = t100.f167235J;
            xdl0.m208327D0(i, this.f21641c);
            xdl0.m208325C0(this.f21641c, i);
            RoundingParams roundingParamsM8247a = RoundingParams.m8247a();
            roundingParamsM8247a.m8261o(-1, 0.0f);
            this.f21641c.getHierarchy().m112053H(roundingParamsM8247a);
            xdl0.m208344M(this.f21640b, false);
            this.f21642d.setTextColor(getResources().getColor(w0c0.f183905z));
            this.f21643e.setBackgroundResource(x2c0.f189249D);
            this.f21644f.setBackgroundResource(x2c0.f189249D);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m36661p(final d30 d30Var, final d30 d30Var2, final d30 d30Var3, mcr mcrVar) {
        xdl0.m208329E0(this.f21643e, new View.OnClickListener() { // from class: l.a6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67776a.m36662q(d30Var, view);
            }
        });
        xdl0.m208329E0(this.f21644f, new View.OnClickListener() { // from class: l.d6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m36649d(d30Var2, view);
            }
        });
        xdl0.m208329E0(this.f21645g, new View.OnClickListener() { // from class: l.e6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m36653h(d30Var3, view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.f6l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(NullChecker.m81304b(user) && NullChecker.m81303a(user.settings));
            }
        }).map(new w9j() { // from class: l.g6l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).settings.autoAdjustSuggestRadius();
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.h6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106070a.m36664s((Boolean) obj);
            }
        }, new e30() { // from class: l.i6l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeEmptyCardView.m36646a((Throwable) obj);
            }
        }));
        mcrVar.duringCreated(CoreModule.f17545c.f19663m0.m31054T8()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.j6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116484a.m36665t((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.k6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121490a.m36666u((NetworkInfo) obj);
            }
        }));
        this.f21639a.setOnClickListener(new View.OnClickListener() { // from class: l.b6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeEmptyCardView.m36654i(view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19663m0.m31046R8()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.c6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79555a.m36663r((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m36662q(d30 d30Var, View view) {
        o6j0.m162859c("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        m36658m();
        m36660o(d30Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m36663r(roj0 roj0Var) {
        m36659n();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m36664s(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f21642d;
        if (zBooleanValue) {
            vText.setText(getContext().getString(R$string.f18221Vo));
        } else {
            vText.setText(getContext().getString(R$string.f18251Wo));
        }
        this.f21643e.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m36665t(roj0 roj0Var) {
        m36659n();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m36666u(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g() || this.f21639a.getVisibility() == 8) {
            return;
        }
        this.f21639a.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m36667v() {
        if (this.f21639a.getVisibility() == 0) {
            return;
        }
        m36658m();
        xdl0.m208344M(this.f21645g, false);
        if (!upa.m194847z()) {
            this.f21640b.setImageResource(x2c0.f190733y2);
        }
        if (lqa.m150984v() && va40.m197619a(NewTanFragTag.ALREADY_AUTH)) {
            xdl0.m208344M(this.f21643e, false);
        } else {
            xdl0.m208344M(this.f21643e, true);
        }
        this.f21639a.setVisibility(0);
        this.f21639a.setAlpha(0.0f);
        this.f21639a.animate().alpha(1.0f).setDuration(400L).setListener(new C7856b()).start();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81304b(userM169527p9) && NullChecker.m81303a(userM169527p9.settings)) {
            o6j0.m162864h("e_edit_suggest_user_filter", "p_suggest_users_home_view", o6j0.C18854a.m162875e().m162880d("increase_distance_open").m162886o(userM169527p9.settings.autoAdjustSuggestRadius().booleanValue()));
        }
        if (this.f21643e.getVisibility() == 0) {
            o6j0.m162864h("e_increase_distance_button", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
