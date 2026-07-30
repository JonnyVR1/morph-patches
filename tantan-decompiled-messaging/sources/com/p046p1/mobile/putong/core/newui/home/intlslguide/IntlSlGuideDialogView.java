package com.p046p1.mobile.putong.core.newui.home.intlslguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.AutoVDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.rbp;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSlGuideDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f23054c;

    /* JADX INFO: renamed from: d */
    public VFrame f23055d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f23056e;

    /* JADX INFO: renamed from: f */
    public VFrame f23057f;

    /* JADX INFO: renamed from: g */
    public VImage f23058g;

    /* JADX INFO: renamed from: h */
    public VLinear f23059h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f23060i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f23061j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f23062k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f23063l;

    public IntlSlGuideDialogView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m38630P(View view) {
        rbp.m178687a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38630P(this);
        this.f23058g.setImageResource(IntlCountryCodeController.m28126v() ? x2c0.f190324l9 : x2c0.f190292k9);
    }

    public void setAvatar(String str) {
        AutoVDraweeView autoVDraweeView = this.f23056e;
        if (autoVDraweeView != null) {
            autoVDraweeView.setImageUrl(str);
        }
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f23062k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setOnSkipClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f23063l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setSendButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23062k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSkipButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23063l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSubtitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23061j;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setTitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23060i;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public IntlSlGuideDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlSlGuideDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
