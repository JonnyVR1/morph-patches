package com.p003p1.mobile.putong.core.p006ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VText_Default_Bold extends VText {
    public VText_Default_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8393l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private void m8393l() {
        setTypeface(Typeface.DEFAULT_BOLD);
    }

    public VText_Default_Bold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Default_Bold(Context context) {
        this(context, null, 0);
    }
}
