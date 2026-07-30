package com.p000p1.mobile.putong.core.p001ui.fakecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import l.d30;
import l.qib0;
import p003l.le7;
import p003l.uwf;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FakeDailogCard extends CardView {

    /* JADX INFO: renamed from: a */
    public FakeDailogCard f1551a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f1552b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1553c;

    /* JADX INFO: renamed from: d */
    public ImageView f1554d;

    /* JADX INFO: renamed from: e */
    public TextView f1555e;

    /* JADX INFO: renamed from: f */
    public TextView f1556f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f1557g;

    /* JADX INFO: renamed from: h */
    public TextView f1558h;

    public FakeDailogCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m2714e(View view) {
        uwf.m9789a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m2715f(final d30 d30Var) {
        qib0.G.L0(this.f1553c, "https://auto.tancdn.com/v1/images/eyJpZCI6IlE0RlNZSklHVFdTSEM0QVAyWUdZREMyN0VBNVNKVTEzIiwidyI6MTA3NywiaCI6MTgwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzODM1MDU4MDk4MjMxODY5NTM2fQ.png");
        qib0.G.L0(this.f1557g, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFPRjVPREU0S1VaRUJISkxORjc0Q0RRRlVWUTMzUDEzIiwidyI6MTA3NywiaCI6ODU5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MTAzNTM0NjQyODYzMTY0NjZ9.png");
        this.f1558h.setOnClickListener(new View.OnClickListener() { // from class: l.qwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (le7.m7727h() || !IntlCountryCodeController.v()) {
            return;
        }
        this.f1551a.setRadius(0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2714e(this);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
