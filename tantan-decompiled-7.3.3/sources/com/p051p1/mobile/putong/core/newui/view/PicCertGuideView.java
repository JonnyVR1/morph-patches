package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jk70;
import p153l.jyb;
import p153l.lyh0;
import p153l.pq4;
import p153l.r1j0;

/* JADX INFO: loaded from: classes11.dex */
public class PicCertGuideView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public PicCertGuideView f27807d;

    /* JADX INFO: renamed from: e */
    public VImage f27808e;

    /* JADX INFO: renamed from: f */
    public VText f27809f;

    /* JADX INFO: renamed from: g */
    public VText f27810g;

    /* JADX INFO: renamed from: h */
    public String f27811h;

    /* JADX INFO: renamed from: i */
    public String f27812i;

    /* JADX INFO: renamed from: j */
    public String f27813j;

    public PicCertGuideView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m44920i0(View view) {
        jk70.m145156a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m44921j0(Act act, Runnable runnable, View view) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
        } else if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
        } else {
            pq4.m173309q(act);
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        i4g0.m138523u(this.f27811h, this.f27812i, TextUtils.isEmpty(this.f27813j) ? null : jyb.m147494Y("receiver_user_id", this.f27813j));
    }

    /* JADX INFO: renamed from: k0 */
    public void m44922k0(final Act act, String str, String str2, String str3, String str4, String str5, final Runnable runnable) {
        this.f27811h = str3;
        this.f27812i = str4;
        this.f27813j = str5;
        this.f27809f.setText(str);
        this.f27810g.setText(str2);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ik70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115341a.m44921j0(act, runnable, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m44923l0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f27813j);
        String str = this.f27811h;
        if (zIsEmpty) {
            i4g0.m138526x(str, this.f27812i);
        } else {
            i4g0.m138492A(str, this.f27812i, jyb.m147494Y("receiver_user_id", this.f27813j));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44920i0(this);
        this.f27809f.setTypeface(lyh0.m156283c(3), 1);
        this.f27810g.setTypeface(lyh0.m156283c(3), 1);
        if (gra.m131778z()) {
            this.f27808e.setImageResource(dbc0.f86958ei);
        }
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicCertGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
