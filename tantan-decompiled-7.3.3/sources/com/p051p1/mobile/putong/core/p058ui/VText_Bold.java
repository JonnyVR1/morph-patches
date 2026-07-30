package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p151v.VText;
import p153l.lyh0;

/* JADX INFO: loaded from: classes6.dex */
public class VText_Bold extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f29018i;

    /* JADX INFO: renamed from: j */
    public String f29019j;

    /* JADX INFO: renamed from: k */
    public boolean f29020k;

    public VText_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45252o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m45251l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m45252o() {
        setTypeface(lyh0.m156283c(2), 1);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f29018i || TextUtils.isEmpty(this.f29019j) || this.f29020k) {
            return;
        }
        this.f29020k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f29019j) || m45251l(this.f29019j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f29019j);
    }

    public VText_Bold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Bold(Context context) {
        this(context, null, 0);
    }
}
