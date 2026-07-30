package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p153l.bnl0;
import p153l.gsj0;
import p153l.qa00;
import p153l.rs4;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelRegisterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton f17115c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f17116d;

    /* JADX INFO: renamed from: e */
    public x20 f17117e;

    /* JADX INFO: renamed from: f */
    public x20 f17118f;

    public ChannelRegisterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29456r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m29454S(View view) {
        if (NullChecker.m82486a(this.f17118f)) {
            this.f17118f.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m29455T(View view) {
        if (NullChecker.m82486a(this.f17117e)) {
            this.f17117e.call();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m29456r() {
        setOrientation(1);
        m29457R(LayoutInflater.from(getContext()), this);
        bnl0.m105509E0(this.f17115c, new View.OnClickListener() { // from class: l.ps4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153873a.m29454S(view);
            }
        });
        bnl0.m105509E0(this.f17116d, new View.OnClickListener() { // from class: l.qs4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159244a.m29455T(view);
            }
        });
        if (gsj0.m132062f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17115c.getLayoutParams();
            int i = qa00.f156339z;
            layoutParams.height = i;
            this.f17115c.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f17116d.getLayoutParams();
            layoutParams2.height = i;
            this.f17116d.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: R */
    public View m29457R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rs4.m182853b(this, layoutInflater, viewGroup);
    }

    public void setRegisterClickListener(x20 x20Var) {
        this.f17118f = x20Var;
    }

    public void setUploadClickListener(x20 x20Var) {
        this.f17117e = x20Var;
    }

    public ChannelRegisterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChannelRegisterView(Context context) {
        this(context, null);
    }
}
