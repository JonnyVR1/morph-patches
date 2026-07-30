package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.view.MaximumScroll;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.dol;
import p149l.j760;
import p149l.sh4;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomMomentCardTwoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23533c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f23534d;

    /* JADX INFO: renamed from: e */
    public MaximumScroll f23535e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f23536f;

    /* JADX INFO: renamed from: g */
    public Act f23537g;

    /* JADX INFO: renamed from: h */
    public User f23538h;

    /* JADX INFO: renamed from: i */
    public CoreMomentInfo f23539i;

    /* JADX INFO: renamed from: j */
    public dol f23540j;

    /* JADX INFO: renamed from: k */
    public boolean f23541k;

    /* JADX INFO: renamed from: l */
    public MaximumScroll.InterfaceC9163b f23542l;

    public CardBottomMomentCardTwoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23542l = new MaximumScroll.InterfaceC9163b() { // from class: l.rh4
            @Override // com.p046p1.mobile.putong.core.view.MaximumScroll.InterfaceC9163b
            /* JADX INFO: renamed from: a */
            public final void mo59547a(int i2) {
                this.f159336a.m38936R(i2);
            }
        };
    }

    /* JADX INFO: renamed from: Q */
    public final void m38935Q(View view) {
        sh4.m184154a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m38936R(int i) {
        if (NullChecker.m81303a(this.f23540j) && NullChecker.m81303a(this.f23540j.mo37478f())) {
            this.f23540j.mo37478f().mo36918p0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m38937S(dol dolVar) {
        this.f23538h = dolVar.getUser();
        this.f23539i = dolVar.mo37480h();
        this.f23540j = dolVar;
        if (dolVar.mo37477e() && !this.f23541k) {
            this.f23541k = true;
            zvf0.m220368A("e_moment", "p_suggest_users_home_view", new j760("moment_id", NullChecker.m81303a(this.f23539i) ? this.f23539i.f56008id : ""), new j760("owner_id", this.f23538h.f56011id));
        }
        xdl0.m208344M(this.f23535e, NullChecker.m81304b(this.f23539i) && !TextUtils.isEmpty(this.f23539i.value));
        this.f23535e.setOnHeightChangeListener(this.f23542l);
        this.f23536f.m79200L(false);
        this.f23536f.m79201M(this.f23539i.value);
        this.f23536f.m79199K(Color.parseColor("#99ffffff"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38935Q(this);
        this.f23537g = (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f23536f.m79192D()) {
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
