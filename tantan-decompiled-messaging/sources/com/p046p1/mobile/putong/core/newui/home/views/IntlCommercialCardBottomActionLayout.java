package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VText;
import p149l.c6n;
import p149l.eqh0;
import p149l.j760;
import p149l.q8p;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlCommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public IntlCommercialCardBottomActionLayout f23968c;

    /* JADX INFO: renamed from: d */
    public VText f23969d;

    /* JADX INFO: renamed from: e */
    public VLinear f23970e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f23971f;

    /* JADX INFO: renamed from: g */
    public View f23972g;

    /* JADX INFO: renamed from: h */
    public VText f23973h;

    /* JADX INFO: renamed from: i */
    public VLinear f23974i;

    /* JADX INFO: renamed from: j */
    public VText f23975j;

    /* JADX INFO: renamed from: k */
    public Act f23976k;

    /* JADX INFO: renamed from: l */
    public User f23977l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f23978m;

    /* JADX INFO: renamed from: n */
    public int f23979n;

    /* JADX INFO: renamed from: o */
    public boolean f23980o;

    public IntlCommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f23979n = -1;
        this.f23980o = false;
    }

    /* JADX INFO: renamed from: S */
    public final void m39179S(View view) {
        c6n.m105485a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m39180T() {
        if (this.f23978m == null) {
            return;
        }
        m39181V();
    }

    /* JADX INFO: renamed from: V */
    public final void m39181V() {
        zvf0.m220402x("e_intl_card_sayhi", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m39182W(View view) {
        m39186a0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m39183X(View view) {
        m39186a0();
    }

    /* JADX INFO: renamed from: Y */
    public void m39184Y(Act act, User user, CoreSuggested.UserInfo userInfo, int i) {
        if (NullChecker.m81303a(this.f23977l) && !TextUtils.equals(this.f23977l.f56011id, user.f56011id)) {
            this.f23980o = false;
        }
        this.f23976k = act;
        this.f23977l = user;
        this.f23978m = userInfo;
        this.f23979n = i;
        q8p.Companion companion = q8p.INSTANCE;
        if ((companion.m173439n(userInfo, user) && NullChecker.m81303a(userInfo.getRenderUser())) || companion.m173435j(userInfo.f19472id)) {
            companion.m173443r(userInfo.f19472id);
            m39187b0();
            m39185Z();
        } else {
            this.f23968c.setOnClickListener(null);
            this.f23969d.setOnClickListener(null);
            this.f23971f.setOnClickListener(null);
            this.f23974i.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m39185Z() {
        xdl0.m208329E0(this.f23971f, new View.OnClickListener() { // from class: l.z5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f17545c.f19663m0.f19325B2.onNext(roj0.f160388a);
            }
        });
        xdl0.m208329E0(this.f23974i, new View.OnClickListener() { // from class: l.a6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67782a.m39182W(view);
            }
        });
        xdl0.m208329E0(this.f23969d, new View.OnClickListener() { // from class: l.b6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73851a.m39183X(view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m39186a0() {
        CoreModule.f17545c.f19663m0.m31031O5();
        zvf0.m220396r("e_intl_card_sayhi", "p_suggest_users_home_view");
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33565pr(this.f23976k, "p_suggest_users_home_view,e_intl_card_sayhi,click", Privilege.see_who_likes_me);
        } else {
            CoreModule.f17545c.f19663m0.f19346I2.onNext(j760.m140076a(SwipeDirection.RIGHT, null));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m39187b0() {
        if (this.f23980o || this.f23979n != 0) {
            return;
        }
        this.f23980o = true;
        m39181V();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39179S(this);
        this.f23969d.setTypeface(eqh0.m117752c(3), 1);
        this.f23973h.setTypeface(eqh0.m117752c(3), 1);
        this.f23975j.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208344M(this.f23969d, !IntlCountryCodeController.m28126v());
        xdl0.m208344M(this.f23970e, IntlCountryCodeController.m28126v());
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23979n = -1;
        this.f23980o = false;
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23979n = -1;
        this.f23980o = false;
    }
}
