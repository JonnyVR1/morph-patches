package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;

/* JADX INFO: loaded from: classes4.dex */
public class NormalDanmakuListDivideItem extends View {
    public NormalDanmakuListDivideItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(bnl0.m105587w(2.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(bnl0.m105587w(20.0f), 1073741824));
    }
}
