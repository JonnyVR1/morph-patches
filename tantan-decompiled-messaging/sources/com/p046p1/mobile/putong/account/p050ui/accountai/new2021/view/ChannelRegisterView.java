package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p149l.d30;
import p149l.djj0;
import p149l.sr4;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelRegisterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton f16396c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f16397d;

    /* JADX INFO: renamed from: e */
    public d30 f16398e;

    /* JADX INFO: renamed from: f */
    public d30 f16399f;

    public ChannelRegisterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28457r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m28455S(View view) {
        if (NullChecker.m81303a(this.f16399f)) {
            this.f16399f.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m28456T(View view) {
        if (NullChecker.m81303a(this.f16398e)) {
            this.f16398e.call();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m28457r() {
        setOrientation(1);
        m28458R(LayoutInflater.from(getContext()), this);
        xdl0.m208329E0(this.f16396c, new View.OnClickListener() { // from class: l.qr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155964a.m28455S(view);
            }
        });
        xdl0.m208329E0(this.f16397d, new View.OnClickListener() { // from class: l.rr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160723a.m28456T(view);
            }
        });
        if (djj0.m112085f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16396c.getLayoutParams();
            int i = t100.f167277z;
            layoutParams.height = i;
            this.f16396c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f16397d.getLayoutParams();
            layoutParams2.height = i;
            this.f16397d.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m28458R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sr4.m185623b(this, layoutInflater, viewGroup);
    }

    public void setRegisterClickListener(d30 d30Var) {
        this.f16399f = d30Var;
    }

    public void setUploadClickListener(d30 d30Var) {
        this.f16398e = d30Var;
    }

    public ChannelRegisterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChannelRegisterView(Context context) {
        this(context, null);
    }
}
