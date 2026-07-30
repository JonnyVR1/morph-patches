package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VText;
import p149l.e30;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ml4;
import p149l.roj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CardPhotoFeedbackViewOpt extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardPhotoFeedbackViewOpt f23731a;

    /* JADX INFO: renamed from: b */
    public VText f23732b;

    /* JADX INFO: renamed from: c */
    public VText f23733c;

    /* JADX INFO: renamed from: d */
    public View f23734d;

    /* JADX INFO: renamed from: e */
    public VText f23735e;

    /* JADX INFO: renamed from: f */
    public Act f23736f;

    /* JADX INFO: renamed from: g */
    public User f23737g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f23738h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f23739i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$a */
    public class ViewOnClickListenerC8050a implements View.OnClickListener {
        public ViewOnClickListenerC8050a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(CardPhotoFeedbackViewOpt.this.f23737g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m39072w(cardPhotoFeedbackViewOpt.f23737g, false);
                zvf0.m220396r("e_fake_online_no", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$b */
    public class ViewOnClickListenerC8051b implements View.OnClickListener {
        public ViewOnClickListenerC8051b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(CardPhotoFeedbackViewOpt.this.f23737g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m39072w(cardPhotoFeedbackViewOpt.f23737g, true);
                zvf0.m220396r("e_fake_online_yes", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$c */
    public class C8052c implements e30<roj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f23742a;

        public C8052c(User user) {
            this.f23742a = user;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            lsi0.m151595y("反馈成功");
            xdl0.m208344M(CardPhotoFeedbackViewOpt.this.f23731a, false);
            CoreModule.f17545c.f19639e0.f149284U6.add(this.f23742a.f56011id);
            CoreModule.f17545c.f19663m0.f19426k2.onNext(roj0.f160388a);
        }
    }

    public CardPhotoFeedbackViewOpt(Context context) {
        super(context);
        this.f23738h = new ViewOnClickListenerC8050a();
        this.f23739i = new ViewOnClickListenerC8051b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m39068p(Throwable th) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39070u(this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m39071v();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m39070u(View view) {
        ml4.m155114a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m39071v() {
        this.f23733c.setFocusable(true);
        this.f23733c.requestFocus();
        this.f23735e.setFocusable(true);
        this.f23735e.requestFocus();
        this.f23731a.bringToFront();
        xdl0.m208329E0(this.f23733c, this.f23738h);
        xdl0.m208329E0(this.f23735e, this.f23739i);
    }

    /* JADX INFO: renamed from: w */
    public final void m39072w(User user, boolean z) {
        this.f23736f.duringCreated(CoreModule.f17545c.f19639e0.m169471b7(user.f56011id, user.pictures.get(0).url, true, z)).subscribe(mkd0.m154956H(new C8052c(user), new e30() { // from class: l.ll4
            @Override // p149l.e30
            public final void call(Object obj) {
                CardPhotoFeedbackViewOpt.m39068p((Throwable) obj);
            }
        }));
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23738h = new ViewOnClickListenerC8050a();
        this.f23739i = new ViewOnClickListenerC8051b();
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23738h = new ViewOnClickListenerC8050a();
        this.f23739i = new ViewOnClickListenerC8051b();
    }
}
