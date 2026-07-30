package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class MessageBarMediaItemSquareLayout extends FrameLayout {
    public MessageBarMediaItemSquareLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size2, size), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(size2, size), 1073741824));
    }

    public MessageBarMediaItemSquareLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBarMediaItemSquareLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
