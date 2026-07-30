package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p149l.d30;
import p149l.djj0;
import p149l.t100;
import p149l.tyx;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class MediaView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f16407c;

    /* JADX INFO: renamed from: d */
    public d30 f16408d;

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28468r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m28467R(View view) {
        if (NullChecker.m81303a(this.f16408d)) {
            this.f16408d.call();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m28468r() {
        setOrientation(1);
        m28469Q(LayoutInflater.from(getContext()), this);
        xdl0.m208329E0(this.f16407c, new View.OnClickListener() { // from class: l.syx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167004a.m28467R(view);
            }
        });
        if (djj0.m112085f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16407c.getLayoutParams();
            layoutParams.height = t100.f167277z;
            this.f16407c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Q */
    public View m28469Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tyx.m191112b(this, layoutInflater, viewGroup);
    }

    public void setButtonText(String str) {
        if (!NullChecker.m81303a(this.f16407c) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f16407c.setText(str);
    }

    public void setClickListener(d30 d30Var) {
        this.f16408d = d30Var;
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaView(Context context) {
        this(context, null);
    }
}
