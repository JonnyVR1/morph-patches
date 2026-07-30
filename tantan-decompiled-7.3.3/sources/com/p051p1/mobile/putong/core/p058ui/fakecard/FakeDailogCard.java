package com.p051p1.mobile.putong.core.p058ui.fakecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VDraweeView;
import p153l.iyf;
import p153l.pf7;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class FakeDailogCard extends CardView {

    /* JADX INFO: renamed from: a */
    public FakeDailogCard f30005a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f30006b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30007c;

    /* JADX INFO: renamed from: d */
    public ImageView f30008d;

    /* JADX INFO: renamed from: e */
    public TextView f30009e;

    /* JADX INFO: renamed from: f */
    public TextView f30010f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f30011g;

    /* JADX INFO: renamed from: h */
    public TextView f30012h;

    public FakeDailogCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m46570e(View view) {
        iyf.m142654a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m46571f(final x20 x20Var) {
        uqb0.f180374G.m127115L0(this.f30007c, "https://auto.tancdn.com/v1/images/eyJpZCI6IlE0RlNZSklHVFdTSEM0QVAyWUdZREMyN0VBNVNKVTEzIiwidyI6MTA3NywiaCI6MTgwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzODM1MDU4MDk4MjMxODY5NTM2fQ.png");
        uqb0.f180374G.m127115L0(this.f30011g, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFPRjVPREU0S1VaRUJISkxORjc0Q0RRRlVWUTMzUDEzIiwidyI6MTA3NywiaCI6ODU5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MTAzNTM0NjQyODYzMTY0NjZ9.png");
        this.f30012h.setOnClickListener(new View.OnClickListener() { // from class: l.eyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        if (pf7.m172093h() || !IntlCountryCodeController.m29125v()) {
            return;
        }
        this.f30005a.setRadius(0.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46570e(this);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
