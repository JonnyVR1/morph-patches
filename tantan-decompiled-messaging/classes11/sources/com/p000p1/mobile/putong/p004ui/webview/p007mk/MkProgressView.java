package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.l400;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MkProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ProgressBar f8401a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f8402b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f8403c;

    /* JADX INFO: renamed from: d */
    public ImageView f8404d;

    public MkProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10578a(View view) {
        l400.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10578a(this);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MkProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
