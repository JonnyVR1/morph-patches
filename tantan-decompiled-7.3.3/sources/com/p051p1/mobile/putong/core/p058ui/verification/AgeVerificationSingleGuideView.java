package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dc0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class AgeVerificationSingleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f37479c;

    /* JADX INFO: renamed from: d */
    public VText f37480d;

    /* JADX INFO: renamed from: e */
    public VText f37481e;

    public AgeVerificationSingleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m57160S(View view) {
        dc0.m115182a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m57161T(Boolean bool, final x20 x20Var, final x20 x20Var2) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f37481e;
        if (zBooleanValue) {
            bnl0.m105524M(vText, false);
            this.f37479c.setText(R$string.f18804Qr);
            this.f37480d.setText(R$string.f19005Xi);
            bnl0.m105509E0(this.f37480d, new View.OnClickListener() { // from class: l.ac0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var.call();
                }
            });
            return;
        }
        bnl0.m105524M(vText, true);
        this.f37479c.setText(R$string.f18440F);
        this.f37480d.setText(R$string.f18409E);
        bnl0.m105509E0(this.f37480d, new View.OnClickListener() { // from class: l.bc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f37481e, new View.OnClickListener() { // from class: l.cc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57160S(this);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
