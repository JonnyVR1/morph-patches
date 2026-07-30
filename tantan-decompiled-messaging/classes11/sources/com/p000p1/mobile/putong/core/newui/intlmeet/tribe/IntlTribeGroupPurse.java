package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.TribeSubsetContent;
import l.cep;
import l.qib0;
import l.vwb;
import l.xdl0;
import p009l.oho;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeGroupPurse extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3047a;

    /* JADX INFO: renamed from: b */
    public VLinear f3048b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f3049c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f3050d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f3051e;

    /* JADX INFO: renamed from: f */
    public VLinear f3052f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f3053g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f3054h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f3055i;

    public IntlTribeGroupPurse(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3502p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3502p(View view) {
        cep.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m3503s(TribeSubsetContent tribeSubsetContent, oho ohoVar) {
        if (tribeSubsetContent == null) {
            return;
        }
        qib0.G.L0(this.f3047a, tribeSubsetContent.coverUrl);
        qib0.G.L0(this.f3050d, tribeSubsetContent.icon);
        this.f3051e.setText(tribeSubsetContent.title);
        boolean zJ = vwb.J(tribeSubsetContent.profilePhoto);
        AutoVDraweeView autoVDraweeView = this.f3053g;
        if (zJ) {
            xdl0.M(autoVDraweeView, false);
            xdl0.M(this.f3054h, false);
            xdl0.M(this.f3052f, false);
        } else {
            autoVDraweeView.setImageUrl((String) tribeSubsetContent.profilePhoto.get(0));
            xdl0.M(this.f3053g, true);
            int size = tribeSubsetContent.profilePhoto.size();
            AutoVDraweeView autoVDraweeView2 = this.f3054h;
            if (size >= 2) {
                autoVDraweeView2.setImageUrl((String) tribeSubsetContent.profilePhoto.get(1));
                xdl0.M(this.f3054h, true);
            } else {
                xdl0.M(autoVDraweeView2, false);
            }
            xdl0.M(this.f3052f, true);
        }
        int i = tribeSubsetContent.totalCount;
        VText_NoTopPadding vText_NoTopPadding = this.f3055i;
        if (i >= 2) {
            vText_NoTopPadding.setText(ohoVar.m19793t0(i, false));
            xdl0.M(this.f3055i, true);
        } else {
            xdl0.M(vText_NoTopPadding, false);
        }
        this.f3049c.setText(ohoVar.m19793t0(tribeSubsetContent.currentLikeMe, true));
        xdl0.M(this.f3048b, tribeSubsetContent.currentLikeMe > 0);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlTribeGroupPurse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
