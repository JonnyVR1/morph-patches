package com.p051p1.mobile.putong.core.p058ui.growth.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.growth.views.GrowthSpamDlgView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.cuk;
import p153l.fsj0;
import p153l.i4g0;
import p153l.lyh0;
import p153l.psd0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GrowthSpamDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public GrowthSpamDlgView f30414c;

    /* JADX INFO: renamed from: d */
    public VFrame f30415d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30416e;

    /* JADX INFO: renamed from: f */
    public VImage f30417f;

    /* JADX INFO: renamed from: g */
    public VText f30418g;

    /* JADX INFO: renamed from: h */
    public VText f30419h;

    /* JADX INFO: renamed from: i */
    public VLinear f30420i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f30421j;

    /* JADX INFO: renamed from: k */
    public TextView f30422k;

    /* JADX INFO: renamed from: l */
    public VButton f30423l;

    /* JADX INFO: renamed from: m */
    public VButton f30424m;

    /* JADX INFO: renamed from: n */
    public VText f30425n;

    public GrowthSpamDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m47185P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m47186Q(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(AccessTokenMkWebViewAct.m81366u2(act, "我的客服", str, true, false, false, true, true, null));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m47187R(final Act act) {
        i4g0.m138520r("e_face_verified_nojump_failed_help", "p_face_verified_nojump_failed");
        act.duringCreated(CoreModule.f18264c.f20344R1.m177733d3(FirebaseAnalytics.Param.INDEX)).subscribe(psd0.m173597H(new y20() { // from class: l.auk
            @Override // p153l.y20
            public final void call(Object obj) {
                GrowthSpamDlgView.m47186Q(act, (String) obj);
            }
        }, new y20() { // from class: l.buk
            @Override // p153l.y20
            public final void call(Object obj) {
                GrowthSpamDlgView.m47185P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m47188S(View view) {
        cuk.m112691a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m47189T() {
        return this.f30414c == null || this.f30415d == null || this.f30416e == null || this.f30417f == null || this.f30418g == null || this.f30419h == null || this.f30423l == null || this.f30424m == null || this.f30425n == null || this.f30420i == null || this.f30421j == null || this.f30422k == null;
    }

    /* JADX INFO: renamed from: V */
    public void m47190V(boolean z) {
        this.f30418g.setTypeface(lyh0.m156283c(3));
        this.f30425n.setTypeface(lyh0.m156283c(3));
        this.f30423l.setTypeface(lyh0.m156283c(3));
        this.f30424m.setTypeface(lyh0.m156283c(3));
        this.f30422k.setTypeface(lyh0.m156283c(3));
        this.f30425n.setText(z ? "稍后认证" : "登出账号");
        uqb0.f180374G.m127111J0(this.f30416e, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profile180(), false);
    }

    /* JADX INFO: renamed from: W */
    public void m47191W(final Act act, boolean z) {
        if (act == null || m47189T()) {
            return;
        }
        this.f30423l.setText(z ? "重新认证" : "立即认证");
        this.f30418g.setText(z ? "真实头像认证失败" : "真实头像认证");
        this.f30419h.setText(z ? "你的头像没有完整露出清晰面部或提交认证者不是同一人，请重新认证，如有问题请联系客服。" : "探探要求用户提供真实照片来保证平台和用户安全。防止假照，交流更真诚。");
        bnl0.m105524M(this.f30420i, !z);
        bnl0.m105524M(this.f30424m, z);
        if (z) {
            fsj0.m127199a(this.f30419h, "联系客服", Color.parseColor("#FE7E1D"), new x20() { // from class: l.ztk
                @Override // p153l.x20
                public final void call() {
                    GrowthSpamDlgView.m47187R(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public void m47192X(boolean z, boolean z2, String str) {
        if (z) {
            i4g0.m138526x("e_face_verified_jump_confirm", str);
            i4g0.m138526x("e_face_verified_jump_cancel", str);
        } else if (!z2) {
            i4g0.m138526x("e_face_verified_nojump_confirm", str);
            i4g0.m138526x("e_face_verified_nojump_signout", str);
        } else {
            i4g0.m138526x("e_face_verified_nojump_failed_changeavatar", str);
            i4g0.m138526x("e_face_verified_nojump_failed_signout", str);
            i4g0.m138526x("e_face_verified_nojump_failed_help", str);
            i4g0.m138526x("e_face_verified_nojump_failed_reverified", str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47188S(this);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
