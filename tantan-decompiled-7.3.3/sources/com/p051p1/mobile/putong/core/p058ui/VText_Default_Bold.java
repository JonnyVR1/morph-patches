package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import p151v.VText;

/* JADX INFO: loaded from: classes6.dex */
public class VText_Default_Bold extends VText {
    public VText_Default_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45253l();
    }

    /* JADX INFO: renamed from: l */
    private void m45253l() {
        setTypeface(Typeface.DEFAULT_BOLD);
    }

    public VText_Default_Bold(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VText_Default_Bold(Context context) {
        this(context, null, 0);
    }
}
