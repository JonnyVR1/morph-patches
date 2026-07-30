package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.ml4;
import l.roj0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardPhotoFeedbackViewOpt extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardPhotoFeedbackViewOpt f2509a;

    /* JADX INFO: renamed from: b */
    public VText f2510b;

    /* JADX INFO: renamed from: c */
    public VText f2511c;

    /* JADX INFO: renamed from: d */
    public View f2512d;

    /* JADX INFO: renamed from: e */
    public VText f2513e;

    /* JADX INFO: renamed from: f */
    public Act f2514f;

    /* JADX INFO: renamed from: g */
    public User f2515g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f2516h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f2517i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$a */
    public class ViewOnClickListenerC0214a implements View.OnClickListener {
        public ViewOnClickListenerC0214a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(CardPhotoFeedbackViewOpt.this.f2515g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m3079w(cardPhotoFeedbackViewOpt.f2515g, false);
                zvf0.r("e_fake_online_no", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$b */
    public class ViewOnClickListenerC0215b implements View.OnClickListener {
        public ViewOnClickListenerC0215b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(CardPhotoFeedbackViewOpt.this.f2515g)) {
                CardPhotoFeedbackViewOpt cardPhotoFeedbackViewOpt = CardPhotoFeedbackViewOpt.this;
                cardPhotoFeedbackViewOpt.m3079w(cardPhotoFeedbackViewOpt.f2515g, true);
                zvf0.r("e_fake_online_yes", "p_suggest_users_home_view");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardPhotoFeedbackViewOpt$c */
    public class C0216c implements e30<roj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f2520a;

        public C0216c(User user) {
            this.f2520a = user;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            lsi0.y("反馈成功");
            xdl0.M(CardPhotoFeedbackViewOpt.this.f2509a, false);
            CoreModule.c.e0.U6.add(((DbObject) this.f2520a).id);
            CoreModule.c.m0.k2.onNext(roj0.a);
        }
    }

    public CardPhotoFeedbackViewOpt(Context context) {
        super(context);
        this.f2516h = new ViewOnClickListenerC0214a();
        this.f2517i = new ViewOnClickListenerC0215b();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m3075p(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3077u(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onVisibilityChanged(@NonNull View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        if (i == 0) {
            m3078v();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3077u(View view) {
        ml4.a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public final void m3078v() {
        this.f2511c.setFocusable(true);
        this.f2511c.requestFocus();
        this.f2513e.setFocusable(true);
        this.f2513e.requestFocus();
        this.f2509a.bringToFront();
        xdl0.E0(this.f2511c, this.f2516h);
        xdl0.E0(this.f2513e, this.f2517i);
    }

    /* JADX INFO: renamed from: w */
    public final void m3079w(User user, boolean z) {
        this.f2514f.duringCreated(CoreModule.c.e0.b7(((DbObject) user).id, ((Media) user.pictures.get(0)).url, true, z)).subscribe(mkd0.H(new C0216c(user), new e30() { // from class: l.ll4
            public final void call(Object obj) {
                CardPhotoFeedbackViewOpt.m3075p((Throwable) obj);
            }
        }));
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2516h = new ViewOnClickListenerC0214a();
        this.f2517i = new ViewOnClickListenerC0215b();
    }

    public CardPhotoFeedbackViewOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2516h = new ViewOnClickListenerC0214a();
        this.f2517i = new ViewOnClickListenerC0215b();
    }
}
