package com.p051p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.mdc0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveEndDataItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52056a;

    /* JADX INFO: renamed from: b */
    public TextView f52057b;

    public LiveEndDataItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52056a = (TextView) findViewById(mdc0.f136333w6);
        this.f52057b = (TextView) findViewById(mdc0.f136062T7);
    }

    public void setTagText(String str) {
        this.f52056a.setText(str);
    }

    public void setValueText(String str) {
        this.f52057b.setText(str);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEndDataItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
