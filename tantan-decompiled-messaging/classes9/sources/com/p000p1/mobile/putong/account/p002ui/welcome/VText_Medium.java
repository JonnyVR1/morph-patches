package com.p000p1.mobile.putong.account.p002ui.welcome;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import l.eqh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f1043i;

    /* JADX INFO: renamed from: j */
    public String f1044j;

    /* JADX INFO: renamed from: k */
    public boolean f1045k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1125o();
    }

    /* JADX INFO: renamed from: o */
    private void m1125o() {
        setTypeface(eqh0.c(3), 0);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1126l(String str) {
        return str.contains("\n") || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        if (!this.f1043i || TextUtils.isEmpty(this.f1044j) || this.f1045k) {
            return;
        }
        this.f1045k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f1044j) || m1126l(this.f1044j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        setText(this.f1044j);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
