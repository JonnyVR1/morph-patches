package com.p000p1.mobile.putong.core.newui.intltribe.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jo0;
import l.mcr;
import l.mkd0;
import l.nfp;
import l.o6j0;
import l.roj0;
import l.xdl0;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public IntlTribeSlideEmptyCardView f3139a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3140b;

    /* JADX INFO: renamed from: c */
    public VText f3141c;

    /* JADX INFO: renamed from: d */
    public VButton f3142d;

    /* JADX INFO: renamed from: e */
    public VButton f3143e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$a */
    public class C0247a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f3144a;

        public C0247a(d30 d30Var) {
            this.f3144a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f3139a.setVisibility(8);
            if (NullChecker.a(this.f3144a)) {
                this.f3144a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$b */
    public class C0248b extends AnimatorListenerAdapter {
        public C0248b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f3139a.setAlpha(1.0f);
        }
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3600b(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3602d(d30 d30Var, View view) {
        CoreModule.c.e0.p9();
        o6j0.c("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new o6j0.a[0]);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m3603e(d30 d30Var, View view) {
        o6j0.c("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new o6j0.a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final void m3605g(View view) {
        nfp.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m3606h() {
        this.f3139a.animate().cancel();
        this.f3140b.animate().cancel();
    }

    /* JADX INFO: renamed from: i */
    public void m3607i() {
        m3608j(null);
    }

    /* JADX INFO: renamed from: j */
    public void m3608j(d30 d30Var) {
        if (this.f3139a.getVisibility() == 8) {
            return;
        }
        this.f3139a.animate().alpha(0.0f).setDuration(400L).setListener(new C0247a(d30Var)).start();
    }

    /* JADX INFO: renamed from: k */
    public void m3609k(final d30 d30Var, final d30 d30Var2, mcr mcrVar) {
        xdl0.M(this.f3142d, true);
        xdl0.E0(this.f3142d, new View.OnClickListener() { // from class: l.hfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m3603e(d30Var, view);
            }
        });
        xdl0.E0(this.f3143e, new View.OnClickListener() { // from class: l.ifp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m3602d(d30Var2, view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.o0.b4()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.jfp
            public final void call(Object obj) {
                this.f15105a.m3610l((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.kfp
            public final void call(Object obj) {
                this.f15653a.m3611m((NetworkInfo) obj);
            }
        }));
        this.f3139a.setOnClickListener(new View.OnClickListener() { // from class: l.lfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m3600b(view);
            }
        });
        mcrVar.duringCreated(CoreModule.c.o0.a4()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.mfp
            public final void call(Object obj) {
                this.f16879a.m3612n((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m3610l(roj0 roj0Var) {
        m3607i();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m3611m(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g() || this.f3139a.getVisibility() == 8) {
            return;
        }
        this.f3139a.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m3612n(roj0 roj0Var) {
        m3607i();
    }

    /* JADX INFO: renamed from: o */
    public void m3613o() {
        if (this.f3139a.getVisibility() == 0) {
            return;
        }
        o6j0.h("e_intl_tribe_empty_view", "p_intl_tribe_swipe_view", new o6j0.a[]{o6j0.a.h("empty_entrance", "tribe_level2")});
        o6j0.h("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new o6j0.a[0]);
        o6j0.h("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new o6j0.a[0]);
        m3606h();
        this.f3139a.setVisibility(0);
        this.f3139a.setAlpha(0.0f);
        this.f3139a.animate().alpha(1.0f).setDuration(400L).setListener(new C0248b()).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3605g(this);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
