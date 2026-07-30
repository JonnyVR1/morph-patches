package com.p000p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubCompanyItemView;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksAwards;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import l.hxs;
import l.lsi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yb2;
import p002l.edg;
import p002l.f5g;
import p002l.i3c0;
import p002l.j5g;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansClubCompanyItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FansClubCompanyItemView f5059d;

    /* JADX INFO: renamed from: e */
    public VImage f5060e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5061f;

    /* JADX INFO: renamed from: g */
    public VText f5062g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5063h;

    /* JADX INFO: renamed from: i */
    public VText f5064i;

    /* JADX INFO: renamed from: j */
    public VText f5065j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5066k;

    /* JADX INFO: renamed from: l */
    public VImage f5067l;

    /* JADX INFO: renamed from: m */
    public VText f5068m;

    /* JADX INFO: renamed from: n */
    public VText f5069n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f5070o;

    public FansClubCompanyItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m6379h0(j5g j5gVar, String str, BLiveAccommpanyTasks bLiveAccommpanyTasks, int i, View view) {
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = bLiveAccommpanyTasks.rule;
        edg.m12327k(j5gVar, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount);
        j5gVar.m15664i4(bLiveAccommpanyTasks, str, i);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m6380i0(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks, View view) {
        if (!z) {
            lsi0.h(R$string.f3467o4);
        } else {
            if ("done".equals(bLiveAccommpanyTasks.status)) {
                return;
            }
            lsi0.h(R$string.f3489p4);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m6381m0() {
        xdl0.M(this.f5060e, false);
        xdl0.M(this.f5061f, false);
        xdl0.M(this.f5062g, false);
        xdl0.M(this.f5063h, false);
        xdl0.M(this.f5064i, false);
        xdl0.M(this.f5060e, false);
        xdl0.M(this.f5066k, false);
        xdl0.M(this.f5067l, false);
        xdl0.M(this.f5068m, false);
        xdl0.M(this.f5069n, false);
        xdl0.M(this.f5070o, false);
        xdl0.M(this.f5065j, false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6382j0(View view) {
        f5g.m12947a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m6383k0() {
        m6381m0();
        xdl0.M(this.f5060e, true);
        xdl0.M(this.f5068m, true);
        this.f5060e.setBackgroundResource(i3c0.f12592O1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m6384l0(final BLiveAccommpanyTasks bLiveAccommpanyTasks, final j5g j5gVar, final boolean z, final String str, final int i) {
        xdl0.M(this.f5068m, false);
        xdl0.M(this.f5060e, true);
        this.f5060e.setBackgroundResource(i3c0.f12580N1);
        if (!TextUtils.isEmpty(bLiveAccommpanyTasks.iconUrl)) {
            xdl0.M(this.f5063h, true);
            hxs.t("context_single_room", this.f5063h, bLiveAccommpanyTasks.iconUrl, t100.o);
        }
        xdl0.M(this.f5065j, true);
        this.f5065j.setText(bLiveAccommpanyTasks.btnText);
        if ("done".equals(bLiveAccommpanyTasks.status)) {
            this.f5065j.setEnabled(false);
            this.f5065j.setBackground(yb2.e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(15.0f), false));
        } else {
            boolean zM25552L2 = j5gVar.m25552L2();
            VText vText = this.f5065j;
            if (zM25552L2) {
                vText.setEnabled(false);
                this.f5065j.setBackground(yb2.e(new int[]{1291818365, 1291543166}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(15.0f), false));
            } else {
                vText.setEnabled(true);
                this.f5065j.setBackground(yb2.e(new int[]{-27267, -302466}, GradientDrawable.Orientation.LEFT_RIGHT, t100.d(15.0f), false));
                xdl0.E0(this.f5065j, new View.OnClickListener() { // from class: l.d5g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FansClubCompanyItemView.m6379h0(j5gVar, str, bLiveAccommpanyTasks, i, view);
                    }
                });
            }
        }
        boolean z2 = bLiveAccommpanyTasks.awardReceived;
        VDraweeView vDraweeView = this.f5066k;
        if (z2) {
            xdl0.M(vDraweeView, false);
            xdl0.M(this.f5067l, false);
            if (!vwb.J(bLiveAccommpanyTasks.awards)) {
                xdl0.M(this.f5070o, true);
                xdl0.M(this.f5069n, true);
                hxs.s("context_single_room", this.f5070o, ((BLiveAccommpanyTasksAwards) bLiveAccommpanyTasks.awards.get(0)).icon);
                this.f5069n.setText(((BLiveAccommpanyTasksAwards) bLiveAccommpanyTasks.awards.get(0)).name);
            }
        } else {
            xdl0.M(vDraweeView, true);
            xdl0.M(this.f5067l, !z);
            xdl0.M(this.f5070o, false);
            xdl0.M(this.f5069n, false);
            if (!vwb.J(bLiveAccommpanyTasks.awards)) {
                hxs.t("context_single_room", this.f5066k, ((BLiveAccommpanyTasksAwards) bLiveAccommpanyTasks.awards.get(0)).icon, t100.x);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveAccommpanyTasks.rule.giftIcon);
        VDraweeView vDraweeView2 = this.f5061f;
        if (zIsEmpty) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            hxs.t("context_single_room", this.f5061f, bLiveAccommpanyTasks.rule.giftIcon, t100.I);
        }
        xdl0.M(this.f5062g, true);
        this.f5062g.setText(bLiveAccommpanyTasks.title);
        this.f5064i.setText(bLiveAccommpanyTasks.desc);
        if (j5gVar.m25552L2()) {
            return;
        }
        xdl0.E0(this.f5066k, new View.OnClickListener() { // from class: l.e5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FansClubCompanyItemView.m6380i0(z, bLiveAccommpanyTasks, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6382j0(this);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubCompanyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
