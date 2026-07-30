package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.l400;

/* JADX INFO: loaded from: classes11.dex */
public class MkProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProgressBar f54795a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f54796b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f54797c;

    /* JADX INFO: renamed from: d */
    public ImageView f54798d;

    public MkProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m80231a(View view) {
        l400.m148419a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80231a(this);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
