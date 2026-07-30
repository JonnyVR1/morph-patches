package com.p051p1.mobile.putong.core.p058ui.quickaudio.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.SquareDataWrapper;
import com.p051p1.mobile.putong.p070ui.square.AbsBubbleItemView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseBubbleItemView extends AbsBubbleItemView<SquareDataWrapper> {
    public BaseBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public boolean m55737h(View view) {
        return view.getVisibility() != 8;
    }

    public BaseBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
