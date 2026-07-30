package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.jtf0;
import p149l.ktf0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryItemView f50756d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50757e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f50758f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50759g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50760h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f50761i;

    /* JADX INFO: renamed from: j */
    public TextView f50762j;

    public StarBoardEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74943h0(View view) {
        jtf0.m143101a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final VDraweeView m74944i0(int i) {
        if (i == 0) {
            return this.f50761i;
        }
        if (i == 1) {
            return this.f50760h;
        }
        if (i == 2) {
            return this.f50759g;
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m74945j0(ktf0 ktf0Var) {
        this.f50762j.setText(ktf0Var.f124583b);
        hxs.m133407t("context_livingAct", this.f50757e, ktf0Var.f124582a, t100.f167265n);
        if (vwb.m200296J(ktf0Var.f124584c)) {
            xdl0.m208344M(this.f50761i, false);
            xdl0.m208344M(this.f50760h, false);
            xdl0.m208344M(this.f50759g, false);
            return;
        }
        for (int i = 0; i < 3; i++) {
            VDraweeView vDraweeViewM74944i0 = m74944i0(i);
            if (i >= ktf0Var.f124584c.size()) {
                xdl0.m208344M(vDraweeViewM74944i0, false);
            } else {
                xdl0.m208344M(vDraweeViewM74944i0, true);
                hxs.m133407t("context_livingAct", vDraweeViewM74944i0, ktf0Var.f124584c.get(i), t100.f167264m);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74943h0(this);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarBoardEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
