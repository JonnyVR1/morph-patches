package com.p000p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p002l.g5c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveEndDataItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f7250a;

    /* JADX INFO: renamed from: b */
    public TextView f7251b;

    public LiveEndDataItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7250a = (TextView) findViewById(g5c0.f11238w6);
        this.f7251b = (TextView) findViewById(g5c0.f10967T7);
    }

    public void setTagText(String str) {
        this.f7250a.setText(str);
    }

    public void setValueText(String str) {
        this.f7251b.setText(str);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
