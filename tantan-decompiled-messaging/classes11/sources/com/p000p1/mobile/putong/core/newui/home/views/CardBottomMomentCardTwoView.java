package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.view.MaximumScroll;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.sh4;
import l.xdl0;
import l.zvf0;
import p009l.dol;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomMomentCardTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2311c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f2312d;

    /* JADX INFO: renamed from: e */
    public MaximumScroll f2313e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f2314f;

    /* JADX INFO: renamed from: g */
    public Act f2315g;

    /* JADX INFO: renamed from: h */
    public User f2316h;

    /* JADX INFO: renamed from: i */
    public CoreMomentInfo f2317i;

    /* JADX INFO: renamed from: j */
    public dol f2318j;

    /* JADX INFO: renamed from: k */
    public boolean f2319k;

    /* JADX INFO: renamed from: l */
    public MaximumScroll.b f2320l;

    public CardBottomMomentCardTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2320l = new MaximumScroll.b() { // from class: l.rh4
            /* JADX INFO: renamed from: a */
            public final void m21660a(int i2) {
                this.f19834a.m2943R(i2);
            }
        };
    }

    /* JADX INFO: renamed from: Q */
    public final void m2942Q(View view) {
        sh4.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m2943R(int i) {
        if (NullChecker.a(this.f2318j) && NullChecker.a(this.f2318j.mo1449f())) {
            this.f2318j.mo1449f().mo884p0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m2944S(dol dolVar) {
        this.f2316h = dolVar.getUser();
        this.f2317i = dolVar.mo1451h();
        this.f2318j = dolVar;
        if (dolVar.mo1448e() && !this.f2319k) {
            this.f2319k = true;
            zvf0.A("e_moment", "p_suggest_users_home_view", new j760[]{new j760("moment_id", NullChecker.a(this.f2317i) ? ((CopyObject) this.f2317i).id : ""), new j760("owner_id", ((DbObject) this.f2316h).id)});
        }
        xdl0.M(this.f2313e, NullChecker.b(this.f2317i) && !TextUtils.isEmpty(this.f2317i.value));
        this.f2313e.setOnHeightChangeListener(this.f2320l);
        this.f2314f.m9519L(false);
        this.f2314f.m9520M(this.f2317i.value);
        this.f2314f.m9518K(Color.parseColor("#99ffffff"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2942Q(this);
        this.f2315g = getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f2314f.m9511D()) {
            super/*android.view.ViewGroup*/.requestDisallowInterceptTouchEvent(z);
        }
    }

    public CardBottomMomentCardTwoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomMomentCardTwoView(Context context) {
        this(context, null);
    }
}
