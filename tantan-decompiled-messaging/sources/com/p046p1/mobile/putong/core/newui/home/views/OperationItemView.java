package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import p149l.ys50;

/* JADX INFO: loaded from: classes11.dex */
public class OperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f23989a;

    public OperationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39191a(View view) {
        ys50.m215876a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39191a(this);
        setDrawingCacheEnabled(true);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
