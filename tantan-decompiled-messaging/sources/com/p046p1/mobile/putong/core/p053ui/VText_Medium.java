package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p147v.VText;
import p149l.eqh0;

/* JADX INFO: loaded from: classes8.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f28173i;

    /* JADX INFO: renamed from: j */
    public String f28174j;

    /* JADX INFO: renamed from: k */
    public boolean f28175k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44072o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m44071l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m44072o() {
        setTypeface(eqh0.m117752c(3), 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f28173i || TextUtils.isEmpty(this.f28174j) || this.f28175k) {
            return;
        }
        this.f28175k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f28174j) || m44071l(this.f28174j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f28174j);
    }

    /* JADX INFO: renamed from: p */
    public void m44073p(String str) {
        this.f28175k = TextUtils.equals(str, this.f28174j);
        this.f28173i = true;
        this.f28174j = str;
        setText(str);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
