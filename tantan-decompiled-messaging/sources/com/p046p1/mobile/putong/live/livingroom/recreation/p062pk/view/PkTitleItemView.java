package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.n280;

/* JADX INFO: loaded from: classes5.dex */
public class PkTitleItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51740a;

    public PkTitleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76223a(View view) {
        n280.m157564a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76224b(String str) {
        this.f51740a.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76223a(this);
    }

    public PkTitleItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkTitleItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
