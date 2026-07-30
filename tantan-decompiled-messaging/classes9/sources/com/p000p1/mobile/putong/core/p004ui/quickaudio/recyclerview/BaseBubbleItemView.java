package com.p000p1.mobile.putong.core.p004ui.quickaudio.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper;
import com.p1.mobile.putong.ui.square.AbsBubbleItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class BaseBubbleItemView extends AbsBubbleItemView<SquareDataWrapper> {
    public BaseBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public boolean m7897h(View view) {
        return view.getVisibility() != 8;
    }

    public BaseBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
