package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c6n;
import l.eqh0;
import l.j760;
import l.q8p;
import l.roj0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlCommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public IntlCommercialCardBottomActionLayout f2746c;

    /* JADX INFO: renamed from: d */
    public VText f2747d;

    /* JADX INFO: renamed from: e */
    public VLinear f2748e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f2749f;

    /* JADX INFO: renamed from: g */
    public View f2750g;

    /* JADX INFO: renamed from: h */
    public VText f2751h;

    /* JADX INFO: renamed from: i */
    public VLinear f2752i;

    /* JADX INFO: renamed from: j */
    public VText f2753j;

    /* JADX INFO: renamed from: k */
    public Act f2754k;

    /* JADX INFO: renamed from: l */
    public User f2755l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f2756m;

    /* JADX INFO: renamed from: n */
    public int f2757n;

    /* JADX INFO: renamed from: o */
    public boolean f2758o;

    public IntlCommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f2757n = -1;
        this.f2758o = false;
    }

    /* JADX INFO: renamed from: S */
    public final void m3197S(View view) {
        c6n.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m3198T() {
        if (this.f2756m == null) {
            return;
        }
        m3199V();
    }

    /* JADX INFO: renamed from: V */
    public final void m3199V() {
        zvf0.x("e_intl_card_sayhi", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m3200W(View view) {
        m3204a0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m3201X(View view) {
        m3204a0();
    }

    /* JADX INFO: renamed from: Y */
    public void m3202Y(Act act, User user, CoreSuggested.UserInfo userInfo, int i) {
        if (NullChecker.a(this.f2755l) && !TextUtils.equals(((DbObject) this.f2755l).id, ((DbObject) user).id)) {
            this.f2758o = false;
        }
        this.f2754k = act;
        this.f2755l = user;
        this.f2756m = userInfo;
        this.f2757n = i;
        q8p.a aVar = q8p.Companion;
        if ((aVar.n(userInfo, user) && NullChecker.a(userInfo.getRenderUser())) || aVar.j(userInfo.id)) {
            aVar.r(userInfo.id);
            m3205b0();
            m3203Z();
        } else {
            this.f2746c.setOnClickListener((View.OnClickListener) null);
            this.f2747d.setOnClickListener(null);
            this.f2749f.setOnClickListener(null);
            this.f2752i.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m3203Z() {
        xdl0.E0(this.f2749f, new View.OnClickListener() { // from class: l.z5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.c.m0.B2.onNext(roj0.a);
            }
        });
        xdl0.E0(this.f2752i, new View.OnClickListener() { // from class: l.a6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9314a.m3200W(view);
            }
        });
        xdl0.E0(this.f2747d, new View.OnClickListener() { // from class: l.b6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9919a.m3201X(view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m3204a0() {
        CoreModule.c.m0.O5();
        zvf0.r("e_intl_card_sayhi", "p_suggest_users_home_view");
        if (xma.e4()) {
            CoreModule.P().a().pr(this.f2754k, "p_suggest_users_home_view,e_intl_card_sayhi,click", Privilege.see_who_likes_me);
        } else {
            CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3205b0() {
        if (this.f2758o || this.f2757n != 0) {
            return;
        }
        this.f2758o = true;
        m3199V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3197S(this);
        this.f2747d.setTypeface(eqh0.c(3), 1);
        this.f2751h.setTypeface(eqh0.c(3), 1);
        this.f2753j.setTypeface(eqh0.c(3), 1);
        xdl0.M(this.f2747d, !IntlCountryCodeController.v());
        xdl0.M(this.f2748e, IntlCountryCodeController.v());
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2757n = -1;
        this.f2758o = false;
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2757n = -1;
        this.f2758o = false;
    }
}
