package com.p046p1.mobile.putong.account.p050ui.welcome;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p147v.VText;
import p149l.eqh0;

/* JADX INFO: loaded from: classes9.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f17054i;

    /* JADX INFO: renamed from: j */
    public String f17055j;

    /* JADX INFO: renamed from: k */
    public boolean f17056k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29219o();
    }

    /* JADX INFO: renamed from: o */
    private void m29219o() {
        setTypeface(eqh0.m117752c(3), 0);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m29220l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f17054i || TextUtils.isEmpty(this.f17055j) || this.f17056k) {
            return;
        }
        this.f17056k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f17055j) || m29220l(this.f17055j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f17055j);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
