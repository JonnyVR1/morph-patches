package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VSwitch;
import p153l.bnl0;
import p153l.gz70;
import p153l.x20;

/* JADX INFO: loaded from: classes5.dex */
public class PkInviteSwitchItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52542a;

    /* JADX INFO: renamed from: b */
    public VSwitch f52543b;

    public PkInviteSwitchItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m77355b(View view) {
        gz70.m133079a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m77356c(final x20 x20Var, boolean z) {
        this.f52543b.setChecked(z);
        bnl0.m105509E0(this.f52543b, new View.OnClickListener() { // from class: l.fz70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77355b(this);
    }

    public PkInviteSwitchItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkInviteSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
