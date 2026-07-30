package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p147v.VText;
import p149l.eqh0;

/* JADX INFO: loaded from: classes8.dex */
public class VText_Bold extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f28170i;

    /* JADX INFO: renamed from: j */
    public String f28171j;

    /* JADX INFO: renamed from: k */
    public boolean f28172k;

    public VText_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44069o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m44068l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m44069o() {
        setTypeface(eqh0.m117752c(2), 1);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f28170i || TextUtils.isEmpty(this.f28171j) || this.f28172k) {
            return;
        }
        this.f28172k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f28171j) || m44068l(this.f28171j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f28171j);
    }

    public VText_Bold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Bold(Context context) {
        this(context, null, 0);
    }
}
