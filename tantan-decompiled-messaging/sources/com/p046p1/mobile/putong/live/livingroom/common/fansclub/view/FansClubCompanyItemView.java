package com.p046p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.edg;
import p149l.f5g;
import p149l.hxs;
import p149l.i3c0;
import p149l.j5g;
import p149l.lsi0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubCompanyItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubCompanyItemView f49017d;

    /* JADX INFO: renamed from: e */
    public VImage f49018e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49019f;

    /* JADX INFO: renamed from: g */
    public VText f49020g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49021h;

    /* JADX INFO: renamed from: i */
    public VText f49022i;

    /* JADX INFO: renamed from: j */
    public VText f49023j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f49024k;

    /* JADX INFO: renamed from: l */
    public VImage f49025l;

    /* JADX INFO: renamed from: m */
    public VText f49026m;

    /* JADX INFO: renamed from: n */
    public VText f49027n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f49028o;

    public FansClubCompanyItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m72860h0(j5g j5gVar, String str, BLiveAccommpanyTasks bLiveAccommpanyTasks, int i, View view) {
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = bLiveAccommpanyTasks.rule;
        edg.m115806k(j5gVar, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount);
        j5gVar.m139864i4(bLiveAccommpanyTasks, str, i);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m72861i0(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks, View view) {
        if (!z) {
            lsi0.m151578h(R$string.f47425o4);
        } else {
            if ("done".equals(bLiveAccommpanyTasks.status)) {
                return;
            }
            lsi0.m151578h(R$string.f47447p4);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m72862m0() {
        xdl0.m208344M(this.f49018e, false);
        xdl0.m208344M(this.f49019f, false);
        xdl0.m208344M(this.f49020g, false);
        xdl0.m208344M(this.f49021h, false);
        xdl0.m208344M(this.f49022i, false);
        xdl0.m208344M(this.f49018e, false);
        xdl0.m208344M(this.f49024k, false);
        xdl0.m208344M(this.f49025l, false);
        xdl0.m208344M(this.f49026m, false);
        xdl0.m208344M(this.f49027n, false);
        xdl0.m208344M(this.f49028o, false);
        xdl0.m208344M(this.f49023j, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m72863j0(View view) {
        f5g.m119494a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m72864k0() {
        m72862m0();
        xdl0.m208344M(this.f49018e, true);
        xdl0.m208344M(this.f49026m, true);
        this.f49018e.setBackgroundResource(i3c0.f110807O1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m72865l0(final BLiveAccommpanyTasks bLiveAccommpanyTasks, final j5g j5gVar, final boolean z, final String str, final int i) {
        xdl0.m208344M(this.f49026m, false);
        xdl0.m208344M(this.f49018e, true);
        this.f49018e.setBackgroundResource(i3c0.f110795N1);
        if (!TextUtils.isEmpty(bLiveAccommpanyTasks.iconUrl)) {
            xdl0.m208344M(this.f49021h, true);
            hxs.m133407t("context_single_room", this.f49021h, bLiveAccommpanyTasks.iconUrl, t100.f167266o);
        }
        xdl0.m208344M(this.f49023j, true);
        this.f49023j.setText(bLiveAccommpanyTasks.btnText);
        if ("done".equals(bLiveAccommpanyTasks.status)) {
            this.f49023j.setEnabled(false);
            this.f49023j.setBackground(yb2.m213880e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(15.0f), false));
        } else {
            boolean zM206032L2 = j5gVar.m206032L2();
            VText vText = this.f49023j;
            if (zM206032L2) {
                vText.setEnabled(false);
                this.f49023j.setBackground(yb2.m213880e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(15.0f), false));
            } else {
                vText.setEnabled(true);
                this.f49023j.setBackground(yb2.m213880e(new int[]{-27267, -302466}, GradientDrawable.Orientation.LEFT_RIGHT, t100.m186890d(15.0f), false));
                xdl0.m208329E0(this.f49023j, new View.OnClickListener() { // from class: l.d5g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FansClubCompanyItemView.m72860h0(j5gVar, str, bLiveAccommpanyTasks, i, view);
                    }
                });
            }
        }
        boolean z2 = bLiveAccommpanyTasks.awardReceived;
        VDraweeView vDraweeView = this.f49024k;
        if (z2) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f49025l, false);
            if (!vwb.m200296J(bLiveAccommpanyTasks.awards)) {
                xdl0.m208344M(this.f49028o, true);
                xdl0.m208344M(this.f49027n, true);
                hxs.m133406s("context_single_room", this.f49028o, bLiveAccommpanyTasks.awards.get(0).icon);
                this.f49027n.setText(bLiveAccommpanyTasks.awards.get(0).name);
            }
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f49025l, !z);
            xdl0.m208344M(this.f49028o, false);
            xdl0.m208344M(this.f49027n, false);
            if (!vwb.m200296J(bLiveAccommpanyTasks.awards)) {
                hxs.m133407t("context_single_room", this.f49024k, bLiveAccommpanyTasks.awards.get(0).icon, t100.f167275x);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveAccommpanyTasks.rule.giftIcon);
        VDraweeView vDraweeView2 = this.f49019f;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            hxs.m133407t("context_single_room", this.f49019f, bLiveAccommpanyTasks.rule.giftIcon, t100.f167234I);
        }
        xdl0.m208344M(this.f49020g, true);
        this.f49020g.setText(bLiveAccommpanyTasks.title);
        this.f49022i.setText(bLiveAccommpanyTasks.desc);
        if (j5gVar.m206032L2()) {
            return;
        }
        xdl0.m208329E0(this.f49024k, new View.OnClickListener() { // from class: l.e5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansClubCompanyItemView.m72861i0(z, bLiveAccommpanyTasks, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72863j0(this);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
