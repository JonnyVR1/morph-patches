package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.mqi0;
import p149l.qib0;
import p149l.s1f0;
import p149l.t100;
import p149l.upa;
import p149l.w0c0;
import p149l.w5b;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SidesSlipItemView f26731c;

    /* JADX INFO: renamed from: d */
    public View f26732d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f26733e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f26734f;

    /* JADX INFO: renamed from: g */
    public VText f26735g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f26736h;

    /* JADX INFO: renamed from: i */
    public VText f26737i;

    public SidesSlipItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m43491P(View view) {
        s1f0.m181960a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m43492Q(boolean z, SidesSlipItemData sidesSlipItemData, int i) {
        boolean zEquals = TextUtils.equals("分享", sidesSlipItemData.getTitle());
        boolean z2 = true;
        boolean z3 = (upa.m194669M2() && mqi0.m155944o() < CoreModule.f17545c.f19659k2.f184656R.get().longValue()) || mqi0.m155944o() < CoreModule.f17545c.f19659k2.f184663Y.get().longValue();
        if (z && !upa.m194795o2()) {
            View view = this.f26732d;
            if (!zEquals && i != 4) {
                z2 = false;
            }
            xdl0.m208344M(view, z2);
        } else if (z3 || upa.m194795o2()) {
            View view2 = this.f26732d;
            if (!zEquals && i != 3) {
                z2 = false;
            }
            xdl0.m208344M(view2, z2);
        } else {
            View view3 = this.f26732d;
            if (!zEquals && i != 2) {
                z2 = false;
            }
            xdl0.m208344M(view3, z2);
        }
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            qib0.f154691G.m102331L0(this.f26734f, sidesSlipItemData.getIconUrl());
        } else {
            this.f26734f.setImageResource(sidesSlipItemData.getNativeIcon());
        }
        if (upa.m194847z()) {
            this.f26735g.setTextColor(getResources().getColor(w0c0.f183899x));
            LinearLayout linearLayout = this.f26733e;
            if (i == 0) {
                xdl0.m208374f0(linearLayout, t100.f167259h);
            } else {
                xdl0.m208374f0(linearLayout, t100.f167260i);
            }
        }
        this.f26735g.setText(sidesSlipItemData.getTitle());
        xdl0.m208344M(this.f26736h, sidesSlipItemData.getShowDot().booleanValue());
        xdl0.m208344M(this.f26737i, false);
        if (TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            w5b.m201606r3(this.f26737i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43491P(this);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
