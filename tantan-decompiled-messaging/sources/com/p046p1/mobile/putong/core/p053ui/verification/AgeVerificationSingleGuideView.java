package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.hc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AgeVerificationSingleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f36631c;

    /* JADX INFO: renamed from: d */
    public VText f36632d;

    /* JADX INFO: renamed from: e */
    public VText f36633e;

    public AgeVerificationSingleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public final void m55977S(View view) {
        hc0.m130366a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public void m55978T(Boolean bool, final d30 d30Var, final d30 d30Var2) {
        boolean zBooleanValue = bool.booleanValue();
        VText vText = this.f36633e;
        if (zBooleanValue) {
            xdl0.m208344M(vText, false);
            this.f36631c.setText(R$string.f18986ur);
            this.f36632d.setText(R$string.f17615Bi);
            xdl0.m208329E0(this.f36632d, new View.OnClickListener() { // from class: l.ec0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
            return;
        }
        xdl0.m208344M(vText, true);
        this.f36631c.setText(R$string.f17716F);
        this.f36632d.setText(R$string.f17686E);
        xdl0.m208329E0(this.f36632d, new View.OnClickListener() { // from class: l.fc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f36633e, new View.OnClickListener() { // from class: l.gc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55977S(this);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationSingleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
