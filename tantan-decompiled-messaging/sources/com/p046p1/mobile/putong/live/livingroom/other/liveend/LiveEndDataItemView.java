package com.p046p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.g5c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveEndDataItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51208a;

    /* JADX INFO: renamed from: b */
    public TextView f51209b;

    public LiveEndDataItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51208a = (TextView) findViewById(g5c0.f101088w6);
        this.f51209b = (TextView) findViewById(g5c0.f100817T7);
    }

    public void setTagText(String str) {
        this.f51208a.setText(str);
    }

    public void setValueText(String str) {
        this.f51209b.setText(str);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
