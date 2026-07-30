package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c8n;
import p153l.i4g0;
import p153l.joa;
import p153l.lyh0;
import p153l.pf60;
import p153l.qap;

/* JADX INFO: loaded from: classes11.dex */
public class IntlCommercialCardBottomActionLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public IntlCommercialCardBottomActionLayout f24710c;

    /* JADX INFO: renamed from: d */
    public VText f24711d;

    /* JADX INFO: renamed from: e */
    public VLinear f24712e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f24713f;

    /* JADX INFO: renamed from: g */
    public View f24714g;

    /* JADX INFO: renamed from: h */
    public VText f24715h;

    /* JADX INFO: renamed from: i */
    public VLinear f24716i;

    /* JADX INFO: renamed from: j */
    public VText f24717j;

    /* JADX INFO: renamed from: k */
    public Act f24718k;

    /* JADX INFO: renamed from: l */
    public User f24719l;

    /* JADX INFO: renamed from: m */
    public CoreSuggested.UserInfo f24720m;

    /* JADX INFO: renamed from: n */
    public int f24721n;

    /* JADX INFO: renamed from: o */
    public boolean f24722o;

    public IntlCommercialCardBottomActionLayout(Context context) {
        super(context);
        this.f24721n = -1;
        this.f24722o = false;
    }

    /* JADX INFO: renamed from: S */
    public final void m40182S(View view) {
        c8n.m108372a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m40183T() {
        if (this.f24720m == null) {
            return;
        }
        m40184V();
    }

    /* JADX INFO: renamed from: V */
    public final void m40184V() {
        i4g0.m138526x("e_intl_card_sayhi", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m40185W(View view) {
        m40189a0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m40186X(View view) {
        m40189a0();
    }

    /* JADX INFO: renamed from: Y */
    public void m40187Y(Act act, User user, CoreSuggested.UserInfo userInfo, int i) {
        if (NullChecker.m82486a(this.f24719l) && !TextUtils.equals(this.f24719l.f56859id, user.f56859id)) {
            this.f24722o = false;
        }
        this.f24718k = act;
        this.f24719l = user;
        this.f24720m = userInfo;
        this.f24721n = i;
        qap.Companion companion = qap.INSTANCE;
        if ((companion.m175976n(userInfo, user) && NullChecker.m82486a(userInfo.getRenderUser())) || companion.m175972j(userInfo.f20214id)) {
            companion.m175980r(userInfo.f20214id);
            m40190b0();
            m40188Z();
        } else {
            this.f24710c.setOnClickListener(null);
            this.f24711d.setOnClickListener(null);
            this.f24713f.setOnClickListener(null);
            this.f24716i.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m40188Z() {
        bnl0.m105509E0(this.f24713f, new View.OnClickListener() { // from class: l.z7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f18264c.f20405m0.f20067B2.onNext(uxj0.f181467a);
            }
        });
        bnl0.m105509E0(this.f24716i, new View.OnClickListener() { // from class: l.a8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68934a.m40185W(view);
            }
        });
        bnl0.m105509E0(this.f24711d, new View.OnClickListener() { // from class: l.b8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75446a.m40186X(view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m40189a0() {
        CoreModule.f18264c.f20405m0.m32034O5();
        i4g0.m138520r("e_intl_card_sayhi", "p_suggest_users_home_view");
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34568pr(this.f24718k, "p_suggest_users_home_view,e_intl_card_sayhi,click", Privilege.see_who_likes_me);
        } else {
            CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.RIGHT, null));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m40190b0() {
        if (this.f24722o || this.f24721n != 0) {
            return;
        }
        this.f24722o = true;
        m40184V();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40182S(this);
        this.f24711d.setTypeface(lyh0.m156283c(3), 1);
        this.f24715h.setTypeface(lyh0.m156283c(3), 1);
        this.f24717j.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105524M(this.f24711d, !IntlCountryCodeController.m29125v());
        bnl0.m105524M(this.f24712e, IntlCountryCodeController.m29125v());
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24721n = -1;
        this.f24722o = false;
    }

    public IntlCommercialCardBottomActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24721n = -1;
        this.f24722o = false;
    }
}
