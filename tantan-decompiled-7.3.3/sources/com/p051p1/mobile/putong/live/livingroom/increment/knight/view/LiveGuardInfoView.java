package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.fts;
import p153l.fvk;
import p153l.izs;
import p153l.lsw;
import p153l.qa00;
import p153l.yau;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51272d;

    /* JADX INFO: renamed from: e */
    public VText f51273e;

    /* JADX INFO: renamed from: f */
    public VText f51274f;

    /* JADX INFO: renamed from: g */
    public View f51275g;

    /* JADX INFO: renamed from: h */
    public VText f51276h;

    /* JADX INFO: renamed from: i */
    public VText f51277i;

    /* JADX INFO: renamed from: j */
    public View f51278j;

    /* JADX INFO: renamed from: k */
    public VText f51279k;

    /* JADX INFO: renamed from: l */
    public VText f51280l;

    public LiveGuardInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75829h0(View view) {
        fts.m127399a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75830i0(lsw lswVar) {
        izs.m142870u("context_livingAct", this.f51272d, lswVar.f133468b, qa00.m175859d(54.0f), qa00.m175859d(54.0f));
        this.f51273e.setText(fvk.m127663n(lswVar.f133469c));
        this.f51276h.setText(yau.m214935c(lswVar.f133470d));
        this.f51279k.setText(yau.m214935c(lswVar.f133471e));
        long j = lswVar.f133469c;
        if (j > 100) {
            this.f51280l.setText(R$string.f47754Q2);
            return;
        }
        VText vText = this.f51280l;
        if (j == 1) {
            vText.setText(R$string.f47520F5);
        } else {
            vText.setText(R$string.f47775R2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75829h0(this);
    }

    public LiveGuardInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
