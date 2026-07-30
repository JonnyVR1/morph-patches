package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p151v.VImage;
import p151v.VText;
import p153l.d3c;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuTag extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f49618a;

    /* JADX INFO: renamed from: b */
    public VText f49619b;

    public DanmakuTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73701a(View view) {
        d3c.m113799a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73702b(@DrawableRes int i, @StringRes int i2, @ColorInt int i3, Drawable drawable, boolean z) {
        this.f49618a.setImageResource(i);
        this.f49619b.setText(i2);
        this.f49619b.setTextColor(i3);
        setBackground(drawable);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73701a(this);
    }
}
