package com.p051p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.jyb;
import p153l.o1j0;
import p153l.obc0;
import p153l.qa00;
import p153l.seg;
import p153l.t6g;
import p153l.x6g;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubCompanyItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubCompanyItemView f49865d;

    /* JADX INFO: renamed from: e */
    public VImage f49866e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49867f;

    /* JADX INFO: renamed from: g */
    public VText f49868g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49869h;

    /* JADX INFO: renamed from: i */
    public VText f49870i;

    /* JADX INFO: renamed from: j */
    public VText f49871j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f49872k;

    /* JADX INFO: renamed from: l */
    public VImage f49873l;

    /* JADX INFO: renamed from: m */
    public VText f49874m;

    /* JADX INFO: renamed from: n */
    public VText f49875n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f49876o;

    public FansClubCompanyItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74043h0(x6g x6gVar, String str, BLiveAccommpanyTasks bLiveAccommpanyTasks, int i, View view) {
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = bLiveAccommpanyTasks.rule;
        seg.m185543k(x6gVar, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount);
        x6gVar.m209489i4(bLiveAccommpanyTasks, str, i);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m74044i0(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks, View view) {
        if (!z) {
            o1j0.m165634h(R$string.f48273o4);
        } else {
            if ("done".equals(bLiveAccommpanyTasks.status)) {
                return;
            }
            o1j0.m165634h(R$string.f48295p4);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m74045m0() {
        bnl0.m105524M(this.f49866e, false);
        bnl0.m105524M(this.f49867f, false);
        bnl0.m105524M(this.f49868g, false);
        bnl0.m105524M(this.f49869h, false);
        bnl0.m105524M(this.f49870i, false);
        bnl0.m105524M(this.f49866e, false);
        bnl0.m105524M(this.f49872k, false);
        bnl0.m105524M(this.f49873l, false);
        bnl0.m105524M(this.f49874m, false);
        bnl0.m105524M(this.f49875n, false);
        bnl0.m105524M(this.f49876o, false);
        bnl0.m105524M(this.f49871j, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74046j0(View view) {
        t6g.m189526a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74047k0() {
        m74045m0();
        bnl0.m105524M(this.f49866e, true);
        bnl0.m105524M(this.f49874m, true);
        this.f49866e.setBackgroundResource(obc0.f146135O1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m74048l0(final BLiveAccommpanyTasks bLiveAccommpanyTasks, final x6g x6gVar, final boolean z, final String str, final int i) {
        bnl0.m105524M(this.f49874m, false);
        bnl0.m105524M(this.f49866e, true);
        this.f49866e.setBackgroundResource(obc0.f146123N1);
        if (!TextUtils.isEmpty(bLiveAccommpanyTasks.iconUrl)) {
            bnl0.m105524M(this.f49869h, true);
            izs.m142869t("context_single_room", this.f49869h, bLiveAccommpanyTasks.iconUrl, qa00.f156328o);
        }
        bnl0.m105524M(this.f49871j, true);
        this.f49871j.setText(bLiveAccommpanyTasks.btnText);
        if ("done".equals(bLiveAccommpanyTasks.status)) {
            this.f49871j.setEnabled(false);
            this.f49871j.setBackground(fc2.m124975e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(15.0f), false));
        } else {
            boolean zM213815L2 = x6gVar.m213815L2();
            VText vText = this.f49871j;
            if (zM213815L2) {
                vText.setEnabled(false);
                this.f49871j.setBackground(fc2.m124975e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(15.0f), false));
            } else {
                vText.setEnabled(true);
                this.f49871j.setBackground(fc2.m124975e(new int[]{-27267, -302466}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.m175859d(15.0f), false));
                bnl0.m105509E0(this.f49871j, new View.OnClickListener() { // from class: l.r6g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FansClubCompanyItemView.m74043h0(x6gVar, str, bLiveAccommpanyTasks, i, view);
                    }
                });
            }
        }
        boolean z2 = bLiveAccommpanyTasks.awardReceived;
        VDraweeView vDraweeView = this.f49872k;
        if (z2) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f49873l, false);
            if (!jyb.m147479J(bLiveAccommpanyTasks.awards)) {
                bnl0.m105524M(this.f49876o, true);
                bnl0.m105524M(this.f49875n, true);
                izs.m142868s("context_single_room", this.f49876o, bLiveAccommpanyTasks.awards.get(0).icon);
                this.f49875n.setText(bLiveAccommpanyTasks.awards.get(0).name);
            }
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f49873l, !z);
            bnl0.m105524M(this.f49876o, false);
            bnl0.m105524M(this.f49875n, false);
            if (!jyb.m147479J(bLiveAccommpanyTasks.awards)) {
                izs.m142869t("context_single_room", this.f49872k, bLiveAccommpanyTasks.awards.get(0).icon, qa00.f156337x);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveAccommpanyTasks.rule.giftIcon);
        VDraweeView vDraweeView2 = this.f49867f;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            izs.m142869t("context_single_room", this.f49867f, bLiveAccommpanyTasks.rule.giftIcon, qa00.f156296I);
        }
        bnl0.m105524M(this.f49868g, true);
        this.f49868g.setText(bLiveAccommpanyTasks.title);
        this.f49870i.setText(bLiveAccommpanyTasks.desc);
        if (x6gVar.m213815L2()) {
            return;
        }
        bnl0.m105509E0(this.f49872k, new View.OnClickListener() { // from class: l.s6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansClubCompanyItemView.m74044i0(z, bLiveAccommpanyTasks, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74046j0(this);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
