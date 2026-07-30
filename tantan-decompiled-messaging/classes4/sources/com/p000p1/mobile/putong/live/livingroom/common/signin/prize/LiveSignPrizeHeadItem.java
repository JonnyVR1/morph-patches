package com.p000p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p002l.dwt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSignPrizeHeadItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f5410a;

    public LiveSignPrizeHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6802a(View view) {
        dwt.m12081a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6802a(this);
    }

    public void setText(String str) {
        this.f5410a.setText(str);
    }

    public LiveSignPrizeHeadItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
