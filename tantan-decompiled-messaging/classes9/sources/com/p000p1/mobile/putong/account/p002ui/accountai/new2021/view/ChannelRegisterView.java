package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.t100;
import l.xdl0;
import p006l.djj0;
import p006l.sr4;
import v.VButton;
import v.VButton_FakeShadow;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ChannelRegisterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton f385c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f386d;

    /* JADX INFO: renamed from: e */
    public d30 f387e;

    /* JADX INFO: renamed from: f */
    public d30 f388f;

    public ChannelRegisterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m353r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m351S(View view) {
        if (NullChecker.a(this.f388f)) {
            this.f388f.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m352T(View view) {
        if (NullChecker.a(this.f387e)) {
            this.f387e.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m353r() {
        setOrientation(1);
        m354R(LayoutInflater.from(getContext()), this);
        xdl0.E0(this.f385c, new View.OnClickListener() { // from class: l.qr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19983a.m351S(view);
            }
        });
        xdl0.E0(this.f386d, new View.OnClickListener() { // from class: l.rr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20683a.m352T(view);
            }
        });
        if (djj0.m14048f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f385c.getLayoutParams();
            int i = t100.z;
            layoutParams.height = i;
            this.f385c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f386d.getLayoutParams();
            layoutParams2.height = i;
            this.f386d.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m354R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sr4.m24129b(this, layoutInflater, viewGroup);
    }

    public void setRegisterClickListener(d30 d30Var) {
        this.f388f = d30Var;
    }

    public void setUploadClickListener(d30 d30Var) {
        this.f387e = d30Var;
    }

    public ChannelRegisterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChannelRegisterView(Context context) {
        this(context, null);
    }
}
