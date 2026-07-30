package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.R$string;
import l.d30;
import l.xb0;
import l.xdl0;
import p006l.x2c0;
import p006l.zb0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AgeVerificationDoubleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f6406c;

    /* JADX INFO: renamed from: d */
    public VImage f6407d;

    /* JADX INFO: renamed from: e */
    public VText f6408e;

    /* JADX INFO: renamed from: f */
    public VText f6409f;

    /* JADX INFO: renamed from: g */
    public VText f6410g;

    /* JADX INFO: renamed from: h */
    public VText f6411h;

    public AgeVerificationDoubleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public final void m9388R(View view) {
        xb0.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m9389S(final d30 d30Var, final d30 d30Var2) {
        if (zb0.m28638e() || zb0.m28637d()) {
            this.f6409f.setText(R$string.f1574Ai);
            this.f6408e.setTextColor(Color.parseColor("#212121"));
            boolean zM28637d = zb0.m28637d();
            VText vText = this.f6406c;
            if (zM28637d) {
                xdl0.M(vText, true);
            } else {
                xdl0.M(vText, false);
            }
            this.f6407d.setImageResource(x2c0.f26786j);
            this.f6410g.setText(R$string.f2976us);
        } else {
            this.f6409f.setText("");
            this.f6408e.setTextColor(Color.parseColor("#bfbfbf"));
            xdl0.M(this.f6406c, false);
            this.f6407d.setImageResource(x2c0.f26818k);
            this.f6410g.setText(R$string.f1675E);
        }
        xdl0.E0(this.f6410g, new View.OnClickListener() { // from class: l.vb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.E0(this.f6411h, new View.OnClickListener() { // from class: l.wb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9388R(this);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
