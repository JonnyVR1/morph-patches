package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bd00;

/* JADX INFO: loaded from: classes10.dex */
public class MkProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProgressBar f55643a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f55644b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f55645c;

    /* JADX INFO: renamed from: d */
    public ImageView f55646d;

    public MkProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m81414a(View view) {
        bd00.m103562a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m81414a(this);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
