package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTimeView extends LinearLayout {
    public FeedTimeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65256a();
    }

    /* JADX INFO: renamed from: a */
    public final void m65256a() {
        setGravity(80);
    }

    public FeedTimeView(@NonNull Context context) {
        super(context);
    }

    public FeedTimeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65256a();
    }
}
