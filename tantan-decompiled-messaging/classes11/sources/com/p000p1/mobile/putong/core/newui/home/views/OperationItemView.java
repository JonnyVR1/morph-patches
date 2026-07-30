package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.ys50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f2767a;

    public OperationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3209a(View view) {
        ys50.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3209a(this);
        setDrawingCacheEnabled(true);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
