package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.text.TextUtils;
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
import p006l.tyx;
import v.VButton_FakeShadow;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MediaView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f396c;

    /* JADX INFO: renamed from: d */
    public d30 f397d;

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m364r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m363R(View view) {
        if (NullChecker.a(this.f397d)) {
            this.f397d.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m364r() {
        setOrientation(1);
        m365Q(LayoutInflater.from(getContext()), this);
        xdl0.E0(this.f396c, new View.OnClickListener() { // from class: l.syx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21770a.m363R(view);
            }
        });
        if (djj0.m14048f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f396c.getLayoutParams();
            layoutParams.height = t100.z;
            this.f396c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Q */
    public View m365Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tyx.m24867b(this, layoutInflater, viewGroup);
    }

    public void setButtonText(String str) {
        if (!NullChecker.a(this.f396c) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f396c.setText(str);
    }

    public void setClickListener(d30 d30Var) {
        this.f397d = d30Var;
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaView(Context context) {
        this(context, null);
    }
}
