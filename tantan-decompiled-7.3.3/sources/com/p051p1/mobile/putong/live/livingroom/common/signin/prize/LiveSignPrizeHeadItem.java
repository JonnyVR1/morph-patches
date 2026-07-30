package com.p051p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.eyt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeHeadItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f50216a;

    public LiveSignPrizeHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74450a(View view) {
        eyt.m123249a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74450a(this);
    }

    public void setText(String str) {
        this.f50216a.setText(str);
    }

    public LiveSignPrizeHeadItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
