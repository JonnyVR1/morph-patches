package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.view.MaximumScroll;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.bnl0;
import p153l.i4g0;
import p153l.oql;
import p153l.pf60;
import p153l.ri4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomMomentCardTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24275c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f24276d;

    /* JADX INFO: renamed from: e */
    public MaximumScroll f24277e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f24278f;

    /* JADX INFO: renamed from: g */
    public Act f24279g;

    /* JADX INFO: renamed from: h */
    public User f24280h;

    /* JADX INFO: renamed from: i */
    public CoreMomentInfo f24281i;

    /* JADX INFO: renamed from: j */
    public oql f24282j;

    /* JADX INFO: renamed from: k */
    public boolean f24283k;

    /* JADX INFO: renamed from: l */
    public MaximumScroll.InterfaceC9326b f24284l;

    public CardBottomMomentCardTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24284l = new MaximumScroll.InterfaceC9326b() { // from class: l.qi4
            @Override // com.p051p1.mobile.putong.core.view.MaximumScroll.InterfaceC9326b
            /* JADX INFO: renamed from: a */
            public final void mo60731a(int i2) {
                this.f157797a.m39939R(i2);
            }
        };
    }

    /* JADX INFO: renamed from: Q */
    public final void m39938Q(View view) {
        ri4.m181571a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m39939R(int i) {
        if (NullChecker.m82486a(this.f24282j) && NullChecker.m82486a(this.f24282j.mo38481f())) {
            this.f24282j.mo38481f().mo37921p0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m39940S(oql oqlVar) {
        this.f24280h = oqlVar.getUser();
        this.f24281i = oqlVar.mo38483h();
        this.f24282j = oqlVar;
        if (oqlVar.mo38480e() && !this.f24283k) {
            this.f24283k = true;
            i4g0.m138492A("e_moment", "p_suggest_users_home_view", new pf60("moment_id", NullChecker.m82486a(this.f24281i) ? this.f24281i.f56856id : ""), new pf60("owner_id", this.f24280h.f56859id));
        }
        bnl0.m105524M(this.f24277e, NullChecker.m82487b(this.f24281i) && !TextUtils.isEmpty(this.f24281i.value));
        this.f24277e.setOnHeightChangeListener(this.f24284l);
        this.f24278f.m80383L(false);
        this.f24278f.m80384M(this.f24281i.value);
        this.f24278f.m80382K(Color.parseColor("#99ffffff"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39938Q(this);
        this.f24279g = (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f24278f.m80375D()) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public CardBottomMomentCardTwoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomMomentCardTwoView(Context context) {
        this(context, null);
    }
}
