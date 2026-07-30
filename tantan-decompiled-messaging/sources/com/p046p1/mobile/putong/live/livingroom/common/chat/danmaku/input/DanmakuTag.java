package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p147v.VImage;
import p147v.VText;
import p149l.q1c;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuTag extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f48770a;

    /* JADX INFO: renamed from: b */
    public VText f48771b;

    public DanmakuTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m72518a(View view) {
        q1c.m172385a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72519b(@DrawableRes int i, @StringRes int i2, @ColorInt int i3, Drawable drawable, boolean z) {
        this.f48770a.setImageResource(i);
        this.f48771b.setText(i2);
        this.f48771b.setTextColor(i3);
        setBackground(drawable);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72518a(this);
    }
}
