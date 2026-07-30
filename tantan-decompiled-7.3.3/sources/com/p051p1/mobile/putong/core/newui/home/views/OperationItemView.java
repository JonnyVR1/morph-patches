package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import p153l.e160;

/* JADX INFO: loaded from: classes11.dex */
public class OperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f24731a;

    public OperationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m40194a(View view) {
        e160.m118941a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40194a(this);
        setDrawingCacheEnabled(true);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
