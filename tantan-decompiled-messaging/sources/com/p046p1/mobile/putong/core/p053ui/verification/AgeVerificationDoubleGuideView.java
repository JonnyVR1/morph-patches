package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.x2c0;
import p149l.xb0;
import p149l.xdl0;
import p149l.zb0;

/* JADX INFO: loaded from: classes9.dex */
public class AgeVerificationDoubleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f36625c;

    /* JADX INFO: renamed from: d */
    public VImage f36626d;

    /* JADX INFO: renamed from: e */
    public VText f36627e;

    /* JADX INFO: renamed from: f */
    public VText f36628f;

    /* JADX INFO: renamed from: g */
    public VText f36629g;

    /* JADX INFO: renamed from: h */
    public VText f36630h;

    public AgeVerificationDoubleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public final void m55972R(View view) {
        xb0.m207686a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m55973S(final d30 d30Var, final d30 d30Var2) {
        if (zb0.m217808e() || zb0.m217807d()) {
            this.f36628f.setText(R$string.f17585Ai);
            this.f36627e.setTextColor(Color.parseColor("#212121"));
            boolean zM217807d = zb0.m217807d();
            VText vText = this.f36625c;
            if (zM217807d) {
                xdl0.m208344M(vText, true);
            } else {
                xdl0.m208344M(vText, false);
            }
            this.f36626d.setImageResource(x2c0.f190250j);
            this.f36629g.setText(R$string.f18987us);
        } else {
            this.f36628f.setText("");
            this.f36627e.setTextColor(Color.parseColor("#bfbfbf"));
            xdl0.m208344M(this.f36625c, false);
            this.f36626d.setImageResource(x2c0.f190282k);
            this.f36629g.setText(R$string.f17686E);
        }
        xdl0.m208329E0(this.f36629g, new View.OnClickListener() { // from class: l.vb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f36630h, new View.OnClickListener() { // from class: l.wb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55972R(this);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
