package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.r54;

/* JADX INFO: loaded from: classes5.dex */
public class CallResultView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f52318a;

    /* JADX INFO: renamed from: b */
    public TextView f52319b;

    /* JADX INFO: renamed from: c */
    public TextView f52320c;

    public CallResultView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77091a(View view) {
        r54.m179846a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public CallResultView m77092b(String str) {
        this.f52319b.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public CallResultView m77093c(int i) {
        this.f52318a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public CallResultView m77094d(String str) {
        this.f52320c.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public CallResultView m77095e(Typeface typeface) {
        this.f52319b.setTypeface(typeface);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77091a(this);
    }

    public CallResultView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallResultView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
