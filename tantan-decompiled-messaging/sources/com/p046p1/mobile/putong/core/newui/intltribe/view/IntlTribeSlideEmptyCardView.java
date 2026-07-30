package com.p046p1.mobile.putong.core.newui.intltribe.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.jo0;
import p149l.mcr;
import p149l.mkd0;
import p149l.nfp;
import p149l.o6j0;
import p149l.roj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public IntlTribeSlideEmptyCardView f24361a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24362b;

    /* JADX INFO: renamed from: c */
    public VText f24363c;

    /* JADX INFO: renamed from: d */
    public VButton f24364d;

    /* JADX INFO: renamed from: e */
    public VButton f24365e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$a */
    public class C8083a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f24366a;

        public C8083a(d30 d30Var) {
            this.f24366a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f24361a.setVisibility(8);
            if (NullChecker.m81303a(this.f24366a)) {
                this.f24366a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$b */
    public class C8084b extends AnimatorListenerAdapter {
        public C8084b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f24361a.setAlpha(1.0f);
        }
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39531b(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m39533d(d30 d30Var, View view) {
        CoreModule.f17545c.f19639e0.m169527p9();
        o6j0.m162859c("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new o6j0.C18854a[0]);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39534e(d30 d30Var, View view) {
        o6j0.m162859c("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new o6j0.C18854a[0]);
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final void m39536g(View view) {
        nfp.m159259a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m39537h() {
        this.f24361a.animate().cancel();
        this.f24362b.animate().cancel();
    }

    /* JADX INFO: renamed from: i */
    public void m39538i() {
        m39539j(null);
    }

    /* JADX INFO: renamed from: j */
    public void m39539j(d30 d30Var) {
        if (this.f24361a.getVisibility() == 8) {
            return;
        }
        this.f24361a.animate().alpha(0.0f).setDuration(400L).setListener(new C8083a(d30Var)).start();
    }

    /* JADX INFO: renamed from: k */
    public void m39540k(final d30 d30Var, final d30 d30Var2, mcr mcrVar) {
        xdl0.m208344M(this.f24364d, true);
        xdl0.m208329E0(this.f24364d, new View.OnClickListener() { // from class: l.hfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m39534e(d30Var, view);
            }
        });
        xdl0.m208329E0(this.f24365e, new View.OnClickListener() { // from class: l.ifp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m39533d(d30Var2, view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19669o0.m34325b4()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.jfp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117681a.m39541l((roj0) obj);
            }
        }));
        mcrVar.duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.kfp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122956a.m39542m((NetworkInfo) obj);
            }
        }));
        this.f24361a.setOnClickListener(new View.OnClickListener() { // from class: l.lfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m39531b(view);
            }
        });
        mcrVar.duringCreated(CoreModule.f17545c.f19669o0.m34324a4()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.mfp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133607a.m39543n((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m39541l(roj0 roj0Var) {
        m39538i();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m39542m(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g() || this.f24361a.getVisibility() == 8) {
            return;
        }
        this.f24361a.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m39543n(roj0 roj0Var) {
        m39538i();
    }

    /* JADX INFO: renamed from: o */
    public void m39544o() {
        if (this.f24361a.getVisibility() == 0) {
            return;
        }
        o6j0.m162864h("e_intl_tribe_empty_view", "p_intl_tribe_swipe_view", o6j0.C18854a.m162878h("empty_entrance", "tribe_level2"));
        o6j0.m162864h("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new o6j0.C18854a[0]);
        o6j0.m162864h("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new o6j0.C18854a[0]);
        m39537h();
        this.f24361a.setVisibility(0);
        this.f24361a.setAlpha(0.0f);
        this.f24361a.animate().alpha(1.0f).setDuration(400L).setListener(new C8084b()).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39536g(this);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
