package com.p000p1.mobile.putong.live.livingroom.common.bottom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomViewGroup extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f4778a;

    public BottomViewGroup(Context context) {
        super(context);
        this.f4778a = 1.0f;
    }

    public void setStyle(String str) {
        if ("normal".equals(str)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = xdl0.w(52.0f);
            layoutParams.height = t100.w;
            setLayoutParams(layoutParams);
        }
    }

    public BottomViewGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4778a = 1.0f;
    }

    public BottomViewGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4778a = 1.0f;
    }
}
