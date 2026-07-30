package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.TribeSubsetContent;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.cep;
import p149l.oho;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupPurse extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24269a;

    /* JADX INFO: renamed from: b */
    public VLinear f24270b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f24271c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f24272d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f24273e;

    /* JADX INFO: renamed from: f */
    public VLinear f24274f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f24275g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f24276h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f24277i;

    public IntlTribeGroupPurse(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39448p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39448p(View view) {
        cep.m106344a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39449s(TribeSubsetContent tribeSubsetContent, oho ohoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        qib0.f154691G.m102331L0(this.f24269a, tribeSubsetContent.coverUrl);
        qib0.f154691G.m102331L0(this.f24272d, tribeSubsetContent.icon);
        this.f24273e.setText(tribeSubsetContent.title);
        boolean zM200296J = vwb.m200296J(tribeSubsetContent.profilePhoto);
        AutoVDraweeView autoVDraweeView = this.f24275g;
        if (zM200296J) {
            xdl0.m208344M(autoVDraweeView, false);
            xdl0.m208344M(this.f24276h, false);
            xdl0.m208344M(this.f24274f, false);
        } else {
            autoVDraweeView.setImageUrl(tribeSubsetContent.profilePhoto.get(0));
            xdl0.m208344M(this.f24275g, true);
            int size = tribeSubsetContent.profilePhoto.size();
            AutoVDraweeView autoVDraweeView2 = this.f24276h;
            if (size >= 2) {
                autoVDraweeView2.setImageUrl(tribeSubsetContent.profilePhoto.get(1));
                xdl0.m208344M(this.f24276h, true);
            } else {
                xdl0.m208344M(autoVDraweeView2, false);
            }
            xdl0.m208344M(this.f24274f, true);
        }
        int i = tribeSubsetContent.totalCount;
        VText_NoTopPadding vText_NoTopPadding = this.f24277i;
        if (i >= 2) {
            vText_NoTopPadding.setText(ohoVar.m164457t0(i, false));
            xdl0.m208344M(this.f24277i, true);
        } else {
            xdl0.m208344M(vText_NoTopPadding, false);
        }
        this.f24271c.setText(ohoVar.m164457t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.m208344M(this.f24270b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
