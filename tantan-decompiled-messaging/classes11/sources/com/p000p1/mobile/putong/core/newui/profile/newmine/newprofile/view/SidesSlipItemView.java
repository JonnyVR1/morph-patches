package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p1.mobile.putong.core.CoreModule;
import l.qib0;
import l.s1f0;
import l.t100;
import l.upa;
import l.w0c0;
import l.w5b;
import l.xdl0;
import p009l.mqi0;
import v.VDraweeView;
import v.VLinear;
import v.VOnlineIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SidesSlipItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SidesSlipItemView f5509c;

    /* JADX INFO: renamed from: d */
    public View f5510d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5511e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5512f;

    /* JADX INFO: renamed from: g */
    public VText f5513g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f5514h;

    /* JADX INFO: renamed from: i */
    public VText f5515i;

    public SidesSlipItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m7737P(View view) {
        s1f0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m7738Q(boolean z, SidesSlipItemData sidesSlipItemData, int i) {
        boolean zEquals = TextUtils.equals("分享", sidesSlipItemData.getTitle());
        boolean z2 = true;
        boolean z3 = (upa.M2() && mqi0.m18550o() < ((Long) CoreModule.c.k2.R.get()).longValue()) || mqi0.m18550o() < ((Long) CoreModule.c.k2.Y.get()).longValue();
        if (z && !upa.o2()) {
            View view = this.f5510d;
            if (!zEquals && i != 4) {
                z2 = false;
            }
            xdl0.M(view, z2);
        } else if (z3 || upa.o2()) {
            View view2 = this.f5510d;
            if (!zEquals && i != 3) {
                z2 = false;
            }
            xdl0.M(view2, z2);
        } else {
            View view3 = this.f5510d;
            if (!zEquals && i != 2) {
                z2 = false;
            }
            xdl0.M(view3, z2);
        }
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            qib0.G.L0(this.f5512f, sidesSlipItemData.getIconUrl());
        } else {
            this.f5512f.setImageResource(sidesSlipItemData.getNativeIcon());
        }
        if (upa.z()) {
            this.f5513g.setTextColor(getResources().getColor(w0c0.x));
            LinearLayout linearLayout = this.f5511e;
            if (i == 0) {
                xdl0.f0(linearLayout, t100.h);
            } else {
                xdl0.f0(linearLayout, t100.i);
            }
        }
        this.f5513g.setText(sidesSlipItemData.getTitle());
        xdl0.M(this.f5514h, sidesSlipItemData.getShowDot().booleanValue());
        xdl0.M(this.f5515i, false);
        if (TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            w5b.r3(this.f5515i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7737P(this);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
