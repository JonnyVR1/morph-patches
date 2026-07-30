package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.dc70;
import l.eqh0;
import l.j760;
import l.osi0;
import l.qp4;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PicCertGuideView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public PicCertGuideView f5737d;

    /* JADX INFO: renamed from: e */
    public VImage f5738e;

    /* JADX INFO: renamed from: f */
    public VText f5739f;

    /* JADX INFO: renamed from: g */
    public VText f5740g;

    /* JADX INFO: renamed from: h */
    public String f5741h;

    /* JADX INFO: renamed from: i */
    public String f5742i;

    /* JADX INFO: renamed from: j */
    public String f5743j;

    public PicCertGuideView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7998i0(View view) {
        dc70.a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m7999j0(Act act, Runnable runnable, View view) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
        } else if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
        } else {
            qp4.q(act);
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        zvf0.u(this.f5741h, this.f5742i, new j760[]{TextUtils.isEmpty(this.f5743j) ? null : vwb.Y("receiver_user_id", this.f5743j)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m8000k0(final Act act, String str, String str2, String str3, String str4, String str5, final Runnable runnable) {
        this.f5741h = str3;
        this.f5742i = str4;
        this.f5743j = str5;
        this.f5739f.setText(str);
        this.f5740g.setText(str2);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.cc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10511a.m7999j0(act, runnable, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m8001l0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f5743j);
        String str = this.f5741h;
        if (zIsEmpty) {
            zvf0.x(str, this.f5742i);
        } else {
            zvf0.A(str, this.f5742i, new j760[]{vwb.Y("receiver_user_id", this.f5743j)});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7998i0(this);
        this.f5739f.setTypeface(eqh0.c(3), 1);
        this.f5740g.setTypeface(eqh0.c(3), 1);
        if (upa.z()) {
            this.f5738e.setImageResource(x2c0.qh);
        }
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
