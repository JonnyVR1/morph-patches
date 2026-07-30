package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.hxs;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.jtf0;
import p002l.ktf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class StarBoardEntryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryItemView f6798d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6799e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f6800f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6801g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6802h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f6803i;

    /* JADX INFO: renamed from: j */
    public TextView f6804j;

    public StarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8547h0(View view) {
        jtf0.m16224a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final VDraweeView m8548i0(int i) {
        if (i == 0) {
            return this.f6803i;
        }
        if (i == 1) {
            return this.f6802h;
        }
        if (i == 2) {
            return this.f6801g;
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m8549j0(ktf0 ktf0Var) {
        this.f6804j.setText(ktf0Var.f14508b);
        hxs.t("context_livingAct", this.f6799e, ktf0Var.f14507a, t100.n);
        if (vwb.J(ktf0Var.f14509c)) {
            xdl0.M(this.f6803i, false);
            xdl0.M(this.f6802h, false);
            xdl0.M(this.f6801g, false);
            return;
        }
        for (int i = 0; i < 3; i++) {
            VDraweeView vDraweeViewM8548i0 = m8548i0(i);
            if (i >= ktf0Var.f14509c.size()) {
                xdl0.M(vDraweeViewM8548i0, false);
            } else {
                xdl0.M(vDraweeViewM8548i0, true);
                hxs.t("context_livingAct", vDraweeViewM8548i0, ktf0Var.f14509c.get(i), t100.m);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8547h0(this);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
