package com.p051p1.mobile.putong.account.p055ui.welcome;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p151v.VText;
import p153l.lyh0;

/* JADX INFO: loaded from: classes9.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f17773i;

    /* JADX INFO: renamed from: j */
    public String f17774j;

    /* JADX INFO: renamed from: k */
    public boolean f17775k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30217o();
    }

    /* JADX INFO: renamed from: o */
    private void m30217o() {
        setTypeface(lyh0.m156283c(3), 0);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m30218l(String str) {
        return str.contains(SignParameters.NEW_LINE) || str.contains("\r\n") || str.contains("\r");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f17773i || TextUtils.isEmpty(this.f17774j) || this.f17775k) {
            return;
        }
        this.f17775k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f17774j) || m30218l(this.f17774j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super.onMeasure(i, i2);
        setText(this.f17774j);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
