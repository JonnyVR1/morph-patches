package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p002l.q1c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DanmakuTag extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4812a;

    /* JADX INFO: renamed from: b */
    public VText f4813b;

    public DanmakuTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6010a(View view) {
        q1c.m20793a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6011b(@DrawableRes int i, @StringRes int i2, @ColorInt int i3, Drawable drawable, boolean z) {
        this.f4812a.setImageResource(i);
        this.f4813b.setText(i2);
        this.f4813b.setTextColor(i3);
        setBackground(drawable);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6010a(this);
    }
}
