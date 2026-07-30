package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VSwitch;
import p149l.ar70;
import p149l.d30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkInviteSwitchItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51694a;

    /* JADX INFO: renamed from: b */
    public VSwitch f51695b;

    public PkInviteSwitchItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m76172b(View view) {
        ar70.m98369a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m76173c(final d30 d30Var, boolean z) {
        this.f51695b.setChecked(z);
        xdl0.m208329E0(this.f51695b, new View.OnClickListener() { // from class: l.zq70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76172b(this);
    }

    public PkInviteSwitchItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkInviteSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
