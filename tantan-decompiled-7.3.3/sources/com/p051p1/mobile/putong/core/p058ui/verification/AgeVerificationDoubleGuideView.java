package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.tb0;
import p153l.vb0;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class AgeVerificationDoubleGuideView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f37473c;

    /* JADX INFO: renamed from: d */
    public VImage f37474d;

    /* JADX INFO: renamed from: e */
    public VText f37475e;

    /* JADX INFO: renamed from: f */
    public VText f37476f;

    /* JADX INFO: renamed from: g */
    public VText f37477g;

    /* JADX INFO: renamed from: h */
    public VText f37478h;

    public AgeVerificationDoubleGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: R */
    public final void m57155R(View view) {
        tb0.m189965a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m57156S(final x20 x20Var, final x20 x20Var2) {
        if (vb0.m200643e() || vb0.m200642d()) {
            this.f37476f.setText(R$string.f18975Wi);
            this.f37475e.setTextColor(Color.parseColor("#212121"));
            boolean zM200642d = vb0.m200642d();
            VText vText = this.f37473c;
            if (zM200642d) {
                bnl0.m105524M(vText, true);
            } else {
                bnl0.m105524M(vText, false);
            }
            this.f37474d.setImageResource(dbc0.f87135k);
            this.f37477g.setText(R$string.f18805Qs);
        } else {
            this.f37476f.setText("");
            this.f37475e.setTextColor(Color.parseColor("#bfbfbf"));
            bnl0.m105524M(this.f37473c, false);
            this.f37474d.setImageResource(dbc0.f87168l);
            this.f37477g.setText(R$string.f18409E);
        }
        bnl0.m105509E0(this.f37477g, new View.OnClickListener() { // from class: l.rb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f37478h, new View.OnClickListener() { // from class: l.sb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57155R(this);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AgeVerificationDoubleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
