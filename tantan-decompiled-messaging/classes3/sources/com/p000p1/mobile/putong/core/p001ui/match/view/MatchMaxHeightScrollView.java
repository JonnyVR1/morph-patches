package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import l.t100;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchMaxHeightScrollView extends ScrollView {
    public MatchMaxHeightScrollView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.d(68.0f), PKIFailureInfo.systemUnavail));
    }

    public MatchMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MatchMaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
