package com.p051p1.mobile.putong.core.newui.home.intlslguide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.dbc0;
import p153l.rdp;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSlGuideDialogView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f23796c;

    /* JADX INFO: renamed from: d */
    public VFrame f23797d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f23798e;

    /* JADX INFO: renamed from: f */
    public VFrame f23799f;

    /* JADX INFO: renamed from: g */
    public VImage f23800g;

    /* JADX INFO: renamed from: h */
    public VLinear f23801h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f23802i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f23803j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f23804k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f23805l;

    public IntlSlGuideDialogView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m39633P(View view) {
        rdp.m180938a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39633P(this);
        this.f23800g.setImageResource(IntlCountryCodeController.m29125v() ? dbc0.f87211m9 : dbc0.f87178l9);
    }

    public void setAvatar(String str) {
        AutoVDraweeView autoVDraweeView = this.f23798e;
        if (autoVDraweeView != null) {
            autoVDraweeView.setImageUrl(str);
        }
    }

    public void setOnSendClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f23804k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setOnSkipClickListener(View.OnClickListener onClickListener) {
        VText_NoTopPadding vText_NoTopPadding = this.f23805l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setOnClickListener(onClickListener);
        }
    }

    public void setSendButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23804k;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSkipButtonText(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23805l;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setSubtitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23803j;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(str);
        }
    }

    public void setTitle(String str) {
        VText_NoTopPadding vText_NoTopPadding = this.f23802i;
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
