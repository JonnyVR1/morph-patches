package com.p046p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.dwt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeHeadItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f49368a;

    public LiveSignPrizeHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73267a(View view) {
        dwt.m113943a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73267a(this);
    }

    public void setText(String str) {
        this.f49368a.setText(str);
    }

    public LiveSignPrizeHeadItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
