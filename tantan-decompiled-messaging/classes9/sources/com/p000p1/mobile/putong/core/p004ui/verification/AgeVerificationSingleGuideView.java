package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.R$string;
import l.d30;
import l.hc0;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AgeVerificationSingleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f6412c;

    /* JADX INFO: renamed from: d */
    public VText f6413d;

    /* JADX INFO: renamed from: e */
    public VText f6414e;

    public AgeVerificationSingleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m9393S(View view) {
        hc0.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m9394T(Boolean bool, final d30 d30Var, final d30 d30Var2) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f6414e;
        if (zBooleanValue) {
            xdl0.M(vText, false);
            this.f6412c.setText(R$string.f2975ur);
            this.f6413d.setText(R$string.f1604Bi);
            xdl0.E0(this.f6413d, new View.OnClickListener() { // from class: l.ec0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
            return;
        }
        xdl0.M(vText, true);
        this.f6412c.setText(R$string.f1705F);
        this.f6413d.setText(R$string.f1675E);
        xdl0.E0(this.f6413d, new View.OnClickListener() { // from class: l.fc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.E0(this.f6414e, new View.OnClickListener() { // from class: l.gc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9393S(this);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
