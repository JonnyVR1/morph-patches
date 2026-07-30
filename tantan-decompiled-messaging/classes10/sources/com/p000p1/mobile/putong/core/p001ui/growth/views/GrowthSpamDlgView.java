package com.p000p1.mobile.putong.core.p001ui.growth.views;

import android.content.Context;
import android.graphics.Color;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.growth.views.GrowthSpamDlgView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.ui.webview.mk.AccessTokenMkWebViewAct;
import l.cjj0;
import l.d30;
import l.e30;
import l.eqh0;
import l.mkd0;
import l.qib0;
import l.xdl0;
import l.zvf0;
import p003l.mrk;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GrowthSpamDlgView extends VLinear {

    /* JADX INFO: renamed from: c */
    public GrowthSpamDlgView f1960c;

    /* JADX INFO: renamed from: d */
    public VFrame f1961d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1962e;

    /* JADX INFO: renamed from: f */
    public VImage f1963f;

    /* JADX INFO: renamed from: g */
    public VText f1964g;

    /* JADX INFO: renamed from: h */
    public VText f1965h;

    /* JADX INFO: renamed from: i */
    public VLinear f1966i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f1967j;

    /* JADX INFO: renamed from: k */
    public TextView f1968k;

    /* JADX INFO: renamed from: l */
    public VButton f1969l;

    /* JADX INFO: renamed from: m */
    public VButton f1970m;

    /* JADX INFO: renamed from: n */
    public VText f1971n;

    public GrowthSpamDlgView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m3357P(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m3358Q(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(AccessTokenMkWebViewAct.s2(act, "我的客服", str, true, false, false, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m3359R(final Act act) {
        zvf0.r("e_face_verified_nojump_failed_help", "p_face_verified_nojump_failed");
        act.duringCreated(CoreModule.c.R1.d3("index")).subscribe(mkd0.H(new e30() { // from class: l.krk
            public final void call(Object obj) {
                GrowthSpamDlgView.m3358Q(act, (String) obj);
            }
        }, new e30() { // from class: l.lrk
            public final void call(Object obj) {
                GrowthSpamDlgView.m3357P((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m3360S(View view) {
        mrk.m8217a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m3361T() {
        return this.f1960c == null || this.f1961d == null || this.f1962e == null || this.f1963f == null || this.f1964g == null || this.f1965h == null || this.f1969l == null || this.f1970m == null || this.f1971n == null || this.f1966i == null || this.f1967j == null || this.f1968k == null;
    }

    /* JADX INFO: renamed from: V */
    public void m3362V(boolean z) {
        this.f1964g.setTypeface(eqh0.c(3));
        this.f1971n.setTypeface(eqh0.c(3));
        this.f1969l.setTypeface(eqh0.c(3));
        this.f1970m.setTypeface(eqh0.c(3));
        this.f1968k.setTypeface(eqh0.c(3));
        this.f1971n.setText(z ? "稍后认证" : "登出账号");
        qib0.G.J0(this.f1962e, CoreModule.c.e0.p9().fp().profile180(), false);
    }

    /* JADX INFO: renamed from: W */
    public void m3363W(final Act act, boolean z) {
        if (act == null || m3361T()) {
            return;
        }
        this.f1969l.setText(z ? "重新认证" : "立即认证");
        this.f1964g.setText(z ? "真实头像认证失败" : "真实头像认证");
        this.f1965h.setText(z ? "你的头像没有完整露出清晰面部或提交认证者不是同一人，请重新认证，如有问题请联系客服。" : "探探要求用户提供真实照片来保证平台和用户安全。防止假照，交流更真诚。");
        xdl0.M(this.f1966i, !z);
        xdl0.M(this.f1970m, z);
        if (z) {
            cjj0.a(this.f1965h, "联系客服", Color.parseColor("#FE7E1D"), new d30() { // from class: l.jrk
                public final void call() {
                    GrowthSpamDlgView.m3359R(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public void m3364X(boolean z, boolean z2, String str) {
        if (z) {
            zvf0.x("e_face_verified_jump_confirm", str);
            zvf0.x("e_face_verified_jump_cancel", str);
        } else if (!z2) {
            zvf0.x("e_face_verified_nojump_confirm", str);
            zvf0.x("e_face_verified_nojump_signout", str);
        } else {
            zvf0.x("e_face_verified_nojump_failed_changeavatar", str);
            zvf0.x("e_face_verified_nojump_failed_signout", str);
            zvf0.x("e_face_verified_nojump_failed_help", str);
            zvf0.x("e_face_verified_nojump_failed_reverified", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3360S(this);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GrowthSpamDlgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
