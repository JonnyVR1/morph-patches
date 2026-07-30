package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.gra;
import p153l.j7b;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;
import p153l.z9f0;

/* JADX INFO: loaded from: classes11.dex */
public class SidesSlipItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public SidesSlipItemView f27579c;

    /* JADX INFO: renamed from: d */
    public View f27580d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f27581e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f27582f;

    /* JADX INFO: renamed from: g */
    public VText f27583g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f27584h;

    /* JADX INFO: renamed from: i */
    public VText f27585i;

    public SidesSlipItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m44677P(View view) {
        z9f0.m219075a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m44678Q(boolean z, SidesSlipItemData sidesSlipItemData, int i) {
        boolean zEquals = TextUtils.equals("分享", sidesSlipItemData.getTitle());
        boolean z2 = true;
        boolean z3 = (gra.m131600M2() && pzi0.m174454o() < CoreModule.f18264c.f20401k2.f118659R.get().longValue()) || pzi0.m174454o() < CoreModule.f18264c.f20401k2.f118666Y.get().longValue();
        if (z && !gra.m131726o2()) {
            View view = this.f27580d;
            if (!zEquals && i != 4) {
                z2 = false;
            }
            bnl0.m105524M(view, z2);
        } else if (z3 || gra.m131726o2()) {
            View view2 = this.f27580d;
            if (!zEquals && i != 3) {
                z2 = false;
            }
            bnl0.m105524M(view2, z2);
        } else {
            View view3 = this.f27580d;
            if (!zEquals && i != 2) {
                z2 = false;
            }
            bnl0.m105524M(view3, z2);
        }
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            uqb0.f180374G.m127115L0(this.f27582f, sidesSlipItemData.getIconUrl());
        } else {
            this.f27582f.setImageResource(sidesSlipItemData.getNativeIcon());
        }
        if (gra.m131778z()) {
            this.f27583g.setTextColor(getResources().getColor(c9c0.f80469x));
            LinearLayout linearLayout = this.f27581e;
            if (i == 0) {
                bnl0.m105554f0(linearLayout, qa00.f156321h);
            } else {
                bnl0.m105554f0(linearLayout, qa00.f156322i);
            }
        }
        this.f27583g.setText(sidesSlipItemData.getTitle());
        bnl0.m105524M(this.f27584h, sidesSlipItemData.getShowDot().booleanValue());
        bnl0.m105524M(this.f27585i, false);
        if (TextUtils.equals(sidesSlipItemData.getTitle(), "惊喜礼盒")) {
            j7b.m143757r3(this.f27585i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44677P(this);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SidesSlipItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
