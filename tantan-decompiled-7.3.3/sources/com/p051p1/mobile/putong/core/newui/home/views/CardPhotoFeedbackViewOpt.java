package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.lm4;
import p153l.o1j0;
import p153l.psd0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardPhotoFeedbackViewOpt extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardPhotoFeedbackViewOpt f24473a;

    /* JADX INFO: renamed from: b */
    public VText f24474b;

    /* JADX INFO: renamed from: c */
    public VText f24475c;

    /* JADX INFO: renamed from: d */
    public View f24476d;

    /* JADX INFO: renamed from: e */
    public VText f24477e;

    /* JADX INFO: renamed from: f */
    public Act f24478f;

    /* JADX INFO: renamed from: g */
    public User f24479g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f24480h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f24481i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$a */
    public class ViewOnClickListenerC8201a implements View.OnClickListener {
        public ViewOnClickListenerC8201a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(CardPhotoFeedbackViewOpt.this.f24479g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m40075w(cardPhotoFeedbackViewOpt.f24479g, false);
                i4g0.m138520r("e_fake_online_no", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$b */
    public class ViewOnClickListenerC8202b implements View.OnClickListener {
        public ViewOnClickListenerC8202b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(CardPhotoFeedbackViewOpt.this.f24479g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m40075w(cardPhotoFeedbackViewOpt.f24479g, true);
                i4g0.m138520r("e_fake_online_yes", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$c */
    public class C8203c implements y20<uxj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f24484a;

        public C8203c(User user) {
            this.f24484a = user;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            o1j0.m165651y("反馈成功");
            bnl0.m105524M(CardPhotoFeedbackViewOpt.this.f24473a, false);
            CoreModule.f18264c.f20381e0.f89141U6.add(this.f24484a.f56859id);
            CoreModule.f18264c.f20405m0.f20168k2.onNext(uxj0.f181467a);
        }
    }

    public CardPhotoFeedbackViewOpt(Context context) {
        super(context);
        this.f24480h = new ViewOnClickListenerC8201a();
        this.f24481i = new ViewOnClickListenerC8202b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m40071p(Throwable th) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40073u(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m40074v();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m40073u(View view) {
        lm4.m154848a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m40074v() {
        this.f24475c.setFocusable(true);
        this.f24475c.requestFocus();
        this.f24477e.setFocusable(true);
        this.f24477e.requestFocus();
        this.f24473a.bringToFront();
        bnl0.m105509E0(this.f24475c, this.f24480h);
        bnl0.m105509E0(this.f24477e, this.f24481i);
    }

    /* JADX INFO: renamed from: w */
    public final void m40075w(User user, boolean z) {
        this.f24478f.duringCreated(CoreModule.f18264c.f20381e0.m116544b7(user.f56859id, user.pictures.get(0).url, true, z)).subscribe(psd0.m173597H(new C8203c(user), new y20() { // from class: l.km4
            @Override // p153l.y20
            public final void call(Object obj) {
                CardPhotoFeedbackViewOpt.m40071p((Throwable) obj);
            }
        }));
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24480h = new ViewOnClickListenerC8201a();
        this.f24481i = new ViewOnClickListenerC8202b();
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24480h = new ViewOnClickListenerC8201a();
        this.f24481i = new ViewOnClickListenerC8202b();
    }
}
