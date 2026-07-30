package com.p051p1.mobile.putong.live.livingroom.common.bottom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class BottomViewGroup extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f49584a;

    public BottomViewGroup(Context context) {
        super(context);
        this.f49584a = 1.0f;
    }

    public void setStyle(String str) {
        if ("normal".equals(str)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = bnl0.m105587w(52.0f);
            layoutParams.height = qa00.f156336w;
            setLayoutParams(layoutParams);
        }
    }

    public BottomViewGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49584a = 1.0f;
    }

    public BottomViewGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49584a = 1.0f;
    }
}
