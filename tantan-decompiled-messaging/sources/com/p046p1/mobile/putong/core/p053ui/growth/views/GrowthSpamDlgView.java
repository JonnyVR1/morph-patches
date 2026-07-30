package com.p046p1.mobile.putong.core.p053ui.growth.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.growth.views.GrowthSpamDlgView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.cjj0;
import p149l.d30;
import p149l.e30;
import p149l.eqh0;
import p149l.mkd0;
import p149l.mrk;
import p149l.qib0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GrowthSpamDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public GrowthSpamDlgView f29566c;

    /* JADX INFO: renamed from: d */
    public VFrame f29567d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29568e;

    /* JADX INFO: renamed from: f */
    public VImage f29569f;

    /* JADX INFO: renamed from: g */
    public VText f29570g;

    /* JADX INFO: renamed from: h */
    public VText f29571h;

    /* JADX INFO: renamed from: i */
    public VLinear f29572i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f29573j;

    /* JADX INFO: renamed from: k */
    public TextView f29574k;

    /* JADX INFO: renamed from: l */
    public VButton f29575l;

    /* JADX INFO: renamed from: m */
    public VButton f29576m;

    /* JADX INFO: renamed from: n */
    public VText f29577n;

    public GrowthSpamDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m46002P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m46003Q(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(AccessTokenMkWebViewAct.m80183s2(act, "我的客服", str, true, false, false, true, true, null));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m46004R(final Act act) {
        zvf0.m220396r("e_face_verified_nojump_failed_help", "p_face_verified_nojump_failed");
        act.duringCreated(CoreModule.f17545c.f19602R1.m151139d3(FirebaseAnalytics.Param.INDEX)).subscribe(mkd0.m154956H(new e30() { // from class: l.krk
            @Override // p149l.e30
            public final void call(Object obj) {
                GrowthSpamDlgView.m46003Q(act, (String) obj);
            }
        }, new e30() { // from class: l.lrk
            @Override // p149l.e30
            public final void call(Object obj) {
                GrowthSpamDlgView.m46002P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m46005S(View view) {
        mrk.m156033a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m46006T() {
        return this.f29566c == null || this.f29567d == null || this.f29568e == null || this.f29569f == null || this.f29570g == null || this.f29571h == null || this.f29575l == null || this.f29576m == null || this.f29577n == null || this.f29572i == null || this.f29573j == null || this.f29574k == null;
    }

    /* JADX INFO: renamed from: V */
    public void m46007V(boolean z) {
        this.f29570g.setTypeface(eqh0.m117752c(3));
        this.f29577n.setTypeface(eqh0.m117752c(3));
        this.f29575l.setTypeface(eqh0.m117752c(3));
        this.f29576m.setTypeface(eqh0.m117752c(3));
        this.f29574k.setTypeface(eqh0.m117752c(3));
        this.f29577n.setText(z ? "稍后认证" : "登出账号");
        qib0.f154691G.m102327J0(this.f29568e, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profile180(), false);
    }

    /* JADX INFO: renamed from: W */
    public void m46008W(final Act act, boolean z) {
        if (act == null || m46006T()) {
            return;
        }
        this.f29575l.setText(z ? "重新认证" : "立即认证");
        this.f29570g.setText(z ? "真实头像认证失败" : "真实头像认证");
        this.f29571h.setText(z ? "你的头像没有完整露出清晰面部或提交认证者不是同一人，请重新认证，如有问题请联系客服。" : "探探要求用户提供真实照片来保证平台和用户安全。防止假照，交流更真诚。");
        xdl0.m208344M(this.f29572i, !z);
        xdl0.m208344M(this.f29576m, z);
        if (z) {
            cjj0.m107173a(this.f29571h, "联系客服", Color.parseColor("#FE7E1D"), new d30() { // from class: l.jrk
                @Override // p149l.d30
                public final void call() {
                    GrowthSpamDlgView.m46004R(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public void m46009X(boolean z, boolean z2, String str) {
        if (z) {
            zvf0.m220402x("e_face_verified_jump_confirm", str);
            zvf0.m220402x("e_face_verified_jump_cancel", str);
        } else if (!z2) {
            zvf0.m220402x("e_face_verified_nojump_confirm", str);
            zvf0.m220402x("e_face_verified_nojump_signout", str);
        } else {
            zvf0.m220402x("e_face_verified_nojump_failed_changeavatar", str);
            zvf0.m220402x("e_face_verified_nojump_failed_signout", str);
            zvf0.m220402x("e_face_verified_nojump_failed_help", str);
            zvf0.m220402x("e_face_verified_nojump_failed_reverified", str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46005S(this);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
