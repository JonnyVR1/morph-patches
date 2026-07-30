package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.qa00;
import p153l.s1g0;
import p153l.t1g0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryItemView f51604d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51605e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51606f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51607g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f51608h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51609i;

    /* JADX INFO: renamed from: j */
    public TextView f51610j;

    public StarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76126h0(View view) {
        s1g0.m184046a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final VDraweeView m76127i0(int i) {
        if (i == 0) {
            return this.f51609i;
        }
        if (i == 1) {
            return this.f51608h;
        }
        if (i == 2) {
            return this.f51607g;
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m76128j0(t1g0 t1g0Var) {
        this.f51610j.setText(t1g0Var.f171668b);
        izs.m142869t("context_livingAct", this.f51605e, t1g0Var.f171667a, qa00.f156327n);
        if (jyb.m147479J(t1g0Var.f171669c)) {
            bnl0.m105524M(this.f51609i, false);
            bnl0.m105524M(this.f51608h, false);
            bnl0.m105524M(this.f51607g, false);
            return;
        }
        for (int i = 0; i < 3; i++) {
            VDraweeView vDraweeViewM76127i0 = m76127i0(i);
            if (i >= t1g0Var.f171669c.size()) {
                bnl0.m105524M(vDraweeViewM76127i0, false);
            } else {
                bnl0.m105524M(vDraweeViewM76127i0, true);
                izs.m142869t("context_livingAct", vDraweeViewM76127i0, t1g0Var.f171669c.get(i), qa00.f156326m);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76126h0(this);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
