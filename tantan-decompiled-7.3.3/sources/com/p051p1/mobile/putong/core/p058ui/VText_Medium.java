package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p151v.VText;
import p153l.lyh0;

/* JADX INFO: loaded from: classes6.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f29021i;

    /* JADX INFO: renamed from: j */
    public String f29022j;

    /* JADX INFO: renamed from: k */
    public boolean f29023k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45255o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m45254l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m45255o() {
        setTypeface(lyh0.m156283c(3), 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f29021i || TextUtils.isEmpty(this.f29022j) || this.f29023k) {
            return;
        }
        this.f29023k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f29022j) || m45254l(this.f29022j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f29022j);
    }

    /* JADX INFO: renamed from: p */
    public void m45256p(String str) {
        this.f29023k = TextUtils.equals(str, this.f29022j);
        this.f29021i = true;
        this.f29022j = str;
        setText(str);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
