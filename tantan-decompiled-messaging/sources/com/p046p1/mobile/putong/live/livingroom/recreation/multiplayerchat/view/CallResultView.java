package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.s44;

/* JADX INFO: loaded from: classes5.dex */
public class CallResultView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f51470a;

    /* JADX INFO: renamed from: b */
    public TextView f51471b;

    /* JADX INFO: renamed from: c */
    public TextView f51472c;

    public CallResultView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75908a(View view) {
        s44.m182206a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public CallResultView m75909b(String str) {
        this.f51471b.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public CallResultView m75910c(int i) {
        this.f51470a.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public CallResultView m75911d(String str) {
        this.f51472c.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public CallResultView m75912e(Typeface typeface) {
        this.f51471b.setTypeface(typeface);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75908a(this);
    }

    public CallResultView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallResultView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
