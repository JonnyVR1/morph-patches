package com.p046p1.mobile.putong.core.p053ui.fakecard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VDraweeView;
import p149l.d30;
import p149l.le7;
import p149l.qib0;
import p149l.uwf;

/* JADX INFO: loaded from: classes10.dex */
public class FakeDailogCard extends CardView {

    /* JADX INFO: renamed from: a */
    public FakeDailogCard f29157a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f29158b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29159c;

    /* JADX INFO: renamed from: d */
    public ImageView f29160d;

    /* JADX INFO: renamed from: e */
    public TextView f29161e;

    /* JADX INFO: renamed from: f */
    public TextView f29162f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f29163g;

    /* JADX INFO: renamed from: h */
    public TextView f29164h;

    public FakeDailogCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m45387e(View view) {
        uwf.m196128a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m45388f(final d30 d30Var) {
        qib0.f154691G.m102331L0(this.f29159c, "https://auto.tancdn.com/v1/images/eyJpZCI6IlE0RlNZSklHVFdTSEM0QVAyWUdZREMyN0VBNVNKVTEzIiwidyI6MTA3NywiaCI6MTgwMCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEzODM1MDU4MDk4MjMxODY5NTM2fQ.png");
        qib0.f154691G.m102331L0(this.f29163g, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFPRjVPREU0S1VaRUJISkxORjc0Q0RRRlVWUTMzUDEzIiwidyI6MTA3NywiaCI6ODU5LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA4MTAzNTM0NjQyODYzMTY0NjZ9.png");
        this.f29164h.setOnClickListener(new View.OnClickListener() { // from class: l.qwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (le7.m149486h() || !IntlCountryCodeController.m28126v()) {
            return;
        }
        this.f29157a.setRadius(0.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45387e(this);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FakeDailogCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
