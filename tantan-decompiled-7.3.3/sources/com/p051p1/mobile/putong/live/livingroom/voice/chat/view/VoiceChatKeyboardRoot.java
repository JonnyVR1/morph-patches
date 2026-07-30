package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.dox;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatKeyboardRoot extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f53901a;

    public VoiceChatKeyboardRoot(@NonNull Context context) {
        super(context);
        this.f53901a = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (Math.abs(getChildAt(0).getMeasuredHeight() - View.MeasureSpec.getSize(i2)) < qa00.m175859d(100.0f) || this.f53901a < 0) {
            this.f53901a = getChildAt(0).getMeasuredHeight();
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, View.MeasureSpec.makeMeasureSpec(dox.m117366d(this.f53901a), 1073741824));
        }
    }

    public VoiceChatKeyboardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53901a = -1;
    }

    public VoiceChatKeyboardRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53901a = -1;
    }
}
