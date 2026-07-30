package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class NormalDanmakuListShadowItem extends View {
    public NormalDanmakuListShadowItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(xdl0.m208407w(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(xdl0.m208407w(100.0f), 1073741824));
    }
}
