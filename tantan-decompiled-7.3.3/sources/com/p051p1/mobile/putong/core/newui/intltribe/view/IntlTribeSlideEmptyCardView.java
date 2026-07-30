package com.p051p1.mobile.putong.core.newui.intltribe.view;

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
import com.p051p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fo0;
import p153l.ner;
import p153l.nhp;
import p153l.psd0;
import p153l.sfj0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSlideEmptyCardView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public IntlTribeSlideEmptyCardView f25103a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25104b;

    /* JADX INFO: renamed from: c */
    public VText f25105c;

    /* JADX INFO: renamed from: d */
    public VButton f25106d;

    /* JADX INFO: renamed from: e */
    public VButton f25107e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$a */
    public class C8234a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f25108a;

        public C8234a(x20 x20Var) {
            this.f25108a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f25103a.setVisibility(8);
            if (NullChecker.m82486a(this.f25108a)) {
                this.f25108a.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView$b */
    public class C8235b extends AnimatorListenerAdapter {
        public C8235b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            IntlTribeSlideEmptyCardView.this.f25103a.setAlpha(1.0f);
        }
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40534b(View view) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m40536d(x20 x20Var, View view) {
        CoreModule.f18264c.f20381e0.m116600p9();
        sfj0.m185596c("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new sfj0.C20032a[0]);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m40537e(x20 x20Var, View view) {
        sfj0.m185596c("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new sfj0.C20032a[0]);
        x20Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final void m40539g(View view) {
        nhp.m163114a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m40540h() {
        this.f25103a.animate().cancel();
        this.f25104b.animate().cancel();
    }

    /* JADX INFO: renamed from: i */
    public void m40541i() {
        m40542j(null);
    }

    /* JADX INFO: renamed from: j */
    public void m40542j(x20 x20Var) {
        if (this.f25103a.getVisibility() == 8) {
            return;
        }
        this.f25103a.animate().alpha(0.0f).setDuration(400L).setListener(new C8234a(x20Var)).start();
    }

    /* JADX INFO: renamed from: k */
    public void m40543k(final x20 x20Var, final x20 x20Var2, ner nerVar) {
        bnl0.m105524M(this.f25106d, true);
        bnl0.m105509E0(this.f25106d, new View.OnClickListener() { // from class: l.hhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m40537e(x20Var, view);
            }
        });
        bnl0.m105509E0(this.f25107e, new View.OnClickListener() { // from class: l.ihp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m40536d(x20Var2, view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20411o0.m35328b4()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jhp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120994a.m40544l((uxj0) obj);
            }
        }));
        nerVar.duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.khp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126897a.m40545m((NetworkInfo) obj);
            }
        }));
        this.f25103a.setOnClickListener(new View.OnClickListener() { // from class: l.lhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlTribeSlideEmptyCardView.m40534b(view);
            }
        });
        nerVar.duringCreated(CoreModule.f18264c.f20411o0.m35327a4()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.mhp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136867a.m40546n((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40544l(uxj0 uxj0Var) {
        m40541i();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m40545m(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g() || this.f25103a.getVisibility() == 8) {
            return;
        }
        this.f25103a.setVisibility(8);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m40546n(uxj0 uxj0Var) {
        m40541i();
    }

    /* JADX INFO: renamed from: o */
    public void m40547o() {
        if (this.f25103a.getVisibility() == 0) {
            return;
        }
        sfj0.m185601h("e_intl_tribe_empty_view", "p_intl_tribe_swipe_view", sfj0.C20032a.m185615h("empty_entrance", "tribe_level2"));
        sfj0.m185601h("e_intl_tribe_empty_state_location_click", "p_intl_tribe_swipe_view", new sfj0.C20032a[0]);
        sfj0.m185601h("e_intl_tribe_empty_state_edit_profile_click", "p_intl_tribe_swipe_view", new sfj0.C20032a[0]);
        m40540h();
        this.f25103a.setVisibility(0);
        this.f25103a.setAlpha(0.0f);
        this.f25103a.animate().alpha(1.0f).setDuration(400L).setListener(new C8235b()).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40539g(this);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeSlideEmptyCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
