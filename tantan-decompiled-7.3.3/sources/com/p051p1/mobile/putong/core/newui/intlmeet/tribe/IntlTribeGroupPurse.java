package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.cgp;
import p153l.jyb;
import p153l.ojo;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeGroupPurse extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25011a;

    /* JADX INFO: renamed from: b */
    public VLinear f25012b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f25013c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f25014d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f25015e;

    /* JADX INFO: renamed from: f */
    public VLinear f25016f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f25017g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f25018h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f25019i;

    public IntlTribeGroupPurse(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40451p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40451p(View view) {
        cgp.m109712a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m40452s(TribeSubsetContent tribeSubsetContent, ojo ojoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        uqb0.f180374G.m127115L0(this.f25011a, tribeSubsetContent.coverUrl);
        uqb0.f180374G.m127115L0(this.f25014d, tribeSubsetContent.icon);
        this.f25015e.setText(tribeSubsetContent.title);
        boolean zM147479J = jyb.m147479J(tribeSubsetContent.profilePhoto);
        AutoVDraweeView autoVDraweeView = this.f25017g;
        if (zM147479J) {
            bnl0.m105524M(autoVDraweeView, false);
            bnl0.m105524M(this.f25018h, false);
            bnl0.m105524M(this.f25016f, false);
        } else {
            autoVDraweeView.setImageUrl(tribeSubsetContent.profilePhoto.get(0));
            bnl0.m105524M(this.f25017g, true);
            int size = tribeSubsetContent.profilePhoto.size();
            AutoVDraweeView autoVDraweeView2 = this.f25018h;
            if (size >= 2) {
                autoVDraweeView2.setImageUrl(tribeSubsetContent.profilePhoto.get(1));
                bnl0.m105524M(this.f25018h, true);
            } else {
                bnl0.m105524M(autoVDraweeView2, false);
            }
            bnl0.m105524M(this.f25016f, true);
        }
        int i = tribeSubsetContent.totalCount;
        VText_NoTopPadding vText_NoTopPadding = this.f25019i;
        if (i >= 2) {
            vText_NoTopPadding.setText(ojoVar.m167897t0(i, false));
            bnl0.m105524M(this.f25019i, true);
        } else {
            bnl0.m105524M(vText_NoTopPadding, false);
        }
        this.f25013c.setText(ojoVar.m167897t0(tribeSubsetContent.currentLikeMe, true));
        bnl0.m105524M(this.f25012b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
