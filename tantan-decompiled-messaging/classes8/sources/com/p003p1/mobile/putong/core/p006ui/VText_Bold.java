package com.p003p1.mobile.putong.core.p006ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import l.eqh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VText_Bold extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f1741i;

    /* JADX INFO: renamed from: j */
    public String f1742j;

    /* JADX INFO: renamed from: k */
    public boolean f1743k;

    public VText_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8392o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m8391l(String str) {
        return str.contains("\n") || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m8392o() {
        setTypeface(eqh0.c(2), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        if (!this.f1741i || TextUtils.isEmpty(this.f1742j) || this.f1743k) {
            return;
        }
        this.f1743k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f1742j) || m8391l(this.f1742j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        setText(this.f1742j);
    }

    public VText_Bold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Bold(Context context) {
        this(context, null, 0);
    }
}
