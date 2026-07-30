package com.p000p1.mobile.putong.core.newui.home.intlslguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import l.rbp;
import l.x2c0;
import v.AutoVDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlSlGuideDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f1832c;

    /* JADX INFO: renamed from: d */
    public VFrame f1833d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f1834e;

    /* JADX INFO: renamed from: f */
    public VFrame f1835f;

    /* JADX INFO: renamed from: g */
    public VImage f1836g;

    /* JADX INFO: renamed from: h */
    public VLinear f1837h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f1838i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f1839j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f1840k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f1841l;

    public IntlSlGuideDialogView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m2616P(View view) {
        rbp.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2616P(this);
        this.f1836g.setImageResource(IntlCountryCodeController.v() ? x2c0.l9 : x2c0.k9);
    }

    public void setAvatar(String str) {
        AutoVDraweeView autoVDraweeView = this.f1834e;
        if (autoVDraweeView != null) {
            autoVDraweeView.setImageUrl(str);
        }
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f1840k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setOnSkipClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f1841l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setSendButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f1840k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSkipButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f1841l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSubtitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f1839j;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setTitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f1838i;
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
