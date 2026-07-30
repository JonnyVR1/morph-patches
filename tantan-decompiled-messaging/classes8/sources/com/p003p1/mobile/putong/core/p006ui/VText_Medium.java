package com.p003p1.mobile.putong.core.p006ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import l.eqh0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VText_Medium extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f1744i;

    /* JADX INFO: renamed from: j */
    public String f1745j;

    /* JADX INFO: renamed from: k */
    public boolean f1746k;

    public VText_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8395o();
    }

    /* JADX INFO: renamed from: l */
    private boolean m8394l(String str) {
        return str.contains("\n") || str.contains("\r\n") || str.contains("\r");
    }

    /* JADX INFO: renamed from: o */
    private void m8395o() {
        setTypeface(eqh0.c(3), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        if (!this.f1744i || TextUtils.isEmpty(this.f1745j) || this.f1746k) {
            return;
        }
        this.f1746k = true;
        if (getMeasuredWidth() <= getPaint().measureText(this.f1745j) || m8394l(this.f1745j)) {
            setTextSize(2, 18.0f);
            setLineSpacing(0.0f, 1.3f);
        } else {
            setTextSize(2, 20.0f);
            setLineSpacing(0.0f, 1.8f);
        }
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(i, i2);
        setText(this.f1745j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m8396p(String str) {
        this.f1746k = TextUtils.equals(str, this.f1745j);
        this.f1744i = true;
        this.f1745j = str;
        setText(str);
    }

    public VText_Medium(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Medium(Context context) {
        this(context, null, 0);
    }
}
