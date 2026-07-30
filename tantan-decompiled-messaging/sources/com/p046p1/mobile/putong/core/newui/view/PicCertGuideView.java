package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.dc70;
import p149l.eqh0;
import p149l.osi0;
import p149l.qp4;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class PicCertGuideView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public PicCertGuideView f26959d;

    /* JADX INFO: renamed from: e */
    public VImage f26960e;

    /* JADX INFO: renamed from: f */
    public VText f26961f;

    /* JADX INFO: renamed from: g */
    public VText f26962g;

    /* JADX INFO: renamed from: h */
    public String f26963h;

    /* JADX INFO: renamed from: i */
    public String f26964i;

    /* JADX INFO: renamed from: j */
    public String f26965j;

    public PicCertGuideView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m43734i0(View view) {
        dc70.m110671a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m43735j0(Act act, Runnable runnable, View view) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
        } else if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
        } else {
            qp4.m175811q(act);
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        zvf0.m220399u(this.f26963h, this.f26964i, TextUtils.isEmpty(this.f26965j) ? null : vwb.m200311Y("receiver_user_id", this.f26965j));
    }

    /* JADX INFO: renamed from: k0 */
    public void m43736k0(final Act act, String str, String str2, String str3, String str4, String str5, final Runnable runnable) {
        this.f26963h = str3;
        this.f26964i = str4;
        this.f26965j = str5;
        this.f26961f.setText(str);
        this.f26962g.setText(str2);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.cc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80210a.m43735j0(act, runnable, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m43737l0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f26965j);
        String str = this.f26963h;
        if (zIsEmpty) {
            zvf0.m220402x(str, this.f26964i);
        } else {
            zvf0.m220368A(str, this.f26964i, vwb.m200311Y("receiver_user_id", this.f26965j));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43734i0(this);
        this.f26961f.setTypeface(eqh0.m117752c(3), 1);
        this.f26962g.setTypeface(eqh0.m117752c(3), 1);
        if (upa.m194847z()) {
            this.f26960e.setImageResource(x2c0.f190492qh);
        }
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
